/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.vws.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.vws.dao.ZipcodeDao;
import com.best1.scm.modules.vws.entity.Zipcode;

/**
 * zipcodeService
 * 
 * @author fanxuankai
 * @version 2017-03-08
 */
@Service
@Transactional(readOnly = true)
public class ZipcodeService extends CrudService<ZipcodeDao, Zipcode> {

	public Zipcode get(String id) {
		return super.get(id);
	}

	public List<Zipcode> findList(Zipcode zipCode) {
		return super.findList(zipCode);
	}

	public Page<Zipcode> findPage(Page<Zipcode> page, Zipcode zipCode) {
		return super.findPage(page, zipCode);
	}

	@Transactional(readOnly = false)
	public void save(Zipcode zipCode) {
		super.save(zipCode);
	}

	@Transactional(readOnly = false)
	public void delete(Zipcode zipCode) {
		super.delete(zipCode);
	}

}