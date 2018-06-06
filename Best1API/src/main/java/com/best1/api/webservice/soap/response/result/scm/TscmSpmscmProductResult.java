package com.best1.api.webservice.soap.response.result.scm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.TscmSpmscmproductDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "tscmSpmscmProductResult", namespace = WsConstants.NS)
public class TscmSpmscmProductResult extends WSResult {

	private TscmSpmscmproductDTO tscmspmscmproductDTO;

	public TscmSpmscmProductResult(TscmSpmscmproductDTO tscmspmscmproductDTO) {
		super();
		this.tscmspmscmproductDTO = tscmspmscmproductDTO;
	}

	public TscmSpmscmProductResult() {
		super();
	}

	@XmlElement(name = "tscmSpmscmProduct")
	public TscmSpmscmproductDTO getTscmspmscmproductDTO() {
		return tscmspmscmproductDTO;
	}

	public void setTscmspmscmproductDTO(
			TscmSpmscmproductDTO tscmspmscmproductDTO) {
		this.tscmspmscmproductDTO = tscmspmscmproductDTO;
	}

}
