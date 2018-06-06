package com.best1.api.webservice.soap.response.result.scm;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.ProductwarehouseDTO;
import com.best1.api.webservice.utils.WsConstants;



@XmlType(name = "ProductwarehousesResult", namespace = WsConstants.NS)
public class ProductwarehousesResult extends WSResult {

	private List<ProductwarehouseDTO> productwarehouses;

	public ProductwarehousesResult(){
		
	}
	public ProductwarehousesResult(List<ProductwarehouseDTO> productwarehouses) {
		this.productwarehouses = productwarehouses;
	}
	
	@XmlElementWrapper(name = "productwarehouses")
	@XmlElement(name = "productwarehouse")
	public List<ProductwarehouseDTO> getProductwarehouses() {
		return productwarehouses;
	}
	public void setProductwarehouses(List<ProductwarehouseDTO> productwarehouses) {
		this.productwarehouses = productwarehouses;
	}
	
	
	
	
}
