package cn.sm1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//����������hello���͸ո�web.xml�����õ�.action����������hello.action
	@RequestMapping("/hello")
	public ModelAndView hello(){
		System.out.println("ִ����HelloController��Hello����");
		
		//�����ݱ��浽ModelAndView���൱�ڱ���request�����
		ModelAndView mv = new ModelAndView();
		mv.addObject("name","Spring_MVC");
		
		//��������·��
		mv.setViewName("/WEB-INF/jsp/success.jsp");
		return mv;
	}
}
