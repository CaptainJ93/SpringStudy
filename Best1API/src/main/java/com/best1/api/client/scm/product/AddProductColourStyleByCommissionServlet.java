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
@WebServlet("/AddProductColourStyleByCommissionServlet")
@Transactional
public class AddProductColourStyleByCommissionServlet extends HttpServlet {

	private static final long serialVersionUID = 3920583433735414561L;

	final static Logger LOG = LoggerFactory
			.getLogger(AddProductColourStyleByCommissionServlet.class);

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		LOG.info("start");

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(ProductSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/scm/productservice");
		ProductSoapService service = (ProductSoapService) factory.create();

		Long productid = 111550L;// 商品代码
		Long createdby = 30863L;// 创建人
		Integer colourcode = 5068;
		Integer colourclass = 5006;
		Integer stylecode = 5172;
		Integer styleclass = 5016;
		String forsale = "Y";
		Long quantity = null;// 默认900000
		service.addProductColourStyleByCommission(productid, colourcode,
				colourclass, stylecode, styleclass, createdby, forsale,
				quantity);

		LOG.info("end");
	}
}