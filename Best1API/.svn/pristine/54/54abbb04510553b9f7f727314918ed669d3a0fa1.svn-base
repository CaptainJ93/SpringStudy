package com.best1.api.webservice.soap.response.result.scm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.SpmProductattributeDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "spmProductattributeResult", namespace = WsConstants.NS)
public class SpmProductattributeResult extends WSResult {

	private SpmProductattributeDTO productattribute;

	public SpmProductattributeResult() {

	}

	public SpmProductattributeResult(SpmProductattributeDTO productattribute) {
		this.productattribute = productattribute;
	}

	@XmlElement(name = "spmproductattribute")
	public SpmProductattributeDTO getProductattribute() {
		return productattribute;
	}

	public void setProductattribute(SpmProductattributeDTO productattribute) {
		this.productattribute = productattribute;
	}

}
