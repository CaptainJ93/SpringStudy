package com.best1.api.webservice.soap.response.result.view;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.view.ReturnOrderViewDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "ReturnOrderViewResult", namespace = WsConstants.NS)
public class ReturnOrderViewResult extends WSResult {
	private List<ReturnOrderViewDTO> returnOrderViewDTOs;

	public ReturnOrderViewResult() {
	}

	public ReturnOrderViewResult(List<ReturnOrderViewDTO> returnOrderViewDTOs) {
		super();
		this.returnOrderViewDTOs = returnOrderViewDTOs;
	}

	@XmlElementWrapper(name = "returnOrderViews")
	@XmlElement(name = "returnOrderView")
	public List<ReturnOrderViewDTO> getReturnOrderViewDTOs() {
		return returnOrderViewDTOs;
	}

	public void setReturnOrderViewDTOs(
			List<ReturnOrderViewDTO> returnOrderViewDTOs) {
		this.returnOrderViewDTOs = returnOrderViewDTOs;
	}

}
