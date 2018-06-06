/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.supplier.web;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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
import com.best1.scm.common.service.ServiceException;
import com.best1.scm.common.utils.Collections3;
import com.best1.scm.common.utils.DateUtils;
import com.best1.scm.common.utils.SCMConstants;
import com.best1.scm.common.utils.StringUtils;
import com.best1.scm.common.utils.excel.ExportExcel;
import com.best1.scm.common.utils.excel.ImportExcel;
import com.best1.scm.common.web.BaseController;
import com.best1.scm.modules.supplier.entity.ScmSupplierCsoinfo;
import com.best1.scm.modules.supplier.entity.ScmSupplierDeliveryOrder;
import com.best1.scm.modules.supplier.entity.ScmSupplierShipConfirmInfo;
import com.best1.scm.modules.supplier.service.ScmSupplierCsoinfoService;
import com.best1.scm.modules.sys.utils.UserUtils;
import com.best1.scm.modules.vws.entity.CarrierInfo;
import com.best1.scm.modules.vws.entity.Carrierdeliverorderid;
import com.best1.scm.modules.vws.service.CarrierInfoService;
import com.best1.scm.modules.vws.service.CarrierdeliverorderidService;
import com.google.common.collect.Lists;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;

/**
 * 指送订单Controller
 * 
 * @author fanxuankai
 * @version 2016-12-27
 */
@Controller
@RequestMapping(value = "${adminPath}/supplier/scmSupplierCsoinfo")
public class ScmSupplierCsoinfoController extends BaseController {

	@Autowired
	private ScmSupplierCsoinfoService scmSupplierCsoinfoService;

	@Autowired
	private CarrierInfoService carrierInfoService;

	@Autowired
	private CarrierdeliverorderidService carrierdeliverorderidService;

	// ModelAttribute -----------------------

	@ModelAttribute("scmSupplierCsoinfo")
	public ScmSupplierCsoinfo getCsoinfo(@RequestParam(required = false) String id) {
		ScmSupplierCsoinfo entity = null;
		if (StringUtils.isNotBlank(id)) {
			entity = scmSupplierCsoinfoService.getByRole(id);
		}
		if (entity == null) {
			entity = new ScmSupplierCsoinfo();
		}
		return entity;
	}

	@ModelAttribute("scmSupplierShipConfirmInfo")
	public ScmSupplierShipConfirmInfo getShipConfirmInfo(
			@RequestParam(name = "csoInfo.id", required = false) String csoInfoId) {
		ScmSupplierCsoinfo csoInfo = null;
		if (StringUtils.isNotBlank(csoInfoId)) {
			csoInfo = scmSupplierCsoinfoService.getByRole(csoInfoId);
		}
		if (csoInfo == null) {
			csoInfo = new ScmSupplierCsoinfo();
		}
		return scmSupplierCsoinfoService.mappingScmSupplierShipConfirmInfo(csoInfo);
	}

	// 指送订单列表 -----------------------

	@RequiresPermissions("supplier:scmSupplierCsoinfo:view")
	@RequestMapping(value = { "list", "" })
	public String list(ScmSupplierCsoinfo scmSupplierCsoinfo, HttpServletRequest request, HttpServletResponse response,
			Model model) {
		model.addAttribute("page", scmSupplierCsoinfoService
				.findPageByRole(new Page<ScmSupplierCsoinfo>(request, response), scmSupplierCsoinfo));
		return "modules/supplier/scmSupplierCsoinfoList";
	}

	/**
	 * 订单列表Excel文件下载
	 * 
	 * @param scmSupplierCsoinfo
	 * @param redirectAttributes
	 * @param response
	 * @return
	 */
	@RequiresPermissions("supplier:scmSupplierCsoinfo:download")
	@RequestMapping(value = "downloadList")
	public String downloadList(ScmSupplierCsoinfo scmSupplierCsoinfo, RedirectAttributes redirectAttributes,
			HttpServletResponse response) {
		String message = null;
		try {
			String title = "指送订单";
			new ExportExcel(title, ScmSupplierCsoinfo.class)
					.setDataList(scmSupplierCsoinfoService.findListByRole(scmSupplierCsoinfo))
					.write(response, title + DateUtils.getDate("yyyyMMddHHmmss") + ".xlsx").dispose();
			return null;
		} catch (IOException e) {
			message = e.getMessage();
		}
		addMessage(redirectAttributes, message);
		return "redirect:" + Global.getAdminPath() + "/supplier/scmSupplierCsoinfo/?repage";
	}

