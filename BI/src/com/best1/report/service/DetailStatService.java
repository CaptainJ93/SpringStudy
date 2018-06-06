package com.best1.report.service;

import java.util.HashMap;

import com.best1.base.BusiException;
import com.best1.base.DataModel;
import com.best1.base.BaseService;

public interface DetailStatService extends BaseService {
	
	public DataModel getReturnResonStatByPage(HashMap paramMap);
	
	public DataModel getReturnResonStatRecords(HashMap paramMap);
	
	public DataModel getReturnResonStats(HashMap paramMap) throws BusiException;
	
	public DataModel getComplaintStatByPage(HashMap paramMap);
	
	public DataModel getComplaintStatRecords(HashMap paramMap) throws BusiException;
	
	public DataModel getComplaintStats(HashMap paramMap) throws BusiException;
	
	public DataModel getCustomerInfoAllOutByPage(HashMap paramMap);
	
	public DataModel getCustomerInfoAllOutRecords(HashMap paramMap);
	
	public DataModel getCustomerInfoAllOuts(HashMap paramMap);
	
	public DataModel getOrderDetailAllOutByPage(HashMap paramMap);
	
	public DataModel getOrderDetailAllOutRecords(HashMap paramMap);
	
	public DataModel getOrderDetailAllOuts(HashMap paramMap);
	
	public HashMap addExportAudit(HashMap paramMap) throws Exception ;
	
}
