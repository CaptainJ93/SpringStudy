package com.best1.db;

import java.sql.SQLException;
import java.util.HashMap;

import com.best1.base.BaseBO;
import com.best1.base.DataModel;
import com.best1.domain.Department;

public class DepartmentDao extends BaseBO{

	public DataModel getDepartmentByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("DepartmentSql.getDepartments", "DepartmentSql.countDepartment", condition);
    }
	
	public DataModel getDepartments(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("DepartmentSql.getDepartments", condition);
    }
	
	public DataModel insertDepartment(Department department) throws SQLException {
        return baseDAO.insertSqlStatement("DepartmentSql.insertDepartment", department);
    }
	
	public DataModel updateDepartment(Department department) throws SQLException {
    	return baseDAO.updateSqlStatement("DepartmentSql.updateDepartment", department);
    }
	
	public DataModel deleteDepartment(HashMap condition) throws SQLException {
    	return baseDAO.deleteSqlStatement("DepartmentSql.deleteDepartment", condition);
    }
	
	public int countDeptUndeleted(HashMap condition) throws SQLException{
    	return baseDAO.queryForValue("DepartmentSql.countDeptUndeleted", condition,1);
    }
}