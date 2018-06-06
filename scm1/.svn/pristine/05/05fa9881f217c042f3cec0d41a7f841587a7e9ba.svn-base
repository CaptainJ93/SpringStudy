/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.vws.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.vws.entity.Carrieradress;
import com.best1.scm.modules.vws.dao.CarrieradressDao;

/**
 * vwsService
 * @author hwh
 * @version 2016-02-25
 */
@Service
@Transactional(readOnly = true)
public class CarrieradressService extends CrudService<CarrieradressDao, Carrieradress> {

	public Carrieradress get(String id) {
		return super.get(id);
	}
	
	public List<Carrieradress> findList(Carrieradress carrieradress) {
		return super.findList(carrieradress);
	}
	
	public Page<Carrieradress> findPage(Page<Carrieradress> page, Carrieradress carrieradress) {
		return super.findPage(page, carrieradress);
	}
	
	@Transactional(readOnly = false)
	public void save(Carrieradress carrieradress) {
		super.save(carrieradress);
	}
	
	@Transactional(readOnly = false)
	public void delete(Carrieradress carrieradress) {
		super.delete(carrieradress);
	}
	
}