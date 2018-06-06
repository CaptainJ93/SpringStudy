package com.best1.api.webservice.soap.response.result.scm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.SuppliermasterDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "SuppliermasterResult", namespace = WsConstants.NS)
public class SuppliermasterResult extends WSResult{
	private SuppliermasterDTO suppliermaster;

	public SuppliermasterResult() { }

	public SuppliermasterResult(SuppliermasterDTO suppliermaster) {
		this.suppliermaster = suppliermaster;
	}

	

	@XmlElement(name = "suppliermaster")
	public SuppliermasterDTO getSuppliermaster() {
		return suppliermaster;
	}

	public void setSuppliermaster(SuppliermasterDTO suppliermaster) {
		this.suppliermaster = suppliermaster;
	}

	
}
