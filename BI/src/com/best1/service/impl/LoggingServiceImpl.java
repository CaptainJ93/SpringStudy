package com.best1.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.best1.base.BaseServiceImpl;
import com.best1.base.BusiException;
import com.best1.base.DataModel;
import com.best1.db.LoggingDAO;
import com.best1.domain.UserInfo;
import com.best1.service.LoggingService;

public class LoggingServiceImpl extends BaseServiceImpl implements LoggingService{
	private LoggingDAO loggingDAO;

	public DataModel getLoggingByPage(HashMap paramMap) throws BusiException {
		try {
			DataModel resData = loggingDAO.getLoggingByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	/*
	 * 新增操作日志
	 */
	public DataModel addLoggingInfo(HashMap paramMap) {
		try {
			//删除不需要保存日志的条件参数
			paramMap.remove("membershiplevelname");
			paramMap.remove("customerTypeName");
			paramMap.remove("productClassName");
			paramMap.remove("subchannelName");
			paramMap.remove("orderTypeName");
			paramMap.remove("orderStatusName");
			paramMap.remove("areaZipCodeName");
			
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			UserInfo user = (UserInfo)session.getAttribute("user");
			paramMap.put("userId", user.getUserid());
			paramMap.put("hostName", user.getHostname());
			paramMap.put("hostIp", user.getHostip());
			paramMap.put("queryCondition", paramMap.toString());
			return loggingDAO.insertLoggingInfo(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}

	public LoggingDAO getLoggingDAO() {
		return loggingDAO;
	}

	public void setLoggingDAO(LoggingDAO loggingDAO) {
		this.loggingDAO = loggingDAO;
	}
	
}
