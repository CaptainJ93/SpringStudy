package com.best1.db;

import java.sql.SQLException;
import java.util.HashMap;

import com.best1.base.BaseBO;
import com.best1.base.BaseDAO;
import com.best1.base.DataModel;
import com.best1.domain.UserInfo;

public class TemplateDao extends BaseBO{

	public DataModel getUserInfoByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("TemplateSql.getUserInfos", "TemplateSql.countUserInfo", condition);
    }
	
	public DataModel getUserInfos(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("TemplateSql.getUserInfos", condition);
    }
	
	public DataModel insertUserInfo(UserInfo UserInfo) throws SQLException {
        return baseDAO.insertSqlStatement("TemplateSql.insertUserInfo", UserInfo);
    }
	
	public DataModel updateUserInfo(UserInfo UserInfo) throws SQLException {
    	return baseDAO.updateSqlStatement("TemplateSql.updateUserInfo", UserInfo);
    }
	
	public DataModel deleteUserInfo(HashMap condition) throws SQLException {
    	return baseDAO.deleteSqlStatement("TemplateSql.deleteUserInfo", condition);
    }
	
	public DataModel getRecords(HashMap condition) throws SQLException{
    	return baseDAO.queryForValue("TemplateSql.countUserInfo", condition);
    }
	
	public DataModel getTmpUsers(HashMap condition) throws SQLException{
		if(condition.get("type").equals("1")){
			return baseDAO.queryForList("TemplateSql.getTmpUsersForAll","TemplateSql.getTmpUsersForAllCount", condition);
		}else if(condition.get("type").equals("2")){
			condition.put("province", "浙江省");
			return baseDAO.queryForList("TemplateSql.getTmpUsersForProvince","TemplateSql.getTmpUsersForProvinceCount", condition);
		}else{
			condition.put("province", "浙江省");
			condition.put("city", "杭州市");
			return baseDAO.queryForList("TemplateSql.getTmpUsersForCity","TemplateSql.getTmpUsersForCityCount", condition);
		}
    	
    }
}