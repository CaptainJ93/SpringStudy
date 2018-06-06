package com.best1.api.webservice.soap.response.result.crm;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;

import com.best1.api.webservice.soap.response.dto.crm.CustomerLotteryBonusDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "CustomerLotteryBonusesResult", namespace = WsConstants.NS)
public class CustomerLotteryBonusesResult extends WSResult{


	private List<CustomerLotteryBonusDTO> customerlotterybonuses;

	public CustomerLotteryBonusesResult(){
		
	}
	public CustomerLotteryBonusesResult(List<CustomerLotteryBonusDTO> customerlotterybonuses) {
		this.customerlotterybonuses = customerlotterybonuses;
	}
	

	@XmlElementWrapper(name = "customerlotterybonuses")
	@XmlElement(name = "customerlotterybonus")
	public List<CustomerLotteryBonusDTO> getCustomerlotterybonuses() {
		return customerlotterybonuses;
	}
	public void setCustomerlotterybonuses(
			List<CustomerLotteryBonusDTO> customerlotterybonuses) {
		this.customerlotterybonuses = customerlotterybonuses;
	}
	
	
}
