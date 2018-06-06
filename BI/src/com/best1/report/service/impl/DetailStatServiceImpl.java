package com.best1.report.service.impl;

import java.io.File;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import jxl.Sheet;
import jxl.Workbook;
import org.apache.struts2.ServletActionContext;
import com.best1.base.DataModel;
import com.best1.report.common.ReportCommonDefine;
import com.best1.report.db.DetailStatDao;
import com.best1.report.domain.FilePathCof;
import com.best1.report.service.DetailStatService;
import com.best1.report.service.ExportAuditService;
import com.best1.report.service.QueryService;
import com.best1.service.LoggingService;
import com.best1.base.BusiException;
import com.best1.base.BaseServiceImpl;
import com.best1.base.common.SystemCommonDefine;
import com.best1.domain.UserInfo;

public class DetailStatServiceImpl extends BaseServiceImpl implements DetailStatService{
	private DetailStatDao detailStatDao;
	private LoggingService loggingService;
	private QueryService queryService;
	private ExportAuditService exportAuditService;
	
	public DataModel getReturnResonStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = detailStatDao.doReturnResonStat(paramMap);
				if(ReportCommonDefine.PROCEDURE_RESULTCODE_1 == (Integer)map.get("resultcode")){
					DataModel resData = new DataModel();
					resData.setErrCode(ReportCommonDefine.PROCEDURE_RESULTCODE_1+"");
					resData.setErrMsg(map.get("errmesg").toString());
					return resData;
				}
				paramMap.put("sql", map.get("sql"));
				paramMap.put("logType", SystemCommonDefine.BUSI_LOG_TYPE_10);
				loggingService.addLoggingInfo(paramMap);
			}
			DataModel resData = detailStatDao.getReturnResonStatByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getReturnResonStatRecords(HashMap paramMap) throws BusiException {
		try {
			return detailStatDao.getReturnResonStatRecords(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getReturnResonStats(HashMap paramMap) throws BusiException {
		try {
			DataModel resData = detailStatDao.getReturnResonStats(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getComplaintStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = detailStatDao.doComplaintStat(paramMap);
				if(ReportCommonDefine.PROCEDURE_RESULTCODE_1 == (Integer)map.get("resultcode")){
					DataModel resData = new DataModel();
					resData.setErrCode(ReportCommonDefine.PROCEDURE_RESULTCODE_1+"");
					resData.setErrMsg(map.get("errmesg").toString());
					return resData;
				}
				paramMap.put("sql", map.get("sql"));
				paramMap.put("logType", SystemCommonDefine.BUSI_LOG_TYPE_10);
				loggingService.addLoggingInfo(paramMap);
			}
			DataModel resData = detailStatDao.getComplaintStatByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getComplaintStatRecords(HashMap paramMap) throws BusiException {
		try {
			return detailStatDao.getComplaintStatRecords(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getComplaintStats(HashMap paramMap) throws BusiException {
		try {
			DataModel resData = detailStatDao.getComplaintStats(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getCustomerInfoAllOutByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = detailStatDao.doCustomerInfoAllOut(paramMap);
				if(ReportCommonDefine.PROCEDURE_RESULTCODE_1 == (Integer)map.get("resultcode")){
					DataModel resData = new DataModel();
					resData.setErrCode(ReportCommonDefine.PROCEDURE_RESULTCODE_1+"");
					resData.setErrMsg(map.get("errmesg").toString());
					return resData;
				}
				paramMap.put("sql", map.get("sql"));
				paramMap.put("logType", SystemCommonDefine.BUSI_LOG_TYPE_10);
				loggingService.addLoggingInfo(paramMap);
			}
			DataModel resData = detailStatDao.getCustomerInfoAllOutByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getCustomerInfoAllOutRecords(HashMap paramMap) throws BusiException {
		try {
			return detailStatDao.getCustomerInfoAllOutRecords(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getCustomerInfoAllOuts(HashMap paramMap) throws BusiException {
		try {
			DataModel resData = detailStatDao.getCustomerInfoAllOuts(paramMap);
			if(resData.getSql() != null){
				paramMap.put("busiDesc", "会员明细导出");
				paramMap.put("sql", resData.getSql());
				paramMap.put("remark", "");
				paramMap.put("logType", SystemCommonDefine.BUSI_LOG_TYPE_14);//导出
				//删除不需要保存日志的条件参数
				paramMap.remove("membershiplevelname");
				paramMap.remove("customerTypeName");
				paramMap.remove("productClassName");
				paramMap.remove("subchannelName");
				paramMap.remove("orderTypeName");
				paramMap.remove("orderStatusName");
				loggingService.addLoggingInfo(paramMap);
			}
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getOrderDetailAllOutByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = detailStatDao.doOrderDetailAllOut(paramMap);
				if(ReportCommonDefine.PROCEDURE_RESULTCODE_1 == (Integer)map.get("resultcode")){
					DataModel resData = new DataModel();
					resData.setErrCode(ReportCommonDefine.PROCEDURE_RESULTCODE_1+"");
					resData.setErrMsg(map.get("errmesg").toString());
					return resData;
				}
				paramMap.put("sql", map.get("sql"));
				paramMap.put("logType", SystemCommonDefine.BUSI_LOG_TYPE_10);
				loggingService.addLoggingInfo(paramMap);
			}
			DataModel resData = detailStatDao.getOrderDetailAllOutByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getOrderDetailAllOutRecords(HashMap paramMap) throws BusiException {
		try {
			return detailStatDao.getOrderDetailAllOutRecords(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getOrderDetailAllOuts(HashMap paramMap) throws BusiException {
		try {
			DataModel resData = detailStatDao.getOrderDetailAllOuts(paramMap);
			if(resData.getSql() != null){
				paramMap.put("busiDesc", "订单明细导出");
				paramMap.put("sql", resData.getSql());
				paramMap.put("remark", "");
				paramMap.put("logType", SystemCommonDefine.BUSI_LOG_TYPE_14);//导出
				//删除不需要保存日志的条件参数
				paramMap.remove("membershiplevelname");
				paramMap.remove("customerTypeName");
				paramMap.remove("productClassName");
				paramMap.remove("subchannelName");
				paramMap.remove("orderTypeName");
				paramMap.remove("orderStatusName");
				loggingService.addLoggingInfo(paramMap);
			}
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	/**
	 * 敏感数据导出插入审核记录
	 */
	public HashMap addExportAudit(HashMap paramMap) throws Exception {
		HashMap map = new HashMap();
		DataModel resData = new DataModel();
		List list = queryService.getFilePathCof(paramMap.get("auditBusiCode").toString()).getRows();
		if(list.size() == 0){
			resData.setErrCode("1");
			resData.setErrMsg("未配置文件导出路径，请联系系统管理员!");
			map.put("resData", resData);
			return map;
		}else if(list.size() > 1){
			resData.setErrCode("1");
			resData.setErrMsg("该业务配置了多个文件导出路径，请联系系统管理员!");
			map.put("resData", resData);
			return map;
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
		HashMap exportmap = new HashMap();
		exportmap.put("auditBusiCode", paramMap.get("auditBusiCode").toString());
		exportmap.put("exportFileName", fileName);
		exportmap.put("exportPath", filePath);
		exportmap.put("sensitiveData", paramMap.get("sensitiveData").toString());
		exportmap.put("menuName", paramMap.get("menuName").toString());
		resData = exportAuditService.addExportAudit(filePathCof,exportmap);
		map.put("resData", resData);
		map.put("filePathCof", filePathCof);
		map.put("fileName", fileName);
		return map;
	}
	
	/**
	 * 统一对paramMap进行处理
	 * @param paramMap
	 * @return
	 */
	public HashMap setMap(HashMap paramMap){
		UserInfo user = (UserInfo)ServletActionContext.getRequest().getSession().getAttribute("user");
		paramMap.put("userid", user.getUserid());
		paramMap.put("username", user.getUsername());
		paramMap.put("userip", user.getHostip());
		String path = ServletActionContext.getRequest().getRealPath(ReportCommonDefine.DETAILSTAT_FILEPATH);
		String productids = null;
		if(paramMap.get("productid") != null && !"".equals(paramMap.get("productid"))){
			productids = paramMap.get("productid").toString();
		}
		if(paramMap.get("fileName") != null && !"".equals(paramMap.get("fileName"))){
			productids = (productids == null?"":productids+",")+getIdByFileName(path,paramMap.get("fileName").toString());
		}
		paramMap.put("productids", productids);
		
		String createbyids = null;
		if(paramMap.get("createbyid") != null && !"".equals(paramMap.get("createbyid"))){
			createbyids = paramMap.get("createbyid").toString();
		}
		if(paramMap.get("fileOrderCreateName") != null && !"".equals(paramMap.get("fileOrderCreateName"))){
			createbyids = (createbyids == null?"":createbyids+",")+getIdByFileName(path,paramMap.get("fileOrderCreateName").toString());
		}
		paramMap.put("createbyids", createbyids);
		
		String handlebyids = null;
		if(paramMap.get("handlebyid") != null && !"".equals(paramMap.get("handlebyid"))){
			handlebyids = paramMap.get("handlebyid").toString();
		}
		if(paramMap.get("fileOrderHandleName") != null && !"".equals(paramMap.get("fileOrderHandleName"))){
			handlebyids = (handlebyids == null?"":handlebyids+",")+getIdByFileName(path,paramMap.get("fileOrderHandleName").toString());
		}
		paramMap.put("handlebyids", handlebyids);
		return paramMap;
	}
	
	public String getIdByFileName(String path,String fileName){
		StringBuffer result = new StringBuffer();
		List list = read(path + "/" +fileName, 0);
		int i = 0;
		while(i!=list.size()){
			result.append(list.get(i));
			result.append(",");
			i++;
		}
		return result.substring(0, result.length()-1);
	}
	
	public List read(String filepath, int page) {
		List<String> list = new ArrayList<String>();
		try {
			Workbook book = Workbook.getWorkbook(new File(filepath));
			Sheet sheet = book.getSheet(page);
			int rowcnt = sheet.getRows();
			for (int i = 1; i < rowcnt; i++) {
				list.add(sheet.getCell(0, i).getContents().trim());
			}
			book.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public DetailStatDao getDetailStatDao() {
		return detailStatDao;
	}

	public void setDetailStatDao(DetailStatDao detailStatDao) {
		this.detailStatDao = detailStatDao;
	}

	public LoggingService getLoggingService() {
		return loggingService;
	}

	public void setLoggingService(LoggingService loggingService) {
		this.loggingService = loggingService;
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

}
