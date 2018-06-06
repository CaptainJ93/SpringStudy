/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.vws.dao;

import com.best1.scm.common.persistence.CrudDao;
import com.best1.scm.common.persistence.annotation.MyBatisDao;
import com.best1.scm.modules.vws.entity.CarrierInfo;

/**
 * vwsDAO接口
 * @author hwh
 * @version 2016-02-23
 */
@MyBatisDao
public interface CarrierInfoDao extends CrudDao<CarrierInfo> {
	
}