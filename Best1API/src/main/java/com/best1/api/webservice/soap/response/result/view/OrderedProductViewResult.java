package com.best1.api.webservice.soap.response.result.view;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.view.OrderedProductViewDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "OrderedProductViewResult", namespace = WsConstants.NS)
public class OrderedProductViewResult extends WSResult {
	private List<OrderedProductViewDTO> orderedProductViews;

	public OrderedProductViewResult() {
	}

	public OrderedProductViewResult(
			List<OrderedProductViewDTO> orderedProductViews) {
		super();
		this.orderedProductViews = orderedProductViews;
	}

	@XmlElementWrapper(name = "orderedProductViews")
	@XmlElement(name = "orderedProductView")
	public List<OrderedProductViewDTO> getOrderedProductViews() {
		return orderedProductViews;
	}

	public void setOrderedProductViews(
			List<OrderedProductViewDTO> orderedProductViews) {
		this.orderedProductViews = orderedProductViews;
	}

}
