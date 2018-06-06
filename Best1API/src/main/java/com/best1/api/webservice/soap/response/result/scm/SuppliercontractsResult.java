package com.best1.api.webservice.soap.response.result.scm;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.SuppliercontractDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "suppliercontractsResult", namespace = WsConstants.NS)
public class SuppliercontractsResult extends WSResult{
	private List<SuppliercontractDTO> suppliercontracts;

	public SuppliercontractsResult() {}

	public SuppliercontractsResult(List<SuppliercontractDTO> suppliercontracts) {
		this.suppliercontracts = suppliercontracts;
	}
	
	
	
	
	@XmlElementWrapper(name = "suppliercontracts")
	@XmlElement(name = "suppliercontract")
	public List<SuppliercontractDTO> getSuppliercontracts() {
		return suppliercontracts;
	}

	public void setSuppliercontracts(List<SuppliercontractDTO> suppliercontracts) {
		this.suppliercontracts = suppliercontracts;
	}


	
}
