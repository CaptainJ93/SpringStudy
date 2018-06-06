package com.best1.api.webservice.soap.response.result.scm;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.SupplierbusinessDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "supplierbusinesssResult", namespace = WsConstants.NS)
public class SupplierbusinesssResult extends WSResult{
	private List<SupplierbusinessDTO> supplierbusinesss;

	public SupplierbusinesssResult() { }

	public SupplierbusinesssResult(List<SupplierbusinessDTO> supplierbusinesss) {
		this.supplierbusinesss = supplierbusinesss;
	}
	
	@XmlElementWrapper(name = "supplierbusinesss")
	@XmlElement(name = "supplierbusiness")
	public List<SupplierbusinessDTO> getSupplierbusinesss() {
		return supplierbusinesss;
	}

	public void setSupplierbusinesss(List<SupplierbusinessDTO> supplierbusinesss) {
		this.supplierbusinesss = supplierbusinesss;
	}

	
	
}
