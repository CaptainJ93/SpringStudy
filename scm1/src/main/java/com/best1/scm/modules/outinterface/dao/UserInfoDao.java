package com.best1.scm.modules.outinterface.dao;

import com.best1.scm.common.persistence.CrudDao;
import com.best1.scm.common.persistence.annotation.MyBatisDao;
import com.best1.scm.modules.outinterface.entity.UserInfo;


/**
 * 涉及到接口用户信息的dao
 * @author zhangzujie
 *
 */
@MyBatisDao
public interface UserInfoDao extends CrudDao<UserInfo>{

}
