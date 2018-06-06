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
 * Servlet implementation class FirstServlet
 */
@WebServlet("/AddProductGeneralByCommissionServlet")
@Transactional
public class AddProductGeneralByCommissionServlet extends HttpServlet {

	private static final long serialVersionUID = -6709361598000046603L;

	final static Logger LOG = LoggerFactory
			.getLogger(AddProductGeneralByCommissionServlet.class);

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		LOG.info("start");

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(ProductSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/scm/productservice");
		ProductSoapService service = (ProductSoapService) factory.create();

		Long productid = 111550L;// 商品代码
		String comments = "主商品规格说明";
		String commenttype = null;
		Long createdby = 30863L;

		service.addProductGeneralByCommission(productid, comments, commenttype,
				createdby);

		LOG.info("end");
	}
}