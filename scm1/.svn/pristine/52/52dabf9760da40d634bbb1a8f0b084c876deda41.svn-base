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
import com.best1.scm.modules.delivery.entity.DeliveryQualityReportMonthKpi;
import com.best1.scm.modules.delivery.entity.DeliveryQualityReportTimeAreaProportion;
import com.best1.scm.modules.delivery.entity.ScmDeliveryTimezoneratescore;
import com.best1.scm.modules.delivery.service.DeliveryOrderintransitService;
import com.best1.scm.modules.delivery.service.DeliveryQualityReportCityProportionService;
import com.best1.scm.modules.delivery.service.DeliveryQualityReportEveryDayService;
import com.best1.scm.modules.delivery.service.DeliveryQualityReportMonthKpiService;
import com.best1.scm.modules.delivery.service.DeliveryQualityReportTimeAreaProportionService;
import com.best1.scm.modules.delivery.service.ScmDeliveryTimezoneratescoreService;
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
@RequestMapping(value = "${adminPath}/deliveryquality/monthkpi")
public class DeliveryQualityReportMonthKpiController extends BaseController {

	@Autowired
	private DeliveryOrderintransitService deliveryOrderintransitService;

	@Autowired
	private ScmDeliveryTimezoneratescoreService scmDeliveryTimezoneratescoreService;
	
	@Autowired
	private DeliveryQualityReportMonthKpiService deliveryQualityReportMonthKpiService;
	

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
	public String list(DeliveryQualityReportMonthKpi deliveryQualityReportMonthKpi,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		
		if((null ==deliveryQualityReportMonthKpi.getCreateDateStart() )||(null == deliveryQualityReportMonthKpi.getCreateDateEnd())){
			request.setAttribute("msg", "请输入查询时间区间");
		}else if((deliveryQualityReportMonthKpi.getCreateDateEnd().getTime()-deliveryQualityReportMonthKpi.getCreateDateStart().getTime())/(1000*60*60*24)>60){
			request.setAttribute("msg", "时间间隔不能大于60天，请重新输入");
		}else{
		Page<DeliveryQualityReportMonthKpi> page = deliveryQualityReportMonthKpiService
				.findPage(new Page<DeliveryQualityReportMonthKpi>(request, response),
						deliveryQualityReportMonthKpi);
		List<ScmDeliveryTimezoneratescore> scmDeliveryTimezoneratescoreList = scmDeliveryTimezoneratescoreService.findList(new ScmDeliveryTimezoneratescore()); 
		List<DeliveryQualityReportMonthKpi>  deliveryQualityReportMonthKpiList = page.getList();
		
		//计算KPI得分
		for(DeliveryQualityReportMonthKpi kpi : deliveryQualityReportMonthKpiList){
			
			for(ScmDeliveryTimezoneratescore score : scmDeliveryTimezoneratescoreList){
			//	System.out.println(kpi.getTimearea()+"~"+score.getHourzone()+"~"+kpi.getSignNum()*100/kpi.getDeliverytotalNumByCarrier()+"~"+score.getRatebegin()+"~"+kpi.getSignNum()*100/kpi.getDeliverytotalNumByCarrier()+"~"+score.getRateend());
				if((kpi.getTimearea().equals(score.getHourzone()))&&(kpi.getSignNum()*100/kpi.getDeliverytotalNumByCarrier()>score.getRatebegin())&&(kpi.getSignNum()*100/kpi.getDeliverytotalNumByCarrier()<=score.getRateend())){
					kpi.setRateScore(score.getRatescore());
				}
			}
		}
		
		//计算时区得分
		for(DeliveryQualityReportMonthKpi kpi : deliveryQualityReportMonthKpiList){
			if((kpi.getTimeareaToatlNum()*100f/kpi.getDeliverytotalNum())>=5){
				kpi.setTimeareaScore((kpi.getTimeareaToatlNum()*100f/kpi.getDeliverytotalNum())*kpi.getRateScore());
			}
		 }
		
		model.addAttribute("page", page);
		}
		return "modules/delivery/deliveryqualityreportbycity-monthkpi";
	}
	
	




}