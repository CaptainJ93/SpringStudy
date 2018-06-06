package cn.sm1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/exception")
public class exceptionTest {
	
//	@ExceptionHandler(value={java.lang.NullPointerException.class})
//	public ModelAndView exception(Exception exception) {
//		ModelAndView mv = new ModelAndView(); 
//		mv.addObject("msg",exception.toString());
//		mv.setViewName("/WEB-INF/jsp/error.jsp");
//		return mv;
//	}
//	
	@RequestMapping(value="/test1")
	public String test1(){
		System.out.println("exceptionµÄtest1");
		// java.lang.NullPointerException
		String a = null;
		a.substring(0);
		return "/WEB-INF/jsp/success.jsp";
	}
	
	/**
	 * SimpleMappingExceptionResolver
	 * @return
	 */
	@RequestMapping(value="/test3")
	public String test2(){
		Integer a = 100/0;
		return "/WEB-INF/jsp/success.jsp";
	}
}












