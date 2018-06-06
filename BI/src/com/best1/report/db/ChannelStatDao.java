package com.best1.report.db;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.best1.base.BaseBO;
import com.best1.base.DataModel;

public class ChannelStatDao extends BaseBO{

	public DataModel getChannelAreaStatByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("ChannelStatSql.getChannelAreaStats", "ChannelStatSql.countChannelAreaStat", condition);
    }
	
	public Map doChannelAreaStat(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("ChannelStatSql.doChannelAreaStat",condition);
    }
	
	public DataModel getChannelOrderStatByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("ChannelStatSql.getChannelOrderStats", "ChannelStatSql.countChannelOrderStat", condition);
    }
	
	public Map doChannelOrderStat(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("ChannelStatSql.doChannelOrderStat",condition);
    }
	
	public DataModel getSpProgramStatByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("ChannelStatSql.getSpProgramStats", "ChannelStatSql.countSpProgramStat", condition);
    }
	
	public Map doSpProgramStat(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("ChannelStatSql.doSpProgramStat",condition);
    }
	
	public DataModel getPgMorderStatByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("ChannelStatSql.getPgMorderStats", "ChannelStatSql.countPgMorderStat", condition);
    }
	
	public Map doPgMorderStat(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("ChannelStatSql.doPgMorderStat",condition);
    }
	
	public DataModel getAreaChannelStatByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("ChannelStatSql.getAreaChannelStats", "ChannelStatSql.countAreaChannelStat", condition);
    }
	
	public Map doAreaChannelStat(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("ChannelStatSql.doAreaChannelStat",condition);
    }
	
	public DataModel getAreaStatByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("ChannelStatSql.getAreaStats", "ChannelStatSql.countAreaStat", condition);
    }
	
	public Map doAreaStat(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("ChannelStatSql.doAreaStat",condition);
    }
	
	public DataModel getTimeOrderStatByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("ChannelStatSql.getTimeOrderStats", "ChannelStatSql.countTimeOrderStat", condition);
    }
	
	public DataModel getTimeOrderStatList(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("ChannelStatSql.getTimeOrderStats", condition);
    }
	
	public Map doTimeOrderStat(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("ChannelStatSql.doTimeOrderStat",condition);
    }
}