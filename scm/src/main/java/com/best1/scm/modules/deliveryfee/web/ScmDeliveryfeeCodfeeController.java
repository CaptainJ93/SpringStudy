/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.deliveryfee.web;

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
import com.best1.scm.modules.deliveryfee.entity.ScmDeliveryfeeCodfee;
import com.best1.scm.modules.deliveryfee.service.ScmDeliveryfeeCodfeeService;

/**
 * 配送费用计算Controller
 * @author admin
 * @version 2016-07-27
 */
@Controller
@RequestMapping(value = "${adminPath}/deliveryfee/scmDeliveryfeeCodfee")
public class ScmDeliveryfeeCodfeeController extends BaseController {

	@Autowired
	private ScmDeliveryfeeCodfeeService scmDeliveryfeeCodfeeService;
	
	@ModelAttribute
	public ScmDeliveryfeeCodfee get(@RequestParam(required=false) String id) {
		ScmDeliveryfeeCodfee entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = scmDeliveryfeeCodfeeService.get(id);
		}
		if (entity == null){
			entity = new ScmDeliveryfeeCodfee();
		}
		return entity;
	}
	
	@RequiresPermissions("deliveryfee:scmDeliveryfeeCodfee:view")
	@RequestMapping(value = {"list", ""})
	public String list(ScmDeliveryfeeCodfee scmDeliveryfeeCodfee, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<ScmDeliveryfeeCodfee> page = scmDeliveryfeeCodfeeService.findPage(new Page<ScmDeliveryfeeCodfee>(request, response), scmDeliveryfeeCodfee); 
		model.addAttribute("page", page);
		return "modules/deliveryfee/scmDeliveryfeeCodfeeList";
	}

	@RequiresPermissions("deliveryfee:scmDeliveryfeeCodfee:view")
	@RequestMapping(value = "form")
	public String form(ScmDeliveryfeeCodfee scmDeliveryfeeCodfee, Model model) {
		model.addAttribute("scmDeliveryfeeCodfee", scmDeliveryfeeCodfee);
		return "modules/deliveryfee/scmDeliveryfeeCodfeeForm";
	}

	@RequiresPermissions("deliveryfee:scmDeliveryfeeCodfee:edit")
	@RequestMapping(value = "save")
	public String save(ScmDeliveryfeeCodfee scmDeliveryfeeCodfee, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, scmDeliveryfeeCodfee)){
			return form(scmDeliveryfeeCodfee, model);
		}
		scmDeliveryfeeCodfeeService.save(scmDeliveryfeeCodfee);
		addMessage(redirectAttributes, "保存配送费用计算成功");
		return "redirect:"+Global.getAdminPath()+"/deliveryfee/scmDeliveryfeeCodfee/?repage";
	}
	
	@RequiresPermissions("deliveryfee:scmDeliveryfeeCodfee:edit")
	@RequestMapping(value = "delete")
	public String delete(ScmDeliveryfeeCodfee scmDeliveryfeeCodfee, RedirectAttributes redirectAttributes) {
		scmDeliveryfeeCodfeeService.delete(scmDeliveryfeeCodfee);
		addMessage(redirectAttributes, "删除配送费用计算成功");
		return "redirect:"+Global.getAdminPath()+"/deliveryfee/scmDeliveryfeeCodfee/?repage";
	}

}