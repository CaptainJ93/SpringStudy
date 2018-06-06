package com.best1.scm.modules.delivery.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.delivery.dao.DeliveryQualityReportMonthKpiDao;
import com.best1.scm.modules.delivery.entity.DeliveryQualityReportMonthKpi;

@Service
@Transactional(readOnly = true)
public class DeliveryQualityReportMonthKpiService extends CrudService<DeliveryQualityReportMonthKpiDao, DeliveryQualityReportMonthKpi> {
	
private static final Logger  logger =  LoggerFactory.getLogger(DeliveryQualityReportMonthKpiService.class);
	
	
	public List<DeliveryQualityReportMonthKpi> findList(DeliveryQualityReportMonthKpi deliveryQualityReportMonthKpi){
		return super.findList(deliveryQualityReportMonthKpi);
	}

	public Page<DeliveryQualityReportMonthKpi> findPage(
			Page<DeliveryQualityReportMonthKpi> page,
			DeliveryQualityReportMonthKpi deliveryQualityReportMonthKpi) {
		return super.findPage(page, deliveryQualityReportMonthKpi);
	}
		
}
