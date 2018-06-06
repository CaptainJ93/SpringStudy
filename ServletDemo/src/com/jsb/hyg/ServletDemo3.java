package com.jsb.hyg;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletDemo3
 */
@WebServlet("/ServletDemo3")
public class ServletDemo3 extends HttpServlet {
	
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		ServletContext sc = config.getServletContext();
		String a = sc.getInitParameter("global_param");
		System.out.println(a);
//		String username = config.getInitParameter("username");
//		System.out.println(username);
//	
//		Enumeration enums = config.getInitParameterNames();
//		while(enums.hasMoreElements()){
//			String name = (String)enums.nextElement();
//			String value = config.getInitParameter(name);
//			System.out.println(name);
//		}
	}

}
