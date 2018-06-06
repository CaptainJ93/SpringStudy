package com.best1.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import com.best1.base.DataModel;
import com.best1.db.MenuDao;
import com.best1.domain.Menu;
import com.best1.service.MenuService;
import com.best1.base.BusiException;
import com.best1.base.BaseServiceImpl;

public class MenuServiceImpl extends BaseServiceImpl implements MenuService{
	private MenuDao menuDao;
	
	public DataModel getMenuByPage(HashMap paramMap) throws BusiException {
		try {
			DataModel resData = menuDao.getMenuByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel addMenu(Menu menu) {
		try {
			return menuDao.insertMenu(menu);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel updateMenu(Menu menu) {
		try {
			return menuDao.updateMenu(menu);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel deleteMenu(HashMap paramMap) {
		try {
			DataModel dataModel = new DataModel();
			String[] menuids = String.valueOf(paramMap.get("menuid")).split(",");
			paramMap.clear();
			paramMap.put("menuids", menuids);
			//菜单目录删除时需判断目录下是否有子目录或菜单未删除
			int num = menuDao.countMenuUndeleted(paramMap);
			if(num == 0){
				dataModel = menuDao.deleteMenu(paramMap);
			}else{
				dataModel.setErrCode("1");
				dataModel.setErrMsg("删除菜单目录时需同时删除目录的子目录和子菜单！");
			}
			return dataModel;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getMenus(HashMap paramMap) throws BusiException {
		try {
			return menuDao.getMenus(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}

	public MenuDao getMenuDao() {
		return menuDao;
	}

	public void setMenuDao(MenuDao menuDao) {
		this.menuDao = menuDao;
	}
	
	

}
