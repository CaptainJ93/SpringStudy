package com.best1.api.webservice.soap.response.result.scm;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.ProductlogisticDTO;
import com.best1.api.webservice.utils.WsConstants;
@XmlType(name = "productlogisticsResult", namespace = WsConstants.NS)
public class ProductlogisticsResult extends WSResult {

	private List<ProductlogisticDTO> productlogistics;

	public ProductlogisticsResult(){
		
	}
	public ProductlogisticsResult(List<ProductlogisticDTO> productlogistics) {
		this.productlogistics = productlogistics;
	}
	
	@XmlElementWrapper(name = "productlogistics")
	@XmlElement(name = "productlogistic")
	public List<ProductlogisticDTO> getProductlogistics() {
		return productlogistics;
	}
	public void setProductlogistics(List<ProductlogisticDTO> productlogistics) {
		this.productlogistics = productlogistics;
	}
	

	
	
}
