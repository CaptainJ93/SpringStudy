package com.best1.scm.modules.webapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.best1.scm.modules.webapi.service.ExpressService;

@RequestMapping("${adminPath}/webapi/express")
@Controller
public class ExpressController {
	@Autowired
	ExpressService expressService;

	@RequestMapping("getExpress")
	public void getExpress() {
		expressService.handleData();
	}

}
