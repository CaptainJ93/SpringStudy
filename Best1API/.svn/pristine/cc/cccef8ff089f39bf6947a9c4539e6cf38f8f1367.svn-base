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
 * 示范：spm商品颜色款式导入
 */
@WebServlet("/SpmProductColourStyleImportServlet")
@Transactional
public class SpmProductColourStyleImportServlet extends HttpServlet {
	private static final long serialVersionUID = -4054620886863959842L;
	final static Logger LOG = LoggerFactory
			.getLogger(SpmProductColourStyleImportServlet.class);

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		LOG.info("hello");

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.setServiceClass(ProductSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/scm/productservice");
		ProductSoapService service = (ProductSoapService) factory.create();

		Long productid = 1215L;
		Integer colourcode = 5207;// 颜色代码
		Integer colourclass = 5002;// 颜色分类
		Integer stylecode = 5172;// 款式代码
		Integer styleclass = 5016;// 款式分类
		String forsale = "Y";
		Long quantity = 88888l;
		Long createdby = 30863L;

		service.productcolourstyleSpmImport(productid, colourcode, colourclass,
				stylecode, styleclass, createdby, forsale, quantity);

		LOG.info("end");
	}
}