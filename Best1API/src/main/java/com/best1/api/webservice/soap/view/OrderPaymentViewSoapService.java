package com.best1.api.webservice.soap.view;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.best1.api.utils.APIConstant;
import com.best1.api.webservice.soap.response.result.view.OrderPaymentViewResult;
import com.best1.api.webservice.utils.WsConstants;

@WebService(name = "OrderPaymentViewService", targetNamespace = WsConstants.NS)
public interface OrderPaymentViewSoapService {
	OrderPaymentViewResult orderPaymentViewList(
			@WebParam(name = APIConstant.ORDERID) Long orderID,
			@WebParam(name = APIConstant.ITEMID) Integer itemID);
}
