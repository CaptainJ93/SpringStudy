package com.best1.report.service.impl;

import java.sql.SQLException;
import java.util.HashMap;

import com.best1.base.DataModel;
import com.best1.report.db.QueryDao;
import com.best1.report.service.QueryService;
import com.best1.base.BusiException;
import com.best1.base.BaseServiceImpl;

public class QueryServiceImpl extends BaseServiceImpl implements QueryService{
	private QueryDao queryDao;
	
	public DataModel getMemberShipLevel(HashMap paramMap) throws BusiException {
		try {
			return queryDao.getMemberShipLevel(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getDomainData(HashMap paramMap) throws BusiException {
		try {
			return queryDao.getDomainData(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getProductClass(HashMap paramMap) throws BusiException {
		try {
			return queryDao.getProductClass(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getSubchannel(HashMap paramMap) throws BusiException {
		try {
			return queryDao.getSubchannel(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getComplaintCategory(HashMap paramMap) throws BusiException {
		try {
			return queryDao.getComplaintCategory(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getFilePathCof(String businessCode) throws BusiException {
		try {
			HashMap paramMap = new HashMap();
			paramMap.put("businessCode", businessCode);
			return queryDao.getFilePathCof(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getAreaZipCode(HashMap paramMap) throws BusiException {
		try {
			return queryDao.getAreaZipCode(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
	
	public DataModel getCityCode(HashMap paramMap) throws BusiException {
		try {
			return queryDao.getCityCode(paramMap);
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}

	public QueryDao getQueryDao() {
		return queryDao;
	}

	public void setQueryDao(QueryDao queryDao) {
		this.queryDao = queryDao;
	}
}
