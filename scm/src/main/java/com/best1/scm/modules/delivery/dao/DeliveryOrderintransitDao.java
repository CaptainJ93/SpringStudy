/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.delivery.dao;

import com.best1.scm.common.persistence.CrudDao;
import com.best1.scm.common.persistence.annotation.MyBatisDao;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransit;

/**
 * 配送包裹DAO接口
 * @author hwh
 * @version 2016-03-02
 */

@MyBatisDao
public interface DeliveryOrderintransitDao extends CrudDao<DeliveryOrderintransit> {
	
}