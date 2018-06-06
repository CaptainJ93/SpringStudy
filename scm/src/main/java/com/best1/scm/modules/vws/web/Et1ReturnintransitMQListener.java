package com.best1.scm.modules.vws.web;

import java.util.Calendar;
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
import com.best1.scm.modules.returnpackage.entity.ReturnReturnintransit;
import com.best1.scm.modules.returnpackage.entity.ReturnReturnintransitDetail;
import com.best1.scm.modules.returnpackage.service.ReturnReturnintransitDetailService;
import com.best1.scm.modules.returnpackage.service.ReturnReturnintransitService;
import com.rabbitmq.client.Channel;

/**
 * 针对et1的揽收指令进行监听
 * @author zhangzujie
 *
 */
public class Et1ReturnintransitMQListener implements ChannelAwareMessageListener{

	private static final Logger  logger =  LoggerFactory.getLogger(Et1ReturnintransitMQListener.class);
	
	@Autowired
	private ReturnReturnintransitService returnReturnintransitService;
	@Autowired
	private ReturnReturnintransitDetailService returnReturnintransitDetailService;
	
	@Override
	public void onMessage(Message message, Channel channel) throws Exception {
		 MessageProperties messageProperties = message.getMessageProperties(); 
			
		 System.out.println("msg:"+new String(message.getBody()));
		 ValidatorFactory factory = Validation.buildDefaultValidatorFactory(); 
		 Validator  validator = factory.getValidator();
		
		try{
			ReturnReturnintransit returnReturnintransit =  JSON.parseObject(new String(message.getBody(),"utf-8"),ReturnReturnintransit.class);
			
			Set<ConstraintViolation<ReturnReturnintransit>>constraintViolations =validator.validate(returnReturnintransit);  //针对揽收头信息进行验证
			for(ConstraintViolation<ReturnReturnintransit> constraintViolation : constraintViolations) {
			       logger.info("字段异常:"+constraintViolation.getPropertyPath()+constraintViolation.getMessage()+",json msg:"+new String(message.getBody(),"utf-8"));
			    }
			
			if(constraintViolations.size()==0){
				Calendar calendarNow = Calendar.getInstance();
				calendarNow.add(Calendar.MINUTE, +2);  //2分钟后防止读未提交
				Date date = calendarNow.getTime();
				returnReturnintransit.setRecordcreatedtime(date);
				returnReturnintransit.setDeliverytype(1000);
				returnReturnintransit.setSubdeliverytype(1000);
				returnReturnintransitService.save(returnReturnintransit);  //存储揽收头信息
				List<ReturnReturnintransitDetail> returnReturnintransitDetailList =  returnReturnintransit.getReturnReturnintransitDetail();
				if(null!=returnReturnintransitDetailList){
					for(ReturnReturnintransitDetail detail :returnReturnintransitDetailList){
						
						
						Set<ConstraintViolation<ReturnReturnintransitDetail>> returnReturnintransitDetailconstraintViolations =validator.validate(detail); //揽收明细进行认证
						for(ConstraintViolation<ReturnReturnintransitDetail> constraintViolation1 : returnReturnintransitDetailconstraintViolations) {
						       logger.info("字段异常:"+constraintViolation1.getPropertyPath()+constraintViolation1.getMessage()+",json msg:"+new String(message.getBody(),"utf-8"));
						  }
						if(returnReturnintransitDetailconstraintViolations.size()==0){
							detail.setRecordcreatedtime(new Date());
							returnReturnintransitDetailService.save(detail); //存储揽收明细信息
						}
						
					}
				}
			}
			
			channel.basicAck(messageProperties.getDeliveryTag(), false);  //发回应答
		}catch(Exception  json){ 
			logger.info("json生成对象异常1,json msg:"+new String(message.getBody(),"utf-8"));
			channel.basicAck(messageProperties.getDeliveryTag(), false);  //发回应答
			json.printStackTrace();
		}
			
	}
		

}