	/**
	 * 出货明细Excel文件下载
	 * 
	 * @param scmSupplierCsoinfo
	 * @param redirectAttributes
	 * @param response
	 * @return
	 */
	@RequiresPermissions("supplier:scmSupplierCsoinfo:downloadLogisticsDeptExcel")
	@RequestMapping(value = "downloadLogisticsDeptExcel")
	public String downloadLogisticsDeptExcel(ScmSupplierCsoinfo scmSupplierCsoinfo,
			RedirectAttributes redirectAttributes, HttpServletResponse response) {
		String message = null;
		try {
			String title = "出货明细";
			new ExportExcel(title, ScmSupplierDeliveryOrder.class)
					.setDataList(scmSupplierCsoinfoService.findCHMXListByRole(scmSupplierCsoinfo))
					.write(response, title + DateUtils.getDate("yyyyMMddHHmmss") + ".xlsx").dispose();
			return null;
		} catch (IOException e) {
			message = e.getMessage();
		}
		addMessage(redirectAttributes, message);
		return "redirect:" + Global.getAdminPath() + "/supplier/scmSupplierCsoinfo/?repage";
	}

	// 出货确认 -----------------------

	@RequiresPermissions("supplier:scmSupplierCsoinfo:shipConfirm")
	@RequestMapping(value = "downloadShipConfirmList")
	public String downloadShipConfirmList(ScmSupplierCsoinfo scmSupplierCsoinfo, RedirectAttributes redirectAttributes,
			HttpServletResponse response) {
		String message = null;
		try {
			String title = "出货确认";
			new ExportExcel(title, ScmSupplierShipConfirmInfo.class)
					.setDataList(mappingScmSupplierShipConfirmInfos(
							scmSupplierCsoinfoService.findListOnShipConfirmByRole(scmSupplierCsoinfo)))
					.write(response, title + DateUtils.getDate("yyyyMMddHHmmss") + ".xlsx").dispose();
			return null;
		} catch (IOException e) {
			message = e.getMessage();
		}
		addMessage(redirectAttributes, message);
		return "redirect:" + Global.getAdminPath() + "/supplier/scmSupplierCsoinfo/?repage";
	}

	@RequiresPermissions("supplier:scmSupplierCsoinfo:shipConfirm")
	@RequestMapping(value = "shipConfirmForm")
	public String shipConfirmForm(ScmSupplierShipConfirmInfo scmSupplierShipConfirmInfo, Model model) {
		ScmSupplierCsoinfo csoInfo = scmSupplierCsoinfoService.get(scmSupplierShipConfirmInfo.getCsoInfoId());
		scmSupplierShipConfirmInfo = scmSupplierCsoinfoService.mappingScmSupplierShipConfirmInfo(csoInfo);
		if (UserUtils.getUser().getRoleList().size() == 1
				&& SCMConstants.ROLE_CARRIER.equals(UserUtils.getUser().getRoleList().get(0).getEnname())) {
			scmSupplierShipConfirmInfo.setCarrierId(Long.valueOf(UserUtils.getUser().getOffice().getCode()));
			scmSupplierShipConfirmInfo.setCarrierName(UserUtils.getUser().getOffice().getName());
		}
		if (scmSupplierShipConfirmInfo.getCarrierId() != null && scmSupplierShipConfirmInfo.getCarrierId() != 0) {
			scmSupplierShipConfirmInfo.setCarrierReadonly(true);
		}
		model.addAttribute("carrierInfos", carrierInfoService.findList(new CarrierInfo()));
		model.addAttribute("scmSupplierShipConfirmInfo", scmSupplierShipConfirmInfo);
		return "modules/supplier/scmSupplierShipConfirmForm";
	}

	@RequiresPermissions("supplier:scmSupplierCsoinfo:shipConfirm")
	@RequestMapping(value = "shipConfirm")
	public String shipConfirm(ScmSupplierShipConfirmInfo scmSupplierShipConfirmInfo, Model model,
			RedirectAttributes redirectAttributes) {
		String message = null;
		if (!beanValidator(model, scmSupplierShipConfirmInfo)) {
			return shipConfirmForm(scmSupplierShipConfirmInfo, model);
		}
		try {
			scmSupplierCsoinfoService.shipConfirm(Arrays.asList(scmSupplierShipConfirmInfo));
			message = "出货确认成功";
		} catch (ServiceException e) {
			message = e.getMessage();
		}
		addMessage(redirectAttributes, message);
		return "redirect:" + Global.getAdminPath() + "/supplier/scmSupplierCsoinfo/?repage";
	}

