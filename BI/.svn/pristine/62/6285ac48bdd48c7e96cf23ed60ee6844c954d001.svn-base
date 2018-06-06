package com.best1.action;

import com.best1.base.BaseAction;
import com.best1.base.DataModel;
import com.best1.domain.Department;
import com.best1.service.DepartmentService;

public class DepartmentAction extends BaseAction {
	private DepartmentService departmentService;
	private Department department;

	
	public String list() throws Exception {
		DataModel resData = departmentService.getDepartmentByPage(paramMap);
		commonOutPrint(resData);
		return null;
	}

	public String edit() throws Exception {
		DataModel resData = departmentService.getDepartments(paramMap);
		commonOutPrint(resData);
		return null;
	}

	public String save() throws Exception {
		DataModel resData = new DataModel();
		if (ADD.equals(this.oper)) {
			resData = departmentService.addDepartment(department);
		} else if (EDIT.equals(this.oper)) {
			resData = departmentService.updateDepartment(department);
		}
		commonOutPrint(resData);
		return null;
	}

	public String delete() throws Exception {
		DataModel resData = departmentService.deleteDepartment(paramMap);
		commonOutPrint(resData);
		return null;
	}

	public DepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	


}