package com.best1.integration.activator;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import com.best1.api.mq.weixin.service.SmsManageSerevice;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.response.dto.crm.CustomermessageDTO;


@Component
public class MessagemarketingHandler {
	private static Logger logger = LoggerFactory
			.getLogger(MessagemarketingHandler.class);

	 
	@Autowired
	private SmsManageSerevice smsManageSerevice;
	
	@ServiceActivator
	public void handlerMessage(List<Map<String, Object>> messages) {
		logger.info("群发短信");
		List<CustomermessageDTO> customermessages = BeanMapper.mapList(
				messages, CustomermessageDTO.class);
		
		
		for (CustomermessageDTO message : customermessages) {
			
			
			message=smsManageSerevice.sendAdSms(message);
			
		}
		
	}
}
