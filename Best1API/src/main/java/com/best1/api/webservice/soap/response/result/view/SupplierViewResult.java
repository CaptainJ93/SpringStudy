package com.best1.api.webservice.soap.response.result.view;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.view.SupplierViewDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "SupplierViewResult", namespace = WsConstants.NS)
public class SupplierViewResult extends WSResult{
	private List<SupplierViewDTO> supplierViews;
	@XmlElementWrapper(name = "supplierViews")
	@XmlElement(name = "supplierView")
	public List<SupplierViewDTO> getSupplierViews() {
		return supplierViews;
	}

	public void setSupplierViews(List<SupplierViewDTO> supplierViews) {
		this.supplierViews = supplierViews;
	}

	
	
}
