package com.best1.api.webservice.soap.response.result.crm;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;


import com.best1.api.webservice.utils.WsConstants;

import com.best1.api.webservice.soap.response.dto.crm.CustomerDTO;
@XmlType(name = "CustomerAndAddressResult", namespace = WsConstants.NS)
public class CustomerAndAddressResult extends WSResult {

	private List<CustomerDTO> customerandaddresses;

	public CustomerAndAddressResult(){
		
	}
	public CustomerAndAddressResult(List<CustomerDTO> customerandaddresses) {
		this.customerandaddresses = customerandaddresses;
	}
	@XmlElementWrapper(name = "customerandaddresses")
	@XmlElement(name = "customerandaddress")
	public List<CustomerDTO> getCustomerandaddresses() {
		return customerandaddresses;
	}

	public void setCustomerandaddresses(List<CustomerDTO> customerandaddresses) {
		this.customerandaddresses = customerandaddresses;
	}

		
		
}
