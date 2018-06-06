/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.returnpackage.web;

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
import com.best1.scm.modules.returnpackage.entity.ReturnReturnintransitDetail;
import com.best1.scm.modules.returnpackage.service.ReturnReturnintransitDetailService;

/**
 * 退换货明细Controller
 * @author hwh
 * @version 2016-03-15
 */
@Controller
@RequestMapping(value = "${adminPath}/returnpackage/returnReturnintransitDetail")
public class ReturnReturnintransitDetailController extends BaseController {

	@Autowired
	private ReturnReturnintransitDetailService returnReturnintransitDetailService;
	
	@ModelAttribute
	public ReturnReturnintransitDetail get(@RequestParam(required=false) String id) {
		ReturnReturnintransitDetail entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = returnReturnintransitDetailService.get(id);
		}
		if (entity == null){
			entity = new ReturnReturnintransitDetail();
		}
		return entity;
	}
	
	@RequiresPermissions("returnpackage:returnReturnintransitDetail:view")
	@RequestMapping(value = {"list", ""})
	public String list(ReturnReturnintransitDetail returnReturnintransitDetail, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<ReturnReturnintransitDetail> page = returnReturnintransitDetailService.findPage(new Page<ReturnReturnintransitDetail>(request, response), returnReturnintransitDetail); 
		model.addAttribute("page", page);
		return "modules/returnpackage/returnReturnintransitDetailList";
	}

	@RequiresPermissions("returnpackage:returnReturnintransitDetail:view")
	@RequestMapping(value = "form")
	public String form(ReturnReturnintransitDetail returnReturnintransitDetail, Model model) {
		model.addAttribute("returnReturnintransitDetail", returnReturnintransitDetail);
		return "modules/returnpackage/returnReturnintransitDetailForm";
	}

	@RequiresPermissions("returnpackage:returnReturnintransitDetail:edit")
	@RequestMapping(value = "save")
	public String save(ReturnReturnintransitDetail returnReturnintransitDetail, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, returnReturnintransitDetail)){
			return form(returnReturnintransitDetail, model);
		}
		returnReturnintransitDetailService.save(returnReturnintransitDetail);
		addMessage(redirectAttributes, "保存退换货明细成功");
		return "redirect:"+Global.getAdminPath()+"/returnpackage/returnReturnintransitDetail/?repage";
	}
	
	@RequiresPermissions("returnpackage:returnReturnintransitDetail:edit")
	@RequestMapping(value = "delete")
	public String delete(ReturnReturnintransitDetail returnReturnintransitDetail, RedirectAttributes redirectAttributes) {
		returnReturnintransitDetailService.delete(returnReturnintransitDetail);
		addMessage(redirectAttributes, "删除退换货明细成功");
		return "redirect:"+Global.getAdminPath()+"/returnpackage/returnReturnintransitDetail/?repage";
	}

}