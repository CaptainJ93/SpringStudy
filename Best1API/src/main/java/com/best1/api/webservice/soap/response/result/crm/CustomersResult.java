package com.best1.api.webservice.soap.response.result.crm;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.utils.WsConstants;


import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.crm.CustomerDTO;
@XmlType(name = "CustomersResult", namespace = WsConstants.NS)
public class CustomersResult extends WSResult {

	private List<CustomerDTO> customers;

	@XmlElement(name = "customers")
	public List<CustomerDTO> getCustomers() {
		return customers;
	}

	public void setCustomers(List<CustomerDTO> customers) {
		this.customers = customers;
	}
	
	
	
}
