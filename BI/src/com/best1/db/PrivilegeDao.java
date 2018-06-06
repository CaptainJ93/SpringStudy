package com.best1.db;

import java.sql.SQLException;
import java.util.HashMap;


import com.best1.base.BaseBO;
import com.best1.base.DataModel;
import com.best1.domain.Privilege;

public class PrivilegeDao extends BaseBO{
	
	public DataModel getPrivilegeByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("PrivilegeSql.getPrivileges", "PrivilegeSql.countPrivilege", condition);
    }
	
	public DataModel getPrivileges(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("PrivilegeSql.getPrivileges", condition);
    }
	
	public DataModel insertPrivilege(Privilege privilege) throws SQLException {
        return baseDAO.insertSqlStatement("PrivilegeSql.insertPrivilege", privilege);
    }
	
	public DataModel updatePrivilege(Privilege privilege) throws SQLException {
    	return baseDAO.updateSqlStatement("PrivilegeSql.updatePrivilege", privilege);
    }
	
	public DataModel deletePrivilege(HashMap condition) throws SQLException {
    	return baseDAO.deleteSqlStatement("PrivilegeSql.deletePrivilege", condition);
    }
	
	public DataModel getSensitiveData(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("PrivilegeSql.getSensitiveData", condition);
    }
	
	public DataModel deleteRolePrivilege(HashMap condition) throws SQLException {
    	return baseDAO.deleteSqlStatement("PrivilegeSql.deleteRolePrivilege", condition);
    }

}