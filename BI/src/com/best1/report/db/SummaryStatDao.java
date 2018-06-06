package com.best1.report.db;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.best1.base.BaseBO;
import com.best1.base.DataModel;

public class SummaryStatDao extends BaseBO{

	public DataModel getDailyStatisticByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("SummaryStatSql.getDailyStatistics", condition);
    }
	
	public DataModel getProductinfoTodayByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("SummaryStatSql.getProductinfoTodays", condition);
    }
	
	public DataModel getSubChannelNames(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("SummaryStatSql.getSubChannelNames", condition);
    }
	
	public DataModel getSubChannelHours(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("SummaryStatSql.getSubChannelHours", condition);
    }
	
	public Map doProductinfoToday(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("SummaryStatSql.doProductinfoToday",condition);
    }
	
	public DataModel getPgminfoDetailByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("SummaryStatSql.getPgminfoDetails", "SummaryStatSql.countPgminfoDetail", condition);
    }
	
	public Map doPgminfoDetail(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("SummaryStatSql.doPgminfoDetail",condition);
    }
	
	public DataModel getPgminfoDetailHisByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("SummaryStatSql.getPgminfoDetailHis", "SummaryStatSql.countPgminfoDetailHis", condition);
    }
	
	public Map doPgminfoDetailHis(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("SummaryStatSql.doPgminfoDetailHis",condition);
    }
	
	public DataModel getCampainsinfoDetailByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("SummaryStatSql.getCampainsinfoDetails", "SummaryStatSql.countCampainsinfoDetail", condition);
    }
	
	public Map doCampainsinfoDetail(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("SummaryStatSql.doCampainsinfoDetail",condition);
    }
	
	public DataModel getTimeOrderList(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("SummaryStatSql.getTimeOrders","SummaryStatSql.countTimeOrder", condition);
    }
	
	public DataModel getTimeOrderXml(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("SummaryStatSql.getTimeOrders", condition);
    }
	
	public Map doTimeOrder(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("SummaryStatSql.doTimeOrder",condition);
    }
	
	public DataModel getAreaOrders(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("SummaryStatSql.getAreaOrders", condition);
    }
	
	public DataModel getZipOrders(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("SummaryStatSql.getZipOrders", condition);
    }
	
	public DataModel getSubChannelOrders(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("SummaryStatSql.getSubChannelOrders", condition);
    }
}