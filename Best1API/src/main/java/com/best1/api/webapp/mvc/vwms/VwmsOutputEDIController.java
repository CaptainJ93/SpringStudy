package com.best1.api.webapp.mvc.vwms;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.best1.api.entity.cmn.TcmnApiBatchinfo;
import com.best1.api.entity.vwms.TvwsApiCsowhole;
import com.best1.api.entity.vwms.TvwsApiProductdetail;
import com.best1.api.entity.vwms.TvwsApiProductmaster;
import com.best1.api.entity.vwms.TvwsApiRtv;
import com.best1.api.entity.vwms.TvwsApiSrowhole;
import com.best1.api.entity.vwms.TvwsApiSuppliershiporder;
import com.best1.api.entity.vwms.TvwsApiSuppliermaster;
import com.best1.api.entity.vwms.TvwsApiWhtransferorder;
import com.best1.api.service.vwms.VwmsOutputService;
import com.best1.api.utils.MediaTypes;
import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.cmn.ApiBatchinfoDTO;
import com.best1.api.webservice.soap.response.dto.vwms.CustomerShiporderDTO;
import com.best1.api.webservice.soap.response.dto.vwms.ProductdetailDTO;
import com.best1.api.webservice.soap.response.dto.vwms.ProductmasterDTO;
import com.best1.api.webservice.soap.response.dto.vwms.ReturnProductsDTO;
import com.best1.api.webservice.soap.response.dto.vwms.SupplierReturnProductDTO;
import com.best1.api.webservice.soap.response.dto.vwms.SupplierShiporderDTO;
import com.best1.api.webservice.soap.response.dto.vwms.SuppliermasterDTO;
import com.best1.api.webservice.soap.response.dto.vwms.WhtransferorderDTO;
import com.best1.api.webservice.soap.response.result.cmn.ApiBatchinfoResult;
import com.best1.api.webservice.soap.response.result.vwms.CustomerShiporderResult;
import com.best1.api.webservice.soap.response.result.vwms.ProductdetailResult;
import com.best1.api.webservice.soap.response.result.vwms.ProductmasterResult;
import com.best1.api.webservice.soap.response.result.vwms.ReturnProductsResult;
import com.best1.api.webservice.soap.response.result.vwms.SupplierReturnProductResult;
import com.best1.api.webservice.soap.response.result.vwms.SupplierShiporderResult;
import com.best1.api.webservice.soap.response.result.vwms.SuppliermasterResult;
import com.best1.api.webservice.soap.response.result.vwms.WhtransferorderResult;
import com.best1.api.webservice.utils.ApiHandleError;

@RestController
public class VwmsOutputEDIController {

	private static Logger logger = LoggerFactory
			.getLogger(VwmsOutputEDIController.class);

	@Autowired
	private VwmsOutputService vwmsService;

