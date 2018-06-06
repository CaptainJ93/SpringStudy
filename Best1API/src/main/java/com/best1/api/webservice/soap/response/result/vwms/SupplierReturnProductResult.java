package com.best1.api.webservice.soap.response.result.vwms;

import java.util.List;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.vwms.SupplierReturnProductDTO;

public class SupplierReturnProductResult extends WSResult{
private List<SupplierReturnProductDTO> supplierReturnProducts;

public List<SupplierReturnProductDTO> getSupplierReturnProducts() {
	return supplierReturnProducts;
}

public void setSupplierReturnProducts(
		List<SupplierReturnProductDTO> supplierReturnProducts) {
	this.supplierReturnProducts = supplierReturnProducts;
}





}
