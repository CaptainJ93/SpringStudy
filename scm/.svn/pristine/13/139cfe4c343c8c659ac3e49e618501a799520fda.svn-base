/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.returnpackage.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.returnpackage.entity.ReturnReturnintransit;
import com.best1.scm.modules.returnpackage.entity.ReturnReturnintransitPathdetail;
import com.best1.scm.modules.returnpackage.dao.ReturnReturnintransitPathdetailDao;

/**
 * 退换货包裹路由Service
 * @author hwh
 * @version 2016-03-15
 */
@Service
@Transactional(readOnly = true)
public class ReturnReturnintransitPathdetailService extends CrudService<ReturnReturnintransitPathdetailDao, ReturnReturnintransitPathdetail> {

	@Autowired
	private ReturnReturnintransitService returnReturnintransitService ;
	
	public ReturnReturnintransitPathdetail get(String id) {
		return super.get(id);
	}
	
	public List<ReturnReturnintransitPathdetail> findList(ReturnReturnintransitPathdetail returnReturnintransitPathdetail) {
		return super.findList(returnReturnintransitPathdetail);
	}
	
	public Page<ReturnReturnintransitPathdetail> findPage(Page<ReturnReturnintransitPathdetail> page, ReturnReturnintransitPathdetail returnReturnintransitPathdetail) {
		return super.findPage(page, returnReturnintransitPathdetail);
	}
	
	@Transactional(readOnly = false)
	public void save(ReturnReturnintransitPathdetail returnReturnintransitPathdetail) {
		super.save(returnReturnintransitPathdetail);
	}
	
	@Transactional(readOnly = false)
	public void delete(ReturnReturnintransitPathdetail returnReturnintransitPathdetail) {
		super.delete(returnReturnintransitPathdetail);
	}
	
	@Transactional(readOnly = false)
	public void saveAll(
			ReturnReturnintransitPathdetail returnReturnintransitPathdetail) {
		// TODO Auto-generated method stub
		super.save(returnReturnintransitPathdetail); //存储揽收路由信息
		 
		//1003 代表取件成功
		if((1003==returnReturnintransitPathdetail.getReturncode())&&(null!=returnReturnintransitPathdetail.getReceiptsuccesstime())){
			ReturnReturnintransit returnReturnintransit = new ReturnReturnintransit();
			returnReturnintransit.setReturnid(returnReturnintransitPathdetail.getReturnid());
			List<ReturnReturnintransit> returnReturnintransitList = returnReturnintransitService.findList(returnReturnintransit);
			if(null!=returnReturnintransitList&&(returnReturnintransitList.size()>0)){
				returnReturnintransit = returnReturnintransitList.get(0);
				returnReturnintransit.setReceiptstatus(returnReturnintransitPathdetail.getReturncode());
				returnReturnintransit.setReceiptconfirmtime(returnReturnintransitPathdetail.getReceiptsuccesstime());
				returnReturnintransit.setLastupdatedtime(new Date());
				returnReturnintransitService.update(returnReturnintransit);  //更新揽收头信息的揽收状态
			}
		}
		
		
	}
	
}