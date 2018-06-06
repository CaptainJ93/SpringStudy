package com.best1.report.service.impl;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.dom4j.Element;
import com.best1.base.DataModel;
import com.best1.report.common.ReportCommonDefine;
import com.best1.report.db.SummaryStatDao;
import com.best1.report.domain.DailyStatistic;
import com.best1.report.domain.ProductinfoToday;
import com.best1.report.service.SummaryStatService;
import com.best1.service.LoggingService;
import com.best1.util.DataUtil;
import com.best1.base.BusiException;
import com.best1.base.BaseServiceImpl;
import com.best1.core.XMLUtil;
import com.best1.domain.UserInfo;

public class SummaryStatServiceImpl extends BaseServiceImpl implements SummaryStatService{
	private SummaryStatDao summaryStatDao;
	private LoggingService loggingService;
	
	public String getDailyStatisticByPage(HashMap paramMap) throws Exception {
		try {
			DataModel resData = summaryStatDao.getDailyStatisticByPage(paramMap);
			List<DailyStatistic> list = resData.getRows();
			HashMap map = new HashMap();
			for(DailyStatistic obj:list){
				map.put(obj.getSaledate(), obj);
			}
			List timeList = new ArrayList();
			if("10".equals(paramMap.get("statCycle"))){
				timeList = DataUtil.getDays(paramMap.get("startTime").toString(), paramMap.get("endTime").toString());
			}else if("11".equals(paramMap.get("statCycle"))){
				timeList = DataUtil.getMonths(paramMap.get("startTime").toString(), paramMap.get("endTime").toString());
			}else{
				timeList = DataUtil.getYears(paramMap.get("startTime").toString(), paramMap.get("endTime").toString());
			}
			return getDailyStatisticXML(timeList,map);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public String getDailyStatisticXML(List timeList,HashMap map) throws IOException{
		XMLUtil xml = new XMLUtil();
		//头部信息生成
		Element chart = xml.addRoot("chart");  
		xml.addAttribute(chart, "palette", "2");  
        xml.addAttribute(chart, "caption", "业绩统计");
        xml.addAttribute(chart, "showvalues", "0");
        xml.addAttribute(chart, "divlinedecimalprecision", "1");
        xml.addAttribute(chart, "limitsdecimalprecision", "1");
        xml.addAttribute(chart, "pyaxisname", "订单金额(元)");
        xml.addAttribute(chart, "syaxisname", "订单数量(件)");
        xml.addAttribute(chart, "numberprefix", "￥");
        xml.addAttribute(chart, "formatnumberscale", "0");
        xml.addAttribute(chart, "numvisibleplot", "20");//设置初始区域内展现X条数据
        xml.addAttribute(chart, "bgAlpha", "0");
        xml.addAttribute(chart, "showBorder", "0");
        xml.addAttribute(chart, "scrollToEnd", "1");
        xml.addAttribute(chart, "labelDisplay", "ROTATE");  
        xml.addAttribute(chart, "slantLabels", "1");  //labelDisplay和slantLabels配合设置X轴的value斜45°显示
        
        //节点信息生成
        Element categories = xml.addNode(chart, "categories");
        Element datasetAmount = xml.addNode(chart, "dataset");
        datasetAmount.setAttributeValue("seriesname", "有效订单金额");
        
        Element datasetMaoli = xml.addNode(chart, "dataset");
        datasetMaoli.setAttributeValue("seriesname", "毛利额");
        
        Element datasetTimes = xml.addNode(chart, "dataset");
        datasetTimes.setAttributeValue("seriesname", "有效订单数");
        datasetTimes.setAttributeValue("parentyaxis", "S");
        datasetTimes.setAttributeValue("linethickness", "3");
        
        String day = "";
        Element setAmount = null;
        Element setMaoli = null;
        Element setTimes = null;
        for(int i=0;i<timeList.size(); i++){
        	day = (String)timeList.get(i);
        	Element category = xml.addNode(categories, "category");
        	category.addAttribute("label", day);
        	setAmount = xml.addNode(datasetAmount, "set");
        	setMaoli = xml.addNode(datasetMaoli, "set");
        	setTimes = xml.addNode(datasetTimes, "set");
        	if(map.get(day) != null){
        		setAmount.addAttribute("value", ((DailyStatistic)map.get(day)).getValidorderamount().toString());
        		setMaoli.addAttribute("value", ((DailyStatistic)map.get(day)).getMaolisum().toString());
        		setTimes.addAttribute("value", ((DailyStatistic)map.get(day)).getValidordertimes().toString());
        	}else{
        		setAmount.addAttribute("value", "0");
        		setMaoli.addAttribute("value", "0");
        		setTimes.addAttribute("value", "0");
        	}
        }
        return xml.getXML();
	}
	
	public DataModel getTimeOrderListByPage(HashMap paramMap) throws Exception {
		try {
			UserInfo user = (UserInfo)ServletActionContext.getRequest().getSession().getAttribute("user");
			paramMap.put("userid", user.getUserid());
			paramMap.put("username", user.getUsername());
			paramMap.put("userip", user.getHostip());
			DataModel resData = summaryStatDao.getTimeOrderList(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public String getTimeOrderXml(HashMap paramMap) throws Exception {
		try {
			UserInfo user = (UserInfo)ServletActionContext.getRequest().getSession().getAttribute("user");
			paramMap.put("userid", user.getUserid());
			paramMap.put("username", user.getUsername());
			paramMap.put("userip", user.getHostip());
			
			summaryStatDao.doTimeOrder(paramMap);
			
			DataModel resData = summaryStatDao.getTimeOrderXml(paramMap);
			List<HashMap> list = resData.getRows();
			HashMap map = new HashMap();
			for(HashMap obj:list){
				map.put(obj.get("orderdate"), obj);
			}
			List timeList = new ArrayList();
			if("3".equals(paramMap.get("statCycle"))){
				timeList = DataUtil.getDays(paramMap.get("orderStartTime").toString(), paramMap.get("orderEndTime").toString());
			}else if("2".equals(paramMap.get("statCycle"))){
				timeList = DataUtil.getMonths(paramMap.get("orderStartTime").toString(), paramMap.get("orderEndTime").toString());
			}else if("4".equals(paramMap.get("statCycle"))){
				timeList = new ArrayList(Arrays.asList("00","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23"));
			}else{
				timeList = DataUtil.getYears(paramMap.get("orderStartTime").toString(), paramMap.get("orderEndTime").toString());
			}
			return getTimeOrderStatXML(timeList,map);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public String getTimeOrderStatXML(List timeList,HashMap map) throws IOException{
		XMLUtil xml = new XMLUtil();
		//头部信息生成
		Element chart = xml.addRoot("chart");  
		xml.addAttribute(chart, "palette", "2");  
        xml.addAttribute(chart, "caption", "业绩统计");
        xml.addAttribute(chart, "showvalues", "0");
        xml.addAttribute(chart, "divlinedecimalprecision", "1");
        xml.addAttribute(chart, "limitsdecimalprecision", "1");
        xml.addAttribute(chart, "pyaxisname", "金额(元)");
        xml.addAttribute(chart, "syaxisname", "同比(%)");
        xml.addAttribute(chart, "numberprefix", "￥");
        xml.addAttribute(chart, "formatnumberscale", "0");
        xml.addAttribute(chart, "numvisibleplot", "20");//设置初始区域内展现X条数据
        xml.addAttribute(chart, "bgAlpha", "0");
        xml.addAttribute(chart, "showBorder", "0");
        xml.addAttribute(chart, "scrollToEnd", "1");
        xml.addAttribute(chart, "labelDisplay", "ROTATE");  
        xml.addAttribute(chart, "slantLabels", "1");  //labelDisplay和slantLabels配合设置X轴的value斜45°显示
        
        //节点信息生成
        Element categories = xml.addNode(chart, "categories");
        Element datasetAmount = xml.addNode(chart, "dataset");
        datasetAmount.setAttributeValue("seriesname", "有效订单金额");
        
        Element datasetMaoli = xml.addNode(chart, "dataset");
        datasetMaoli.setAttributeValue("seriesname", "毛利额");
        
        Element datasetAmountbianhualv = xml.addNode(chart, "dataset");
        datasetAmountbianhualv.setAttributeValue("seriesname", "业绩同比增长率");
        datasetAmountbianhualv.setAttributeValue("parentyaxis", "S");
        datasetAmountbianhualv.setAttributeValue("linethickness", "3");
        
        Element datasetMaolibianhualv = xml.addNode(chart, "dataset");
        datasetMaolibianhualv.setAttributeValue("seriesname", "毛利同比增长率");
        datasetMaolibianhualv.setAttributeValue("parentyaxis", "S");
        datasetMaolibianhualv.setAttributeValue("linethickness", "3");
        
        Element datasetTongbi = xml.addNode(chart, "dataset");
        datasetTongbi.setAttributeValue("seriesname", "基线(0%)");
        datasetTongbi.setAttributeValue("parentyaxis", "S");
        datasetTongbi.setAttributeValue("linethickness", "1");
        datasetTongbi.setAttributeValue("dashed", "1");
        datasetTongbi.setAttributeValue("anchorRadius", "0");
        datasetTongbi.setAttributeValue("color", "FF0000");
        
        String day = "";
        Element setAmount = null;
        Element setMaoli = null;
        Element setAmountbianhualv = null;
        Element setMaolibianhualv = null;
        Element setTongbi = null;
        for(int i=0;i<timeList.size(); i++){
        	day = (String)timeList.get(i);
        	Element category = xml.addNode(categories, "category");
        	category.addAttribute("label", day);
        	setAmount = xml.addNode(datasetAmount, "set");
        	setMaoli = xml.addNode(datasetMaoli, "set");
        	setAmountbianhualv = xml.addNode(datasetAmountbianhualv, "set");
        	setMaolibianhualv = xml.addNode(datasetMaolibianhualv, "set");
        	setTongbi = xml.addNode(datasetTongbi, "set");
        	if(map.get(day) != null){
        		setAmount.addAttribute("value", ((HashMap)map.get(day)).get("orderamout").toString());
        		setMaoli.addAttribute("value", ((HashMap)map.get(day)).get("maoli").toString());
        		setAmountbianhualv.addAttribute("value", ((HashMap)map.get(day)).get("amountbianhualv").toString());
        		setMaolibianhualv.addAttribute("value", ((HashMap)map.get(day)).get("maolibianhualv").toString());
        		setTongbi.addAttribute("value", "0");
        	}else{
        		setAmount.addAttribute("value", "0");
        		setMaoli.addAttribute("value", "0");
        		setAmountbianhualv.addAttribute("value", "0");
        		setMaolibianhualv.addAttribute("value", "0");
        		setTongbi.addAttribute("value", "0");
        	}
        }
        return xml.getXML();
	}
	
	public DataModel getProductinfoTodayByPage(HashMap paramMap) throws Exception {
		try {
			UserInfo user = (UserInfo)ServletActionContext.getRequest().getSession().getAttribute("user");
			paramMap.put("userid", user.getUserid());
			Map map = summaryStatDao.doProductinfoToday(paramMap);
			if(ReportCommonDefine.PROCEDURE_RESULTCODE_1 == (Integer)map.get("resultcode")){
				DataModel resData = new DataModel();
				resData.setErrCode(ReportCommonDefine.PROCEDURE_RESULTCODE_1+"");
				resData.setErrMsg(map.get("errmesg").toString());
				return resData;
			}
			DataModel resData = summaryStatDao.getProductinfoTodayByPage(paramMap);
			List<ProductinfoToday> list = resData.getRows();
			HashMap hashmap = new HashMap();
			for(ProductinfoToday obj:list){
				hashmap.put(obj.getSubchannelname()+"|"+obj.getHour(), obj);
			}
			resData = summaryStatDao.getSubChannelNames(paramMap);
			List subChannelList = resData.getRows();
//			resData = summaryStatDao.getSubChannelHours(paramMap);
//			List hourList = resData.getRows();
			HashMap chartXML = new HashMap();
			resData = new DataModel();
			resData.setChartXML(getSumamountXML(null,subChannelList,hashmap));
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public HashMap getSumamountXML(List hourList1,List subChannelList,HashMap map) throws IOException{
		HashMap result = new HashMap();
		XMLUtil xml = new XMLUtil();//销售额
		//头部信息生成
		Element chart = xml.addRoot("chart");  
		xml.addAttribute(chart, "palette", "2");  
//        xml.addAttribute(chart, "caption", "各通路销售金额统计");
        xml.addAttribute(chart, "showvalues", "0");
        xml.addAttribute(chart, "divlinedecimalprecision", "1");
        xml.addAttribute(chart, "limitsdecimalprecision", "1");
        xml.addAttribute(chart, "pyaxisname", "每小时总销售额(元)");
        xml.addAttribute(chart, "syaxisname", "每小时通路销售额(元)");
        //xml.addAttribute(chart, "numberprefix", "￥");
        xml.addAttribute(chart, "formatnumberscale", "0");
        xml.addAttribute(chart, "numvisibleplot", "6");//设置初始区域内展现X条数据
        xml.addAttribute(chart, "bgAlpha", "0");
        xml.addAttribute(chart, "showBorder", "0");
        xml.addAttribute(chart, "scrollToEnd", "1");
        xml.addAttribute(chart, "plotSpacePercent", "60");
        
        XMLUtil xmlPiece = new XMLUtil();//件数
        Element chartPiece = xmlPiece.addRoot("chart");  
		xmlPiece.addAttribute(chartPiece, "palette", "2");  
//        xmlPiece.addAttribute(chartPiece, "caption", "各通路销售件数统计");
        xmlPiece.addAttribute(chartPiece, "showvalues", "0");
        xmlPiece.addAttribute(chartPiece, "divlinedecimalprecision", "1");
        xmlPiece.addAttribute(chartPiece, "limitsdecimalprecision", "1");
        xmlPiece.addAttribute(chartPiece, "pyaxisname", "每小时总销售件数(件)");
        xmlPiece.addAttribute(chartPiece, "syaxisname", "每小时通路销售件数(件)");
        xmlPiece.addAttribute(chartPiece, "formatnumberscale", "0");
        xmlPiece.addAttribute(chartPiece, "numvisibleplot", "6");//设置初始区域内展现X条数据
        xmlPiece.addAttribute(chartPiece, "bgAlpha", "0");
        xmlPiece.addAttribute(chartPiece, "showBorder", "0");
        xmlPiece.addAttribute(chartPiece, "scrollToEnd", "1");
        xmlPiece.addAttribute(chartPiece, "plotSpacePercent", "60");
        
        //销售节点信息生成
        Element categories = xml.addNode(chart, "categories");
        Element dataset = xml.addNode(chart, "dataset");
        dataset.setAttributeValue("seriesName", "总销售额");
        dataset.addAttribute("showvalues", "0");
        
        
        //件数节点信息生成
        Element categoriesPiece = xmlPiece.addNode(chartPiece, "categories");
        Element datasetPiece = xmlPiece.addNode(chartPiece, "dataset");
        datasetPiece.setAttributeValue("seriesName", "总销售件数");
        datasetPiece.addAttribute("showvalues", "0");
        
        Long sumamountTotal = 0L;
    	Long orderccTotal = 0L;
        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        for(int i=0;i<=hour; i++){
        	Element category = xml.addNode(categories, "category");
        	category.addAttribute("label", String.valueOf(i));
        	
        	Element categoryPiece = xmlPiece.addNode(categoriesPiece, "category");
        	categoryPiece.addAttribute("label", String.valueOf(i));
        	
        	Element set = xml.addNode(dataset, "set");
        	Element setPiece = xmlPiece.addNode(datasetPiece, "set");
        	if(map.get(9999+"|"+String.valueOf(i)) != null){
        		set.addAttribute("value", Long.toString(((ProductinfoToday)map.get(9999+"|"+String.valueOf(i))).getSumamount()));
        		set.addAttribute("hoverText", "总销售额:"+((ProductinfoToday)map.get(9999+"|"+String.valueOf(i))).getSumamount());//鼠标旋停时显示的信息
        		
        		setPiece.addAttribute("value", Long.toString(((ProductinfoToday)map.get(9999+"|"+String.valueOf(i))).getOrdercc()));
        		setPiece.addAttribute("hoverText", "总销售件数:"+((ProductinfoToday)map.get(9999+"|"+String.valueOf(i))).getOrdercc());
        		
        		sumamountTotal = sumamountTotal + ((ProductinfoToday)map.get(9999+"|"+String.valueOf(i))).getSumamount();
        		orderccTotal = orderccTotal + ((ProductinfoToday)map.get(9999+"|"+String.valueOf(i))).getOrdercc();
        	}else{
        		set.addAttribute("value", "0");
        		set.addAttribute("hoverText", "总销售额:0");
        		setPiece.addAttribute("value", "0");
        		setPiece.addAttribute("hoverText", "总销售件数:0");
        	}
        }
        
        xml.addAttribute(chart, "caption", "通路各小时业绩分布(总计："+sumamountTotal+"元)");
        xmlPiece.addAttribute(chartPiece, "caption", "通路各小时订单件数分布(总计："+orderccTotal+"件)");
        
        for(int i=0; i<subChannelList.size(); i++){
        	dataset = xml.addNode(chart, "dataset");
        	dataset.addAttribute("seriesname", (String)subChannelList.get(i));
        	dataset.addAttribute("showvalues", "0");
        	dataset.addAttribute("parentyaxis", "S");
        	dataset.addAttribute("renderas", "Line");
        	
        	datasetPiece = xmlPiece.addNode(chartPiece, "dataset");
        	datasetPiece.addAttribute("seriesname", (String)subChannelList.get(i));
        	datasetPiece.addAttribute("showvalues", "0");
        	datasetPiece.addAttribute("parentyaxis", "S");
        	datasetPiece.addAttribute("renderas", "Line");
        	
        	for(int j=0;j<=hour; j++){
        		Element set = xml.addNode(dataset, "set");
        		Element setPiece = xmlPiece.addNode(datasetPiece, "set");
        		if(map.get(subChannelList.get(i)+"|"+String.valueOf(j)) != null){
        			set.addAttribute("value", Long.toString(((ProductinfoToday)map.get(subChannelList.get(i)+"|"+String.valueOf(j))).getSumamount()));
        			set.addAttribute("hoverText", subChannelList.get(i)+":"+ Long.toString(((ProductinfoToday)map.get(subChannelList.get(i)+"|"+String.valueOf(j))).getSumamount()));
        			
        			setPiece.addAttribute("value", Long.toString(((ProductinfoToday)map.get(subChannelList.get(i)+"|"+String.valueOf(j))).getOrdercc()));
        			setPiece.addAttribute("hoverText", subChannelList.get(i)+":"+ Long.toString(((ProductinfoToday)map.get(subChannelList.get(i)+"|"+String.valueOf(j))).getOrdercc()));
        		}else{
        			set.addAttribute("value", "0");
        			set.addAttribute("hoverText", subChannelList.get(i)+":0");
        			setPiece.addAttribute("value", "0");
        			setPiece.addAttribute("hoverText", subChannelList.get(i)+":0");
        		}
        	}
        }
        result.put("sumamount", xml.getXML());
        result.put("ordercc", xmlPiece.getXML());
        return result;
	}
	
	public DataModel getPgminfoDetailByPage(HashMap paramMap) throws BusiException {
		try {
			UserInfo user = (UserInfo)ServletActionContext.getRequest().getSession().getAttribute("user");
			paramMap.put("userid", user.getUserid());
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = summaryStatDao.doPgminfoDetail(paramMap);
				if(ReportCommonDefine.PROCEDURE_RESULTCODE_1 == (Integer)map.get("resultcode")){
					DataModel resData = new DataModel();
					resData.setErrCode(ReportCommonDefine.PROCEDURE_RESULTCODE_1+"");
					resData.setErrMsg(map.get("errmesg").toString());
					return resData;
				}
			}
			DataModel resData = summaryStatDao.getPgminfoDetailByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getPgminfoDetailHisByPage(HashMap paramMap) throws BusiException {
		try {
			UserInfo user = (UserInfo)ServletActionContext.getRequest().getSession().getAttribute("user");
			paramMap.put("userid", user.getUserid());
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = summaryStatDao.doPgminfoDetailHis(paramMap);
				if(ReportCommonDefine.PROCEDURE_RESULTCODE_1 == (Integer)map.get("resultcode")){
					DataModel resData = new DataModel();
					resData.setErrCode(ReportCommonDefine.PROCEDURE_RESULTCODE_1+"");
					resData.setErrMsg(map.get("errmesg").toString());
					return resData;
				}
			}
			DataModel resData = summaryStatDao.getPgminfoDetailHisByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getCampainsinfoDetailByPage(HashMap paramMap) throws BusiException {
		try {
			UserInfo user = (UserInfo)ServletActionContext.getRequest().getSession().getAttribute("user");
			paramMap.put("userid", user.getUserid());
			if(paramMap.get("isCilckRefreshBtn") != null && "true".equals(paramMap.get("isCilckRefreshBtn"))){
				Map map = summaryStatDao.doCampainsinfoDetail(paramMap);
				if(ReportCommonDefine.PROCEDURE_RESULTCODE_1 == (Integer)map.get("resultcode")){
					DataModel resData = new DataModel();
					resData.setErrCode(ReportCommonDefine.PROCEDURE_RESULTCODE_1+"");
					resData.setErrMsg(map.get("errmesg").toString());
					return resData;
				}
			}
			DataModel resData = summaryStatDao.getCampainsinfoDetailByPage(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getAreaOrders(HashMap paramMap) throws BusiException {
		try {
			if(paramMap.get("subchannelId") != null && !"".equals(paramMap.get("subchannelId").toString())){
				paramMap.put("subchannelIds", paramMap.get("subchannelId").toString().split(","));
			}
			DataModel resData = summaryStatDao.getAreaOrders(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getZipOrders(HashMap paramMap) throws BusiException {
		try {
			if(paramMap.get("subchannelId") != null && !"".equals(paramMap.get("subchannelId").toString())){
				paramMap.put("subchannelIds", paramMap.get("subchannelId").toString().split(","));
			}
			DataModel resData = summaryStatDao.getZipOrders(paramMap);
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getSubChannelOrders(HashMap paramMap) throws BusiException {
		try {
			DataModel resData = summaryStatDao.getSubChannelOrders(paramMap);
			XMLUtil xml = new XMLUtil();
			//头部信息生成
			Element chart = xml.addRoot("chart");  
			xml.addAttribute(chart, "caption", "当日通路实时业绩");
			xml.addAttribute(chart, "showvalues", "1");
			xml.addAttribute(chart, "plotgradientcolor", "");
			xml.addAttribute(chart, "plotborderalpha", "0");
			xml.addAttribute(chart, "alternatevgridalpha", "0");
			xml.addAttribute(chart, "divlinealpha", "0");
			xml.addAttribute(chart, "canvasborderalpha", "0");
			xml.addAttribute(chart, "bgcolor", "#FFFFFF");
			xml.addAttribute(chart, "basefontcolor", "#194920");
			xml.addAttribute(chart, "palettecolors", "#3A803D");
			xml.addAttribute(chart, "showyaxisvalues", "0");
			xml.addAttribute(chart, "baseFont", "黑体");
			xml.addAttribute(chart, "showborder", "0");
			xml.addAttribute(chart, "formatNumberScale", "0");
			xml.addAttribute(chart, "formatNumber", "0");
			xml.addAttribute(chart, "basefontsize", "12");
			List rows = resData.getRows();
			
			Element categories = xml.addNode(chart, "categories");
			
			Element datasetSumamount = xml.addNode(chart, "dataset");
			datasetSumamount.addAttribute("seriesname", "销售额");
			datasetSumamount.addAttribute("color", "#AFD8F8");
			
			Element datasetMaoli = xml.addNode(chart, "dataset");
			datasetMaoli.addAttribute("seriesname", "毛利");
			datasetMaoli.addAttribute("color", "#8BBA00");
			
			for(int i=0;i<rows.size();i++){
				Element category = xml.addNode(categories, "category");
				category.addAttribute("label", ((HashMap)rows.get(i)).get("subchannelname").toString());
				
				Element setSumamount = xml.addNode(datasetSumamount, "set");
				setSumamount.addAttribute("value", ((HashMap)rows.get(i)).get("sumamount").toString());
				
				Element setMaoli = xml.addNode(datasetMaoli, "set");
				setMaoli.addAttribute("value", ((HashMap)rows.get(i)).get("maoli").toString());
			}
			resData.setValue(xml.getXML());
			return resData;
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}

	public SummaryStatDao getSummaryStatDao() {
		return summaryStatDao;
	}

	public void setSummaryStatDao(SummaryStatDao summaryStatDao) {
		this.summaryStatDao = summaryStatDao;
	}

	public LoggingService getLoggingService() {
		return loggingService;
	}

	public void setLoggingService(LoggingService loggingService) {
		this.loggingService = loggingService;
	}

}
