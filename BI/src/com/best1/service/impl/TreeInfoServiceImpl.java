package com.best1.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.best1.base.BaseServiceImpl;
import com.best1.base.BusiException;
import com.best1.base.DataModel;
import com.best1.db.TreeInfoDAO;
import com.best1.domain.MenuInfo;
import com.best1.service.TreeInfoService;

public class TreeInfoServiceImpl extends BaseServiceImpl  implements TreeInfoService {
	private TreeInfoDAO treeInfoDAO;
	
	public List<MenuInfo> getCTreeInfos(HashMap paramMap)throws BusiException {
		
		try {
			return treeInfoDAO.getTreeInfosByParentId(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getMenuTree(HashMap paramMap)throws BusiException {
		try {
			return treeInfoDAO.getMenuTree(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getMenuTreeDirectory(HashMap paramMap)throws BusiException {
		try {
			return treeInfoDAO.getMenuTreeDirectory(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}

	public DataModel getDepartmentTree(HashMap paramMap)throws BusiException {
		try {
			return treeInfoDAO.getDepartmentTree(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public TreeInfoDAO getTreeInfoDAO() {
		return treeInfoDAO;
	}

	public void setTreeInfoDAO(TreeInfoDAO treeInfoDAO) {
		this.treeInfoDAO = treeInfoDAO;
	}
}
