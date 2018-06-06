package com.best1.report.db;

import java.sql.SQLException;
import java.util.HashMap;
import com.best1.base.BaseBO;
import com.best1.base.DataModel;

public class AuditDefineDao extends BaseBO{
	
	public DataModel getAuditDefines(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("AuditDefineSql.getAuditDefines", condition);
    }
	
	public DataModel getAuditDefineObj(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("AuditDefineSql.getAuditDefineObj", condition);
    }
	
	public DataModel insertAuditRecord(HashMap condition) throws SQLException {
        return baseDAO.insertSqlStatement("AuditDefineSql.insertAuditRecord", condition);
    }
}