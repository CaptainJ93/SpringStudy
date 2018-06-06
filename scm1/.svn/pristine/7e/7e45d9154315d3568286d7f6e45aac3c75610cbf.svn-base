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
import com.best1.scm.common.utils.SCMConstants;
import com.best1.scm.common.utils.StringUtils;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransit;
import com.best1.scm.modules.delivery.entity.DeliveryQualityReportByCity;
import com.best1.scm.modules.delivery.entity.DeliveryQualityReportCityProportion;
import com.best1.scm.modules.delivery.entity.DeliveryQualityReportEveryDay;
import com.best1.scm.modules.delivery.entity.DeliveryQualityReportTimeAreaProportion;
import com.best1.scm.modules.delivery.service.DeliveryOrderintransitService;
import com.best1.scm.modules.delivery.service.DeliveryQualityReportCityProportionService;
import com.best1.scm.modules.delivery.service.DeliveryQualityReportCityProportionTotalService;
import com.best1.scm.modules.delivery.service.DeliveryQualityReportEveryDayService;
import com.best1.scm.modules.delivery.service.DeliveryQualityReportTimeAreaProportionService;
import com.best1.scm.modules.delivery.service.DeliveryQualityReportTimeAreaProportionTotalService;
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
@RequestMapping(value = "${adminPath}/deliveryquality/reportbycity")
public class DeliveryQualityReportByCityController extends BaseController {

	@Autowired
	private DeliveryOrderintransitService deliveryOrderintransitService;
	@Autowired
	private DeliveryQualityReportCityProportionService deliveryQualityReportCityProportionService;
	@Autowired
	private DeliveryQualityReportCityProportionTotalService deliveryQualityReportCityProportionTotalService;
	
	@Autowired
	private DeliveryQualityReportTimeAreaProportionService deliveryQualityReportTimeAreaProportionService;
	@Autowired
	private DeliveryQualityReportTimeAreaProportionTotalService deliveryQualityReportTimeAreaProportionTotalService;
	@Autowired
	private DeliveryQualityReportEveryDayService deliveryQualityReportEveryDayService;

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

