/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.deliveryfee.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.deliveryfee.entity.ScmDeliveryfeeCodfee;
import com.best1.scm.modules.deliveryfee.dao.ScmDeliveryfeeCodfeeDao;

/**
 * 配送费用计算Service
 * @author admin
 * @version 2016-07-27
 */
@Service
@Transactional(readOnly = true)
public class ScmDeliveryfeeCodfeeService extends CrudService<ScmDeliveryfeeCodfeeDao, ScmDeliveryfeeCodfee> {

	public ScmDeliveryfeeCodfee get(String id) {
		return super.get(id);
	}
	
	public List<ScmDeliveryfeeCodfee> findList(ScmDeliveryfeeCodfee scmDeliveryfeeCodfee) {
		return super.findList(scmDeliveryfeeCodfee);
	}
	
	public Page<ScmDeliveryfeeCodfee> findPage(Page<ScmDeliveryfeeCodfee> page, ScmDeliveryfeeCodfee scmDeliveryfeeCodfee) {
		return super.findPage(page, scmDeliveryfeeCodfee);
	}
	
	@Transactional(readOnly = false)
	public void save(ScmDeliveryfeeCodfee scmDeliveryfeeCodfee) {
		super.save(scmDeliveryfeeCodfee);
	}
	
	@Transactional(readOnly = false)
	public void delete(ScmDeliveryfeeCodfee scmDeliveryfeeCodfee) {
		super.delete(scmDeliveryfeeCodfee);
	}
	
}