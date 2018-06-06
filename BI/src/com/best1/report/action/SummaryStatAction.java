package com.best1.report.action;

import com.best1.base.BaseAction;
import com.best1.base.DataModel;
import com.best1.report.service.SummaryStatService;

public class SummaryStatAction extends BaseAction {
	private SummaryStatService summaryStatService;
	
	//时间别订单统计数据
	public String timeOrderList() throws Exception {
		DataModel resData = summaryStatService.getTimeOrderListByPage(paramMap);
		commonOutPrint(resData);
		return null;
	}
	
	public String timeOrderXml() throws Exception {
		String resData = summaryStatService.getTimeOrderXml(paramMap);
		commonOutPrint(resData);
		return null;
	}
	
	//当日商品各通路销售情况
	public String productinfoTodayList() throws Exception {
		DataModel resData = summaryStatService.getProductinfoTodayByPage(paramMap);
		commonOutPrint(resData);
		return null;
	}
	
	//节目业绩
	public String pgminfoDetailList() throws Exception {
		DataModel resData = summaryStatService.getPgminfoDetailByPage(paramMap);
		commonOutPrint(resData);
		return null;
	}
	
	//节目历史业绩
	public String pgminfoDetailHisList() throws Exception {
		DataModel resData = summaryStatService.getPgminfoDetailHisByPage(paramMap);
		commonOutPrint(resData);
		return null;
	}
	
	//行销活动业绩
	public String campainsinfoDetailList() throws Exception {
		DataModel resData = summaryStatService.getCampainsinfoDetailByPage(paramMap);
		commonOutPrint(resData);
		return null;
	}
	
	//有效订单地图展现
	public String areaOrderList() throws Exception {
		DataModel resData = summaryStatService.getAreaOrders(paramMap);
		commonOutPrint(resData);
		return null;
	}
	
	public String zipOrderList() throws Exception {
		DataModel resData = summaryStatService.getZipOrders(paramMap);
		commonOutPrint(resData);
		return null;
	}
	
	public String showSubChannel() throws Exception {
		DataModel resData = summaryStatService.getSubChannelOrders(paramMap);
		commonOutPrint(resData);
		return null;
	}

	public SummaryStatService getSummaryStatService() {
		return summaryStatService;
	}

	public void setSummaryStatService(SummaryStatService summaryStatService) {
		this.summaryStatService = summaryStatService;
	}
	
}