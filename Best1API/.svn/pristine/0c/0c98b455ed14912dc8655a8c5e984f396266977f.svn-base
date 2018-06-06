package com.best1.integration.activator;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import com.best1.api.entity.crm.TcrmCustomermessage;
import com.best1.api.mq.rabbit.MQProducer;
import com.best1.api.mq.weixin.client.MsgSend;
import com.best1.api.utils.APIConstant;
import com.best1.api.utils.bean.BeanMapper;

@Component
public class MessageHandler {
	@Autowired
	private MsgSend msgsend;
	@Autowired
	private MQProducer mqsend;
	
	
	@ServiceActivator
	public void handlerMessage(List<Map<String, Object>> messages) {

		List<TcrmCustomermessage> customermessages = BeanMapper.mapList(
				messages, TcrmCustomermessage.class);
		
		//1000:微信支付通知，1001支付宝支付通知，2000通知短信,2001三网合一，2002群发广告,2003企业微信,2004批次短信(订购、出货、退货、客诉等) ,3000 短信支付通知,微信支付,3001 短信支付通知,支付宝
		for (TcrmCustomermessage message : customermessages) {

			if (message.getMessagetype() == APIConstant.MESSAGE_TYPE_WEIXINPAY) {
				// 微信支付通知
				msgsend.sendCustomerTemplatemessage(message);
			}

			if (message.getMessagetype() == APIConstant.MESSAGE_TYPE_NOTICESMS) {
				// 通知短信
				mqsend.sendDataToQueue("MESSAGE_SMS_SEND_KEY", message);
			}
		
			if (message.getMessagetype() == APIConstant.MESSAGE_TYPE_VALIDATE_MASSSMS) {
				// 验证码短信
				mqsend.sendDataToQueue("MESSAGE_SMS_SEND_KEY", message);
			}
			
			if (message.getMessagetype() == APIConstant.MESSAGE_TYPE_AD_MASSSMS) {
				// 广告短信
				mqsend.sendDataToQueue("MESSAGE_SMS_SEND_KEY", message);
			}
			
			if (message.getMessagetype() == APIConstant.MESSAGE_TYPE_WEIXINQYSMS) {
				// 微信企业短信
		    	msgsend.sendTexCustomermessage(message);
			}
					
			if (message.getMessagetype() == APIConstant.MESSAGE_TYPE_BATCH_MASSSMS) {
				// 批次短信
				mqsend.sendDataToQueue("MESSAGE_SMS_SEND_KEY", message);
			}
			
			if (message.getMessagetype() == APIConstant.MESSAGE_TYPE_SMS_WEIXINPAY) {
				//短信支付通知,微信支付
				msgsend.sendCustomerSmsPay(message);
			}
			
			if (message.getMessagetype() == APIConstant.MESSAGE_TYPE_SMS_ALIPAY) {
				//短信支付通知,支付宝
			msgsend.sendCustomerSmsPay(message);
			}
		}
	}
}
