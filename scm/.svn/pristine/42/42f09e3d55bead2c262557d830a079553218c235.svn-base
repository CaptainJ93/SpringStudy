package com.best1.scm.modules.vws.web;

import java.util.Calendar;
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
import com.best1.scm.modules.returnpackage.entity.ReturnReturnintransit;
import com.best1.scm.modules.returnpackage.entity.ReturnReturnintransitDetail;
import com.best1.scm.modules.returnpackage.service.ReturnReturnintransitDetailService;
import com.best1.scm.modules.returnpackage.service.ReturnReturnintransitService;
import com.best1.scm.modules.sys.entity.User;

/**
 * 同et1信息交互的揽收信息接口
 * @author zhangzujie
 *
 */
@Controller
@RequestMapping(value = "${adminPath}/vws/returnintransit")
public class Et1ReturnintransitController extends BaseController{

	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private ReturnReturnintransitService returnReturnintransitService;
	@Autowired
	private ReturnReturnintransitDetailService returnReturnintransitDetailService;
	
	/**
	 * 通过URL  http方式获取揽收指令信息
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
				ReturnReturnintransit returnReturnintransit =  JSON.parseObject(request.getParameter("body"),ReturnReturnintransit.class);
				returnReturnintransit.setCreateBy(new User(request.getHeader("userid")));
				returnReturnintransit.setRecordcreatedby(request.getHeader("userid"));
				Calendar calendarNow = Calendar.getInstance();
				calendarNow.add(Calendar.MINUTE, +2);  //2分钟后防止读未提交
				Date date = calendarNow.getTime();
				returnReturnintransit.setRecordcreatedtime(date);
				// deliveryOrderPathdetailService.save(deliveryOrderPathdetail);
				returnReturnintransit.setDeliverytype(1000);
				returnReturnintransit.setSubdeliverytype(1000);
				returnReturnintransitService.save(returnReturnintransit);  //存储揽收头信息
				
				List<ReturnReturnintransitDetail> returnReturnintransitDetailList =  returnReturnintransit.getReturnReturnintransitDetail();
				if(null!=returnReturnintransitDetailList){
					String userid = request.getHeader("userid");
					for(ReturnReturnintransitDetail detail :returnReturnintransitDetailList){
						detail.setRecordcreatedby(userid);
						detail.setRecordcreatedtime(new Date());
						returnReturnintransitDetailService.save(detail); //存储揽收明细信息
					}
				}
				
				
			}catch(JSONException  json){ //捕获json异常
				resultModel1.setIsSuccess(0);
				resultModel1.setFailureDesc("Json数据解析异常");
			}
			return JSON.toJSONString(resultModel1);
		}
	}
	
	
	/**
	 * 通过URL  http方式  更新A换A的快递单号信息
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = {"updateReturnInfo"},method=RequestMethod.POST)
	public @ResponseBody String updateReturnInfo(HttpServletRequest request, HttpServletResponse response, Model model) {
		JsonResultModel  resultModel = UserValidateUtil.validateUser(request,1001, userInfoService); //验证用户信息 1000代表是从wms系统接收的相关信息
		if(resultModel.getIsSuccess()==0){
			return JSON.toJSONString(resultModel);
		}else{
			JsonResultModel  resultModel1 = new JsonResultModel();
			resultModel1.setIsSuccess(1);
			try{
				
				ReturnReturnintransit returnReturnintransit =  JSON.parseObject(request.getParameter("body"),ReturnReturnintransit.class);
				ReturnReturnintransit returnReturnintransitTemp = new ReturnReturnintransit();
				//判定销退号是否存在
				if((null == returnReturnintransit.getReturnid()) ||(0l==returnReturnintransit.getReturnid())){
					resultModel1.setIsSuccess(0);
					return JSON.toJSONString(resultModel1);
				}
				returnReturnintransitTemp.setReturnid(returnReturnintransit.getReturnid());
				//确认该A换A退货信息是否存在
				List<ReturnReturnintransit> returnReturnintransitList = this.returnReturnintransitService.findList(returnReturnintransitTemp);
				if((null!=returnReturnintransitList)&&(returnReturnintransitList.size()>0)){
					returnReturnintransitService.updateReceiptdeliveryorderid(returnReturnintransit);  
				}else{
					resultModel1.setIsSuccess(0);
					return JSON.toJSONString(resultModel1);
				}
				
				
			}catch(JSONException  json){ //捕获json异常
				resultModel1.setIsSuccess(0);
				resultModel1.setFailureDesc("Json数据解析异常");
			}
			return JSON.toJSONString(resultModel1);
		}
	}
}
