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
import com.best1.scm.modules.vws.entity.Carrieradress;
import com.best1.scm.modules.vws.service.CarrieradressService;

/**
 * vwsController
 * @author hwh
 * @version 2016-02-25
 */
@Controller
@RequestMapping(value = "${adminPath}/vws/carrieradress")
public class CarrieradressController extends BaseController {

	@Autowired
	private CarrieradressService carrieradressService;
	
	@ModelAttribute
	public Carrieradress get(@RequestParam(required=false) String id) {
		Carrieradress entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = carrieradressService.get(id);
		}
		if (entity == null){
			entity = new Carrieradress();
		}
		return entity;
	}
	
	@RequiresPermissions("vws:carrieradress:view")
	@RequestMapping(value = {"list", ""})
	public String list(Carrieradress carrieradress, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<Carrieradress> page = carrieradressService.findPage(new Page<Carrieradress>(request, response), carrieradress); 
		model.addAttribute("page", page);
		return "modules/vws/carrieradressList";
	}

	@RequiresPermissions("vws:carrieradress:view")
	@RequestMapping(value = "form")
	public String form(Carrieradress carrieradress, Model model) {
		model.addAttribute("carrieradress", carrieradress);
		return "modules/vws/carrieradressForm";
	}

	@RequiresPermissions("vws:carrieradress:edit")
	@RequestMapping(value = "save")
	public String save(Carrieradress carrieradress, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, carrieradress)){
			return form(carrieradress, model);
		}
		carrieradressService.save(carrieradress);
		addMessage(redirectAttributes, "保存配送公司地址成功");
		return "redirect:"+Global.getAdminPath()+"/vws/carrieradress/?repage";
	}
	
	@RequiresPermissions("vws:carrieradress:edit")
	@RequestMapping(value = "delete")
	public String delete(Carrieradress carrieradress, RedirectAttributes redirectAttributes) {
		carrieradressService.delete(carrieradress);
		addMessage(redirectAttributes, "删除配送公司地址成功");
		return "redirect:"+Global.getAdminPath()+"/vws/carrieradress/?repage";
	}

}