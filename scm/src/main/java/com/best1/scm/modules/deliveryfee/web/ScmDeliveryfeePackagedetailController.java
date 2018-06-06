/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.deliveryfee.web;

import java.util.HashMap;
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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.best1.scm.common.config.Global;
import com.best1.scm.common.persistence.Page;
import com.best1.scm.common.web.BaseController;
import com.best1.scm.common.utils.StringUtils;
import com.best1.scm.modules.delivery.service.DeliveryOrderintransitService;
import com.best1.scm.modules.deliveryfee.entity.ScmDeliveryfeePackagedetail;
import com.best1.scm.modules.deliveryfee.service.ScmDeliveryfeePackagedetailIntimeService;
import com.best1.scm.modules.deliveryfee.service.ScmDeliveryfeePackagedetailService;

/**
 * 配送费用计算Controller
 * @author admin
 * @version 2016-07-27
 */
@Controller
@RequestMapping(value = "${adminPath}/deliveryfee/scmDeliveryfeePackagedetail")
public class ScmDeliveryfeePackagedetailController extends BaseController {

	@Autowired
	private ScmDeliveryfeePackagedetailService scmDeliveryfeePackagedetailService;
	@Autowired
	private ScmDeliveryfeePackagedetailIntimeService scmDeliveryfeePackagedetailIntimeService;
	
