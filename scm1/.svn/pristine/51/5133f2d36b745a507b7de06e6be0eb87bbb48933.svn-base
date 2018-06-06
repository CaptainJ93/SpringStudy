/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.supplier.web;

import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.best1.scm.common.config.Global;
import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.web.BaseController;
import com.best1.scm.common.utils.DateUtils;
import com.best1.scm.common.utils.SCMConstants;
import com.best1.scm.common.utils.StringUtils;
import com.best1.scm.common.utils.excel.ExportExcel;
import com.best1.scm.common.utils.excel.ImportExcel;
import com.best1.scm.modules.returnpackage.entity.ReturnReturnintransit;
import com.best1.scm.modules.supplier.entity.ScmSupplierSrodetail;
import com.best1.scm.modules.supplier.service.ScmSupplierSrodetailService;
import com.best1.scm.modules.sys.entity.Office;
import com.best1.scm.modules.sys.entity.User;
import com.best1.scm.modules.sys.utils.UserUtils;

/**
 * 供应商-退货单明细信息Controller
 * 
 * @author admin
 * @version 2016-12-23
 */
@Controller
@RequestMapping(value = "${adminPath}/supplier/scmSupplierSrodetail")
public class ScmSupplierSrodetailController extends BaseController {

	@Autowired
	private ScmSupplierSrodetailService scmSupplierSrodetailService;

	@ModelAttribute
	public ScmSupplierSrodetail get(@RequestParam(required = false) String id) {
		ScmSupplierSrodetail entity = null;
		if (StringUtils.isNotBlank(id)) {
			entity = scmSupplierSrodetailService.get(id);
		}
		if (entity == null) {
			entity = new ScmSupplierSrodetail();
		}
		return entity;
	}

	@RequiresPermissions("supplier:scmSupplierSrodetail:view")
	@RequestMapping(value = { "list", "" })
	public String list(ScmSupplierSrodetail scmSupplierSrodetail,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		Page<ScmSupplierSrodetail> page = scmSupplierSrodetailService.findPage(
				new Page<ScmSupplierSrodetail>(request, response),
				scmSupplierSrodetail);
		model.addAttribute("page", page);
		return "modules/supplier/scmSupplierSrodetailList";
	}
	
	@RequiresPermissions("supplier:scmSupplierSrodetail:view")
	@RequestMapping(value = "form")
	public String form(ScmSupplierSrodetail scmSupplierSrodetail, Model model) {
		model.addAttribute("scmSupplierSrodetail", scmSupplierSrodetail);
		return "modules/supplier/scmSupplierSrodetailForm";
	}

	@RequiresPermissions("supplier:scmSupplierSrodetail:edit")
	@RequestMapping(value = "save")
	public String save(ScmSupplierSrodetail scmSupplierSrodetail, 
			HttpServletRequest request, HttpServletResponse response,
			Model model,RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, scmSupplierSrodetail)) {
			return form(scmSupplierSrodetail, model);
		}
		model.addAttribute("scmSupplierSrodetail", scmSupplierSrodetail);
		addMessage(redirectAttributes, "删除供应商-退货单明细信息成功");
		return "redirect:" + Global.getAdminPath()
				+ "/supplier/scmSupplierSrodetail/?repage";
	}
	
	@RequiresPermissions("supplier:scmSupplierSrodetail:edit")
	@RequestMapping(value = "delete")
	public String delete(ScmSupplierSrodetail scmSupplierSrodetail,
			RedirectAttributes redirectAttributes) {
		scmSupplierSrodetailService.delete(scmSupplierSrodetail);
		addMessage(redirectAttributes, "删除供应商-退货单明细信息成功");
		return "redirect:" + Global.getAdminPath()
				+ "/supplier/scmSupplierSrodetail/?repage";
	}

}