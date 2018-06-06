/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.supplier.dao;

import java.util.List;

import com.best1.scm.common.persistence.CrudDao;
import com.best1.scm.common.persistence.annotation.MyBatisDao;
import com.best1.scm.modules.supplier.entity.ScmSupplierCsoinfo;
import com.best1.scm.modules.supplier.entity.ScmSupplierDeliveryOrder;

/**
 * 指送订单DAO接口
 * 
 * @author fanxuankai
 * @version 2016-12-27
 */
@MyBatisDao
public interface ScmSupplierCsoinfoDao extends CrudDao<ScmSupplierCsoinfo> {
	List<ScmSupplierDeliveryOrder> findDeliveryOrderList(ScmSupplierCsoinfo csoInfo);
}