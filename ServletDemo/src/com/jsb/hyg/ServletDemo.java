package com.jsb.hyg;
import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletDemo implements Servlet {

	/**
	 * ִ��ʱ����Servlet��������ʱ���ã�ɨβ������
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Servlet destroyed!");
	}

	/**
	 * ��ȡServletConfig���ö���
	 */
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * ��ȡ��ǰServlet��һЩ������Ϣ
	 */
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * ִ��ʱ����Servlet����ʵ����ʱ����ʼ������
	 * ServletConfig��Servlet�����ö��������ڳ�ʼ��ʱ��Servlet��������
	 */
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Servlet created!");
	}

	/**
	 * ִ��ʱ������һ��Servlet������ʱִ��
	 * ��������Servletҵ���߼�������Ӧ���ظ������
	 */
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getOutputStream().write("<font color='red'>Hello!</font>".getBytes());
	}

}
