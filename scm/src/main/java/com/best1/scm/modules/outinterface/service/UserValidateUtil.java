package com.best1.scm.modules.outinterface.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.best1.scm.modules.outinterface.entity.JsonResultModel;
import com.best1.scm.modules.outinterface.entity.UserInfo;


/**
 * 针对对接的账号权限进行验证
 * @author zhangzujie
 *
 */
public class UserValidateUtil {

	/**
	 * 验证用户信息是否合法
	 * @param type
	 * @param userService
	 * @param userInfo
	 * @param request 请求header: code,username,validatecode,type,userid四个属性，有好易购提供,进行账号权限认证
	 * @return
	 */
	public static JsonResultModel validateUser(HttpServletRequest request,int type,UserInfoService userService){
		
		JsonResultModel jsonResultModel = new JsonResultModel();
		UserInfo userInfo = new UserInfo(); 
		
		if(null == request.getHeader("code")){
			jsonResultModel.setIsSuccess(0);
			jsonResultModel.setFailureDesc("code值不能为空");
			return jsonResultModel;
		}else{
			try{
				userInfo.setCode(Integer.valueOf(request.getHeader("code")));
			}catch(NumberFormatException e){
				jsonResultModel.setIsSuccess(0);
				jsonResultModel.setFailureDesc("code只能为数值类型");
				return jsonResultModel;
			}
			
		}
		
		if(null == request.getHeader("userid")){
			jsonResultModel.setIsSuccess(0);
			jsonResultModel.setFailureDesc("userid值不能为空");
			return jsonResultModel;
		}else{
			try{
				userInfo.setUserid(Integer.valueOf(request.getHeader("userid")));
			}catch(NumberFormatException e){
				jsonResultModel.setIsSuccess(0);
				jsonResultModel.setFailureDesc("userid只能为数值类型");
				return jsonResultModel;
			}
			
		}
		
		if(null == request.getHeader("type")){
			jsonResultModel.setIsSuccess(0);
			jsonResultModel.setFailureDesc("type值不能为空");
			return jsonResultModel;
		}else{
			try{
				userInfo.setType(Integer.valueOf(request.getHeader("type")));
				}catch(NumberFormatException e){
					jsonResultModel.setIsSuccess(0);
					jsonResultModel.setFailureDesc("type只能为数值类型");
					return jsonResultModel;
				}
		}
		
		if(Integer.valueOf(request.getHeader("type"))!=type){
			jsonResultModel.setIsSuccess(0);
			jsonResultModel.setFailureDesc("type值不正确");
			return jsonResultModel;
		}
		
		if(null == request.getHeader("username")||("".equals(request.getHeader("username")))){
			jsonResultModel.setIsSuccess(0);
			jsonResultModel.setFailureDesc("username值不能为空");
			return jsonResultModel;
		}else{
			userInfo.setUsername(request.getHeader("username"));
		}
		
		if(null == request.getHeader("validatecode")||("".equals(request.getHeader("validatecode")))){
			jsonResultModel.setIsSuccess(0);
			jsonResultModel.setFailureDesc("validatecode值不能为空");
			return jsonResultModel;
		}else{
			userInfo.setValidatecode(request.getHeader("validatecode"));
		}
		
		
		 List<UserInfo> userInfoList = userService.findList(userInfo);
			if(null == userInfoList || userInfoList.size() ==0){
				jsonResultModel.setIsSuccess(0);
				jsonResultModel.setFailureDesc("账户信息不存在,请检查你发来的header json数据");
			}else{
				jsonResultModel.setIsSuccess(1);
				jsonResultModel.setFailureDesc("验证成功...");
			}
		
		return jsonResultModel;
		
	}
	
}
