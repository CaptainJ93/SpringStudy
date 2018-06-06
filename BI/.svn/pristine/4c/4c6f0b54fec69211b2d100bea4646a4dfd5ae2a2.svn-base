package com.best1.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.best1.base.BaseServiceImpl;
import com.best1.base.BusiException;
import com.best1.db.PVInfoDAO;
import com.best1.domain.ParamValue;
import com.best1.service.ParamValueService;

public class ParamValueServiceImpl extends BaseServiceImpl   implements ParamValueService {

	private PVInfoDAO pvInfoDAO;
	
	public PVInfoDAO getPvInfoDAO() {
		return pvInfoDAO;
	}

	public void setPvInfoDAO(PVInfoDAO pvInfoDAO) {
		this.pvInfoDAO = pvInfoDAO;
	}

	public List<ParamValue> getPVs() {
		try {
			return pvInfoDAO.getInfos();
		} catch (SQLException e) {
			getLog().debug(this.getClass()+": "+e.getMessage());
			throw new BusiException(this.getClass(),e);
		}
	}
}
