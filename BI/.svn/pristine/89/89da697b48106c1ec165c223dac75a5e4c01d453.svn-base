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
import org.dom4j.Element;

import com.best1.base.DataModel;
import com.best1.report.common.ReportCommonDefine;
import com.best1.report.db.ChannelStatDao;
import com.best1.report.service.ChannelStatService;
import com.best1.service.LoggingService;
import com.best1.base.BusiException;
import com.best1.base.BaseServiceImpl;
import com.best1.base.common.SystemCommonDefine;
import com.best1.core.XMLUtil;
import com.best1.domain.UserInfo;

public class ChannelStatServiceImpl extends BaseServiceImpl implements ChannelStatService{
	private ChannelStatDao channelStatDao;
	private LoggingService loggingService;
	
	public DataModel getChannelAreaStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){//只有点击查询按钮时才执行存储过程并记录日志，分页时不记录日志
				Map map = channelStatDao.doChannelAreaStat(paramMap);
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
			DataModel resData = channelStatDao.getChannelAreaStatByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getChannelOrderStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = channelStatDao.doChannelOrderStat(paramMap);
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
			DataModel resData = channelStatDao.getChannelOrderStatByPage(paramMap);
			HashMap chartXML = new HashMap();
			chartXML.put("orderamoutChart", getChannelOrderStatByOrderAmoutXML(resData));
			chartXML.put("maoliChart", getChannelOrderStatByMaoliXML(resData));
			resData.setChartXML(chartXML);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public String getChannelOrderStatByOrderAmoutXML(DataModel resData){
		List list = resData.getRows();
		if(list != null && list.size() > 0){
			XMLUtil xml = new XMLUtil();
			//头部信息生成
			Element chart = xml.addRoot("chart");  
	        xml.addAttribute(chart, "caption", "各通路订单金额");
	        xml.addAttribute(chart, "formatnumberscale", "0");
	        java.util.HashMap map = null;
	        for(int i=0;i<list.size(); i++){
	        	map = (java.util.HashMap)list.get(i);
	        	Element element = xml.addNode(chart, "set");
	        	element.addAttribute("label",map.get("subchannelname").toString());
	        	element.addAttribute("value",map.get("orderamout").toString());
	        }
	        return xml.getXML();
		}
        return "";
	}
	
	public String getChannelOrderStatByMaoliXML(DataModel resData){
		List list = resData.getRows();
		if(list != null && list.size() > 0){
			XMLUtil xml = new XMLUtil();
			//头部信息生成
			Element chart = xml.addRoot("chart");  
	        xml.addAttribute(chart, "caption", "各通路毛利情况");
	        xml.addAttribute(chart, "formatnumberscale", "0");
	        java.util.HashMap map = null;
	        for(int i=0;i<list.size(); i++){
	        	map = (java.util.HashMap)list.get(i);
	        	Element element = xml.addNode(chart, "set");
	        	element.addAttribute("label",map.get("subchannelname").toString());
	        	element.addAttribute("value",map.get("maoli").toString());
	        }
	        return xml.getXML();
		}
        return "";
	}
	
	public DataModel getSpProgramStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = channelStatDao.doSpProgramStat(paramMap);
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
			DataModel resData = channelStatDao.getSpProgramStatByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getPgMorderStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = channelStatDao.doPgMorderStat(paramMap);
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
			DataModel resData = channelStatDao.getPgMorderStatByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getAreaChannelStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = channelStatDao.doAreaChannelStat(paramMap);
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
			DataModel resData = channelStatDao.getAreaChannelStatByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getAreaStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = channelStatDao.doAreaStat(paramMap);
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
			DataModel resData = channelStatDao.getAreaStatByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getTimeOrderStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = channelStatDao.doTimeOrderStat(paramMap);
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
			DataModel resData = channelStatDao.getTimeOrderStatByPage(paramMap);
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
		String path = ServletActionContext.getRequest().getRealPath(ReportCommonDefine.CHANNELSTAT_FILEPATH);
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

	public ChannelStatDao getChannelStatDao() {
		return channelStatDao;
	}

	public void setChannelStatDao(ChannelStatDao channelStatDao) {
		this.channelStatDao = channelStatDao;
	}

	public LoggingService getLoggingService() {
		return loggingService;
	}

	public void setLoggingService(LoggingService loggingService) {
		this.loggingService = loggingService;
	}

}
