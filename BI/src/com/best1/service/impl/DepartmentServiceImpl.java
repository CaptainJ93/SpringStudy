package com.best1.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.best1.base.DataModel;
import com.best1.db.DepartmentDao;
import com.best1.domain.Department;
import com.best1.domain.UserInfo;
import com.best1.service.DepartmentService;
import com.best1.base.BusiException;
import com.best1.base.BaseServiceImpl;

public class DepartmentServiceImpl extends BaseServiceImpl implements DepartmentService{
	private DepartmentDao departmentDao;
	
	public DataModel getDepartmentByPage(HashMap paramMap) throws BusiException {
		try {
			DataModel resData = departmentDao.getDepartmentByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel addDepartment(Department department) {
		try {
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			UserInfo user = (UserInfo)session.getAttribute("user");
			if(department.getDepartmentPid() == null || "".equals(department.getDepartmentPid())){
				department.setDepartmentPid(0L);
			}
			department.setCreatedby(user.getUserid());
			return departmentDao.insertDepartment(department);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel updateDepartment(Department department) {
		try {
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			UserInfo user = (UserInfo)session.getAttribute("user");
			department.setLastmodifyby(user.getUserid());
			if(department.getDepartmentPid() == null || "".equals(department.getDepartmentPid())){
				department.setDepartmentPid(0L);
			}
			return departmentDao.updateDepartment(department);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel deleteDepartment(HashMap paramMap) {
		try {
			DataModel dataModel = new DataModel();
			String[] departmentIds = String.valueOf(paramMap.get("departmentId")).split(",");
			paramMap.clear();
			paramMap.put("departmentIds", departmentIds);
			
			//菜单目录删除时需判断目录下是否有子目录或菜单未删除
			int num = departmentDao.countDeptUndeleted(paramMap);
			if(num == 0){
				dataModel = departmentDao.deleteDepartment(paramMap);
			}else{
				dataModel.setErrCode("1");
				dataModel.setErrMsg("删除部门时需同时删除部门下的子部门！");
			}
			return dataModel;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getDepartments(HashMap paramMap) throws BusiException {
		try {
			return departmentDao.getDepartments(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}

	public DepartmentDao getDepartmentDao() {
		return departmentDao;
	}

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

}
