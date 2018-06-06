
package com.best1.api.webservice.soap.response.result.oaf;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.oaf.OrderedProductDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "CustomerOrderedProductsResult", namespace = WsConstants.NS)
public class OrderedProductsResult extends WSResult {

	private List<OrderedProductDTO> orderedproducts;

	public OrderedProductsResult(){
		
	}

	public OrderedProductsResult(List<OrderedProductDTO> orderedproducts) {
		this.orderedproducts = orderedproducts;
	}
	@XmlElementWrapper(name = "customerorderedProducts")
	@XmlElement(name = "customerorderedProduct")
	public List<OrderedProductDTO> getOrderedproducts() {
		return orderedproducts;
	}
	public void setOrderedproducts(List<OrderedProductDTO> orderedproducts) {
		this.orderedproducts = orderedproducts;
	}
	
	
	
}
