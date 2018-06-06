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

import com.best1.api.utils.SCMConstant;
import com.best1.api.webservice.soap.scm.ProductSoapService;

/**
 * 示范：spm商品说明导入
 */
@WebServlet("/SpmProductGeneralImportServlet")
@Transactional
public class SpmProductGeneralImportServlet extends HttpServlet {

	final static Logger LOG = LoggerFactory
			.getLogger(SpmProductGeneralImportServlet.class);

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

		Integer generalinfocode = SCMConstant.SCM_PROD_GENERAL_USAGE;
		String comments = "主商品33";
		String commenttype = "S";
		service.productgeneralsSpmImport(productid, generalinfocode, comments,
				commenttype, createdby);
		comments = "主商品44";
		service.productgeneralsSpmImport(productid, generalinfocode, comments,
				commenttype, createdby);

		generalinfocode = SCMConstant.SCM_PROD_GENERAL_ATTENTION;
		comments = "注意事项33";
		service.productgeneralsSpmImport(productid, generalinfocode, comments,
				commenttype, createdby);
		comments = "注意事项44";
		service.productgeneralsSpmImport(productid, generalinfocode, comments,
				commenttype, createdby);

		comments = "操作说明33";
		generalinfocode = SCMConstant.SCM_PROD_GENERAL_DESCRIPTION;
		service.productgeneralsSpmImport(productid, generalinfocode, comments,
				commenttype, createdby);
		comments = "操作说明44";
		service.productgeneralsSpmImport(productid, generalinfocode, comments,
				commenttype, createdby);

		comments = "销售企划33";
		generalinfocode = SCMConstant.SCM_PROD_GENERAL_FEATURES;
		service.productgeneralsSpmImport(productid, generalinfocode, comments,
				commenttype, createdby);
		comments = "销售企划44";
		service.productgeneralsSpmImport(productid, generalinfocode, comments,
				commenttype, createdby);

		comments = "赠品规格说明33";
		generalinfocode = SCMConstant.SCM_PROD_GENERAL_GIFT;
		service.productgeneralsSpmImport(productid, generalinfocode, comments,
				commenttype, createdby);
		comments = "赠品规格说明44";
		service.productgeneralsSpmImport(productid, generalinfocode, comments,
				commenttype, createdby);

		comments = "装箱明细33";
		generalinfocode = SCMConstant.SCM_PROD_GENERAL_ACCESSORIES;
		service.productgeneralsSpmImport(productid, generalinfocode, comments,
				commenttype, createdby);
		comments = "装箱明细44";
		service.productgeneralsSpmImport(productid, generalinfocode, comments,
				commenttype, createdby);

		LOG.info("end");
	}
}