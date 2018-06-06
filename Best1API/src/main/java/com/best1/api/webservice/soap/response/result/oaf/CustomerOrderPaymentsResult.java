package com.best1.api.webservice.soap.response.result.oaf;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.oaf.CustomerOrderPaymentDTO;
import com.best1.api.webservice.utils.WsConstants;



@XmlType(name = "CustomerOrderPaymentsResult", namespace = WsConstants.NS)
public class CustomerOrderPaymentsResult extends WSResult {

	private  List<CustomerOrderPaymentDTO> customerorderpayments;

	public CustomerOrderPaymentsResult(){
		
	}

	public CustomerOrderPaymentsResult(List<CustomerOrderPaymentDTO> customerorderpayments) {
		this.customerorderpayments = customerorderpayments;
	}
	
	
	@XmlElementWrapper(name = "customerorderpayments")
	@XmlElement(name = "customerorderpayment")
	public List<CustomerOrderPaymentDTO> getCustomerorderpayments() {
		return customerorderpayments;
	}

	public void setCustomerorderpayments(
			List<CustomerOrderPaymentDTO> customerorderpayments) {
		this.customerorderpayments = customerorderpayments;
	}

	

	
}	