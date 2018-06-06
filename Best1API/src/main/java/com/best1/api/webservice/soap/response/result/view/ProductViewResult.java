package com.best1.api.webservice.soap.response.result.view;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.view.ProductViewDTO;
import com.best1.api.webservice.utils.WsConstants;
@XmlType(name = "ProductViewResult", namespace = WsConstants.NS)
public class ProductViewResult  extends WSResult{
	private List<ProductViewDTO> productViews;

	
	@XmlElementWrapper(name = "productViews")
	@XmlElement(name = "productView")
	public List<ProductViewDTO> getProductViews() {
		return productViews;
	}

	public void setProductViews(List<ProductViewDTO> productViews) {
		this.productViews = productViews;
	}
	
	
	

}
