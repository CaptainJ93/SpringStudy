package com.best1.api.webservice.soap.response.result.oaf;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import java.util.List;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.oaf.OrderDTO;
import com.best1.api.webservice.utils.WsConstants;
@XmlType(name = "CustomerOrdersResult", namespace = WsConstants.NS)
public class OrdersResult  extends WSResult{
private List<OrderDTO> orders;

public OrdersResult(){
	
}
public OrdersResult(List<OrderDTO> orders) {
	this.orders = orders;
}
@XmlElementWrapper(name = "customerorders")
@XmlElement(name = "customerorder")
public List<OrderDTO> getOrders() {
	return orders;
}
public void setOrders(List<OrderDTO> orders) {
	this.orders = orders;
}




}
