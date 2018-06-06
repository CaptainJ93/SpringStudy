package com.best1.api.webservice.soap.view;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.best1.api.utils.APIConstant;
import com.best1.api.webservice.soap.response.result.view.ReturnToVenderViewResult;
import com.best1.api.webservice.utils.WsConstants;

@WebService(name = "ReturnToVenderViewService", targetNamespace = WsConstants.NS)
public interface ReturnToVenderViewSoapService {
	ReturnToVenderViewResult returnToVenderViewList(
			@WebParam(name = APIConstant.RTVORDER_ID) Long rtvOrderID,
			@WebParam(name = APIConstant.STARTDATE)  String startdate, 
			@WebParam(name = APIConstant.ENDDATE)  String enddate);
}
