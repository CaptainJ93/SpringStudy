package com.best1.report.action;

import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.best1.base.BaseAction;
import com.best1.base.DataModel;
import com.best1.report.domain.AreaZipCodeModel;
import com.best1.report.domain.QueryModel;
import com.best1.report.service.QueryService;

public class QueryAction extends BaseAction {
	private QueryService queryService;
	
	public String queryMemberShipLevel() throws Exception {
		DataModel resData = queryService.getMemberShipLevel(paramMap);
		List<QueryModel> list = resData.getRows();
		JSONArray p_jsonArray = new JSONArray();
		for(QueryModel module:list){
			JSONObject p_json = new JSONObject();
			p_json.put("id",module.getId());
			p_json.put("pId",module.getpId());
			p_json.put("name",module.getName());
			p_json.put("open",module.getOpenFlag());
			p_jsonArray.add(p_json);
		}
		commonOutPrint(p_jsonArray.toString());
		return null;
	}
	
	public String queryDomainData() throws Exception {
		DataModel resData = queryService.getDomainData(paramMap);
		List<QueryModel> list = resData.getRows();
		JSONArray p_jsonArray = new JSONArray();
		for(QueryModel module:list){
			JSONObject p_json = new JSONObject();
			p_json.put("id",module.getId());
			p_json.put("pId",module.getpId());
			p_json.put("name",module.getName());
			p_json.put("open",module.getOpenFlag());
			p_jsonArray.add(p_json);
		}
		commonOutPrint(p_jsonArray.toString());
		return null;
	}
	
	public String queryProductClass() throws Exception {
		DataModel resData = queryService.getProductClass(paramMap);
		List<QueryModel> list = resData.getRows();
		JSONArray p_jsonArray = new JSONArray();
		for(QueryModel module:list){
			JSONObject p_json = new JSONObject();
			p_json.put("id",module.getId());
			p_json.put("pId",module.getpId());
			p_json.put("name",module.getName());
			p_json.put("open",module.getOpenFlag());
			p_jsonArray.add(p_json);
		}
		commonOutPrint(p_jsonArray.toString());
		return null;
	}
	
	public String querySubchannel() throws Exception {
		DataModel resData = queryService.getSubchannel(paramMap);
		List<QueryModel> list = resData.getRows();
		JSONArray p_jsonArray = new JSONArray();
		for(QueryModel module:list){
			JSONObject p_json = new JSONObject();
			p_json.put("id",module.getId());
			p_json.put("pId",module.getpId());
			p_json.put("name",module.getName());
			p_json.put("open",module.getOpenFlag());
			p_jsonArray.add(p_json);
		}
		commonOutPrint(p_jsonArray.toString());
		return null;
	}
	
	public String queryComplaintCategory() throws Exception {
		DataModel resData = queryService.getComplaintCategory(paramMap);
		List<QueryModel> list = resData.getRows();
		JSONArray p_jsonArray = new JSONArray();
		for(QueryModel module:list){
			JSONObject p_json = new JSONObject();
			p_json.put("id",module.getId());
			p_json.put("pId",module.getpId());
			p_json.put("name",module.getName());
			p_json.put("open",module.getOpenFlag());
			p_jsonArray.add(p_json);
		}
		commonOutPrint(p_jsonArray.toString());
		return null;
	}
	
	public String queryAreaZipCode() throws Exception {
		DataModel resData = queryService.getAreaZipCode(paramMap);
		List<AreaZipCodeModel> list = resData.getRows();
		JSONArray p_jsonArray = new JSONArray();
		for(AreaZipCodeModel module:list){
			JSONObject p_json = new JSONObject();
			p_json.put("id",module.getId());
			p_json.put("pId",module.getpId());
			p_json.put("name",module.getName());
			p_json.put("open",module.getOpenFlag());
			p_jsonArray.add(p_json);
		}
		commonOutPrint(p_jsonArray.toString());
		return null;
	}
	
	public String queryCityCode() throws Exception {
		DataModel resData = queryService.getCityCode(paramMap);
		List<AreaZipCodeModel> list = resData.getRows();
		JSONArray p_jsonArray = new JSONArray();
		for(AreaZipCodeModel module:list){
			JSONObject p_json = new JSONObject();
			p_json.put("id",module.getId());
			p_json.put("pId",module.getpId());
			p_json.put("name",module.getName());
			p_json.put("open",module.getOpenFlag());
			p_jsonArray.add(p_json);
		}
		commonOutPrint(p_jsonArray.toString());
		return null;
	}
	
	/*
	 * jqgrid查询时不加url，jquery.min.js报错，导致在IE下表格中的export按钮无法显示，因此在首次不需要执行查询的情况下，url默认指向该方法
	 */
	public String initList() throws Exception {
		DataModel resData = new DataModel();
		resData.setErrCode("2");
		resData.setErrMsg("请先查询!");
		commonOutPrint(resData);
		return null;
	}

	
	public QueryService getQueryService() {
		return queryService;
	}

	public void setQueryService(QueryService queryService) {
		this.queryService = queryService;
	}
	
}