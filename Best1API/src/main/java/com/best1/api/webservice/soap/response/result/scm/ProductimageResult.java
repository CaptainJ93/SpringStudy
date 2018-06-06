package com.best1.api.webservice.soap.response.result.scm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.ProductimageDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "ProductimageResult", namespace = WsConstants.NS)
public class ProductimageResult  extends WSResult{


	private ProductimageDTO productimage;

	public ProductimageResult(){
		
	}
	public ProductimageResult(ProductimageDTO productimage) {
		this.productimage = productimage;
	}
	
	@XmlElement(name = "productimage")
	public ProductimageDTO getProductimage() {
		return productimage;
	}
	public void setProductimage(ProductimageDTO productimage) {
		this.productimage = productimage;
	}
	
}

	