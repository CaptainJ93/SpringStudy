package com.best1.api.webservice.soap.response.result.scm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.SpmSupplierBusinessDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "SpmSupplierBusinessResult", namespace = WsConstants.NS)
public class SpmSupplierBusinessResult extends WSResult {
	
	private SpmSupplierBusinessDTO supplierBusiness;
	
	public SpmSupplierBusinessResult() {
		
	}
	
	public SpmSupplierBusinessResult(SpmSupplierBusinessDTO supplierBusiness) {
		this.supplierBusiness = supplierBusiness;
	}
	
	@XmlElement(name="spmsupplierbusiness")
	public SpmSupplierBusinessDTO getSupplierBusiness() {
		return supplierBusiness;
	}

	public void setSupplierBusiness(SpmSupplierBusinessDTO supplierBusiness) {
		this.supplierBusiness = supplierBusiness;
	}
	
}
