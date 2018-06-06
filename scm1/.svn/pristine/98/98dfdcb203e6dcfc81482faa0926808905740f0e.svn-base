/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.supplier.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.supplier.entity.ScmSupplierSrodetail;
import com.best1.scm.modules.supplier.dao.ScmSupplierSrodetailDao;

/**
 * 供应商-退货单明细信息Service
 * @author admin
 * @version 2016-12-23
 */
@Service
@Transactional(readOnly = true)
public class ScmSupplierSrodetailService extends CrudService<ScmSupplierSrodetailDao, ScmSupplierSrodetail> {

	public ScmSupplierSrodetail get(String id) {
		return super.get(id);
	}
	
	public List<ScmSupplierSrodetail> findList(ScmSupplierSrodetail scmSupplierSrodetail) {
		return super.findList(scmSupplierSrodetail);
	}
	
	public Page<ScmSupplierSrodetail> findPage(Page<ScmSupplierSrodetail> page, ScmSupplierSrodetail scmSupplierSrodetail) {
		return super.findPage(page, scmSupplierSrodetail);
	}
	
	@Transactional(readOnly = false)
	public void save(ScmSupplierSrodetail scmSupplierSrodetail) {
		super.save(scmSupplierSrodetail);
	}
	
	@Transactional(readOnly = false)
	public void delete(ScmSupplierSrodetail scmSupplierSrodetail) {
		super.delete(scmSupplierSrodetail);
	}
	
}