package com.best1.api.webservice.soap.response.result.chm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.chm.PgmProductDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "pgmProductInfoResult", namespace = WsConstants.NS)
public class PgmProductInfoResult extends WSResult {
	private PgmProductDTO pgmproduct;

	public PgmProductInfoResult() {

	}

	public PgmProductInfoResult(PgmProductDTO pgmproduct) {
		this.pgmproduct = pgmproduct;
	}

	@XmlElement(name = "pgmproduct")
	public PgmProductDTO getPgmproduct() {
		return pgmproduct;
	}

	public void setPgmproduct(PgmProductDTO pgmproduct) {
		this.pgmproduct = pgmproduct;
	}

}
