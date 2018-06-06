/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.vws.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.vws.entity.CarrierInfo;
import com.best1.scm.modules.vws.dao.CarrierInfoDao;

/**
 * vwsService
 * @author hwh
 * @version 2016-02-23
 */
@Service
@Transactional(readOnly = true)
public class CarrierInfoService extends CrudService<CarrierInfoDao, CarrierInfo> {

	public CarrierInfo get(String id) {
		return super.get(id);
	}
	
	public List<CarrierInfo> findList(CarrierInfo carrierInfo) {
		return super.findList(carrierInfo);
	}
	
	public Page<CarrierInfo> findPage(Page<CarrierInfo> page, CarrierInfo carrierInfo) {
		
		/**
		 * 	// 设置默认时间范围，默认当前月
		if (log.getBeginDate() == null){
			log.setBeginDate(DateUtils.setDays(DateUtils.parseDate(DateUtils.getDate()), 1));
		}
		if (log.getEndDate() == null){
			log.setEndDate(DateUtils.addMonths(log.getBeginDate(), 1));
		}
		 * */
		return super.findPage(page, carrierInfo);
	}
	
	@Transactional(readOnly = false)
	public void save(CarrierInfo carrierInfo) {
		super.save(carrierInfo);
	}
	
	@Transactional(readOnly = false)
	public void delete(CarrierInfo carrierInfo) {
		super.delete(carrierInfo);
	}
	
}