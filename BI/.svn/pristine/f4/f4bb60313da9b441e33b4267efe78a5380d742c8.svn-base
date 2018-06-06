package com.best1.report.db;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.best1.base.BaseBO;
import com.best1.base.DataModel;

public class DetailStatDao extends BaseBO{

	public DataModel getReturnResonStatByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("DetailStatSql.getReturnResonStats", "DetailStatSql.countReturnResonStat", condition);
    }
	
	public Map doReturnResonStat(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("DetailStatSql.doReturnResonStat",condition);
    }
	
	public DataModel getReturnResonStatRecords(HashMap condition) throws SQLException{
    	return baseDAO.queryForValue("DetailStatSql.countReturnResonStat", condition);
    }
	
	public DataModel getReturnResonStats(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("DetailStatSql.getReturnResonStats", condition);
    }
	
	public DataModel getComplaintStatByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("DetailStatSql.getComplaintStats", "DetailStatSql.countComplaintStat", condition);
    }
	
	public Map doComplaintStat(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("DetailStatSql.doComplaintStat",condition);
    }
	
	public DataModel getComplaintStatRecords(HashMap condition) throws SQLException{
    	return baseDAO.queryForValue("DetailStatSql.countComplaintStat", condition);
    }
	
	public DataModel getComplaintStats(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("DetailStatSql.getComplaintStats", condition);
    }
	
	public DataModel getCustomerInfoAllOutByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("DetailStatSql.getCustomerInfoAllOuts", "DetailStatSql.countCustomerInfoAllOut", condition);
    }
	
	public Map doCustomerInfoAllOut(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("DetailStatSql.doCustomerInfoAllOut",condition);
    }
	
	public DataModel getCustomerInfoAllOutRecords(HashMap condition) throws SQLException{
    	return baseDAO.queryForValue("DetailStatSql.countCustomerInfoAllOut", condition);
    }
	
	public DataModel getCustomerInfoAllOuts(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("DetailStatSql.getCustomerInfoAllOuts", condition);
    }
	
	public DataModel getOrderDetailAllOutByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("DetailStatSql.getOrderDetailAllOuts", "DetailStatSql.countOrderDetailAllOut", condition);
    }
	
	public Map doOrderDetailAllOut(HashMap condition) throws SQLException{
    	return baseDAO.procedureSqlStatement("DetailStatSql.doOrderDetailAllOut",condition);
    }
	
	public DataModel getOrderDetailAllOutRecords(HashMap condition) throws SQLException{
    	return baseDAO.queryForValue("DetailStatSql.countOrderDetailAllOut", condition);
    }
	
	public DataModel getOrderDetailAllOuts(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("DetailStatSql.getOrderDetailAllOuts", condition);
    }
}