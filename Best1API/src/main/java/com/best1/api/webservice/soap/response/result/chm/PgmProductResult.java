package com.best1.api.webservice.soap.response.result.chm;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.chm.PgmProductDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "pgmProductResult", namespace = WsConstants.NS)
public class PgmProductResult extends WSResult {
	private List<PgmProductDTO> pgmproducts;

	public PgmProductResult(){
		
	}
	public PgmProductResult(List<PgmProductDTO> pgmproducts) {
		this.pgmproducts = pgmproducts;
	}
	
	@XmlElementWrapper(name = "pgmproducts")
	@XmlElement(name = "pgmproduct")
	public List<PgmProductDTO> getPgmproducts() {
		return pgmproducts;
	}
	public void setPgmproducts(List<PgmProductDTO> pgmproducts) {
		this.pgmproducts = pgmproducts;
	}
	
}
