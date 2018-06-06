package com.best1.api.webservice.soap.response.result.scm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.SupplierbusinessDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "supplierbusinessResult", namespace = WsConstants.NS)
public class SupplierbusinessResult extends WSResult{
	private SupplierbusinessDTO supplierbusiness;

	public SupplierbusinessResult() {}

	public SupplierbusinessResult(SupplierbusinessDTO supplierbusiness) {
		this.supplierbusiness = supplierbusiness;
	}
	
	
	@XmlElement(name = "supplierbusiness")
	public SupplierbusinessDTO getSupplierbusiness() {
		return supplierbusiness;
	}

	public void setSupplierbusiness(SupplierbusinessDTO supplierbusiness) {
		this.supplierbusiness = supplierbusiness;
	}


	
	
}
