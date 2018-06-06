package com.best1.api.webservice.soap.view;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.best1.api.utils.APIConstant;
import com.best1.api.webservice.soap.response.result.view.ProductViewResult;
import com.best1.api.webservice.soap.response.result.view.SupplierViewResult;
import com.best1.api.webservice.utils.WsConstants;

@WebService(name = "SupplierViewService", targetNamespace = WsConstants.NS)
public interface SupplierViewSoapService {
	SupplierViewResult supplierViewList(
			@WebParam(name = APIConstant.SUPPLIERID) Long supplierid,
			@WebParam(name = APIConstant.STARTDATE) String startdate,
			@WebParam(name = APIConstant.ENDDATE) String enddate);
	
	ProductViewResult productViewList(
			@WebParam(name = APIConstant.PRODUCTID) Long productid,
			@WebParam(name = APIConstant.STARTDATE) String startdate,
			@WebParam(name = APIConstant.ENDDATE) String enddate);
}
