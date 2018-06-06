package com.best1.api.client.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.best1.api.webservice.soap.response.result.view.ReturnToVenderViewResult;
import com.best1.api.webservice.soap.view.ReturnToVenderViewSoapService;

@WebServlet("/ReturnToVenderViewServlet")
public class ReturnToVenderViewServlet extends HttpServlet {

	private static final long serialVersionUID = -9123608187961707486L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(ReturnToVenderViewSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/view/returnToVenderService");
		ReturnToVenderViewSoapService service = (ReturnToVenderViewSoapService) factory
				.create();
		ReturnToVenderViewResult result = service.returnToVenderViewList(
				16428l, "20131228", "20160101");
		out.print(result.getCode() + " - "
				+ result.getReturnToVenderViews().size());

	}
}
