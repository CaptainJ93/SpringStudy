package com.best1.api.webservice.soap.response.result.vwms;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.vwms.SuppliershipconfirmDTO;

public class SuppliershipconfirmResult extends WSResult{
private SuppliershipconfirmDTO suppliershipconfirm;

public SuppliershipconfirmDTO getSuppliershipconfirm() {
	return suppliershipconfirm;
}

public void setSuppliershipconfirm(SuppliershipconfirmDTO suppliershipconfirm) {
	this.suppliershipconfirm = suppliershipconfirm;
}



}
