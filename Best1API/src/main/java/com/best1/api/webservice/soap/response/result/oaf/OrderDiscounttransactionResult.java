package com.best1.api.webservice.soap.response.result.oaf;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.oaf.OrderDiscounttransactionDTO;
 
public class OrderDiscounttransactionResult extends WSResult{

	private OrderDiscounttransactionDTO orderDiscounttransaction;

	public OrderDiscounttransactionDTO getOrderDiscounttransaction() {
		return orderDiscounttransaction;
	}

	public void setOrderDiscounttransaction(OrderDiscounttransactionDTO orderDiscounttransaction) {
		this.orderDiscounttransaction = orderDiscounttransaction;
	}
}
