package com.best1.api.client.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.best1.api.webservice.soap.response.result.view.ReturnOrderViewResult;
import com.best1.api.webservice.soap.view.ReturnOrderViewSoapService;

@WebServlet("/ReturnOrderViewServlet")
public class ReturnOrderViewServlet extends HttpServlet {
	private static final long serialVersionUID = -1461266190606842590L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(ReturnOrderViewSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/view/returnOrderService");
		ReturnOrderViewSoapService service = (ReturnOrderViewSoapService) factory
				.create();
		ReturnOrderViewResult result = service.returnOrderViewList(0l,
				"20170901", "20170903");
		out.print(result.getCode() + " - "
				+ result.getReturnOrderViewDTOs().size());

	}
}
