package com.best1.db;

import java.sql.SQLException;
import java.util.HashMap;

import com.best1.base.BaseBO;
import com.best1.base.DataModel;
import com.best1.domain.Role;

public class RoleDao extends BaseBO{

	public DataModel getRoleByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("RoleSql.getRoles", "RoleSql.countRole", condition);
    }
	
	public DataModel getRoles(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("RoleSql.getRoles", condition);
    }
	
	public DataModel insertRole(Role role) throws SQLException {
        return baseDAO.insertSqlStatement("RoleSql.insertRole", role);
    }
	
	public DataModel updateRole(Role role) throws SQLException {
    	return baseDAO.updateSqlStatement("RoleSql.updateRole", role);
    }
	
	public DataModel deleteRole(HashMap condition) throws SQLException {
    	return baseDAO.deleteSqlStatement("RoleSql.deleteRole", condition);
    }
	
	public DataModel deleteRoleMenu(HashMap condition) throws SQLException {
    	return baseDAO.deleteSqlStatement("RoleSql.deleteRoleMenu", condition);
    }
	
	public DataModel insertRoleMenu(HashMap condition) throws SQLException {
        return baseDAO.insertSqlStatement("RoleSql.insertRoleMenu", condition);
    }
	
	public DataModel deleteRolePrivilege(HashMap condition) throws SQLException {
    	return baseDAO.deleteSqlStatement("RoleSql.deleteRolePrivilege", condition);
    }
	
	public DataModel insertRolePrivilege(HashMap condition) throws SQLException {
        return baseDAO.insertSqlStatement("RoleSql.insertRolePrivilege", condition);
    }
	
	public DataModel getPrivilegeByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("RoleSql.getPrivileges", "RoleSql.countPrivilege", condition);
    }
	
}