package com.best1.api.webapp.mvc.vwms;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.best1.api.entity.oaf.order.ToafOrderinvoiceinfo;
import com.best1.api.entity.vwms.TvwsApiCsowholeConfirm;
import com.best1.api.entity.vwms.TvwsApiProductinventory;
import com.best1.api.entity.vwms.TvwsApiReturnorderconfirm;
import com.best1.api.entity.vwms.TvwsApiRtvconfirm;
import com.best1.api.entity.vwms.TvwsApiSuppliershipconfirm;
import com.best1.api.entity.vwms.TvwsApiWhtransferodconfirm;
import com.best1.api.service.vwms.VwmsInputService;
import com.best1.api.utils.MediaTypes;
import com.best1.api.webservice.soap.response.dto.vwms.CsowholeConfirmDTO;
import com.best1.api.webservice.soap.response.dto.vwms.OrderinvoiceinfoDTO;
import com.best1.api.webservice.soap.response.dto.vwms.ProductinventoryDTO;
import com.best1.api.webservice.soap.response.dto.vwms.ReturnorderconfirmDTO;
import com.best1.api.webservice.soap.response.dto.vwms.RtvconfirmDTO;
import com.best1.api.webservice.soap.response.dto.vwms.SuppliershipconfirmDTO;
import com.best1.api.webservice.soap.response.dto.vwms.WhtransferodconfirmDTO;
import com.best1.api.webservice.soap.response.result.vwms.CsowholeConfirmResult;
import com.best1.api.webservice.soap.response.result.vwms.OrderinvoiceinfoResult;
import com.best1.api.webservice.soap.response.result.vwms.ProductinventoryResult;
import com.best1.api.webservice.soap.response.result.vwms.ReturnorderconfirmResult;
import com.best1.api.webservice.soap.response.result.vwms.RtvconfirmResult;
import com.best1.api.webservice.soap.response.result.vwms.SuppliershipconfirmResult;
import com.best1.api.webservice.soap.response.result.vwms.WhtransferodconfirmResult;
import com.best1.api.webservice.utils.ApiHandleError;
import com.best1.api.utils.DateUtil;

@RestController
public class VwmsIutputEDIController {
	private static Logger logger = LoggerFactory
			.getLogger(VwmsIutputEDIController.class);

	@Autowired
	private VwmsInputService vwmsService;
	
	
	
