/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.returnpackage.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.returnpackage.entity.ReturnReturnintransitDetail;
import com.best1.scm.modules.returnpackage.dao.ReturnReturnintransitDetailDao;

/**
 * 退换货明细Service
 * @author hwh
 * @version 2016-03-15
 */
@Service
@Transactional(readOnly = true)
public class ReturnReturnintransitDetailService extends CrudService<ReturnReturnintransitDetailDao, ReturnReturnintransitDetail> {

	private static final Logger  logger =  LoggerFactory.getLogger(ReturnReturnintransitDetailService.class);
	
	public ReturnReturnintransitDetail get(String id) {
		return super.get(id);
	}
	
	public List<ReturnReturnintransitDetail> findList(ReturnReturnintransitDetail returnReturnintransitDetail) {
		return super.findList(returnReturnintransitDetail);
	}
	
	public Page<ReturnReturnintransitDetail> findPage(Page<ReturnReturnintransitDetail> page, ReturnReturnintransitDetail returnReturnintransitDetail) {
		return super.findPage(page, returnReturnintransitDetail);
	}
	
	@Transactional(readOnly = false)
	public void save(ReturnReturnintransitDetail returnReturnintransitDetail) {
		//判断是否有重复
		List<ReturnReturnintransitDetail> returnReturnintransitDetailList = this.findList(returnReturnintransitDetail);
		if((null!=returnReturnintransitDetailList)&&(returnReturnintransitDetailList.size()>0)){
			logger.info("returnid:"+returnReturnintransitDetail.getReturnid()+"~orderid:"+returnReturnintransitDetail.getOrderid()+"~itemid:"+returnReturnintransitDetail.getItemid()+"is exists...");
		}else{
			super.save(returnReturnintransitDetail);
		}
		
	}
	
	@Transactional(readOnly = false)
	public void delete(ReturnReturnintransitDetail returnReturnintransitDetail) {
		super.delete(returnReturnintransitDetail);
	}
	
}