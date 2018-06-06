package com.best1.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.best1.base.DataModel;

public class AuthorityFilter implements Filter {
	// FilterConfig可用于访问Filter的配置信息
	private FilterConfig config;

	// 实现初始化方法
	public void init(FilterConfig config) {
		this.config = config;
	}

	// 实现销毁方法
	public void destroy() {
		this.config = null;
	}

	// 执行过滤的核心方法
	public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {
		// 获取该Filter的配置参数
		String loginPage = config.getInitParameter("loginPage");
		String loginAction = config.getInitParameter("loginAction");
		// 设置request编码用的字符集
		HttpServletRequest requ = (HttpServletRequest) request;
		HttpSession session = requ.getSession(true);
		// 获取客户请求的页面
		String requestPath = requ.getServletPath();
		String contextPath = requ.getContextPath();
		// 如果session范围的user为null，即表明没有登录
		// 且用户请求的既不是登录页面
		if (session.getAttribute("user") == null
				&&((requestPath.endsWith(".jsp")&&!requestPath.endsWith(loginPage))
						||((requestPath.endsWith(".action")&&!requestPath.endsWith(loginAction))))) {
			HttpServletResponse resp = (HttpServletResponse)response;
			if(requestPath.endsWith(".jsp")){
				resp.sendRedirect(requ.getContextPath() + "/"+ "index.jsp");
			}else{
				resp.setStatus(303);
				requ.getRequestDispatcher(loginPage).forward(requ, resp);
			}
		}
		// “放行”请求
		else {
			chain.doFilter(request, response);
		}
	}
}
