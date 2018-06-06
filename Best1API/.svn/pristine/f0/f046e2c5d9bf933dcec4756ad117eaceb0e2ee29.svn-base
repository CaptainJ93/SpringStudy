package com.best1.api.mq.sms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.best1.api.entity.crm.TcrmCustomermessage;
import com.best1.api.mapper.crm.TcrmCustomermessageMapper;
import com.best1.api.utils.APIConstant;
import com.best1.api.utils.DateUtil;
import com.rabbitmq.client.Channel;

public class SmsReportMQListener implements ChannelAwareMessageListener {

	private static final Logger logger = LoggerFactory
			.getLogger(SmsReportMQListener.class);

	@Autowired
	private TcrmCustomermessageMapper customerMessageDAO;

	public void onMessage(Message message, Channel channel) throws Exception {
		MessageProperties messageProperties = message.getMessageProperties();
		logger.info("msg:" + new String(message.getBody(), "utf-8"));
		try {
//sg:{"customermessageid":34736,"sendTime":"2017-09-12 17:02:03","status":1004}
			TcrmCustomermessage customersms = JSON.parseObject(new String(
					message.getBody(), "utf-8"), TcrmCustomermessage.class);
			channel.basicAck(messageProperties.getDeliveryTag(), false); // 发回应答
			customersms.setLastmodifiedtimestamp(DateUtil.getTodayTime());
			customersms.setLastmodifiedby(APIConstant.CTI_USER_ID);
			customerMessageDAO.updateByPrimaryKeySelective(customersms);

		} catch (Exception e) {
			logger.info("json生成对象异常,json msg:"
					+ new String(message.getBody(), "utf-8"));
			logger.info(e.getMessage());
			e.printStackTrace();
			channel.basicAck(messageProperties.getDeliveryTag(), false); // 发回应答
		}

	}

}