	@RequiresPermissions("delivery:deliveryOrderintransitReport:view")
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
		return "modules/delivery/deliveryqualityreportbycity";

	}

	@RequiresPermissions("delivery:deliveryOrderintransit:view")
	@RequestMapping(value = { "list", "" })
	public String list(DeliveryQualityReportByCity deliveryQualityReportByCity,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		
		System.out.println(deliveryQualityReportByCity.getSelectedcarrier()+"~~"+deliveryQualityReportByCity.getAreacode());
		
		DeliveryOrderintransit deliveryOrderintransit = new DeliveryOrderintransit();
		deliveryOrderintransit.setSelectedcarrier(deliveryQualityReportByCity.getSelectedcarrier());
		deliveryOrderintransit.setReceivingzipcode(deliveryQualityReportByCity.getAreacode());
		deliveryOrderintransit.setTrackingstatus(deliveryQualityReportByCity.getTrackingstatus());
		deliveryOrderintransit.setPackagetype(deliveryQualityReportByCity.getPackagetype());
		deliveryOrderintransit.setCreateDateStart(deliveryQualityReportByCity.getCreateDateStart());
		deliveryOrderintransit.setCreateDateEnd(deliveryQualityReportByCity.getCreateDateEnd());
		Page<DeliveryOrderintransit> page = deliveryOrderintransitService
				.findPage(new Page<DeliveryOrderintransit>(request, response),
						deliveryOrderintransit);
		model.addAttribute("page", page);
		return "modules/delivery/deliveryqualityreportbycity";
	}
	
	@RequiresPermissions("delivery:deliveryOrderintransit:view")
	@RequestMapping(value = { "listproportion" })
	public String listProportion(DeliveryQualityReportCityProportion deliveryQualityReportCityProportion,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		
		if((null ==deliveryQualityReportCityProportion.getCreateDateStart() )||(null == deliveryQualityReportCityProportion.getCreateDateEnd())){
			request.setAttribute("msg", "请输入查询时间区间");
		}else if((deliveryQualityReportCityProportion.getCreateDateEnd().getTime()-deliveryQualityReportCityProportion.getCreateDateStart().getTime())/(1000*60*60*24)>60){
			request.setAttribute("msg", "时间间隔不能大于60天，请重新输入");
		}else{
			Page<DeliveryQualityReportCityProportion> page = deliveryQualityReportCityProportionService
					.findPage(new Page<DeliveryQualityReportCityProportion>(request, response),
							deliveryQualityReportCityProportion);
			model.addAttribute("page", page);
		}
		
		
		
		return "modules/delivery/deliveryqualityreportbycity-proportion";
	}
	
	@RequiresPermissions("delivery:deliveryOrderintransit:view")
	@RequestMapping(value = { "listproportiontotal" })
	public String listProportionTotal(DeliveryQualityReportCityProportion deliveryQualityReportCityProportion,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		
		if((null ==deliveryQualityReportCityProportion.getCreateDateStart() )||(null == deliveryQualityReportCityProportion.getCreateDateEnd())){
			request.setAttribute("msg", "请输入查询时间区间");
		}else if((deliveryQualityReportCityProportion.getCreateDateEnd().getTime()-deliveryQualityReportCityProportion.getCreateDateStart().getTime())/(1000*60*60*24)>60){
			request.setAttribute("msg", "时间间隔不能大于60天，请重新输入");
		}else{
			Page<DeliveryQualityReportCityProportion> page = deliveryQualityReportCityProportionService
					.findAllPage(new Page<DeliveryQualityReportCityProportion>(request, response),
							deliveryQualityReportCityProportion);
			model.addAttribute("page", page);
		}
		
		return "modules/delivery/deliveryqualityreportbycity-proportion-total";
	}
	
	
	@RequiresPermissions("delivery:deliveryOrderintransit:view")
	@RequestMapping(value = { "listproportiontotal1" })
	public String listProportionTotal1(DeliveryQualityReportCityProportion deliveryQualityReportCityProportion,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		
		if((null ==deliveryQualityReportCityProportion.getCreateDateStart() )||(null == deliveryQualityReportCityProportion.getCreateDateEnd())){
			request.setAttribute("msg", "请输入查询时间区间");
		}else if((deliveryQualityReportCityProportion.getCreateDateEnd().getTime()-deliveryQualityReportCityProportion.getCreateDateStart().getTime())/(1000*60*60*24)>60){
			request.setAttribute("msg", "时间间隔不能大于60天，请重新输入");
		}else{
			Page<DeliveryQualityReportCityProportion> page = deliveryQualityReportCityProportionTotalService
					.findAllPage(new Page<DeliveryQualityReportCityProportion>(request, response),
							deliveryQualityReportCityProportion);
			model.addAttribute("page", page);
		}
		
		
		
		return "modules/delivery/deliveryqualityreportbycity-proportion-total1";
	}
	
	
	
	
	
	
	@RequiresPermissions("delivery:deliveryOrderintransit:view")
	@RequestMapping(value = { "listtimeareaproportion" })
	public String listTimeAreaProportion(DeliveryQualityReportTimeAreaProportion deliveryQualityReportTimeAreaProportion,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		
		if((null ==deliveryQualityReportTimeAreaProportion.getCreateDateStart() )||(null == deliveryQualityReportTimeAreaProportion.getCreateDateEnd())){
			request.setAttribute("msg", "请输入查询时间区间");
		}else if((deliveryQualityReportTimeAreaProportion.getCreateDateEnd().getTime()-deliveryQualityReportTimeAreaProportion.getCreateDateStart().getTime())/(1000*60*60*24)>60){
			request.setAttribute("msg", "时间间隔不能大于60天，请重新输入");
		}else{
			Page<DeliveryQualityReportTimeAreaProportion> page = deliveryQualityReportTimeAreaProportionService
					.findPage(new Page<DeliveryQualityReportTimeAreaProportion>(request, response),
							deliveryQualityReportTimeAreaProportion);
			model.addAttribute("page", page);
		}
		
		
		
		return "modules/delivery/deliveryqualityreportbycity-timeareaproportion";
	}
	

	@RequiresPermissions("delivery:deliveryOrderintransit:view")
	@RequestMapping(value = { "listtimeareaproportiontotal" })
	public String listTimeAreaProportionTotal(DeliveryQualityReportTimeAreaProportion deliveryQualityReportTimeAreaProportion,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		
		if((null ==deliveryQualityReportTimeAreaProportion.getCreateDateStart() )||(null == deliveryQualityReportTimeAreaProportion.getCreateDateEnd())){
			request.setAttribute("msg", "请输入查询时间区间");
		}else if((deliveryQualityReportTimeAreaProportion.getCreateDateEnd().getTime()-deliveryQualityReportTimeAreaProportion.getCreateDateStart().getTime())/(1000*60*60*24)>60){
			request.setAttribute("msg", "时间间隔不能大于60天，请重新输入");
		}else{
			Page<DeliveryQualityReportTimeAreaProportion> page = deliveryQualityReportTimeAreaProportionService
					.findAllPage(new Page<DeliveryQualityReportTimeAreaProportion>(request, response),
							deliveryQualityReportTimeAreaProportion);
			model.addAttribute("page", page);
		}
		
		
		
		return "modules/delivery/deliveryqualityreportbycity-timeareaproportion-total";
	}
	
	@RequiresPermissions("delivery:deliveryOrderintransit:view")
	@RequestMapping(value = { "listtimeareaproportiontotal1" })
	public String listTimeAreaProportionTotal1(DeliveryQualityReportTimeAreaProportion deliveryQualityReportTimeAreaProportion,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		
		if((null ==deliveryQualityReportTimeAreaProportion.getCreateDateStart() )||(null == deliveryQualityReportTimeAreaProportion.getCreateDateEnd())){
			request.setAttribute("msg", "请输入查询时间区间");
		}else if((deliveryQualityReportTimeAreaProportion.getCreateDateEnd().getTime()-deliveryQualityReportTimeAreaProportion.getCreateDateStart().getTime())/(1000*60*60*24)>60){
			request.setAttribute("msg", "时间间隔不能大于60天，请重新输入");
		}else{
			Page<DeliveryQualityReportTimeAreaProportion> page = deliveryQualityReportTimeAreaProportionTotalService
					.findAllPage(new Page<DeliveryQualityReportTimeAreaProportion>(request, response),
							deliveryQualityReportTimeAreaProportion);
			model.addAttribute("page", page);
		}
		
		
		
		return "modules/delivery/deliveryqualityreportbycity-timeareaproportion-total1";
	}
	
	
	@RequiresPermissions("delivery:deliveryOrderintransit:view")
	@RequestMapping(value = { "everyday" })
	public String everyday(DeliveryQualityReportEveryDay deliveryQualityReportEveryDay,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		
		if((null ==deliveryQualityReportEveryDay.getCreateDateStart() )||(null == deliveryQualityReportEveryDay.getCreateDateEnd())){
			request.setAttribute("msg", "请输入查询时间区间");
		}else if((deliveryQualityReportEveryDay.getCreateDateEnd().getTime()-deliveryQualityReportEveryDay.getCreateDateStart().getTime())/(1000*60*60*24)>60){
			request.setAttribute("msg", "时间间隔不能大于60天，请重新输入");
		}else{
			Page<DeliveryQualityReportEveryDay> page = deliveryQualityReportEveryDayService
					.findPage(new Page<DeliveryQualityReportEveryDay>(request, response),
							deliveryQualityReportEveryDay);
			model.addAttribute("page", page);
		}
		
		
		
		return "modules/delivery/deliveryqualityreportbycity-everyday";
	}


	@RequiresPermissions("delivery:deliveryOrderintransit:logistics")
	@RequestMapping(value = { "logistics" })
	public String logistics(DeliveryOrderintransit deliveryOrderintransit,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		String deliveryCode = null;
		List<Office> officelist = UserUtils.getOfficeList();
		for (Office office : officelist) {
			if (office.getType().endsWith(SCMConstants.sys_office_type_logistics)
					&& !StringUtils.isBlank(office.getCode())) {
				deliveryCode = office.getCode();
			}
		}
		if (!StringUtils.isBlank(deliveryCode)
				&& deliveryOrderintransit != null
				&&!StringUtils.isBlank(deliveryOrderintransit.getTrackingnumber())) {
			deliveryOrderintransit.setSelectedcarrier(deliveryCode);
			Page<DeliveryOrderintransit> page = deliveryOrderintransitService
					.findPage(new Page<DeliveryOrderintransit>(request,
							response), deliveryOrderintransit);
			model.addAttribute("page", page);
		}
		return "modules/delivery/deliveryqualityreportbycity";
	}



}