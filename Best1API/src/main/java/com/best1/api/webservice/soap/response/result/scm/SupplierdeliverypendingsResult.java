package com.best1.api.webservice.soap.response.result.scm;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.SupplierdeliverypendingDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "SupplierdeliverypendingsResult", namespace = WsConstants.NS)
public class SupplierdeliverypendingsResult extends WSResult{
	
	private List<SupplierdeliverypendingDTO> supplierdeliverypendings;

	public SupplierdeliverypendingsResult() { }

	public SupplierdeliverypendingsResult(List<SupplierdeliverypendingDTO> supplierdeliverypendings) {
		this.supplierdeliverypendings = supplierdeliverypendings;
	}
	
	

	@XmlElementWrapper(name = "supplierdeliverypendings")
	@XmlElement(name = "supplierdeliverypending")
	public List<SupplierdeliverypendingDTO> getSupplierdeliverypendings() {
		return supplierdeliverypendings;
	}

	public void setSupplierdeliverypendings(
			List<SupplierdeliverypendingDTO> supplierdeliverypendings) {
		this.supplierdeliverypendings = supplierdeliverypendings;
	}

	
	
}
