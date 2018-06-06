package com.best1.report.db;

import java.sql.SQLException;
import java.util.HashMap;

import com.best1.base.BaseBO;
import com.best1.base.DataModel;

public class ExportAuditDao extends BaseBO{

	public DataModel getExportAuditByPage(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("ExportAuditSql.getExportAudits", "ExportAuditSql.countExportAudit", condition);
    }
	
	public DataModel getExportAudits(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("ExportAuditSql.getExportAudits", condition);
    }
	
	public DataModel insertExportAudit(HashMap condition) throws SQLException {
        return baseDAO.insertSqlStatement("ExportAuditSql.insertExportAudit", condition);
    }
	
	public DataModel updateExportAudit(HashMap condition) throws SQLException {
    	return baseDAO.updateSqlStatement("ExportAuditSql.updateExportAudit", condition);
    }
	
	public DataModel getExportAuditObj(HashMap condition) throws SQLException{
    	return baseDAO.queryForList("ExportAuditSql.getExportAuditObj", condition);
    }
}