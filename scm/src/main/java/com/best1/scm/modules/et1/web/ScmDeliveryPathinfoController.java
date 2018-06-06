package com.best1.scm.modules.et1.web;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.web.BaseController;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransitPathdetail;
import com.best1.scm.modules.delivery.service.DeliveryOrderintransitPathdetailService;
import com.best1.scm.modules.returnpackage.entity.ReturnReturnintransitPathdetail;
import com.best1.scm.modules.returnpackage.service.ReturnReturnintransitPathdetailService;
/**
 * 针对包裹以及路由的派送揽收路由信息进行查询
 * @author zhangzujie
 *
 */
@Controller
@RequestMapping(value = "${adminPath}/et1/deliverypath")
public class ScmDeliveryPathinfoController extends BaseController{
	
	@Autowired
	private DeliveryOrderintransitPathdetailService deliveryOrderintransitPathdetailService;
	@Autowired
	private ReturnReturnintransitPathdetailService  returnReturnintransitPathdetailService;
	
	/**
	 * 包裹的路过信息查询
	 * @param deliveryorderid  快递单号(面单号)
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = {"/delivery/{deliveryorderid}"},method=RequestMethod.GET)
	public  String listdelivery(@PathVariable String deliveryorderid,  HttpServletRequest request, HttpServletResponse response, Model model) {
		
		StringBuffer result  = new StringBuffer();
		if((null!=deliveryorderid)&&(!"".equals(deliveryorderid))){
			DeliveryOrderintransitPathdetail deliveryOrderintransitPathdetail = new DeliveryOrderintransitPathdetail();
			deliveryOrderintransitPathdetail.setTrackingnumber(deliveryorderid);
			Page<DeliveryOrderintransitPathdetail> page = new Page<DeliveryOrderintransitPathdetail>();
			page.setOrderBy(" pathdatetime desc");
			deliveryOrderintransitPathdetail.setPage(page);
			List<DeliveryOrderintransitPathdetail> deliveryOrderintransitPathdetailList = deliveryOrderintransitPathdetailService.findList(deliveryOrderintransitPathdetail);
			if(null!=deliveryOrderintransitPathdetailList&&(deliveryOrderintransitPathdetailList.size()>0)){
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				int deliveryOrderintransitPathdetailListSize = deliveryOrderintransitPathdetailList.size();
				int step = 1 ;
				result.append("[");
				for(DeliveryOrderintransitPathdetail d :deliveryOrderintransitPathdetailList){
					result.append("{");
					
					result.append("\"trackingnumber\":\""+d.getTrackingnumber()+"\",");
					result.append("\"pathdesc\":\""+d.getPathdesc()+"\",");
					try{
						result.append("\"recordcreatedtime\":\""+dateFormat.format(d.getPathdatetime())+"\"");
					}catch(Exception e){
						result.append("\"recordcreatedtime\":\""+dateFormat.format(d.getRecordcreatedtime())+"\"");
					}
					
					result.append("}");
					if(step < deliveryOrderintransitPathdetailListSize){
						result.append(",");
					}
					step++;
					
					
				}
				result.append("]");
			}
			
			request.setAttribute("result", result.toString());
		}
		return "modules/delivery/deliveryOrderintransitPathdetail";
	}
	
	
	
	@RequestMapping(value = {"/deliveryjson/{deliveryorderid}"},method=RequestMethod.GET)
	public  @ResponseBody String listdeliveryjson(@PathVariable String deliveryorderid,  HttpServletRequest request, HttpServletResponse response, Model model) {
		
		StringBuffer result  = new StringBuffer();
		if((null!=deliveryorderid)&&(!"".equals(deliveryorderid))){
			DeliveryOrderintransitPathdetail deliveryOrderintransitPathdetail = new DeliveryOrderintransitPathdetail();
			deliveryOrderintransitPathdetail.setTrackingnumber(deliveryorderid);
			Page<DeliveryOrderintransitPathdetail> page = new Page<DeliveryOrderintransitPathdetail>();
			page.setOrderBy(" pathdatetime desc");
			deliveryOrderintransitPathdetail.setPage(page);
			List<DeliveryOrderintransitPathdetail> deliveryOrderintransitPathdetailList = deliveryOrderintransitPathdetailService.findList(deliveryOrderintransitPathdetail);
			if(null!=deliveryOrderintransitPathdetailList&&(deliveryOrderintransitPathdetailList.size()>0)){
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				int deliveryOrderintransitPathdetailListSize = deliveryOrderintransitPathdetailList.size();
				int step = 1 ;
				result.append("[");
				for(DeliveryOrderintransitPathdetail d :deliveryOrderintransitPathdetailList){
					result.append("{");
					
					result.append("\"trackingnumber\":\""+d.getTrackingnumber()+"\",");
					result.append("\"pathdesc\":\""+d.getPathdesc()+"\",");
					
					try{
						result.append("\"recordcreatedtime\":\""+dateFormat.format(d.getPathdatetime())+"\"");
					}catch(Exception e){
						result.append("\"recordcreatedtime\":\""+dateFormat.format(d.getRecordcreatedtime())+"\"");
					}
					
					result.append("}");
					if(step < deliveryOrderintransitPathdetailListSize){
						result.append(",");
					}
					step++;
					
					
				}
				result.append("]");
			}
			
		}
		return result.toString();
	}
	
	
	
	@RequestMapping(value = {"/return/{returnid}"},method=RequestMethod.GET)
	public  String listreturn(@PathVariable String returnid,  HttpServletRequest request, HttpServletResponse response, Model model) {
		StringBuffer result  = new StringBuffer();
		if((null!=returnid)&&(!"".equals(returnid))){
			ReturnReturnintransitPathdetail returnReturnintransitPathdetail = new ReturnReturnintransitPathdetail();
			try{
				returnReturnintransitPathdetail.setReturnid(Long.parseLong(returnid));
			}catch(NumberFormatException e){
				return "modules/returnpackage/returnReturnintransitPathdetail";
			}
			Page<ReturnReturnintransitPathdetail> page = new Page<ReturnReturnintransitPathdetail>();
			page.setOrderBy("recordcreatedtime desc");
			returnReturnintransitPathdetail.setPage(page);
			
			List<ReturnReturnintransitPathdetail> returnReturnintransitPathdetailList = returnReturnintransitPathdetailService.findList(returnReturnintransitPathdetail);
			if(null!=returnReturnintransitPathdetailList&&(returnReturnintransitPathdetailList.size()>0)){
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				int returnReturnintransitPathdetailListSize = returnReturnintransitPathdetailList.size();
				int step = 1 ;
				result.append("[");
				for(ReturnReturnintransitPathdetail r :returnReturnintransitPathdetailList){
					result.append("{");
					
					result.append("\"returnid\":\""+r.getReturnid()+"\",");
					result.append("\"pathdesc\":\""+r.getPathdesc()+"\",");
					result.append("\"recordcreatedtime\":\""+dateFormat.format(r.getRecordcreatedtime())+"\"");
					
					result.append("}");
					if(step < returnReturnintransitPathdetailListSize){
						result.append(",");
					}
					step++;
					
					
				}
				result.append("]");
			}
			
			request.setAttribute("result", result.toString());
		}
		return "modules/returnpackage/returnReturnintransitPathdetail";
	}
}
