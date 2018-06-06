package com.best1.api.webservice.soap.response.result.scm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.ProductClassDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "ProductClassResult", namespace = WsConstants.NS)
public class ProductClassResult extends WSResult {
	
	private ProductClassDTO productClass;
	
	public ProductClassResult(){
		
	}

	public ProductClassResult(ProductClassDTO productClass) {
		this.productClass = productClass;
	}

	@XmlElement(name="productclass")
	public ProductClassDTO getProductClass() {
		return productClass;
	}

	public void setProductClass(ProductClassDTO productClass) {
		this.productClass = productClass;
	}
	
}
