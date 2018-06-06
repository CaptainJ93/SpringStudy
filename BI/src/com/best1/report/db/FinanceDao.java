package com.best1.report.db;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.best1.base.BaseBO;
import com.best1.base.DataModel;

public class FinanceDao extends BaseBO{

	public DataModel getSaleDetailsByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("FinanceSql.getSaleDetails","FinanceSql.getSaleDetails_count", condition);
    }
	
	
}