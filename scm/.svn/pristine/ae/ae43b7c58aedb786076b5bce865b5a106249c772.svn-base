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
import com.best1.scm.modules.vws.entity.Carrierdeliverorderid;
import com.best1.scm.modules.vws.service.CarrierdeliverorderidService;

/**
 * 配送公司面单Controller
 * @author huwh
 * @version 2016-03-30
 */
@Controller
@RequestMapping(value = "${adminPath}/vws/carrierdeliverorderid")
public class CarrierdeliverorderidController extends BaseController {

	@Autowired
	private CarrierdeliverorderidService carrierdeliverorderidService;
	
	@ModelAttribute
	public Carrierdeliverorderid get(@RequestParam(required=false) String id) {
		Carrierdeliverorderid entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = carrierdeliverorderidService.get(id);
		}
		if (entity == null){
			entity = new Carrierdeliverorderid();
		}
		return entity;
	}
	
	@RequiresPermissions("vws:carrierdeliverorderid:view")
	@RequestMapping(value = {"list", ""})
	public String list(Carrierdeliverorderid carrierdeliverorderid, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<Carrierdeliverorderid> page = carrierdeliverorderidService.findPage(new Page<Carrierdeliverorderid>(request, response), carrierdeliverorderid); 
		model.addAttribute("page", page);
		return "modules/vws/carrierdeliverorderidList";
	}

	@RequiresPermissions("vws:carrierdeliverorderid:view")
	@RequestMapping(value = "form")
	public String form(Carrierdeliverorderid carrierdeliverorderid, Model model) {
		model.addAttribute("carrierdeliverorderid", carrierdeliverorderid);
		return "modules/vws/carrierdeliverorderidForm";
	}

	@RequiresPermissions("vws:carrierdeliverorderid:edit")
	@RequestMapping(value = "save")
	public String save(Carrierdeliverorderid carrierdeliverorderid, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, carrierdeliverorderid)){
			return form(carrierdeliverorderid, model);
		}
		carrierdeliverorderidService.save(carrierdeliverorderid);
		addMessage(redirectAttributes, "保存配送公司面单成功");
		return "redirect:"+Global.getAdminPath()+"/vws/carrierdeliverorderid/?repage";
	}
	
	@RequiresPermissions("vws:carrierdeliverorderid:edit")
	@RequestMapping(value = "delete")
	public String delete(Carrierdeliverorderid carrierdeliverorderid, RedirectAttributes redirectAttributes) {
		carrierdeliverorderidService.delete(carrierdeliverorderid);
		addMessage(redirectAttributes, "删除配送公司面单成功");
		return "redirect:"+Global.getAdminPath()+"/vws/carrierdeliverorderid/?repage";
	}

}