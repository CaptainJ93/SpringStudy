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
import com.best1.scm.modules.vws.entity.CarrierInfo;
import com.best1.scm.modules.vws.service.CarrierInfoService;



/**
 * vwsController
 * @author hwh
 * @version 2016-02-23
 */
@Controller
@RequestMapping(value = "${adminPath}/vws/carrierInfo")
public class CarrierInfoController extends BaseController {

	@Autowired
	private CarrierInfoService carrierInfoService;
	
	@ModelAttribute
	public CarrierInfo get(@RequestParam(required=false) String id) {
		CarrierInfo entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = carrierInfoService.get(id);
		}
		if (entity == null){
			entity = new CarrierInfo();
		}
	
		return entity;
	}
	
	@RequiresPermissions("vws:carrierInfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(CarrierInfo carrierInfo, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<CarrierInfo> page = carrierInfoService.findPage(new Page<CarrierInfo>(request, response), carrierInfo); 
		model.addAttribute("page", page);
		return "modules/vws/carrierInfoList";
	}
	
	
	@RequestMapping(value = {"search"})
	public String search(CarrierInfo carrierInfo, HttpServletRequest request, HttpServletResponse response, Model model) {
		carrierInfo.setIssupplierused(1);
		Page<CarrierInfo> page = carrierInfoService.findPage(new Page<CarrierInfo>(request, response), carrierInfo); 
		model.addAttribute("page", page);
		return "modules/vws/carrierInfosearch";
	}
	

	@RequiresPermissions("vws:carrierInfo:view")
	@RequestMapping(value = "form")
	public String form(CarrierInfo carrierInfo, Model model) {
		model.addAttribute("carrierInfo", carrierInfo);
		return "modules/vws/carrierInfoForm";
	}

	@RequiresPermissions("vws:carrierInfo:edit")
	@RequestMapping(value = "save")
	public String save(CarrierInfo carrierInfo, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, carrierInfo)){
			return form(carrierInfo, model);
		}
		carrierInfoService.save(carrierInfo);
		addMessage(redirectAttributes, "保存配送公司成功");
		return "redirect:"+Global.getAdminPath()+"/vws/carrierInfo/?repage";
	}
	
	@RequiresPermissions("vws:carrierInfo:edit")
	@RequestMapping(value = "delete")
	public String delete(CarrierInfo carrierInfo, RedirectAttributes redirectAttributes) {
		carrierInfoService.delete(carrierInfo);
		addMessage(redirectAttributes, "删除配送公司成功");
		return "redirect:"+Global.getAdminPath()+"/vws/carrierInfo/?repage";
	}

}