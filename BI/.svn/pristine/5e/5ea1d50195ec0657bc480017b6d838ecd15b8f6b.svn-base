package com.best1.base.common;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.best1.base.BaseAction;
import com.best1.base.Cache;
import com.best1.base.CacheManager;

public class CacheAction extends BaseAction {
	private String paramName;
	private String keys;
	
	public String getCacheByName() throws Exception{
		Cache cache = CacheManager.getCacheInfo(paramName);
		commonOutPrint((String)cache.getValue());
		return null;
	}
	
	public String getCache() throws Exception{
		if(keys != null && !"".equals(keys)){
			Cache cache = null ;
			String str[] = keys.split(",");
			JSONObject jsonObject = new JSONObject();
			JSONArray jsonArray = new JSONArray();
			for(int i=0;i<str.length;i++){
				cache = CacheManager.getCacheInfo(str[i]);
				jsonArray = (JSONObject.fromObject(cache.getValue())).getJSONArray(str[i]);
				jsonObject.put(str[i], jsonArray);
			}
			commonOutPrint(jsonObject.toString());
		}
		return null;
	}
	
	public String getKeys() {
		return keys;
	}
	public void setKeys(String keys) {
		this.keys = keys;
	}
	public String getParamName() {
		return paramName;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	
}