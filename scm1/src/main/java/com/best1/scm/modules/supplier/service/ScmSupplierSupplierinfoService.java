/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.supplier.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.supplier.entity.ScmSupplierSupplierinfo;
import com.best1.scm.modules.supplier.dao.ScmSupplierSupplierinfoDao;

/**
 * 供应商-供应商信息Service
 * @author admin
 * @version 2016-12-13
 */
@Service
@Transactional(readOnly = true)
public class ScmSupplierSupplierinfoService extends CrudService<ScmSupplierSupplierinfoDao, ScmSupplierSupplierinfo> {

	public ScmSupplierSupplierinfo get(String id) {
		return super.get(id);
	}
	
	public List<ScmSupplierSupplierinfo> findList(ScmSupplierSupplierinfo scmSupplierSupplierinfo) {
		return super.findList(scmSupplierSupplierinfo);
	}
	
	public Page<ScmSupplierSupplierinfo> findPage(Page<ScmSupplierSupplierinfo> page, ScmSupplierSupplierinfo scmSupplierSupplierinfo) {
		return super.findPage(page, scmSupplierSupplierinfo);
	}
	
	@Transactional(readOnly = false)
	public void save(ScmSupplierSupplierinfo scmSupplierSupplierinfo) {
		super.save(scmSupplierSupplierinfo);
	}
	
	@Transactional(readOnly = false)
	public void delete(ScmSupplierSupplierinfo scmSupplierSupplierinfo) {
		super.delete(scmSupplierSupplierinfo);
	}
	
}