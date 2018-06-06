package com.best1.api.client.oaf;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.best1.api.webservice.soap.oaf.CustomerOrderSoapService;
import com.best1.api.webservice.soap.response.result.oaf.CustomerOrderInfoResult;

@WebServlet("/FailureCustomerShipOrderServlet")
public class FailureCustomerShipOrderServlet extends HttpServlet{
	
	private static final Logger logger = LoggerFactory.getLogger(FailureCustomerShipOrderServlet.class);
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("FailureCustomerShipOrder testing begin");
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.setServiceClass(CustomerOrderSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/oaf/customerorderservice");
		
		CustomerOrderSoapService customerOrderService = (CustomerOrderSoapService) factory.create();
		
		Long orderid = 2368058L;
		Integer itemid = 1;
		Long createdby = 30364L;
		
		CustomerOrderInfoResult result = customerOrderService.failureCustomerShipOrder(orderid, itemid, createdby);
		
		System.out.println(result);
		logger.info("FailureCustomerShipOrder testing end");
		
	}
	
}
