package com.best1.api.webservice.soap.response.result.scm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.SpmProductwarehouseDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "spmProductwarehousesResult", namespace = WsConstants.NS)
public class SpmProductwarehousesResult extends WSResult {

	private SpmProductwarehouseDTO productwarehouse;

	public SpmProductwarehousesResult() {

	}

	public SpmProductwarehousesResult(SpmProductwarehouseDTO productwarehouse) {
		this.productwarehouse = productwarehouse;
	}

	@XmlElement(name = "spmproductwarehouse")
	public SpmProductwarehouseDTO getProductwarehouse() {
		return productwarehouse;
	}

	public void setProductwarehouse(SpmProductwarehouseDTO productwarehouse) {
		this.productwarehouse = productwarehouse;
	}

}
