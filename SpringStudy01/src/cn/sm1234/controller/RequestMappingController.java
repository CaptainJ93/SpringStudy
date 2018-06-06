package cn.sm1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/requestMapping")
public class RequestMappingController {

	@RequestMapping(value="/test1")
	public ModelAndView test1() {

		System.out.println("test1方法");

		// 把数据保存到ModelAndView（相当于保存request域对象）
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "Spring_MVC");

		// 返回物理路径
		//加了class上面的RequestMapping之后WEB-INF前面要加/
		//加上之后是从根目录找
		mv.setViewName("/WEB-INF/jsp/success2.jsp");
		return mv;
	}
	
	@RequestMapping(value="/test2",method=RequestMethod.GET,params={"name1"})
	public ModelAndView test2() {

		System.out.println("test2方法");

		// 把数据保存到ModelAndView（相当于保存request域对象）
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "123");

		// 返回物理路径
		//加了class上面的RequestMapping之后WEB-INF前面要加/
		//加上之后是从根目录找
		mv.setViewName("/WEB-INF/jsp/success2.jsp");
		return mv;
	}
}
