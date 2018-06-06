package com.best1.api.webservice.soap.response.result.scm;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.ProductcolourstyleDTO;
import com.best1.api.webservice.utils.WsConstants;
@XmlType(name = "productcolourstylesResult", namespace = WsConstants.NS)
public class ProductcolourstylesResult extends WSResult {

	private List<ProductcolourstyleDTO> productcolourstyles;

	public ProductcolourstylesResult(){
		
	}
	public ProductcolourstylesResult(List<ProductcolourstyleDTO> productcolourstyles) {
		this.productcolourstyles = productcolourstyles;
	}
	
	
	@XmlElementWrapper(name = "productcolourstyles")
	@XmlElement(name = "productcolourstyle")
	public List<ProductcolourstyleDTO> getProductcolourstyles() {
		return productcolourstyles;
	}
	public void setProductcolourstyles(
			List<ProductcolourstyleDTO> productcolourstyles) {
		this.productcolourstyles = productcolourstyles;
	}
	
	
	
}
