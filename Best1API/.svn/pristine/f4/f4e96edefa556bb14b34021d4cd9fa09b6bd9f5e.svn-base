package com.best1.api.webservice.soap.response.result.oaf;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.oaf.OrderDTO;
import com.best1.api.webservice.utils.WsConstants;
@XmlType(name = "CustomerOrderResult", namespace = WsConstants.NS)
public class OrderResult  extends WSResult{
private OrderDTO order;

public OrderResult(){
	
}
public OrderResult(OrderDTO order) {
	this.order = order;
}

@XmlElement(name = "customerorder")
public OrderDTO getOrder() {
	return order;
}
public void setOrder(OrderDTO order) {
	this.order = order;
}



}


