package com.best1.scm.modules.express.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.best1.scm.modules.outinterface.entity.JsonResultModel;
import com.best1.scm.modules.outinterface.service.UserInfoService;
import com.best1.scm.modules.outinterface.service.UserValidateUtil;
import com.best1.scm.modules.supplier.entity.ScmSupplierCsoinfo;
import com.best1.scm.modules.supplier.service.ScmSupplierCsoinfoService;

/**
 * 厂商查询本厂订单接口
 * 
 * @author jiashizhen
 *
 */

@Controller
@RequestMapping(value = "${adminPath}/express/supplier/order")
public class SupplierOrderSearchController {
	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private ScmSupplierCsoinfoService scmSupplierCsoinfoService;

	@RequestMapping(value = "search", method = RequestMethod.POST)
	public @ResponseBody String SupplierSearchOrderInfo(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		// 验证账号合法
		JsonResultModel resultModel = UserValidateUtil.validateUser(request, 1002, userInfoService);
		if (resultModel.getIsSuccess() == 0) {
			return JSON.toJSONString(resultModel);
		} else {
			JsonResultModel  resultModel1 = new JsonResultModel();
			resultModel1.setIsSuccess(1);
			ScmSupplierCsoinfo scmSupplierCsoinfo = JSON.parseObject(request.getParameter("body"), ScmSupplierCsoinfo.class);
			List<ScmSupplierCsoinfo> resultList = scmSupplierCsoinfoService.findList(scmSupplierCsoinfo);
			return resultList.toString(); 
		}
	}
}
