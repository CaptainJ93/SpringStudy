package com.best1.api.webservice.soap.response.result.scm;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.SuppliermasterDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "SuppliermastersResult", namespace = WsConstants.NS)
public class SuppliermastersResult extends WSResult{
	private List<SuppliermasterDTO> suppliermasters;

	public SuppliermastersResult() { }

	public SuppliermastersResult(List<SuppliermasterDTO> suppliermasters) {
		this.suppliermasters = suppliermasters;
	}
	
	

	@XmlElementWrapper(name = "suppliermasters")
	@XmlElement(name = "suppliermaster")
	public List<SuppliermasterDTO> getSuppliermasters() {
		return suppliermasters;
	}

	public void setSuppliermasters(List<SuppliermasterDTO> suppliermasters) {
		this.suppliermasters = suppliermasters;
	}

}
