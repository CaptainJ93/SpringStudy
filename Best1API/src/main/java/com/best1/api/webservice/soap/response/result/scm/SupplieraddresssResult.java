package com.best1.api.webservice.soap.response.result.scm;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.SupplieraddressDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "supplieraddresssResult", namespace = WsConstants.NS)
public class SupplieraddresssResult extends WSResult{
	private List<SupplieraddressDTO> supplieraddresss;

	public SupplieraddresssResult() { }

	public SupplieraddresssResult(List<SupplieraddressDTO> supplieraddresss) {
		this.supplieraddresss = supplieraddresss;
	}
	

	@XmlElementWrapper(name = "supplieraddresss")
	@XmlElement(name = "supplieraddress")
	public List<SupplieraddressDTO> getSupplieraddresss() {
		return supplieraddresss;
	}

	public void setSupplieraddresss(List<SupplieraddressDTO> supplieraddresss) {
		this.supplieraddresss = supplieraddresss;
	}

	
	
	
	
}
