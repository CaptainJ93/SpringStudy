package com.best1.api.webservice.soap.response.result.crm;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.crm.CustomerEleccouponsDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "CustomerEleccouponsResult", namespace = WsConstants.NS)
public class CustomerEleccouponsResult  extends WSResult{

	private List<CustomerEleccouponsDTO> customereleccouponses;

	public CustomerEleccouponsResult(){
		
	}
	
	public CustomerEleccouponsResult(List<CustomerEleccouponsDTO> customereleccouponses) {
		this.customereleccouponses = customereleccouponses;
	}
	
	
	@XmlElementWrapper(name = "customereleccouponses")
	@XmlElement(name = "customereleccoupons")
	public List<CustomerEleccouponsDTO> getCustomereleccouponses() {
		return customereleccouponses;
	}
	public void setCustomereleccouponses(
			List<CustomerEleccouponsDTO> customereleccouponses) {
		this.customereleccouponses = customereleccouponses;
	}
	
	
	
	
	
}
