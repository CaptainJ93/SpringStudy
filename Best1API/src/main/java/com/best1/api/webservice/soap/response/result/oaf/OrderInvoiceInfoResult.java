package com.best1.api.webservice.soap.response.result.oaf;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.oaf.OrderInvoiceInfoDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "OrderInvoiceInfoResult", namespace = WsConstants.NS)
public class OrderInvoiceInfoResult extends WSResult{
	private OrderInvoiceInfoDTO orderInvoiceInfo;

	public OrderInvoiceInfoResult() {
		
	}

	public OrderInvoiceInfoResult(OrderInvoiceInfoDTO orderInvoiceInfo) {
		this.orderInvoiceInfo = orderInvoiceInfo;
	}
	
	@XmlElement(name = "orderInvoiceInfo")
	public OrderInvoiceInfoDTO getOrderInvoiceInfo() {
		return orderInvoiceInfo;
	}

	public void setOrderInvoiceInfo(OrderInvoiceInfoDTO orderInvoiceInfo) {
		this.orderInvoiceInfo = orderInvoiceInfo;
	}
	
}
