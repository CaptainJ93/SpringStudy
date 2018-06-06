package com.best1.api.webservice.soap.response.result.crm;

import java.util.List;

import com.best1.api.webservice.soap.response.dto.crm.CustomerNetworkDTO;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "CustomerNetworksResult", namespace = WsConstants.NS)
public class CustomerNetworksResult extends WSResult {

	private List<CustomerNetworkDTO> customernetworks;

	@XmlElementWrapper(name = "customernetworks")
	@XmlElement(name = "customernetwork")
	public List<CustomerNetworkDTO> getCustomernetworks() {
		return customernetworks;
	}

	public void setCustomernetworks(List<CustomerNetworkDTO> customernetworks) {
		this.customernetworks = customernetworks;
	}

}
