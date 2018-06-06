package com.best1.report.db;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.best1.base.BaseBO;
import com.best1.base.DataModel;

public class AssessStatDao extends BaseBO{

	public DataModel getMdOrderStatByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("AssessStatSql.getMdOrderStats", "AssessStatSql.countMdOrderStat", condition);
    }
	
	public Map doMdOrderStat(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("AssessStatSql.doMdOrderStat",condition);
    }
	
	public DataModel getCreatebyStatByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("AssessStatSql.getCreatebyStats", "AssessStatSql.countCreatebyStat", condition);
    }
	
	public Map doCreatebyStat(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("AssessStatSql.doCreatebyStat",condition);
    }
}