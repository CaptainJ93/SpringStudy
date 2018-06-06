package com.best1.api.client.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.best1.api.webservice.soap.response.result.view.OrderPaymentViewResult;
import com.best1.api.webservice.soap.view.OrderPaymentViewSoapService;

@WebServlet("/OrderPaymentViewServlet")
public class OrderPaymentViewServlet extends HttpServlet {
	private static final long serialVersionUID = 3645927782107842565L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(OrderPaymentViewSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/view/orderPaymentService");
		OrderPaymentViewSoapService service = (OrderPaymentViewSoapService) factory
				.create();
		OrderPaymentViewResult result = service.orderPaymentViewList(379l, 1);
		out.print(result.getCode() + " - "
				+ result.getOrderPaymentViewDTOs().size());

	}
}
