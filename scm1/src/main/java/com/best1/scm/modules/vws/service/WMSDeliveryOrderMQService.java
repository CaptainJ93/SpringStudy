package com.best1.scm.modules.vws.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.amqp.core.Message;
/**
 * 监听mq的service
 * @author zhangzujie
 *
 */
public class WMSDeliveryOrderMQService {

	 @Autowired
	 private AmqpTemplate amqpTemplate;
	 
	 public void popMessage(String destinationQueueName) {
		 
		 
	        Message message = amqpTemplate.receive(destinationQueueName);
	        if(null!=message){
	        	System.out.println("WMSDeliveryOrderMQService:"+new String(message.getBody()));
	        }else{
	        	System.out.println("WMSDeliveryOrderMQService:message is null");
	        }
	        
	    }
}
