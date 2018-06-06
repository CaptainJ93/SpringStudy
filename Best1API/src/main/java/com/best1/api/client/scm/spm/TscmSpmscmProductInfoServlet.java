package com.best1.api.client.scm.spm;

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
 * 示范：获取spm商品储存后的商品ID
 */
@WebServlet("/TscmSpmscmProductInfoServlet")
@Transactional
public class TscmSpmscmProductInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 337902741728388332L;

	final static Logger LOG = LoggerFactory
			.getLogger(TscmSpmscmProductInfoServlet.class);

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		LOG.info("hello");

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(ProductSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/scm/productservice");
		ProductSoapService service = (ProductSoapService) factory.create();

		Long spmProductId = 1080l;// spm商品代码

		service.queryScmProductId(spmProductId);

		LOG.info("end");
	}
}