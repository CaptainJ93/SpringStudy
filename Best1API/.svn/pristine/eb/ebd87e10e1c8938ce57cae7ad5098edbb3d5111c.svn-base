package com.best1.api.webservice.soap.response.result.crm;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;


import com.best1.api.webservice.utils.WsConstants;


import com.best1.api.webservice.soap.response.dto.crm.CustomerAddressDTO;
@XmlType(name = "CustomerAddressesResult", namespace = WsConstants.NS)
public class CustomerAddressesResult extends WSResult {
	private List<CustomerAddressDTO> customeraddresses;

	public CustomerAddressesResult() {
	}
	
	
	

	public CustomerAddressesResult(List<CustomerAddressDTO> customeraddresses) {
		this.customeraddresses = customeraddresses;
	}
	@XmlElementWrapper(name = "customeraddresses")
	@XmlElement(name = "customeraddress")
	public List<CustomerAddressDTO> getCustomeraddresses() {
		return customeraddresses;
	}

	public void setCustomeraddresses(List<CustomerAddressDTO> customeraddresses) {
		this.customeraddresses = customeraddresses;
	}

	
	
}
