package com.best1.service;

import java.util.HashMap;

import com.best1.base.DataModel;
import com.best1.domain.Menu;
import com.best1.base.BaseService;

public interface MenuService extends BaseService {
	
	public DataModel getMenuByPage(HashMap paramMap);
	
	public DataModel getMenus(HashMap paramMap);
	
	public DataModel addMenu(Menu menu);
	
	public DataModel updateMenu(Menu menu);
	
	public DataModel deleteMenu(HashMap paramMap);
}
