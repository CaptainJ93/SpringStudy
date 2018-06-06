/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.delivery.dao;

import com.best1.scm.common.persistence.CrudDao;
import com.best1.scm.common.persistence.annotation.MyBatisDao;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransitPathdetail;

/**
 * 订单包裹配送在途路由信息表DAO接口
 * @author hwh
 * @version 2016-03-02
 */
@MyBatisDao
public interface DeliveryOrderintransitPathdetailDao extends CrudDao<DeliveryOrderintransitPathdetail> {
	
}