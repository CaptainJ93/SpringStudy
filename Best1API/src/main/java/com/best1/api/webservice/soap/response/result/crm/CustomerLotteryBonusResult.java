package com.best1.api.webservice.soap.response.result.crm;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.crm.CustomerLotteryBonusDTO;
import com.best1.api.webservice.utils.WsConstants;
@XmlType(name = "CustomerLotteryBonusResult", namespace = WsConstants.NS)
public class CustomerLotteryBonusResult extends WSResult{
	private CustomerLotteryBonusDTO customerlotterybonus;

	public CustomerLotteryBonusResult(){
		
	}
	public CustomerLotteryBonusResult(CustomerLotteryBonusDTO customerlotterybonus) {
		this.customerlotterybonus = customerlotterybonus;
	}
	@XmlElement(name = "customerlotterybonus")
	public CustomerLotteryBonusDTO getCustomerlotterybonus() {
		return customerlotterybonus;
	}
	public void setCustomerlotterybonus(CustomerLotteryBonusDTO customerlotterybonus) {
		this.customerlotterybonus = customerlotterybonus;
	}
	

	
}
