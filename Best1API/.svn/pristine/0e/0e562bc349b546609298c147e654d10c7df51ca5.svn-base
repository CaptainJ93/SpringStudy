package com.best1.api.client.scm.supplier;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.best1.api.webservice.soap.response.result.scm.SuppliermastersResult;
import com.best1.api.webservice.soap.scm.SupplierSoapService;

@WebServlet("/SuppliermastersServlet")
public class SuppliermastersServlet extends HttpServlet{
	
	private static final Logger logger = LoggerFactory.getLogger(SuppliermastersServlet.class);
	
	private static final long serialVersionUID = 2782715322704067659L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.info("Suppliermasters testing begin");
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.setServiceClass(SupplierSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/scm/supplierservice");
		
		SupplierSoapService supplierSoapService =  (SupplierSoapService) factory.create();
		
		Date createdtimestamp = null;
		try {
			createdtimestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).parse("2006-12-25 14:24:15");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		SuppliermastersResult result = supplierSoapService.supplierMasterInfos(createdtimestamp);
		
		System.out.println(result);
		logger.info("Suppliermasters testing end");
		
	}
	
}
