package com.best1.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import com.best1.base.BaseServiceImpl;
import com.best1.base.BusiException;
import com.best1.base.DataModel;
import com.best1.db.UserDao;
import com.best1.domain.UserInfo;
import com.best1.service.UserService;

public class UserServiceImpl extends BaseServiceImpl implements UserService{
	private UserDao userDAO;
	
	public DataModel getUserByPage(HashMap paramMap) throws BusiException {
		try {
			DataModel resData = userDAO.getUserByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}

	public DataModel updateUserInfo(UserInfo userInfo) {
		try {
			return userDAO.updateUserInfo(userInfo);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getUserInfo(HashMap paramMap) throws BusiException {
		try {
			return userDAO.getUserInfo(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}

	public DataModel deleteUserInfo(HashMap paramMap) {
		try {
			String[] userids = String.valueOf(paramMap.get("userid")).split(",");
			paramMap.clear();
			paramMap.put("userids", userids);
			return userDAO.deleteUserInfo(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel updateUserStatus(HashMap paramMap) {
		try {
			String[] userids = String.valueOf(paramMap.get("userid")).split(",");
			paramMap.remove("userid");
			paramMap.put("userids", userids);
			return userDAO.updateUserStatus(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}

	public DataModel listUserRole(HashMap paramMap) {
		try {
			return userDAO.listUserRole(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel listAllUnincludedRole(HashMap paramMap){
		try {
			return userDAO.listAllUnincludedRole(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	public DataModel addUserRole(HashMap paramMap){
		try {
			String[] roleids = String.valueOf(paramMap.get("roleid")).split(",");
			paramMap.remove("roleid");
			paramMap.put("roleids", roleids);
			return userDAO.addUserRole(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}

	public DataModel deleteUserRole(HashMap paramMap) {
		try {
			String[] roleids = String.valueOf(paramMap.get("roleid")).split(",");
			paramMap.remove("roleid");
			paramMap.put("roleids", roleids);
			return userDAO.deleteUserRole(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	/*
	 * 新增用户
	 */
	public DataModel addUserInfo(UserInfo userInfo) {
		try {
			return userDAO.insertUserInfo(userInfo);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	

	public UserDao getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDao userDAO) {
		this.userDAO = userDAO;
	}

}
