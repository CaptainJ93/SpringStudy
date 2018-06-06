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

		System.out.println("test1����");

		// �����ݱ��浽ModelAndView���൱�ڱ���request�����
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "Spring_MVC");

		// ��������·��
		//����class�����RequestMapping֮��WEB-INFǰ��Ҫ��/
		//����֮���ǴӸ�Ŀ¼��
		mv.setViewName("/WEB-INF/jsp/success2.jsp");
		return mv;
	}
	
	@RequestMapping(value="/test2",method=RequestMethod.GET,params={"name1"})
	public ModelAndView test2() {

		System.out.println("test2����");

		// �����ݱ��浽ModelAndView���൱�ڱ���request�����
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", "123");

		// ��������·��
		//����class�����RequestMapping֮��WEB-INFǰ��Ҫ��/
		//����֮���ǴӸ�Ŀ¼��
		mv.setViewName("/WEB-INF/jsp/success2.jsp");
		return mv;
	}
}
