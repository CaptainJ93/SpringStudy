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
import com.best1.report.db.CustomerStatDao;
import com.best1.report.service.CustomerStatService;
import com.best1.service.LoggingService;
import com.best1.base.BusiException;
import com.best1.base.BaseServiceImpl;
import com.best1.base.common.SystemCommonDefine;
import com.best1.core.XMLUtil;
import com.best1.domain.UserInfo;

public class CustomerStatServiceImpl extends BaseServiceImpl implements CustomerStatService{
	private CustomerStatDao customerStatDao;
	private LoggingService loggingService;
	
	public DataModel getChannelCustStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = customerStatDao.doChannelCustStat(paramMap);
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
			DataModel resData = customerStatDao.getChannelCustStatByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getProductCustStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = customerStatDao.doProductCustStat(paramMap);
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
			DataModel resData = customerStatDao.getProductCustStatByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getCampainCustStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = customerStatDao.doCampainCustStat(paramMap);
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
			DataModel resData = customerStatDao.getCampainCustStatByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getBuytimeCustStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = customerStatDao.doBuytimeCustStat(paramMap);
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
			DataModel resData = customerStatDao.getBuytimeCustStatByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getAreaCustStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = customerStatDao.doAreaCustStat(paramMap);
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
			DataModel resData = customerStatDao.getAreaCustStatByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getAgeCustStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = customerStatDao.doAgeCustStat(paramMap);
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
			DataModel resData = customerStatDao.getAgeCustStatByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getGendarCustStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = customerStatDao.doGendarCustStat(paramMap);
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
			DataModel resData = customerStatDao.getGendarCustStatByPage(paramMap);
			HashMap chartXML = new HashMap();
			chartXML.put("gendarCustStatChart", getGendarCustStatXML(resData));
			resData.setChartXML(chartXML);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public String getGendarCustStatXML(DataModel resData){
		List list = resData.getRows();
		if(list != null && list.size() > 0){
			XMLUtil xml = new XMLUtil();
			//头部信息生成
			Element chart = xml.addRoot("chart");  
	        xml.addAttribute(chart, "caption", "性别-会员数");
	        xml.addAttribute(chart, "formatnumberscale", "0");
	        java.util.HashMap map = null;
	        for(int i=0;i<list.size(); i++){
	        	map = (java.util.HashMap)list.get(i);
	        	if(!"总计".equals(map.get("gender"))){
	        		Element element = xml.addNode(chart, "set");
		        	element.addAttribute("label",map.get("gender").toString());
		        	element.addAttribute("value",map.get("customercount").toString());
	        	}
	        }
	        return xml.getXML();
		}
        return "";
	}
	
	public DataModel getMemberLevelCustStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = customerStatDao.doMemberLevelCustStat(paramMap);
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
			DataModel resData = customerStatDao.getMemberLevelCustStatByPage(paramMap);
			HashMap chartXML = new HashMap();
			chartXML.put("memberLevelCustStatChart", getMemberLevelCustStatXML(resData));
			resData.setChartXML(chartXML);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public String getMemberLevelCustStatXML(DataModel resData){
		List list = resData.getRows();
		if(list != null && list.size() > 0){
			XMLUtil xml = new XMLUtil();
			//头部信息生成
			Element chart = xml.addRoot("chart");  
	        xml.addAttribute(chart, "caption", "会员等级-会员数");
	        xml.addAttribute(chart, "formatnumberscale", "0");
	        java.util.HashMap map = null;
	        for(int i=0;i<list.size(); i++){
	        	map = (java.util.HashMap)list.get(i);
	        	Element element = xml.addNode(chart, "set");
	        	element.addAttribute("label",map.get("membershiplevelname").toString());
	        	element.addAttribute("value",map.get("customercount").toString());
	        }
	        return xml.getXML();
		}
        return "";
	}
	
