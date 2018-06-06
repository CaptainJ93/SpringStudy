package com.best1.action;

import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.best1.base.BaseAction;
import com.best1.base.DataModel;
import com.best1.domain.UserInfo;
import com.best1.service.LoginService;
import com.best1.util.CryptUtil;
import com.best1.base.common.SystemCommonDefine;
public class LoginAction extends BaseAction {
	private LoginService loginService;
	
	public String login() throws Exception {
		String loginId = (String)paramMap.get("loginId")==null?"":(String)paramMap.get("loginId");
		String password = (String)paramMap.get("password")==null?"":(String)paramMap.get("password");
		DataModel resData = new DataModel();
		UserInfo user = new UserInfo();
		if(loginId == null || password == null){
			resData.setErrCode("1");
			resData.setErrMsg("帐户或密码不能为空");
		}else{
			paramMap.clear();
			paramMap.put("userloginid", loginId);
			if(!"".equals(password) && password != null && loginId != null && !"".equals(loginId)){
				byte[]  b = CryptUtil.encryptMD5(password.getBytes());
				paramMap.put("password", new BigInteger(b).toString(16));
				//根据loginid password 获取对象值
				user = loginService.getUserInfo(paramMap);
				if (user != null) {
					//登录账号名密码输入正确
					if (user.getStatus() == SystemCommonDefine.USER_STATUS_0) {
						resData.setErrCode("1");
						resData.setErrMsg("登录账号已被锁定,请联系管理员解锁");
					}else if(user.getStatus() == SystemCommonDefine.USER_STATUS_2){
						resData.setErrCode("1");
						resData.setErrMsg("登录账号为注销的状态，该账号已不可用");
					}else{
						//登录成功，将 PASSWORDERRORNUM 更新为0 
						paramMap.clear();
						paramMap.put("userloginid", user.getUserloginid());
						paramMap.put("passworderrornum", 0);
						loginService.updateUserpwdErrorNum(paramMap);
						
						String ip = getRequest().getHeader("x-forwarded-for"); 
						if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
						    ip = getRequest().getHeader("PRoxy-Client-IP"); 
						} 
						if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
						    ip = getRequest().getHeader("WL-Proxy-Client-IP"); 
						} 
						if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
						    ip = getRequest().getRemoteAddr(); 
						} 
						InetAddress inetAddress = InetAddress.getByName(ip);
						user.setHostip(ip);
						user.setHostname(inetAddress.getHostName());
						getSession().setAttribute("user", user);
						resData.setErrCode("0");
					}
					
				} else {
					//登录失败
					paramMap.clear();
					paramMap.put("userloginid", loginId);
					user = loginService.getUserInfo(paramMap);
					if(user != null){
						if (user.getStatus() == SystemCommonDefine.USER_STATUS_0) {
							resData.setErrCode("1");
							resData.setErrMsg("登录账号已被锁定,请联系管理员解锁");
						}else if(user.getStatus() == SystemCommonDefine.USER_STATUS_2){
							resData.setErrCode("1");
							resData.setErrMsg("登录账号为注销的状态，该账号已不可用");
						}else{
							paramMap.clear();
							paramMap.put("userloginid", loginId);
							if(user.getPassworderrornum() >= SystemCommonDefine.USER_PASSWORDERRORNUM_9){
								//将用户状态变更为锁定
								paramMap.put("status", SystemCommonDefine.USER_STATUS_0);
								loginService.lockUserStatus(paramMap);
							}else{
								paramMap.put("passworderrornum", user.getPassworderrornum()+1);
								loginService.updateUserpwdErrorNum(paramMap);
							}
							resData.setErrCode("1");
							resData.setErrMsg("密码输入不正确！");
						}
					}else{
						resData.setErrCode("1");
						resData.setErrMsg("帐户不存在！");
					}
				}
			}
			
		}
		commonOutPrint(resData);
		return null;
	}
	@Deprecated
	public String checkPassword() throws Exception {
		DataModel resData = new DataModel();
		UserInfo user = new UserInfo();
		long userid = ((UserInfo)getSession().getAttribute("user")).getUserid();
		paramMap.put("userid", userid);
		
		String password = ((String)paramMap.get("password"));
		if(!"".equals(password) && password != null){
			byte[]  b = CryptUtil.encryptMD5(password.getBytes());
			paramMap.put("password", new BigInteger(b).toString(16));
			user = loginService.getUserInfo(paramMap);
			if (user != null) {
				resData.setErrCode("0");
			} else {
				resData.setErrCode("1");
				resData.setErrMsg("原登录密码输入错误，请重新输入！");
			}
			commonOutPrint(resData);
		}else{
			resData.setErrCode("1");
			resData.setErrMsg("原登录密码不能为空！");
		}
		return null;
	}
	
	public String editPwd() throws Exception {
		DataModel resData = new DataModel();
		UserInfo user = new UserInfo();
		long userid = ((UserInfo)getSession().getAttribute("user")).getUserid();
		String password = ((String)paramMap.get("password"));
		String newpassword = ((String)paramMap.get("newpassword"));
		String confirmpassword = ((String)paramMap.get("confirmpassword"));
		paramMap.put("userid", userid);
		//原密码验证
		if(!"".equals(password) && password != null){
			byte[]  b = CryptUtil.encryptMD5(password.getBytes());
			paramMap.put("password", new BigInteger(b).toString(16));
			user = loginService.getUserInfo(paramMap);
			if (user != null) {
				//源密码输入正确 更新新密码
				
				if(!"".equals(newpassword) && newpassword != null){
					if(newpassword.equals(confirmpassword)){
						paramMap.clear();
						paramMap.put("userid", userid);
						b = CryptUtil.encryptMD5(newpassword.getBytes());
						paramMap.put("password", new BigInteger(b).toString(16));
						paramMap.put("passworderrornum", SystemCommonDefine.USER_PASSWORDERRORNUM_0);
						
						resData = loginService.updateUserPwd(paramMap);
					}else{
						resData.setErrCode("1");
						resData.setErrMsg("新密码输入不一致！");
					}
				}else{
					resData.setErrCode("1");
					resData.setErrMsg("新密码不能为空！");
				}	
				
			} else {
				resData.setErrCode("1");
				resData.setErrMsg("原登录密码输入错误，请重新输入！");
			}
		}

		commonOutPrint(resData);
		return null;
	}
	
	public void cancel() throws  IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		session.removeAttribute("userroleResources");
		session.invalidate();
	}
	
	public void quit() throws IOException{
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		session.removeAttribute("userroleResources");
		session.invalidate();
	}
	
	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
}