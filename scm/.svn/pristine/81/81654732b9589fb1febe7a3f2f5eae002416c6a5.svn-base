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
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransitPathdetail;
import com.best1.scm.modules.delivery.service.DeliveryOrderintransitPathdetailService;

/**
 * 订单包裹配送在途路由信息表Controller
 * @author hwh
 * @version 2016-03-02
 */
@Controller
@RequestMapping(value = "${adminPath}/delivery/deliveryOrderintransitPathdetail")
public class DeliveryOrderintransitPathdetailController extends BaseController {

	@Autowired
	private DeliveryOrderintransitPathdetailService deliveryOrderintransitPathdetailService;
	
	@ModelAttribute
	public DeliveryOrderintransitPathdetail get(@RequestParam(required=false) String id) {
		DeliveryOrderintransitPathdetail entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = deliveryOrderintransitPathdetailService.get(id);
		}
		if (entity == null){
			entity = new DeliveryOrderintransitPathdetail();
		}
		return entity;
	}
	
	@RequiresPermissions("delivery:deliveryOrderintransitPathdetail:view")
	@RequestMapping(value = {"list", ""})
	public String list(DeliveryOrderintransitPathdetail deliveryOrderintransitPathdetail, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<DeliveryOrderintransitPathdetail> page = deliveryOrderintransitPathdetailService.findPage(new Page<DeliveryOrderintransitPathdetail>(request, response), deliveryOrderintransitPathdetail); 
		model.addAttribute("page", page);
		return "modules/delivery/deliveryOrderintransitPathdetailList";
	}

	@RequiresPermissions("delivery:deliveryOrderintransitPathdetail:view")
	@RequestMapping(value = "form")
	public String form(DeliveryOrderintransitPathdetail deliveryOrderintransitPathdetail, Model model) {
		model.addAttribute("deliveryOrderintransitPathdetail", deliveryOrderintransitPathdetail);
		return "modules/delivery/deliveryOrderintransitPathdetailForm";
	}

	@RequiresPermissions("delivery:deliveryOrderintransitPathdetail:edit")
	@RequestMapping(value = "save")
	public String save(DeliveryOrderintransitPathdetail deliveryOrderintransitPathdetail, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, deliveryOrderintransitPathdetail)){
			return form(deliveryOrderintransitPathdetail, model);
		}
		deliveryOrderintransitPathdetailService.save(deliveryOrderintransitPathdetail);
		addMessage(redirectAttributes, "保存订单包裹配送在途路由信息表成功");
		return "redirect:"+Global.getAdminPath()+"/delivery/deliveryOrderintransitPathdetail/?repage";
	}
	
	@RequiresPermissions("delivery:deliveryOrderintransitPathdetail:edit")
	@RequestMapping(value = "delete")
	public String delete(DeliveryOrderintransitPathdetail deliveryOrderintransitPathdetail, RedirectAttributes redirectAttributes) {
		deliveryOrderintransitPathdetailService.delete(deliveryOrderintransitPathdetail);
		addMessage(redirectAttributes, "删除订单包裹配送在途路由信息表成功");
		return "redirect:"+Global.getAdminPath()+"/delivery/deliveryOrderintransitPathdetail/?repage";
	}

}