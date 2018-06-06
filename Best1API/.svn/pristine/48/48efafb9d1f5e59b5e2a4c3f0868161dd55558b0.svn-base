package com.best1.api.webservice.soap.response.result.oaf;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.oaf.OrderReasonInfoDTO;
import com.best1.api.webservice.utils.WsConstants;
@XmlType(name = "OrderReasonInfoesResult", namespace = WsConstants.NS)
public class OrderReasonInfoesResult  extends WSResult {


	private List<OrderReasonInfoDTO> orderreasoninfoes;

	public OrderReasonInfoesResult(){
		
	}

	public OrderReasonInfoesResult(List<OrderReasonInfoDTO> orderreasoninfoes) {
		this.orderreasoninfoes = orderreasoninfoes;
	}
	
	
	@XmlElementWrapper(name = "orderReasonInfoes")
	@XmlElement(name = "orderReasonInfo")
	public List<OrderReasonInfoDTO> getOrderreasoninfoes() {
		return orderreasoninfoes;
	}

	public void setOrderreasoninfoes(List<OrderReasonInfoDTO> orderreasoninfoes) {
		this.orderreasoninfoes = orderreasoninfoes;
	}

	
	
	
}
