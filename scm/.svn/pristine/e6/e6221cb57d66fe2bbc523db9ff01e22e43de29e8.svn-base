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
import com.best1.scm.modules.vws.entity.Carrierzipcode;
import com.best1.scm.modules.vws.service.CarrierzipcodeService;

/**
 * 配送区域时效Controller
 * @author hwh
 * @version 2016-02-26
 */
@Controller
@RequestMapping(value = "${adminPath}/vws/carrierzipcode")
public class CarrierzipcodeController extends BaseController {

	@Autowired
	private CarrierzipcodeService carrierzipcodeService;
	
	@ModelAttribute
	public Carrierzipcode get(@RequestParam(required=false) String id) {
		Carrierzipcode entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = carrierzipcodeService.get(id);
		}
		if (entity == null){
			entity = new Carrierzipcode();
		}
		return entity;
	}
	
	@RequiresPermissions("vws:carrierzipcode:view")
	@RequestMapping(value = {"list", ""})
	public String list(Carrierzipcode carrierzipcode, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<Carrierzipcode> page = carrierzipcodeService.findPage(new Page<Carrierzipcode>(request, response), carrierzipcode); 
		model.addAttribute("page", page);
		return "modules/vws/carrierzipcodeList";
	}

	@RequiresPermissions("vws:carrierzipcode:view")
	@RequestMapping(value = "form")
	public String form(Carrierzipcode carrierzipcode, Model model) {
		model.addAttribute("carrierzipcode", carrierzipcode);
		return "modules/vws/carrierzipcodeForm";
	}

	@RequiresPermissions("vws:carrierzipcode:edit")
	@RequestMapping(value = "save")
	public String save(Carrierzipcode carrierzipcode, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, carrierzipcode)){
			return form(carrierzipcode, model);
		}
		carrierzipcodeService.save(carrierzipcode);
		addMessage(redirectAttributes, "保存配送区域时效成功");
		return "redirect:"+Global.getAdminPath()+"/vws/carrierzipcode/?repage";
	}
	
	@RequiresPermissions("vws:carrierzipcode:edit")
	@RequestMapping(value = "delete")
	public String delete(Carrierzipcode carrierzipcode, RedirectAttributes redirectAttributes) {
		carrierzipcodeService.delete(carrierzipcode);
		addMessage(redirectAttributes, "删除配送区域时效成功");
		return "redirect:"+Global.getAdminPath()+"/vws/carrierzipcode/?repage";
	}

}