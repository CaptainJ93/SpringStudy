package com.best1.api.client.chm;

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

import com.best1.api.webservice.soap.chm.PgmSoapService;

/**
 * 上架
 */
@WebServlet("/WebProductSelectionServlet")
@Transactional
public class WebProductSelectionServlet extends HttpServlet {

	private static final long serialVersionUID = 2440891071879865027L;

	final static Logger LOG = LoggerFactory
			.getLogger(WebProductSelectionServlet.class);

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		LOG.info("start");

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(PgmSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/chm/pgmservice");
		PgmSoapService service = (PgmSoapService) factory.create();
		Long productid = 100851L;
		Long createdby = 30863L;
		Integer colourcode = 5039;
		Integer colourclass = 5002;
		Integer stylecode = 5172;
		Integer styleclass = 5016;
		String starttime = "2011-10-28 00:00:00";
		String endtime="2016-08-15 00:00:00";
		Long subchannelid = 4L;
		Integer plannedquantity = 9999;
		Long nfmpgmscheduleid=37L;
		String fathertapename="123456";
		String childtapename="12345601";
		String tapename="Do IT";

		/**service.webProductSelection(productid, createdby,
				colourcode, colourclass, stylecode, styleclass, starttime,
				subchannelid, plannedquantity);**/
		//service.queryProgramdetails(subchannelid,starttime, endtime);
		service.createTape(nfmpgmscheduleid, subchannelid, tapename,productid, fathertapename, childtapename, createdby);
		LOG.info("end");
	}
}