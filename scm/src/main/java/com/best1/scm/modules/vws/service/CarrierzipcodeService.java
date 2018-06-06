/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.vws.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.vws.entity.Carrierzipcode;
import com.best1.scm.modules.vws.dao.CarrierzipcodeDao;

/**
 * 配送区域时效Service
 * @author hwh
 * @version 2016-02-26
 */
@Service
@Transactional(readOnly = true)
public class CarrierzipcodeService extends CrudService<CarrierzipcodeDao, Carrierzipcode> {

	public Carrierzipcode get(String id) {
		return super.get(id);
	}
	
	public List<Carrierzipcode> findList(Carrierzipcode carrierzipcode) {
		return super.findList(carrierzipcode);
	}
	
	public Page<Carrierzipcode> findPage(Page<Carrierzipcode> page, Carrierzipcode carrierzipcode) {
		return super.findPage(page, carrierzipcode);
	}
	
	@Transactional(readOnly = false)
	public void save(Carrierzipcode carrierzipcode) {
		super.save(carrierzipcode);
	}
	
	@Transactional(readOnly = false)
	public void delete(Carrierzipcode carrierzipcode) {
		super.delete(carrierzipcode);
	}
	
}