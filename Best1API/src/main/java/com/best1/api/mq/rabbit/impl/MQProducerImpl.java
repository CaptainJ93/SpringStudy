package com.best1.api.mq.rabbit.impl;

import org.javasimon.aop.Monitored;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.mq.rabbit.MQProducer;

@Component
@Transactional
@Monitored
public class MQProducerImpl implements MQProducer {
	@Autowired
	 private RabbitTemplate rabbitTemplate;  
	  

	private static Logger logger = LoggerFactory.getLogger(MQProducerImpl.class);
  
    @Override
    public void sendDataToQueue(String queueKey, Object object) {
        try {
        	rabbitTemplate.convertAndSend(queueKey, object);
        } catch (Exception e) {
        	logger.error(e.getMessage());
        }

    }
}
