package com.best1.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import com.best1.base.DataModel;
import com.best1.db.PrivilegeDao;
import com.best1.domain.Privilege;
import com.best1.service.PrivilegeService;
import com.best1.base.BusiException;
import com.best1.base.BaseServiceImpl;

public class PrivilegeServiceImpl extends BaseServiceImpl implements PrivilegeService{
	private PrivilegeDao privilegeDao;
	
	public DataModel getPrivilegeByPage(HashMap paramMap) throws BusiException {
		try {
			DataModel resData = privilegeDao.getPrivilegeByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel addPrivilege(Privilege privilege) {
		try {
			return privilegeDao.insertPrivilege(privilege);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel updatePrivilege(Privilege privilege) {
		try {
			return privilegeDao.updatePrivilege(privilege);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel deletePrivilege(HashMap paramMap) {
		try {
			String[] privilegeIds = String.valueOf(paramMap.get("privilegeId")).split(",");
			paramMap.clear();
			paramMap.put("privilegeIds", privilegeIds);
			privilegeDao.deleteRolePrivilege(paramMap);//删除角色权限关系表
			return privilegeDao.deletePrivilege(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getPrivileges(HashMap paramMap) throws BusiException {
		try {
			return privilegeDao.getPrivileges(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getSensitiveData(HashMap paramMap) throws BusiException {
		try {
			return privilegeDao.getSensitiveData(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}

	public PrivilegeDao getPrivilegeDao() {
		return privilegeDao;
	}

	public void setPrivilegeDao(PrivilegeDao privilegeDao) {
		this.privilegeDao = privilegeDao;
	}
	


}
