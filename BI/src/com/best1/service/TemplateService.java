package com.best1.service;

import java.util.HashMap;

import com.best1.base.BusiException;
import com.best1.base.DataModel;
import com.best1.domain.UserInfo;
import com.best1.base.BaseService;

public interface TemplateService extends BaseService {
	
	public DataModel getUserInfoByPage(HashMap paramMap);
	
	public DataModel getUserInfos(HashMap paramMap);
	
	public DataModel addUserInfo(UserInfo userInfo);
	
	public DataModel updateUserInfo(UserInfo userInfo);
	
	public DataModel deleteUserInfo(HashMap paramMap);
	
	public DataModel getRecords(HashMap paramMap) throws BusiException;
	
	public DataModel getTmpUsers(HashMap paramMap);
}
