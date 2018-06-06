package com.best1.action;

import com.best1.base.BaseAction;
import com.best1.base.DataModel;
import com.best1.domain.Privilege;
import com.best1.service.PrivilegeService;

public class PrivilegeAction extends BaseAction {
	private PrivilegeService privilegeService;
	private Privilege privilege;
	
	public String list() throws Exception {
		DataModel resData = privilegeService.getPrivilegeByPage(paramMap);
		commonOutPrint(resData);
		return null;
	}
	
	public String edit() throws Exception {
		DataModel resData = privilegeService.getPrivileges(paramMap);
		commonOutPrint(resData);
		return null;
	}

	public String save() throws Exception {
		DataModel resData = new DataModel();
		if (ADD.equals(this.oper)) {
			resData = privilegeService.addPrivilege(privilege);
		} else if (EDIT.equals(this.oper)) {
			resData = privilegeService.updatePrivilege(privilege);
		}
		commonOutPrint(resData);
		return null;
	}

	public String delete() throws Exception {
		DataModel resData = privilegeService.deletePrivilege(paramMap);
		commonOutPrint(resData);
		return null;
	}

	public PrivilegeService getPrivilegeService() {
		return privilegeService;
	}

	public void setPrivilegeService(PrivilegeService privilegeService) {
		this.privilegeService = privilegeService;
	}

	public Privilege getPrivilege() {
		return privilege;
	}

	public void setPrivilege(Privilege privilege) {
		this.privilege = privilege;
	}

	

}