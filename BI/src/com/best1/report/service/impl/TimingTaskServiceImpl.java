package com.best1.report.service.impl;

import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;

import org.directwebremoting.WebContext;
import org.directwebremoting.WebContextFactory;
import org.directwebremoting.proxy.dwr.Util;
import com.best1.report.service.TimingTaskService;
import com.best1.base.BaseServiceImpl;
import com.best1.base.DataModel;
import com.best1.db.TemplateDao;

public class TimingTaskServiceImpl extends BaseServiceImpl implements TimingTaskService{
	private static HashMap<String,WebContext> map = new HashMap<String,WebContext>();
	private TemplateDao templateDao;
	
	public void doInitWork(String name){
		WebContext wctx = map.get(name);
		if(wctx == null ){
			wctx = WebContextFactory.get();
			map.put(name, wctx);
		}
	}
	
	public void work() throws SQLException{
		System.out.println("=================");
		WebContext wctx = map.get("work");
		if(wctx == null ){
			wctx = WebContextFactory.get();
			map.put("work", wctx);
		}
		//以当前WebContext关联的ScriptSession创建Util
		Util utilThis = new Util(wctx.getScriptSession());
		//使用utilThis清除text文本框的内容
		utilThis.setValue("text", "");
		//获取当前页面的url
		String currentPage = wctx.getCurrentPage();
		//获取正在浏览当前页的所有浏览器会话
		Collection sessions = wctx.getScriptSessionsByPage(currentPage);
		
		//以sessions创建Util对象
		Util utilAll = new Util(sessions);
		utilAll.addFunctionCall("changeMonth");
		System.out.println("--------------");
		HashMap map = new HashMap();
		map.put("userid", 30427);
		DataModel dataModel = templateDao.getRecords(map);
		System.out.println("zong changdu : "+dataModel.getValue());
    }

	public TemplateDao getTemplateDao() {
		return templateDao;
	}

	public void setTemplateDao(TemplateDao templateDao) {
		this.templateDao = templateDao;
	}
	
}
