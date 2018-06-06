/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.delivery.web;

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
import com.best1.scm.modules.delivery.entity.ScmDeliveryTimezoneratescore;
import com.best1.scm.modules.delivery.service.ScmDeliveryTimezoneratescoreService;

/**
 * 配送大区评分Controller
 * @author admin
 * @version 2016-06-30
 */
@Controller
@RequestMapping(value = "${adminPath}/delivery/scmDeliveryTimezoneratescore")
public class ScmDeliveryTimezoneratescoreController extends BaseController {

	@Autowired
	private ScmDeliveryTimezoneratescoreService scmDeliveryTimezoneratescoreService;
	
	@ModelAttribute
	public ScmDeliveryTimezoneratescore get(@RequestParam(required=false) String id) {
		ScmDeliveryTimezoneratescore entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = scmDeliveryTimezoneratescoreService.get(id);
		}
		if (entity == null){
			entity = new ScmDeliveryTimezoneratescore();
		}
		return entity;
	}
	
	@RequiresPermissions("delivery:scmDeliveryTimezoneratescore:view")
	@RequestMapping(value = {"list", ""})
	public String list(ScmDeliveryTimezoneratescore scmDeliveryTimezoneratescore, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<ScmDeliveryTimezoneratescore> page = scmDeliveryTimezoneratescoreService.findPage(new Page<ScmDeliveryTimezoneratescore>(request, response), scmDeliveryTimezoneratescore); 
		model.addAttribute("page", page);
		return "modules/delivery/scmDeliveryTimezoneratescoreList";
	}

	@RequiresPermissions("delivery:scmDeliveryTimezoneratescore:view")
	@RequestMapping(value = "form")
	public String form(ScmDeliveryTimezoneratescore scmDeliveryTimezoneratescore, Model model) {
		model.addAttribute("scmDeliveryTimezoneratescore", scmDeliveryTimezoneratescore);
		return "modules/delivery/scmDeliveryTimezoneratescoreForm";
	}

	@RequiresPermissions("delivery:scmDeliveryTimezoneratescore:edit")
	@RequestMapping(value = "save")
	public String save(ScmDeliveryTimezoneratescore scmDeliveryTimezoneratescore, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, scmDeliveryTimezoneratescore)){
			return form(scmDeliveryTimezoneratescore, model);
		}
		scmDeliveryTimezoneratescoreService.save(scmDeliveryTimezoneratescore);
		addMessage(redirectAttributes, "保存配送大区评分成功");
		return "redirect:"+Global.getAdminPath()+"/delivery/scmDeliveryTimezoneratescore/?repage";
	}
	
	@RequiresPermissions("delivery:scmDeliveryTimezoneratescore:edit")
	@RequestMapping(value = "delete")
	public String delete(ScmDeliveryTimezoneratescore scmDeliveryTimezoneratescore, RedirectAttributes redirectAttributes) {
		scmDeliveryTimezoneratescoreService.delete(scmDeliveryTimezoneratescore);
		addMessage(redirectAttributes, "删除配送大区评分成功");
		return "redirect:"+Global.getAdminPath()+"/delivery/scmDeliveryTimezoneratescore/?repage";
	}

}