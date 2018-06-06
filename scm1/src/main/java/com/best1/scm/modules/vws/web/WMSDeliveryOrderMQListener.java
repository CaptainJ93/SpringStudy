package com.best1.scm.modules.vws.web;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransit;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransitDetail;
import com.best1.scm.modules.delivery.service.DeliveryOrderintransitDetailService;
import com.best1.scm.modules.delivery.service.DeliveryOrderintransitService;
import com.rabbitmq.client.Channel;


/**
 * 接收从MQ发来的包裹信息
 * @author zhangzujie
 *
 */
public class WMSDeliveryOrderMQListener implements ChannelAwareMessageListener{

	private static final Logger  logger =  LoggerFactory.getLogger(WMSDeliveryOrderMQListener.class); 
	
	@Autowired
	private DeliveryOrderintransitService deliveryOrderintransitService ; //配送包裹相关
	
	@Autowired
	private DeliveryOrderintransitDetailService deliveryOrderintransitDetailService;//配送包裹明细相关
	

	
	@Override
	public void onMessage(Message message, Channel channel) throws Exception {
		// TODO Auto-generated method stub
		// System.out.println("msg:"+new String(message.getBody(),"utf-8"));
		 MessageProperties messageProperties = message.getMessageProperties(); 
		
		try{
			DeliveryOrderintransit deliveryOrderintransit =  JSON.parseObject(new String(message.getBody(),"utf-8"),DeliveryOrderintransit.class);
			
				deliveryOrderintransit.setRecordcreatedtime(new Date());
				deliveryOrderintransitService.save(deliveryOrderintransit);  //存储包裹头
				List<DeliveryOrderintransitDetail> deliveryOrderintransitDetailList =  deliveryOrderintransit.getDeliveryOrderintransitDetail();
				if(null!=deliveryOrderintransitDetailList){
					for(DeliveryOrderintransitDetail detail :deliveryOrderintransitDetailList){
						detail.setRecordcreatedtime(new Date());
						deliveryOrderintransitDetailService.save(detail); //存储包裹头明细
					}
				}
			
			channel.basicAck(messageProperties.getDeliveryTag(), false);  //发回应答
		}catch(Exception  e){ 
			logger.info("json生成对象异常2,json msg:"+new String(message.getBody(),"utf-8"));
			logger.info(e.getMessage());
			e.printStackTrace();
			channel.basicAck(messageProperties.getDeliveryTag(), false);  //发回应答
		}
			
	}
	
	public void onMessagebak(Message message, Channel channel) throws Exception {
		// TODO Auto-generated method stub
		 System.out.println("msg:"+new String(message.getBody(),"utf-8"));
		 MessageProperties messageProperties = message.getMessageProperties(); 
		
		 ValidatorFactory factory = Validation.buildDefaultValidatorFactory(); 
		 Validator  validator = factory.getValidator();
		
		try{
			DeliveryOrderintransit deliveryOrderintransit =  JSON.parseObject(new String(message.getBody(),"utf-8"),DeliveryOrderintransit.class);
			
			Set<ConstraintViolation<DeliveryOrderintransit>>constraintViolations =validator.validate(deliveryOrderintransit);  //针对包裹头信息进行验证
			for(ConstraintViolation<DeliveryOrderintransit> constraintViolation : constraintViolations) {
			       logger.info("字段异常:"+constraintViolation.getPropertyPath()+constraintViolation.getMessage()+",json msg:"+new String(message.getBody(),"utf-8"));
			    }
			
			if(constraintViolations.size()==0){
				
				deliveryOrderintransit.setRecordcreatedtime(new Date());
				deliveryOrderintransit.setDeliverytype(1000);
				deliveryOrderintransit.setSubdeliverytype(1000);
				deliveryOrderintransitService.save(deliveryOrderintransit);  //存储包裹头
				List<DeliveryOrderintransitDetail> deliveryOrderintransitDetailList =  deliveryOrderintransit.getDeliveryOrderintransitDetail();
				if(null!=deliveryOrderintransitDetailList){
					for(DeliveryOrderintransitDetail detail :deliveryOrderintransitDetailList){
						
						
						Set<ConstraintViolation<DeliveryOrderintransitDetail>> DeliveryOrderintransitDetailconstraintViolations =validator.validate(detail); //存储包裹头明细进行认证
						for(ConstraintViolation<DeliveryOrderintransitDetail> constraintViolation1 : DeliveryOrderintransitDetailconstraintViolations) {
						       logger.info("字段异常:"+constraintViolation1.getPropertyPath()+constraintViolation1.getMessage()+",json msg:"+new String(message.getBody(),"utf-8"));
						  }
						if(DeliveryOrderintransitDetailconstraintViolations.size()==0){
							detail.setRecordcreatedtime(new Date());
							deliveryOrderintransitDetailService.save(detail); //存储包裹头明细
						}
						
					}
				}
			}
			
			channel.basicAck(messageProperties.getDeliveryTag(), false);  //发回应答
		}catch(Exception  e){ 
			logger.info("json生成对象异常2,json msg:"+new String(message.getBody(),"utf-8"));
			logger.info(e.getMessage());
			e.printStackTrace();
			channel.basicAck(messageProperties.getDeliveryTag(), false);  //发回应答
		}
			
	}

	
}
