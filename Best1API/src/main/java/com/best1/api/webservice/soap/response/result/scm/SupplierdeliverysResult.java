package com.best1.api.webservice.soap.response.result.scm;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.SupplierdeliveryDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "SupplierdeliveryResult", namespace = WsConstants.NS)
public class SupplierdeliverysResult extends WSResult{
	private List<SupplierdeliveryDTO> supplierdeliverys;

	public SupplierdeliverysResult() { }

	public SupplierdeliverysResult(List<SupplierdeliveryDTO> supplierdeliverys) {
		this.supplierdeliverys = supplierdeliverys;
	}
	
	@XmlElementWrapper(name = "supplierdeliverys")
	@XmlElement(name = "supplierdelivery")
	public List<SupplierdeliveryDTO> getSupplierdeliverys() {
		return supplierdeliverys;
	}

	public void setSupplierdeliverys(List<SupplierdeliveryDTO> supplierdeliverys) {
		this.supplierdeliverys = supplierdeliverys;
	}

	
	
}
