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
@WebServlet("/UpdateProductColourStyleByCommissionServlet")
@Transactional
public class UpdateProductColourStyleByCommissionServlet extends HttpServlet {

	private static final long serialVersionUID = -1774889584611360035L;

	final static Logger LOG = LoggerFactory
			.getLogger(UpdateProductColourStyleByCommissionServlet.class);

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		LOG.info("start");

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(ProductSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/scm/productservice");
		ProductSoapService service = (ProductSoapService) factory.create();

		Long productid = 111550L;// 商品代码
		Long lastmodifiedby = 30863L;// 修改人
		Integer colourcode = 5061;
		Integer colourclass = 5006;
		Integer stylecode = 5172;
		Integer styleclass = 5016;
		String forsale = "Y";
		Long quantity = null;
		service.changeProductColourStyleByCommission(productid, colourcode,
				colourclass, stylecode, styleclass, lastmodifiedby, forsale,
				quantity);

		LOG.info("end");
	}
}