package com.best1.scm.modules.vws.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.vws.entity.Carrierdeliverorderid;
import com.best1.scm.modules.vws.dao.CarrierdeliverorderidDao;

/**
 * 配送公司面单Service
 * @author huwh
 * @version 2016-03-30
 */
@Service
@Transactional(readOnly = true)
public class CarrierdeliverorderidService extends CrudService<CarrierdeliverorderidDao, Carrierdeliverorderid> {

	public Carrierdeliverorderid get(String id) {
		return super.get(id);
	}
	
	public List<Carrierdeliverorderid> findList(Carrierdeliverorderid carrierdeliverorderid) {
		return super.findList(carrierdeliverorderid);
	}
	
	public List<Carrierdeliverorderid> findListGroupedCarrierByStatus(Carrierdeliverorderid entity) {
		return dao.findListGroupedCarrierByStatus(entity);
	}
	
	public Page<Carrierdeliverorderid> findPage(Page<Carrierdeliverorderid> page, Carrierdeliverorderid carrierdeliverorderid) {
		return super.findPage(page, carrierdeliverorderid);
	}
	
	@Transactional(readOnly = false)
	public void save(Carrierdeliverorderid carrierdeliverorderid) {
		super.save(carrierdeliverorderid);
	}
	
	@Transactional(readOnly = false)
	public void delete(Carrierdeliverorderid carrierdeliverorderid) {
		super.delete(carrierdeliverorderid);
	}
	
}