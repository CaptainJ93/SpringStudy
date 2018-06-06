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

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.web.BaseController;
import com.best1.scm.common.utils.StringUtils;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransit;
import com.best1.scm.modules.delivery.entity.DeliveryQualityReportTotal;
import com.best1.scm.modules.delivery.service.DeliveryOrderintransitService;
import com.best1.scm.modules.delivery.service.DeliveryQualityReportTotalService;

/**
 * 配送包裹Controller
 * 
 * @author hwh
 * @version 2016-03-02
 */
@Controller
@RequestMapping(value = "${adminPath}/deliveryquality/total")
public class DeliveryQualityReportTotalController extends BaseController {

	@Autowired
	private DeliveryOrderintransitService deliveryOrderintransitService;
	
	@Autowired
	private DeliveryQualityReportTotalService deliveryQualityReportTotalService;
	

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
	@RequestMapping(value = { "list", "" })
	public String list(DeliveryQualityReportTotal deliveryQualityReportTotal,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		
		if((null ==deliveryQualityReportTotal.getCreateDateStart() )||(null == deliveryQualityReportTotal.getCreateDateEnd())){
			request.setAttribute("msg", "请输入查询时间区间");
		}else if((deliveryQualityReportTotal.getCreateDateEnd().getTime()-deliveryQualityReportTotal.getCreateDateStart().getTime())/(1000*60*60*24)>60){
			request.setAttribute("msg", "时间间隔不能大于60天，请重新输入");
		}else{
		Page<DeliveryQualityReportTotal> page = deliveryQualityReportTotalService
				.findPage(new Page<DeliveryQualityReportTotal>(request, response),
						deliveryQualityReportTotal);
		
		model.addAttribute("page", page);
		}
		return "modules/delivery/deliveryqualityreportbycity-total";
	}
	
	
	@RequiresPermissions("delivery:deliveryOrderintransit:view")
	@RequestMapping(value = { "list1"})
	public String list1(DeliveryQualityReportTotal deliveryQualityReportTotal,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		
		if((null ==deliveryQualityReportTotal.getCreateDateStart() )||(null == deliveryQualityReportTotal.getCreateDateEnd())){
			request.setAttribute("msg", "请输入查询时间区间");
		}else if((deliveryQualityReportTotal.getCreateDateEnd().getTime()-deliveryQualityReportTotal.getCreateDateStart().getTime())/(1000*60*60*24)>60){
			request.setAttribute("msg", "时间间隔不能大于60天，请重新输入");
		}else{
		Page<DeliveryQualityReportTotal> page = deliveryQualityReportTotalService
				.findAllPage(new Page<DeliveryQualityReportTotal>(request, response),
						deliveryQualityReportTotal);
		
		model.addAttribute("page", page);
		}
		return "modules/delivery/deliveryqualityreportbycity-total1";
	}
	




}