	@RequestMapping(value = "/vwms/orderInvoiceno/modify", method = { RequestMethod.POST },produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	/***public OrderinvoiceinfoResult modifyOrderInvoiceno(
			@RequestParam(value = "orderid", required = true) Long orderid,
			@RequestParam(value = "itemid", required = true) Integer itemid,
			@RequestParam(value = "invoiceno", required = true) Long invoiceno,
			@RequestParam(value = "invoiceissuedate", required = true) String invoiceissuedate,
			@RequestParam(value = "createdby", required = true) Long createdby) {
			***/
	public OrderinvoiceinfoResult modifyOrderInvoiceno(
			@RequestBody OrderinvoiceinfoDTO orderinvoiceno) {
		logger.info("发票号");
		OrderinvoiceinfoResult result = new OrderinvoiceinfoResult();
		try {
			ToafOrderinvoiceinfo orderinvoiceinfo =new ToafOrderinvoiceinfo();
			orderinvoiceinfo.setOrderid(orderinvoiceno.getOrderid());
			orderinvoiceinfo.setItemid(orderinvoiceno.getItemid());
			orderinvoiceinfo.setLastmodifiedby(orderinvoiceno.getCreatedby());
			orderinvoiceinfo.setInvoiceno(orderinvoiceno.getInvoiceno());//convertStringToDate
			orderinvoiceinfo.setInvoiceissuedate(orderinvoiceno.getInvoiceissuedate());
			//orderinvoiceinfo.setInvoiceissuedate(DateUtil.convertStringToDate(DateUtil.YYYY_MM_DD,invoiceissuedate));
			OrderinvoiceinfoDTO dto = vwmsService.modifyOrderInvoiceno(orderinvoiceinfo);
			result.setOrderinvoiceinfo(dto);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}
	
	
	@RequestMapping(value = "/vwms/customershiporder/confirm", method = { RequestMethod.POST },produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	/***
	 public CsowholeConfirmResult customerShiporderConfirm(
			@RequestParam(value = "warehouseid", required = false) Long warehouseid,
			@RequestParam(value = "shiporderid", required = false) Long shiporderid,
			@RequestParam(value = "shipordersequence", required = false) Integer shipordersequence,
			@RequestParam(value = "productid", required = false) Long productid,
			@RequestParam(value = "productversion", required = false) Integer productversion,
			@RequestParam(value = "colourclass", required = false) Integer colourclass,
			@RequestParam(value = "colourcode", required = false) Integer colourcode,
			@RequestParam(value = "styleclass", required = false) Integer styleclass,
			@RequestParam(value = "stylecode", required = false) Integer stylecode,
			@RequestParam(value = "productquantity", required = false) Long productquantity,
			@RequestParam(value = "intransitquantity", required = false) Long intransitquantity,
			@RequestParam(value = "actualshippeddate", required = false) String actualshippeddate,
			@RequestParam(value = "selectedcarrier", required = false) Long selectedcarrier,
			@RequestParam(value = "deliverynumber", required = false) String deliverynumber,
			@RequestParam(value = "reason", required = false) String reason,
			@RequestParam(value = "csostatus", required = false) Integer csostatus,
			@RequestParam(value = "deliveryarea", required = false) String deliveryarea,
			@RequestParam(value = "createdby", required = false) Long createdby) {
			
			**/
	
	 public CsowholeConfirmResult customerShiporderConfirm(
			 @RequestBody CsowholeConfirmDTO csowholeConfirm) {
			
		logger.info("出货数据");
		CsowholeConfirmResult result = new CsowholeConfirmResult();
		try {
			TvwsApiCsowholeConfirm csoConfirmed =new TvwsApiCsowholeConfirm();
			/**
			  csoConfirmed.setWarehouseid(warehouseid);
			 
			csoConfirmed.setShiporderid(shiporderid);
			csoConfirmed.setShipordersequence(shipordersequence);
			csoConfirmed.setProductid(productid);
			csoConfirmed.setProductversion(productversion);
			csoConfirmed.setColourclass(colourclass);
			csoConfirmed.setColourcode(colourcode);
			csoConfirmed.setStyleclass(styleclass);
			csoConfirmed.setStylecode(stylecode);
			csoConfirmed.setProductquantity(productquantity);
			csoConfirmed.setIntransitquantity(intransitquantity);
			csoConfirmed.setActualshippeddate(DateUtil.convertStringToDate(DateUtil.YYYY_MM_DD_HH_MM_SS,actualshippeddate));
			csoConfirmed.setSelectedcarrier(selectedcarrier);
			csoConfirmed.setDeliverynumber(deliverynumber);
			csoConfirmed.setReason(reason);
			csoConfirmed.setCsostatus(csostatus);
			csoConfirmed.setDeliveryarea(deliveryarea);
			csoConfirmed.setCreatedby(createdby);
			**/
			
			    csoConfirmed.setWarehouseid(csowholeConfirm.getWarehouseid());
				csoConfirmed.setShiporderid(csowholeConfirm.getShiporderid());
				csoConfirmed.setShipordersequence(csowholeConfirm.getShipordersequence());
				csoConfirmed.setProductid(csowholeConfirm.getProductid());
				csoConfirmed.setProductversion(csowholeConfirm.getProductversion());
				csoConfirmed.setColourclass(csowholeConfirm.getColourclass());
				csoConfirmed.setColourcode(csowholeConfirm.getColourcode());
				csoConfirmed.setStyleclass(csowholeConfirm.getStyleclass());
				csoConfirmed.setStylecode(csowholeConfirm.getStylecode());
				csoConfirmed.setProductquantity(csowholeConfirm.getProductquantity());
				csoConfirmed.setIntransitquantity(csowholeConfirm.getIntransitquantity());
				csoConfirmed.setActualshippeddate(csowholeConfirm.getActualshippeddate());
				csoConfirmed.setSelectedcarrier(csowholeConfirm.getSelectedcarrier());
				csoConfirmed.setDeliverynumber(csowholeConfirm.getDeliverynumber());
				csoConfirmed.setReason(csowholeConfirm.getReason());
				csoConfirmed.setCsostatus(csowholeConfirm.getCsostatus());
				csoConfirmed.setDeliveryarea(csowholeConfirm.getDeliveryarea());
				csoConfirmed.setCreatedby(csowholeConfirm.getCreatedby());
			CsowholeConfirmDTO dto = vwmsService.modifyShippingConfirmed(csoConfirmed);
			result.setCsowholeConfirm(dto);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}
	
	

	@RequestMapping(value = "/vwms/productinventory/confirm",method = { RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
/**	public ProductinventoryResult productInventoryConfirm(
			@RequestParam(value = "warehouseid", required = false) Long warehouseid,
			@RequestParam(value = "productid", required = false) Long productid,
			@RequestParam(value = "productversion", required = false) Integer productversion,
			@RequestParam(value = "colourclass", required = false) Integer colourclass,
			@RequestParam(value = "colourcode", required = false) Integer colourcode,
			@RequestParam(value = "styleclass", required = false) Integer styleclass,
			@RequestParam(value = "stylecode", required = false) Integer stylecode,
			@RequestParam(value = "locationid", required = false) Long locationid,
			@RequestParam(value = "locationtype", required = false) String locationtype,
			@RequestParam(value = "totalproductquantity", required = false) Long totalproductquantity,
			@RequestParam(value = "stockupdatedate", required = false) String stockupdatedate,
			@RequestParam(value = "createdby", required = false) Long createdby) {
			**/
	
	public ProductinventoryResult productInventoryConfirm(
			@RequestBody
			ProductinventoryDTO productinventorydto) {
		logger.info("商品库存数据");
		ProductinventoryResult result = new ProductinventoryResult();
		try {
			TvwsApiProductinventory productinventory =new TvwsApiProductinventory();
		/**	productinventory.setWarehouseid(warehouseid);
			productinventory.setProductid(productid);
			productinventory.setProductversion(productversion);
			productinventory.setColourclass(colourclass);
			productinventory.setColourcode(colourcode);
			productinventory.setStyleclass(styleclass);
			productinventory.setStylecode(stylecode);
			productinventory.setLocationid(locationid);
			productinventory.setLocationtype(locationtype);
			productinventory.setTotalproductquantity(totalproductquantity);
			productinventory.setStockupdatedate(DateUtil.convertStringToDate(DateUtil.YYYY_MM_DD_HH_MM_SS,stockupdatedate));
			productinventory.setCreatedby(createdby);
			**/
			productinventory.setWarehouseid(productinventorydto.getWarehouseid());
			productinventory.setProductid(productinventorydto.getProductid());
			productinventory.setProductversion(productinventorydto.getProductversion());
			productinventory.setColourclass(productinventorydto.getColourclass());
			productinventory.setColourcode(productinventorydto.getColourcode());
			productinventory.setStyleclass(productinventorydto.getStyleclass());
			productinventory.setStylecode(productinventorydto.getStylecode());
			productinventory.setLocationid(productinventorydto.getLocationid());
			productinventory.setLocationtype(productinventorydto.getLocationtype());
			productinventory.setTotalproductquantity(productinventorydto.getTotalproductquantity());
			productinventory.setStockupdatedate(productinventorydto.getStockupdatedate());
			productinventory.setCreatedby(productinventorydto.getCreatedby());
			ProductinventoryDTO dto = vwmsService.modifyProductinventory(productinventory);
			result.setProductinventory(dto);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}
	
	
	

	@RequestMapping(value = "/vwms/returnProduct/confirm", method = { RequestMethod.POST },produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	/***public RtvconfirmResult returnProductConfirm(
			@RequestParam(value = "warehouseid", required = false) Long warehouseid,
			@RequestParam(value = "rtvorderid", required = false) Long rtvorderid,
			@RequestParam(value = "rtvordersequence", required = false) Integer rtvordersequence,
			@RequestParam(value = "productid", required = false) Long productid,
			@RequestParam(value = "productversion", required = false) Integer productversion,
			@RequestParam(value = "colourclass", required = false) Integer colourclass,
			@RequestParam(value = "colourcode", required = false) Integer colourcode,
			@RequestParam(value = "styleclass", required = false) Integer styleclass,
			@RequestParam(value = "stylecode", required = false) Integer stylecode,
			@RequestParam(value = "damagedquantity", required = false) Long damagedquantity,
			@RequestParam(value = "returnquantity", required = false) Long returnquantity,
			@RequestParam(value = "returnquantitypicked", required = false) Long returnquantitypicked,
			@RequestParam(value = "damagedquantitypicked", required = false) Long damagedquantitypicked,
			@RequestParam(value = "reason", required = false) String reason,
			@RequestParam(value = "returnorderconfirmdate", required = false) String returnorderconfirmdate,
			@RequestParam(value = "forcecloseflag", required = false) String forcecloseflag,
			@RequestParam(value = "rtvstatus", required = false) Integer rtvstatus,
			@RequestParam(value = "createdby", required = false) Long createdby) {***/
	public RtvconfirmResult returnProductConfirm(
			@RequestBody RtvconfirmDTO rtvconfirm) {
		logger.info("商品退厂");
		RtvconfirmResult result = new RtvconfirmResult();
		try {
			TvwsApiRtvconfirm returnproduct =new TvwsApiRtvconfirm();
			returnproduct.setWarehouseid(rtvconfirm.getWarehouseid());
			returnproduct.setRtvorderid(rtvconfirm.getRtvorderid());
			returnproduct.setRtvordersequence(rtvconfirm.getRtvordersequence());
			returnproduct.setProductid(rtvconfirm.getProductid());
			returnproduct.setProductversion(rtvconfirm.getProductversion());
			returnproduct.setColourclass(rtvconfirm.getColourclass());
			returnproduct.setColourcode(rtvconfirm.getColourcode());
			returnproduct.setStyleclass(rtvconfirm.getStyleclass());
			returnproduct.setStylecode(rtvconfirm.getStylecode());
			returnproduct.setDamagedquantity(rtvconfirm.getDamagedquantity());
			returnproduct.setReturnquantity(rtvconfirm.getReturnquantity());
			returnproduct.setReturnquantitypicked(rtvconfirm.getReturnquantitypicked());
			returnproduct.setDamagedquantitypicked(rtvconfirm.getDamagedquantitypicked());
			returnproduct.setReason(rtvconfirm.getReason());
			returnproduct.setForcecloseflag(rtvconfirm.getForcecloseflag());
			returnproduct.setReturnorderconfirmdate(rtvconfirm.getReturnorderconfirmdate());
			returnproduct.setCreatedby(rtvconfirm.getCreatedby());
			returnproduct.setRtvstatus(rtvconfirm.getRtvstatus());
			RtvconfirmDTO dto = vwmsService.modifyReturnProductconfirm(returnproduct);
			result.setRtvconfirm(dto);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}
	
	
	
	@RequestMapping(value = "/vwms/returnOrder/confirm", method = { RequestMethod.POST },produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	/***public ReturnorderconfirmResult returnOrderConfirm(
			@RequestParam(value = "warehouseid", required = false) Long warehouseid,
			@RequestParam(value = "returnorderid", required = false) Long returnorderid,
			@RequestParam(value = "returnordersequence", required = false) Integer returnordersequence,
			@RequestParam(value = "productid", required = false) Long productid,
			@RequestParam(value = "productversion", required = false) Integer productversion,
			@RequestParam(value = "colourclass", required = false) Integer colourclass,
			@RequestParam(value = "colourcode", required = false) Integer colourcode,
			@RequestParam(value = "styleclass", required = false) Integer styleclass,
			@RequestParam(value = "stylecode", required = false) Integer stylecode,
			@RequestParam(value = "requestquantity", required = false) Long requestquantity,
			@RequestParam(value = "receivedquantity", required = false) Long receivedquantity,
			@RequestParam(value = "returntowarehousedate", required = false) String returntowarehousedate,
			@RequestParam(value = "selectedcarrier", required = false) Long selectedcarrier,
			@RequestParam(value = "missingpartsflag", required = false) String missingpartsflag,
			@RequestParam(value = "missingid", required = false) String missingid,
			@RequestParam(value = "productpartnotes", required = false) String productpartnotes,
			@RequestParam(value = "deliverynumber", required = false) String deliverynumber,
			@RequestParam(value = "notes", required = false) String notes,
			@RequestParam(value = "orderstatus", required = false) Integer orderstatus,
			@RequestParam(value = "createdby", required = false) Long createdby) {**/
	
	public ReturnorderconfirmResult returnOrderConfirm(	@RequestBody
			ReturnorderconfirmDTO  returnorderconfirm) {
		logger.info("客户销退");
		ReturnorderconfirmResult result = new ReturnorderconfirmResult();
		try {
			TvwsApiReturnorderconfirm returnorder =new TvwsApiReturnorderconfirm();
			/***returnorder.setWarehouseid(warehouseid);
			returnorder.setReturnorderid(returnorderid);
			returnorder.setReturnordersequence(returnordersequence);
			returnorder.setProductid(productid);
			returnorder.setProductversion(productversion);
			returnorder.setColourclass(colourclass);
			returnorder.setColourcode(colourcode);
			returnorder.setStyleclass(styleclass);
			returnorder.setStylecode(stylecode);
			returnorder.setRequestquantity(requestquantity);
			returnorder.setReceivedquantity(receivedquantity);		
			returnorder.setReturntowarehousedate(DateUtil.convertStringToDate(DateUtil.YYYY_MM_DD_HH_MM_SS,returntowarehousedate));
			returnorder.setSelectedcarrier(selectedcarrier);
			returnorder.setMissingpartsflag(missingpartsflag);
			returnorder.setMissingid(missingid);
			returnorder.setProductpartnotes(productpartnotes);
			returnorder.setDeliverynumber(deliverynumber);
			returnorder.setNotes(notes);
			returnorder.setOrderstatus(orderstatus);
			returnorder.setCreatedby(createdby);
		**/
			
			returnorder.setWarehouseid(returnorderconfirm.getWarehouseid());
			returnorder.setReturnorderid(returnorderconfirm.getReturnorderid());
			returnorder.setReturnordersequence(returnorderconfirm.getReturnordersequence());
			returnorder.setProductid(returnorderconfirm.getProductid());
			returnorder.setProductversion(returnorderconfirm.getProductversion());
			returnorder.setColourclass(returnorderconfirm.getColourclass());
			returnorder.setColourcode(returnorderconfirm.getColourcode());
			returnorder.setStyleclass(returnorderconfirm.getStyleclass());
			returnorder.setStylecode(returnorderconfirm.getStylecode());
			returnorder.setRequestquantity(returnorderconfirm.getRequestquantity());
			returnorder.setReceivedquantity(returnorderconfirm.getReceivedquantity());		
			returnorder.setReturntowarehousedate(returnorderconfirm.getReturntowarehousedate());
			returnorder.setSelectedcarrier(returnorderconfirm.getSelectedcarrier());
			returnorder.setMissingpartsflag(returnorderconfirm.getMissingpartsflag());
			returnorder.setMissingid(returnorderconfirm.getMissingid());
			returnorder.setProductpartnotes(returnorderconfirm.getProductpartnotes());
			returnorder.setDeliverynumber(returnorderconfirm.getDeliverynumber());
			returnorder.setNotes(returnorderconfirm.getNotes());
			returnorder.setOrderstatus(returnorderconfirm.getOrderstatus());
			returnorder.setCreatedby(returnorderconfirm.getCreatedby());
			ReturnorderconfirmDTO dto = vwmsService.modifyReturnOrderconfirm(returnorder);
			result.setReturnorderconfirm(dto);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}
	
	
	
	@RequestMapping(value = "/vwms/suppliershiporder/confirm", method = { RequestMethod.POST },produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
/**	public SuppliershipconfirmResult supplierShiporderConfirm(
			@RequestParam(value = "warehouseid", required = false) Long warehouseid,
			@RequestParam(value = "suppliershiporderid", required = false) Long suppliershiporderid,
			@RequestParam(value = "productid", required = false) Long productid,
			@RequestParam(value = "productversion", required = false) Integer productversion,
			@RequestParam(value = "colourclass", required = false) Integer colourclass,
			@RequestParam(value = "colourcode", required = false) Integer colourcode,
			@RequestParam(value = "styleclass", required = false) Integer styleclass,
			@RequestParam(value = "stylecode", required = false) Integer stylecode,
			@RequestParam(value = "recievedquantity", required = false) Long recievedquantity,
			@RequestParam(value = "arrivaldate", required = false) String arrivaldate,
			@RequestParam(value = "receivedtime", required = false) String receivedtime,
			@RequestParam(value = "ssostatus", required = false) Integer ssostatus,
			@RequestParam(value = "createdby", required = false) Long createdby) {
			***/
	
	public SuppliershipconfirmResult supplierShiporderConfirm(
			@RequestBody  SuppliershipconfirmDTO suppliershipconfirm) {
		logger.info("供应商进货");
		SuppliershipconfirmResult result = new SuppliershipconfirmResult();
		try {
			TvwsApiSuppliershipconfirm suppliershiporder =new TvwsApiSuppliershipconfirm();
			/**suppliershiporder.setWarehouseid(warehouseid);
			suppliershiporder.setSuppliershiporderid(suppliershiporderid);
			suppliershiporder.setProductid(productid);
			suppliershiporder.setProductversion(productversion);
			suppliershiporder.setColourclass(colourclass);
			suppliershiporder.setColourcode(colourcode);
			suppliershiporder.setStyleclass(styleclass);
			suppliershiporder.setStylecode(stylecode);
			suppliershiporder.setRecievedquantity(recievedquantity);
			Date arrivalDateTime=DateUtil.convertStringToDate(DateUtil.YYYY_MM_DD_HH_MM_SS,arrivaldate+" "+receivedtime);
			suppliershiporder.setArrivaldate(arrivalDateTime);
			suppliershiporder.setReceivedtime(arrivalDateTime);
			suppliershiporder.setSsostatus(ssostatus);
			suppliershiporder.setCreatedby(createdby);
		**/
			suppliershiporder.setWarehouseid(suppliershipconfirm.getWarehouseid());
			suppliershiporder.setSuppliershiporderid(suppliershipconfirm.getSuppliershiporderid());
			suppliershiporder.setProductid(suppliershipconfirm.getProductid());
			suppliershiporder.setProductversion(suppliershipconfirm.getProductversion());
			suppliershiporder.setColourclass(suppliershipconfirm.getColourclass());
			suppliershiporder.setColourcode(suppliershipconfirm.getColourcode());
			suppliershiporder.setStyleclass(suppliershipconfirm.getStyleclass());
			suppliershiporder.setStylecode(suppliershipconfirm.getStylecode());
			suppliershiporder.setRecievedquantity(suppliershipconfirm.getRecievedquantity());
			
			suppliershiporder.setArrivaldate(suppliershipconfirm.getArrivaldate());
			suppliershiporder.setReceivedtime(suppliershipconfirm.getReceivedtime());
			suppliershiporder.setSsostatus(suppliershipconfirm.getSsostatus());
			suppliershiporder.setCreatedby(suppliershipconfirm.getCreatedby());
			SuppliershipconfirmDTO dto = vwmsService.modifySupplierShipconfirm(suppliershiporder);
			result.setSuppliershipconfirm(dto);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}
	
	
	
	@RequestMapping(value = "/vwms/whtransferod/confirm", method = { RequestMethod.POST },produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	/**public WhtransferodconfirmResult whtransferodConfirm(
			@RequestParam(value = "interwhorderid", required = false) Long interwhorderid,
			@RequestParam(value = "fromwarehouseid", required = false) Long fromwarehouseid,
			@RequestParam(value = "towarehouseid", required = false) Long towarehouseid,
			@RequestParam(value = "productid", required = false) Long productid,
			@RequestParam(value = "productversion", required = false) Integer productversion,
			@RequestParam(value = "colourclass", required = false) Integer colourclass,
			@RequestParam(value = "colourcode", required = false) Integer colourcode,
			@RequestParam(value = "styleclass", required = false) Integer styleclass,
			@RequestParam(value = "stylecode", required = false) Integer stylecode,
			@RequestParam(value = "transferorderqty", required = false) Long transferorderqty,
			@RequestParam(value = "receivedquantity", required = false) Long receivedquantity,
			@RequestParam(value = "receiveddate", required = false) String receiveddate,
			@RequestParam(value = "messagetype", required = false) String messagetype,
			@RequestParam(value = "reason", required = false) String reason,
			@RequestParam(value = "shippedproducttype", required = false) String shippedproducttype,
			@RequestParam(value = "transferstatus", required = false) Integer transferstatus,
			@RequestParam(value = "createdby", required = false) Long createdby) {**/
	public WhtransferodconfirmResult whtransferodConfirm(@RequestBody WhtransferodconfirmDTO whtransferodconfirmdto) {
		logger.info("跨订单");
		WhtransferodconfirmResult result = new WhtransferodconfirmResult();
		try {
			TvwsApiWhtransferodconfirm whtransferodconfirm=new TvwsApiWhtransferodconfirm();
			/***whtransferodconfirm.setInterwhorderid(interwhorderid);
			whtransferodconfirm.setFromwarehouseid(fromwarehouseid);
			whtransferodconfirm.setTowarehouseid(towarehouseid);
			whtransferodconfirm.setProductid(productid);
			whtransferodconfirm.setProductversion(productversion);
			whtransferodconfirm.setColourclass(colourclass);
			whtransferodconfirm.setColourcode(colourcode);
			whtransferodconfirm.setStyleclass(styleclass);
			whtransferodconfirm.setStylecode(stylecode);
			whtransferodconfirm.setTransferorderqty(transferorderqty);
			whtransferodconfirm.setReceivedquantity(receivedquantity);
			whtransferodconfirm.setReceiveddate(DateUtil.convertStringToDate(DateUtil.YYYY_MM_DD_HH_MM_SS,receiveddate));
			whtransferodconfirm.setMessagetype(messagetype);
			whtransferodconfirm.setReason(reason);
			whtransferodconfirm.setShippedproducttype(shippedproducttype);
			whtransferodconfirm.setTransferstatus(transferstatus);
			whtransferodconfirm.setCreatedby(createdby);
		**/
			
			whtransferodconfirm.setInterwhorderid(whtransferodconfirmdto.getInterwhorderid());
			whtransferodconfirm.setFromwarehouseid(whtransferodconfirmdto.getFromwarehouseid());
			whtransferodconfirm.setTowarehouseid(whtransferodconfirmdto.getTowarehouseid());
			whtransferodconfirm.setProductid(whtransferodconfirmdto.getProductid());
			whtransferodconfirm.setProductversion(whtransferodconfirmdto.getProductversion());
			whtransferodconfirm.setColourclass(whtransferodconfirmdto.getColourclass());
			whtransferodconfirm.setColourcode(whtransferodconfirmdto.getColourcode());
			whtransferodconfirm.setStyleclass(whtransferodconfirmdto.getStyleclass());
			whtransferodconfirm.setStylecode(whtransferodconfirmdto.getStylecode());
			whtransferodconfirm.setTransferorderqty(whtransferodconfirmdto.getTransferorderqty());
			whtransferodconfirm.setReceivedquantity(whtransferodconfirmdto.getReceivedquantity());
			whtransferodconfirm.setReceiveddate(whtransferodconfirmdto.getReceiveddate());
			whtransferodconfirm.setMessagetype(whtransferodconfirmdto.getMessagetype());
			whtransferodconfirm.setReason(whtransferodconfirmdto.getReason());
			whtransferodconfirm.setShippedproducttype(whtransferodconfirmdto.getShippedproducttype());
			whtransferodconfirm.setTransferstatus(whtransferodconfirmdto.getTransferstatus());
			whtransferodconfirm.setCreatedby(whtransferodconfirmdto.getCreatedby());
			WhtransferodconfirmDTO dto = vwmsService.modifyWhtransferodconfirm(whtransferodconfirm);
			result.setWhtransferodconfirm(dto);
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
