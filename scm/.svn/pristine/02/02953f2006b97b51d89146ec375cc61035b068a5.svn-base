package com.best1.scm.modules.vws.web;

import java.io.UnsupportedEncodingException;
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
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.best1.scm.common.web.BaseController;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransit;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransitDetail;
import com.best1.scm.modules.delivery.service.DeliveryOrderintransitDetailService;
import com.best1.scm.modules.delivery.service.DeliveryOrderintransitService;
import com.best1.scm.modules.outinterface.entity.JsonResultModel;
import com.best1.scm.modules.outinterface.service.UserInfoService;
import com.best1.scm.modules.outinterface.service.UserValidateUtil;
import com.best1.scm.modules.sys.entity.User;

/**
 * 同wms信息交互的配送包裹信息接口
 * @author zhangzujie
 *
 */
@Controller
@RequestMapping(value = "${adminPath}/vws/deliveryorder")
public class WMSDeliveryOrderController extends BaseController{
	
	@Autowired
	private UserInfoService userInfoService;  //用户相关
	@Autowired
	private DeliveryOrderintransitService deliveryOrderintransitService ; //配送包裹相关
	
	@Autowired
	private DeliveryOrderintransitDetailService deliveryOrderintransitDetailService;//配送包裹明细相关
	
	
	/**
	 * 通过URL  http方式获取包裹信息
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping(value = {"listforarray"},method=RequestMethod.POST)
	public @ResponseBody String list(HttpServletRequest request, HttpServletResponse response, Model model) throws UnsupportedEncodingException {
		
		JsonResultModel  resultModel = UserValidateUtil.validateUser(request,1001, userInfoService); //验证用户信息 1001代表是从wms系统接收的相关信息
		if(resultModel.getIsSuccess()==0){
			return JSON.toJSONString(resultModel);
		}else{
			JsonResultModel  resultModel1 = new JsonResultModel();
			resultModel1.setIsSuccess(1);
			try{
				System.out.println("收到的json数据:"+request.getParameter("body"));
				//DeliveryOrderintransit deliveryOrderintransit =  JSON.parseObject(request.getParameter("body"),DeliveryOrderintransit.class);

				List<DeliveryOrderintransit>  deliveryOrderintransitList  = JSONArray.parseArray(request.getParameter("body"), DeliveryOrderintransit.class);
				for(DeliveryOrderintransit deliveryOrderintransit :deliveryOrderintransitList){
					
					deliveryOrderintransit.setCreateBy(new User(request.getHeader("userid")));
					deliveryOrderintransit.setRecordcreatedby(request.getHeader("userid"));
					deliveryOrderintransit.setRecordcreatedtime(new Date());
					// deliveryOrderPathdetailService.save(deliveryOrderPathdetail);
					deliveryOrderintransit.setReceivingaddress1(deliveryOrderintransit.getReceivingaddress1().replaceAll("\"|\'", ""));
					deliveryOrderintransitService.save(deliveryOrderintransit);  //存储包裹头
					
					
					List<DeliveryOrderintransitDetail> deliveryOrderintransitDetailList =  deliveryOrderintransit.getDeliveryOrderintransitDetail();
					if(null!=deliveryOrderintransitDetailList){
						String userid = request.getHeader("userid");
						for(DeliveryOrderintransitDetail detail :deliveryOrderintransitDetailList){
							detail.setRecordcreatedby(userid);
							detail.setRecordcreatedtime(new Date());
							deliveryOrderintransitDetailService.save(detail); //存储包裹头明细
						}
					}
				}
				
				
				
				
				
			}catch(JSONException  json){ //捕获json异常
				resultModel1.setIsSuccess(0);
				resultModel1.setFailureDesc("Json数据解析异常:"+json.getMessage());
			}
			return JSON.toJSONString(resultModel1);
		}
		
		
	}
	
	/**
	 * 通过URL  http方式获取包裹信息
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping(value = {"list", ""},method=RequestMethod.POST)
	public @ResponseBody String listforsigle(HttpServletRequest request, HttpServletResponse response, Model model) throws UnsupportedEncodingException {
		
		JsonResultModel  resultModel = UserValidateUtil.validateUser(request,1001, userInfoService); //验证用户信息 1001代表是从wms系统接收的相关信息
		if(resultModel.getIsSuccess()==0){
			return JSON.toJSONString(resultModel);
		}else{
			JsonResultModel  resultModel1 = new JsonResultModel();
			resultModel1.setIsSuccess(1);
			try{
				System.out.println("收到的json数据:"+request.getParameter("body"));
				DeliveryOrderintransit deliveryOrderintransit =  JSON.parseObject(request.getParameter("body"),DeliveryOrderintransit.class);
				deliveryOrderintransit.setCreateBy(new User(request.getHeader("userid")));
				deliveryOrderintransit.setRecordcreatedby(request.getHeader("userid"));
				Calendar calendarNow = Calendar.getInstance();
				calendarNow.add(Calendar.MINUTE, +2);  //2分钟后防止读未提交
				Date date = calendarNow.getTime();
				deliveryOrderintransit.setRecordcreatedtime(date);
				// deliveryOrderPathdetailService.save(deliveryOrderPathdetail);
				deliveryOrderintransit.setDeliverytype(1000);
				deliveryOrderintransit.setSubdeliverytype(1000);
				deliveryOrderintransit.setReceivingaddress1(deliveryOrderintransit.getReceivingaddress1().replaceAll("\"|\'", ""));
				deliveryOrderintransitService.save(deliveryOrderintransit);  //存储包裹头
				
				List<DeliveryOrderintransitDetail> deliveryOrderintransitDetailList =  deliveryOrderintransit.getDeliveryOrderintransitDetail();
				if(null!=deliveryOrderintransitDetailList){
					String userid = request.getHeader("userid");
					for(DeliveryOrderintransitDetail detail :deliveryOrderintransitDetailList){
						detail.setRecordcreatedby(userid);
						Calendar calendarNow1 = Calendar.getInstance();
						calendarNow1.add(Calendar.MINUTE, +2);  //2分钟后防止读未提交
						Date date1 = calendarNow.getTime();
						detail.setRecordcreatedtime(date1);
						deliveryOrderintransitDetailService.save(detail); //存储包裹头明细
					}
				}
				
				
			}catch(JSONException  json){ //捕获json异常
				resultModel1.setIsSuccess(0);
				resultModel1.setFailureDesc("Json数据解析异常:"+json.getMessage());
			}
			return JSON.toJSONString(resultModel1);
		}
		
		
	}
}
