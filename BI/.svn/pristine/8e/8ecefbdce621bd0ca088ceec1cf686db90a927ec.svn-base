package com.best1.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.best1.base.DataModel;
import com.best1.db.RoleDao;
import com.best1.domain.Role;
import com.best1.domain.UserInfo;
import com.best1.service.RoleService;
import com.best1.base.BusiException;
import com.best1.base.BaseServiceImpl;

public class RoleServiceImpl extends BaseServiceImpl implements RoleService{
	private RoleDao roleDao;
	
	public DataModel getRoleByPage(HashMap paramMap) throws BusiException {
		try {
			DataModel resData = roleDao.getRoleByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel addRole(Role role) {
		try {
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			UserInfo user = (UserInfo)session.getAttribute("user");
			role.setCreatedby(user.getUserid());
			return roleDao.insertRole(role);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel updateRole(Role role) {
		try {
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			UserInfo user = (UserInfo)session.getAttribute("user");
			role.setLastmodifiedby(user.getUserid());
			return roleDao.updateRole(role);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel deleteRole(HashMap paramMap) {
		try {
			String[] roleids = String.valueOf(paramMap.get("roleid")).split(",");
			paramMap.clear();
			paramMap.put("roleids", roleids);
			return roleDao.deleteRole(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getRoles(HashMap paramMap) throws BusiException {
		try {
			return roleDao.getRoles(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel addRoleMenu(HashMap paramMap) {
		try {
			//先根据roleid删除之前绑定的关系
			roleDao.deleteRoleMenu(paramMap);
			//重新绑定
			String[] menuids = String.valueOf(paramMap.get("menuid")).split(",");
			paramMap.put("menuids", menuids);
			return roleDao.insertRoleMenu(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel deleteRolePrivilege(HashMap paramMap) {
		try {
			String[] roleSourceIds = String.valueOf(paramMap.get("roleSourceId")).split(",");
			paramMap.put("roleSourceIds", roleSourceIds);
			return roleDao.deleteRolePrivilege(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel addRolePrivilege(HashMap paramMap) {
		try {
			String[] privilegeIds = String.valueOf(paramMap.get("privilegeId")).split(",");
			paramMap.put("privilegeIds", privilegeIds);
			return roleDao.insertRolePrivilege(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getPrivilegeByPage(HashMap paramMap) throws BusiException {
		try {
			DataModel resData = roleDao.getPrivilegeByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public RoleDao getRoleDao() {
		return roleDao;
	}

	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}



}
