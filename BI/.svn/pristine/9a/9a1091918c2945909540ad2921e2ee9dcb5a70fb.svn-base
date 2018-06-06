package com.best1.report.db;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.best1.base.BaseBO;
import com.best1.base.DataModel;

public class ProductStatDao extends BaseBO{

	public DataModel getSpOrderStatByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("ProductStatSql.getSpOrderStats", "ProductStatSql.countSpOrderStat", condition);
    }
	
	public Map doSpSporderstat(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("ProductStatSql.doSporderstat",condition);
    }
	
	public DataModel getClassOrderStatByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("ProductStatSql.getClassOrderStats", "ProductStatSql.countClassOrderStat", condition);
    }
	
	public Map doClassOrderStat(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("ProductStatSql.doClassOrderStat",condition);
    }
	
	public DataModel getProductOrderStatByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("ProductStatSql.getProductOrderStats", "ProductStatSql.countProductOrderStat", condition);
    }
	
	public Map doProductOrderStat(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("ProductStatSql.doProductOrderStat",condition);
    }
	
	public DataModel getProdReturnStatByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("ProductStatSql.getProdReturnStats", "ProductStatSql.countProdReturnStat", condition);
    }
	
	public Map doProdReturnStat(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("ProductStatSql.doProdReturnStat",condition);
    }
	
	public DataModel getProdCompaintStatByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("ProductStatSql.getProdCompaintStats", "ProductStatSql.countProdCompaintStat", condition);
    }
	
	public Map doProdCompaintStat(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("ProductStatSql.doProdCompaintStat",condition);
    }
	
	public DataModel getProductTodayByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("ProductStatSql.getProductTodays", "ProductStatSql.countProductToday", condition);
    }
	
	public Map doProductToday(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("ProductStatSql.doProductToday",condition);
    }
}