	@Autowired
	private DeliveryOrderintransitService deliveryOrderintransitService;
	
	
	@ModelAttribute
	public ScmDeliveryfeePackagedetail get(@RequestParam(required=false) String id) {
		ScmDeliveryfeePackagedetail entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = scmDeliveryfeePackagedetailService.get(id);
		}
		if (entity == null){
			entity = new ScmDeliveryfeePackagedetail();
		}
		return entity;
	}
	
	@RequiresPermissions("deliveryfee:scmDeliveryfeePackagedetail:view")
	@RequestMapping(value = {"list", ""})
	public String list(ScmDeliveryfeePackagedetail scmDeliveryfeePackagedetail, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<ScmDeliveryfeePackagedetail> page = scmDeliveryfeePackagedetailService.findPage(new Page<ScmDeliveryfeePackagedetail>(request, response), scmDeliveryfeePackagedetail); 
		model.addAttribute("page", page);
		return "modules/deliveryfee/scmDeliveryfeePackagedetailList";
	}
	
	
	@RequiresPermissions("deliveryfee:scmDeliveryfeePackagedetail:view")
	@RequestMapping(value = {"listintime"})
	
	public String listintime(ScmDeliveryfeePackagedetail scmDeliveryfeePackagedetail, HttpServletRequest request, HttpServletResponse response, Model model) {
		if((null ==scmDeliveryfeePackagedetail.getCreateDateStart() )||(null == scmDeliveryfeePackagedetail.getCreateDateEnd())){
			request.setAttribute("msg", "请输入查询时间区间");
		}else if((scmDeliveryfeePackagedetail.getCreateDateEnd().getTime()-scmDeliveryfeePackagedetail.getCreateDateStart().getTime())/(1000*60*60*24)>60){
			request.setAttribute("msg", "时间间隔不能大于60天，请重新输入");
		}else{
			
			
			Page<ScmDeliveryfeePackagedetail> page = scmDeliveryfeePackagedetailService.findAllPage(new Page<ScmDeliveryfeePackagedetail>(request, response), scmDeliveryfeePackagedetail); 
			model.addAttribute("page", page);
			
			List<ScmDeliveryfeePackagedetail> scmDeliveryfeePackagedetailList =  page.getList();
			
			for(ScmDeliveryfeePackagedetail s :scmDeliveryfeePackagedetailList){
				
				//计算首重金额
				if(null == s.getFheavyprice()){
					s.setFheavynum(0d);
				}else{
					s.setFheavynum(s.getFheavyprice());
				}
				
				
				//计算续重金额
				if((null == s)||(null == s.getPackageweight()) ||(null == s.getFheavy())||(null == s.getCheavyunit())||(null == s.getCheavyunitprice())||(s.getPackageweight()<s.getFheavy())){
					s.setCheavynum(0d);
				}else{
					s.setCheavynum(s.getCheavyunitprice()*Math.ceil((s.getPackageweight()-s.getFheavy())/s.getCheavyunit()));
				}
				
  			   //计算cod费率金额
				if((null == s ) || (null == s.getPackagecodnum())||(null == s.getCodfeerate())){
					s.setCodfeenum(0d);
				}else{
					s.setCodfeenum(s.getPackagecodnum()*s.getCodfeerate()/100);
				}
				
			   //计算总费用
				s.setResultnum(s.getFheavynum()+s.getCheavynum()+s.getCodfeenum());
				
				
			}
			
			
			
		}
		return "modules/deliveryfee/scmDeliveryfeePackagedetailList-intime";
		
	}
	
	
	
	@RequiresPermissions("deliveryfee:scmDeliveryfeePackagedetail:view")
	@RequestMapping(value = {"listintimecount"})
	public String listintimecount(ScmDeliveryfeePackagedetail scmDeliveryfeePackagedetail, HttpServletRequest request, HttpServletResponse response, Model model) {
		if((null ==scmDeliveryfeePackagedetail.getCreateDateStart() )||(null == scmDeliveryfeePackagedetail.getCreateDateEnd())){
			request.setAttribute("msg", "请输入查询时间区间");
		}else if((scmDeliveryfeePackagedetail.getCreateDateEnd().getTime()-scmDeliveryfeePackagedetail.getCreateDateStart().getTime())/(1000*60*60*24)>60){
			request.setAttribute("msg", "时间间隔不能大于60天，请重新输入");
		}else{
			double totalfee = 0d; //总费用
			
			List<ScmDeliveryfeePackagedetail> scmDeliveryfeePackagedetailList =  scmDeliveryfeePackagedetailIntimeService.findList(scmDeliveryfeePackagedetail);
			
			for(ScmDeliveryfeePackagedetail s :scmDeliveryfeePackagedetailList){
				
				//计算首重金额
				if(null == s.getFheavyprice()){
					s.setFheavynum(0d);
				}else{
					s.setFheavynum(s.getFheavyprice());
				}
				
				
				//计算续重金额
				if((null == s)||(null == s.getPackageweight()) ||(null == s.getFheavy())||(null == s.getCheavyunit())||(null == s.getCheavyunitprice())||(s.getPackageweight()<s.getFheavy())){
					s.setCheavynum(0d);
				}else{
					s.setCheavynum(s.getCheavyunitprice()*Math.ceil((s.getPackageweight()-s.getFheavy())/s.getCheavyunit()));
				}
				
  			   //计算cod费率金额
				if((null == s ) || (null == s.getPackagecodnum())||(null == s.getCodfeerate())){
					s.setCodfeenum(0d);
				}else{
					s.setCodfeenum(s.getPackagecodnum()*s.getCodfeerate()/100);
				}
				
			   //计算总费用
				s.setResultnum(s.getFheavynum()+s.getCheavynum()+s.getCodfeenum());
				totalfee+=s.getResultnum();
				
				
				
				HashMap<String, String> resultHashmap = new HashMap<String, String>();
				resultHashmap.put("packagenum", scmDeliveryfeePackagedetailList.size()+"");
				resultHashmap.put("totalfee", totalfee+"");
				request.setAttribute("resultHashmap", resultHashmap);
			}
			
			
			
		}
		return "modules/deliveryfee/scmDeliveryfeePackagedetailList-intimecount";
		
	}
	

	@RequiresPermissions("deliveryfee:scmDeliveryfeePackagedetail:view")
	@RequestMapping(value = "form")
	public String form(ScmDeliveryfeePackagedetail scmDeliveryfeePackagedetail, Model model) {
		model.addAttribute("scmDeliveryfeePackagedetail", scmDeliveryfeePackagedetail);
		return "modules/deliveryfee/scmDeliveryfeePackagedetailForm";
	}

	@RequiresPermissions("deliveryfee:scmDeliveryfeePackagedetail:edit")
	@RequestMapping(value = "save")
	public String save(ScmDeliveryfeePackagedetail scmDeliveryfeePackagedetail, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, scmDeliveryfeePackagedetail)){
			return form(scmDeliveryfeePackagedetail, model);
		}
		scmDeliveryfeePackagedetailService.save(scmDeliveryfeePackagedetail);
		addMessage(redirectAttributes, "保存配送费用计算成功");
		return "redirect:"+Global.getAdminPath()+"/deliveryfee/scmDeliveryfeePackagedetail/?repage";
	}
	
	@RequiresPermissions("deliveryfee:scmDeliveryfeePackagedetail:edit")
	@RequestMapping(value = "delete")
	public String delete(ScmDeliveryfeePackagedetail scmDeliveryfeePackagedetail, RedirectAttributes redirectAttributes) {
		scmDeliveryfeePackagedetailService.delete(scmDeliveryfeePackagedetail);
		addMessage(redirectAttributes, "删除配送费用计算成功");
		return "redirect:"+Global.getAdminPath()+"/deliveryfee/scmDeliveryfeePackagedetail/?repage";
	}

}