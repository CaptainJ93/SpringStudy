/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.delivery.web;

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
import com.best1.scm.common.web.BaseController;
import com.best1.scm.common.utils.DateUtils;
import com.best1.scm.common.utils.SCMConstants;
import com.best1.scm.common.utils.StringUtils;
import com.best1.scm.modules.delivery.entity.DelieryOrderReport;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransit;
import com.best1.scm.modules.delivery.service.DeliveryOrderReportService;
import com.best1.scm.modules.delivery.service.DeliveryOrderintransitService;
import com.best1.scm.modules.irpeort.entity.JavaBeanPerson;
import com.best1.scm.modules.sys.entity.Office;
import com.best1.scm.modules.sys.utils.UserUtils;

/**
 * 配送包裹Controller
 * 
 * @author hwh
 * @version 2016-03-02
 */
@Controller
@RequestMapping(value = "${adminPath}/delivery/deliveryOrderintransit")
public class DeliveryOrderintransitController extends BaseController {

	@Autowired
	private DeliveryOrderintransitService deliveryOrderintransitService;

	@Autowired
	private DeliveryOrderReportService deliveryOrderReportService;

	@ModelAttribute
	public DeliveryOrderintransit get(@RequestParam(required = false) String id) {
		DeliveryOrderintransit entity = null;
		if (StringUtils.isNotBlank(id)) {
			entity = deliveryOrderintransitService.get(id);
		}
		if (entity == null) {
			entity = new DeliveryOrderintransit();
		}
		return entity;
	}

	@RequiresPermissions("delivery:deliveryOrderintransit:view")
	@RequestMapping(value = "deliveryDetail")
	public String deliveryDetail(DeliveryOrderintransit entity, Model model) {
		if (StringUtils.isNotBlank(entity.getId())) {
			entity = deliveryOrderintransitService.deliveryDetail(entity
					.getId());
		}
		if (entity == null) {
			entity = new DeliveryOrderintransit();
		}
		model.addAttribute("deliveryOrderintransit", entity);
		return "modules/delivery/deliveryOrderintransitInfo";

	}

	@RequiresPermissions("delivery:deliveryOrderintransit:view")
	@RequestMapping(value = { "list", "" })
	public String list(DeliveryOrderintransit deliveryOrderintransit,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		Page<DeliveryOrderintransit> page = deliveryOrderintransitService
				.findPage(new Page<DeliveryOrderintransit>(request, response),
						deliveryOrderintransit);
		model.addAttribute("page", page);
		return "modules/delivery/deliveryOrderintransitList";
	}

	@RequiresPermissions("delivery:deliveryOrderintransit:view")
	@RequestMapping(value = { "deliverReportList" })
	public String deliverReportList(DelieryOrderReport delieryOrderReport,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		if(delieryOrderReport.getCreateDateStart()==null||delieryOrderReport.getCreateDateEnd()==null)
		{
			delieryOrderReport.setCreateDateEnd(DateUtils.getTodayTime());
			delieryOrderReport.setCreateDateStart(DateUtils.addHours(DateUtils.getTodayTime(),-24));
		}
		Page<DelieryOrderReport> page = deliveryOrderReportService.findPage(
				new Page<DelieryOrderReport>(request, response), delieryOrderReport);
		model.addAttribute("page", page);
		return "modules/delivery/delieryOrderReportList";
	}
	
	@RequiresPermissions("delivery:deliveryOrderintransit:view")
	@RequestMapping(value = { "deliverAreaReportList" })
	public String deliverAreaReportList(DelieryOrderReport delieryOrderReport,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		if(delieryOrderReport.getCreateDateStart()==null||delieryOrderReport.getCreateDateEnd()==null)
		{
			delieryOrderReport.setCreateDateEnd(DateUtils.getTodayTime());
			delieryOrderReport.setCreateDateStart(DateUtils.addHours(DateUtils.getTodayTime(),-24));
		}
		Page<DelieryOrderReport> page = deliveryOrderReportService.findAllPage(
				new Page<DelieryOrderReport>(request, response), delieryOrderReport);
		model.addAttribute("page", page);
		return "modules/delivery/delieryAreaOrderReportList";
	}


	@RequiresPermissions("delivery:deliveryOrderintransit:logistics")
	@RequestMapping(value = { "logistics" })
	public String logistics(DeliveryOrderintransit deliveryOrderintransit,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		String deliveryCode = null;
		List<Office> officelist = UserUtils.getOfficeList();
		for (Office office : officelist) {
			if (office.getType().endsWith(
					SCMConstants.sys_office_type_logistics)
					&& !StringUtils.isBlank(office.getCode())) {
				deliveryCode = office.getCode();
			}
		}
		if (!StringUtils.isBlank(deliveryCode)
				&& deliveryOrderintransit != null
				&& !StringUtils.isBlank(deliveryOrderintransit
						.getTrackingnumber())) {
			deliveryOrderintransit.setSelectedcarrier(deliveryCode);
			Page<DeliveryOrderintransit> page = deliveryOrderintransitService
					.findPage(new Page<DeliveryOrderintransit>(request,
							response), deliveryOrderintransit);
			model.addAttribute("page", page);
		}
		return "modules/delivery/deliveryOrderintransitList";
	}

	@RequiresPermissions("delivery:deliveryOrderintransit:view")
	@RequestMapping(value = "form")
	public String form(DeliveryOrderintransit deliveryOrderintransit,
			Model model) {
		model.addAttribute("deliveryOrderintransit", deliveryOrderintransit);
		return "modules/delivery/deliveryOrderintransitForm";
	}

	@RequiresPermissions("delivery:deliveryOrderintransit:edit")
	@RequestMapping(value = "save")
	public String save(DeliveryOrderintransit deliveryOrderintransit,
			Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, deliveryOrderintransit)) {
			return form(deliveryOrderintransit, model);
		}
		deliveryOrderintransitService.save(deliveryOrderintransit);
		addMessage(redirectAttributes, "保存配送包裹成功");
		return "redirect:" + Global.getAdminPath()
				+ "/delivery/deliveryOrderintransit/?repage";
	}

	@RequiresPermissions("delivery:deliveryOrderintransit:edit")
	@RequestMapping(value = "delete")
	public String delete(DeliveryOrderintransit deliveryOrderintransit,
			RedirectAttributes redirectAttributes) {
		deliveryOrderintransitService.delete(deliveryOrderintransit);
		addMessage(redirectAttributes, "删除配送包裹成功");
		return "redirect:" + Global.getAdminPath()
				+ "/delivery/deliveryOrderintransit/?repage";
	}

	@RequiresPermissions("delivery:deliveryOrderintransit:view")
	@RequestMapping(value = "ireport")
	public String report(Model model) {
		// 报表数据源
		JRDataSource jrDataSource = new JRBeanCollectionDataSource(
				JavaBeanPerson.getList());
		System.out.println("新增");
		// 动态指定报表模板url
		model.addAttribute("url", "classpath:/ireport/MvcIReportExample.jasper");
		model.addAttribute("format", "pdf"); // 报表格式
		model.addAttribute("jrMainDataSource", jrDataSource);

		return "iReport"; // 对应jasper-defs.xml中的bean id
	}

}