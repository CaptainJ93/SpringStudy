package com.best1.report.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.best1.base.BaseAction;
import com.best1.base.DataModel;
import com.best1.domain.UserInfo;
import com.best1.report.domain.ExportAudit;
import com.best1.report.service.ExportAuditService;

public class ExportAuditAction extends BaseAction {
	private ExportAuditService exportAuditService;
	
	public String list() throws Exception {
		//审核人只能查询当前属于自己的待审核记录
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		UserInfo user = (UserInfo)session.getAttribute("user");
		paramMap.put("exportUserid", user.getUserid());
		if(paramMap.get("status") != null && !"".equals(paramMap.get("status")) && "97".equals(paramMap.get("status"))){//97待审核状态
			paramMap.remove("status");
			paramMap.put("notstatus", new String[]{"98","99"});//98审核不通过 99审核通过
		}
		DataModel resData = exportAuditService.getExportAuditByPage(paramMap);
		commonOutPrint(resData);
		return null;
	}
	
	public String auditlist() throws Exception {
		//审核人只能查询当前属于自己的待审核记录
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		UserInfo user = (UserInfo)session.getAttribute("user");
		paramMap.put("departmentId", user.getDepartmentid());
		paramMap.put("notstatus", new String[]{"98","99"});//98审核不通过 99审核通过
		DataModel resData = exportAuditService.getExportAuditByPage(paramMap);
		commonOutPrint(resData);
		return null;
	}
	
	//审核
	public String audit() throws Exception {
		DataModel resData = exportAuditService.updateExportAudit(paramMap);
		commonOutPrint(resData);
		return null;
	}
	//下载excel
	public String download() throws Exception {
		ExportAudit obj = (ExportAudit) exportAuditService.getExportAuditObj(paramMap).getRows().get(0);
//		paramMap.put("fileName", obj.getExportPath()+obj.getExportFileName());
		commonDownloadExcel(obj);
		return null;
	}
	
	public ExportAuditService getExportAuditService() {
		return exportAuditService;
	}

	public void setExportAuditService(ExportAuditService exportAuditService) {
		this.exportAuditService = exportAuditService;
	}
}