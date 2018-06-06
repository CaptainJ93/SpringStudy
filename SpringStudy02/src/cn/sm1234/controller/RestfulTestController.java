package cn.sm1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/restfultest")
public class RestfulTestController {
	@RequestMapping(method=RequestMethod.GET)
	public void testGet() {
		System.out.println("testGet");
	}

	@RequestMapping(method=RequestMethod.POST)
	public void testPost() {
		System.out.println("testPost");
	}

	@RequestMapping(method=RequestMethod.PUT)
	public void testPut() {
		System.out.println("testPut");
	}

	@RequestMapping(value="/{id}",method=RequestMethod.DELETE)
	public void testDelete(@PathVariable("id")Integer id) {
		System.out.println("testDelete");
	}
}
