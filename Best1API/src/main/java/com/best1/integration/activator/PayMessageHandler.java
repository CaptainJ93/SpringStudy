package com.best1.integration.activator;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import com.best1.api.entity.crm.TcrmCustomermessage;
import com.best1.api.mq.weixin.client.MsgSend;
import com.best1.api.utils.bean.BeanMapper;

//@Component  
public class PayMessageHandler {

	@Autowired
	private MsgSend msgsend;
   // @ServiceActivator  
    public void handleJdbcMessage(List<Map<String ,Object>> message){  
       List<TcrmCustomermessage> customermessages=BeanMapper.mapList(message, TcrmCustomermessage.class);
    		   //new ArrayList<TcrmCustomermessage>();
        
      if(customermessages!=null)
    	  {msgsend.sendCustomerTemplatemessage(customermessages);
    	  
    	  }
   
    }  
}
