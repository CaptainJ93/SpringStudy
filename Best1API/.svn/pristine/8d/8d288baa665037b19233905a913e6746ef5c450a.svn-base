package com.best1.api.webservice.soap.response.result.scm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.ProductgeneralDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "ProductgeneralResult", namespace = WsConstants.NS)
public class ProductgeneralResult extends WSResult {

	private ProductgeneralDTO productgeneral;

	public ProductgeneralResult() {

	}

	public ProductgeneralResult(ProductgeneralDTO productgeneral) {
		this.productgeneral = productgeneral;
	}

	@XmlElement(name = "productgeneral")
	public ProductgeneralDTO getProductgeneral() {
		return productgeneral;
	}

	public void setProductgeneral(ProductgeneralDTO productgeneral) {
		this.productgeneral = productgeneral;
	}

}
