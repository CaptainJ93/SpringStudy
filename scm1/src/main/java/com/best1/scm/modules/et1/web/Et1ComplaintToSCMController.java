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
import com.best1.scm.common.web.BaseController;
import com.best1.scm.modules.delivery.entity.ScmComplaintDetail;
import com.best1.scm.modules.delivery.entity.ScmComplaintHeader;
import com.best1.scm.modules.delivery.service.ScmComplaintDetailService;
import com.best1.scm.modules.delivery.service.ScmComplaintHeaderService;
import com.best1.scm.modules.outinterface.entity.JsonResultModel;
import com.best1.scm.modules.outinterface.service.UserInfoService;
import com.best1.scm.modules.outinterface.service.UserValidateUtil;
import com.best1.scm.modules.sys.entity.User;

/**
 * 接收客诉信息的Controller
 * @author zhangzujie
 *
 */
@Controller
@RequestMapping(value = "${adminPath}/et1/complaintinfo")
public class Et1ComplaintToSCMController extends BaseController{

	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private ScmComplaintHeaderService scmComplaintHeaderService ;
	@Autowired
	private ScmComplaintDetailService scmComplaintDetailService ;
	
	@RequestMapping(value = {"list", ""},method=RequestMethod.POST)
	public @ResponseBody String list(HttpServletRequest request, HttpServletResponse response, Model model) {
		JsonResultModel  resultModel = UserValidateUtil.validateUser(request,1000, userInfoService); //验证用户信息 1000代表是从et1系统接收的相关信息
		if(resultModel.getIsSuccess()==0){
			return JSON.toJSONString(resultModel);
		}else{
			JsonResultModel  resultModel1 = new JsonResultModel();
			resultModel1.setIsSuccess(1);
			try{
			
				//json转化为model
				ScmComplaintHeader scmComplaintHeader =  JSON.parseObject(request.getParameter("body"),ScmComplaintHeader.class);
				
				//判断是否存在
				ScmComplaintHeader  scmComplaintHeaderTemp  = new ScmComplaintHeader();
				scmComplaintHeaderTemp.setCpid(scmComplaintHeader.getCpid());
				List<ScmComplaintHeader> scmComplaintHeaderTempList  = this.scmComplaintHeaderService.findList(scmComplaintHeaderTemp);
				if((null!=scmComplaintHeaderTempList)&&(scmComplaintHeaderTempList.size()>0)){
					scmComplaintHeader.setIsNewRecord(false);
					scmComplaintHeader.setId(scmComplaintHeaderTempList.get(0).getId());

					//保存或更新相关信息
					scmComplaintHeaderService.save(scmComplaintHeader);  //存储客诉头信息
				}else{
					scmComplaintHeader.setCreateBy(new User(request.getHeader("userid")));
					scmComplaintHeader.setRecordcreatedtime(new Date());
					//保存或更新相关信息
					scmComplaintHeaderService.save(scmComplaintHeader);  //存储客诉头信息
					List<ScmComplaintDetail> scmComplaintDetailList =  scmComplaintHeader.getScmComplaintDetailList();
					if(null!=scmComplaintDetailList){
						String userid = request.getHeader("userid");
						for(ScmComplaintDetail detail :scmComplaintDetailList){
							detail.setRecordcreatedtime(new Date());
							// scmComplaintDetailService.save(detail); //存储客诉明细信息
						}
					}
				}
				
				
				
			}catch(JSONException  json){ //捕获json异常
				resultModel1.setIsSuccess(0);
				resultModel1.setFailureDesc("Json数据解析异常");
			}
			return JSON.toJSONString(resultModel1);
		}
	}
}
