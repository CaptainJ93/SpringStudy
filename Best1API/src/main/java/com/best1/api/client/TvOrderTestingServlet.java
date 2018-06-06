package com.best1.api.client;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
import com.best1.api.utils.SCMConstant;
import com.best1.api.webservice.soap.chm.PgmSoapService;
import com.best1.api.webservice.soap.crm.CustomerSoapService;
import com.best1.api.webservice.soap.oaf.CustomerOrderSoapService;
import com.best1.api.webservice.soap.response.dto.scm.WebSendProductImage;
import com.best1.api.webservice.soap.response.result.crm.CustomerAddressResult;
import com.best1.api.webservice.soap.response.result.crm.CustomerResult;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.best1.api.webservice.soap.crm.CustomerSoapService;
import com.best1.api.webservice.soap.response.result.crm.CustomerResult;
import com.best1.api.webservice.soap.response.result.oaf.OrderResult;
import com.best1.api.webservice.soap.response.result.scm.SpmProductResult;
import com.best1.api.webservice.soap.scm.ProductSoapService;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/TvOrderTestingServlet")
public class TvOrderTestingServlet extends HttpServlet {

	final static Logger LOG = LoggerFactory.getLogger(FirstServlet.class);

	private static final long serialVersionUID = 6833688147345340845L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		LOG.info("hello");
		PrintWriter out = response.getWriter();
		// Long productid = 110880L;
		// Integer colourcode = 5044;
		// Integer stylecode = 5172;
		/****
		 * private String candidateName; private String imageFileType;
		 */
		Integer days = 10;
		Long subchannelid = 4L;
		WebSendProductImage image = new WebSendProductImage();
		image.setProductid(110880l);
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.setServiceClass(CustomerOrderSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/oaf/customerorderservice");

		CustomerOrderSoapService server = (CustomerOrderSoapService) factory.create();
		Long orderid=2726209L;
		Integer itemid=1;
		Long customerid=20011L;
		Double paymentamount=2488D;
		String payername="胡文华";
		String receiptno="999991";
		String transferaccno="999991";
		Long createdby=30384L;
		//server.queryCustomerOrderPay(orderid, itemid, customerid);
		server.postCustomerOrderPay(orderid, paymentamount, customerid, payername, receiptno, transferaccno, createdby);
		orderid=2404223L;
		paymentamount=2000D;
		
		//server.postCustomerOrderPay(orderid, paymentamount, customerid, payername, receiptno, transferaccno, createdby);
	}
	
	private String erpServer(String erpurl) {
		String strl = "";
		String str = null;
		try {
			URL url = new URL(erpurl);

			InputStreamReader isr;

			isr = new InputStreamReader(url.openStream());

			BufferedReader br = new BufferedReader(isr);

	
			while ((str = br.readLine()) != null) {
				strl += str;
			}

			br.close();
			isr.close();
			return strl;

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}
		return strl;
	}
	
}