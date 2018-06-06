package com.best1.api.webservice.soap.view.impl;

import java.util.List;

import javax.jws.WebService;

import org.apache.commons.lang3.Validate;
import org.apache.cxf.feature.Features;
import org.springframework.beans.factory.annotation.Autowired;

import com.best1.api.entity.view.SupplierShipOrderView;
import com.best1.api.service.view.SupplierShipOrderViewService;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.response.dto.view.SupplierShipOrderViewDTO;
import com.best1.api.webservice.soap.response.result.view.SupplierShipOrderViewResult;
import com.best1.api.webservice.soap.view.SupplierShipOrderViewSoapService;
import com.best1.api.webservice.utils.ApiHandleError;
import com.best1.api.webservice.utils.WsConstants;

@WebService(serviceName = "SupplierShipOrderViewService", endpointInterface = "com.best1.api.webservice.soap.view.SupplierShipOrderViewSoapService", targetNamespace = WsConstants.NS)
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class SupplierShipOrderViewSoapServiceImpl implements
		SupplierShipOrderViewSoapService {
	@Autowired
	private SupplierShipOrderViewService supplierShipOrderViewService;

	@Override
	public SupplierShipOrderViewResult supplierShipOrderViewList(
			Long supplierShipOrderID, String startdate, 
			 String enddate) {
		SupplierShipOrderViewResult result = new SupplierShipOrderViewResult();
		try {
			Validate.notNull(startdate, "startdate参数不为空");
			Validate.notNull(enddate, "enddate参数不为空");

			SupplierShipOrderView supplierShipOrder = new SupplierShipOrderView();
			supplierShipOrder.setDeliveryDateFrom(startdate);
			supplierShipOrder.setDeliveryDateTo(enddate);
			if(supplierShipOrderID!=null&&supplierShipOrderID>0)
			supplierShipOrder.setSupplierShipOrderID(supplierShipOrderID);
			List<SupplierShipOrderView> supplierShipOrderViews = supplierShipOrderViewService
					.fetchSupplierShipOrders(supplierShipOrder);
			List<SupplierShipOrderViewDTO> supplierShipOrderViewDTOs = BeanMapper
					.mapList(supplierShipOrderViews,
							SupplierShipOrderViewDTO.class);
			result.setSupplierShipOrderViews(supplierShipOrderViewDTOs);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

}
