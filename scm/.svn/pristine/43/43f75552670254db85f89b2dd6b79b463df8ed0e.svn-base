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
import com.best1.scm.modules.outinterface.service.UserInfoService;
import com.best1.scm.modules.supplier.entity.ScmSupplierSkuinfo;
import com.best1.scm.modules.supplier.entity.ScmSupplierSkuinfoFromWMS;
import com.best1.scm.modules.supplier.service.ScmSupplierSkuinfoService;
import com.best1.scm.modules.sys.entity.User;
import com.rabbitmq.client.Channel;

public class WMSSKUInfoMQListener implements ChannelAwareMessageListener{

	private static final Logger  logger =  LoggerFactory.getLogger(WMSSKUInfoMQListener.class);
	
	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private ScmSupplierSkuinfoService scmSupplierSkuinfoService;
	
	@Override
	public void onMessage(Message message, Channel channel) throws Exception {
		// TODO Auto-generated method stub
		 MessageProperties messageProperties = message.getMessageProperties(); 
		 System.out.println("msg:"+new String(message.getBody(),"utf-8"));
		 ValidatorFactory factory = Validation.buildDefaultValidatorFactory(); 
		 Validator  validator = factory.getValidator();
		 
		 try{
			 
			    ScmSupplierSkuinfoFromWMS scmSupplierSkuinfoFromWMS =  JSON.parseObject(new String(message.getBody(),"utf-8"),ScmSupplierSkuinfoFromWMS.class);
				ScmSupplierSkuinfo scmSupplierSkuinfo =  new ScmSupplierSkuinfo();
				scmSupplierSkuinfo.setProductid(scmSupplierSkuinfoFromWMS.getProductid());
				scmSupplierSkuinfo.setProductversion(scmSupplierSkuinfoFromWMS.getProductversion());
				scmSupplierSkuinfo.setProductname(scmSupplierSkuinfoFromWMS.getSkuname());
				scmSupplierSkuinfo.setColorclasscode(scmSupplierSkuinfoFromWMS.getColourclass());
				scmSupplierSkuinfo.setColorcode(scmSupplierSkuinfoFromWMS.getColourcode());
				scmSupplierSkuinfo.setStyleclasscode(scmSupplierSkuinfoFromWMS.getStyleclass());
				scmSupplierSkuinfo.setStylecode(scmSupplierSkuinfoFromWMS.getStylecode());
				scmSupplierSkuinfo.setColorvalue(scmSupplierSkuinfoFromWMS.getColourvalue());
				scmSupplierSkuinfo.setStylevalue(scmSupplierSkuinfoFromWMS.getStylevalue());
				scmSupplierSkuinfo.setProductskucode(scmSupplierSkuinfoFromWMS.getSkuid());
				scmSupplierSkuinfo.setSupplierid(scmSupplierSkuinfoFromWMS.getSupplierid());
				scmSupplierSkuinfo.setRemark(scmSupplierSkuinfoFromWMS.getSkudesc());
				scmSupplierSkuinfo.setRecordcreatedtime(scmSupplierSkuinfoFromWMS.getRecordcreatedtime());
				scmSupplierSkuinfo.setRecordstatus(scmSupplierSkuinfoFromWMS.getRecordstatus());
			 
				Set<ConstraintViolation<ScmSupplierSkuinfo>> constraintViolations =validator.validate(scmSupplierSkuinfo);  //针对揽收头信息进行验证
				for(ConstraintViolation<ScmSupplierSkuinfo> constraintViolation : constraintViolations) {
				       logger.info("字段异常:"+constraintViolation.getPropertyPath()+constraintViolation.getMessage()+",json msg:"+new String(message.getBody(),"utf-8"));
				    }
				
				if(constraintViolations.size()==0){
					scmSupplierSkuinfo.setCreateBy(new User("1"));
					scmSupplierSkuinfo.setRecordcreatedby("1");
					Calendar calendarNow = Calendar.getInstance();
					calendarNow.add(Calendar.MINUTE, +2);  //2分钟后防止读未提交
					Date date = calendarNow.getTime();
					scmSupplierSkuinfo.setRecordcreatedtime(date);
					
					//首先判断是否已存在
					ScmSupplierSkuinfo TempscmSupplierSkuinfo  = new ScmSupplierSkuinfo();
					TempscmSupplierSkuinfo.setProductskucode(scmSupplierSkuinfo.getProductskucode());
					List<ScmSupplierSkuinfo> tempScmSupplierSkuinfoList =  this.scmSupplierSkuinfoService.findList(TempscmSupplierSkuinfo);
					if((null!=tempScmSupplierSkuinfoList)&&(tempScmSupplierSkuinfoList.size()>0)){
						scmSupplierSkuinfo.setId(tempScmSupplierSkuinfoList.get(0).getId());
						scmSupplierSkuinfo.setIsNewRecord(false);
					}
					scmSupplierSkuinfoService.save(scmSupplierSkuinfo);
					
				channel.basicAck(messageProperties.getDeliveryTag(), false);  //发回应答
				}
			
			}catch(JSONException  json){ 
				logger.info("json生成对象异常1,json msg:"+new String(message.getBody(),"utf-8"));
				channel.basicAck(messageProperties.getDeliveryTag(), false);  //发回应答
				json.printStackTrace();
			}
	}

}
