package com.best1.api.webservice.soap.view.impl;

import java.util.List;

import javax.jws.WebService;

import org.apache.commons.lang3.Validate;
import org.apache.cxf.feature.Features;
import org.springframework.beans.factory.annotation.Autowired;

import com.best1.api.entity.view.OrderPaymentView;
import com.best1.api.service.view.OrderPaymentViewService;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.response.dto.view.OrderPaymentViewDTO;
import com.best1.api.webservice.soap.response.result.view.OrderPaymentViewResult;
import com.best1.api.webservice.soap.view.OrderPaymentViewSoapService;
import com.best1.api.webservice.utils.ApiHandleError;
import com.best1.api.webservice.utils.WsConstants;

@WebService(serviceName = "OrderPaymentViewService", endpointInterface = "com.best1.api.webservice.soap.view.OrderPaymentViewSoapService", targetNamespace = WsConstants.NS)
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class OrderPaymentViewSoapServiceImpl implements
		OrderPaymentViewSoapService {
	@Autowired
	private OrderPaymentViewService orderPaymentViewService;

	@Override
	public OrderPaymentViewResult orderPaymentViewList(Long orderID, Integer itemID) {
		OrderPaymentViewResult result = new OrderPaymentViewResult();
		try {
			Validate.notNull(orderID, "orderID参数不为空");
			Validate.notNull(itemID, "itemID参数不为空");
			OrderPaymentView orderPaymentView = new OrderPaymentView();
			orderPaymentView.setOrderID(orderID);
			orderPaymentView.setItemID(itemID);
			List<OrderPaymentView> orderPaymentViews = orderPaymentViewService
					.fetchOrderPayments(orderPaymentView);
			List<OrderPaymentViewDTO> orderPaymentViewDTOs = BeanMapper
					.mapList(orderPaymentViews, OrderPaymentViewDTO.class);
			result.setOrderPaymentViewDTOs(orderPaymentViewDTOs);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

}
