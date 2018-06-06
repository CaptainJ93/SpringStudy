package com.best1.api.webservice.soap.response.result.vwms;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.vwms.RtvconfirmDTO;

public class RtvconfirmResult extends WSResult{

	private RtvconfirmDTO rtvconfirm;

	public RtvconfirmDTO getRtvconfirm() {
		return rtvconfirm;
	}

	public void setRtvconfirm(RtvconfirmDTO rtvconfirm) {
		this.rtvconfirm = rtvconfirm;
	}
	
	
	
}
