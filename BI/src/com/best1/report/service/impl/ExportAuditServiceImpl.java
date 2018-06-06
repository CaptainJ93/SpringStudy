package com.best1.report.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.best1.base.DataModel;
import com.best1.report.db.AuditDefineDao;
import com.best1.report.db.ExportAuditDao;
import com.best1.report.domain.AuditDefine;
import com.best1.report.domain.ExportAudit;
import com.best1.report.domain.FilePathCof;
import com.best1.report.service.ExportAuditService;
import com.best1.base.BusiException;
import com.best1.base.BaseServiceImpl;
import com.best1.domain.UserInfo;

public class ExportAuditServiceImpl extends BaseServiceImpl implements ExportAuditService{
	private ExportAuditDao exportAuditDao;
	private AuditDefineDao auditDefineDao;
	
	public DataModel getExportAuditByPage(HashMap paramMap) throws BusiException {
		try {
			DataModel resData = exportAuditDao.getExportAuditByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel addExportAudit(FilePathCof filePathCof,HashMap paramMap) {
		try {
			paramMap.put("filepathType", filePathCof.getFilepathType());
			paramMap.put("hostname", filePathCof.getHostname());
			paramMap.put("hostPort", filePathCof.getHostPort());
			paramMap.put("hostUsername", filePathCof.getHostUsername());
			paramMap.put("hostPassword", filePathCof.getHostPassword());
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			UserInfo user = (UserInfo)session.getAttribute("user");
			long departmentId = user.getDepartmentid();
			paramMap.put("departmentId", departmentId);
			//根据AUDIT_BUSI_CODE和操作员所在的DEPARTMENT_ID查询审批流程 
			DataModel resData = auditDefineDao.getAuditDefines(paramMap);
			List list = resData.getRows();
			if(list.size() == 0){
				resData.setErrCode("1");
				resData.setErrMsg("未配置审核流程，请联系系统管理员！");
			}else if(list.size() > 1){
				resData.setErrCode("1");
				resData.setErrMsg("该业务配置了多个审核流程，请联系系统管理员！");
			}else{
				HashMap map = (HashMap)list.get(0);
				paramMap.put("exportUserid", user.getUserid());
				paramMap.put("status", map.get("busiStatus"));
				paramMap.put("auditId", map.get("auditId"));
				resData = exportAuditDao.insertExportAudit(paramMap);
			}
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel updateExportAudit(HashMap paramMap) {
		try {
			DataModel dataModel = new DataModel();
			String[] exportIds = paramMap.get("exportId").toString().split(",");
			String auditFlag = paramMap.get("auditFlag").toString();//0表示审批通过，1表示审批不通过
			for(int i=0;i<exportIds.length;i++){
				//根据exportid获得对应的当前审核id，即AUDIT_ID
				paramMap.clear();
				paramMap.put("exportId", exportIds[i]);
				ExportAudit obj = (ExportAudit) exportAuditDao.getExportAuditObj(paramMap).getRows().get(0);
				//获得当前审批节点的信息
				paramMap.put("auditId", obj.getAuditId());
				AuditDefine auditDefine = (AuditDefine) auditDefineDao.getAuditDefineObj(paramMap).getRows().get(0);
				if("0".equals(auditFlag)){//审核通过
					//更新TB_BEST1_EXPORT_AUDIT表的状态
					paramMap.put("status", auditDefine.getNextBusiStatus());
					paramMap.put("auditId", auditDefine.getNextAuditId()==-1?"":auditDefine.getNextAuditId());
				}else{//审核不通过
					paramMap.put("status", auditDefine.getFailStatus());
					paramMap.put("auditId", "");
				}
				exportAuditDao.updateExportAudit(paramMap);
				//插入审核流水记录表tb_best1_audit_record
				HttpServletRequest request = ServletActionContext.getRequest();
				HttpSession session = request.getSession();
				UserInfo user = (UserInfo)session.getAttribute("user");
				HashMap condition = new HashMap();
				condition.put("auditor", user.getUserid());
				condition.put("objId", exportIds[i]);
				condition.put("auditStatus", auditFlag);
				condition.put("auditDesc", "0".equals(auditFlag)?"审核通过":"审核不通过");
				dataModel = auditDefineDao.insertAuditRecord(condition);
			}
			return dataModel;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getExportAudits(HashMap paramMap) throws BusiException {
		try {
			return exportAuditDao.getExportAudits(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getExportAuditObj(HashMap paramMap) throws BusiException {
		try {
			return exportAuditDao.getExportAuditObj(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}

	public ExportAuditDao getExportAuditDao() {
		return exportAuditDao;
	}

	public void setExportAuditDao(ExportAuditDao exportAuditDao) {
		this.exportAuditDao = exportAuditDao;
	}

	public AuditDefineDao getAuditDefineDao() {
		return auditDefineDao;
	}

	public void setAuditDefineDao(AuditDefineDao auditDefineDao) {
		this.auditDefineDao = auditDefineDao;
	}
	
	
}
