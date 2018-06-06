package com.best1.scm.modules.outinterface.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.service.CrudService;
import com.best1.scm.modules.outinterface.dao.UserInfoDao;
import com.best1.scm.modules.outinterface.entity.UserInfo;

/**
 * 操作scm对外接口用户信息的service
 * @author zhangzujie
 *
 */
@Service
@Transactional(readOnly = true)
public class UserInfoService extends CrudService<UserInfoDao, UserInfo>{

	@Autowired
	private UserInfoDao userInfoDao;
	
	@Transactional(readOnly = true)
	public Page<UserInfo> findPage(Page<UserInfo> page,UserInfo userInfo){
		return super.findPage(page, userInfo);
	}
	
}
