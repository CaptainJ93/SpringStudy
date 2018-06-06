package com.best1.api.webservice.soap.response.result.crm;

import java.util.List;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.crm.CallworkcodeDTO;

public class CallWorkCodesResult extends WSResult{

	private List<CallworkcodeDTO> callworkcodes;

	public List<CallworkcodeDTO> getCallworkcodes() {
		return callworkcodes;
	}

	public void setCallworkcodes(List<CallworkcodeDTO> callworkcodes) {
		this.callworkcodes = callworkcodes;
	}
	
	
	

}
