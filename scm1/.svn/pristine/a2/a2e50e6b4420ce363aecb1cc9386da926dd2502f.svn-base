package com.best1.scm.modules.express.web;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.best1.scm.common.web.BaseController;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransit;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransitDetail;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransitPathdetail;
import com.best1.scm.modules.delivery.service.DeliveryOrderintransitPathdetailService;
import com.best1.scm.modules.delivery.service.DeliveryOrderintransitService;
import com.best1.scm.modules.outinterface.entity.JsonResultModel;
import com.best1.scm.modules.outinterface.service.UserInfoService;
import com.best1.scm.modules.outinterface.service.UserValidateUtil;
import com.best1.scm.modules.sys.entity.User;
import com.best1.scm.modules.vws.entity.Zipcode;
import com.best1.scm.modules.vws.service.ZipcodeService;

/**
 * 快递公司配送信息接口
 * @author zhangzujie
 *
 */

@Controller
@RequestMapping(value = "${adminPath}/express/deliveryorder")
public class ExpressDeliveryOrderController extends BaseController{
	
	@Autowired
	private UserInfoService userInfoService;
	
	@Autowired
	private DeliveryOrderintransitPathdetailService deliveryOrderintransitPathdetailService;
	
	@Autowired
	private DeliveryOrderintransitService deliveryOrderintransitService ;
	
	@Autowired
	private ZipcodeService zipcodeService ;
	
