package com.best1.scm.modules.et1.web;

import java.util.ArrayList;
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
import com.best1.scm.common.web.BaseController;
import com.best1.scm.modules.common.Constant;
import com.best1.scm.modules.outinterface.entity.JsonResultModel;
import com.best1.scm.modules.outinterface.service.UserInfoService;
import com.best1.scm.modules.outinterface.service.UserValidateUtil;
import com.best1.scm.modules.supplier.entity.ScmSupplierSupplierinfo;
import com.best1.scm.modules.supplier.service.ScmSupplierSupplierinfoService;
import com.best1.scm.modules.sys.entity.Office;
import com.best1.scm.modules.sys.entity.Role;
import com.best1.scm.modules.sys.entity.User;
import com.best1.scm.modules.sys.service.SystemService;

/**
 * 接收供应商信息的controller
 * @author zhangzujie
 *
 */
@Controller
@RequestMapping(value = "${adminPath}/et1/supplierinfo")
public class Et1SupllierInfoController extends BaseController{

	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private ScmSupplierSupplierinfoService scmSupplierSupplierinfoService ;
	@Autowired
	private SystemService systemService;
	
	/**
	 * 通过URL  http方式获取供应商信息信息
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
				ScmSupplierSupplierinfo scmSupplierSupplierinfo =  JSON.parseObject(request.getParameter("body"),ScmSupplierSupplierinfo.class);
				scmSupplierSupplierinfo.setCreateBy(new User(request.getHeader("userid")));
				scmSupplierSupplierinfo.setRecordcreatedby(request.getHeader("userid"));
				scmSupplierSupplierinfo.setRecordcreatedtime(new Date());
				// deliveryOrderPathdetailService.save(deliveryOrderPathdetail);
				/**
				 * 首先判断是否存在  存在则update supplier非密码信息即可
				 * 
				 * 不存在   则插入  并且生成初始密码+   获取supplier sysrole  用户角色对应信息      
				 * 
				 */
				
				
				   //判断是否存在,存在则更新
				   ScmSupplierSupplierinfo  tempScmSupplierSupplierinfo = new ScmSupplierSupplierinfo();
				   tempScmSupplierSupplierinfo.setSupplierid(scmSupplierSupplierinfo.getSupplierid());
				   List<ScmSupplierSupplierinfo> existScmSupplierSupplierinfoList = scmSupplierSupplierinfoService.findList(tempScmSupplierSupplierinfo);
				   
				   if((null!=existScmSupplierSupplierinfoList)&&(existScmSupplierSupplierinfoList.size()>0)){
					   scmSupplierSupplierinfo.setId(existScmSupplierSupplierinfoList.get(0).getId());
					   scmSupplierSupplierinfo.setIsNewRecord(false);
					   scmSupplierSupplierinfoService.save(scmSupplierSupplierinfo);
				   }else{
					   
					   scmSupplierSupplierinfoService.save(scmSupplierSupplierinfo);
					   
					   
					   //存储用户账号涉及到的权限信息
					   
					   Office company = new Office();
						company.setId(Constant.Et1SupllierInfoController_companyid);  
						
						company.setType("1");
						
						Office office = new Office();
						office.setId(Constant.Et1SupllierInfoController_officeid); 
						office.setType("2");
						
						User  user = new User();
						user.setCompany(company);  // 设置公司
						user.setOffice(office);    //设置部门
						user.setLoginName(scmSupplierSupplierinfo.getSupplierregno()); //设置税号
						user.setNo(String.valueOf(scmSupplierSupplierinfo.getSupplierid()));
						user.setName(scmSupplierSupplierinfo.getSuppliercompanyname());
						user.setLoginFlag("1");
						user.setDelFlag("0");
						
						User createBy = new User();
						createBy.setId("1");
						
						User updateBy = new User();
						updateBy.setId("1");
						
						
						// user.setPassword("7eb6e81d69f801b800846c1e5c30089cffd84b424c65e848abe4522f");  // 设置默认密码   best1  
						user.setPassword(SystemService.entryptPassword(scmSupplierSupplierinfo.getSupplierregno()));
						user.setCreateBy(createBy);
						user.setUpdateBy(updateBy);
						user.setCreateDate(new Date());
						user.setUpdateDate(new Date());
						
						Role role = new Role();
						role.setId(Constant.Et1SupllierInfoController_roleid);  
						user.setRole(role);
						
						List<Role> roleList = new ArrayList<Role>();
						roleList.add(role);
						user.setRoleList(roleList);
						systemService.saveUser(user);
					   
				   }
					 
				
				
				
			}catch(JSONException  json){ //捕获json异常
				resultModel1.setIsSuccess(0);
				resultModel1.setFailureDesc("Json数据解析异常");
			}
			return JSON.toJSONString(resultModel1);
		}
	}
	
	
}
