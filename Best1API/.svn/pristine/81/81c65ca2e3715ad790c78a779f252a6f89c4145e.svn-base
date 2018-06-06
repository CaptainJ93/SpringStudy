package com.best1.api.webservice.soap.view.impl;

import java.util.List;

import javax.jws.WebService;

import org.apache.commons.lang3.Validate;
import org.apache.cxf.feature.Features;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.best1.api.entity.view.ProductView;
import com.best1.api.entity.view.SupplierView;
import com.best1.api.service.view.SupplierViewService;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.response.dto.view.ProductViewDTO;
import com.best1.api.webservice.soap.response.dto.view.SupplierViewDTO;
import com.best1.api.webservice.soap.response.result.view.ProductViewResult;
import com.best1.api.webservice.soap.response.result.view.SupplierViewResult;
import com.best1.api.webservice.soap.view.SupplierViewSoapService;
import com.best1.api.webservice.utils.ApiHandleError;
import com.best1.api.webservice.utils.WsConstants;

@WebService(serviceName = "SupplierViewService", endpointInterface = "com.best1.api.webservice.soap.view.SupplierViewSoapService", targetNamespace = WsConstants.NS)
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class SupplierViewSoapServiceImpl implements SupplierViewSoapService {
	private static Logger logger = LoggerFactory
			.getLogger(SupplierViewSoapServiceImpl.class);

	@Autowired
	private SupplierViewService supplierViewService;

	@Override
	public SupplierViewResult supplierViewList(Long supplierid,
			String startdate, String enddate) {
		SupplierViewResult result = new SupplierViewResult();
		try {
			Validate.notNull(startdate, "startdate参数不为空");
			Validate.notNull(enddate, "enddate参数不为空");
			SupplierView supplier = new SupplierView();
			if(supplierid!=null&&supplierid>0)
			supplier.setSupplierid(supplierid);
			supplier.setStartdate(startdate);
			supplier.setEnddate(enddate);

			List<SupplierView> supplierViews = supplierViewService
					.fetchSuppliers(supplier);

			List<SupplierViewDTO> supplierViewDTOs = BeanMapper.mapList(
					supplierViews, SupplierViewDTO.class);

			result.setSupplierViews(supplierViewDTOs);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}

	@Override
	public ProductViewResult productViewList(Long productid, String startdate,
			String enddate) {
		ProductViewResult result = new ProductViewResult();
		try {
			Validate.notNull(startdate, "startdate参数不为空");
			Validate.notNull(enddate, "enddate参数不为空");
			ProductView record = new ProductView();
			if(productid!=null&&productid>0)
			record.setProductid(productid);
			record.setStartdate(startdate);
			record.setEnddate(enddate);

			List<ProductView> productViews = supplierViewService.fetchProducts(record);
					

			List<ProductViewDTO> productViewDTOs = BeanMapper.mapList(
					productViews, ProductViewDTO.class);

			result.setProductViews(productViewDTOs);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

}
