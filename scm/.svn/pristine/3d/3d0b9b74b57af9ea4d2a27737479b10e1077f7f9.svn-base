/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.delivery.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransitDetail;
import com.best1.scm.modules.delivery.dao.DeliveryOrderintransitDetailDao;

/**
 * 配送包裹明细Service
 * @author hwh
 * @version 2016-03-02
 */
@Service
@Transactional(readOnly = true)
public class DeliveryOrderintransitDetailService extends CrudService<DeliveryOrderintransitDetailDao, DeliveryOrderintransitDetail> {

	private static final Logger  logger =  LoggerFactory.getLogger(DeliveryOrderintransitDetailService.class);
	
	public DeliveryOrderintransitDetail get(String id) {
		return super.get(id);
	}
	
	public List<DeliveryOrderintransitDetail> findList(DeliveryOrderintransitDetail deliveryOrderintransitDetail) {
		return super.findList(deliveryOrderintransitDetail);
	}
	
	public Page<DeliveryOrderintransitDetail> findPage(Page<DeliveryOrderintransitDetail> page, DeliveryOrderintransitDetail deliveryOrderintransitDetail) {
		return super.findPage(page, deliveryOrderintransitDetail);
	}
	
	@Transactional(readOnly = false)
	public void save(DeliveryOrderintransitDetail deliveryOrderintransitDetail) {
		//判断是否有重复
		List<DeliveryOrderintransitDetail> deliveryOrderintransitDetailList =this.findList(deliveryOrderintransitDetail);
		if((null!=deliveryOrderintransitDetailList)&&(deliveryOrderintransitDetailList.size()>0)){
			logger.info("tracking number:"+deliveryOrderintransitDetail.getTrackingnumber()+"~orderid:"+deliveryOrderintransitDetail.getOrderid()+"~itemid:"+deliveryOrderintransitDetail.getItemid()+"~productid:"+deliveryOrderintransitDetail.getProductid()+"is exists...");
		}else{
			super.save(deliveryOrderintransitDetail);
		}
		
	}
	
	@Transactional(readOnly = false)
	public void delete(DeliveryOrderintransitDetail deliveryOrderintransitDetail) {
		super.delete(deliveryOrderintransitDetail);
	}
	
}