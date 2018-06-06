package com.best1.db;

import java.sql.SQLException;
import java.util.HashMap;

import com.best1.base.BaseBO;
import com.best1.base.DataModel;
import com.best1.domain.LoggingInfo;

public class LoggingDAO extends BaseBO{
	
	public DataModel getLoggingByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("LoggingSql.getLoggings", "LoggingSql.countLogging", condition);
    }
	public DataModel insertLoggingInfo(HashMap condition) throws SQLException {
        return baseDAO.insertSqlStatement("LoggingSql.insertLoggingInfo", condition);
    }
	
}