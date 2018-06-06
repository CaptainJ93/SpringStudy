package com.best1.api.webservice.soap.response.result.scm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.ProductcolourstyleDTO;
import com.best1.api.webservice.utils.WsConstants;


@XmlType(name = "productcolourstyleResult", namespace = WsConstants.NS)
public class ProductcolourstyleResult extends WSResult {

	private ProductcolourstyleDTO productcolourstyle;

	public ProductcolourstyleResult(){
		
	}
	public ProductcolourstyleResult(ProductcolourstyleDTO productcolourstyle) {
		this.productcolourstyle = productcolourstyle;
	}
	
	@XmlElement(name = "productcolourstyle")
	public ProductcolourstyleDTO getProductcolourstyle() {
		return productcolourstyle;
	}
	public void setProductcolourstyle(ProductcolourstyleDTO productcolourstyle) {
		this.productcolourstyle = productcolourstyle;
	}
}
