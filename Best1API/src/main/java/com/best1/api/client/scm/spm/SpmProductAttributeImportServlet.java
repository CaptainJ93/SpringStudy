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
 * 示范：spm商品属性导入
 */
@WebServlet("/SpmProductAttributeImportServlet")
@Transactional
public class SpmProductAttributeImportServlet extends HttpServlet {

	final static Logger LOG = LoggerFactory
			.getLogger(SpmProductAttributeImportServlet.class);

	private static final long serialVersionUID = 6833688147345340845L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		LOG.info("hello");

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.setServiceClass(ProductSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/scm/productservice");
		ProductSoapService service = (ProductSoapService) factory.create();

		Long productid = 1215L;
		Long createdby = 30863L;
		Integer attributecategoryid = 1005;
		Integer attributevalue = 2025;
		service.productattributeSpmImport(productid, attributecategoryid,
				attributevalue, createdby);
	}
}