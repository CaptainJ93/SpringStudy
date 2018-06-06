package com.best1.api.webservice.soap.response.result.scm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.SpmSupplierAddressDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "SpmSupplierAddressResult", namespace = WsConstants.NS)
public class SpmSupplierAddressResult extends WSResult {
	
	private SpmSupplierAddressDTO supplierAddress;
	
	public SpmSupplierAddressResult(){
		
	}
	
	public SpmSupplierAddressResult(SpmSupplierAddressDTO supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	@XmlElement(name="spmsupplieraddress")
	public SpmSupplierAddressDTO getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(SpmSupplierAddressDTO supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	
}
