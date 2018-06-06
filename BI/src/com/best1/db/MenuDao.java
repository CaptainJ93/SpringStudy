package com.best1.db;

import java.sql.SQLException;
import java.util.HashMap;

import com.best1.base.BaseBO;
import com.best1.base.DataModel;
import com.best1.domain.Menu;

public class MenuDao extends BaseBO{

	public DataModel getMenuByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("MenuSql.getMenus", "MenuSql.countMenu", condition);
    }
	
	public DataModel getMenus(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("MenuSql.getMenus", condition);
    }
	
	public DataModel insertMenu(Menu Menu) throws SQLException {
        return baseDAO.insertSqlStatement("MenuSql.insertMenu", Menu);
    }
	
	public DataModel updateMenu(Menu Menu) throws SQLException {
    	return baseDAO.updateSqlStatement("MenuSql.updateMenu", Menu);
    }
	
	public DataModel deleteMenu(HashMap condition) throws SQLException {
    	return baseDAO.deleteSqlStatement("MenuSql.deleteMenu", condition);
    }
	
	public int countMenuUndeleted(HashMap condition) throws SQLException{
    	return baseDAO.queryForValue("MenuSql.countMenuUndeleted", condition,1);
    }
}