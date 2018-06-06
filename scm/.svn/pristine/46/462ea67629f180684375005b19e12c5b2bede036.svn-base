package com.best1.scm.modules.et1.web;

import java.io.File;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.best1.scm.common.config.Global;
import com.best1.scm.common.utils.SCMConstants;
import com.best1.scm.modules.et1.web.util.FtpUtil;
import com.best1.scm.modules.et1.web.util.ListToTxtUtil;
import com.best1.scm.modules.supplier.entity.ScmSupplierCsoinfo;
import com.best1.scm.modules.supplier.service.ScmSupplierCsoinfoService;



/**
 * 指送出货确认信息到et1
 * @author zhangzujie
 *
 */
@Controller
@RequestMapping(value = "${adminPath}/et1/toet1")
public class ScmDirectCSOInfoToEt1Controller{

	private static final Logger  logger =  LoggerFactory.getLogger(ScmDirectCSOInfoToEt1Controller.class);
	
	@Autowired
	private ScmSupplierCsoinfoService scmSupplierCsoinfoService;
	
	@RequestMapping(value = {"directcsoconfirminfo"},method=RequestMethod.GET)
	public @ResponseBody String directcsoconfirminfo(HttpServletRequest request, HttpServletResponse response, Model model) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, -3);  //3个小时前
		if((0 != Et1Constant.is_doing_csoconfirm)&(calendar.after(Et1Constant.taskbegindate_csoconfirm))){
			return "任务正在执行";
		}
		
			Et1Constant.is_doing_csoconfirm = 1 ;
			
			//创建临时文件夹
			File CSOINFODIR = new File("statustempfordirectcso");
			if(!CSOINFODIR.exists()){
				CSOINFODIR.mkdir();
			}
			
			
			Calendar calendar1 = Calendar.getInstance();
			calendar1.add(Calendar.DAY_OF_MONTH, -60);  //60天前
			
			ScmSupplierCsoinfo scmSupplierCsoinfo  = new ScmSupplierCsoinfo();
			scmSupplierCsoinfo.setToet1flag("N");
			scmSupplierCsoinfo.setOrderstatus(SCMConstants.ORDER_STATUS_SHIPPING_CONFIRMED);    //1003 为出货确认
			List<ScmSupplierCsoinfo>  ScmSupplierCsoinfoLsit1 =   scmSupplierCsoinfoService.findList(scmSupplierCsoinfo);
			
			
			ScmSupplierCsoinfo scmSupplierCsoinfoCancelSuccess = new ScmSupplierCsoinfo();
			scmSupplierCsoinfoCancelSuccess.setToet1flag("N");
			scmSupplierCsoinfoCancelSuccess.setOrderstatus(SCMConstants.ORDER_STATUS_SHIPPING_CANCELSUCCESS); //拦截成功
			List<ScmSupplierCsoinfo>  ScmSupplierCsoinfoLsitCancelSuccess =   scmSupplierCsoinfoService.findList(scmSupplierCsoinfoCancelSuccess); 
			for(ScmSupplierCsoinfo ScmSupplierCsoinfoS : ScmSupplierCsoinfoLsitCancelSuccess){
				ScmSupplierCsoinfoLsit1.add(ScmSupplierCsoinfoS);
			}
			
			//生成本地文件
			if(ListToTxtUtil.WriteListToFileForDirectCSO(ScmSupplierCsoinfoLsit1)){
				for(ScmSupplierCsoinfo d1 : ScmSupplierCsoinfoLsit1){
					d1.setToet1flag("Y");
					d1.setIsNewRecord(false);
					scmSupplierCsoinfoService.save(d1);
				}
			}
			
			
			//上传ftp并删除本地文件
			FtpUtil.uploadFileBySun(Global.getConfig("et1ftp.toftpserver"),
					Global.getConfig("et1ftp.toftpuserName"),Global.getConfig("et1ftp.toftpuserPassword"),Global.getConfig("et1ftp.toftpDerForDirectCSO"),
					Global.getConfig("et1ftp.toftpfileCode"),Global.getConfig("et1ftp.fromLocalDerForDirectCSO"));
			
			
			
			
			Et1Constant.is_doing_csoconfirm = 0 ;
		
			return "任务执行成功";
	}
}
