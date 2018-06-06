package com.best1.api.webservice.soap.response.result.scm;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.ProductInfoDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "ProductInfosResult", namespace = WsConstants.NS)
public class ProductInfosResult extends WSResult {

	private List<ProductInfoDTO> products;

	public ProductInfosResult(){
		
	}
	public ProductInfosResult(List<ProductInfoDTO> products) {
		this.products = products;
	}
	@XmlElementWrapper(name = "productinfos")
	@XmlElement(name = "productinfo")
	public List<ProductInfoDTO> getProducts() {
		return products;
	}
	public void setProducts(List<ProductInfoDTO> products) {
		this.products = products;
	}


	
	
	
}
