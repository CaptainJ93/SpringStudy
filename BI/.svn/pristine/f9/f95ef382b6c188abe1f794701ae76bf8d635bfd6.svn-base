package com.best1.action;

import java.util.HashMap;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.best1.base.BaseAction;
import com.best1.base.DataModel;
import com.best1.domain.MenuInfo;
import com.best1.domain.UserInfo;
import com.best1.service.TreeInfoService;

/**
 * Servlet implementation class for Servlet: ZTreeSerlvet
 *
 */
 public class ZTreeAction extends BaseAction {
   static final long serialVersionUID = 1L;
   private TreeInfoService treeInfoService;
   private long id = 0l;

	
	public String treeInfos() throws Exception{
		long pid = 0l;
		pid = id;
		long userid = ((UserInfo) getRequest().getSession().getAttribute("user")).getUserid(); 
//		long userid = 30851l;
		JSONArray p_jsonArray = new JSONArray();
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("pid", pid);
		paramMap.put("userid", userid);
		
		List<MenuInfo> treeInfos = treeInfoService.getCTreeInfos(paramMap); //入参userid
		for(MenuInfo module:treeInfos){
		JSONObject p_json = new JSONObject();
		p_json.put("name",module.getName());
		p_json.put("id",module.getId());
		p_json.put("open", "false");
//		p_json.put("target", "mainwindow");
		if (module.getMenuType() == 0) {
			
			p_json.put("isParent", "true");
		}
		//自动在url后面增加菜单id和菜单名称
		StringBuffer url = new StringBuffer(module.getUrl());
		if(url.toString() != null && !"".equals(url.toString())){
			if(url.toString().contains("?")){
				url.append("&menuId="+module.getId()+"&menuName="+module.getName());
			}else{
				url.append("?menuId="+module.getId()+"&menuName="+module.getName());
			}
		}
		
//		p_json.put("url", url.toString());
		p_json.put("menuURL", url.toString());
		p_jsonArray.add(p_json);
		}
		commonOutPrint(p_jsonArray.toString());
		return null;
		}
	
	public String getMenuTree() throws Exception {
		DataModel resData = treeInfoService.getMenuTree(paramMap);
		List<MenuInfo> list = resData.getRows();
		JSONArray p_jsonArray = new JSONArray();
		for(MenuInfo module:list){
			JSONObject p_json = new JSONObject();
			p_json.put("id",module.getId());
			p_json.put("pId",module.getPid());
			p_json.put("name",module.getName());
			p_json.put("checked",module.getChecked());
			p_json.put("open","false");
			p_jsonArray.add(p_json);
		}
		commonOutPrint(p_jsonArray.toString());
		return null;
	}
	
	public String getMenuDirectory() throws Exception {
		paramMap.put("menutype", "0");
		DataModel resData = treeInfoService.getMenuTreeDirectory(paramMap);
		List<MenuInfo> list = resData.getRows();
		JSONArray p_jsonArray = new JSONArray();
		for(MenuInfo module:list){
			JSONObject p_json = new JSONObject();
			p_json.put("id",module.getId());
			p_json.put("pId",module.getPid());
			p_json.put("name",module.getName());
			p_jsonArray.add(p_json);
		}
		commonOutPrint(p_jsonArray.toString());
		return null;
	}

	public String getDepartmentTree() throws Exception {
	
		DataModel resData = treeInfoService.getDepartmentTree(paramMap);
		List<MenuInfo> list = resData.getRows();
		JSONArray p_jsonArray = new JSONArray();
		for(MenuInfo module:list){
			JSONObject p_json = new JSONObject();
			p_json.put("id",module.getId());
			p_json.put("pId",module.getPid());
			p_json.put("name",module.getName());
			p_jsonArray.add(p_json);
		}
		commonOutPrint(p_jsonArray.toString());
		return null;
	}

	public TreeInfoService getTreeInfoService() {
		return treeInfoService;
	}

	public void setTreeInfoService(TreeInfoService treeInfoService) {
		this.treeInfoService = treeInfoService;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}	  	    
}