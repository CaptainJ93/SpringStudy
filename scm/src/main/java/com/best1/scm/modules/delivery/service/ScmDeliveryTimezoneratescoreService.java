/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.delivery.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.delivery.entity.ScmDeliveryTimezoneratescore;
import com.best1.scm.modules.delivery.dao.ScmDeliveryTimezoneratescoreDao;

/**
 * 配送大区评分Service
 * @author admin
 * @version 2016-06-30
 */
@Service
@Transactional(readOnly = true)
public class ScmDeliveryTimezoneratescoreService extends CrudService<ScmDeliveryTimezoneratescoreDao, ScmDeliveryTimezoneratescore> {

	public ScmDeliveryTimezoneratescore get(String id) {
		return super.get(id);
	}
	
	public List<ScmDeliveryTimezoneratescore> findList(ScmDeliveryTimezoneratescore scmDeliveryTimezoneratescore) {
		return super.findList(scmDeliveryTimezoneratescore);
	}
	
	public Page<ScmDeliveryTimezoneratescore> findPage(Page<ScmDeliveryTimezoneratescore> page, ScmDeliveryTimezoneratescore scmDeliveryTimezoneratescore) {
		return super.findPage(page, scmDeliveryTimezoneratescore);
	}
	
	@Transactional(readOnly = false)
	public void save(ScmDeliveryTimezoneratescore scmDeliveryTimezoneratescore) {
		super.save(scmDeliveryTimezoneratescore);
	}
	
	@Transactional(readOnly = false)
	public void delete(ScmDeliveryTimezoneratescore scmDeliveryTimezoneratescore) {
		super.delete(scmDeliveryTimezoneratescore);
	}
	
}