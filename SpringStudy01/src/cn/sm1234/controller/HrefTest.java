package cn.sm1234.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hreftest")
public class HrefTest {
	
	@RequestMapping("/test1")
	public void test1(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws ServletException, IOException{
		System.out.println("123");
		//转发
//		request.getRequestDispatcher("/WEB-INF/jsp/success.jsp").forward(request, response);
		//重定向	不能重定向到WEB-INF，只能到webroot下的WEB-INF以外的页面
		response.sendRedirect(request.getContextPath()+"/index.jsp");
	}
	
	@RequestMapping("/test2")
	public ModelAndView test2(){
		System.out.println("1234");
		ModelAndView mv = new ModelAndView();
		//此处可配置视图解析器
		mv.setViewName("/WEB-INF/jsp/success.jsp");
//		return mv;
		//或直接new的时候传入视图名
		ModelAndView mv2 = new ModelAndView("/WEB-INF/jsp/success.jsp");
		return mv2;
		
	}
	
	@RequestMapping("/test3")
	public String test3(){
		return "/WEB-INF/jsp/success.jsp";
	}
	//方法3如何传入参数
	@RequestMapping("/test4")
	public String test4(Model model){
		model.addAttribute("name","123");
		return "/WEB-INF/jsp/success.jsp";
	}
	
	@RequestMapping("/test5")
	public String test5(){
//		model.addAttribute("name","123");
		return "redirect:/index.jsp";
	}

}
