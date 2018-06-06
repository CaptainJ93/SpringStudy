package com.best1.scm.modules.delivery.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.delivery.dao.DeliveryQualityReportCityProportionTotalDao;
import com.best1.scm.modules.delivery.entity.DeliveryQualityReportCityProportion;

@Service
@Transactional(readOnly = true)
public class DeliveryQualityReportCityProportionTotalService extends CrudService<DeliveryQualityReportCityProportionTotalDao, DeliveryQualityReportCityProportion> {
	
private static final Logger  logger =  LoggerFactory.getLogger(DeliveryQualityReportCityProportionTotalService.class);
	
	
	public List<DeliveryQualityReportCityProportion> findList(DeliveryQualityReportCityProportion deliveryQualityReportCityProportion){
		return super.findList(deliveryQualityReportCityProportion);
	}

		
	public Page<DeliveryQualityReportCityProportion> findAllPage(
			Page<DeliveryQualityReportCityProportion> page,
			DeliveryQualityReportCityProportion deliveryQualityReportCityProportion) {
		return super.findAllPage(page, deliveryQualityReportCityProportion);
	}
		
}
