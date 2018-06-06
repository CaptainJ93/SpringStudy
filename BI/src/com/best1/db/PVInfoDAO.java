package com.best1.db;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import com.best1.base.BaseBO;
import com.best1.domain.ParamValue;

public class PVInfoDAO   extends BaseBO{
	
	public List<ParamValue> getInfos() throws SQLException{
		HashMap paramMap = new HashMap();
		return (baseDAO.queryForList("ParamValueSql.getParamValueInfos", paramMap)).getRows();
	}

}
