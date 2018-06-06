package com.best1.scm.modules.returnpackage.web;

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
import com.best1.scm.common.utils.SCMConstants;
import com.best1.scm.common.utils.StringUtils;
import com.best1.scm.modules.irpeort.entity.ReturnPackage;
import com.best1.scm.modules.returnpackage.entity.ReturnReturnintransit;
import com.best1.scm.modules.returnpackage.service.ReturnReturnintransitService;
import com.best1.scm.modules.sys.entity.Office;
import com.best1.scm.modules.sys.utils.UserUtils;

/**
 * 退换货信息Controller
 * 
 * @author hwh
 * @version 2016-03-15
 */
@Controller
@RequestMapping(value = "${adminPath}/returnpackage/returnReturnintransit")
public class ReturnReturnintransitController extends BaseController {

	@Autowired
	private ReturnReturnintransitService returnReturnintransitService;

	@ModelAttribute
	public ReturnReturnintransit get(@RequestParam(required = false) String id) {
		ReturnReturnintransit entity = null;
		if (StringUtils.isNotBlank(id)) {
			entity = returnReturnintransitService.get(id);
		}
		if (entity == null) {
			entity = new ReturnReturnintransit();
		}
		return entity;
	}

	@RequiresPermissions("delivery:deliveryOrderintransit:view")
	@RequestMapping(value = "returnOrderDetail")
	public String returnOrderDetail(ReturnReturnintransit entity, Model model) {
		if (StringUtils.isNotBlank(entity.getId())) {
			entity = returnReturnintransitService.returnOrderDetail(entity
					.getId());
		}
		if (entity == null) {
			entity = new ReturnReturnintransit();
		}
		model.addAttribute("rdeturnReturnintransit", entity);
		return "modules/returnpackage/returnReturnintransitInfo";

	}

	@RequiresPermissions("returnpackage:returnReturnintransit:view")
	@RequestMapping(value = { "list", "" })
	public String list(ReturnReturnintransit returnReturnintransit,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		Page<ReturnReturnintransit> page = returnReturnintransitService
				.findPage(new Page<ReturnReturnintransit>(request, response),
						returnReturnintransit);
		model.addAttribute("page", page);
		return "modules/returnpackage/returnReturnintransitList";
	}

	@RequiresPermissions("returnpackage:returnReturnintransit:logistics")
	@RequestMapping(value = { "logistics" })
	public String logistics(ReturnReturnintransit returnReturnintransit,
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
				&& returnReturnintransit != null
				&& (!StringUtils.isBlank(returnReturnintransit
						.getReceiptdeliveryorderid()) || returnReturnintransit
						.getReturnid() != null)) {
			returnReturnintransit.setSelectedcarrier(Long
					.parseLong(deliveryCode));
			System.out.println(returnReturnintransit.getReturnid());
			Page<ReturnReturnintransit> page = returnReturnintransitService
					.findPage(
							new Page<ReturnReturnintransit>(request, response),
							returnReturnintransit);
			model.addAttribute("page", page);
		}
		return "modules/returnpackage/returnReturnintransitList";
	}

	@RequiresPermissions("returnpackage:returnReturnintransit:logistics")
	@RequestMapping(value = "buildDeliveryorderid")
	public String buildDeliveryorderid(
			ReturnReturnintransit returnReturnintransit,
			HttpServletRequest request, HttpServletResponse response,
			Model model, RedirectAttributes redirectAttributes) {
		String deliveryCode = null;
		List<Office> officelist = UserUtils.getOfficeList();
		for (Office office : officelist) {
			if (office.getType().endsWith(
					SCMConstants.sys_office_type_logistics)
					&& !StringUtils.isBlank(office.getCode())) {
				deliveryCode = office.getCode();
			}
		}
		if (!StringUtils.isBlank(deliveryCode) && returnReturnintransit != null) {
			returnReturnintransit.setSelectedcarrier(Long
					.parseLong(deliveryCode));

			int parameter = returnReturnintransitService
					.buildDeliveryorderid(returnReturnintransit);

			if (parameter == SCMConstants.Deliveryorderid_Status_Shortage) {
				addMessage(redirectAttributes, "此配送商面单号不足");
			} else if (parameter == SCMConstants.No_Data) {
				addMessage(redirectAttributes, "未有处理数拓");
			} else if (parameter == SCMConstants.Success) {

				addMessage(redirectAttributes, "配送商面单号重生成成功");
			}
			Page<ReturnReturnintransit> page = returnReturnintransitService
					.findPage(
							new Page<ReturnReturnintransit>(request, response),
							returnReturnintransit);
			model.addAttribute("page", page);
		}
		return "modules/returnpackage/returnReturnintransitList";
	}

	@RequiresPermissions("returnpackage:returnReturnintransit:view")
	@RequestMapping(value = "form")
	public String form(ReturnReturnintransit returnReturnintransit, Model model) {
		model.addAttribute("returnReturnintransit", returnReturnintransit);
		return "modules/returnpackage/returnReturnintransitForm";
	}

	@RequiresPermissions("returnpackage:returnReturnintransit:edit")
	@RequestMapping(value = "save")
	public String save(ReturnReturnintransit returnReturnintransit,
			Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, returnReturnintransit)) {
			return form(returnReturnintransit, model);
		}
		returnReturnintransitService.save(returnReturnintransit);
		addMessage(redirectAttributes, "保存退换货成功");
		return "redirect:" + Global.getAdminPath()
				+ "/returnpackage/returnReturnintransit/?repage";
	}

	@RequiresPermissions("returnpackage:returnReturnintransit:edit")
	@RequestMapping(value = "delete")
	public String delete(ReturnReturnintransit returnReturnintransit,
			RedirectAttributes redirectAttributes) {
		returnReturnintransitService.delete(returnReturnintransit);
		addMessage(redirectAttributes, "删除退换货成功");
		return "redirect:" + Global.getAdminPath()
				+ "/returnpackage/returnReturnintransit/?repage";
	}

	@RequiresPermissions("returnpackage:returnReturnintransit:logistics")
	@RequestMapping(value = "returnpackageireport")
	public String report(ReturnReturnintransit returnReturnintransit,
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
		if (!StringUtils.isBlank(deliveryCode) && returnReturnintransit != null) {
			returnReturnintransit.setSelectedcarrier(Long
					.parseLong(deliveryCode));
			if (StringUtils.isBlank(returnReturnintransit
					.getReceiptdeliveryorderid())
					&& returnReturnintransit.getReturnid() == null) {
				returnReturnintransit
						.setReceiptstatus(SCMConstants.Receipt_Status_build);
			}
			List<ReturnPackage> returnPackageList = returnReturnintransitService
					.findListWithDetailLable(returnReturnintransit);
			// 报表数据源
			JRDataSource jrDataSource = new JRBeanCollectionDataSource(
					returnPackageList);
			// 动态指定报表模板url
			model.addAttribute("url", "classpath:/ireport/ReturnPackage.jasper");
			model.addAttribute("format", "pdf"); // 报表格式
			model.addAttribute("jrMainDataSource", jrDataSource);
			model.addAttribute("SUBREPORT_DIR",
					ReturnReturnintransitController.class.getClassLoader()
							.getResource("").getPath()
							+ "/ireport/");
		}
		return "iReport"; // 对应jasper-defs.xml中的bean id
	}
}