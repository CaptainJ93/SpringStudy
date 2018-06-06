package cn.sm1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//这里配置了hello，和刚刚web.xml中配置的.action合起来就是hello.action
	@RequestMapping("/hello")
	public ModelAndView hello(){
		System.out.println("执行了HelloController的Hello方法");
		
		//把数据保存到ModelAndView（相当于保存request域对象）
		ModelAndView mv = new ModelAndView();
		mv.addObject("name","Spring_MVC");
		
		//返回物理路径
		mv.setViewName("/WEB-INF/jsp/success.jsp");
		return mv;
	}
}
