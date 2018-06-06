package com.best1.api.webservice.soap.response.result.view;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.view.ReturnToVenderViewDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "ReturnToVenderViewResult", namespace = WsConstants.NS)
public class ReturnToVenderViewResult extends WSResult {
	private List<ReturnToVenderViewDTO> returnToVenderViews;

	public ReturnToVenderViewResult() {
	}

	public ReturnToVenderViewResult(
			List<ReturnToVenderViewDTO> returnToVenderViews) {
		super();
		this.returnToVenderViews = returnToVenderViews;
	}

	@XmlElementWrapper(name = "returnToVenderViews")
	@XmlElement(name = "returnToVenderView")
	public List<ReturnToVenderViewDTO> getReturnToVenderViews() {
		return returnToVenderViews;
	}

	public void setReturnToVenderViews(
			List<ReturnToVenderViewDTO> returnToVenderViews) {
		this.returnToVenderViews = returnToVenderViews;
	}

}
