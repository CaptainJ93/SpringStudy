package com.best1.api.webservice.soap.response.result.crm;



import com.best1.api.webservice.soap.response.dto.crm.CustomerNetworkDTO;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "CustomerNetworkResult", namespace = WsConstants.NS)
public class CustomerNetworkResult extends WSResult {

	private CustomerNetworkDTO customernetwork;

	@XmlElement(name = "customernetwork")
	public CustomerNetworkDTO getCustomernetwork() {
		return customernetwork;
	}

	public void setCustomernetwork(CustomerNetworkDTO customernetwork) {
		this.customernetwork = customernetwork;
	}

	
}