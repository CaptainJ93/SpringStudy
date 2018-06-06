package com.best1.scm.modules.et1.web;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.best1.scm.common.utils.SCMConstants;
import com.best1.scm.common.web.BaseController;
import com.best1.scm.modules.outinterface.entity.JsonResultModel;
import com.best1.scm.modules.outinterface.service.UserInfoService;
import com.best1.scm.modules.outinterface.service.UserValidateUtil;
import com.best1.scm.modules.supplier.entity.ScmSupplierCsoinfo;
import com.best1.scm.modules.supplier.service.ScmSupplierCsoinfoService;
import com.best1.scm.modules.sys.entity.User;

/**
 * 接收指送信息的Controller
 * @author zhangzujie
 *
 */
@Controller
@RequestMapping(value = "${adminPath}/et1/directcsoinfo")
public class Et1DirectCSOInfoToSCMController extends BaseController{

	@Autowired
	private UserInfoService userInfoService;
	
	@Autowired
	private ScmSupplierCsoinfoService scmSupplierCsoinfoService ;
	
	
	/**
	 * 通过URL  http方式获取指送订单信息
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = {"list", ""},method=RequestMethod.POST)
	public @ResponseBody String list(HttpServletRequest request, HttpServletResponse response, Model model) {
		JsonResultModel  resultModel = UserValidateUtil.validateUser(request,1000, userInfoService); //验证用户信息 1000代表是从et1系统接收的相关信息
		
		if(resultModel.getIsSuccess()==0){
			return JSON.toJSONString(resultModel);
		}else{
			JsonResultModel  resultModel1 = new JsonResultModel();
			resultModel1.setIsSuccess(1);
			try{
				ScmSupplierCsoinfo scmSupplierCsoinfo =  JSON.parseObject(request.getParameter("body"),ScmSupplierCsoinfo.class);
				scmSupplierCsoinfo.setCreateBy(new User(request.getHeader("userid")));
				scmSupplierCsoinfo.setRecordcreatedby(request.getHeader("userid"));
				scmSupplierCsoinfo.setRecordcreatedtime(new Date());
				// deliveryOrderPathdetailService.save(deliveryOrderPathdetail);
				
				
				ScmSupplierCsoinfo  tempScmSupplierCsoinfo = new ScmSupplierCsoinfo();
				tempScmSupplierCsoinfo.setShiporderid(scmSupplierCsoinfo.getShiporderid());
				tempScmSupplierCsoinfo.setShipordersequence(scmSupplierCsoinfo.getShipordersequence());
				
				List<ScmSupplierCsoinfo> tempScmSupplierCsoinfoList  =  scmSupplierCsoinfoService.findList(tempScmSupplierCsoinfo);
				
				if((null!=tempScmSupplierCsoinfoList)&&tempScmSupplierCsoinfoList.size()>0){
					if(tempScmSupplierCsoinfoList.get(0).getOrderstatus() != SCMConstants.ORDER_STATUS_SHIPPING_CONFIRMED){
						scmSupplierCsoinfo.setId(tempScmSupplierCsoinfoList.get(0).getId());
						scmSupplierCsoinfo.setIsNewRecord(false);
						scmSupplierCsoinfo.setToet1flag("N");
						scmSupplierCsoinfoService.save(scmSupplierCsoinfo);  //存储揽收头信息
					}
					
				}else{
					scmSupplierCsoinfo.setToet1flag("N");
					scmSupplierCsoinfoService.save(scmSupplierCsoinfo);  //存储揽收头信息
				}
			
				
				
			}catch(JSONException  json){ //捕获json异常
				resultModel1.setIsSuccess(0);
				resultModel1.setFailureDesc("Json数据解析异常");
			}
			return JSON.toJSONString(resultModel1);
		}
	}
}
