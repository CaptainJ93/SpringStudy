/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.supplier.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.supplier.entity.ScmSupplierSkuinfo;
import com.best1.scm.modules.supplier.dao.ScmSupplierSkuinfoDao;

/**
 * 供应商-商品信息Service
 * @author admin
 * @version 2016-12-13
 */
@Service
@Transactional(readOnly = true)
public class ScmSupplierSkuinfoService extends CrudService<ScmSupplierSkuinfoDao, ScmSupplierSkuinfo> {

	public ScmSupplierSkuinfo get(String id) {
		return super.get(id);
	}
	
	public List<ScmSupplierSkuinfo> findList(ScmSupplierSkuinfo scmSupplierSkuinfo) {
		return super.findList(scmSupplierSkuinfo);
	}
	
	public Page<ScmSupplierSkuinfo> findPage(Page<ScmSupplierSkuinfo> page, ScmSupplierSkuinfo scmSupplierSkuinfo) {
		return super.findPage(page, scmSupplierSkuinfo);
	}
	
	@Transactional(readOnly = false)
	public void save(ScmSupplierSkuinfo scmSupplierSkuinfo) {
		super.save(scmSupplierSkuinfo);
	}
	
	@Transactional(readOnly = false)
	public void delete(ScmSupplierSkuinfo scmSupplierSkuinfo) {
		super.delete(scmSupplierSkuinfo);
	}
	
}