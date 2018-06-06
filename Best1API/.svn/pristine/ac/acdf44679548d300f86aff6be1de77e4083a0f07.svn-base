package com.best1.api.webservice.soap.view;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.best1.api.utils.APIConstant;
import com.best1.api.webservice.soap.response.result.view.ReturnOrderViewResult;
import com.best1.api.webservice.utils.WsConstants;

@WebService(name = "ReturnOrderViewService", targetNamespace = WsConstants.NS)
public interface ReturnOrderViewSoapService {
	ReturnOrderViewResult returnOrderViewList(
			@WebParam(name = APIConstant.RETURN_ID) Long returnID,
			@WebParam(name = APIConstant.STARTDATE) String startdate, 
			@WebParam(name = APIConstant.ENDDATE) String enddate);
}
