package com.best1.api.webservice.soap.response.result.scm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.SupplieraddressDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "supplieraddressResult", namespace = WsConstants.NS)
public class SupplieraddressResult extends WSResult{
	private SupplieraddressDTO supplieraddress;

	public SupplieraddressResult() { }

	public SupplieraddressResult(SupplieraddressDTO supplieraddress) {
		this.supplieraddress = supplieraddress;
	}
	
	@XmlElement(name = "supplieraddress")
	public SupplieraddressDTO getSupplieraddress() {
		return supplieraddress;
	}

	public void setSupplieraddress(SupplieraddressDTO supplieraddress) {
		this.supplieraddress = supplieraddress;
	}

	

	
}
