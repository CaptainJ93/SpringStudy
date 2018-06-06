package com.best1.scm.modules.delivery.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.delivery.dao.DeliveryQualityReportOnwayDao;
import com.best1.scm.modules.delivery.entity.DeliveryQualityReportOnway;

@Service
@Transactional(readOnly = true)
public class DeliveryQualityReportOnwayService extends CrudService<DeliveryQualityReportOnwayDao, DeliveryQualityReportOnway> {
	
private static final Logger  logger =  LoggerFactory.getLogger(DeliveryQualityReportOnwayService.class);
	
	
	public List<DeliveryQualityReportOnway> findList(DeliveryQualityReportOnway deliveryQualityReportOnway){
		return super.findList(deliveryQualityReportOnway);
	}

	public Page<DeliveryQualityReportOnway> findPage(
			Page<DeliveryQualityReportOnway> page,
			DeliveryQualityReportOnway deliveryQualityReportOnway) {
		return super.findPage(page, deliveryQualityReportOnway);
	}
		
}
