package com.best1.api.webservice.soap.response.result.vwms;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.vwms.CsowholeConfirmDTO;

public class CsowholeConfirmResult extends WSResult{
	private CsowholeConfirmDTO csowholeConfirm;

	public CsowholeConfirmDTO getCsowholeConfirm() {
		return csowholeConfirm;
	}

	public void setCsowholeConfirm(CsowholeConfirmDTO csowholeConfirm) {
		this.csowholeConfirm = csowholeConfirm;
	}
	
	
	

}
