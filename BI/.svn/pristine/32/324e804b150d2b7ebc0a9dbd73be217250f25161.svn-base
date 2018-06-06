package com.best1.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.struts2.ServletActionContext;
import com.best1.base.BaseAction;
import com.best1.base.DataModel;
import com.best1.base.common.CommonDefine;
import com.best1.domain.UserInfo;
import com.best1.report.common.ReportCommonDefine;
import com.best1.report.domain.FilePathCof;
import com.best1.report.service.ExportAuditService;
import com.best1.report.service.QueryService;
import com.best1.service.TemplateService;

public class TemplateAction extends BaseAction {
	private TemplateService templateService;
	private QueryService queryService;
	private ExportAuditService exportAuditService;
	private UserInfo userInfo;

	
	public String list() throws Exception {
		DataModel resData = templateService.getUserInfoByPage(paramMap);
		if ("excel".equals(paramMap.get("export"))) {
			commonOutExcel(resData);
			//文件导出到服务器，同时在TB_BEST1_EXPORT_AUDIT表插入审批记录
			//commonOutExcelToServer(resData,"template/file/");
//			resData = new DataModel();
//			resData.setErrCode("1");
//			resData.setErrMsg("导出数据量不能大于:"+CommonDefine.EXCEL_MAX_NUM);
//			commonOutPrint(resData);
		} else {
			commonOutPrint(resData);
		}
		return null;
	}
	
	public String exportFile() throws Exception {
		dealGarbled();
		DataModel resData = new DataModel();
		if("0".equals(paramMap.get("exportAction"))){//查询导出的数据量
			resData = templateService.getRecords(paramMap);
			if(Integer.parseInt(resData.getValue()) > CommonDefine.EXCEL_MAX_NUM){
				resData.setErrCode("1");
				resData.setErrMsg("导出数据量不能大于:"+CommonDefine.EXCEL_MAX_NUM+"条");
				commonOutPrint(resData);
				return null;
			}
			if(paramMap.get("sensitiveData") != null && !"".equals(paramMap.get("sensitiveData"))){
				List list = queryService.getFilePathCof(ReportCommonDefine.TEMPLATE_EXPORT_CODE).getRows();
				if(list.size() == 0){
					resData.setErrCode("1");
					resData.setErrMsg("未配置文件导出路径，请联系系统管理员!");
					commonOutPrint(resData);
					return null;
				}else if(list.size() > 1){
					resData.setErrCode("1");
					resData.setErrMsg("该业务配置了多个文件导出路径，请联系系统管理员!");
					commonOutPrint(resData);
					return null;
				}
				FilePathCof filePathCof = (FilePathCof)list.get(0);
				String filePath = filePathCof.getFilepath();
				
				HttpServletRequest request = ServletActionContext.getRequest();
				HttpSession session = request.getSession();
				UserInfo user = (UserInfo)session.getAttribute("user");
				SimpleDateFormat time=new SimpleDateFormat("yyyyMMddHHmmss"); 
				Date nowTime=new Date(); 
				String fileName = time.format(nowTime)+"-"+user.getUserloginid()+".xls";
				
				//插入文件导出待审批记录
				HashMap map = new HashMap();
				map.put("auditBusiCode", ReportCommonDefine.TEMPLATE_EXPORT_CODE);
				map.put("exportFileName", fileName);
				map.put("exportPath", filePath);
				map.put("sensitiveData", new String(paramMap.get("sensitiveData").toString().getBytes("ISO8859-1"),"UTF-8"));
//				map.put("filepathType", filePathCof.getFilepathType());
//				map.put("hostname", filePathCof.getHostname());
//				map.put("hostPort", filePathCof.getHostPort());
//				map.put("hostUsername", filePathCof.getHostUsername());
//				map.put("hostPassword", filePathCof.getHostPassword());
				resData = exportAuditService.addExportAudit(filePathCof,map);
				if(resData.getErrCode() == "0"){//出错，则删除已经生成的文件
					resData = templateService.getUserInfos(paramMap);
					resData = commonOutExcelToServer(resData,filePathCof,fileName);
				}
				commonOutPrint(resData);
			}
		}else{
			resData = templateService.getUserInfos(paramMap);
			commonOutExcel(resData);//导出到本机
		}
		return null;
	}
	
	/**
	 * 循环paramMap，解决乱码问题
	 * @throws Exception 
	 */
	
	public void dealGarbled() throws Exception{
		Iterator<String> keySetIterator = paramMap.keySet().iterator();
		while (keySetIterator.hasNext()) {
			String key = keySetIterator.next();
			if(paramMap.get(key) != null && paramMap.get(key) instanceof String){
				paramMap.put(key, new String(paramMap.get(key).toString().getBytes("ISO8859-1"),"UTF-8"));
			}
		}

	}

	public String edit() throws Exception {
		DataModel resData = templateService.getTmpUsers(paramMap);
		commonOutPrint(resData);
		return null;
	}

	public String save() throws Exception {
		DataModel resData = new DataModel();
		if (ADD.equals(this.oper)) {
			resData = templateService.addUserInfo(userInfo);
		} else if (EDIT.equals(this.oper)) {
			resData = templateService.updateUserInfo(userInfo);
		}
		commonOutPrint(resData);
		return null;
	}

	public String delete() throws Exception {
		DataModel resData = templateService.deleteUserInfo(paramMap);
		commonOutPrint(resData);
		return null;
	}
	
	public String getReport() throws Exception{
		String dateTime = (new java.text.SimpleDateFormat("HH:mm:ss")).format(new Date());
		Random r = new Random();
		int google = r.nextInt(50);
		int dell = r.nextInt(50);
		int baidu = r.nextInt(80);
//		PrintWriter out = response.getWriter();
//		out.print("&label="+dateTime+"&value="+google+"|"+dell+"|"+baidu+"|");
		commonOutPrint("&label="+dateTime+"&value="+google+"|"+dell+"|"+baidu+"|");
		return null;
	}
	
	public String getTmpUsers() throws Exception{
		DataModel resData = templateService.getTmpUsers(paramMap);
		if ("excel".equals(paramMap.get("export"))) {
			commonOutExcelMergeColumns(resData);
		} else {
			//commonOutPrintForMiniGrid(resData);
			commonOutPrint(resData);
		}
		return null;
	}
	
	public TemplateService getTemplateService() {
		return templateService;
	}

	public void setTemplateService(TemplateService templateService) {
		this.templateService = templateService;
	}

	public QueryService getQueryService() {
		return queryService;
	}

	public void setQueryService(QueryService queryService) {
		this.queryService = queryService;
	}

	public ExportAuditService getExportAuditService() {
		return exportAuditService;
	}

	public void setExportAuditService(ExportAuditService exportAuditService) {
		this.exportAuditService = exportAuditService;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

}