package com.best1.report.db;

import java.sql.SQLException;
import java.util.HashMap;

import com.best1.base.BaseBO;
import com.best1.base.DataModel;

public class QueryDao extends BaseBO{
	//查询文件导出路径
	public DataModel getFilePathCof(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("QuerySql.getFilePathCofs", condition);
    }
	
	//会员等级查询
	public DataModel getMemberShipLevel(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("QuerySql.getMemberShipLevel", condition);
    }
	
	//tcmn_domaindata通用查询
	public DataModel getDomainData(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("QuerySql.getDomainData", condition);
    }
	
	//商品大、中、小类
	public DataModel getProductClass(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("QuerySql.getProductClass", condition);
    }
	
	//查询通路
	public DataModel getSubchannel(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("QuerySql.getSubchannel", condition);
    }
	
	//客诉主因
	public DataModel getComplaintCategory(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("QuerySql.getComplaintCategory", condition);
    }
	
	//地区
	public DataModel getAreaZipCode(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("QuerySql.getAreaZipCodes", condition);
    }
	
	//地区
	public DataModel getCityCode(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("QuerySql.getCityCodes", condition);
    }
	
}