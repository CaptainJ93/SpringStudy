package com.best1.api.webservice.soap.response.result.scm;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.SpmProductgeneralDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "SpmProductgeneralResult", namespace = WsConstants.NS)
public class SpmProductgeneralReult  extends WSResult{


	private SpmProductgeneralDTO spmproductgeneral;

	public SpmProductgeneralReult(){
		
	}
	public SpmProductgeneralReult(SpmProductgeneralDTO spmproductgeneral) {
		this.spmproductgeneral = spmproductgeneral;
	}
	
	
	@XmlElement(name = "spmproductgenerale")
	public SpmProductgeneralDTO getSpmproductgeneral() {
		return spmproductgeneral;
	}
	public void setSpmproductgeneral(SpmProductgeneralDTO spmproductgeneral) {
		this.spmproductgeneral = spmproductgeneral;
	}
	
	
	
	
}

	