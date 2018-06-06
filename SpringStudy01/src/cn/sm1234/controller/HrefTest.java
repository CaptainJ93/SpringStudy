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
		//ת��
//		request.getRequestDispatcher("/WEB-INF/jsp/success.jsp").forward(request, response);
		//�ض���	�����ض���WEB-INF��ֻ�ܵ�webroot�µ�WEB-INF�����ҳ��
		response.sendRedirect(request.getContextPath()+"/index.jsp");
	}
	
	@RequestMapping("/test2")
	public ModelAndView test2(){
		System.out.println("1234");
		ModelAndView mv = new ModelAndView();
		//�˴���������ͼ������
		mv.setViewName("/WEB-INF/jsp/success.jsp");
//		return mv;
		//��ֱ��new��ʱ������ͼ��
		ModelAndView mv2 = new ModelAndView("/WEB-INF/jsp/success.jsp");
		return mv2;
		
	}
	
	@RequestMapping("/test3")
	public String test3(){
		return "/WEB-INF/jsp/success.jsp";
	}
	//����3��δ������
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
