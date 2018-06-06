package com.best1.api.mq.weixin.service;

import java.util.List;

import com.best1.api.entity.cmn.SmsSend;
import com.best1.api.entity.oaf.order.CustomerOrderPayment;
import com.best1.api.webservice.soap.response.dto.crm.CustomermessageDTO;

public interface SmsManageSerevice {

public List<SmsSend>  smsMessage(SmsSend sms );

public List<CustomerOrderPayment> customerOrderPay(Long customerid,Long orderid);

public CustomermessageDTO sendAdSms(CustomermessageDTO dto);

}
