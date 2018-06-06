package com.best1.action;

import java.math.BigInteger;
import com.best1.base.BaseAction;
import com.best1.base.DataModel;
import com.best1.base.common.SystemCommonDefine;
import com.best1.domain.UserInfo;
import com.best1.service.UserService;
import com.best1.util.CryptUtil;

public class UserAction extends BaseAction {
	private UserService userService;
	private UserInfo userInfo;
	

	public String deleteUserRole() throws Exception {
		DataModel resData = userService.deleteUserRole(paramMap);
		commonOutPrint(resData);
		return null;
	}

	public String listRole() throws Exception {
		DataModel resData = userService.listAllUnincludedRole(paramMap);
		commonOutPrint(resData);
		return null;
	}
	
	public String saveUserRole() throws Exception {
		DataModel resData = userService.addUserRole(paramMap);
		commonOutPrint(resData);
		return null;
	}
	
	public String listUserRole() throws Exception {
		DataModel resData = userService.listUserRole(paramMap);
		commonOutPrint(resData);
		return null;
	}
	
	public String list() throws Exception {
		DataModel resData = userService.getUserByPage(paramMap);
		if ("excel".equals(paramMap.get("export"))) {
			commonOutExcel(resData);
		} else {
			commonOutPrint(resData);
		}
		return null;
	}

	public String delete() throws Exception {
		DataModel resData = userService.deleteUserInfo(paramMap);
		commonOutPrint(resData);
		return null;
	}

	public String editStatus() throws Exception {
		long lastcreateby = ((UserInfo) getSession().getAttribute("user")).getUserid();
		paramMap.put("lastcreateby", lastcreateby);
		long status = 0l;
		String statusStr = (String)paramMap.get("status");
		if("2".equals(statusStr)){
			status = SystemCommonDefine.USER_STATUS_2;//注销账号
		}else{
			status = SystemCommonDefine.USER_STATUS_1;//解锁账号
			//密码重置为111111
			String s = "111111";
			byte[]  b = CryptUtil.encryptMD5(s.getBytes());
			paramMap.put("password", new BigInteger(b).toString(16));
		}
		paramMap.put("status", status);
		paramMap.put("passworderrornum", SystemCommonDefine.USER_PASSWORDERRORNUM_0);
		DataModel resData = userService.updateUserStatus(paramMap);
		commonOutPrint(resData);
		return null;
	}

	public String edit() throws Exception {
		DataModel resData = userService.getUserInfo(paramMap);
		commonOutPrint(resData);
		return null;
	}

	public String checkUserloginid() throws Exception {
		DataModel resData = userService.getUserInfo(paramMap);
		int size = resData.getRows().size();
		resData = new DataModel();
			if (size == 0) {
				resData.setErrCode("0");
			} else {
				resData.setErrCode("1");
				resData.setErrMsg("登录账户名重复，请重新输入！");
			}
		commonOutPrint(resData);
		return null;
	}

	public String save() throws Exception {
		DataModel resData = new DataModel();
		if (ADD.equals(this.oper)) {
			userInfo.setPassworderrornum(0l);
			String s = "111111";
			byte[]  b = CryptUtil.encryptMD5(s.getBytes());
			userInfo.setPassword( new BigInteger(b).toString(16));// 默认密码是111111 保存用MD5加密后的字符串
			userInfo.setStatus(SystemCommonDefine.USER_STATUS_1);// 状态定义为正常 1
			long createby = ((UserInfo) getSession().getAttribute("user")).getUserid();
			userInfo.setTmpcreateby(createby);
			resData = userService.addUserInfo(userInfo);
		} else if (EDIT.equals(this.oper)) {
			long tmplastcreateby = ((UserInfo) getSession().getAttribute("user")).getUserid();
			userInfo.setTmplastcreateby(tmplastcreateby);
			resData = userService.updateUserInfo(userInfo);
		}
		commonOutPrint(resData);
		return null;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

}