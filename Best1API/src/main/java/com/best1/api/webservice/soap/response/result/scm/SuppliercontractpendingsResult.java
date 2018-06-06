package com.best1.api.webservice.soap.response.result.scm;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.SuppliercontractpendingDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "suppliercontractpendingsResult", namespace = WsConstants.NS)
public class SuppliercontractpendingsResult extends WSResult{
	private List<SuppliercontractpendingDTO> suppliercontractpendings;

	public SuppliercontractpendingsResult() { }

	public SuppliercontractpendingsResult(List<SuppliercontractpendingDTO> suppliercontractpendings) {
		this.suppliercontractpendings = suppliercontractpendings;
	}
	
	
	@XmlElementWrapper(name = "suppliercontractpendings")
	@XmlElement(name = "suppliercontractpending")
	public List<SuppliercontractpendingDTO> getSuppliercontractpendings() {
		return suppliercontractpendings;
	}

	public void setSuppliercontractpendings(
			List<SuppliercontractpendingDTO> suppliercontractpendings) {
		this.suppliercontractpendings = suppliercontractpendings;
	}

	
	
}
