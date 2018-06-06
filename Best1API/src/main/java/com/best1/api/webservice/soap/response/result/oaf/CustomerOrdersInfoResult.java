package com.best1.api.webservice.soap.response.result.oaf;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.oaf.CustomerOrderInfoDTO;
import com.best1.api.webservice.utils.WsConstants;


@XmlType(name = "CustomerOrderedsInfoResult", namespace = WsConstants.NS)
public class CustomerOrdersInfoResult extends WSResult {

	private List<CustomerOrderInfoDTO> customerorderinfoes;

	public CustomerOrdersInfoResult(){
		
	}

	public CustomerOrdersInfoResult(List<CustomerOrderInfoDTO> customerorderinfoes) {
		this.customerorderinfoes = customerorderinfoes;
	}
	
	
	@XmlElementWrapper(name = "customerorderinfoes")
	@XmlElement(name = "customerorderinfo")
	public List<CustomerOrderInfoDTO> getCustomerorderinfoes() {
		return customerorderinfoes;
	}

	public void setCustomerorderinfoes(
			List<CustomerOrderInfoDTO> customerorderinfoes) {
		this.customerorderinfoes = customerorderinfoes;
	}


	
}	