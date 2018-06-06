package com.best1.api.webservice.soap.response.result.vwms;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.vwms.ProductinventoryDTO;

public class ProductinventoryResult extends WSResult{
private ProductinventoryDTO   productinventory;

public ProductinventoryDTO getProductinventory() {
	return productinventory;
}

public void setProductinventory(ProductinventoryDTO productinventory) {
	this.productinventory = productinventory;
}


}
