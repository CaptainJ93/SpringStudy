package com.best1.scm.modules.express.web;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import com.best1.scm.common.web.BaseController;
import com.best1.scm.modules.outinterface.entity.JsonResultModel;
import com.best1.scm.modules.outinterface.service.UserInfoService;
import com.best1.scm.modules.outinterface.service.UserValidateUtil;
import com.best1.scm.modules.returnpackage.entity.ReturnReturnintransit;
import com.best1.scm.modules.returnpackage.entity.ReturnReturnintransitDetail;
import com.best1.scm.modules.returnpackage.entity.ReturnReturnintransitPathdetail;
import com.best1.scm.modules.returnpackage.service.ReturnReturnintransitPathdetailService;
import com.best1.scm.modules.returnpackage.service.ReturnReturnintransitService;
import com.best1.scm.modules.sys.entity.User;

/**
 * 快递公司配送信息接口
 * @author zhangzujie
 *
 */
@Controller
@RequestMapping(value = "${adminPath}/express/returnintransit")
public class ExpressReturnintransitController extends BaseController{

	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private ReturnReturnintransitPathdetailService returnReturnintransitPathdetailService;
	@Autowired
	private ReturnReturnintransitService returnReturnintransitService;
	
	
	
	/**
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
			ReturnReturnintransitPathdetail returnReturnintransitPathdetail =  JSON.parseObject(request.getParameter("body"),ReturnReturnintransitPathdetail.class);
			returnReturnintransitPathdetail.setCreateBy(new User(request.getHeader("userid")));
			returnReturnintransitPathdetail.setRecordcreatedby(request.getHeader("userid"));
			returnReturnintransitPathdetail.setRecordcreatedtime(new Date());
			returnReturnintransitPathdetailService.saveAll(returnReturnintransitPathdetail);  //存储揽收路由信息+更新揽收头状态信息
			
			return JSON.toJSONString(resultModel1);
		}
		
		
	}
	
	
	@RequestMapping(value = {"listForReturn"},method=RequestMethod.POST)
	public @ResponseBody String listForReturn(HttpServletRequest request, HttpServletResponse response, Model model) throws UnsupportedEncodingException {
		JsonResultModel  resultModel = UserValidateUtil.validateUser(request,1002, userInfoService); //验证用户信息 1002代表是从快递公司接收的相关信息
		if(resultModel.getIsSuccess()==0){
			return JSON.toJSONString(resultModel);
		}else{
			JsonResultModel  resultModel1 = new JsonResultModel();
			resultModel1.setIsSuccess(0);
			//针对查询时间进行校验
			if((null==request.getParameter("recordcreatedtimeStart")) || ("".equals(request.getParameter("recordcreatedtimeStart")))){
				resultModel1.setFailureDesc("recordcreatedtimeStart can't be null");
				return JSON.toJSONString(resultModel1);
			}else if((null==request.getParameter("recordcreatedtimeEnd")) || ("".equals(request.getParameter("recordcreatedtimeEnd")))){
				resultModel1.setFailureDesc("recordcreatedtimeEnd can't be null");
				return JSON.toJSONString(resultModel1);
			}else{
				try {
					//获取查询条件  创建时间 
					DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					Date  recordcreatedtimeStart = dateFormat.parse(request.getParameter("recordcreatedtimeStart"));
					Date  recordcreatedtimeEnd = dateFormat.parse(request.getParameter("recordcreatedtimeEnd"));
					Calendar calendar = Calendar.getInstance();
					calendar.add(Calendar.DAY_OF_MONTH, -30);  //30天前
					
					
					
					if(recordcreatedtimeStart.after(calendar.getTime())){ // 判断查询创建时间是否是15天之内，超过15天不允许查询
						
						StringBuffer  sb = new StringBuffer(); //用于生成查询结果json
						sb.append("[");
						
						
						ReturnReturnintransit returnReturnintransit = new ReturnReturnintransit();
						
						returnReturnintransit.setRecordcreatedtimeStart(recordcreatedtimeStart);
						returnReturnintransit.setRecordcreatedtimeEnd(recordcreatedtimeEnd);
						returnReturnintransit.setSelectedcarrier(Long.parseLong(request.getHeader("code")));
						returnReturnintransit.setDeliverytype(1000);
						returnReturnintransit.setSubdeliverytype(1000);
						
						List<ReturnReturnintransit> returnReturnintransitList =  returnReturnintransitService.findListWithDetail(returnReturnintransit); //查询退货单信息
						int step = 1;
						int returnReturnintransitListsize = returnReturnintransitList.size();
						for(ReturnReturnintransit r :returnReturnintransitList){
							
							    sb.append("{");
								sb.append("\"returnid\":\""+r.getReturnid()+"\",");
								sb.append("\"returntype\":\""+r.getReturntype()+"\",");
								sb.append("\"customerid\":\""+r.getCustomerid()+"\",");
								sb.append("\"selectedcarrier\":\""+r.getSelectedcarrier()+"\",");
								sb.append("\"isfacetofacerefund\":\""+r.getIsfacetofacerefund()+"\",");
								if(r.getIsfacetofacerefund()!=0){
									if(r.getRefundcodnumber()>0){
										sb.append("\"refundcodnumber\":\"-"+r.getRefundcodnumber()+"\",");
									}else{
										sb.append("\"refundcodnumber\":\""+r.getRefundcodnumber()+"\",");
									}
								}else{
									sb.append("\"refundcodnumber\":\""+0+"\",");
								}
								
								
							
								
								if(null!=r.getReceiptdeliveryorderid()){
									sb.append("\"receiptdeliveryorderid\":\""+r.getReceiptdeliveryorderid()+"\",");
								}else{
									sb.append("\"receiptdeliveryorderid\":\""+"\",");
								}
								sb.append("\"isneedinvoice\":\""+r.getIsneedinvoice()+"\",");
								sb.append("\"receiveaddress1\":\""+r.getReceiveaddress1()+"\",");
								sb.append("\"receiveaddress2\":\""+r.getReceiveaddress2()+"\",");
								sb.append("\"customername\":\""+r.getCustomername()+"\",");   
								sb.append("\"telephonenumber\":\""+r.getTelephonenumber()+"\",");
								sb.append("\"mobilenumber\":\""+r.getMobilenumber()+"\",");
								sb.append("\"returntime\":\""+dateFormat.format(r.getReturntime())+"\",");
								sb.append("\"details\":[");  //每个退货信息的明细信息
								
								
								List<ReturnReturnintransitDetail> detaillist = r.getReturnReturnintransitDetail();
								if(null!=detaillist){
									int detaillistsize = detaillist.size();
									int steptwo = 1 ;
									for(ReturnReturnintransitDetail re : detaillist){
										 sb.append("{");
										 sb.append("\"orderid\":\""+re.getOrderid()+"\",");
										 sb.append("\"itemid\":\""+re.getItemid()+"\",");
										 sb.append("\"returnid\":\""+re.getReturnid()+"\",");
										 sb.append("\"productid\":\""+re.getProductid()+"\",");
										 sb.append("\"productversion\":\""+re.getProductversion()+"\",");
										 sb.append("\"productname\":\""+re.getProductname()+"\",");
										 sb.append("\"colorvalue\":\""+re.getColorvalue()+"\",");
										 sb.append("\"stylevalue\":\""+re.getStylevalue()+"\",");
										 sb.append("\"productdetail\":\""+URLEncoder.encode(re.getProductdetail()+"","utf-8")+"\",");
										 sb.append("\"productboxingdetail\":\""+URLEncoder.encode(re.getProductboxingdetail()+"","utf-8")+"\",");
										 sb.append("\"productnumber\":\""+re.getProductnumber()+"\"");
										 sb.append("}");
										if(steptwo < detaillistsize){
											sb.append(",");
										}
										steptwo++;
									}
								}
								
								
								sb.append("]");
								
								
								sb.append("}");
							if(step < returnReturnintransitListsize){
								sb.append(",");
							}
							step++;
						}
						
						sb.append("]");
						return sb.toString();
					}else{
						resultModel1.setFailureDesc("仅能查询30内产生的包裹信息 ");
						return JSON.toJSONString(resultModel1);
					}
							
					
				} catch (ParseException e) {
					resultModel1.setFailureDesc("recordcreatedtimeStart or recordcreatedtimeEnd format is wrong");
					return JSON.toJSONString(resultModel1);
				}
			}
		}
	}
}
