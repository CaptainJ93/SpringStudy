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
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransitDetail;
import com.best1.scm.modules.delivery.service.DeliveryOrderintransitDetailService;

/**
 * 配送包裹明细Controller
 * @author hwh
 * @version 2016-03-02
 */
@Controller
@RequestMapping(value = "${adminPath}/delivery/deliveryOrderintransitDetail")
public class DeliveryOrderintransitDetailController extends BaseController {

	@Autowired
	private DeliveryOrderintransitDetailService deliveryOrderintransitDetailService;
	
	@ModelAttribute
	public DeliveryOrderintransitDetail get(@RequestParam(required=false) String id) {
		DeliveryOrderintransitDetail entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = deliveryOrderintransitDetailService.get(id);
		}
		if (entity == null){
			entity = new DeliveryOrderintransitDetail();
		}
		return entity;
	}
	
	@RequiresPermissions("delivery:deliveryOrderintransitDetail:view")
	@RequestMapping(value = {"list", ""})
	public String list(DeliveryOrderintransitDetail deliveryOrderintransitDetail, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<DeliveryOrderintransitDetail> page = deliveryOrderintransitDetailService.findPage(new Page<DeliveryOrderintransitDetail>(request, response), deliveryOrderintransitDetail); 
		model.addAttribute("page", page);
		return "modules/delivery/deliveryOrderintransitDetailList";
	}

	@RequiresPermissions("delivery:deliveryOrderintransitDetail:view")
	@RequestMapping(value = "form")
	public String form(DeliveryOrderintransitDetail deliveryOrderintransitDetail, Model model) {
		model.addAttribute("deliveryOrderintransitDetail", deliveryOrderintransitDetail);
		return "modules/delivery/deliveryOrderintransitDetailForm";
	}

	@RequiresPermissions("delivery:deliveryOrderintransitDetail:edit")
	@RequestMapping(value = "save")
	public String save(DeliveryOrderintransitDetail deliveryOrderintransitDetail, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, deliveryOrderintransitDetail)){
			return form(deliveryOrderintransitDetail, model);
		}
		deliveryOrderintransitDetailService.save(deliveryOrderintransitDetail);
		addMessage(redirectAttributes, "保存配送包裹明细成功");
		return "redirect:"+Global.getAdminPath()+"/delivery/deliveryOrderintransitDetail/?repage";
	}
	
	@RequiresPermissions("delivery:deliveryOrderintransitDetail:edit")
	@RequestMapping(value = "delete")
	public String delete(DeliveryOrderintransitDetail deliveryOrderintransitDetail, RedirectAttributes redirectAttributes) {
		deliveryOrderintransitDetailService.delete(deliveryOrderintransitDetail);
		addMessage(redirectAttributes, "删除配送包裹明细成功");
		return "redirect:"+Global.getAdminPath()+"/delivery/deliveryOrderintransitDetail/?repage";
	}

}