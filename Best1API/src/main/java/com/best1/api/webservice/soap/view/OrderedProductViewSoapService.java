package com.best1.api.webservice.soap.view;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.best1.api.utils.APIConstant;
import com.best1.api.webservice.soap.response.result.view.OrderedProductViewResult;
import com.best1.api.webservice.utils.WsConstants;

@WebService(name = "OrderedProductViewService", targetNamespace = WsConstants.NS)
public interface OrderedProductViewSoapService {
	OrderedProductViewResult orderedProductViewList(
			@WebParam(name = APIConstant.ORDERID) Long orderID,
			@WebParam(name = APIConstant.ITEMID) Integer itemID,
			@WebParam(name = APIConstant.STARTDATE) String startdate, 
			@WebParam(name = APIConstant.ENDDATE) String enddate);
}
