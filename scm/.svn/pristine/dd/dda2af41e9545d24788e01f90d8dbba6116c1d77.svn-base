/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.supplier.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.best1.scm.common.config.Global;
import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.web.BaseController;
import com.best1.scm.common.utils.DateUtils;
import com.best1.scm.common.utils.SCMConstants;
import com.best1.scm.common.utils.StringUtils;
import com.best1.scm.common.utils.excel.ExportExcel;
import com.best1.scm.common.utils.excel.ImportExcel;
import com.best1.scm.modules.supplier.entity.ScmSupplierCsoinfo;
import com.best1.scm.modules.supplier.entity.ScmSupplierSrodetail;
import com.best1.scm.modules.supplier.entity.ScmSupplierSroheader;
import com.best1.scm.modules.supplier.entity.ScmSupplierSroheaderforLogisticsUpload;
import com.best1.scm.modules.supplier.entity.ScmSupplierSroheaderforSupplierUpload;
import com.best1.scm.modules.supplier.service.ScmSupplierCsoinfoService;
import com.best1.scm.modules.supplier.service.ScmSupplierSrodetailService;
import com.best1.scm.modules.supplier.service.ScmSupplierSroheaderService;
import com.best1.scm.modules.sys.utils.UserUtils;
import com.best1.scm.modules.vws.entity.CarrierInfo;
import com.best1.scm.modules.vws.service.CarrierInfoService;

/**
 * 供应商-退货单头信息Controller
 * @author admin
 * @version 2016-12-13
 */
@Controller
@RequestMapping(value = "${adminPath}/supplier/scmSupplierSroheader")
public class ScmSupplierSroheaderController extends BaseController {
	private static final String errorMessageTemplate = "操作失败：%s";

	@Autowired
	private ScmSupplierSroheaderService scmSupplierSroheaderService;
	
	@Autowired
	private ScmSupplierSrodetailService scmSupplierSrodetailService;
	
	@Autowired
	private ScmSupplierCsoinfoService   scmSupplierCsoinfoService;
	
