/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.supplier.dao;

import com.best1.scm.common.persistence.CrudDao;
import com.best1.scm.common.persistence.annotation.MyBatisDao;
import com.best1.scm.modules.supplier.entity.ScmSupplierSkuinfo;

/**
 * 供应商-商品信息DAO接口
 * @author admin
 * @version 2016-12-13
 */
@MyBatisDao
public interface ScmSupplierSkuinfoDao extends CrudDao<ScmSupplierSkuinfo> {
	
}