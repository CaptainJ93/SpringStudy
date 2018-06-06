package com.best1.service;

import java.util.HashMap;
import java.util.List;

import com.best1.base.BaseService;
import com.best1.base.BusiException;
import com.best1.base.DataModel;
import com.best1.domain.MenuInfo;

public interface TreeInfoService  extends BaseService{
	
	public List<MenuInfo> getCTreeInfos(HashMap paramMap);
	
	public DataModel getMenuTree(HashMap paramMap)throws BusiException ;
	
	public DataModel getMenuTreeDirectory(HashMap paramMap)throws BusiException;
	
	public DataModel getDepartmentTree(HashMap paramMap)throws BusiException ;
}
