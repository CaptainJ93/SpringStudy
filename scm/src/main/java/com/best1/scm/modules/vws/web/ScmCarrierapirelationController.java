/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.vws.web;

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
import com.best1.scm.modules.vws.entity.ScmCarrierapirelation;
import com.best1.scm.modules.vws.service.ScmCarrierapirelationService;

/**
 * scm_carrierapirelationController
 * @author jsz
 * @version 2017-04-12
 */
@Controller
@RequestMapping(value = "${adminPath}/vws/scmCarrierapirelation")
public class ScmCarrierapirelationController extends BaseController {

	@Autowired
	private ScmCarrierapirelationService scmCarrierapirelationService;
	
	@ModelAttribute
	public ScmCarrierapirelation get(@RequestParam(required=false) String id) {
		ScmCarrierapirelation entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = scmCarrierapirelationService.get(id);
		}
		if (entity == null){
			entity = new ScmCarrierapirelation();
		}
		return entity;
	}
	
	@RequiresPermissions("vws:scmCarrierapirelation:view")
	@RequestMapping(value = {"list", ""})
	public String list(ScmCarrierapirelation scmCarrierapirelation, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<ScmCarrierapirelation> page = scmCarrierapirelationService.findPage(new Page<ScmCarrierapirelation>(request, response), scmCarrierapirelation); 
		model.addAttribute("page", page);
		return "modules/vws/scmCarrierapirelationList";
	}

	@RequiresPermissions("vws:scmCarrierapirelation:view")
	@RequestMapping(value = "form")
	public String form(ScmCarrierapirelation scmCarrierapirelation, Model model) {
		model.addAttribute("scmCarrierapirelation", scmCarrierapirelation);
		return "modules/vws/scmCarrierapirelationForm";
	}

	@RequiresPermissions("vws:scmCarrierapirelation:edit")
	@RequestMapping(value = "save")
	public String save(ScmCarrierapirelation scmCarrierapirelation, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, scmCarrierapirelation)){
			return form(scmCarrierapirelation, model);
		}
		scmCarrierapirelationService.save(scmCarrierapirelation);
		addMessage(redirectAttributes, "保存scm_carrierapirelation成功");
		return "redirect:"+Global.getAdminPath()+"/vws/scmCarrierapirelation/?repage";
	}
	
	@RequiresPermissions("vws:scmCarrierapirelation:edit")
	@RequestMapping(value = "delete")
	public String delete(ScmCarrierapirelation scmCarrierapirelation, RedirectAttributes redirectAttributes) {
		scmCarrierapirelationService.delete(scmCarrierapirelation);
		addMessage(redirectAttributes, "删除scm_carrierapirelation成功");
		return "redirect:"+Global.getAdminPath()+"/vws/scmCarrierapirelation/?repage";
	}

}