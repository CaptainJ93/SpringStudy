package com.best1.api.mq.weixin.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;
import org.javasimon.aop.Monitored;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.entity.cmn.SmsSend;
import com.best1.api.entity.cmn.SmsSendExample;
import com.best1.api.entity.oaf.order.CustomerOrderPayment;
import com.best1.api.mapper.cmn.SmsSendMapper;
import com.best1.api.mq.weixin.service.SmsManageSerevice;
import com.best1.api.service.crm.CustomerManageService;
import com.best1.api.service.oaf.CustomerOrderManageSerevice;
import com.best1.api.utils.APIConstant;
import com.best1.api.webservice.soap.response.dto.crm.CustomermessageDTO;

@Component
@Transactional
@Monitored
public class SmsManageSereviceImpl implements SmsManageSerevice {

	private static Logger logger = LoggerFactory
			.getLogger(SmsManageSereviceImpl.class);

	 
	@Autowired
	private SmsSendMapper smsSendDAO;
	@Autowired
	private CustomerOrderManageSerevice customerOrder;
	
	@Autowired
	private CustomerManageService customerManageService;


	@Override
	public List<SmsSend> smsMessage(SmsSend sms) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		SmsSendExample example =new SmsSendExample();
		SmsSendExample.Criteria criteria=example.createCriteria();
		criteria.andMobileEqualTo(sms.getMobile());
		criteria.andSubmitTimeGreaterThanOrEqualTo(df.format(DateUtils.addMinutes(new Date(), -11)));
		return smsSendDAO.selectByExample(example);
	}

	@Override
	public List<CustomerOrderPayment> customerOrderPay(Long customerid,Long orderid) {
		CustomerOrderPayment customerPay=new CustomerOrderPayment();
		customerPay.setCustomerid(customerid);
		customerPay.setOrderid(orderid);
		return customerOrder.selectCustomerOrderPay(customerPay);
	}

	@Override
	public CustomermessageDTO sendAdSms(CustomermessageDTO dto) {
		
		dto.setUserloginid(APIConstant.API_USER_SYSTEM);
		dto=customerManageService.sendCustomerMessage(dto);
		return dto;
	}

}
