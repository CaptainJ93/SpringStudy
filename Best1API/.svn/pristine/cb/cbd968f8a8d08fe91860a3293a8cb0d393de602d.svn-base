package com.best1.api.client.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.best1.api.webservice.soap.response.result.view.OrderedProductViewResult;
import com.best1.api.webservice.soap.view.OrderedProductViewSoapService;

@WebServlet("/OrderedProductViewServlet")
public class OrderedProductViewServlet extends HttpServlet {
	private static final long serialVersionUID = -793516760837447002L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(OrderedProductViewSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/view/orderservice");
		OrderedProductViewSoapService service = (OrderedProductViewSoapService) factory
				.create();
		OrderedProductViewResult result = service.orderedProductViewList(
				null, null, "20161130", "20161201");
		out.print(result.getCode() + " - "
				+ result.getOrderedProductViews().size());

	}
}
