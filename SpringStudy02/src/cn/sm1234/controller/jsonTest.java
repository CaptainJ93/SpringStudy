package cn.sm1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sm1234.domain.User;
@Controller
@RequestMapping(value="/json")
public class jsonTest {
	@RequestMapping(value="/test1")
	@ResponseBody
	public User test1(@RequestBody User user){
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getTel());
		System.out.println(user.getEmail());
		return user;
	}
}
