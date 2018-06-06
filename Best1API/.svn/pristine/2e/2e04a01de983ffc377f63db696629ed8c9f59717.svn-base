package com.best1.api.webservice.soap.response.result.scm;



import javax.xml.bind.annotation.XmlElement;




import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.SpmProductDTO;
import com.best1.api.webservice.utils.WsConstants;
@XmlType(name = "spmproductResult", namespace = WsConstants.NS)
public class SpmProductResult extends WSResult{
	private SpmProductDTO spmproduct;

	public SpmProductResult(){
		
	}
	public SpmProductResult(SpmProductDTO spmproduct) {
		this.spmproduct = spmproduct;
	}

	@XmlElement(name = "spmproduct")
	public SpmProductDTO getSpmproduct() {
		return spmproduct;
	}
	public void setSpmproduct(SpmProductDTO spmproduct) {
		this.spmproduct = spmproduct;
	}
}
