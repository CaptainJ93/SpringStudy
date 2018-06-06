package com.best1.api.webservice.soap.response.result.scm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.ProductDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "ProductResult", namespace = WsConstants.NS)
public class ProductResult extends WSResult {

	private ProductDTO product;

	public ProductResult() {

	}

	public ProductResult(ProductDTO product) {
		this.product = product;
	}

	@XmlElement(name = "product")
	public ProductDTO getProduct() {
		return product;
	}

	public void setProduct(ProductDTO product) {
		this.product = product;
	}

}