	@RequestMapping(value = "/vwms/customershiporder/list", method = { RequestMethod.POST },produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public CustomerShiporderResult listAllCsoWhole(@RequestBody
			@RequestParam(value = "warehouseid", required = true) Long warehouseid,
			@RequestParam(value = "orderid", required = false) Long orderid,
			@RequestParam(value = "startdate", required = false) String startdate,
			@RequestParam(value = "enddate", required = false) String enddate,
			@RequestParam(value = "batchid", required = true) String batchid) {
		CustomerShiporderResult result = new CustomerShiporderResult();
		try {
			logger.info(startdate);
			logger.info(enddate);
			TvwsApiCsowhole csowhole = new TvwsApiCsowhole();
			csowhole.setWarehouseid(warehouseid);
			csowhole.setOrderid(orderid);
			csowhole.setStartdate(startdate);
			csowhole.setEnddate(enddate);
			csowhole.setBatchid(batchid);
			List<CustomerShiporderDTO> customershiporder = vwmsService
					.orderProductDetail(csowhole);
			result.setCustomerShiporders(customershiporder);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}

	@RequestMapping(value = "/vwms/returnorder/list",method = { RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public ReturnProductsResult listAllRsoWhole(@RequestBody
			@RequestParam(value = "warehouseid", required = true) Long warehouseid,
			@RequestParam(value = "returnid", required = false) Long returnid,
			@RequestParam(value = "startdate", required = false) String startdate,
			@RequestParam(value = "enddate", required = false) String enddate,
			@RequestParam(value = "batchid", required = true) String batchid) {
		ReturnProductsResult result = new ReturnProductsResult();
		try {
			logger.info(startdate);
			logger.info(enddate);
			TvwsApiSrowhole srowhole = new TvwsApiSrowhole();
			srowhole.setWarehouseid(warehouseid);
			srowhole.setReturnid(returnid);
			srowhole.setStartdate(startdate);
			srowhole.setEnddate(enddate);
			srowhole.setBatchid(batchid);
			List<ReturnProductsDTO> returnorders = vwmsService
					.SroWholeDetaile(srowhole);
			result.setReturnorders(returnorders);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}


	@RequestMapping(value = "/vwms/productmaster/list", method = { RequestMethod.POST },produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public ProductmasterResult productmasterlist(@RequestBody
			@RequestParam(value = "batchid", required = false) String batchid) {
		ProductmasterResult result = new ProductmasterResult();
		try {

			TvwsApiProductmaster productmaster = new TvwsApiProductmaster();

			productmaster.setBatchid(batchid);
			List<ProductmasterDTO> productmasters = vwmsService
					.Productmaster(productmaster);
			result.setProductmasters(productmasters);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}

	@RequestMapping(value = "/vwms/productdetail/list", method = { RequestMethod.POST },produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public ProductdetailResult productdetaillist(@RequestBody
			@RequestParam(value = "batchid", required = false) String batchid) {
		ProductdetailResult result = new ProductdetailResult();
		try {

			TvwsApiProductdetail productdetail = new TvwsApiProductdetail();

			productdetail.setBatchid(batchid);
			List<ProductdetailDTO> productdetails = vwmsService
					.ProductdetailDTO(productdetail);
			result.setProductdetails(productdetails);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}

	@RequestMapping(value = "/vwms/suppliermaster/list",method = { RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public SuppliermasterResult suppliermasterlist(@RequestBody
			@RequestParam(value = "batchid", required = false) String batchid) {
		SuppliermasterResult result = new SuppliermasterResult();
		try {

			TvwsApiSuppliermaster suppliermaster = new TvwsApiSuppliermaster();
			suppliermaster.setBatchid(batchid);
			List<SuppliermasterDTO> suppliermasters = vwmsService
					.Suppliermaster(suppliermaster);
			result.setSuppliermasters(suppliermasters);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}

	

	@RequestMapping(value = "/vwms/suppliershiporder/list",method = { RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public SupplierShiporderResult suppliershiporderlist(@RequestBody
			@RequestParam(value = "batchid", required = false) String batchid) {
		SupplierShiporderResult result = new SupplierShiporderResult();
		try {
            TvwsApiSuppliershiporder suppliersso  = new TvwsApiSuppliershiporder();
			suppliersso.setBatchid(batchid);
			List<SupplierShiporderDTO> supplierssoes = vwmsService.SupplierShiporder(suppliersso);
			result.setSupplierShiporders(supplierssoes);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}
	
	

	@RequestMapping(value = "/vwms/supplierreturnproduct/list", method = { RequestMethod.POST },produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public SupplierReturnProductResult supplierreturnproductlist(@RequestBody
			@RequestParam(value = "batchid", required = false) String batchid) {
		SupplierReturnProductResult result = new SupplierReturnProductResult();
		try {
			TvwsApiRtv supplierrtv = new TvwsApiRtv();
			supplierrtv.setBatchid(batchid);
			List<SupplierReturnProductDTO> supplierrtvs = vwmsService.SupplierReturnProduct(supplierrtv);
			//去除良品不良品均为0的数据
			List<SupplierReturnProductDTO> supplierrtvsNew = new ArrayList<SupplierReturnProductDTO>();
			for(SupplierReturnProductDTO supplierReturnProductDTO : supplierrtvs){
				if((supplierReturnProductDTO.getNormalquantity()==0)&&(supplierReturnProductDTO.getDamagedquantity()==0)){
					
				}else{
					supplierrtvsNew.add(supplierReturnProductDTO);
				}
			}
			result.setSupplierReturnProducts(supplierrtvsNew);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}
	
	
	@RequestMapping(value = "/vwms/whtransferorder/list", method = { RequestMethod.POST },produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public WhtransferorderResult whtransferorderlist(@RequestBody
			@RequestParam(value = "batchid", required = false) String batchid) {
		WhtransferorderResult result = new WhtransferorderResult();
		try {
			TvwsApiWhtransferorder whtransferorder= new TvwsApiWhtransferorder();
			whtransferorder.setBatchid(batchid);
			 List<WhtransferorderDTO> whtransferorders = vwmsService.Whtransferorder(whtransferorder);
			result.setWhtransferorders(whtransferorders);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}
}
