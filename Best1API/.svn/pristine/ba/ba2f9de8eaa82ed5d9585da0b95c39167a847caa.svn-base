package com.best1.api.webapp.mvc.crm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;   

import com.best1.api.service.oaf.CustomerOrderManageSerevice;
import com.best1.api.utils.MediaTypes;
import com.best1.api.webservice.soap.response.dto.oaf.OrderDiscounttransactionDTO;
import com.best1.api.webservice.soap.response.result.oaf.OrderDiscounttransactionResult;
import com.best1.api.webservice.utils.ApiHandleError;

@Controller
public class CampaignController {
	private static Logger logger = LoggerFactory
			.getLogger(CampaignController.class);

	@Autowired
	private CustomerOrderManageSerevice customerOrderSerevice;

    @Value("${erp.url}") 
	private String   url;

	@RequestMapping("/CampaignOffersQuery")
	public void CampaignOffersQuery(@RequestParam("INIT") boolean INIT,
			@RequestParam("COMMAND") String COMMAND,
			@RequestParam("CONTENTKEY") Long CONTENTKEY,
			HttpServletResponse response) {
        logger.info(COMMAND);
		String erpurl = url + "?INIT=" + INIT + "&COMMAND=" + COMMAND
				+ "&CONTENTKEY=" + CONTENTKEY;
		 logger.info(erpurl);
		try {
			response.getWriter().write(erpServer(erpurl));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@RequestMapping(value= "DiscountCouponQuery")
	public void DiscountCouponQuery(@RequestParam("INIT") boolean INIT,
			@RequestParam("COMMAND") String COMMAND,
			@RequestParam("CONTENTKEY") Long CONTENTKEY,
			@RequestParam("txtCouponNumber") String txtCouponNumber,
			HttpServletResponse response) {
		String erpurl = url + "?INIT=" + INIT + "&COMMAND=" + COMMAND
				+ "&CONTENTKEY=" + CONTENTKEY + "&txtCouponNumber="
				+ txtCouponNumber;
		try {
			response.getWriter().write(erpServer(erpurl));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private String erpServer(String erpurl) {
 

		StringBuffer strl=new StringBuffer ();
 
		String str = null;
		try {
			URL url = new URL(erpurl);

			InputStreamReader isr;

			isr = new InputStreamReader(url.openStream());

			BufferedReader br = new BufferedReader(isr);

	
			while ((str = br.readLine()) != null) {
				strl.append(str);
			
			}

			br.close();
			isr.close();
			return strl.toString();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}
		return null;
	}

	
	// poster.open
	// "get","http://192.168.43.104:7019/internet/ExternalRequest?INIT=true&COMMAND=CampaignOffersQuery&CONTENTKEY="
	// & Session("ORDERID"),false;
	// SEND_URL =
	// "http://fo.emg.com.tw/internet/ExternalRequest?INIT=true&COMMAND=DiscountCouponQuery&CONTENTKEY="
	// & Session("ORDERID") & "&txtCouponNumber=" & Session("Input_coupon")

	
	
	@RequestMapping(value = "/crm/campaign/discount", method = {
			RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public OrderDiscounttransactionResult campaignDiscount(
			@RequestBody OrderDiscounttransactionDTO orderDiscounttransactionDTO) {
		OrderDiscounttransactionResult result = new OrderDiscounttransactionResult();
		try {
			// 判断参数是否为空
			logger.info("查询指定通关密语的行销活动客代是否使用过");

			Validate.notNull(orderDiscounttransactionDTO.getCustomerid(),
					"客户customerid获取错误(customerid:" + orderDiscounttransactionDTO.getCustomerid() + ")");
			Validate.notNull(orderDiscounttransactionDTO.getCampaignno(),
					"客户Campaignno获取错误(Campaignno:" + orderDiscounttransactionDTO.getCampaignno() + ")");

			orderDiscounttransactionDTO = customerOrderSerevice.userCampaignDiscount(orderDiscounttransactionDTO);
			result.setOrderDiscounttransaction(orderDiscounttransactionDTO);
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

	@RequestMapping(value = "/crm/campaign/creatediscounttransaction", method = {
			RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public OrderDiscounttransactionResult createDiscountTransaction(
			@RequestBody OrderDiscounttransactionDTO orderDiscounttransactionDTO) {

		OrderDiscounttransactionResult result = new OrderDiscounttransactionResult();

		try {
			// 判断参数是否为空
			logger.info("订单成立后插入通关密语使用流水表");

			Validate.notNull(orderDiscounttransactionDTO.getCustomerid(),
					"客户customerid获取错误(customerid:" + orderDiscounttransactionDTO.getCustomerid() + ")");
			Validate.notNull(orderDiscounttransactionDTO.getCoupongroupnumber(),
					"coupongroupnumber获取错误(coupongroupnumber:" + orderDiscounttransactionDTO.getCoupongroupnumber() + ")");
			Validate.notNull(orderDiscounttransactionDTO.getOrderid(),
					"orderid获取错误(orderid:" + orderDiscounttransactionDTO.getOrderid() + ")");
			Validate.notNull(orderDiscounttransactionDTO.getItemid(),
					"itemid获取错误(itemid:" + orderDiscounttransactionDTO.getItemid() + ")");
			Validate.notNull(orderDiscounttransactionDTO.getAmount(),
					"amount获取错误(amount:" + orderDiscounttransactionDTO.getAmount() + ")");
			Validate.notNull(orderDiscounttransactionDTO.getTransactiondate(),
					"transactiondate获取错误(transactiondate:" + orderDiscounttransactionDTO.getTransactiondate() + ")");
			Validate.notNull(orderDiscounttransactionDTO.getCreatedby(),
					"createdby获取错误(createdby:" + orderDiscounttransactionDTO.getCreatedby() + ")");

			Validate.notNull(orderDiscounttransactionDTO.getCoupontype(),
					"coupontype获取错误(coupontype:" + orderDiscounttransactionDTO.getCoupontype() + ")");
			
			orderDiscounttransactionDTO = customerOrderSerevice.createDiscountTransaction(orderDiscounttransactionDTO);
			result.setOrderDiscounttransaction(orderDiscounttransactionDTO);
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
	
	@RequestMapping(value = "/crm/campaign/couponused",method = {
			RequestMethod.POST },produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public OrderDiscounttransactionResult couponUsed(
			@RequestBody OrderDiscounttransactionDTO orderDiscounttransactionDTO) {
		OrderDiscounttransactionResult result = new OrderDiscounttransactionResult();
		try {
			// 判断参数是否为空
			logger.info("查询指定序列号的折价券是否使用过");

			Validate.notNull(orderDiscounttransactionDTO.getCouponserialno(),
					"折价券couponserialno获取错误(couponserialno:" + orderDiscounttransactionDTO.getCouponserialno() + ")");
			Validate.notNull(orderDiscounttransactionDTO.getCoupongroupnumber(),
					"折价券coupongroupnumber获取错误(coupongroupnumber:" + orderDiscounttransactionDTO.getCoupongroupnumber() + ")");

			orderDiscounttransactionDTO = customerOrderSerevice.couponUsed(orderDiscounttransactionDTO);
			result.setOrderDiscounttransaction(orderDiscounttransactionDTO);
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
