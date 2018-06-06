package com.best1.api.webservice.soap.view.impl;

import java.util.List;

import javax.jws.WebService;

import org.apache.commons.lang3.Validate;
import org.apache.cxf.feature.Features;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.best1.api.entity.view.OrderedProductView;
import com.best1.api.service.view.OrderedProductViewService;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.response.dto.view.OrderedProductViewDTO;
import com.best1.api.webservice.soap.response.result.view.OrderedProductViewResult;
import com.best1.api.webservice.soap.view.OrderedProductViewSoapService;
import com.best1.api.webservice.utils.ApiHandleError;
import com.best1.api.webservice.utils.WsConstants;

@WebService(serviceName = "OrderedProductViewService", endpointInterface = "com.best1.api.webservice.soap.view.OrderedProductViewSoapService", targetNamespace = WsConstants.NS)
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class OrderedProductViewSoapServiceImpl implements
		OrderedProductViewSoapService {
	private static Logger logger = LoggerFactory
			.getLogger(OrderedProductViewSoapServiceImpl.class);
	@Autowired
	private OrderedProductViewService orderedProductViewService;

	@Override
	public OrderedProductViewResult orderedProductViewList(Long orderID,
			Integer itemID, String startdate,
			String enddate) {
		OrderedProductViewResult result = new OrderedProductViewResult();
		try {
			Validate.notNull(startdate, "startdate参数不为空");
			Validate.notNull(enddate, "enddate参数不为空");
			OrderedProductView orderedProduct = new OrderedProductView();
			if(orderID!=null&&orderID>0)
			orderedProduct.setOrderID(orderID);
			if(itemID!=null&&itemID>0)
			orderedProduct.setItemID(itemID);
			orderedProduct.setActualShippedDateFrom(startdate);
			orderedProduct.setActualShippedDateTo(enddate);
			List<OrderedProductView> orderedProductViews = orderedProductViewService
					.fetchOrderedProducts(orderedProduct);
			List<OrderedProductViewDTO> orderedProductViewDTOs = BeanMapper
					.mapList(orderedProductViews, OrderedProductViewDTO.class);
			result.setOrderedProductViews(orderedProductViewDTOs);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

}
