package com.best1.api.webapp.mvc.oaf;

import java.util.List;

import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.best1.api.entity.oaf.order.ToafApiFedirefundrequest;
import com.best1.api.entity.oaf.order.ToafApiFedirefundresponse;
import com.best1.api.service.oaf.CustomerRefundManageSerevice;
import com.best1.api.utils.DateUtil;
import com.best1.api.utils.MediaTypes;
import com.best1.api.webservice.soap.response.dto.oaf.FedirefundrequestDTO;
import com.best1.api.webservice.soap.response.dto.oaf.FedirefundresponseDTO;
import com.best1.api.webservice.soap.response.dto.oaf.RefunddetailsDTO;
import com.best1.api.webservice.soap.response.result.oaf.FedirefundrequestResult;
import com.best1.api.webservice.soap.response.result.oaf.FedirefundresponseResult;
import com.best1.api.webservice.soap.response.result.oaf.RefunddetailsesResult;
import com.best1.api.webservice.utils.ApiHandleError;

@RestController
public class FediRefundController {
	private static Logger logger = LoggerFactory
			.getLogger(FediRefundController.class);
	@Autowired
	private CustomerRefundManageSerevice customerRefundService;

	@RequestMapping(value = "/oaf/refunddetails/query", method = { RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public RefunddetailsesResult queryRefunddetails(@RequestBody  RefunddetailsDTO refunddetailsdto) {
		RefunddetailsesResult result = new RefunddetailsesResult();
		try {
			Validate.notNull(refunddetailsdto.getOrderid(), "Orderid参数不为空");
			Validate.notNull(refunddetailsdto.getItemid(),"Itemid参数不为空");
			Validate.notNull(refunddetailsdto.getCustomerid() ,"Customerid参数不为空");
			List<RefunddetailsDTO> dtoes =customerRefundService.queryRefunddetails(refunddetailsdto);
			
		   result.setRefunddetails(dtoes);;
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

	@RequestMapping(value = "/oaf/fedirefundrequest/list", method = { RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public FedirefundrequestResult listAllFedirefundrequest(
			@RequestParam(value = "bankcode", required = true) String bankcode,
			@RequestParam(value = "batchid", required = true) String batchid) {

		FedirefundrequestResult result = new FedirefundrequestResult();
		try {
			logger.info("退款获取");
			logger.info(bankcode);
			logger.info(batchid);
			ToafApiFedirefundrequest fedirefundRequest = new ToafApiFedirefundrequest();
			fedirefundRequest.setBankcode(bankcode);
			fedirefundRequest.setBatchid(batchid);
			List<FedirefundrequestDTO> fedirefundrequests = customerRefundService
					.queryFedirefundRequest(fedirefundRequest);
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

	@RequestMapping(value = "/oaf/fedirefundresponse/modify", method = { RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public FedirefundresponseResult modifyFedirefundresponse(
			@RequestParam(value = "companyid", required = true) Long companyid,
			@RequestParam(value = "bankcode", required = true) String bankcode,
			@RequestParam(value = "refundid", required = true) Long refundid,
			@RequestParam(value = "customerid", required = true) Long customerid,
			@RequestParam(value = "refundamount", required = true) Double refundamount,
			@RequestParam(value = "refundstatus", required = true) Integer refundstatus,
			@RequestParam(value = "transactionsequence", required = true) String transactionsequence,
			@RequestParam(value = "paymentdate", required = true) String paymentdate,
			@RequestParam(value = "recipientaccount", required = true) String recipientaccount,
			@RequestParam(value = "recipientname", required = true) String recipientname,
			@RequestParam(value = "createdby", required = true) Long createdby,
			@RequestParam(value = "payingaccountnumber", required = false) String payingaccountnumber,
			@RequestParam(value = "payingbankid", required = false) Long payingbankid,
			@RequestParam(value = "recipientbankid", required = false) Long recipientbankid,
			@RequestParam(value = "personalid", required = false) String personalid,
			@RequestParam(value = "servicefee", required = false) Double servicefee,
			@RequestParam(value = "businesscode", required = false) String businesscode,
			@RequestParam(value = "payername", required = false) String payername,
			@RequestParam(value = "repayid", required = false) Long repayid) {
		logger.info("退款确认");
		FedirefundresponseResult result = new FedirefundresponseResult();
		try {
			ToafApiFedirefundresponse fedirefundResponse = new ToafApiFedirefundresponse();
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

			fedirefundResponse.setPaymentdate(DateUtil.convertStringToDate(
					DateUtil.YYYY_MM_DD, paymentdate));
			FedirefundresponseDTO dto = customerRefundService
					.modifyFedirefundResponse(fedirefundResponse);
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
