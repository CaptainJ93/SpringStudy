/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.deliveryfee.dao;

import com.best1.scm.common.persistence.CrudDao;
import com.best1.scm.common.persistence.annotation.MyBatisDao;
import com.best1.scm.modules.deliveryfee.entity.ScmDeliveryfeePrice;

/**
 * 配送费用计算DAO接口
 * @author admin
 * @version 2016-07-27
 */
@MyBatisDao
public interface ScmDeliveryfeePriceDao extends CrudDao<ScmDeliveryfeePrice> {
	
}