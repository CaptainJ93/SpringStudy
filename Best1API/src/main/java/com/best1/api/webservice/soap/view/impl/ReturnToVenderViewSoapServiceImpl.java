package com.best1.api.webservice.soap.view.impl;

import java.util.List;

import javax.jws.WebService;

import org.apache.commons.lang3.Validate;
import org.apache.cxf.feature.Features;
import org.springframework.beans.factory.annotation.Autowired;

import com.best1.api.entity.view.ReturnToVenderView;
import com.best1.api.service.view.ReturnToVenderViewService;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.response.dto.view.ReturnToVenderViewDTO;
import com.best1.api.webservice.soap.response.result.view.ReturnToVenderViewResult;
import com.best1.api.webservice.soap.view.ReturnToVenderViewSoapService;
import com.best1.api.webservice.utils.ApiHandleError;
import com.best1.api.webservice.utils.WsConstants;

@WebService(serviceName = "ReturnToVenderViewService", endpointInterface = "com.best1.api.webservice.soap.view.ReturnToVenderViewSoapService", targetNamespace = WsConstants.NS)
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class ReturnToVenderViewSoapServiceImpl implements
		ReturnToVenderViewSoapService {
	@Autowired
	private ReturnToVenderViewService returnToVenderViewService;

	@Override
	public ReturnToVenderViewResult returnToVenderViewList(Long rtvOrderID,
			 String startdate, 
			 String enddate) {
		ReturnToVenderViewResult result = new ReturnToVenderViewResult();
		try {
			Validate.notNull(startdate, "startdate参数不为空");
			Validate.notNull(enddate, "enddate参数不为空");
			ReturnToVenderView returnToVenderView = new ReturnToVenderView();
			returnToVenderView
					.setReturnOrderConfirmDateFrom(startdate);
			returnToVenderView
					.setReturnOrderConfirmDateTo(enddate);
			if(rtvOrderID!=null&&rtvOrderID>0)
			returnToVenderView.setRtvOrderID(rtvOrderID);
			List<ReturnToVenderView> returnToVenderViews = returnToVenderViewService
					.fetchReturnToVenders(returnToVenderView);
			List<ReturnToVenderViewDTO> returnToVenderViewDTOs = BeanMapper
					.mapList(returnToVenderViews, ReturnToVenderViewDTO.class);
			result.setReturnToVenderViews(returnToVenderViewDTOs);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}
}
