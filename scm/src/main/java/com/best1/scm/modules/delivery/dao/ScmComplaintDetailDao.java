/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.delivery.dao;

import com.best1.scm.common.persistence.CrudDao;
import com.best1.scm.common.persistence.annotation.MyBatisDao;
import com.best1.scm.modules.delivery.entity.ScmComplaintDetail;

/**
 * 配送包裹客诉处理detailDAO接口
 * @author admin
 * @version 2016-12-22
 */
@MyBatisDao
public interface ScmComplaintDetailDao extends CrudDao<ScmComplaintDetail> {
	
}