/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.supplier.web;

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
import com.best1.scm.modules.supplier.entity.ScmSupplierSupplierinfo;
import com.best1.scm.modules.supplier.service.ScmSupplierSupplierinfoService;

/**
 * 供应商-供应商信息Controller
 * @author admin
 * @version 2016-12-13
 */
@Controller
@RequestMapping(value = "${adminPath}/supplier/scmSupplierSupplierinfo")
public class ScmSupplierSupplierinfoController extends BaseController {

	@Autowired
	private ScmSupplierSupplierinfoService scmSupplierSupplierinfoService;
	
	@ModelAttribute
	public ScmSupplierSupplierinfo get(@RequestParam(required=false) String id) {
		ScmSupplierSupplierinfo entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = scmSupplierSupplierinfoService.get(id);
		}
		if (entity == null){
			entity = new ScmSupplierSupplierinfo();
		}
		return entity;
	}
	
	@RequiresPermissions("supplier:scmSupplierSupplierinfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(ScmSupplierSupplierinfo scmSupplierSupplierinfo, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<ScmSupplierSupplierinfo> page = scmSupplierSupplierinfoService.findPage(new Page<ScmSupplierSupplierinfo>(request, response), scmSupplierSupplierinfo); 
		model.addAttribute("page", page);
		return "modules/supplier/scmSupplierSupplierinfoList";
	}

	@RequiresPermissions("supplier:scmSupplierSupplierinfo:view")
	@RequestMapping(value = "form")
	public String form(ScmSupplierSupplierinfo scmSupplierSupplierinfo, Model model) {
		model.addAttribute("scmSupplierSupplierinfo", scmSupplierSupplierinfo);
		return "modules/supplier/scmSupplierSupplierinfoForm";
	}

	@RequiresPermissions("supplier:scmSupplierSupplierinfo:edit")
	@RequestMapping(value = "save")
	public String save(ScmSupplierSupplierinfo scmSupplierSupplierinfo, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, scmSupplierSupplierinfo)){
			return form(scmSupplierSupplierinfo, model);
		}
		scmSupplierSupplierinfoService.save(scmSupplierSupplierinfo);
		addMessage(redirectAttributes, "保存供应商-供应商信息成功");
		return "redirect:"+Global.getAdminPath()+"/supplier/scmSupplierSupplierinfo/?repage";
	}
	
	@RequiresPermissions("supplier:scmSupplierSupplierinfo:edit")
	@RequestMapping(value = "delete")
	public String delete(ScmSupplierSupplierinfo scmSupplierSupplierinfo, RedirectAttributes redirectAttributes) {
		scmSupplierSupplierinfoService.delete(scmSupplierSupplierinfo);
		addMessage(redirectAttributes, "删除供应商-供应商信息成功");
		return "redirect:"+Global.getAdminPath()+"/supplier/scmSupplierSupplierinfo/?repage";
	}

}