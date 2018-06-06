/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.delivery.web;


import java.util.List;

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
import com.best1.scm.common.utils.SCMConstants;
import com.best1.scm.common.utils.StringUtils;
import com.best1.scm.common.web.BaseController;
import com.best1.scm.modules.delivery.entity.ScmComplaintDetail;
import com.best1.scm.modules.delivery.entity.ScmComplaintHeader;
import com.best1.scm.modules.delivery.service.ScmComplaintDetailService;
import com.best1.scm.modules.delivery.service.ScmComplaintHeaderService;
import com.best1.scm.modules.sys.utils.UserUtils;

/**
 * 配送包裹客诉处理detailController
 * @author admin
 * @version 2016-12-22
 */
@Controller
@RequestMapping(value = "${adminPath}/delivery/scmComplaintDetail")
public class ScmComplaintDetailController extends BaseController {

	@Autowired
	private ScmComplaintDetailService scmComplaintDetailService;
	@Autowired
	private ScmComplaintHeaderService scmComplaintHeaderService;
	
	
	@ModelAttribute
	public ScmComplaintDetail get(@RequestParam(required=false) String id) {
		ScmComplaintDetail entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = scmComplaintDetailService.get(id);
		}
		if (entity == null){
			entity = new ScmComplaintDetail();
		}
		return entity;
	}
	
	@RequiresPermissions("delivery:scmComplaintDetail:view")
	@RequestMapping(value = {"list", ""})
	public String list(ScmComplaintDetail scmComplaintDetail, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<ScmComplaintDetail> page = scmComplaintDetailService.findPage(new Page<ScmComplaintDetail>(request, response), scmComplaintDetail); 
		model.addAttribute("page", page);
		ScmComplaintHeader scmComplaintHeader=scmComplaintDetailService.getScmComplaintHeader(scmComplaintDetail);
		model.addAttribute("scmComplaintHeader", scmComplaintHeader);
		
		if(UserUtils.getSubject().hasRole(SCMConstants.ROLE_ADMIN)) {
			return "modules/delivery/scmComplaintDetailList";
		}
		
		if(UserUtils.getSubject().hasRole(SCMConstants.ROLE_CARRIER)) {
			String deliveryCode=scmComplaintDetail.getCurrentUser().getOffice().getCode();
			if(!deliveryCode.equals(scmComplaintHeader.getCpselectedcarrier())){
				return "error/403";
			}
		}
		
		if(UserUtils.getSubject().hasRole(SCMConstants.ROLE_SUPPLIER)) {
			ScmComplaintHeader sch=new ScmComplaintHeader();
			sch.setCpid(new Long(scmComplaintDetail.getCpid()));
			String deliveryCode=UserUtils.getUser().getId();
			sch.setLoginid(deliveryCode);
			List<ScmComplaintHeader> s=scmComplaintHeaderService.findList(sch);
			if(s==null||s.size()==0){
				return "error/403";
			}
		}
		
		return "modules/delivery/scmComplaintDetailList";
	}

	@RequiresPermissions("delivery:scmComplaintDetail:view")
	@RequestMapping(value = "form")
	public String form(ScmComplaintDetail scmComplaintDetail, Model model) {
		model.addAttribute("scmComplaintDetail", scmComplaintDetail);
		return "modules/delivery/scmComplaintDetailForm";
	}

	@RequiresPermissions("delivery:scmComplaintDetail:edit")
	@RequestMapping(value = "save")
	public String save(ScmComplaintDetail scmComplaintDetail, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, scmComplaintDetail)){
			return form(scmComplaintDetail, model);
		}
		ScmComplaintDetail s=scmComplaintDetailService.saveDetail(scmComplaintDetail);
		scmComplaintDetailService.save(s);
		addMessage(redirectAttributes, "保存配送包裹客诉处理detail成功");
		return "redirect:"+Global.getAdminPath()+"/delivery/scmComplaintDetail/list?cpid="+scmComplaintDetail.getCpid();
	}
	
	@RequiresPermissions("delivery:scmComplaintDetail:edit")
	@RequestMapping(value = "delete")
	public String delete(ScmComplaintDetail scmComplaintDetail, RedirectAttributes redirectAttributes) {
		scmComplaintDetailService.delete(scmComplaintDetail);
		addMessage(redirectAttributes, "删除配送包裹客诉处理detail成功");
		return "redirect:"+Global.getAdminPath()+"/delivery/scmComplaintDetail/?repage";
	}

}