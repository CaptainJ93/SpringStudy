package com.best1.api.webservice.soap.view.impl;

import java.util.List;


import javax.jws.WebService;

import org.apache.commons.lang3.Validate;
import org.apache.cxf.feature.Features;
import org.springframework.beans.factory.annotation.Autowired;

import com.best1.api.entity.view.ReturnOrderView;
import com.best1.api.service.view.ReturnOrderViewService;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.response.dto.view.ReturnOrderViewDTO;
import com.best1.api.webservice.soap.response.result.view.ReturnOrderViewResult;
import com.best1.api.webservice.soap.view.ReturnOrderViewSoapService;
import com.best1.api.webservice.utils.ApiHandleError;
import com.best1.api.webservice.utils.WsConstants;

@WebService(serviceName = "ReturnOrderViewService", endpointInterface = "com.best1.api.webservice.soap.view.ReturnOrderViewSoapService", targetNamespace = WsConstants.NS)
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class ReturnOrderViewSoapServiceImpl implements
		ReturnOrderViewSoapService {
	@Autowired
	private ReturnOrderViewService returnOrderViewService;

	@Override
	public ReturnOrderViewResult returnOrderViewList(Long returnID,
			 String startdate, 
		 String enddate) {
		ReturnOrderViewResult result = new ReturnOrderViewResult();
		try {
			Validate.notNull(startdate, "startdate参数不为空");
			Validate.notNull(enddate, "enddate参数不为空");
			ReturnOrderView returnOrderView = new ReturnOrderView();
			returnOrderView
					.setReturnIntoWarehouseDateFrom(startdate);
			returnOrderView
					.setReturnIntoWarehouseDateTo(enddate);
			if(returnID!=null&&returnID>0)
			returnOrderView.setReturnID(returnID);
			List<ReturnOrderView> returnOrderViews = returnOrderViewService
					.fetchReturnOrders(returnOrderView);
			List<ReturnOrderViewDTO> returnOrderViewDTOs = BeanMapper.mapList(
					returnOrderViews, ReturnOrderViewDTO.class);
			result.setReturnOrderViewDTOs(returnOrderViewDTOs);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

}
