package com.best1.scm.modules.et1.web;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
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
import com.best1.scm.common.web.BaseController;
import com.best1.scm.modules.delivery.entity.DeliveryOrderintransit;
import com.best1.scm.modules.delivery.service.DeliveryOrderintransitService;
import com.best1.scm.modules.et1.web.util.FtpUtil;
import com.best1.scm.modules.et1.web.util.ListToTxtUtil;

/**
 * scm系统的签收拒收信息 发送给et1
 * @author zhangzujie
 *
 */
@Controller
@RequestMapping(value = "${adminPath}/et1/toet1")
public class ScmDeliveryinfoToEt1Controller extends BaseController{
	
	private static final Logger  logger =  LoggerFactory.getLogger(ScmDeliveryinfoToEt1Controller.class);
	
	@Autowired
	private DeliveryOrderintransitService deliveryOrderintransitService ;
	
	/**
	 * 签收拒收信息发送到ftp  捞取签收拒收信息 ->生成本地文件-->更新已上传字段-->加载ftp配置信息-->上传到ftp-->删除本地文件
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping(value = {"deliveryinfotoftp"},method=RequestMethod.GET)
	public @ResponseBody String list(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, -3);  //3个小时前
		if((0 != Et1Constant.is_doing)&(calendar.after(Et1Constant.taskbegindate))){
			return "任务正在执行";
		}
		
			Et1Constant.is_doing = 1 ;
			
			//创建临时文件夹
			File CSOINFODIR = new File("statustemp");
			if(!CSOINFODIR.exists()){
				CSOINFODIR.mkdir();
			}
			
			
			Calendar calendar1 = Calendar.getInstance();
			calendar1.add(Calendar.DAY_OF_MONTH, -60);  //60天前
			
			DeliveryOrderintransit deliveryOrderintransit1  = new DeliveryOrderintransit();
			deliveryOrderintransit1.setRecordcreatedtimeStart(calendar1.getTime());  //只能查询记录创建时间为60天前的
			deliveryOrderintransit1.setToet1flag("N");
			deliveryOrderintransit1.setTrackingstatus(1002);    //1002为配送确认  1003 为配送终止
			
			
			List<DeliveryOrderintransit>  deliveryOrderintransitList1 =   deliveryOrderintransitService.findListWithPackageDetail(deliveryOrderintransit1); //签收的信息
			//生成本地文件
			if(ListToTxtUtil.WriteListToFile(deliveryOrderintransitList1)){
				for(DeliveryOrderintransit d1 : deliveryOrderintransitList1){
					d1.setToet1flag("Y");
					//System.out.println("id:"+d1.getId());
					deliveryOrderintransitService.update(d1);
				}
			}
			
			
			DeliveryOrderintransit deliveryOrderintransit2  = new DeliveryOrderintransit();
			deliveryOrderintransit2.setRecordcreatedtimeStart(calendar1.getTime());  //只能查询记录创建时间为60天前的
			deliveryOrderintransit2.setToet1flag("N");
			deliveryOrderintransit2.setTrackingstatus(1003);    //1002为配送确认  1003 为配送终止
			
			
			List<DeliveryOrderintransit>  deliveryOrderintransitList2 =   deliveryOrderintransitService.findListWithPackageDetail(deliveryOrderintransit2); //拒收的信息
			//生成本地文件
			if(ListToTxtUtil.WriteListToFile(deliveryOrderintransitList2)){
				for(DeliveryOrderintransit d2 : deliveryOrderintransitList2){
					d2.setToet1flag("Y");
					//System.out.println("id:"+d1.getId());
					deliveryOrderintransitService.update(d2);
				}
			}
			
			
			
			//上传ftp并删除本地文件
			FtpUtil.uploadFileBySun(Global.getConfig("et1ftp.toftpserver"),
					Global.getConfig("et1ftp.toftpuserName"),Global.getConfig("et1ftp.toftpuserPassword"),Global.getConfig("et1ftp.toftpDer"),
					Global.getConfig("et1ftp.toftpfileCode"),Global.getConfig("et1ftp.fromLocalDer"));
			
			
			
			
			Et1Constant.is_doing = 0 ;
		
			return "任务执行成功";
		
	}
	
}



