package com.best1.report.db;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.best1.base.BaseBO;
import com.best1.base.DataModel;

public class CampainStatDao extends BaseBO{

	public DataModel getCampainStatByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("CampainStatSql.getCampainStats", "CampainStatSql.countCampainStat", condition);
    }
	
	public Map doCampainStat(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("CampainStatSql.doCampainStat",condition);
    }
}