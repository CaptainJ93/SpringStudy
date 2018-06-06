package com.best1.action;

import com.best1.base.BaseAction;
import com.best1.base.DataModel;
import com.best1.service.LoggingService;

public class LoggingAction extends BaseAction {
	private LoggingService loggingService;

	
	public String list() throws Exception {
		DataModel resData = loggingService.getLoggingByPage(paramMap);
		if ("excel".equals(paramMap.get("export"))) {
			commonOutExcel(resData);
		} else {
			commonOutPrint(resData);
		}
		return null;
	}


	public LoggingService getLoggingService() {
		return loggingService;
	}


	public void setLoggingService(LoggingService loggingService) {
		this.loggingService = loggingService;
	}


}