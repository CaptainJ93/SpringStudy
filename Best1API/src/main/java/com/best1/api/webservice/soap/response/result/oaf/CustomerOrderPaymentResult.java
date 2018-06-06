package com.best1.api.webservice.soap.response.result.oaf;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.oaf.CustomerOrderPaymentDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "CustomerOrderPaymentResult", namespace = WsConstants.NS)
public class CustomerOrderPaymentResult extends WSResult{

	
	private CustomerOrderPaymentDTO customerOrderPayment;

	public CustomerOrderPaymentResult(){
		
	}

	public CustomerOrderPaymentResult(CustomerOrderPaymentDTO customerOrderPayment) {
		this.customerOrderPayment = customerOrderPayment;
	}

	@XmlElement(name = "customerorderpayment")
	public CustomerOrderPaymentDTO getCustomerOrderPayment() {
		return customerOrderPayment;
	}

	public void setCustomerOrderPayment(CustomerOrderPaymentDTO customerOrderPayment) {
		this.customerOrderPayment = customerOrderPayment;
	}



}
