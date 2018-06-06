package com.best1.scm.modules.vws.dao;

import java.util.List;

import com.best1.scm.common.persistence.CrudDao;
import com.best1.scm.common.persistence.annotation.MyBatisDao;
import com.best1.scm.modules.vws.entity.Carrierdeliverorderid;

/**
 * 配送公司面单DAO接口
 * 
 * @author huwh
 * @version 2016-03-30
 */
@MyBatisDao
public interface CarrierdeliverorderidDao extends CrudDao<Carrierdeliverorderid> {
	// 根据使用状态按照配送公司ID分组
	public List<Carrierdeliverorderid> findListGroupedCarrierByStatus(Carrierdeliverorderid entity);
}