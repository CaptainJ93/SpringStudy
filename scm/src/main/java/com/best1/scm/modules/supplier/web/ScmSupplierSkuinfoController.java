/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.supplier.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

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
import com.best1.scm.common.utils.StringUtils;
import com.best1.scm.common.web.BaseController;
import com.best1.scm.modules.supplier.entity.ScmSupplierSkuinfo;
import com.best1.scm.modules.supplier.web.ScmSupplierSkuinfoController;
import com.best1.scm.modules.supplier.service.ScmSupplierSkuinfoService;
import com.best1.scm.modules.sys.entity.User;
import com.best1.scm.modules.sys.utils.UserUtils;

/**
 * 供应商-商品信息Controller
 * 
 * @author admin
 * @version 2016-12-22
 */
@Controller
@RequestMapping(value = "${adminPath}/supplier/scmSupplierSkuinfo")
public class ScmSupplierSkuinfoController extends BaseController {

	@Autowired
	private ScmSupplierSkuinfoService scmSupplierSkuinfoService;

	@ModelAttribute
	public ScmSupplierSkuinfo get(@RequestParam(required = false) String id) {
		ScmSupplierSkuinfo entity = null;
		if (StringUtils.isNotBlank(id)) {
			entity = scmSupplierSkuinfoService.get(id);
		}
		if (entity == null) {
			entity = new ScmSupplierSkuinfo();
		}
		return entity;
	}

	@RequiresPermissions(value = { "supplier:scmSupplierSkuinfo:supplier" })
	@RequestMapping(value = { "home" })
	public String home(ScmSupplierSkuinfo scmSupplierSkuinfo,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		return "modules/supplier/scmSupplierSkuinfoList";
	}

	@RequiresPermissions("supplier:scmSupplierSkuinfo:supplier")
	@RequestMapping(value = { "list4Supplier" })
	public String list4Supplier(ScmSupplierSkuinfo scmSupplierSkuinfo,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		User user = scmSupplierSkuinfo.getCurrentUser();
		scmSupplierSkuinfo.setSupplierid(Long.valueOf(user.getNo()));
		Page<ScmSupplierSkuinfo> page = scmSupplierSkuinfoService.findPage(
				new Page<ScmSupplierSkuinfo>(request, response),
				scmSupplierSkuinfo);
		model.addAttribute("page", page);
		return "modules/supplier/scmSupplierSkuinfoList";
	}

	@RequiresPermissions("supplier:scmSupplierSkuinfo:view")
	@RequestMapping(value = { "list" })
	public String list(ScmSupplierSkuinfo scmSupplierSkuinfo,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		Page<ScmSupplierSkuinfo> page = scmSupplierSkuinfoService.findPage(
				new Page<ScmSupplierSkuinfo>(request, response),
				scmSupplierSkuinfo);
		model.addAttribute("page", page);
		return "modules/supplier/scmSupplierSkuinfoList";
	}

	@RequiresPermissions(value = { "supplier:scmSupplierSkuinfo:supplier" })
	@RequestMapping(value = "form")
	public String form(ScmSupplierSkuinfo scmSupplierSkuinfo, Model model) {
		model.addAttribute("scmSupplierSkuinfo", scmSupplierSkuinfo);
		return "modules/supplier/scmSupplierSkuinfoForm";
	}

	@RequiresPermissions("supplier:scmSupplierSkuinfo:edit")
	@RequestMapping(value = "save")
	public String save(ScmSupplierSkuinfo scmSupplierSkuinfo, Model model,
			RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, scmSupplierSkuinfo)) {
			return form(scmSupplierSkuinfo, model);
		}
		scmSupplierSkuinfoService.save(scmSupplierSkuinfo);
		addMessage(redirectAttributes, "保存供应商-商品信息成功");
		return "redirect:" + Global.getAdminPath()
				+ "/supplier/scmSupplierSkuinfo/?repage";
	}

	@RequiresPermissions("supplier:scmSupplierSkuinfo:edit")
	@RequestMapping(value = "delete")
	public String delete(ScmSupplierSkuinfo scmSupplierSkuinfo,
			RedirectAttributes redirectAttributes) {
		scmSupplierSkuinfoService.delete(scmSupplierSkuinfo);
		addMessage(redirectAttributes, "删除供应商-商品信息成功");
		return "redirect:" + Global.getAdminPath()
				+ "/supplier/scmSupplierSkuinfo/?repage";
	}

	@RequiresPermissions("supplier:scmSupplierSkuinfo:supplier")
	@RequestMapping(value = { "skuinfoireport" })
	public String skuinfoireport(ScmSupplierSkuinfo scmSupplierSkuinfo,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
			User user = scmSupplierSkuinfo.getCurrentUser();
			scmSupplierSkuinfo.setSupplierid(Long.valueOf(user.getNo()));
			List<ScmSupplierSkuinfo> scmSupplierSkuinfolist = scmSupplierSkuinfoService.findList(scmSupplierSkuinfo);
			// 报表数据源
			JRDataSource jrDataSource = new JRBeanCollectionDataSource(
					scmSupplierSkuinfolist);
			// 动态指定报表模板url
			model.addAttribute("url", "classpath:/ireport/SkuinfoBarcode.jasper");
			model.addAttribute("format", "pdf"); // 报表格式
			model.addAttribute("jrMainDataSource", jrDataSource);
			model.addAttribute("SUBREPORT_DIR",
					ScmSupplierSkuinfoController.class.getClassLoader()
							.getResource("").getPath()
							+ "/ireport/");
	    return "iReport"; // 对应jasper-defs.xml中的bean id
	  }
	
	@RequiresPermissions("supplier:scmSupplierSkuinfo:view")
	@RequestMapping(value = { "adminskuinfoireport" })
	public String adminskuinfoireport(ScmSupplierSkuinfo scmSupplierSkuinfo,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		if(UserUtils.getSubject().hasRole("dept")){ 
			List<ScmSupplierSkuinfo> scmSupplierSkuinfolist = scmSupplierSkuinfoService.findList(scmSupplierSkuinfo);
			// 报表数据源
			JRDataSource jrDataSource = new JRBeanCollectionDataSource(
					scmSupplierSkuinfolist);
			// 动态指定报表模板url
			model.addAttribute("url", "classpath:/ireport/SkuinfoBarcode.jasper");
			model.addAttribute("format", "pdf"); // 报表格式
			model.addAttribute("jrMainDataSource", jrDataSource);
			model.addAttribute("SUBREPORT_DIR",
					ScmSupplierSkuinfoController.class.getClassLoader()
							.getResource("").getPath()
							+ "/ireport/");
	    return "iReport"; // 对应jasper-defs.xml中的bean id
		}else{
			return "modules/supplier/scmSupplierSkuinfoList";
		}
	  }
	
}

