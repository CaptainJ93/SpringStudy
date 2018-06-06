package com.best1.api.webservice.soap.response.result.scm;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.scm.ProductgeneralDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "ProductgeneralsResult", namespace = WsConstants.NS)
public class ProductgeneralsResult extends WSResult {

		private List<ProductgeneralDTO> productgenerales;

		public ProductgeneralsResult(){
			
		}
		public ProductgeneralsResult(List<ProductgeneralDTO> productgenerales) {
			this.productgenerales = productgenerales;
		}
		
		
		@XmlElementWrapper(name = "productgenerals")
		@XmlElement(name = "productgeneral")
		public List<ProductgeneralDTO> getProductgenerales() {
			return productgenerales;
		}
		public void setProductgenerales(List<ProductgeneralDTO> productgenerales) {
			this.productgenerales = productgenerales;
		}
		

		
		
		
	}
