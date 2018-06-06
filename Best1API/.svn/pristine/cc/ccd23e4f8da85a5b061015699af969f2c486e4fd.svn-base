package com.best1.api.webservice.soap.response.result.view;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.view.OrderPaymentViewDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "OrderPaymentViewResult", namespace = WsConstants.NS)
public class OrderPaymentViewResult extends WSResult {
	private List<OrderPaymentViewDTO> orderPaymentViewDTOs;

	public OrderPaymentViewResult() {
	}

	public OrderPaymentViewResult(List<OrderPaymentViewDTO> orderPaymentViewDTOs) {
		super();
		this.orderPaymentViewDTOs = orderPaymentViewDTOs;
	}

	@XmlElementWrapper(name = "orderPaymentViews")
	@XmlElement(name = "orderPaymentView")
	public List<OrderPaymentViewDTO> getOrderPaymentViewDTOs() {
		return orderPaymentViewDTOs;
	}

	public void setOrderPaymentViewDTOs(
			List<OrderPaymentViewDTO> orderPaymentViewDTOs) {
		this.orderPaymentViewDTOs = orderPaymentViewDTOs;
	}

}
