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

@WebServlet("/ReasonInfoServlet")
public class ReasonInfoServlet extends HttpServlet{
	
	private static final Logger logger = LoggerFactory.getLogger(ReasonInfoServlet.class);
	
	private static final long serialVersionUID = 7658789705793894925L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("ReasonInfo testing begin");
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.setServiceClass(CustomerOrderSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/oaf/customerorderservice");
		
		CustomerOrderSoapService customerOrderService = (CustomerOrderSoapService) factory.create();
		
		Long orderid = 301582L;
		Integer itemid = 1;
		Long createdby = 30364L;
		String remarks = "R01联络不上客户";
		String reasoncode = "10";
		
		CustomerOrderInfoResult result = customerOrderService.returnReasonInfo(orderid, itemid, createdby, remarks, reasoncode);
		
		System.out.println(result);
		logger.info("ReasonInfo testing end");
		
	}
	
}