	// 批量出货确认 -----------------------

	@RequiresPermissions("supplier:scmSupplierCsoinfo:shipConfirm")
	@RequestMapping(value = "batchShipConfirm")
	public String batchShipConfirm() {
		return "modules/supplier/scmSupplierBatchShipConfirm";
	}

	@RequiresPermissions("supplier:scmSupplierCsoinfo:shipConfirm")
	@RequestMapping(value = "downloadBatchShipConfirmTemplate")
	public String downloadBatchShipConfirmTemplate(RedirectAttributes redirectAttributes,
			HttpServletResponse response) {
		String message = null;
		try {
			String title = "出货确认";
			new ExportExcel(title, ScmSupplierShipConfirmInfo.class, 2)
					.setDataList(randomScmSupplierShipConfirmInfo(10))
					.write(response, title + DateUtils.getDate("yyyyMMddHHmmss") + ".xlsx").dispose();
			return null;
		} catch (IOException e) {
			message = e.getMessage();
		}
		addMessage(redirectAttributes, message);
		return "redirect:" + Global.getAdminPath() + "/supplier/scmSupplierCsoinfo/batchShipConfirm";
	}

	@RequiresPermissions("supplier:scmSupplierCsoinfo:shipConfirm")
	@RequestMapping(value = "uploadBatchShipConfirmFile")
	public String uploadBatchShipConfirmFile(MultipartFile file, RedirectAttributes redirectAttributes)
			throws Exception {
		String message = null;
		try {
			List<ScmSupplierShipConfirmInfo> list = new ImportExcel(file, 1, 0)
					.getDataList(ScmSupplierShipConfirmInfo.class);
			scmSupplierCsoinfoService.shipConfirm(list);
			message = "批量出货确认成功";
		} catch (ServiceException e) {
			message = e.getMessage();
		}
		addMessage(redirectAttributes, message);
		return "redirect:" + Global.getAdminPath() + "/supplier/scmSupplierCsoinfo/batchShipConfirm";
	}

	// 打印面单 -----------------------

	@RequiresPermissions("supplier:scmSupplierCsoinfo:print")
	@RequestMapping(value = "printList")
	public String printHome(ScmSupplierCsoinfo scmSupplierCsoinfo, HttpServletRequest request,
			HttpServletResponse response, Model model) {
		scmSupplierCsoinfo.setOrderstatus(SCMConstants.ORDER_STATUS_SHIPPING_IN_PROGRESS);
		Page<ScmSupplierCsoinfo> list = scmSupplierCsoinfoService
				.findPageByRole(new Page<ScmSupplierCsoinfo>(request, response), scmSupplierCsoinfo);
		if (!Collections3.isEmpty(list.getList())) {
			Carrierdeliverorderid carrierdeliverorderid = new Carrierdeliverorderid();
			if (UserUtils.getUser().getRoleList().size() == 1
					&& SCMConstants.ROLE_CARRIER.equals(UserUtils.getUser().getRoleList().get(0).getEnname())) {
				carrierdeliverorderid.setCarrierid(Long.valueOf(UserUtils.getUser().getOffice().getCode()));
			}
			carrierdeliverorderid.setStatus(SCMConstants.CARRIERDELIVERORDERID_STATUS_UNUSED);
			List<Carrierdeliverorderid> carrierdeliverorderids = carrierdeliverorderidService
					.findListGroupedCarrierByStatus(carrierdeliverorderid);
			model.addAttribute("carrierdeliverorderidList", carrierdeliverorderids);
		}
		model.addAttribute("page", list);
		return "modules/supplier/scmSupplierCsoinfoPrintList";
	}

	@RequiresPermissions("supplier:scmSupplierCsoinfo:print")
	@RequestMapping(value = "assignCarrier")
	public String assignCarrier(HttpServletRequest req, RedirectAttributes redirectAttributes) {
		try {
			String carrierIdStr = req.getParameter("selectCarrier");
			List<ScmSupplierCsoinfo> scmSupplierCsoinfoList = scmSupplierCsoinfoList(req);
			long carrierId = Long.parseLong(carrierIdStr);
			scmSupplierCsoinfoService.assignCarrier(scmSupplierCsoinfoList, carrierId);
			addMessage(redirectAttributes, "指派成功");
		} catch (Exception e) {
			e.printStackTrace();
			addMessage(redirectAttributes, e.getMessage());
		}
		return "redirect:" + Global.getAdminPath() + "/supplier/scmSupplierCsoinfo/printList";
	}

