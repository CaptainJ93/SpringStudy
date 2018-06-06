package cn.sm1234.controller;

import java.lang.reflect.Array;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.sm1234.domain.User;
import cn.sm1234.domain.UserVo;

@Controller
@RequestMapping("/param")
public class ParamController {
	//����1����request��ȡ����
	@RequestMapping(value="/test1",method=RequestMethod.POST)
	public String test1(HttpServletRequest request){
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println(name+password);
		return "/WEB-INF/jsp/success.jsp";
	}
	
	//����2��@PathVariable��ȡ����
	@RequestMapping(value="/test2/{username}/{password}",method=RequestMethod.POST)
	public String test2(@PathVariable(value="username")String username,@PathVariable(value="password")String password){
		System.out.println(username);
		System.out.println(password);
		return "/WEB-INF/jsp/success.jsp";
	}
	
	//����3������������
	@RequestMapping(value="/test3",method=RequestMethod.POST)
	public String test3(@RequestParam(value="name",required=false)String username,String password){
		System.out.println(username);
		System.out.println(password);
		return "/WEB-INF/jsp/success.jsp";
	}
	
	//����4��JavaBean����
	@RequestMapping(value="/test4",method=RequestMethod.POST)
	public String test4(User user){
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getTel());
		System.out.println(user.getEmail());
		return "/WEB-INF/jsp/success.jsp";
		
	}
	
	//����5����װ����JavaBean���ղ���
	@RequestMapping(value="/test5",method=RequestMethod.POST)
	public String test5(UserVo uservo){
		System.out.println(uservo.getUser().getUsername());
		System.out.println(uservo.getUser().getPassword());
		System.out.println(uservo.getUser().getTel());
		System.out.println(uservo.getUser().getEmail());
		System.out.println(uservo.getGender());
		return "/WEB-INF/jsp/success.jsp";
	}
	
	//����6��������ղ���
	@RequestMapping(value="/test6",method=RequestMethod.POST)
	public String test6(@RequestParam("idq")Integer[] id){
		System.out.println(Arrays.asList(id));
		return "/WEB-INF/jsp/success.jsp";
	}
	
	
	
	
	
	
	
	
	
	
	
}
