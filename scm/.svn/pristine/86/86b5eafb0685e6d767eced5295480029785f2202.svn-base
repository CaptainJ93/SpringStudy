/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.deliveryfee.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.deliveryfee.entity.ScmDeliveryfeePrice;
import com.best1.scm.modules.deliveryfee.dao.ScmDeliveryfeePriceDao;

/**
 * 配送费用计算Service
 * @author admin
 * @version 2016-07-27
 */
@Service
@Transactional(readOnly = true)
public class ScmDeliveryfeePriceService extends CrudService<ScmDeliveryfeePriceDao, ScmDeliveryfeePrice> {

	public ScmDeliveryfeePrice get(String id) {
		return super.get(id);
	}
	
	public List<ScmDeliveryfeePrice> findList(ScmDeliveryfeePrice scmDeliveryfeePrice) {
		return super.findList(scmDeliveryfeePrice);
	}
	
	public Page<ScmDeliveryfeePrice> findPage(Page<ScmDeliveryfeePrice> page, ScmDeliveryfeePrice scmDeliveryfeePrice) {
		return super.findPage(page, scmDeliveryfeePrice);
	}
	
	@Transactional(readOnly = false)
	public void save(ScmDeliveryfeePrice scmDeliveryfeePrice) {
		super.save(scmDeliveryfeePrice);
	}
	
	@Transactional(readOnly = false)
	public void delete(ScmDeliveryfeePrice scmDeliveryfeePrice) {
		super.delete(scmDeliveryfeePrice);
	}
	
}