package com.best1.api.webservice.soap.response.result.crm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.utils.WsConstants;


import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.crm.CustomerDTO;
@XmlType(name = "CustomerResult", namespace = WsConstants.NS)
public class CustomerResult extends WSResult {

	private CustomerDTO  customer;

	@XmlElement(name = "customer")
	public CustomerDTO getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}
	
	
	
}
