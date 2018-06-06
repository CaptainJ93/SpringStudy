package com.best1.scm.modules.et1.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
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
import com.best1.scm.modules.supplier.entity.ScmSupplierSrodetail;
import com.best1.scm.modules.supplier.entity.ScmSupplierSroheader;
import com.best1.scm.modules.supplier.service.ScmSupplierSrodetailService;
import com.best1.scm.modules.supplier.service.ScmSupplierSroheaderService;
import com.best1.scm.modules.sys.entity.User;

/**
 * 接收指送揽收信息的Controller
 * @author zhangzujie
 *
 */
@Controller
@RequestMapping(value = "${adminPath}/et1/directsroinfo")
public class Et1DirectSROInfoToSCMController extends BaseController{

	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private ScmSupplierSroheaderService scmSupplierSroheaderService;
	@Autowired
	private ScmSupplierSrodetailService  scmSupplierSrodetailService;
	
	@RequestMapping(value = {"list", ""},method=RequestMethod.POST)
	public @ResponseBody String list(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		
		
		JsonResultModel  resultModel = UserValidateUtil.validateUser(request,1000, userInfoService); //验证用户信息 1000代表是从et1系统接收的相关信息
		if(resultModel.getIsSuccess()==0){
			return JSON.toJSONString(resultModel);
		}else{
			JsonResultModel  resultModel1 = new JsonResultModel();
			resultModel1.setIsSuccess(1);
			try{
				ScmSupplierSroheader scmSupplierSroheader =  JSON.parseObject(request.getParameter("body"),ScmSupplierSroheader.class);
				
				
				//判断是否需要拆分
				
				//到厂取货无supplierid   一般指送   同一个供应商  header需要supplierid   一般指送   不同供应商     需要supplierid  并且header为两条或多条  有不同的supplierid
				List<ScmSupplierSroheader> ScmSupplierSroheaderList = new ArrayList<ScmSupplierSroheader>();
				
				boolean isSameSupplierID = true;
				
				if((null!=scmSupplierSroheader)&&(scmSupplierSroheader.getSubdeliverytype()==SCMConstants.SUB_DELIVERY_TYPE_NORMAL)){
					 //赋予returnheader supplierid 为detail中的一个
					scmSupplierSroheader.setSupplierid(scmSupplierSroheader.getReturnReturnintransitDetail().get(0).getSupplierid()); 
					
					List<ScmSupplierSrodetail> scmSupplierSrodetailList = scmSupplierSroheader.getReturnReturnintransitDetail();
					if((null!=scmSupplierSrodetailList)&&(scmSupplierSrodetailList.size()>1)){
						//查看有多少个supplierid 如果有多个supplier需要进行拆分
						Set<Long> supplieridSet = new HashSet<Long>();
						for(ScmSupplierSrodetail T1 : scmSupplierSrodetailList){
							supplieridSet.add(T1.getSupplierid());
						}
						
						//如果大于1进行拆分
						if(supplieridSet.size()>1){
							
							isSameSupplierID = false;
							Map<Long,ScmSupplierSroheader>  scmSupplierSroheaderMap = new HashMap<Long,ScmSupplierSroheader>();
							
							
							//针对每个supplierid复制一个对象 并保存在Map中
							Iterator<Long> supplierIDIterator = supplieridSet.iterator();
							while(supplierIDIterator.hasNext()){
								Long supplierid = supplierIDIterator.next();
								ScmSupplierSroheader  scmSupplierSroheaderNew = new ScmSupplierSroheader();
							    BeanUtils.copyProperties(scmSupplierSroheader, scmSupplierSroheaderNew);
							    scmSupplierSroheaderNew.setSupplierid(supplierid);
							    scmSupplierSroheaderNew.setReturnReturnintransitDetail(new ArrayList<ScmSupplierSrodetail>());
							    scmSupplierSroheaderMap.put(supplierid, scmSupplierSroheaderNew);
							}
							
							//针对每个supplierid的detail进行赋值
							
							for(ScmSupplierSrodetail T2 : scmSupplierSrodetailList ){
								scmSupplierSroheaderMap.get(T2.getSupplierid()).getReturnReturnintransitDetail().add(T2);
							}
							
							//HashMap转化为List
							Iterator<Long> supplierIDIterator2 = supplieridSet.iterator();
							while(supplierIDIterator2.hasNext()){
								ScmSupplierSroheaderList.add(scmSupplierSroheaderMap.get(supplierIDIterator2.next()));
							}
							
						}
					}
				}
				
				if(isSameSupplierID){
					ScmSupplierSroheaderList.add(scmSupplierSroheader);
				}
				
				
				
				
				//保存更新
				for(ScmSupplierSroheader scmSupplierSroheaderTemp : ScmSupplierSroheaderList){
					//判断是否存在
					scmSupplierSroheaderTemp.setReturnid(scmSupplierSroheader.getReturnid());
					List<ScmSupplierSroheader> scmSupplierSrodeHeaderListTemp = this.scmSupplierSroheaderService.findList(scmSupplierSroheaderTemp);
					if((null!=scmSupplierSrodeHeaderListTemp)&&(scmSupplierSrodeHeaderListTemp.size()>0)){
						
						for(ScmSupplierSroheader ScmSupplierSroheader1 : scmSupplierSrodeHeaderListTemp){
							scmSupplierSroheader.setIsNewRecord(false);
							scmSupplierSroheader.setId(ScmSupplierSroheader1.getId());
							if((null!=ScmSupplierSroheader1.getSupplierid())&&(ScmSupplierSroheader1.getSupplierid()>0)){
								scmSupplierSroheader.setSupplierid(ScmSupplierSroheader1.getSupplierid());
							}
							if(ScmSupplierSroheader1.getReceiptstatus()!=SCMConstants.Receipt_Status_Success){
								scmSupplierSroheader.setToet1flag("N");
								scmSupplierSroheaderService.save(scmSupplierSroheader);  //更新揽收头信息
								
							}
							
							
						}
						
						
					}else{
						scmSupplierSroheader.setCreateBy(new User(request.getHeader("userid")));
						scmSupplierSroheader.setRecordcreatedby(request.getHeader("userid"));
						scmSupplierSroheader.setRecordcreatedtime(new Date());
						scmSupplierSroheader.setToet1flag("N");
						scmSupplierSroheaderService.save(scmSupplierSroheader);  //存储揽收头信息
						List<ScmSupplierSrodetail> scmSupplierSrodetailList =  scmSupplierSroheader.getReturnReturnintransitDetail();
						if(null!=scmSupplierSrodetailList){
							String userid = request.getHeader("userid");
							for(ScmSupplierSrodetail detail :scmSupplierSrodetailList){
								detail.setRecordcreatedby(userid);
								detail.setRecordcreatedtime(new Date());
								scmSupplierSrodetailService.save(detail); //存储包裹头明细
							}
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