	/**
	 * 快递公司写入包裹路由信息的接口
	 * 请求方法：POST
	 * 请求header: code,username,validatecode,type,userid五个属性，有好易购提供,进行账号权限认证
	 * 请求body:json字符串,对应相应的配送model,参数名是body
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = {"list", ""},method=RequestMethod.POST)
	public @ResponseBody String list(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		JsonResultModel  resultModel = UserValidateUtil.validateUser(request,1002, userInfoService); //验证用户信息 1002代表是从快递公司接收的相关信息
		if(resultModel.getIsSuccess()==0){
			return JSON.toJSONString(resultModel);
		}else{
			JsonResultModel  resultModel1 = new JsonResultModel();
			resultModel1.setIsSuccess(1);
			DeliveryOrderintransitPathdetail deliveryOrderintransitPathdetail =  JSON.parseObject(request.getParameter("body"),DeliveryOrderintransitPathdetail.class);
			deliveryOrderintransitPathdetail.setCreateBy(new User(request.getHeader("userid")));
			deliveryOrderintransitPathdetail.setRecordcreatedby(request.getHeader("userid"));
			deliveryOrderintransitPathdetail.setRecordcreatedtime(new Date());
			deliveryOrderintransitPathdetailService.saveAll(deliveryOrderintransitPathdetail);  //存储配送路由信息+更新包裹头状态信息
			
			return JSON.toJSONString(resultModel1);
		}
		
		
	}
	
	/**
	 * 供快递公司查询包裹信息的接口   
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = {"listfordeliveryorder"},method=RequestMethod.POST)
	public @ResponseBody String listfordeliveryorder(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		JsonResultModel  resultModel = UserValidateUtil.validateUser(request,1002, userInfoService); //验证用户信息 1002代表是与快递公司交互的信息
		if(resultModel.getIsSuccess()==0){
			return JSON.toJSONString(resultModel);
		}else{
			resultModel.setIsSuccess(0);
			//针对查询时间进行校验
			if((null==request.getParameter("recordcreatedtimeStart")) || ("".equals(request.getParameter("recordcreatedtimeStart")))){
				resultModel.setFailureDesc("recordcreatedtimeStart can't be null");
				return JSON.toJSONString(resultModel);
			}else if((null==request.getParameter("recordcreatedtimeEnd")) || ("".equals(request.getParameter("recordcreatedtimeEnd")))){
				resultModel.setFailureDesc("recordcreatedtimeEnd can't be null");
				return JSON.toJSONString(resultModel);
			}else{
				try {
					//获取查询条件  创建时间 
					DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					Date  recordcreatedtimeStart = dateFormat.parse(request.getParameter("recordcreatedtimeStart"));
					Date recordcreatedtimeEnd =  dateFormat.parse(request.getParameter("recordcreatedtimeEnd"));
					Calendar calendar = Calendar.getInstance();
					calendar.add(Calendar.DAY_OF_MONTH, -15);  //15天前
					
					
					
					if(recordcreatedtimeStart.after(calendar.getTime())){ // 判断查询创建时间是否是15天之内，超过15天不允许查询
						
						//生成邮编的HashMap
						Map<String ,String> zipcodeMap = new HashMap<String ,String>();
						List<Zipcode> zipcodeList = this.zipcodeService.findList(new Zipcode());
						for(Zipcode zipcode : zipcodeList){
							zipcodeMap.put(zipcode.getZipcode(), zipcode.getZipcodedetail());
						}
						
						StringBuffer  sb = new StringBuffer(); //用于生成查询结果json
						sb.append("[");
						
						DeliveryOrderintransit deliveryOrderintransit = new DeliveryOrderintransit();
						deliveryOrderintransit.setRecordcreatedtimeStart(recordcreatedtimeStart);
						deliveryOrderintransit.setRecordcreatedtimeEnd(recordcreatedtimeEnd);
						deliveryOrderintransit.setSelectedcarrier(request.getHeader("code"));
						
						deliveryOrderintransit.setDeliverytype(1000);
						deliveryOrderintransit.setSubdeliverytype(1000);
						
						List<DeliveryOrderintransit> deliveryOrderintransitList =  deliveryOrderintransitService.findListWithPackageDetail(deliveryOrderintransit);
						
						//针对顺丰的到厂取货 做特殊处理
						if("1000043".equals(request.getHeader("code"))){
							DeliveryOrderintransit deliveryOrderintransit1 = new DeliveryOrderintransit();
							deliveryOrderintransit1.setRecordcreatedtimeStart(recordcreatedtimeStart);
							deliveryOrderintransit1.setRecordcreatedtimeEnd(recordcreatedtimeEnd);
							deliveryOrderintransit1.setSelectedcarrier(request.getHeader("code"));
							deliveryOrderintransit1.setSubdeliverytype(1002);
							List<DeliveryOrderintransit> deliveryOrderintransitList1 =  deliveryOrderintransitService.findListWithPackageDetail(deliveryOrderintransit1);
							for(DeliveryOrderintransit deliveryOrderintransitTemp :deliveryOrderintransitList1){
								deliveryOrderintransitList.add(deliveryOrderintransitTemp);
							}
						}
						
						
						int step = 1;
						int deliveryOrderintransitListsize = deliveryOrderintransitList.size();
						for(DeliveryOrderintransit d :deliveryOrderintransitList){
							    sb.append("{");
								sb.append("\"trackingnumber\":\""+d.getTrackingnumber()+"\",");
								sb.append("\"customerid\":\""+d.getCustomerid()+"\",");
								sb.append("\"customermobnumber\":\""+"0"+"\",");
								sb.append("\"customertelnumber\":\""+"0"+"\",");
								sb.append("\"customername\":\""+d.getCustomername()+"\",");
								sb.append("\"receivingzipcode\":\""+d.getReceivingzipcode()+"\",");
								sb.append("\"receivingaddress1\":\""+d.getReceivingaddress1()+"\",");
								sb.append("\"receivingaddress2\":\""+zipcodeMap.get(d.getReceivingzipcode())+"\",");
								sb.append("\"packagecodnum\":\""+d.getPackagecodnum()+"\",");
								sb.append("\"packageweight\":\""+d.getPackageweight()+"\",");
								sb.append("\"packagevolume\":\""+d.getPackagevolume()+"\",");
								sb.append("\"actualshipdate\":\""+dateFormat.format(d.getActualshipdate())+"\",");
								sb.append("\"remarks\":\""+d.getPackageremark()+"\","); 
								sb.append("\"packagetype\":\""+d.getPackagetype()+"\",");
								
								sb.append("\"details\":[");  //每个包裹的订单明细信息
								
								
								List<DeliveryOrderintransitDetail> detaillist = d.getDeliveryOrderintransitDetail();
								if(null!=detaillist){
									int detaillistsize = detaillist.size();
									int steptwo = 1 ;
									for(DeliveryOrderintransitDetail de : detaillist){
										 sb.append("{");
										 sb.append("\"orderid\":\""+de.getOrderid()+"\",");
										 sb.append("\"itemid\":\""+de.getItemid()+"\",");
										 sb.append("\"productid\":\""+de.getProductid()+"\",");
										 sb.append("\"productversion\":\""+de.getProductversion()+"\",");
										 sb.append("\"productname\":\""+de.getProductname()+"\",");
										 sb.append("\"colorvalue\":\""+de.getColorvalue()+"\",");
										 sb.append("\"stylevalue\":\""+de.getStylevalue()+"\",");
										 sb.append("\"productnum\":\""+de.getProductnum()+"\"");
										 sb.append("}");
										if(steptwo < detaillistsize){
											sb.append(",");
										}
										steptwo++;
									}
								}
								
								
								sb.append("]");
								
								
								sb.append("}");
							if(step < deliveryOrderintransitListsize){
								sb.append(",");
							}
							step++;
						}
						
						sb.append("]");
						return sb.toString();
					}else{
						resultModel.setFailureDesc("仅能查询15内产生的包裹信息 ");
						return JSON.toJSONString(resultModel);
					}
							
					
				} catch (ParseException e) {
					resultModel.setFailureDesc("recordcreatedtimeStart  or recordcreatedtimeEnd format is wrong");
					return JSON.toJSONString(resultModel);
				}
			}
			
		}
		
	}
	@RequestMapping(value = {"listfordeliveryorder1"},method=RequestMethod.POST)
	public @ResponseBody String listfordeliveryorder1(HttpServletRequest request, HttpServletResponse response, Model model) {
		return  "ssss";
	}
	
}