	@RequiresPermissions("supplier:scmSupplierCsoinfo:print")
	@RequestMapping(value = "print")
	public String print(HttpServletRequest req, Model model) throws JRException {
		List<ScmSupplierCsoinfo> scmSupplierCsoinfoList = scmSupplierCsoinfoList(req);
		if (Collections3.isEmpty(scmSupplierCsoinfoList)) {
			scmSupplierCsoinfoList = new ArrayList<>();
		}
		JRDataSource ds = scmSupplierCsoinfoService.getCSOInfoMianDanDataSource(scmSupplierCsoinfoList);
		model.addAttribute("url", "classpath:/ireport/Best1_MianDan.jasper");
		model.addAttribute("format", "pdf");
		model.addAttribute("jrMainDataSource", ds);
		model.addAttribute("SUBREPORT_DIR", getClass().getClassLoader().getResource("").getPath() + "/ireport/");
		return "iReport";
	}

	private List<ScmSupplierCsoinfo> scmSupplierCsoinfoList(HttpServletRequest req) {
		String ids = req.getParameter("ids");
		String[] idArr = ids.split(",");
		List<ScmSupplierCsoinfo> infos = new ArrayList<>();
		for (String id : idArr) {
			ScmSupplierCsoinfo scmSupplierCsoinfo = scmSupplierCsoinfoService.getByRole(id);
			if (scmSupplierCsoinfo != null) {
				infos.add(scmSupplierCsoinfo);
			}
		}
		return infos;
	}

	// Private method -----------------------

	private List<ScmSupplierShipConfirmInfo> randomScmSupplierShipConfirmInfo(int count) {
		List<ScmSupplierShipConfirmInfo> scmSupplierShipConfirmInfos = Lists.newArrayList();
		Random r = new Random();
		DecimalFormat df = new DecimalFormat("0.00");
		for (int i = 0; i < count; i++) {
			ScmSupplierShipConfirmInfo scmSupplierShipConfirmInfo = new ScmSupplierShipConfirmInfo();
			scmSupplierShipConfirmInfo.setShiporderId((long) randomInt(100000, 900000, r));
			scmSupplierShipConfirmInfo.setOrderId((long) randomInt(10000, 90000, r));
			scmSupplierShipConfirmInfo.setItemId(randomInt(1, 10, r));
			scmSupplierShipConfirmInfo.setCarrierId((long) randomInt(1000000, 1000099, r));
			scmSupplierShipConfirmInfo.setTrackingNumber("A" + randomInt(100000000, 900000000, r));
			scmSupplierShipConfirmInfo.setPackageWeight(Double.valueOf(df.format(0.7d * randomInt(1, 15, r))));
			scmSupplierShipConfirmInfo.setPackageRemark("好易购 好生活");
			scmSupplierShipConfirmInfos.add(scmSupplierShipConfirmInfo);
		}
		return scmSupplierShipConfirmInfos;
	}

	private int randomInt(int min, int max, Random r) {
		return r.nextInt(max) % (max - min + 1) + min;
	}

	private List<ScmSupplierShipConfirmInfo> mappingScmSupplierShipConfirmInfos(List<ScmSupplierCsoinfo> csoinfos) {
		if (csoinfos == null) {
			return Lists.newArrayList();
		}
		List<ScmSupplierShipConfirmInfo> shipConfirmInfos = new ArrayList<>(csoinfos.size());
		for (int i = 0; i < csoinfos.size(); i++) {
			ScmSupplierCsoinfo csoinfo = csoinfos.get(i);
			ScmSupplierShipConfirmInfo scmSupplierShipConfirmInfo = scmSupplierCsoinfoService
					.mappingScmSupplierShipConfirmInfo(csoinfo);
			Long carrierId = csoinfo.getCarrieridprimary();
			if (carrierId == null) {
				carrierId = 0l;
			}
			scmSupplierShipConfirmInfo.setCarrierId(carrierId);
			scmSupplierShipConfirmInfo.setTrackingNumber("");
			scmSupplierShipConfirmInfo.setPackageWeight(0.0d);
			shipConfirmInfos.add(scmSupplierShipConfirmInfo);
		}
		return shipConfirmInfos;
	}

}