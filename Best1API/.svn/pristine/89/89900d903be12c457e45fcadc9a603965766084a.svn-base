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

@WebServlet("/ConfirmCustomerShipOrderServlet")
public class ConfirmCustomerShipOrderServlet extends HttpServlet{
	
	private static final Logger logger = LoggerFactory.getLogger(ConfirmCustomerShipOrderServlet.class);
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("ConfirmCustomerShipOrder testing begin");
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.setServiceClass(CustomerOrderSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/oaf/customerorderservice");
		
		CustomerOrderSoapService customerOrderService = (CustomerOrderSoapService) factory.create();
		
		Long orderid = 2726724L;
		Integer itemid = null;
		Long createdby = 500000202L;
		Long customerid=null;
		String transferaccno="888888";
		customerOrderService.queryCustomerOrderPay(orderid, itemid, customerid, transferaccno);
	//	CustomerOrderInfoResult result = customerOrderService.confirmCustomerShipOrder(orderid, itemid, createdby);
		
		//System.out.println(result);
		logger.info("ConfirmCustomerShipOrder testing end");
		
	}
	
}
