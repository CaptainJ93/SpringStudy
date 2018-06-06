/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.act.dao;

import com.best1.scm.common.persistence.CrudDao;
import com.best1.scm.common.persistence.annotation.MyBatisDao;
import com.best1.scm.modules.act.entity.Act;

/**
 * 
 * 审批DAO接口
 * @author thinkgem
 * @version 2014-05-16
 */
@MyBatisDao
public interface ActDao extends CrudDao<Act> {

	public int updateProcInsIdByBusinessId(Act act);
	
}
