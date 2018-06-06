package com.best1.action;

import com.best1.base.BaseAction;
import com.best1.base.DataModel;
import com.best1.domain.Menu;
import com.best1.service.MenuService;

public class MenuAction extends BaseAction {
	private MenuService menuService;
	private	Menu menu;
	
	public String list() throws Exception {
		DataModel resData = menuService.getMenuByPage(paramMap);
		commonOutPrint(resData);
		return null;
	}

	public String edit() throws Exception {
		DataModel resData = menuService.getMenus(paramMap);
		commonOutPrint(resData);
		return null;
	}

	public String save() throws Exception {
		DataModel resData = new DataModel();
		if(menu!=null && menu.getMenupid() == null){
			menu.setMenupid(0L);
		}
		if (ADD.equals(this.oper)) {
			resData = menuService.addMenu(menu);
		} else if (EDIT.equals(this.oper)) {
			resData = menuService.updateMenu(menu);
		}
		commonOutPrint(resData);
		return null;
	}

	public String delete() throws Exception {
		DataModel resData = menuService.deleteMenu(paramMap);
		commonOutPrint(resData);
		return null;
	}

	public MenuService getMenuService() {
		return menuService;
	}

	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	
}