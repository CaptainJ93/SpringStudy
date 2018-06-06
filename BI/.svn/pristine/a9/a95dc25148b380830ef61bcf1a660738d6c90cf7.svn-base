package com.best1.base;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.best1.domain.ParamValue;
import com.best1.service.ParamValueService;

public class InitAction extends javax.servlet.http.HttpServlet
implements javax.servlet.Servlet {
	static final long serialVersionUID = 1L;
	private ParamValueService paramValueService;
	
	
	public ParamValueService getParamValueService() {
		return paramValueService;
	}
	public void setParamValueService(ParamValueService paramValueService) {
		this.paramValueService = paramValueService;
	}

	public void init() throws ServletException {
		System.out.println("=========加载数据到缓存begin============");
		
		List<ParamValue> pVs = new ArrayList<ParamValue>();
		pVs = paramValueService.getPVs();//从sys_param_define获取数据
		
		String type = "";
		String bType = "";
		
		JSONArray ppp_jsonArray = new JSONArray();
		JSONObject pp_jsonObj = new JSONObject();
		JSONObject ppp_jsonObj = new JSONObject();
		for(int i = 0; i < pVs.size(); i++){
			ParamValue PV = pVs.get(i);
			type = PV.getCode();
			if((!"".equals(bType))&& (!bType.equals(type))){
				pp_jsonObj.put(bType, ppp_jsonArray.toString());
				Cache cache = new Cache();
				cache.setKey(bType);
				cache.setValue(pp_jsonObj.toString());
				CacheManager.putCache(bType, cache);	
//				System.out.println("CacheManager.getCache("+bType+") =====  "+ CacheManager.getCacheInfo(bType).getValue().toString() );
				ppp_jsonObj = new JSONObject();
				ppp_jsonArray = new JSONArray();
				pp_jsonObj.clear();
			}
			

			ppp_jsonObj.put("VALUE", PV.getValue());
			ppp_jsonObj.put("NAME", PV.getName());
			ppp_jsonArray.add(ppp_jsonObj);
			if( (i == (pVs.size()-1)) &&  ppp_jsonArray.size()>0){
				pp_jsonObj.put(type, ppp_jsonArray.toString());
				Cache cache = new Cache();
				cache.setKey(type);
				cache.setValue(pp_jsonObj.toString());
				CacheManager.putCache(type, cache);
//				System.out.println("CacheManager.getCache("+type+") =====  "+ CacheManager.getCacheInfo(type).getValue().toString() );
				ppp_jsonObj = new JSONObject();
				ppp_jsonArray = new JSONArray();
				pp_jsonObj.clear();
			}
				bType = type;
		}
		System.out.println("=========加载数据到缓存end============");
	}


}