	public DataModel getCreatebyCustStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = customerStatDao.doCreatebyCustStat(paramMap);
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
			DataModel resData = customerStatDao.getCreatebyCustStatByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getSourceChannelCustStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = customerStatDao.doSourceChannelCustStat(paramMap);
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
			DataModel resData = customerStatDao.getSourceChannelCustStatByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getActiveCustStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = customerStatDao.doActiveCustStat(paramMap);
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
			DataModel resData = customerStatDao.getActiveCustStatByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getCustDevelopStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = customerStatDao.doCustDevelopStat(paramMap);
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
			DataModel resData = customerStatDao.getCustDevelopStatByPage(paramMap);
			HashMap chartXML = new HashMap();
			chartXML.put("chartXML", getCustDevelopStatXML(resData));
			resData.setChartXML(chartXML);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public String getCustDevelopStatXML(DataModel resData){
		List list = resData.getRows();
		if(list != null && list.size() > 0){
			XMLUtil xml = new XMLUtil();
			//头部信息生成
			Element chart = xml.addRoot("chart");  
			xml.addAttribute(chart, "palette", "3");  
	        xml.addAttribute(chart, "caption", "会员发展情况");
	        xml.addAttribute(chart, "showvalues", "0");
	        xml.addAttribute(chart, "divlinedecimalprecision", "1");
	        xml.addAttribute(chart, "limitsdecimalprecision", "1");
	        xml.addAttribute(chart, "xaxisname", "时间轴");
	        xml.addAttribute(chart, "yaxisname", "会员数");
	        xml.addAttribute(chart, "formatnumberscale", "10");
	        xml.addAttribute(chart, "numvisibleplot", "20");//设置初始区域内展现X条数据
	        xml.addAttribute(chart, "bgAlpha", "0");
	        xml.addAttribute(chart, "showBorder", "0");
	        xml.addAttribute(chart, "scrollToEnd", "1");
	        xml.addAttribute(chart, "labelDisplay", "ROTATE");  
	        xml.addAttribute(chart, "slantLabels", "1");  //labelDisplay和slantLabels配合设置X轴的value斜45°显示
	        
	        //节点信息生成
	        Element categories = xml.addNode(chart, "categories");
	        Element addedcustomercnt = xml.addNode(chart, "dataset");
	        addedcustomercnt.setAttributeValue("seriesname", "新增数");
	        
	        Element lapsedcustomercnt = xml.addNode(chart, "dataset");
	        lapsedcustomercnt.setAttributeValue("seriesname", "流失数");
	        
	        Element activecustomercnt = xml.addNode(chart, "dataset");
	        activecustomercnt.setAttributeValue("seriesname", "活跃数");
	        
	        Element avgdailyaddedcustcnt = xml.addNode(chart, "dataset");
	        avgdailyaddedcustcnt.setAttributeValue("seriesname", "平均每日会员新增数");
	        
	        Element avgdailylapsedcustcnt = xml.addNode(chart, "dataset");
	        avgdailylapsedcustcnt.setAttributeValue("seriesname", "平均每日会员流失数");
	        
	        java.util.HashMap map = null;
	        Element setAddedcustomercnt = null;
	        Element setLapsedcustomercnt = null;
	        Element setActivecustomercnt = null;
	        Element setAvgdailyaddedcustcnt = null;
	        Element setAvgdailylapsedcustcnt = null;
	        
	        for(int i=0;i<list.size(); i++){
	        	map = (java.util.HashMap)list.get(i);
	        	Element category = xml.addNode(categories, "category");
	        	category.addAttribute("label", map.get("time").toString());
	        	setAddedcustomercnt = xml.addNode(addedcustomercnt, "set");
	        	setAddedcustomercnt.addAttribute("value", map.get("addedcustomercnt").toString());
	        	
	        	setLapsedcustomercnt = xml.addNode(lapsedcustomercnt, "set");
	        	setLapsedcustomercnt.addAttribute("value", map.get("lapsedcustomercnt").toString());
	        	
	        	setActivecustomercnt = xml.addNode(activecustomercnt, "set");
	        	setActivecustomercnt.addAttribute("value", map.get("activecustomercnt").toString());
	        	
	        	setAvgdailyaddedcustcnt = xml.addNode(avgdailyaddedcustcnt, "set");
	        	setAvgdailyaddedcustcnt.addAttribute("value", map.get("avgdailyaddedcustcnt").toString());
	        	
	        	setAvgdailylapsedcustcnt = xml.addNode(avgdailylapsedcustcnt, "set");
	        	setAvgdailylapsedcustcnt.addAttribute("value", map.get("avgdailylapsedcustcnt").toString());
	        }
	        return xml.getXML();
		}
        return "";
	}
	
	public DataModel getProductComplaintByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = customerStatDao.doProductComplaint(paramMap);
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
			DataModel resData = customerStatDao.getProductComplaintByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getComplaintResStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = customerStatDao.doComplaintResStat(paramMap);
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
			DataModel resData = customerStatDao.getComplaintResStatByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getProdCompaintStat2ByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = customerStatDao.doProdCompaintStat2(paramMap);
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
			DataModel resData = customerStatDao.getProdCompaintStat2ByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getProdCompaintStat2Records(HashMap paramMap) throws BusiException {
		try {
			return customerStatDao.getProdCompaintStat2Records(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getProdCompaintStat2s(HashMap paramMap) throws BusiException {
		try {
			DataModel resData = customerStatDao.getProdCompaintStat2s(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getCreatebyComplaintStatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = customerStatDao.doCreatebyComplaintStat(paramMap);
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
			DataModel resData = customerStatDao.getCreatebyComplaintStatByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getSpcomplaintstatByPage(HashMap paramMap) throws BusiException {
		try {
			paramMap = setMap(paramMap);
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = customerStatDao.doSpcomplaintstat(paramMap);
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
			DataModel resData = customerStatDao.getSpcomplaintstatByPage(paramMap);
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
		String path = ServletActionContext.getRequest().getRealPath(ReportCommonDefine.CUSTOMERSTAT_FILEPATH);
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

	public CustomerStatDao getCustomerStatDao() {
		return customerStatDao;
	}

	public void setCustomerStatDao(CustomerStatDao customerStatDao) {
		this.customerStatDao = customerStatDao;
	}

	public LoggingService getLoggingService() {
		return loggingService;
	}

	public void setLoggingService(LoggingService loggingService) {
		this.loggingService = loggingService;
	}
}
