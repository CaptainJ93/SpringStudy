package com.best1.api.webservice.soap.response.result.crm;

import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.crm.CustomerBlacklistDTO;
import com.best1.api.webservice.utils.WsConstants;


@XmlType(name = "CustomerBlacklistResult", namespace = WsConstants.NS)
public class CustomerBlacklistResult  extends WSResult{
	
private CustomerBlacklistDTO customerblacklist;

public CustomerBlacklistDTO getCustomerblacklist() {
	return customerblacklist;
}

public void setCustomerblacklist(CustomerBlacklistDTO customerblacklist) {
	this.customerblacklist = customerblacklist;
}






}
