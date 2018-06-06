package com.best1.api.client.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.best1.api.webservice.soap.response.result.view.SupplierShipOrderViewResult;
import com.best1.api.webservice.soap.view.SupplierShipOrderViewSoapService;

@WebServlet("/SupplierShipOrderViewServlet")
public class SupplierShipOrderViewServlet extends HttpServlet {
	private static final long serialVersionUID = -3751908675068455128L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(SupplierShipOrderViewSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/view/supplierShipOrderService");
		SupplierShipOrderViewSoapService service = (SupplierShipOrderViewSoapService) factory
				.create();
		SupplierShipOrderViewResult result = service.supplierShipOrderViewList(
				34471l, "20140101", "20160101");
		out.print(result.getCode() + " - "
				+ result.getSupplierShipOrderViews().size());

	}
}
