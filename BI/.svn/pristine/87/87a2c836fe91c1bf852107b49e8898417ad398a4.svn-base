package com.best1.action;

import com.best1.base.BaseAction;
import com.best1.base.DataModel;
import com.best1.domain.Role;
import com.best1.service.RoleService;

public class RoleAction extends BaseAction {
	private RoleService roleService;
	private Role role;

	
	public String list() throws Exception {
		DataModel resData = roleService.getRoleByPage(paramMap);
		commonOutPrint(resData);
		return null;
	}

	public String edit() throws Exception {
		DataModel resData = roleService.getRoles(paramMap);
		commonOutPrint(resData);
		return null;
	}

	public String save() throws Exception {
		DataModel resData = new DataModel();
		if (ADD.equals(this.oper)) {
			resData = roleService.addRole(role);
		} else if (EDIT.equals(this.oper)) {
			resData = roleService.updateRole(role);
		}
		commonOutPrint(resData);
		return null;
	}

	public String delete() throws Exception {
		DataModel resData = roleService.deleteRole(paramMap);
		commonOutPrint(resData);
		return null;
	}
	
	public String saveRoleMenu() throws Exception {
		DataModel resData = roleService.addRoleMenu(paramMap);
		commonOutPrint(resData);
		return null;
	}
	
	public String listPrivilege() throws Exception {
		DataModel resData = roleService.getPrivilegeByPage(paramMap);
		commonOutPrint(resData);
		return null;
	}
	
	public String deleteRolePrivilege() throws Exception {
		DataModel resData = roleService.deleteRolePrivilege(paramMap);
		commonOutPrint(resData);
		return null;
	}
	
	public String saveRolePrivilege() throws Exception {
		DataModel resData = roleService.addRolePrivilege(paramMap);
		commonOutPrint(resData);
		return null;
	}
	

	public RoleService getRoleService() {
		return roleService;
	}

	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}



}