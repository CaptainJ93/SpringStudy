package com.best1.api.webservice.soap.response.result.vwms;

import java.util.List;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.vwms.CustomerShiporderDTO;

public class CustomerShiporderResult extends WSResult{
	
private List<CustomerShiporderDTO>  customerShiporders;

public List<CustomerShiporderDTO> getCustomerShiporders() {
	return customerShiporders;
}

public void setCustomerShiporders(List<CustomerShiporderDTO> customerShiporders) {
	this.customerShiporders = customerShiporders;
}




}
