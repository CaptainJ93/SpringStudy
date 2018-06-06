package com.best1.scm.modules.webapi.dao;

import java.util.List;

import com.best1.scm.common.persistence.annotation.MyBatisDao;
import com.best1.scm.modules.webapi.entity.ExpressCarrierInfo;

@MyBatisDao
public interface ExpressDao {
	List<ExpressCarrierInfo> findListToFetchExpress(
			ExpressCarrierInfo expressCarrierInfo);
	
	void updateTrackingStatus(ExpressCarrierInfo expressCarrierInfo);
	
	void deletePathDetails(ExpressCarrierInfo expressCarrierInfo);
	
	void insertPathDetails(ExpressCarrierInfo expressCarrierInfo);
}
