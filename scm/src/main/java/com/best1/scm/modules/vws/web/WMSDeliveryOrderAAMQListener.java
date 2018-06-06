package com.best1.scm.modules.vws.web;

import java.util.List;
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
import com.best1.scm.modules.returnpackage.entity.ReturnReturnintransit;
import com.best1.scm.modules.returnpackage.service.ReturnReturnintransitDetailService;
import com.best1.scm.modules.returnpackage.service.ReturnReturnintransitService;
import com.rabbitmq.client.Channel;

public class WMSDeliveryOrderAAMQListener implements ChannelAwareMessageListener{

	private static final Logger  logger =  LoggerFactory.getLogger(WMSDeliveryOrderAAMQListener.class); 
	
	@Autowired
	private ReturnReturnintransitService returnReturnintransitService;
	@Autowired
	private ReturnReturnintransitDetailService returnReturnintransitDetailService;
	
	@Override
	public void onMessage(Message message, Channel channel) throws Exception {
		// TODO Auto-generated method stub
		
		 MessageProperties messageProperties = message.getMessageProperties(); 
		 ValidatorFactory factory = Validation.buildDefaultValidatorFactory(); 
		 Validator  validator = factory.getValidator();
		
		try{
			ReturnReturnintransit returnReturnintransit =  JSON.parseObject(new String(message.getBody(),"utf-8"),ReturnReturnintransit.class);
			
			ReturnReturnintransit returnReturnintransitTemp = new ReturnReturnintransit();
			//判定销退号是否存在
			if((null == returnReturnintransit.getReturnid()) ||(0l==returnReturnintransit.getReturnid())){
			}
			returnReturnintransitTemp.setReturnid(returnReturnintransit.getReturnid());
			//确认该A换A退货信息是否存在
			List<ReturnReturnintransit> returnReturnintransitList = this.returnReturnintransitService.findList(returnReturnintransitTemp);
			if((null!=returnReturnintransitList)&&(returnReturnintransitList.size()>0)){
				returnReturnintransitService.updateReceiptdeliveryorderid(returnReturnintransit);  
			}else{
				logger.info("json生成对象异常1,json msg:"+new String(message.getBody(),"utf-8"));
			}
			
			channel.basicAck(messageProperties.getDeliveryTag(), false);  //发回应答
		}catch(Exception  json){ 
			logger.info("json生成对象异常1,json msg:"+new String(message.getBody(),"utf-8"));
			channel.basicAck(messageProperties.getDeliveryTag(), false);  //发回应答
			json.printStackTrace();
		}
	}

}
