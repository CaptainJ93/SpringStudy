package com.best1.scm.modules.delivery.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.delivery.dao.DeliveryQualityReportTimeAreaProportionDao;
import com.best1.scm.modules.delivery.entity.DeliveryQualityReportTimeAreaProportion;

@Service
@Transactional(readOnly = true)
public class DeliveryQualityReportTimeAreaProportionService extends CrudService<DeliveryQualityReportTimeAreaProportionDao, DeliveryQualityReportTimeAreaProportion> {
	
private static final Logger  logger =  LoggerFactory.getLogger(DeliveryQualityReportTimeAreaProportionService.class);
	
	
	public List<DeliveryQualityReportTimeAreaProportion> findList(DeliveryQualityReportTimeAreaProportion deliveryQualityReportTimeAreaProportion){
		return super.findList(deliveryQualityReportTimeAreaProportion);
	}

	public Page<DeliveryQualityReportTimeAreaProportion> findPage(
			Page<DeliveryQualityReportTimeAreaProportion> page,
			DeliveryQualityReportTimeAreaProportion deliveryQualityReportTimeAreaProportion) {
		return super.findPage(page, deliveryQualityReportTimeAreaProportion);
	}
	public Page<DeliveryQualityReportTimeAreaProportion> findAllPage(
			Page<DeliveryQualityReportTimeAreaProportion> page,
			DeliveryQualityReportTimeAreaProportion deliveryQualityReportTimeAreaProportion) {
		return super.findAllPage(page, deliveryQualityReportTimeAreaProportion);
	}
		
}
