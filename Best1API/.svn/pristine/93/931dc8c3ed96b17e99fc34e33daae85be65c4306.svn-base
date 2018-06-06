package com.best1.api.mq.sms;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.best1.api.entity.crm.TcrmCustomerreceive;
import com.best1.api.mapper.crm.TcrmCustomerreceiveMapper;
import com.best1.api.service.crm.CustomerManageService;
import com.best1.api.utils.APIConstant;
import com.best1.api.utils.DateUtil;
import com.best1.api.utils.MobileUtil;
import com.best1.api.webservice.soap.response.dto.crm.CustomerBlacklistDTO;
import com.rabbitmq.client.Channel;

public class SmsReceiveMQListener implements ChannelAwareMessageListener {

	private static final Logger logger = LoggerFactory
			.getLogger(SmsReceiveMQListener.class);

	@Autowired
	private TcrmCustomerreceiveMapper customerreceiveDAO;


	@Autowired
	private CustomerManageService customerManageService;

	
	public void onMessage(Message message, Channel channel) throws Exception {
		MessageProperties messageProperties = message.getMessageProperties();
		logger.info("msg:" + new String(message.getBody(), "utf-8"));
		try {
            TcrmCustomerreceive customersms = JSON.parseObject(new String(
					message.getBody(), "utf-8"), TcrmCustomerreceive.class);
			channel.basicAck(messageProperties.getDeliveryTag(), false); // 发回应答
			customersms.setTargetobj(customersms.getMobile());
			customersms.setReceiveumber(customersms.getSmsNumber());
			customersms.setCreatedby(APIConstant.CTI_USER_ID);
			customersms.setCreatedtimestamp(DateUtil.getTodayTime());
			customersms.setLastmodifiedtimestamp(DateUtil.getTodayTime());
			customersms.setLastmodifiedby(APIConstant.CTI_USER_ID);
			customersms.setReceivetype(APIConstant.RECEIVE_SMS_TYPE);//短信
			customerreceiveDAO.insertSelective(customersms);
			String content=customersms.getContent();
			String mobile=customersms.getMobile();
			mobile=MobileUtil.mobilevalidate(mobile);
			if(StringUtils.endsWithIgnoreCase(content, APIConstant.SMS_TD)){
			CustomerBlacklistDTO dto=new CustomerBlacklistDTO();
			dto.setContactnumber(mobile);
			dto.setContacttype(APIConstant.CONTACTTYPE_MOBILE);
			dto.setCreatedby(APIConstant.CTI_USER_ID);
			dto.setSms(APIConstant.MOBILE_SMS_BLACK);
			dto.setTelcall(APIConstant.MOBILE_TELL_NO_BLACK);
			customerManageService.createCustomerBlack(dto);
			}
		} catch (Exception e) {
			logger.info("json生成对象异常,json msg:"
					+ new String(message.getBody(), "utf-8"));
			logger.info(e.getMessage());
			e.printStackTrace();
			channel.basicAck(messageProperties.getDeliveryTag(), false); // 发回应答
		}

	}

}
