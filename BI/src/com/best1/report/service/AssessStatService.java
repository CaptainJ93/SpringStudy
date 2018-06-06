package com.best1.report.service;

import java.util.HashMap;

import com.best1.base.DataModel;
import com.best1.base.BaseService;

public interface AssessStatService extends BaseService {
	
	public DataModel getMdOrderStatByPage(HashMap paramMap);
	
	public DataModel getCreatebyStatByPage(HashMap paramMap);
	
}
