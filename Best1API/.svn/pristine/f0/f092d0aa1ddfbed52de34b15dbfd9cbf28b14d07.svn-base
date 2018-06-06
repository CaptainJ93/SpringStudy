package com.best1.api.webservice.soap.response.result.oaf;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.oaf.CustomerOrderInfoDTO;
import com.best1.api.webservice.utils.WsConstants;


@XmlType(name = "CustomerOrderedInfoResult", namespace = WsConstants.NS)
public class CustomerOrderInfoResult extends WSResult {

	private CustomerOrderInfoDTO customerorderinfo;

	public CustomerOrderInfoResult(){
		
	}

	public CustomerOrderInfoResult(CustomerOrderInfoDTO customerorderinfo) {
		this.customerorderinfo = customerorderinfo;
	}
	
	@XmlElement(name = "customerorderinfo")
	public CustomerOrderInfoDTO getCustomerorderinfo() {
		return customerorderinfo;
	}

	public void setCustomerorderinfo(CustomerOrderInfoDTO customerorderinfo) {
		this.customerorderinfo = customerorderinfo;
	}

	
}	