package com.best1.api.client.scm.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.webservice.soap.scm.ProductSoapService;

/**
 * 商品资料
 */
@WebServlet("/ProductInfoServlet")
@Transactional
public class ProductInfoServlet extends HttpServlet {

	private static final long serialVersionUID = 3920583433735414561L;

	final static Logger LOG = LoggerFactory.getLogger(ProductInfoServlet.class);

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		LOG.info("start");

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(ProductSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/scm/productservice");
		ProductSoapService service = (ProductSoapService) factory.create();

		String prdid = request.getParameter("productid");
		Long productid = null;
		if (prdid != null) {
			productid = Long.valueOf(prdid);
		}
		service.queryproductInfo(productid == null ? 110888L : productid, 1);

		LOG.info("end");
	}
}