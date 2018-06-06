/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.delivery.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.delivery.entity.ScmComplaintHeader;
import com.best1.scm.modules.delivery.dao.ScmComplaintHeaderDao;

/**
 * 配送包裹客诉处理headerService
 * @author admin
 * @version 2016-12-22
 */
@Service
@Transactional(readOnly = true)
public class ScmComplaintHeaderService extends CrudService<ScmComplaintHeaderDao, ScmComplaintHeader> {

	public ScmComplaintHeader get(String id) {
		return super.get(id);
	}
	
	public List<ScmComplaintHeader> findList(ScmComplaintHeader scmComplaintHeader) {
		return super.findList(scmComplaintHeader);
	}
	
	public Page<ScmComplaintHeader> findPage(Page<ScmComplaintHeader> page, ScmComplaintHeader scmComplaintHeader) {
		return super.findPage(page, scmComplaintHeader);
	}
	
	@Transactional(readOnly = false)
	public void save(ScmComplaintHeader scmComplaintHeader) {
		super.save(scmComplaintHeader);
	}
	
	@Transactional(readOnly = false)
	public void delete(ScmComplaintHeader scmComplaintHeader) {
		super.delete(scmComplaintHeader);
	}
	
}