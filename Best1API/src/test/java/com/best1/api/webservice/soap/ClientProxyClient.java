package com.best1.api.webservice.soap;


import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;  

import com.best1.api.webservice.soap.crm.CustomerSoapService;
import com.best1.api.webservice.soap.response.result.crm.CustomerResult;
  
public class ClientProxyClient {  
  
    public static void main(String args[]) throws Exception {  
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();  
        factory.setServiceClass(CustomerSoapService.class);  
        factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/soap/customerservice");  
        CustomerSoapService service = (CustomerSoapService)factory.create();  
  
       /** Order order = new Order();  
        order.setCustomerID("C001");  
        order.setItemID("I001");  
        order.setPrice(100.00);  
        order.setQty(20);  
  */
        Long id=20011L;
        CustomerResult result = service.queryCustomer(id) ;
        System.out.println("The order ID is " + result.getCode() +" "+ result.getMessage());  
          
    }  
      
}  