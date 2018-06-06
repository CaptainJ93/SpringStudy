package com.best1.api.client.scm.supplier;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.best1.api.webservice.soap.response.result.scm.SuppliercontractsResult;
import com.best1.api.webservice.soap.scm.SupplierSoapService;

@WebServlet("/TscmSuppliercontractServlet")
public class TscmSuppliercontractServlet extends HttpServlet{
	
	private static final Logger logger = LoggerFactory.getLogger(TscmSuppliercontractServlet.class);
	
	private static final long serialVersionUID = -7244092686491739596L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("TscmSuppliercontract testing begin");
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.setServiceClass(SupplierSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/scm/supplierservice");
		
		SupplierSoapService supplierSoapService =  (SupplierSoapService) factory.create();
		
		Long supplierid = 140L;
	    SuppliercontractsResult result = supplierSoapService.supplierContractInfo(supplierid);
		
		System.out.println(result);
		logger.info("TscmSuppliercontract testing end");
		
	}
	
}
