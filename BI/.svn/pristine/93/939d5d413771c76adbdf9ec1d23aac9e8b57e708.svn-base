package com.best1.report.service.impl;

import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jxl.Sheet;
import jxl.Workbook;
import org.apache.struts2.ServletActionContext;
import com.best1.base.DataModel;
import com.best1.report.common.ReportCommonDefine;
import com.best1.report.db.CampainStatDao;
import com.best1.report.service.CampainStatService;
import com.best1.service.LoggingService;
import com.best1.base.BusiException;
import com.best1.base.BaseServiceImpl;
import com.best1.base.common.SystemCommonDefine;
import com.best1.domain.UserInfo;

public class CampainStatServiceImpl extends BaseServiceImpl implements CampainStatService{
	private CampainStatDao campainStatDao;
	private LoggingService loggingService;
	
	public DataModel getCampainStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = campainStatDao.doCampainStat(paramMap);
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
			DataModel resData = campainStatDao.getCampainStatByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
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
		String path = ServletActionContext.getRequest().getRealPath(ReportCommonDefine.CAMPAINSTAT_FILEPATH);
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


	public CampainStatDao getCampainStatDao() {
		return campainStatDao;
	}

	public void setCampainStatDao(CampainStatDao campainStatDao) {
		this.campainStatDao = campainStatDao;
	}

	public LoggingService getLoggingService() {
		return loggingService;
	}

	public void setLoggingService(LoggingService loggingService) {
		this.loggingService = loggingService;
	}

}
