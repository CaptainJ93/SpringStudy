package com.best1.service;

import java.util.HashMap;

import com.best1.base.DataModel;
import com.best1.domain.Department;
import com.best1.base.BaseService;

public interface DepartmentService extends BaseService {
	
	public DataModel getDepartmentByPage(HashMap paramMap);
	
	public DataModel getDepartments(HashMap paramMap);
	
	public DataModel addDepartment(Department department);
	
	public DataModel updateDepartment(Department department);
	
	public DataModel deleteDepartment(HashMap paramMap);
}
