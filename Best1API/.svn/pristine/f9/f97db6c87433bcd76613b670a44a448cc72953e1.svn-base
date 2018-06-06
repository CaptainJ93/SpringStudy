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
public class JdbcMessageHandler {  
	
	@Autowired
	private MsgSend msgsend;
  //@ServiceActivator  
    public void handleJdbcMessage(List<Map<String ,Object>> message){  
       List<TcrmCustomermessage> customermessages=BeanMapper.mapList(message, TcrmCustomermessage.class);
    		   //new ArrayList<TcrmCustomermessage>();
        
      if(customermessages!=null)
    	  {
    	  //msgsend.sendTexCustomermessage(customermessages);
    	  
    	  }
     
       /**for(Map<String,Object> resultMap:message){  
            System.out.println("======processing message map====");  
            for(String column:resultMap.keySet()){  
                System.out.println("===field:"+column+"  value:"+resultMap.get(column));  
            }  
        }  
        System.out.println("=============================JdbcMessageHandler ending====");
        **/
    }  
}  