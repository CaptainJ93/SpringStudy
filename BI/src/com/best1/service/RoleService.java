package com.best1.service;

import java.util.HashMap;

import com.best1.base.DataModel;
import com.best1.domain.Role;
import com.best1.base.BaseService;

public interface RoleService extends BaseService {
	
	public DataModel getRoleByPage(HashMap paramMap);
	
	public DataModel getRoles(HashMap paramMap);
	
	public DataModel addRole(Role role);
	
	public DataModel updateRole(Role role);
	
	public DataModel deleteRole(HashMap paramMap);
	
	public DataModel addRoleMenu(HashMap paramMap);
	
	public DataModel getPrivilegeByPage(HashMap paramMap);
	
	public DataModel deleteRolePrivilege(HashMap paramMap);
	
	public DataModel addRolePrivilege(HashMap paramMap);
	
}
