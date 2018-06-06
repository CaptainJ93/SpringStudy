package com.best1.report.service;

import java.util.HashMap;

import com.best1.base.BusiException;
import com.best1.base.DataModel;
import com.best1.base.BaseService;

public interface SummaryStatService extends BaseService {
	
	public String getDailyStatisticByPage(HashMap paramMap) throws Exception;
	
	public DataModel getTimeOrderListByPage(HashMap paramMap) throws Exception;
	
	public String getTimeOrderXml(HashMap paramMap) throws Exception;
	
	public DataModel getProductinfoTodayByPage(HashMap paramMap) throws Exception;
	
	public DataModel getPgminfoDetailByPage(HashMap paramMap) throws BusiException;
	
	public DataModel getPgminfoDetailHisByPage(HashMap paramMap) throws BusiException;
	
	public DataModel getCampainsinfoDetailByPage(HashMap paramMap) throws BusiException;
	
	public DataModel getAreaOrders(HashMap paramMap) throws BusiException;
	
	public DataModel getZipOrders(HashMap paramMap) throws BusiException;
	
	public DataModel getSubChannelOrders(HashMap paramMap) throws BusiException;
	
}
