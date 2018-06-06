package com.best1.api.webservice.soap.response.result.crm;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.utils.WsConstants;


import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.crm.CustomerAccountBalanceDTO;

@XmlType(name = "CustomerAccountBalanceResult", namespace = WsConstants.NS)
public class CustomerAccountBalanceResult extends WSResult {

	
	private List<CustomerAccountBalanceDTO> customeraccountbalances;

	public CustomerAccountBalanceResult(){
		
	}
	public CustomerAccountBalanceResult(List<CustomerAccountBalanceDTO> customeraccountbalances) {
		this.customeraccountbalances = customeraccountbalances;
	}
	
	@XmlElementWrapper(name = "customeraccountbalances")
	@XmlElement(name = "customeraccountbalance")
	public List<CustomerAccountBalanceDTO> getCustomeraccountbalances() {
		return customeraccountbalances;
	}
	public void setCustomeraccountbalances(
			List<CustomerAccountBalanceDTO> customeraccountbalances) {
		this.customeraccountbalances = customeraccountbalances;
	}
	
	
}
