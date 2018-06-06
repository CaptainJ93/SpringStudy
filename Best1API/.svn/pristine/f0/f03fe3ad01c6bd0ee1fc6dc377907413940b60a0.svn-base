package com.best1.api.webservice.soap.response.result.scm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.SpmSupplierDTO;
import com.best1.api.webservice.utils.WsConstants;


@XmlType(name = "SpmSupplierResult", namespace = WsConstants.NS)
public class SpmSupplierResult extends WSResult {
	
	private SpmSupplierDTO suppliers;

	public SpmSupplierResult() {

	}
	
	public SpmSupplierResult(SpmSupplierDTO suppliers) {
		this.suppliers = suppliers;
	}

	@XmlElement(name = "spmsupplier")
	public SpmSupplierDTO getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(SpmSupplierDTO suppliers) {
		this.suppliers = suppliers;
	}
	
}
