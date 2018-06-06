package com.best1.api.client.scm.spm;

import java.io.File;
import java.io.IOException;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.webservice.soap.response.dto.scm.WebSendProductImage;
import com.best1.api.webservice.soap.scm.ProductSoapService;

/**
 * 示范：spm商品图片导入
 */
@WebServlet("/SpmProductImageImportServlet")
@Transactional
public class SpmProductImageImportServlet extends HttpServlet {

	final static Logger LOG = LoggerFactory
			.getLogger(SpmProductImageImportServlet.class);

	private static final long serialVersionUID = 6833688147345340845L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		LOG.info("hello");

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(ProductSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/scm/productservice");
		ProductSoapService service = (ProductSoapService) factory.create();

		Long productid = 1330l;
		Long createdby = 30863L;

		WebSendProductImage prdimage = null;
		for (int i = 1; i < 7; i++) {
			prdimage = new WebSendProductImage();
			prdimage.setFilepath("F:/photo/图" + i + ".jpg");
			// prdimage.setCandidateName(productid + "_img_" + i);
			// prdimage.setImageFileType("jpg");
			prdimage.setSpmproductid(productid);
			prdimage.setImagedescrption("图片" + i + ".jpg");
			prdimage.setCreatedby(createdby);
			prdimage.setImagefile(new DataHandler(new FileDataSource(new File(
					prdimage.getFilepath()))));
			service.productimageSpmImport(prdimage);
		}
		LOG.info("end");
	}
}