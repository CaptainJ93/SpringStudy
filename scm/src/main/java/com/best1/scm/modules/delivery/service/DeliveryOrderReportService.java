package com.best1.scm.modules.delivery.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.delivery.dao.DelieryOrderReportDao;
import com.best1.scm.modules.delivery.entity.DelieryOrderReport;

@Service
@Transactional(readOnly = true)
public class DeliveryOrderReportService  extends CrudService<DelieryOrderReportDao, DelieryOrderReport> {
	private static final Logger  logger =  LoggerFactory.getLogger(DeliveryOrderReportService.class);
	
	
	public List<DelieryOrderReport> findList(DelieryOrderReport report){
		List<DelieryOrderReport> reports=super.findList(report);
		return reports;
		
	}
	

	public Page<DelieryOrderReport> findAllPage(
			Page<DelieryOrderReport> page,
			DelieryOrderReport report) {
		page.setGroupBy(" carrier.CARRIERNAME,zipcode.limitations  ");
		return super.findAllPage(page, report);
	}
	
	public Page<DelieryOrderReport> findPage(
			Page<DelieryOrderReport> page,
			DelieryOrderReport report) {
		page.setGroupBy(" carrier.CARRIERNAME");
		return super.findPage(page, report);
	}
}
