package com.jsb.hyg;
import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletDemo implements Servlet {

	/**
	 * 执行时机：Servlet对象被销毁时调用，扫尾清理工作
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Servlet destroyed!");
	}

	/**
	 * 获取ServletConfig配置对象
	 */
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 获取当前Servlet的一些属性信息
	 */
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 执行时机：Servlet对象被实例化时，初始化工作
	 * ServletConfig是Servlet的配置对象，用来在初始化时对Servlet进行配置
	 */
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Servlet created!");
	}

	/**
	 * 执行时机：当一个Servlet被调用时执行
	 * 用来处理Servlet业务逻辑并把响应返回给浏览器
	 */
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getOutputStream().write("<font color='red'>Hello!</font>".getBytes());
	}

}
