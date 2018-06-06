package com.best1.scm.modules.vws.web;

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
import com.best1.scm.modules.outinterface.entity.JsonResultModel;
import com.best1.scm.modules.outinterface.service.UserInfoService;
import com.best1.scm.modules.outinterface.service.UserValidateUtil;
import com.best1.scm.modules.supplier.entity.ScmSupplierSkuinfo;
import com.best1.scm.modules.supplier.service.ScmSupplierSkuinfoService;
import com.best1.scm.modules.sys.entity.User;

/**
 * 接收商品信息的Controller
 * @author zhangzujie
 *
 */
@Controller
@RequestMapping(value = "${adminPath}/vws/skuinfo")
public class WMSSKUInfoController extends BaseController {
	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private ScmSupplierSkuinfoService scmSupplierSkuinfoService;

	@RequestMapping(value = {"list", ""},method=RequestMethod.POST)
	public @ResponseBody String list(HttpServletRequest request, HttpServletResponse response, Model model) {
		JsonResultModel  resultModel = UserValidateUtil.validateUser(request,1001, userInfoService); //验证用户信息 1000代表是从et1系统接收的相关信息
		if(resultModel.getIsSuccess()==0){
			return JSON.toJSONString(resultModel);
		}else{
			JsonResultModel  resultModel1 = new JsonResultModel();
			resultModel1.setIsSuccess(1);
			try{
				
				ScmSupplierSkuinfo scmSupplierSkuinfo =  JSON.parseObject(request.getParameter("body"),ScmSupplierSkuinfo.class);
				scmSupplierSkuinfo.setCreateBy(new User(request.getHeader("userid")));
				scmSupplierSkuinfo.setRecordcreatedby(request.getHeader("userid"));
				scmSupplierSkuinfo.setRecordcreatedtime(new Date());
				
				//首先判断是否已存在
				ScmSupplierSkuinfo TempscmSupplierSkuinfo  = new ScmSupplierSkuinfo();
				TempscmSupplierSkuinfo.setProductskucode(scmSupplierSkuinfo.getProductskucode());
				List<ScmSupplierSkuinfo> tempScmSupplierSkuinfoList =  this.scmSupplierSkuinfoService.findList(TempscmSupplierSkuinfo);
				if((null!=tempScmSupplierSkuinfoList)&&(tempScmSupplierSkuinfoList.size()>0)){
					scmSupplierSkuinfo.setId(tempScmSupplierSkuinfoList.get(0).getId());
					scmSupplierSkuinfo.setIsNewRecord(false);
				}
				scmSupplierSkuinfoService.save(scmSupplierSkuinfo);  //存储揽收头信息
				
				
			}catch(JSONException  json){ //捕获json异常
				resultModel1.setIsSuccess(0);
				resultModel1.setFailureDesc("Json数据解析异常");
			}
			return JSON.toJSONString(resultModel1);
		}
	}
}
