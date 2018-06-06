package com.best1.api.webservice.soap.response.result.scm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.SpmUserDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "SpmUserResult", namespace = WsConstants.NS)
public class SpmUserResult extends WSResult {
	
	private SpmUserDTO spmUser;

	public SpmUserResult() {
		
	}

	public SpmUserResult(SpmUserDTO spmUser) {
		this.spmUser = spmUser;
	}
	
	@XmlElement(name="spmuser")
	public SpmUserDTO getSpmUser() {
		return spmUser;
	}

	public void setSpmUser(SpmUserDTO spmUser) {
		this.spmUser = spmUser;
	}
	
	
}
