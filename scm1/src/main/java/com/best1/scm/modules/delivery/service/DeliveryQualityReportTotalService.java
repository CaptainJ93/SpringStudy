package com.best1.scm.modules.delivery.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.delivery.dao.DeliveryQualityReportTotalDao;
import com.best1.scm.modules.delivery.entity.DeliveryQualityReportTotal;

@Service
@Transactional(readOnly = true)
public class DeliveryQualityReportTotalService extends CrudService<DeliveryQualityReportTotalDao, DeliveryQualityReportTotal> {
	
private static final Logger  logger =  LoggerFactory.getLogger(DeliveryQualityReportTotalService.class);
	
	
	public List<DeliveryQualityReportTotal> findList(DeliveryQualityReportTotal deliveryQualityReportTotal){
		return super.findList(deliveryQualityReportTotal);
	}

	public Page<DeliveryQualityReportTotal> findPage(
			Page<DeliveryQualityReportTotal> page,
			DeliveryQualityReportTotal deliveryQualityReportTotal) {
		return super.findPage(page, deliveryQualityReportTotal);
	}
		
	public Page<DeliveryQualityReportTotal> findAllPage(
			Page<DeliveryQualityReportTotal> page,
			DeliveryQualityReportTotal deliveryQualityReportTotal) {
		return super.findAllPage(page, deliveryQualityReportTotal);
	}
		
}
