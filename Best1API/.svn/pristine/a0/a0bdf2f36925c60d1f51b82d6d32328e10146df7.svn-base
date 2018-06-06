package com.best1.api.webservice.soap.oaf.impl;

import java.text.ParseException;
import java.util.List;







import javax.jws.WebService;

import org.apache.commons.lang3.Validate;
import org.apache.cxf.feature.Features;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.best1.api.entity.oaf.order.CustomerOrderInfo;
import com.best1.api.entity.oaf.order.CustomerOrderPayment;
import com.best1.api.entity.oaf.order.CustomerOrderinvoiceinfo;
import com.best1.api.entity.oaf.order.ToafApiFedirefundrequest;
import com.best1.api.entity.oaf.order.ToafApiFedirefundresponse;
import com.best1.api.entity.oaf.order.ToafOrder;
import com.best1.api.entity.oaf.order.ToafOrderedproduct;
import com.best1.api.entity.oaf.order.ToafOrderinvoiceinfo;
import com.best1.api.entity.oaf.order.ToafPostacknowledgement;
import com.best1.api.entity.oaf.order.TscmOrderreasoninfo;
import com.best1.api.service.oaf.CustomerOrderManageSerevice;
import com.best1.api.service.oaf.CustomerRefundManageSerevice;
import com.best1.api.service.oaf.InvoiceManageSerevice;
import com.best1.api.utils.APIConstant;
import com.best1.api.utils.DateUtil;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.oaf.CustomerOrderSoapService;
import com.best1.api.webservice.soap.response.dto.oaf.CustomerOrderInfoDTO;
import com.best1.api.webservice.soap.response.dto.oaf.CustomerOrderPaymentDTO;
import com.best1.api.webservice.soap.response.dto.oaf.FedirefundrequestDTO;
import com.best1.api.webservice.soap.response.dto.oaf.FedirefundresponseDTO;
import com.best1.api.webservice.soap.response.dto.oaf.OrderDTO;
import com.best1.api.webservice.soap.response.dto.oaf.OrderInvoiceInfoDTO;
import com.best1.api.webservice.soap.response.dto.oaf.OrderReasonInfoDTO;
import com.best1.api.webservice.soap.response.result.oaf.CustomerOrderInfoResult;
import com.best1.api.webservice.soap.response.result.oaf.CustomerOrderPaymentResult;
import com.best1.api.webservice.soap.response.result.oaf.CustomerOrderPaymentsResult;
import com.best1.api.webservice.soap.response.result.oaf.CustomerOrdersInfoResult;
import com.best1.api.webservice.soap.response.result.oaf.FedirefundrequestResult;
import com.best1.api.webservice.soap.response.result.oaf.FedirefundresponseResult;
import com.best1.api.webservice.soap.response.result.oaf.OrderInvoiceInfoResult;
import com.best1.api.webservice.soap.response.result.oaf.OrderReasonInfoesResult;
import com.best1.api.webservice.soap.response.result.oaf.OrderResult;
import com.best1.api.webservice.utils.ApiHandleError;
import com.best1.api.webservice.utils.WsConstants;

