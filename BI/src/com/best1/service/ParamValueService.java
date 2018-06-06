package com.best1.service;

import java.util.List;

import com.best1.base.BaseService;
import com.best1.domain.ParamValue;


public interface ParamValueService  extends BaseService {
	public List<ParamValue> getPVs();
}
