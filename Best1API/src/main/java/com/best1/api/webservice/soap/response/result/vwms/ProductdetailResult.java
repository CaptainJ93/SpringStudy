package com.best1.api.webservice.soap.response.result.vwms;

import java.util.List;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.vwms.ProductdetailDTO;

public class ProductdetailResult  extends WSResult{

	private List<ProductdetailDTO>  productdetails;

	public List<ProductdetailDTO> getProductdetails() {
		return productdetails;
	}

	public void setProductdetails(List<ProductdetailDTO> productdetails) {
		this.productdetails = productdetails;
	}


	
	
	
}
