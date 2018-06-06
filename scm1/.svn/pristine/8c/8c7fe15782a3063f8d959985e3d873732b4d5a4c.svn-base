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
import com.best1.scm.modules.deliveryfee.entity.ScmDeliveryfeePrice;
import com.best1.scm.modules.deliveryfee.service.ScmDeliveryfeePriceService;

/**
 * 配送费用计算Controller
 * @author admin
 * @version 2016-07-27
 */
@Controller
@RequestMapping(value = "${adminPath}/deliveryfee/scmDeliveryfeePrice")
public class ScmDeliveryfeePriceController extends BaseController {

	@Autowired
	private ScmDeliveryfeePriceService scmDeliveryfeePriceService;
	
	@ModelAttribute
	public ScmDeliveryfeePrice get(@RequestParam(required=false) String id) {
		ScmDeliveryfeePrice entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = scmDeliveryfeePriceService.get(id);
		}
		if (entity == null){
			entity = new ScmDeliveryfeePrice();
		}
		return entity;
	}
	
	@RequiresPermissions("deliveryfee:scmDeliveryfeePrice:view")
	@RequestMapping(value = {"list", ""})
	public String list(ScmDeliveryfeePrice scmDeliveryfeePrice, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<ScmDeliveryfeePrice> page = scmDeliveryfeePriceService.findPage(new Page<ScmDeliveryfeePrice>(request, response), scmDeliveryfeePrice); 
		model.addAttribute("page", page);
		return "modules/deliveryfee/scmDeliveryfeePriceList";
	}

	@RequiresPermissions("deliveryfee:scmDeliveryfeePrice:view")
	@RequestMapping(value = "form")
	public String form(ScmDeliveryfeePrice scmDeliveryfeePrice, Model model) {
		model.addAttribute("scmDeliveryfeePrice", scmDeliveryfeePrice);
		return "modules/deliveryfee/scmDeliveryfeePriceForm";
	}

	@RequiresPermissions("deliveryfee:scmDeliveryfeePrice:edit")
	@RequestMapping(value = "save")
	public String save(ScmDeliveryfeePrice scmDeliveryfeePrice, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, scmDeliveryfeePrice)){
			return form(scmDeliveryfeePrice, model);
		}
		scmDeliveryfeePriceService.save(scmDeliveryfeePrice);
		addMessage(redirectAttributes, "保存配送费用计算成功");
		return "redirect:"+Global.getAdminPath()+"/deliveryfee/scmDeliveryfeePrice/?repage";
	}
	
	@RequiresPermissions("deliveryfee:scmDeliveryfeePrice:edit")
	@RequestMapping(value = "delete")
	public String delete(ScmDeliveryfeePrice scmDeliveryfeePrice, RedirectAttributes redirectAttributes) {
		scmDeliveryfeePriceService.delete(scmDeliveryfeePrice);
		addMessage(redirectAttributes, "删除配送费用计算成功");
		return "redirect:"+Global.getAdminPath()+"/deliveryfee/scmDeliveryfeePrice/?repage";
	}

}