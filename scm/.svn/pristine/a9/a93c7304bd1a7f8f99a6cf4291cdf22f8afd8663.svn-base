/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.deliveryfee.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.deliveryfee.entity.ScmDeliveryfeePackagedetail;
import com.best1.scm.modules.deliveryfee.dao.ScmDeliveryfeePackagedetailDao;

/**
 * 配送费用计算Service
 * @author admin
 * @version 2016-07-27
 */
@Service
@Transactional(readOnly = true)
public class ScmDeliveryfeePackagedetailService extends CrudService<ScmDeliveryfeePackagedetailDao, ScmDeliveryfeePackagedetail> {

	public ScmDeliveryfeePackagedetail get(String id) {
		return super.get(id);
	}
	
	public List<ScmDeliveryfeePackagedetail> findList(ScmDeliveryfeePackagedetail scmDeliveryfeePackagedetail) {
		return super.findList(scmDeliveryfeePackagedetail);
	}
	
	
	public Page<ScmDeliveryfeePackagedetail> findPage(Page<ScmDeliveryfeePackagedetail> page, ScmDeliveryfeePackagedetail scmDeliveryfeePackagedetail) {
		return super.findPage(page, scmDeliveryfeePackagedetail);
	}
	
	@Transactional(readOnly = false)
	public void save(ScmDeliveryfeePackagedetail scmDeliveryfeePackagedetail) {
		super.save(scmDeliveryfeePackagedetail);
	}
	
	@Transactional(readOnly = false)
	public void delete(ScmDeliveryfeePackagedetail scmDeliveryfeePackagedetail) {
		super.delete(scmDeliveryfeePackagedetail);
	}
	
}