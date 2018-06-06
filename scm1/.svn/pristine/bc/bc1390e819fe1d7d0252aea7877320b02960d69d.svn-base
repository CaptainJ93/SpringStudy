package com.best1.scm.modules.delivery.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.delivery.dao.DeliveryQualityReportEveryDayDao;
import com.best1.scm.modules.delivery.entity.DeliveryQualityReportEveryDay;

@Service
@Transactional(readOnly = true)
public class DeliveryQualityReportEveryDayService extends CrudService<DeliveryQualityReportEveryDayDao, DeliveryQualityReportEveryDay> {
	
private static final Logger  logger =  LoggerFactory.getLogger(DeliveryQualityReportEveryDayService.class);
	
	
	public List<DeliveryQualityReportEveryDay> findList(DeliveryQualityReportEveryDay deliveryQualityReportEveryDay){
		return super.findList(deliveryQualityReportEveryDay);
	}

	public Page<DeliveryQualityReportEveryDay> findPage(
			Page<DeliveryQualityReportEveryDay> page,
			DeliveryQualityReportEveryDay deliveryQualityReportEveryDay) {
		return super.findPage(page, deliveryQualityReportEveryDay);
	}
		
}
