package com.best1.db;

import java.sql.SQLException;
import java.util.HashMap;
import com.best1.base.BaseBO;
import com.best1.base.DataModel;
import com.best1.domain.UserInfo;

public class UserDao extends BaseBO{

	public DataModel getUserInfo(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("UserSql.getUserInfo", condition);
    }

	public DataModel updateUserpwdErrorNum(HashMap condition) throws SQLException {
		return baseDAO.updateSqlStatement("UserSql.updateUserpwdErrorNum", condition);
    }

	public DataModel lockUserStatus(HashMap condition) throws SQLException {
		return baseDAO.updateSqlStatement("UserSql.lockUserStatus", condition);
    }
	
	public DataModel updateUserPwd(HashMap condition) throws SQLException {
		return baseDAO.updateSqlStatement("UserSql.updateUserPwd", condition);
    }
	
	public DataModel getUserByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("UserSql.getUserByPage", "UserSql.countUsers", condition);
    }

	public DataModel deleteUserInfo(HashMap condition) throws SQLException {
		//删除用户权限
		deleteUserPrivilegeInfo(condition);
		//删除用户角色
		deleteUserRoleInfo(condition);
    	return baseDAO.deleteSqlStatement("UserSql.deleteUserInfo", condition);
    }

	public DataModel deleteUserPrivilegeInfo(HashMap condition) throws SQLException {
    	return baseDAO.deleteSqlStatement("UserSql.deleteUserPrivilegeInfo", condition);
    }

	public DataModel deleteUserRoleInfo(HashMap condition) throws SQLException {
    	return baseDAO.deleteSqlStatement("UserSql.deleteUserRoleInfo", condition);
    }

	public DataModel updateUserStatus(HashMap condition) throws SQLException {
		return baseDAO.updateSqlStatement("UserSql.updateUserStatus", condition);
    }
	
	public DataModel updateUserInfo(UserInfo UserInfo) throws SQLException {
    	return baseDAO.updateSqlStatement("UserSql.updateUserInfo", UserInfo);
    }
	
	public DataModel insertUserInfo(UserInfo userInfo) throws SQLException {
        return baseDAO.insertSqlStatement("UserSql.insertUserInfo", userInfo);
    }
	
	public DataModel listUserRole(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("UserSql.listUserRole", "UserSql.countUserRoles", condition);
    }
	
	public DataModel listAllUnincludedRole(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("UserSql.listAllUnincludedRole", "UserSql.countAllUnincludedRole", condition);
    }
	public DataModel addUserRole(HashMap condition) throws SQLException {
        return baseDAO.insertSqlStatement("UserSql.addUserRole", condition);
    }
	public DataModel deleteUserRole(HashMap condition) throws SQLException {
        return baseDAO.deleteSqlStatement("UserSql.deleteUserRole", condition);
    }
}