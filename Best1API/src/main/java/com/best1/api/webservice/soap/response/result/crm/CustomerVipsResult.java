package com.best1.api.webservice.soap.response.result.crm;

import java.util.List;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.crm.CustomerVipDTO;

public class CustomerVipsResult extends WSResult{
private List<CustomerVipDTO> customervips;

public List<CustomerVipDTO> getCustomervips() {
	return customervips;
}

public void setCustomervips(List<CustomerVipDTO> customervips) {
	this.customervips = customervips;
}





}
