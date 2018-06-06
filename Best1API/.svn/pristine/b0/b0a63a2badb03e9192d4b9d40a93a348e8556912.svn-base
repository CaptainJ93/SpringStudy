package com.best1.api.webservice.soap.response.result.oaf;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.oaf.OrderedProductDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "CustomerOrderedProductResult", namespace = WsConstants.NS)
public class OrderedProductResult extends WSResult {

	private OrderedProductDTO orderedproduct;

	public OrderedProductResult(){
		
	}
	public OrderedProductResult(OrderedProductDTO orderedproduct) {
		this.orderedproduct = orderedproduct;
	}
	

	@XmlElement(name = "customerorderedProduct")
	public OrderedProductDTO getOrderedproduct() {
		return orderedproduct;
	}
	public void setOrderedproduct(OrderedProductDTO orderedproduct) {
		this.orderedproduct = orderedproduct;
	}
	
	
}
