package com.best1.api.webservice.soap.view;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.best1.api.utils.APIConstant;
import com.best1.api.webservice.soap.response.result.view.SupplierShipOrderViewResult;
import com.best1.api.webservice.utils.WsConstants;

@WebService(name = "SupplierShipOrderViewService", targetNamespace = WsConstants.NS)
public interface SupplierShipOrderViewSoapService {
	SupplierShipOrderViewResult supplierShipOrderViewList(
			@WebParam(name = APIConstant.SUPPLIER_SHIPORDER_ID) Long supplierShipOrderID,
            @WebParam(name = APIConstant.STARTDATE)  String startdate, 	
			@WebParam(name = APIConstant.ENDDATE)  String enddate);
}
