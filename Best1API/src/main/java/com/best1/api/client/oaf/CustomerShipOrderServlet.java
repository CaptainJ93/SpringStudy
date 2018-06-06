package com.best1.api.client.oaf;

import java.io.IOException;

import javax.jws.WebParam;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.best1.api.utils.APIConstant;
import com.best1.api.webservice.soap.oaf.CustomerOrderSoapService;
import com.best1.api.webservice.soap.response.result.oaf.CustomerOrderInfoResult;
import com.best1.api.webservice.soap.response.result.oaf.CustomerOrdersInfoResult;

@WebServlet("/CustomerShipOrderServlet")
public class CustomerShipOrderServlet extends HttpServlet{
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerShipOrderServlet.class);
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("CustomerShipOrder testing begin");
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.setServiceClass(CustomerOrderSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/oaf/customerorderservice");
		
		CustomerOrderSoapService customerOrderService = (CustomerOrderSoapService) factory.create();
		
		Long orderid = 699532L;
		Integer itemid = 3;
		Long createdby = 500000202L;
		String reasoncode = "10";
		String remarks = "R01 主商品缺货";
		
		CustomerOrderInfoResult result = customerOrderService.reasonInfo(orderid, itemid, remarks, createdby, reasoncode);
		
		System.out.println("result------------->" + result);
		logger.info("CustomerShipOrder testing end");
		
	}
	
}
