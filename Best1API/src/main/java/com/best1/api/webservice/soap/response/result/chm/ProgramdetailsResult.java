package com.best1.api.webservice.soap.response.result.chm;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.chm.ProgramdetailDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "programdetailsResult", namespace = WsConstants.NS)
public class ProgramdetailsResult extends WSResult {
	private List<ProgramdetailDTO> programdetails;

	public ProgramdetailsResult() {

	}

	public ProgramdetailsResult(List<ProgramdetailDTO> programdetails) {
		this.programdetails = programdetails;
	}

	@XmlElementWrapper(name = "programdetails")
	@XmlElement(name = "programdetail")
	public List<ProgramdetailDTO> getProgramdetails() {
		return programdetails;
	}

	public void setProgramdetails(List<ProgramdetailDTO> programdetails) {
		this.programdetails = programdetails;
	}

}
