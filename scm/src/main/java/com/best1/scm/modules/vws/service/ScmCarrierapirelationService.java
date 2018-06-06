/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.vws.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.vws.entity.ScmCarrierapirelation;
import com.best1.scm.modules.vws.dao.ScmCarrierapirelationDao;

/**
 * scm_carrierapirelationService
 * @author jsz
 * @version 2017-04-12
 */
@Service
@Transactional(readOnly = true)
public class ScmCarrierapirelationService extends CrudService<ScmCarrierapirelationDao, ScmCarrierapirelation> {

	public ScmCarrierapirelation get(String id) {
		return super.get(id);
	}
	
	public List<ScmCarrierapirelation> findList(ScmCarrierapirelation scmCarrierapirelation) {
		return super.findList(scmCarrierapirelation);
	}
	
	public Page<ScmCarrierapirelation> findPage(Page<ScmCarrierapirelation> page, ScmCarrierapirelation scmCarrierapirelation) {
		return super.findPage(page, scmCarrierapirelation);
	}
	
	@Transactional(readOnly = false)
	public void save(ScmCarrierapirelation scmCarrierapirelation) {
		super.save(scmCarrierapirelation);
	}
	
	@Transactional(readOnly = false)
	public void delete(ScmCarrierapirelation scmCarrierapirelation) {
		super.delete(scmCarrierapirelation);
	}
	
}