package com.best1.api.webservice.soap.response.result.view;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.view.SupplierShipOrderViewDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "SupplierShipOrderViewResult", namespace = WsConstants.NS)
public class SupplierShipOrderViewResult extends WSResult {
	private List<SupplierShipOrderViewDTO> supplierShipOrderViews;

	public SupplierShipOrderViewResult() {
	}

	public SupplierShipOrderViewResult(
			List<SupplierShipOrderViewDTO> supplierShipOrderViews) {
		super();
		this.supplierShipOrderViews = supplierShipOrderViews;
	}

	@XmlElementWrapper(name = "supplierShipOrderViews")
	@XmlElement(name = "supplierShipOrderView")
	public List<SupplierShipOrderViewDTO> getSupplierShipOrderViews() {
		return supplierShipOrderViews;
	}

	public void setSupplierShipOrderViews(
			List<SupplierShipOrderViewDTO> supplierShipOrderViews) {
		this.supplierShipOrderViews = supplierShipOrderViews;
	}

}
