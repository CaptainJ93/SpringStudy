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
import com.best1.scm.common.web.BaseController;
import com.best1.scm.modules.et1.web.util.FtpUtil;
import com.best1.scm.modules.et1.web.util.ListToTxtUtil;
import com.best1.scm.modules.supplier.entity.ScmSupplierSroheader;
import com.best1.scm.modules.supplier.service.ScmSupplierSroheaderService;
/**
 * 指送销退确认信息到et1
 * @author zhangzujie
 *
 */
@Controller
@RequestMapping(value = "${adminPath}/et1/toet1")
public class ScmDirectSROInfoToEt1Controller extends BaseController{

private static final Logger  logger =  LoggerFactory.getLogger(ScmDirectSROInfoToEt1Controller.class);
	
	@Autowired
	private ScmSupplierSroheaderService scmSupplierSroheaderService;
	
	@RequestMapping(value = {"directsroconfirminfo"},method=RequestMethod.GET)
	public @ResponseBody String directsroconfirminfo(HttpServletRequest request, HttpServletResponse response, Model model) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, -3);  //3个小时前
		if((0 != Et1Constant.is_doing_sroconfirm)&(calendar.after(Et1Constant.taskbegindate_sroconfirm))){
			return "任务正在执行";
		}
		
			Et1Constant.is_doing_sroconfirm = 1 ;
			
			//创建临时文件夹
			File CSOINFODIR = new File("statustempfordirectsro");
			if(!CSOINFODIR.exists()){
				CSOINFODIR.mkdir();
			}
			
			
			Calendar calendar1 = Calendar.getInstance();
			calendar1.add(Calendar.DAY_OF_MONTH, -60);  //60天前
			
			ScmSupplierSroheader scmSupplierSroheader = new ScmSupplierSroheader();
			scmSupplierSroheader.setToet1flag("N");
			scmSupplierSroheader.setReceiptstatus(SCMConstants.Receipt_Status_Success);    //收件成功
			
			List<ScmSupplierSroheader> scmSupplierSroheaderLsit = scmSupplierSroheaderService.findListWithDetail(scmSupplierSroheader);
			
			//生成本地文件
			if(ListToTxtUtil.WriteListToFileForDirectSRO(scmSupplierSroheaderLsit)){
				for(ScmSupplierSroheader d1 : scmSupplierSroheaderLsit){
					d1.setToet1flag("Y");
					d1.setIsNewRecord(false);
					scmSupplierSroheaderService.save(d1);
				}
			}
			
			
			//上传ftp并删除本地文件
			FtpUtil.uploadFileBySun(Global.getConfig("et1ftp.toftpserver"),
					Global.getConfig("et1ftp.toftpuserName"),Global.getConfig("et1ftp.toftpuserPassword"),Global.getConfig("et1ftp.toftpDerForDirectSRO"),
					Global.getConfig("et1ftp.toftpfileCode"),Global.getConfig("et1ftp.fromLocalDerForDirectSRO"));
			
			
			
			
			Et1Constant.is_doing_sroconfirm = 0 ;
		
			return "任务执行成功";
	}
}