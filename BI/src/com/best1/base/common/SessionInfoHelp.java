package com.best1.base.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.best1.domain.UserInfo;
import com.opensymphony.xwork2.ActionContext;

public class SessionInfoHelp {

	public static UserInfo getUserInfo() {
		return (UserInfo) ActionContext.getContext().getSession().get(CommonDefine.USER_INFO);
	}

	public static UserInfo getUserInfo(ActionContext actionContext) {
		return (UserInfo) actionContext.getSession().get(CommonDefine.USER_INFO);
	}

	public static UserInfo getUserInfo(HttpServletRequest request) {
		return (UserInfo) request.getSession().getAttribute(CommonDefine.USER_INFO);
	}
	
	public static UserInfo getUserInfo(HttpSession session){
		return (UserInfo)session.getAttribute(CommonDefine.USER_INFO);
	}
	
}
