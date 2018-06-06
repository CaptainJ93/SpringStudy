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

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.web.BaseController;
import com.best1.scm.common.utils.SCMConstants;
import com.best1.scm.common.utils.StringUtils;
import com.best1.scm.modules.delivery.entity.ScmComplaintHeader;
import com.best1.scm.modules.delivery.service.ScmComplaintHeaderService;
import com.best1.scm.modules.sys.utils.UserUtils;

/**
 * 配送包裹客诉处理headerController
 * @author admin
 * @version 2016-12-22
 */
@Controller
@RequestMapping(value = "${adminPath}/delivery/scmComplaintHeader")
public class ScmComplaintHeaderController extends BaseController {

	@Autowired
	private ScmComplaintHeaderService scmComplaintHeaderService;
	
	@ModelAttribute
	public ScmComplaintHeader get(@RequestParam(required=false) String id) {
		ScmComplaintHeader entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = scmComplaintHeaderService.get(id);
		}
		if (entity == null){
			entity = new ScmComplaintHeader();
		}
		return entity;
	}
	
	@RequiresPermissions("delivery:scmComplaintHeader:view")
	@RequestMapping(value = {"business"})
	public String business(ScmComplaintHeader scmComplaintHeader, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<ScmComplaintHeader> page = scmComplaintHeaderService.findPage(new Page<ScmComplaintHeader>(request, response), scmComplaintHeader); 
		model.addAttribute("page", page);
		return "modules/delivery/scmComplaintHeaderBusiness";
	}
	
	@RequiresPermissions("delivery:scmComplaintHeader:view")
	@RequestMapping(value = {"carrier"})
	public String carrier(ScmComplaintHeader scmComplaintHeader, HttpServletRequest request, HttpServletResponse response, Model model) {
		scmComplaintHeader.setCptype(SCMConstants.Scm_Complaint_Cptype_Carrier);
		String deliveryCode = null;
		if(UserUtils.getSubject().hasRole(SCMConstants.ROLE_CARRIER)) {
			deliveryCode=scmComplaintHeader.getCurrentUser().getOffice().getCode();
			scmComplaintHeader.setCpselectedcarrier(deliveryCode);
		}	
		if (!StringUtils.isBlank(deliveryCode)
				&& scmComplaintHeader != null
				&& ((!StringUtils.isBlank(scmComplaintHeader.getTrackingnumber())))
					||(!StringUtils.isBlank(scmComplaintHeader.getProductname()))
					||((scmComplaintHeader.getItemid())!=null)
					||(!StringUtils.isBlank(scmComplaintHeader.getCphandledprogress()))) {
			scmComplaintHeader.setCpselectedcarrier(deliveryCode);
			Page<ScmComplaintHeader> page = scmComplaintHeaderService.findPage(new Page<ScmComplaintHeader>(request,
							response), scmComplaintHeader);
			model.addAttribute("page", page);
		}
		return "modules/delivery/scmComplaintHeaderCarrier";
	}
	@RequiresPermissions("delivery:scmComplaintHeader:view")
	@RequestMapping(value = {"supplier"})
	public String supplier(ScmComplaintHeader scmComplaintHeader, HttpServletRequest request, HttpServletResponse response, Model model) {
		scmComplaintHeader.setCptype(SCMConstants.Scm_Complaint_Cptype_Supplier);
		String deliveryCode = null;
		if(UserUtils.getSubject().hasRole(SCMConstants.ROLE_SUPPLIER)) {
			deliveryCode=UserUtils.getUser().getId();
			scmComplaintHeader.setLoginid(deliveryCode);
		}
		if (!StringUtils.isBlank(deliveryCode)
				&& scmComplaintHeader != null
				&& ((!StringUtils.isBlank(scmComplaintHeader.getTrackingnumber())))
					||(!StringUtils.isBlank(scmComplaintHeader.getProductname()))
					||((scmComplaintHeader.getItemid())!=null)
					||(!StringUtils.isBlank(scmComplaintHeader.getCphandledprogress()))) {
			Page<ScmComplaintHeader> page = scmComplaintHeaderService.findPage(new Page<ScmComplaintHeader>(request,
							response), scmComplaintHeader);
			model.addAttribute("page", page);
		}
		return "modules/delivery/scmComplaintHeaderSupplier";
	}
}