	@Autowired
	private CarrierInfoService carrierInfoService;
	@ModelAttribute
	public ScmSupplierSroheader get(@RequestParam(required=false) String id) {
		ScmSupplierSroheader entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = scmSupplierSroheaderService.get(id);
		}
		if (entity == null){
			entity = new ScmSupplierSroheader();
		}
		return entity;
	}
	
	@RequiresPermissions("supplier:scmSupplierSroheader:view")
	@RequestMapping(value = {"list", ""})
	public String list(ScmSupplierSroheader scmSupplierSroheader, HttpServletRequest request, HttpServletResponse response, Model model) {
		String supplierid = null;
		if(UserUtils.getSubject().hasRole("supplier")) {
			scmSupplierSroheader.setDeliverytype(1002);
			scmSupplierSroheader.setSubdeliverytype(1002);
		}
		Page<ScmSupplierSroheader> page = scmSupplierSroheaderService.findPage(new Page<ScmSupplierSroheader>(request, response), scmSupplierSroheader); 
		if(UserUtils.getSubject().hasRole("supplier")) {
			supplierid=scmSupplierSroheader.getCurrentUser().getNo();
			ScmSupplierSrodetail scmSupplierSrodetail = new ScmSupplierSrodetail();
			scmSupplierSrodetail.setSupplierid(Long.parseLong(supplierid));
			for ( int i = 0 ; i < page.getList().size(); i ++ ) {
				scmSupplierSrodetail.setReturnid(page.getList().get(i).getReturnid());
				List<ScmSupplierSrodetail> listDetail = scmSupplierSrodetailService.findList(scmSupplierSrodetail);
				if(listDetail.size() == 0) {
					page.getList().remove(i);
					page.setCount(page.getCount()-1);
					i--;
				}
			}
			model.addAttribute("page", page);
		}
		else{
			for ( int i = 0 ; i < page.getList().size() - 1 ; i ++ ) {
				 for ( int j = page.getList().size() - 1 ; j > i; j -- ) {
				 if (page.getList().get(i).getReturnid().equals(page.getList().get(j).getReturnid())) {
					 	page.getList().remove(j);
					 	page.setCount(page.getCount()-1);
				      }
				   }
			}
			model.addAttribute("page", page);
		}
		
		CarrierInfo  carrierInfo = new CarrierInfo();
		carrierInfo.setIssupplierused(1);
		model.addAttribute("carrierInfos", carrierInfoService.findList(carrierInfo));
		return "modules/supplier/scmSupplierSroheaderList";
	}
	
	@RequiresPermissions("supplier:scmSupplierSroheaderSaveAllowed:view")
	@RequestMapping(value = { "listSaveAllowed" })
	public String listSaveAllowed(ScmSupplierSroheader scmSupplierSroheader,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
		String deliveryCode = null;
		if(UserUtils.getSubject().hasRole("Logistics")) { 
			scmSupplierSroheader.setDeliverytype(1002);
			scmSupplierSroheader.setSubdeliverytype(1002);
			deliveryCode=scmSupplierSroheader.getCurrentUser().getOffice().getCode();
			scmSupplierSroheader.setSelectedcarrier(Long.parseLong(deliveryCode));
		}
		String supplierid = null;
		if(UserUtils.getSubject().hasRole("supplier")) {
			scmSupplierSroheader.setDeliverytype(1002);
			scmSupplierSroheader.setSubdeliverytype(1001);
			supplierid=scmSupplierSroheader.getCurrentUser().getNo();
			scmSupplierSroheader.setSupplierid(Long.parseLong(supplierid));
		}
		Page<ScmSupplierSroheader> page = scmSupplierSroheaderService.findPage(
				new Page<ScmSupplierSroheader>(request, response),
				scmSupplierSroheader);
		model.addAttribute("page", page);
		CarrierInfo  carrierInfo = new CarrierInfo();
		carrierInfo.setIssupplierused(1);
		model.addAttribute("carrierInfos", carrierInfoService.findList(carrierInfo));
		return "modules/supplier/scmSupplierSroheaderListSaveAllowed";
	}
	
	@RequiresPermissions("supplier:scmSupplierSroheaderSaveAllowed:view")
	@RequestMapping(value = "loadList")
	public void loadList(
			ScmSupplierSroheader scmSupplierSroheader,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
			try {
				String deliveryCode = null;
				if(UserUtils.getSubject().hasRole("Logistics")) { 
					scmSupplierSroheader.setDeliverytype(1002);
					scmSupplierSroheader.setSubdeliverytype(1002);
					deliveryCode=scmSupplierSroheader.getCurrentUser().getOffice().getCode();
					scmSupplierSroheader.setSelectedcarrier(Long.parseLong(deliveryCode));
				}
				String supplierid = null;
				if(UserUtils.getSubject().hasRole("supplier")) {
					scmSupplierSroheader.setDeliverytype(1002);
					scmSupplierSroheader.setSubdeliverytype(1001);
					supplierid=scmSupplierSroheader.getCurrentUser().getNo();
					scmSupplierSroheader.setSupplierid(Long.parseLong(supplierid));
				}
				List<ScmSupplierSroheader> list = scmSupplierSroheaderService.findList(scmSupplierSroheader);
				List<ScmSupplierSroheader> excelList = new ArrayList<ScmSupplierSroheader>();
					for ( int i = 0 ; i < list.size(); i ++ ) {
						ScmSupplierSrodetail scmSupplierSrodetail = new ScmSupplierSrodetail();
						scmSupplierSrodetail.setReturnid(list.get(i).getReturnid());
						if(UserUtils.getSubject().hasRole("supplier")) { 
							scmSupplierSrodetail.setSupplierid(Long.parseLong(supplierid));
						}
						List<ScmSupplierSrodetail> scmSupplierSrodetailList=scmSupplierSrodetailService.findList(scmSupplierSrodetail);
						for ( int j = 0 ; j < scmSupplierSrodetailList.size(); j ++ ){
								list.get(i).setProductid(scmSupplierSrodetailList.get(j).getProductid());
								list.get(i).setProductversion(scmSupplierSrodetailList.get(j).getProductversion());
								list.get(i).setProductname(scmSupplierSrodetailList.get(j).getProductname());
								list.get(i).setColorvalue(scmSupplierSrodetailList.get(j).getColorvalue());
								list.get(i).setStylevalue(scmSupplierSrodetailList.get(j).getStylevalue());
								list.get(i).setProductnumber(scmSupplierSrodetailList.get(j).getProductnumber());
								list.get(i).setProductdetail(scmSupplierSrodetailList.get(j).getProductdetail());
								list.get(i).setProductboxingdetail(scmSupplierSrodetailList.get(j).getProductboxingdetail());
							    excelList.add(list.get(i));
						}
					}
				String fileName = "指送订单揽收信息列表"+DateUtils.getDate("yyyyMMddHHmmss")+".xlsx";
				new ExportExcel("指送订单揽收信息列表", ScmSupplierSroheader.class).setDataList(excelList).write(response, fileName).dispose();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	@RequiresPermissions("supplier:scmSupplierSroheaderSaveAllowed:view")
	@RequestMapping(value = "loadTemplate")
	public void loadTemplate(
			ScmSupplierSroheader scmSupplierSroheader,
			HttpServletRequest request, HttpServletResponse response,
			Model model) {
			try {
				List<ScmSupplierSroheaderforLogisticsUpload> excelTemplate = new ArrayList<ScmSupplierSroheaderforLogisticsUpload>();
				List<ScmSupplierSroheaderforSupplierUpload> excelTemplate1 = new ArrayList<ScmSupplierSroheaderforSupplierUpload>();				
				String fileName = "指送订单揽收信息列表"+DateUtils.getDate("yyyyMMddHHmmss")+".xlsx";
				if(UserUtils.getSubject().hasRole("Logistics")) {
				for ( int i = 0 ; i < 1; i ++ ) {
						ScmSupplierSroheaderforLogisticsUpload scmSupplierSroheaderforLogisticsUpload = new ScmSupplierSroheaderforLogisticsUpload();
						scmSupplierSroheaderforLogisticsUpload.setReturnid(1888009L);
						scmSupplierSroheaderforLogisticsUpload.setSelectedcarrier(1000033L);
						scmSupplierSroheaderforLogisticsUpload.setReceiptdeliveryorderid("1");
						excelTemplate.add(scmSupplierSroheaderforLogisticsUpload);
					}
				new ExportExcel("指送订单揽收信息列表", ScmSupplierSroheaderforLogisticsUpload.class).setDataList(excelTemplate).write(response, fileName).dispose();
				}
				if(UserUtils.getSubject().hasRole("supplier")) {
					for ( int i = 0 ; i < 1; i ++ ) {
						ScmSupplierSroheaderforSupplierUpload scmSupplierSroheaderforSupplierUpload = new ScmSupplierSroheaderforSupplierUpload();
						scmSupplierSroheaderforSupplierUpload.setReturnid(1888009L);
						scmSupplierSroheaderforSupplierUpload.setSelectedcarrier(1000033L);
						scmSupplierSroheaderforSupplierUpload.setReceiptdeliveryorderid("1");
						scmSupplierSroheaderforSupplierUpload.setSupplierid(4397L);
						excelTemplate1.add(scmSupplierSroheaderforSupplierUpload);
					}
				new ExportExcel("指送订单揽收信息列表", ScmSupplierSroheaderforSupplierUpload.class).setDataList(excelTemplate1).write(response, fileName).dispose();
				}		
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	@RequiresPermissions("supplier:scmSupplierSroheaderSaveAllowed:view")
	@RequestMapping(value = "upLoad")
	public String upLoad(MultipartFile file,
			ScmSupplierSroheader scmSupplierSroheader,
			HttpServletRequest request, HttpServletResponse response,
			Model model,RedirectAttributes redirectAttributes) {
			String message = null;
			StringBuffer sb = new StringBuffer();
			sb.append("保存退货单部分失败,对应订单尚未出货确认,订单异常销退号:");
			try {
				if(UserUtils.getSubject().hasRole("Logistics")){
				List<ScmSupplierSroheaderforLogisticsUpload> list = new ImportExcel(file, 1, 0).getDataList(ScmSupplierSroheaderforLogisticsUpload.class);
				for (ScmSupplierSroheaderforLogisticsUpload each : list){
					ScmSupplierSroheader tempScmSupplierSroheader = new ScmSupplierSroheader();
					String deliveryCode = null;
					tempScmSupplierSroheader.setReturnid(each.getReturnid());
					List<ScmSupplierSroheader> tempScmSupplierSroheader1 = scmSupplierSroheaderService.findList(tempScmSupplierSroheader);
					tempScmSupplierSroheader1.get(0).setLastupdatedtime(new Date());
					tempScmSupplierSroheader1.get(0).setToet1flag("N");
					tempScmSupplierSroheader1.get(0).setReceiptstatus(1005);
					tempScmSupplierSroheader1.get(0).setReceiptsuccesstime(new Date());
					deliveryCode=scmSupplierSroheader.getCurrentUser().getOffice().getCode();
					tempScmSupplierSroheader1.get(0).setLastupdatedby(deliveryCode);
					tempScmSupplierSroheader1.get(0).setSelectedcarrier(each.getSelectedcarrier());
					tempScmSupplierSroheader1.get(0).setReceiptdeliveryorderid(each.getReceiptdeliveryorderid());
					
					// 针对退货进行验证,未出货确认的不能进行退货入库作业
					boolean isCSOInfoOK = false ;
					ScmSupplierSrodetail scmSupplierSrodetailSearch = new ScmSupplierSrodetail();
					scmSupplierSrodetailSearch.setReturnid(tempScmSupplierSroheader1.get(0).getReturnid());
					List<ScmSupplierSrodetail> scmSupplierSrodetailListSearch = scmSupplierSrodetailService.findList(scmSupplierSrodetailSearch);
					if((null!=scmSupplierSrodetailListSearch)&&(scmSupplierSrodetailListSearch.size()>0)){
						
						for(ScmSupplierSrodetail scmSupplierSrodetail : scmSupplierSrodetailListSearch){
							ScmSupplierCsoinfo scmSupplierCsoinfo = new ScmSupplierCsoinfo();
							scmSupplierCsoinfo.setOrderid(scmSupplierSrodetail.getOrderid());
							scmSupplierCsoinfo.setItemid(scmSupplierSrodetail.getItemid());
							List<ScmSupplierCsoinfo>  scmSupplierCsoinfoList =  scmSupplierCsoinfoService.findList(scmSupplierCsoinfo);
							if((null!=scmSupplierCsoinfoList)&&(scmSupplierCsoinfoList.size()>0)){
								for(ScmSupplierCsoinfo scmSupplierCsoinfoT : scmSupplierCsoinfoList){
									if(scmSupplierCsoinfoT.getOrderstatus()==SCMConstants.ORDER_STATUS_SHIPPING_CONFIRMED){
										isCSOInfoOK = true;
									}
								}
							}
						}
					 }
					 if(isCSOInfoOK){
						 scmSupplierSroheaderService.save(tempScmSupplierSroheader1.get(0));
					 }else{
						 sb.append(tempScmSupplierSroheader1.get(0).getReturnid()+",");
					 }
					
					}
				}else if (UserUtils.getSubject().hasRole("supplier")) {
					List<ScmSupplierSroheaderforSupplierUpload> list = new ImportExcel(file, 1, 0).getDataList(ScmSupplierSroheaderforSupplierUpload.class);
					for (ScmSupplierSroheaderforSupplierUpload each : list){
						ScmSupplierSroheader tempScmSupplierSroheader = new ScmSupplierSroheader();
						String supplierid = null;
						tempScmSupplierSroheader.setReturnid(each.getReturnid());
						tempScmSupplierSroheader.setSupplierid(each.getSupplierid());
						List<ScmSupplierSroheader> tempScmSupplierSroheader1 = scmSupplierSroheaderService.findList(tempScmSupplierSroheader);
						tempScmSupplierSroheader1.get(0).setLastupdatedtime(new Date());
						tempScmSupplierSroheader1.get(0).setToet1flag("N");
						tempScmSupplierSroheader1.get(0).setReceiptstatus(1005);
						tempScmSupplierSroheader1.get(0).setReceiptsuccesstime(new Date());
						supplierid=scmSupplierSroheader.getCurrentUser().getNo();	
						tempScmSupplierSroheader1.get(0).setLastupdatedby(supplierid);
						tempScmSupplierSroheader1.get(0).setSelectedcarrier(each.getSelectedcarrier());
						tempScmSupplierSroheader1.get(0).setReceiptdeliveryorderid(each.getReceiptdeliveryorderid());
						
						// 针对退货进行验证,未出货确认的不能进行退货入库作业
						boolean isCSOInfoOK = false ;
						ScmSupplierSrodetail scmSupplierSrodetailSearch = new ScmSupplierSrodetail();
						scmSupplierSrodetailSearch.setReturnid(tempScmSupplierSroheader1.get(0).getReturnid());
						List<ScmSupplierSrodetail> scmSupplierSrodetailListSearch = scmSupplierSrodetailService.findList(scmSupplierSrodetailSearch);
						if((null!=scmSupplierSrodetailListSearch)&&(scmSupplierSrodetailListSearch.size()>0)){
							
							for(ScmSupplierSrodetail scmSupplierSrodetail : scmSupplierSrodetailListSearch){
								ScmSupplierCsoinfo scmSupplierCsoinfo = new ScmSupplierCsoinfo();
								scmSupplierCsoinfo.setOrderid(scmSupplierSrodetail.getOrderid());
								scmSupplierCsoinfo.setItemid(scmSupplierSrodetail.getItemid());
								List<ScmSupplierCsoinfo>  scmSupplierCsoinfoList =  scmSupplierCsoinfoService.findList(scmSupplierCsoinfo);
								if((null!=scmSupplierCsoinfoList)&&(scmSupplierCsoinfoList.size()>0)){
									for(ScmSupplierCsoinfo scmSupplierCsoinfoT : scmSupplierCsoinfoList){
										if(scmSupplierCsoinfoT.getOrderstatus()==SCMConstants.ORDER_STATUS_SHIPPING_CONFIRMED){
											isCSOInfoOK = true;
										}
									}
								}
							}
						 }
						 if(isCSOInfoOK){
							 scmSupplierSroheaderService.save(tempScmSupplierSroheader1.get(0));
						 }else{
							 sb.append(tempScmSupplierSroheader1.get(0).getReturnid()+",");
						 }
						
						}
				}
			message = "上传成功"+","+sb.toString();	
			} catch (Exception e) {
				message = String.format(errorMessageTemplate, e.getMessage());
			}
			addMessage(redirectAttributes, message);
			return "redirect:" + Global.getAdminPath() + "/supplier/scmSupplierSroheader/scmSupplierSroheaderUpload";
//			return "modules/supplier/scmSupplierSroheaderUpload";
	}
	
	@RequiresPermissions("supplier:scmSupplierSroheaderSaveAllowed:view")
	@RequestMapping(value = "scmSupplierSroheaderUpload")
	public String scmSupplierSroheaderUpload() {
		return "modules/supplier/scmSupplierSroheaderUpload";
	}
	
	@RequiresPermissions("supplier:scmSupplierSroheader:view")
	@RequestMapping(value = "form")
	public String form(ScmSupplierSroheader scmSupplierSroheader, Model model) {
		ScmSupplierSrodetail scmSupplierSrodetail = new ScmSupplierSrodetail();
		scmSupplierSrodetail.setReturnid(scmSupplierSroheader.getReturnid());
		String supplierid = null;
		if(UserUtils.getSubject().hasRole("supplier")) {
			supplierid=scmSupplierSroheader.getCurrentUser().getNo();
			scmSupplierSrodetail.setSupplierid(Long.parseLong(supplierid));
		}
		List<ScmSupplierSrodetail> scmSupplierSrodetailList=scmSupplierSrodetailService.findList(scmSupplierSrodetail);
		model.addAttribute("scmSupplierSroheader", scmSupplierSroheader);
		model.addAttribute("scmSupplierSrodetailList", scmSupplierSrodetailList);
		CarrierInfo carrierInfo =new CarrierInfo();
		carrierInfo.setCarrierid(scmSupplierSroheader.getSelectedcarrier());
		CarrierInfo carrierInfo1 =new CarrierInfo();
		List<CarrierInfo> carrierInfo2 = carrierInfoService.findList(carrierInfo);
		if(carrierInfo2.size()!=0) {
			carrierInfo1=carrierInfo2.get(0);
			model.addAttribute("carrierInfo", carrierInfo1.getCarriername());
		} else {
			model.addAttribute("carrierInfo", null);
		}
		
		return "modules/supplier/scmSupplierSroheaderForm";
	}

	@RequiresPermissions("supplier:scmSupplierSroheaderSaveAllowed:view")
	@RequestMapping(value = "formSaveAllowed")
	public String formSaveAllowed(ScmSupplierSroheader scmSupplierSroheader, Model model) {
		ScmSupplierSrodetail scmSupplierSrodetail = new ScmSupplierSrodetail();
		scmSupplierSrodetail.setReturnid(scmSupplierSroheader.getReturnid());
		String supplierid = null;
		if(UserUtils.getSubject().hasRole("supplier")) {
			supplierid=scmSupplierSroheader.getCurrentUser().getNo();
			scmSupplierSrodetail.setSupplierid(Long.parseLong(supplierid));
		}
		List<ScmSupplierSrodetail> scmSupplierSrodetailList=scmSupplierSrodetailService.findList(scmSupplierSrodetail);
		model.addAttribute("scmSupplierSroheader", scmSupplierSroheader);
		model.addAttribute("scmSupplierSrodetailList", scmSupplierSrodetailList);
		CarrierInfo  carrierInfo = new CarrierInfo();
		carrierInfo.setIssupplierused(1);
		model.addAttribute("carrierInfos", carrierInfoService.findList(carrierInfo));
		return "modules/supplier/scmSupplierSroheaderFormSaveAllowed";
	}
	
	@RequiresPermissions("supplier:scmSupplierSroheader:edit")
	@RequestMapping(value = "save")
	public String save(ScmSupplierSroheader scmSupplierSroheader, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, scmSupplierSroheader)){
			return formSaveAllowed(scmSupplierSroheader, model);
		}
		String deliveryCode = null;
		if(UserUtils.getSubject().hasRole("Logistics")) {
			deliveryCode=scmSupplierSroheader.getCurrentUser().getOffice().getCode();
			scmSupplierSroheader.setLastupdatedby(deliveryCode);
		}
		String supplierid = null;
		if(UserUtils.getSubject().hasRole("supplier")) {
			supplierid=scmSupplierSroheader.getCurrentUser().getNo();
			scmSupplierSroheader.setLastupdatedby(supplierid);
		}
		scmSupplierSroheader.setLastupdatedtime(new Date());
		scmSupplierSroheader.setToet1flag("N");
		scmSupplierSroheader.setReceiptstatus(1005);
		scmSupplierSroheader.setReceiptsuccesstime(new Date());
		
		
		/*
		 针对退货进行验证,未出货确认的不能进行退货入库作业
		获取退货明细->根据订单号+订单序号获取包裹状态信息
	    */
		String tips = "";
		boolean isCSOInfoOK = false ;
		ScmSupplierSrodetail scmSupplierSrodetailSearch = new ScmSupplierSrodetail();
		scmSupplierSrodetailSearch.setReturnid(scmSupplierSroheader.getReturnid());
		List<ScmSupplierSrodetail> scmSupplierSrodetailListSearch = scmSupplierSrodetailService.findList(scmSupplierSrodetailSearch);
		if((null!=scmSupplierSrodetailListSearch)&&(scmSupplierSrodetailListSearch.size()>0)){
			
			for(ScmSupplierSrodetail scmSupplierSrodetail : scmSupplierSrodetailListSearch){
				ScmSupplierCsoinfo scmSupplierCsoinfo = new ScmSupplierCsoinfo();
				scmSupplierCsoinfo.setOrderid(scmSupplierSrodetail.getOrderid());
				scmSupplierCsoinfo.setItemid(scmSupplierSrodetail.getItemid());
				List<ScmSupplierCsoinfo>  scmSupplierCsoinfoList =  scmSupplierCsoinfoService.findList(scmSupplierCsoinfo);
				if((null!=scmSupplierCsoinfoList)&&(scmSupplierCsoinfoList.size()>0)){
					for(ScmSupplierCsoinfo scmSupplierCsoinfoT : scmSupplierCsoinfoList){
						if(scmSupplierCsoinfoT.getOrderstatus()==SCMConstants.ORDER_STATUS_SHIPPING_CONFIRMED){
							isCSOInfoOK = true;
						}
					}
				}
			}
			
		}
		if(isCSOInfoOK){
			 scmSupplierSroheaderService.save(scmSupplierSroheader);
			 tips = "保存退货单明细信息成功";
		}else{
			tips = "保存退货单部分失败,对应订单尚未出货确认";
		}
		model.addAttribute("tips", tips);
		model.addAttribute("scmSupplierSroheader", scmSupplierSroheader);
		ScmSupplierSrodetail scmSupplierSrodetail = new ScmSupplierSrodetail();
		scmSupplierSrodetail.setReturnid(scmSupplierSroheader.getReturnid());
		if(UserUtils.getSubject().hasRole("supplier")) {
			supplierid=scmSupplierSroheader.getCurrentUser().getNo();
			scmSupplierSrodetail.setSupplierid(Long.parseLong(supplierid));
		}
		List<ScmSupplierSrodetail> scmSupplierSrodetailList=scmSupplierSrodetailService.findList(scmSupplierSrodetail);
		model.addAttribute("scmSupplierSrodetailList", scmSupplierSrodetailList);
		CarrierInfo  carrierInfo = new CarrierInfo();
		carrierInfo.setIssupplierused(1);
		model.addAttribute("carrierInfos", carrierInfoService.findList(carrierInfo));
		return "modules/supplier/scmSupplierSroheaderFormBack";
	}
	
	@RequiresPermissions("supplier:scmSupplierSroheader:editForAdministrator")
	@RequestMapping(value = "forcedClosure")
	public String forcedClosure(ScmSupplierSroheader scmSupplierSroheader, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, scmSupplierSroheader)){
			return formSaveAllowed(scmSupplierSroheader, model);
		}
		String tips = null;
		String deliveryCode = null;
		if(scmSupplierSroheader.getReceiptstatus()==1000) {
			deliveryCode=scmSupplierSroheader.getCurrentUser().getId();
			scmSupplierSroheader.setLastupdatedby(deliveryCode);
			scmSupplierSroheader.setReceiptstatus(1011);
			scmSupplierSroheader.setLastupdatedtime(new Date());
			scmSupplierSroheader.setToet1flag("N");
			scmSupplierSroheader.setReceiptsuccesstime(new Date());
			scmSupplierSroheaderService.save(scmSupplierSroheader);
			tips = "强迫结案成功";
		}
		else {
			tips = "强迫结案失败，只有销退进行中的状态才能进行强迫结案";
		}
		model.addAttribute("tips", tips);
		ScmSupplierSrodetail scmSupplierSrodetail = new ScmSupplierSrodetail();
		scmSupplierSrodetail.setReturnid(scmSupplierSroheader.getReturnid());
		List<ScmSupplierSrodetail> scmSupplierSrodetailList=scmSupplierSrodetailService.findList(scmSupplierSrodetail);
		CarrierInfo carrierInfo =new CarrierInfo();
		carrierInfo.setCarrierid(scmSupplierSroheader.getSelectedcarrier());
		CarrierInfo carrierInfo1 =new CarrierInfo();
		List<CarrierInfo> carrierInfo2 = carrierInfoService.findList(carrierInfo);
		if(carrierInfo2.size()!=0) {
			carrierInfo1=carrierInfo2.get(0);
			model.addAttribute("carrierInfo", carrierInfo1.getCarriername());
		} else {
			model.addAttribute("carrierInfo", null);
		}
		return "modules/supplier/scmSupplierSroheaderFormForcedClosureBack";
	}
	
	@RequiresPermissions("supplier:scmSupplierSroheader:edit")
	@RequestMapping(value = "delete")
	public String delete(ScmSupplierSroheader scmSupplierSroheader, RedirectAttributes redirectAttributes) {
		scmSupplierSroheaderService.delete(scmSupplierSroheader);
		addMessage(redirectAttributes, "删除供应商-退货单头信息成功");
		return "redirect:"+Global.getAdminPath()+"/supplier/scmSupplierSroheader/?repage";
	}

}