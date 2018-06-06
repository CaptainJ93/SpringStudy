package com.best1.scm.modules.delivery.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.delivery.dao.DeliveryQualityReportCityProportionDao;
import com.best1.scm.modules.delivery.entity.DeliveryQualityReportCityProportion;

@Service
@Transactional(readOnly = true)
public class DeliveryQualityReportCityProportionService extends CrudService<DeliveryQualityReportCityProportionDao, DeliveryQualityReportCityProportion> {
	
private static final Logger  logger =  LoggerFactory.getLogger(DeliveryQualityReportCityProportionService.class);
	
	
	public List<DeliveryQualityReportCityProportion> findList(DeliveryQualityReportCityProportion deliveryQualityReportCityProportion){
		return super.findList(deliveryQualityReportCityProportion);
	}

	public Page<DeliveryQualityReportCityProportion> findPage(
			Page<DeliveryQualityReportCityProportion> page,
			DeliveryQualityReportCityProportion deliveryQualityReportCityProportion) {
		return super.findPage(page, deliveryQualityReportCityProportion);
	}
		
	public Page<DeliveryQualityReportCityProportion> findAllPage(
			Page<DeliveryQualityReportCityProportion> page,
			DeliveryQualityReportCityProportion deliveryQualityReportCityProportion) {
		return super.findAllPage(page, deliveryQualityReportCityProportion);
	}
		
}
