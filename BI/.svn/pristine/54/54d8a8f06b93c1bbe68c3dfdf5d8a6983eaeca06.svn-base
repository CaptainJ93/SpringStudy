package com.best1.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import com.best1.base.DataModel;
import com.best1.db.TemplateDao;
import com.best1.domain.UserInfo;
import com.best1.service.LoggingService;
import com.best1.service.TemplateService;
import com.best1.base.BusiException;
import com.best1.base.BaseServiceImpl;
import com.best1.base.common.SystemCommonDefine;

public class TemplateServiceImpl extends BaseServiceImpl implements TemplateService{
	private TemplateDao templateDao;
	private LoggingService loggingService;
	
	public DataModel getUserInfoByPage(HashMap paramMap) throws BusiException {
		try {
			DataModel resData = templateDao.getUserInfoByPage(paramMap);
			paramMap.put("busiDesc", "测试业务描述");
			paramMap.put("sql", resData.getSql());
			paramMap.put("remark", "备注");
			if ("excel".equals(paramMap.get("export"))) {
				paramMap.put("logType", SystemCommonDefine.BUSI_LOG_TYPE_14);//10:查询;11:新增;12:修改;13:删除;14:导出
			} else {
				paramMap.put("logType", SystemCommonDefine.BUSI_LOG_TYPE_10);//10:查询;11:新增;12:修改;13:删除;14:导出
			}
			loggingService.addLoggingInfo(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel addUserInfo(UserInfo userInfo) {
		try {
			return templateDao.insertUserInfo(userInfo);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel updateUserInfo(UserInfo userInfo) {
		try {
			return templateDao.updateUserInfo(userInfo);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel deleteUserInfo(HashMap paramMap) {
		try {
			String[] userids = String.valueOf(paramMap.get("userid")).split(",");
			paramMap.clear();
			paramMap.put("userids", userids);
			return templateDao.deleteUserInfo(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getUserInfos(HashMap paramMap) throws BusiException {
		try {
			return templateDao.getUserInfos(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getRecords(HashMap paramMap) throws BusiException {
		try {
			return templateDao.getRecords(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getTmpUsers(HashMap paramMap) throws BusiException {
		try {
			return templateDao.getTmpUsers(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}

	public TemplateDao getTemplateDao() {
		return templateDao;
	}

	public void setTemplateDao(TemplateDao templateDao) {
		this.templateDao = templateDao;
	}

	public LoggingService getLoggingService() {
		return loggingService;
	}

	public void setLoggingService(LoggingService loggingService) {
		this.loggingService = loggingService;
	}


}
