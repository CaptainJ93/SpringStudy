package com.best1.api.client.oaf;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.entity.oaf.order.CustomerOrderInfo;
import com.best1.api.utils.IOAFDomainConstants;
import com.best1.api.utils.PropertiesLoader;
import com.best1.api.webservice.soap.oaf.CustomerOrderSoapService;
import com.best1.api.webservice.soap.response.dto.oaf.CustomerOrderInfoDTO;
import com.best1.api.webservice.soap.response.result.oaf.CustomerOrderInfoResult;

/**
 * 出货确认
 */
@WebServlet("/ShipConfirmServlet")
@Transactional
public class ShipConfirmServlet extends HttpServlet {

	private static final long serialVersionUID = -1554943400839342796L;

	final static Logger LOG = LoggerFactory.getLogger(ShipConfirmServlet.class);

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		LOG.info("hello");

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(CustomerOrderSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/oaf/customerorderservice");
		CustomerOrderSoapService service = (CustomerOrderSoapService) factory
				.create();

		Long orderid = 2361688l;
		
		Integer itemid = 1;
		String deliveryorderid = "ZJ2367294DS";
		Long selectedcarrier = 1000032L;
		Long createdby = 30364L;
		String actualshippeddate = "2014-10-29 18:25:10";

		service.shipConfirm(orderid, itemid, deliveryorderid, selectedcarrier,
				createdby, actualshippeddate);

		LOG.info("return end");
	}
}