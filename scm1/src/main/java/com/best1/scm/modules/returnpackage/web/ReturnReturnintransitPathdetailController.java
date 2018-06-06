/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.returnpackage.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.best1.scm.common.config.Global;
import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.web.BaseController;
import com.best1.scm.common.utils.StringUtils;
import com.best1.scm.modules.returnpackage.entity.ReturnReturnintransitPathdetail;
import com.best1.scm.modules.returnpackage.service.ReturnReturnintransitPathdetailService;

/**
 * 退换货包裹路由Controller
 * @author hwh
 * @version 2016-03-15
 */
@Controller
@RequestMapping(value = "${adminPath}/returnpackage/returnReturnintransitPathdetail")
public class ReturnReturnintransitPathdetailController extends BaseController {

	@Autowired
	private ReturnReturnintransitPathdetailService returnReturnintransitPathdetailService;
	
	@ModelAttribute
	public ReturnReturnintransitPathdetail get(@RequestParam(required=false) String id) {
		ReturnReturnintransitPathdetail entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = returnReturnintransitPathdetailService.get(id);
		}
		if (entity == null){
			entity = new ReturnReturnintransitPathdetail();
		}
		return entity;
	}
	
	@RequiresPermissions("returnpackage:returnReturnintransitPathdetail:view")
	@RequestMapping(value = {"list", ""})
	public String list(ReturnReturnintransitPathdetail returnReturnintransitPathdetail, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<ReturnReturnintransitPathdetail> page = returnReturnintransitPathdetailService.findPage(new Page<ReturnReturnintransitPathdetail>(request, response), returnReturnintransitPathdetail); 
		model.addAttribute("page", page);
		return "modules/returnpackage/returnReturnintransitPathdetailList";
	}

	@RequiresPermissions("returnpackage:returnReturnintransitPathdetail:view")
	@RequestMapping(value = "form")
	public String form(ReturnReturnintransitPathdetail returnReturnintransitPathdetail, Model model) {
		model.addAttribute("returnReturnintransitPathdetail", returnReturnintransitPathdetail);
		return "modules/returnpackage/returnReturnintransitPathdetailForm";
	}

	@RequiresPermissions("returnpackage:returnReturnintransitPathdetail:edit")
	@RequestMapping(value = "save")
	public String save(ReturnReturnintransitPathdetail returnReturnintransitPathdetail, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, returnReturnintransitPathdetail)){
			return form(returnReturnintransitPathdetail, model);
		}
		returnReturnintransitPathdetailService.save(returnReturnintransitPathdetail);
		addMessage(redirectAttributes, "保存退换货包裹路由成功");
		return "redirect:"+Global.getAdminPath()+"/returnpackage/returnReturnintransitPathdetail/?repage";
	}
	
	@RequiresPermissions("returnpackage:returnReturnintransitPathdetail:edit")
	@RequestMapping(value = "delete")
	public String delete(ReturnReturnintransitPathdetail returnReturnintransitPathdetail, RedirectAttributes redirectAttributes) {
		returnReturnintransitPathdetailService.delete(returnReturnintransitPathdetail);
		addMessage(redirectAttributes, "删除退换货包裹路由成功");
		return "redirect:"+Global.getAdminPath()+"/returnpackage/returnReturnintransitPathdetail/?repage";
	}

}