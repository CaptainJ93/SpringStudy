package com.best1.api.webservice.soap.response.result.scm;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.ProductDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "ProductsResult", namespace = WsConstants.NS)
public class ProductsResult extends WSResult {

	private List<ProductDTO> products;

	public ProductsResult(){
		
	}
	public ProductsResult(List<ProductDTO> products) {
		this.products = products;
	}
	@XmlElementWrapper(name = "products")
	@XmlElement(name = "product")
	public List<ProductDTO> getProducts() {
		return products;
	}
	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}


	
	
	
}
