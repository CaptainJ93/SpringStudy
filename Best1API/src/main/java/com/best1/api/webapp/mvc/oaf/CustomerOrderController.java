package com.best1.api.webapp.mvc.oaf;


import java.util.List;

import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.best1.api.entity.oaf.order.CustomerOrderPayment;
import com.best1.api.entity.oaf.order.OrderPayment;
import com.best1.api.entity.oaf.order.ToafPostacknowledgement;
import com.best1.api.service.oaf.CustomerOrderManageSerevice;
import com.best1.api.utils.MediaTypes;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.response.dto.oaf.CustomerOrderPaymentDTO;
import com.best1.api.webservice.soap.response.dto.oaf.OrderPaymentDTO;
import com.best1.api.webservice.soap.response.result.oaf.CustomerOrderPaymentResult;
import com.best1.api.webservice.soap.response.result.oaf.CustomerOrderPaymentsResult;
import com.best1.api.webservice.soap.response.result.oaf.OrderPaymentResult;
import com.best1.api.webservice.utils.ApiHandleError;

@RestController
public class CustomerOrderController {
	private static Logger logger = LoggerFactory.getLogger(CustomerOrderController.class);
	@Autowired
	private CustomerOrderManageSerevice customerOrderSerevice;

	/**
	 * 
	 * { "orderid": "2726071", "itemid": "1", "createdby": "30364",
	 * "productamount": "2810.55 ", "customerid": "20010", "exceptiondesc":
	 * "微信", "paymentchangereasoncode": "1006", "paymentmodes": [ {
	 * "paymentmodeid": "5", "paymentamount": "150", "codpaymentmode": "",
	 * "payeename": "", "transferaccno": "", "bankid": "" }, { "paymentmodeid":
	 * "8", "paymentamount": "350", "codpaymentmode": "", "payeename": "",
	 * "transferaccno": "", "bankid": "" }, { "paymentmodeid": "1",
	 * "paymentamount": "2310.55", "codpaymentmode": "", "payeename": "胡文华",
	 * "transferaccno": "999991", "bankid": "" } ] }
	 */
	@RequestMapping(value = "/oaf/orderpayment/update", method = {
			RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public OrderPaymentResult changeOrderPayment(@RequestBody OrderPayment orderpay) {
		OrderPaymentResult result = new OrderPaymentResult();
		try {
			logger.info("修改支付方式");
			Validate.notNull(orderpay.getCustomerid(), "客户customerid获取错误(customerid:" + orderpay.getCustomerid() + ")");
			Validate.notNull(orderpay.getOrderid(), "Orderid(:" + orderpay.getOrderid() + ")");
			Validate.notNull(orderpay.getItemid(), "Itermid(Itermid:" + orderpay.getItemid() + ")");
			Validate.notNull(orderpay.getProductamount(),
					"productamount(Productamount:" + orderpay.getProductamount() + ")");

			OrderPaymentDTO dto = customerOrderSerevice.changeOrderPayment(orderpay);
			result.setOrderpayment(dto);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}

	@RequestMapping(value = "/oaf/orderpayment/post", method = { RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public CustomerOrderPaymentResult postCustomerOrderPay(@RequestBody CustomerOrderPaymentDTO customerOrderPayment) {
		CustomerOrderPaymentResult result = new CustomerOrderPaymentResult();
		try {

			ToafPostacknowledgement orderpost = new ToafPostacknowledgement();
			orderpost.setOrderid(customerOrderPayment.getOrderid());
			orderpost.setCreatedby(customerOrderPayment.getCreatedby());
			orderpost.setCustomerid(customerOrderPayment.getCustomerid());
			orderpost.setPayername(customerOrderPayment.getPayername());
			orderpost.setAmountreceived(customerOrderPayment.getPaymentamount());
			// orderpost.setAmountappropriated(paymentamount);
			orderpost.setExcessamount(customerOrderPayment.getPaymentamount());
			orderpost.setReceiptno(customerOrderPayment.getReceiptno());
			orderpost.setPostaccountnumber(customerOrderPayment.getPostaccountnumber());
			orderpost = customerOrderSerevice.postCustomerOrderPay(orderpost);
			CustomerOrderPaymentDTO dto = BeanMapper.map(orderpost, CustomerOrderPaymentDTO.class);
			result.setCustomerOrderPayment(dto);
			return result;
		} catch (IllegalArgumentException e) {

			logger.info(e.getMessage());
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			logger.info(e.getMessage());
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {

			logger.info(e.getMessage());
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	
	
	@RequestMapping(value = "/oaf/customerorderpay/query", method = { RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public CustomerOrderPaymentsResult queryCustomerOrderPay(@RequestBody CustomerOrderPaymentDTO customerOrderPayment) {
		CustomerOrderPaymentsResult result = new CustomerOrderPaymentsResult();
		try {
			Validate.notNull(customerOrderPayment.getOrderid(), "Orderid参数不为空");
			Validate.notNull(customerOrderPayment.getTransferaccno(), "transferaccno参数不为空");

			CustomerOrderPayment orderinfo = new CustomerOrderPayment();
			orderinfo.setOrderid(customerOrderPayment.getOrderid());
			orderinfo.setItemid(customerOrderPayment.getItemid());
			orderinfo.setCustomerid(customerOrderPayment.getCustomerid());
			orderinfo.setTransferaccno(customerOrderPayment.getTransferaccno());

			List<CustomerOrderPayment> customerorderpays = customerOrderSerevice
					.selectCustomerOrderPay(orderinfo);
			List<CustomerOrderPaymentDTO> dtoes = BeanMapper.mapList(
					customerorderpays, CustomerOrderPaymentDTO.class);
			result.setCustomerorderpayments(dtoes);
			return result;
	
		} catch (IllegalArgumentException e) {

			logger.info(e.getMessage());
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			logger.info(e.getMessage());
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {

			logger.info(e.getMessage());
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	
}