//serviceName指明WSDL中<wsdl:service>与<wsdl:binding>元素的名称,
//endpointInterface属性指向Interface类全称.
@WebService(serviceName = "CustomerOrderService", endpointInterface = "com.best1.api.webservice.soap.oaf.CustomerOrderSoapService", targetNamespace = WsConstants.NS)
// 增加inbound/outbound SOAP内容的日志
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class CustomerOrderSoapServiceImpl implements CustomerOrderSoapService {
	private static Logger logger = LoggerFactory
			.getLogger(CustomerOrderSoapServiceImpl.class);
	@Autowired
	private CustomerOrderManageSerevice customerorderManageService;
	@Autowired
	private InvoiceManageSerevice invoiceManageSerevice;
	@Autowired
	private CustomerRefundManageSerevice  customerRefundService;
	
	
	@Override
	public OrderResult buildTempOrder(Long orderid, Integer ordertype,
			Integer itemid, Long customerid, String customername,
			Long callattendedby, Long multicodeid, Long productid,
			Integer productversion, String isoffshoredelivery,
			Integer colourcode, Integer colourclass, Integer stylecode,
			Integer styleclass, Double servicefee, Double bonuspointsgained,
			Double offshoredeliverycharges, Double discount,
			String productname, String receivername, Long addressid,
			Double sellingprice, Integer invoicetype, String isreprinted, String iseinvoice,
			Integer taxtype, Integer paymentmodeid, String invoicetitle,
			String companyno, String invoicereceivername,
			String instructiontoscm, String order_desc,
			String ispromotionalproduct, Long storechainid, Long storeid,
			Integer subdeliverytype) {
		OrderResult result = new OrderResult();
		try {
			ToafOrder order = new ToafOrder();
			ToafOrderedproduct orderproduct = new ToafOrderedproduct();
			Validate.notNull(orderid, "orderid获取错误(orderid:" + orderid + ")");
			Validate.notNull(ordertype, "ordertype获取错误(ordertype:" + ordertype
					+ ")");
			Validate.notNull(customerid, "customerid获取错误(customerid:"
					+ customerid + ")");
			Validate.notNull(customername, "customername获取错误(customername:"
					+ customername + ")");
			Validate.notNull(isreprinted, "isreprinted获取错误(isreprinted:"
					+ isreprinted + ")");
			Validate.notNull(invoicetype, "invoicetype获取错误(invoicetype:"
					+ invoicetype + ")");
			Validate.notNull(callattendedby,
					"callattendedby获取错误(callattendedby:" + callattendedby + ")");
			Validate.notNull(multicodeid, "multicodeid获取错误(multicodeid:"
					+ multicodeid + ")");
			Validate.notNull(productid, "productid获取错误(productid:" + productid
					+ ")");
			Validate.notNull(productversion,
					"productversion获取错误(productversion:" + productversion + ")");
			Validate.notNull(colourcode, "colourcode获取错误(colourcode:"
					+ colourcode + ")");
			Validate.notNull(colourclass, "colourclass获取错误(colourclass:"
					+ colourclass + ")");
			Validate.notNull(stylecode, "stylecode获取错误(stylecode:" + stylecode
					+ ")");
			Validate.notNull(styleclass, "styleclass获取错误(multicodeid:"
					+ styleclass + ")");
			Validate.notNull(productname, "productname获取错误(productname:"
					+ productname + ")");
			Validate.notNull(addressid, "addressid获取错误(addressid:" + addressid
					+ ")");
			Validate.notNull(sellingprice, "sellingprice获取错误(sellingprice:"
					+ sellingprice + ")");
			Validate.notNull(paymentmodeid, "paymentmodeid获取错误(paymentmodeid:"
					+ paymentmodeid + ")");
			Validate.notNull(iseinvoice, "iseinvoice获取错误(iseinvoice:"+ iseinvoice + ")");
			order.setOrderid(orderid);
			order.setOrdertype(ordertype);
			orderproduct.setItemid(itemid);
			orderproduct.setCustomerid(customerid);
			orderproduct.setCustomername(customername);
			orderproduct.setCreatedby(callattendedby);
			orderproduct.setMulticodeid(multicodeid);
			orderproduct.setProductid(productid);
			orderproduct.setProductversion(productversion);
			orderproduct.setIsoffshoredelivery(isoffshoredelivery);
			orderproduct.setColourcode(colourcode);
			orderproduct.setColourclass(colourclass);
			orderproduct.setStylecode(stylecode);
			orderproduct.setStyleclass(styleclass);
			orderproduct.setServicefee(servicefee);
			orderproduct.setBonuspointsgained(bonuspointsgained);
			orderproduct.setOffshoredeliverycharges(offshoredeliverycharges);
			orderproduct.setDiscountamount(discount);
			orderproduct.setProductname(productname);
			orderproduct.setReceivername(receivername);
			orderproduct.setAddressid(addressid);
			orderproduct.setSellingprice(sellingprice);
			orderproduct.setInvoicetype(invoicetype);
			orderproduct.setIsreprinted(isreprinted);
			orderproduct.setIseinvoice(iseinvoice);
			orderproduct.setTaxtype(taxtype);
			orderproduct.setPaymentmodeid(paymentmodeid);
			orderproduct.setInvoicetitle(invoicetitle);
			orderproduct.setCompanyno(companyno);
			orderproduct.setInvoicereceivername(invoicereceivername);
			orderproduct.setInstructiontoscm(instructiontoscm);
			orderproduct.setOrderdesc(order_desc);
			orderproduct.setIspromotionalproduct(ispromotionalproduct);
			orderproduct.setStorechainid(storechainid);
			orderproduct.setStoreid(storeid);
			orderproduct.setSubdeliverytype(subdeliverytype);

			int resultCode = customerorderManageService.saveTempOrder(order,
					orderproduct);

			order.setRtncode(resultCode + "");

			OrderDTO dto = BeanMapper.map(order, OrderDTO.class);
			result.setOrder(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}

	@Override
	public OrderResult buildTempOrderPayment(Long orderid, Integer isacntfirst,
			Integer bonus, Integer paymentmodeid, Integer transferaccno) {
		OrderResult result = new OrderResult();
		try {

			ToafOrderedproduct orderproduct = new ToafOrderedproduct();
			Validate.notNull(orderid, "orderid获取错误(orderid:" + orderid + ")");
			Validate.notNull(isacntfirst, "isacntfirst获取错误(isacntfirst:"
					+ isacntfirst + ")");
			Validate.notNull(bonus, "bonus获取错误(bonus:" + bonus + ")");
			Validate.notNull(paymentmodeid, "paymentmodeid获取错误(paymentmodeid:"
					+ paymentmodeid + ")");
			orderproduct.setOrderid(orderid);
			orderproduct.setIsacntfirst(isacntfirst);
			orderproduct.setIshonglioK(bonus);
			orderproduct.setPaymentmodeid(paymentmodeid);
			orderproduct.setTransferaccno(transferaccno);
			int resultCode = customerorderManageService
					.saveTempOrderPayment(orderproduct);
			ToafOrder order = new ToafOrder();
			order.setOrderid(orderid);
			order.setRtncode(resultCode + "");

			OrderDTO dto = BeanMapper.map(order, OrderDTO.class);
			result.setOrder(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	

	@Override
	public OrderResult createTempOrderPayment(Long orderid,
			Integer paymentmodeid, Integer transferaccno) {
		OrderResult result = new OrderResult();
		try {

			ToafOrderedproduct orderproduct = new ToafOrderedproduct();
			Validate.notNull(orderid, "orderid获取错误(orderid:" + orderid + ")");
	
			Validate.notNull(paymentmodeid, "paymentmodeid获取错误(paymentmodeid:"
					+ paymentmodeid + ")");
			orderproduct.setOrderid(orderid);

			orderproduct.setPaymentmodeid(paymentmodeid);
			orderproduct.setTransferaccno(transferaccno);
			int resultCode = customerorderManageService.createTempOrderPayment(orderproduct);
			ToafOrder order = new ToafOrder();
			order.setOrderid(orderid);
			order.setRtncode(resultCode + "");

			OrderDTO dto = BeanMapper.map(order, OrderDTO.class);
			result.setOrder(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}
	
	@Override
	public OrderResult buildOrder(Long orderid, Long customerid,
			Long callattendedby, Integer uselotterybonus, Long subcharnelid,
			String areacode, String refereeid, Integer refereetype) {
		OrderResult result = new OrderResult();
		try {
			Validate.notNull(orderid, "orderid参数为空");
			Validate.notNull(customerid, "customerid参数为空");
			Validate.notNull(callattendedby, "callattendedby参数为空");
			Validate.notNull(uselotterybonus, "uselotterybonus参数为空");

			ToafOrder order = new ToafOrder();
			order.setOrderid(orderid);
			order.setCreatedby(callattendedby);
			order.setCustomerid(customerid);
			order.setIslotterybonus(uselotterybonus);
			order.setSubcharnelid(subcharnelid);
			order.setAreacode(areacode);
			order.setRefereeid(refereeid);
			order.setRefereetype(refereetype);

			order = customerorderManageService.createOrder(order);

			OrderDTO dto = BeanMapper.map(order, OrderDTO.class);
			result.setOrder(dto);

			return result;

		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public OrderResult postOrder(Long orderid, Long customerid,
			String payername, String receiptno) {
		OrderResult result = new OrderResult();
		try {
			Validate.notNull(orderid, "orderid参数为空");
			Validate.notNull(customerid, "customerid参数为空");
			Validate.notNull(payername, "payername参数为空");
			Validate.notNull(receiptno, "receiptnod参数为空");
			ToafOrder order = new ToafOrder();
			order.setOrderid(orderid);
			order.setCustomerid(customerid);
			order.setPayername(payername);
			order.setReceiptno(receiptno);
			order = customerorderManageService.postOrderReceivable(order);
			OrderDTO dto = BeanMapper.map(order, OrderDTO.class);
			result.setOrder(dto);
			return result;

		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public OrderResult fetchOrderId() {
		OrderResult result = new OrderResult();
		try {

			ToafOrder order = new ToafOrder();

			Long orderid = customerorderManageService.fetchOrderId();

			Validate.notNull(orderid, "orderid获取错误(orderid:" + orderid + ")");
			order.setOrderid(orderid);

			OrderDTO dto = BeanMapper.map(order, OrderDTO.class);
			result.setOrder(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerOrdersInfoResult queryCustomerOrder(Long orderid,
			Integer itemid, Long customerid) {
		CustomerOrdersInfoResult result = new CustomerOrdersInfoResult();
		try {
			// Validate.notNull(orderid, "orderid参数为空");
			// Validate.notNull(itemid, "itemid参数为空");
			Validate.notNull(customerid, "customerid参数为空");
			CustomerOrderInfo orderinfo = new CustomerOrderInfo();
			orderinfo.setCustomerid(customerid);
			orderinfo.setOrderid(orderid);
			orderinfo.setItemid(itemid);
			List<CustomerOrderInfo> orderinfoes = customerorderManageService
					.selectCustomerOrderInfo(orderinfo);
			List<CustomerOrderInfoDTO> dtoes = BeanMapper.mapList(orderinfoes,
					CustomerOrderInfoDTO.class);
			result.setCustomerorderinfoes(dtoes);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public OrderReasonInfoesResult queryOrderReasonInfo(Long shiporderid,
			Integer sequenceno, String isshiporder) {
		OrderReasonInfoesResult result = new OrderReasonInfoesResult();
		try {
			Validate.notNull(shiporderid, "shiporderid参数为空");
			Validate.notNull(sequenceno, "sequenceno参数为空");
			Validate.notNull(isshiporder, "isshiporder参数为空");
			TscmOrderreasoninfo orderreasoninfo = new TscmOrderreasoninfo();
			orderreasoninfo.setRosoid(shiporderid);
			orderreasoninfo.setRososequence(sequenceno);
			orderreasoninfo.setIsshiporder(isshiporder);

			List<TscmOrderreasoninfo> orderreasons = customerorderManageService
					.selectOrderreasoninfo(orderreasoninfo);
			List<OrderReasonInfoDTO> dtoes = BeanMapper.mapList(orderreasons,
					OrderReasonInfoDTO.class);
			result.setOrderreasoninfoes(dtoes);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerOrderInfoResult cancelCustomerOrder(Long orderid,
			Integer itemid, Long createdby, String remarks,
			Integer primarycancelreason, Integer secondarycancelreason) {

		CustomerOrderInfoResult result = new CustomerOrderInfoResult();

		try {
			Validate.notNull(orderid, "orderid参数不为空");
			Validate.notNull(itemid, "itemid参数不为空");
			Validate.notNull(createdby, "createdby参数不为空");
			Validate.notNull(remarks, "remarks参数不为空");
			Validate.notNull(primarycancelreason, "primarycancelreason参数不为空");
			Validate.notNull(secondarycancelreason,
					"secondarycancelreason参数不为空");

			CustomerOrderInfo orderInfo = new CustomerOrderInfo();

			orderInfo.setOrderid(orderid);
			orderInfo.setItemid(itemid);
			orderInfo.setCreatedby(createdby);
			orderInfo.setRemarks(remarks);
			orderInfo.setPrimarycancelreason(primarycancelreason);
			orderInfo.setSecondarycancelreason(secondarycancelreason);

			orderInfo = customerorderManageService
					.cancelCustomerOrder(orderInfo);

			CustomerOrderInfoDTO dtoe = BeanMapper.map(orderInfo,
					CustomerOrderInfoDTO.class);

			result.setCustomerorderinfo(dtoe);

			return result;

		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);

		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerOrderInfoResult reasonInfo(Long orderid, Integer itemid,
			String remarks, Long createdby, String reasoncode) {
		CustomerOrderInfoResult result = new CustomerOrderInfoResult();
		try {
			Validate.notNull(orderid, "orderid参数不为空");
			Validate.notNull(itemid, "itemid参数不为空");
			Validate.notNull(remarks, "remarks参数不为空");
			Validate.notNull(createdby, "createdby参数不为空");
			Validate.notNull(reasoncode, "reasoncode参数不为空");

			CustomerOrderInfo orderInfo = new CustomerOrderInfo();

			orderInfo.setOrderid(orderid);
			orderInfo.setItemid(itemid);
			orderInfo.setRemarks(remarks);
			orderInfo.setCreatedby(createdby);
			orderInfo.setReasoncode(reasoncode);

			orderInfo = customerorderManageService
					.deleveryConfirmOrAbort(orderInfo);

			CustomerOrderInfoDTO dtoe = BeanMapper.map(orderInfo,
					CustomerOrderInfoDTO.class);

			result.setCustomerorderinfo(dtoe);

			return result;

		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerOrderInfoResult confirmCustomerShipOrder(Long orderid,
			Integer itemid, Long createdby) {
		CustomerOrderInfoResult result = new CustomerOrderInfoResult();
		try {
			Validate.notNull(orderid, "orderid参数不为空");
			Validate.notNull(itemid, "itemid参数不为空");
			Validate.notNull(createdby, "createdby参数不为空");

			CustomerOrderInfo orderInfo = new CustomerOrderInfo();

			orderInfo.setOrderid(orderid);
			orderInfo.setItemid(itemid);
			orderInfo.setCreatedby(createdby);
			orderInfo.setDeleverystatus(APIConstant.ORDER_SHIP_CONFIRM);

			orderInfo = customerorderManageService
					.deleveryConfirmOrAbort(orderInfo);

			CustomerOrderInfoDTO dtoe = BeanMapper.map(orderInfo,
					CustomerOrderInfoDTO.class);

			result.setCustomerorderinfo(dtoe);

			return result;

		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerOrderInfoResult failureCustomerShipOrder(Long orderid,
			Integer itemid, Long createdby) {
		CustomerOrderInfoResult result = new CustomerOrderInfoResult();
		try {
			Validate.notNull(orderid, "orderid参数不为空");
			Validate.notNull(itemid, "itemid参数不为空");
			Validate.notNull(createdby, "createdby参数不为空");

			CustomerOrderInfo orderInfo = new CustomerOrderInfo();

			orderInfo.setOrderid(orderid);
			orderInfo.setItemid(itemid);
			orderInfo.setCreatedby(createdby);
			orderInfo.setDeleverystatus(APIConstant.ORDER_SHIP_ABORT);

			orderInfo = customerorderManageService
					.deleveryConfirmOrAbort(orderInfo);

			CustomerOrderInfoDTO dtoe = BeanMapper.map(orderInfo,
					CustomerOrderInfoDTO.class);

			result.setCustomerorderinfo(dtoe);

			return result;

		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerOrderInfoResult acceptReturn(Long orderid, Integer itemid,
			Integer returntype, Integer returnreason1, Integer returnreason2,
			Long createdby) {
		CustomerOrderInfoResult result = new CustomerOrderInfoResult();
		try {
			Validate.notNull(orderid, "orderid参数不为空");
			Validate.notNull(itemid, "itemid参数不为空");
			Validate.notNull(returntype, "returntype参数不为空");
			Validate.notNull(returnreason1, "returnreason1参数不为空");
			Validate.notNull(returnreason2, "returnreason2参数不为空");
			Validate.notNull(createdby, "createdby参数不为空");

			CustomerOrderInfo orderinfo = new CustomerOrderInfo();
			orderinfo.setOrderid(orderid);
			orderinfo.setItemid(itemid);
			orderinfo.setReturntype(returntype);
			orderinfo.setReturnreason1(returnreason1);
			orderinfo.setReturnreason2(returnreason2);
			orderinfo.setCreatedby(createdby);

			orderinfo = customerorderManageService.acceptReturnable(orderinfo);

			CustomerOrderInfoDTO dto = BeanMapper.map(orderinfo,
					CustomerOrderInfoDTO.class);

			result.setCustomerorderinfo(dto);

			logger.info("Rtncode:" + orderinfo.getRtncode());

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerOrderInfoResult shipConfirm(Long orderid, Integer itemid,
			String deliveryorderid, Long selectedcarrier, Long createdby,
			String actualshippeddate) {
		CustomerOrderInfoResult result = new CustomerOrderInfoResult();
		try {
			Validate.notNull(orderid, "orderid参数不为空");
			Validate.notNull(itemid, "itemid参数不为空");
			Validate.notNull(deliveryorderid, "deliveryorderid参数不为空");
			Validate.notNull(selectedcarrier, "selectedcarrier参数不为空");
			Validate.notNull(createdby, "createdby参数不为空");
			Validate.notNull(actualshippeddate, "actualshippeddate参数不为空");

			CustomerOrderInfo orderinfo = new CustomerOrderInfo();
			orderinfo.setOrderid(orderid);
			orderinfo.setItemid(itemid);
			orderinfo.setDeliveryorderid(deliveryorderid);
			orderinfo.setSelectedcarrier(selectedcarrier);
			orderinfo.setCreatedby(createdby);
			try {
				orderinfo.setActualshippeddate(DateUtil.convertStringToDate(
						DateUtil.YYYY_MM_DD_HH_MM_SS, actualshippeddate));
				orderinfo = customerorderManageService
						.shipConfirmable(orderinfo);
			} catch (ParseException e) {
				orderinfo.setRtncode(APIConstant.DATE_FORMAT_NOT_MATCH);
			}

			CustomerOrderInfoDTO dto = BeanMapper.map(orderinfo,
					CustomerOrderInfoDTO.class);

			result.setCustomerorderinfo(dto);

			logger.info("Rtncode:" + orderinfo.getRtncode());

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public OrderInvoiceInfoResult checkInvoice(Long orderid, Integer itemid,
			Long createdby) {
		OrderInvoiceInfoResult result = new OrderInvoiceInfoResult();
		try {
			Validate.notNull(orderid, "orderid参数不为空");
			Validate.notNull(itemid, "itemid参数不为空");
			Validate.notNull(createdby, "createdby参数不为空");
			ToafOrderinvoiceinfo orderinvoice = new ToafOrderinvoiceinfo();
			orderinvoice.setOrderid(orderid);
			orderinvoice.setItemid(itemid);
			orderinvoice.setCreatedby(createdby);

			ToafOrderinvoiceinfo invoiceInfo = customerorderManageService
					.checkInvoice(orderinvoice);

			OrderInvoiceInfoDTO dto = BeanMapper.map(invoiceInfo,
					OrderInvoiceInfoDTO.class);

			result.setOrderInvoiceInfo(dto);

			logger.info("Rtncode:" + invoiceInfo.getRtncode());

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerOrderInfoResult exchangeProduct(Long orderid,
			Integer itemid, Integer returntype, Integer returnreason1,
			Integer returnreason2, Long createdby, Integer colourcode,
			Integer colourclass, Integer stylecode, Integer styleclass) {
		CustomerOrderInfoResult result = new CustomerOrderInfoResult();
		try {
			Validate.notNull(orderid, "orderid参数不为空");
			Validate.notNull(itemid, "itemid参数不为空");
			Validate.notNull(returntype, "returntype参数不为空");
			Validate.notNull(returnreason1, "returnreason1参数不为空");
			Validate.notNull(returnreason2, "returnreason2参数不为空");
			Validate.notNull(createdby, "createdby参数不为空");
			Validate.notNull(colourcode, "colourcode参数不为空");
			Validate.notNull(colourclass, "colourclass参数不为空");
			Validate.notNull(stylecode, "stylecode参数不为空");
			Validate.notNull(styleclass, "styleclass参数不为空");

			CustomerOrderInfo orderinfo = new CustomerOrderInfo();
			orderinfo.setOrderid(orderid);
			orderinfo.setItemid(itemid);
			orderinfo.setReturntype(returntype);
			orderinfo.setReturnreason1(returnreason1);
			orderinfo.setReturnreason2(returnreason2);
			orderinfo.setCreatedby(createdby);
			orderinfo.setColourcode(colourcode);
			orderinfo.setColourclass(colourclass);
			orderinfo.setStylecode(stylecode);
			orderinfo.setStyleclass(styleclass);

			orderinfo = customerorderManageService
					.exchangeProductable(orderinfo);

			CustomerOrderInfoDTO dto = BeanMapper.map(orderinfo,
					CustomerOrderInfoDTO.class);

			result.setCustomerorderinfo(dto);

			logger.info("Rtncode:" + orderinfo.getRtncode());

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerOrderInfoResult failAbortReject(Long orderid,
			Integer itemid, Long createdby, String remarks, String reasoncode) {
		int type = APIConstant.API_TYPE;
		CustomerOrderInfoResult result = orderRefundAbortOrStorageOrOverdueCommon(
				orderid, itemid, createdby, remarks, reasoncode, type);
		return result;
	}

	@Override
	public CustomerOrderInfoResult returnConfirm(Long orderid, Integer itemid,
			Long createdby, String remarks, String reasoncode) {
		int type = APIConstant.API_TYPE1;
		CustomerOrderInfoResult result = orderRefundAbortOrStorageOrOverdueCommon(
				orderid, itemid, createdby, remarks, reasoncode, type);
		return result;
	}

	@Override
	public CustomerOrderInfoResult returnReasonInfo(Long orderid,
			Integer itemid, Long createdby, String remarks, String reasoncode) {
		int type = APIConstant.API_TYPE2;
		CustomerOrderInfoResult result = orderRefundAbortOrStorageOrOverdueCommon(
				orderid, itemid, createdby, remarks, reasoncode, type);
		return result;
	}

	@Override
	public CustomerOrderInfoResult orderRefundAbortOrStorageOrOverdueCommon(
			Long orderid, Integer itemid, Long createdby, String remarks,
			String reasoncode, int type) {
		CustomerOrderInfoResult result = new CustomerOrderInfoResult();
		try {
			Validate.notNull(orderid, "orderid参数不为空");
			Validate.notNull(itemid, "itemid参数不为空");
			Validate.notNull(createdby, "createdby参数不为空");
			Validate.notNull(remarks, "remarks参数不为空");
			Validate.notNull(reasoncode, "reasoncode参数不为空");

			CustomerOrderInfo orderinfo = new CustomerOrderInfo();
			orderinfo.setOrderid(orderid);
			orderinfo.setItemid(itemid);
			orderinfo.setCreatedby(createdby);
			orderinfo.setRemarks(remarks);
			orderinfo.setReasoncode(reasoncode);

			if (type == 0) {
				orderinfo.setDeleverystatus(APIConstant.ORDER_DELEVERY_STATUS);
			}

			orderinfo = customerorderManageService
					.orderRefundAbortOrStorageOrOverdue(orderinfo, type);

			CustomerOrderInfoDTO dto = BeanMapper.map(orderinfo,
					CustomerOrderInfoDTO.class);
			result.setCustomerorderinfo(dto);

			logger.info("Rtncode:" + orderinfo.getRtncode());

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerOrderInfoResult orderCoupons(Long orderid,
			Long couponnumber, Integer coupontype, Long coupongroupnumber,
			Integer usage, Integer offervaluepercent, Integer offervalue,
			Long customerid, Long createdby, Long productid,
			Integer productversion, Double productamount, Integer quantity) {
		CustomerOrderInfoResult result = new CustomerOrderInfoResult();
		try {
			Validate.notNull(orderid, "orderid参数不为空");
			Validate.notNull(couponnumber, "couponnumber参数不为空");
			Validate.notNull(coupontype, "coupontype参数不为空");
			Validate.notNull(createdby, "createdby参数不为空");
			Validate.notNull(coupongroupnumber, "coupongroupnumber参数不为空");
			Validate.notNull(usage, "usage参数不为空");
			Validate.notNull(offervaluepercent, "offervaluepercent参数不为空");
			Validate.notNull(offervalue, "offervalue参数不为空");
			Validate.notNull(customerid, "customerid参数不为空");
			Validate.notNull(productid, "productid参数不为空");
			Validate.notNull(productversion, "productversion参数不为空");
			Validate.notNull(productamount, "productamount参数不为空");
			Validate.notNull(quantity, "quantity参数不为空");

			CustomerOrderInfo orderinfo = new CustomerOrderInfo();
			orderinfo.setOrderid(orderid);
			orderinfo.setCouponnumber(couponnumber);
			orderinfo.setCoupontype(coupontype);
			orderinfo.setCreatedby(createdby);
			orderinfo.setCoupongroupnumber(coupongroupnumber);
			orderinfo.setUsage(usage);
			orderinfo.setOffervaluepercent(offervaluepercent);
			orderinfo.setOffervalue(offervalue);
			orderinfo.setCustomerid(customerid);
			orderinfo.setProductid(productid);
			orderinfo.setProductversion(productversion);
			orderinfo.setProductamount(productamount);
			orderinfo.setQuantity(quantity);

			orderinfo = customerorderManageService.useOrderCoupons(orderinfo);

			CustomerOrderInfoDTO dto = BeanMapper.map(orderinfo,
					CustomerOrderInfoDTO.class);
			result.setCustomerorderinfo(dto);

			logger.info("Rtncode:" + orderinfo.getRtncode());

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerOrderPaymentsResult queryCustomerOrderPay(Long orderid,
			Integer itemid, Long customerid, String transferaccno) {
		CustomerOrderPaymentsResult result = new CustomerOrderPaymentsResult();
		try {
			 Validate.notNull(orderid, "orderid参数不为空");

			// Validate.notNull(itemid, "itemid参数不为空");
			//Validate.notNull(customerid, "customerid参数不为空");
			Validate.notNull(transferaccno, "transferaccno参数不为空");

			CustomerOrderPayment orderinfo = new CustomerOrderPayment();
			orderinfo.setOrderid(orderid);
			orderinfo.setItemid(itemid);
			orderinfo.setCustomerid(customerid);
			orderinfo.setTransferaccno(transferaccno);

			List<CustomerOrderPayment> customerorderpays = customerorderManageService
					.selectCustomerOrderPay(orderinfo);
			List<CustomerOrderPaymentDTO> dtoes = BeanMapper.mapList(
					customerorderpays, CustomerOrderPaymentDTO.class);
			result.setCustomerorderpayments(dtoes);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerOrderPaymentResult postCustomerOrderPay(Long orderid,
			Double paymentamount, Long customerid, String payername,
			String transferaccno, String receiptno, Long createdby) {
		CustomerOrderPaymentResult result = new CustomerOrderPaymentResult();
		try {
			Validate.notNull(orderid, "orderid参数不为空");
			Validate.notNull(paymentamount, "paymentamount参数不为空");
			Validate.notNull(customerid, "customerid参数不为空");
			Validate.notNull(payername, "payername参数不为空");
			Validate.notNull(receiptno, "receiptno参数不为空");
			Validate.notNull(transferaccno, "transferaccno参数不为空");
			Validate.notNull(createdby, "createdby参数不为空");
			ToafPostacknowledgement orderpost = new ToafPostacknowledgement();
			orderpost.setOrderid(orderid);
			orderpost.setCreatedby(createdby);
			orderpost.setCustomerid(customerid);
			orderpost.setPayername(payername);
			orderpost.setAmountreceived(paymentamount);
			// orderpost.setAmountappropriated(paymentamount);
			orderpost.setExcessamount(paymentamount);
			orderpost.setReceiptno(receiptno);
			orderpost.setPostaccountnumber(transferaccno);
			orderpost = customerorderManageService
					.postCustomerOrderPay(orderpost);
			CustomerOrderPaymentDTO dto = BeanMapper.map(orderpost,
					CustomerOrderPaymentDTO.class);
			result.setCustomerOrderPayment(dto);
			return result;
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			logger.info(e.getMessage());
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			logger.info(e.getMessage());
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.info(e.getMessage());
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public OrderInvoiceInfoResult customerOrderInvoice(Long orderid,
			Integer itemid, Long customerid) {
		OrderInvoiceInfoResult result = new OrderInvoiceInfoResult();
		try {
			Validate.notNull(orderid, "orderid参数不为空");
			Validate.notNull(itemid, "itemid参数不为空");
			Validate.notNull(customerid, "customerid参数不为空");

			CustomerOrderinvoiceinfo orderInvoice = new CustomerOrderinvoiceinfo();
			orderInvoice.setOrderid(orderid);
			orderInvoice.setItemid(itemid);
			orderInvoice.setCustomerid(customerid);
			List<CustomerOrderinvoiceinfo> orderInvoices = invoiceManageSerevice
					.orderEInvoiceDownload(orderInvoice);
			if (orderInvoices != null && orderInvoices.size() > 0) {
				orderInvoice = orderInvoices.get(0);
				OrderInvoiceInfoDTO dto = BeanMapper.map(orderInvoice,
						OrderInvoiceInfoDTO.class);
				result.setOrderInvoiceInfo(dto);
			}

			return result;
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			logger.info(e.getMessage());
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			logger.info(e.getMessage());
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.info(e.getMessage());
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public FedirefundrequestResult fedireFundRequest(String bankcode,
			String batchid) {
		FedirefundrequestResult result = new FedirefundrequestResult();
		try {
			logger.info(bankcode);
			logger.info(batchid);
			Validate.notNull(bankcode, "bankcode参数不为空");
			Validate.notNull(batchid, "batchid参数不为空");
			ToafApiFedirefundrequest fedirefundRequest=new ToafApiFedirefundrequest();
			fedirefundRequest.setBankcode(bankcode);
			fedirefundRequest.setBatchid(batchid);
			List<FedirefundrequestDTO> fedirefundrequests = customerRefundService.queryFedirefundRequest(fedirefundRequest);
			result.setFedirefundrequests(fedirefundrequests);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public FedirefundresponseResult fedireFundResponse(Long companyid,
			String bankcode, Long refundid, Long customerid,
			Double refundamount, Integer refundstatus,
			String transactionsequence, String paymentdate,
			String payingaccountnumber, String recipientaccount,
			String recipientname, Long createdby, Long payingbankid,
			Long recipientbankid, String personalid, Double servicefee,
			String businesscode, String payername, Long repayid) {
		logger.info("退款确认");
		FedirefundresponseResult result = new FedirefundresponseResult();
		try {
			Validate.notNull(bankcode, "bankcode参数不为空");
			Validate.notNull(companyid, "companyid参数不为空");
			Validate.notNull(refundid, "refundid参数不为空");
			Validate.notNull(customerid, "customerid参数不为空");
			Validate.notNull(refundamount, "refundamount参数不为空");
			Validate.notNull(refundstatus, "refundstatus参数不为空");
			Validate.notNull(transactionsequence, "transactionsequence参数不为空");
			Validate.notNull(paymentdate, "paymentdate参数不为空");
			Validate.notNull(payingbankid, "payingbankid参数不为空");
			ToafApiFedirefundresponse fedirefundResponse =new ToafApiFedirefundresponse();
			fedirefundResponse.setCompanyid(companyid);
			fedirefundResponse.setBankcode(bankcode);
			fedirefundResponse.setRefundid(refundid);
			fedirefundResponse.setCustomerid(customerid);
			fedirefundResponse.setRefundamount(refundamount);
			fedirefundResponse.setRefundstatus(refundstatus);
			fedirefundResponse.setTransactionsequence(transactionsequence);
			fedirefundResponse.setPayingaccountnumber(payingaccountnumber);
			fedirefundResponse.setRecipientaccount(recipientaccount);
			fedirefundResponse.setRecipientname(recipientname);
			fedirefundResponse.setCreatedby(createdby);
			fedirefundResponse.setPayingbankid(payingbankid);
			fedirefundResponse.setRecipientbankid(recipientbankid);
			fedirefundResponse.setPersonalid(personalid);
			fedirefundResponse.setServicefee(servicefee);
			fedirefundResponse.setBusinesscode(businesscode);
			fedirefundResponse.setPayername(payername);
			fedirefundResponse.setRepayid(repayid);
			
			fedirefundResponse.setPaymentdate(DateUtil.convertStringToDate(DateUtil.YYYY_MM_DD,paymentdate));
			FedirefundresponseDTO dto =customerRefundService.modifyFedirefundResponse(fedirefundResponse);
			result.setFedirefundresponse(dto);
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
