package com.best1.api.webapp.mvc.vwms.ftp;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.best1.api.entity.vwms.TvwsApiCsowholeConfirm;
import com.best1.api.entity.vwms.TvwsApiCsowholeConfirmExample;
import com.best1.api.entity.vwms.TvwsApiProductinventory;
import com.best1.api.entity.vwms.TvwsApiProductinventoryExample;
import com.best1.api.entity.vwms.TvwsApiReturnorderconfirm;
import com.best1.api.entity.vwms.TvwsApiReturnorderconfirmExample;
import com.best1.api.entity.vwms.TvwsApiRtvconfirm;
import com.best1.api.entity.vwms.TvwsApiRtvconfirmExample;
import com.best1.api.entity.vwms.TvwsApiSuppliershipconfirm;
import com.best1.api.entity.vwms.TvwsApiSuppliershipconfirmExample;
import com.best1.api.service.vwms.VwmsInputService;
import com.best1.api.utils.DateUtil;
import com.best1.api.utils.FtpUtil;
import com.best1.api.utils.MediaTypes;



@RestController
public class VWMSFtpController {
	
	 @Value("${ftp.url}") 
	private String   ftpurl;

	 @Value("${ftp.user}") 
	private String   ftpuser;

	 @Value("${ftp.password}") 
	private String   ftppassword;
	 
	 @Value("${ftp.code}")
	private String ftpcode;
	
	private static Logger logger = LoggerFactory
			.getLogger(VWMSFtpController.class);
	@Autowired
	private VwmsInputService vwmsService;
	
	
	@RequestMapping(value = "/vwms/wmscso/confirm", produces = MediaTypes.JSON_UTF_8)
	public String WMSCSOConfirm(){
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, -3);  //3个小时前
		if((0 != Et1Constant.is_doing_wmscso)){
			return "任务正在执行";
		}
			Et1Constant.is_doing_wmscso = 1 ;
			//创建临时文件夹
			File CSOINFODIR = new File("wmscso"); 
			if(!CSOINFODIR.exists()){
				CSOINFODIR.mkdir();
			}
			
			TvwsApiCsowholeConfirmExample example = new TvwsApiCsowholeConfirmExample();
			TvwsApiCsowholeConfirmExample.Criteria criteria = example
					.createCriteria();
			criteria.andRecordstatusEqualTo(1000);
			List<TvwsApiCsowholeConfirm> list  = vwmsService.selectByExample(example);
			
			//生成本地文件
			if(ListToTxtUtil.WMSCSOWriteListToFile(list)){
				for(TvwsApiCsowholeConfirm tvwsApiCsowholeConfirm : list){
					TvwsApiCsowholeConfirm  tvwsApiCsowholeConfirmTemp = new TvwsApiCsowholeConfirm();
					tvwsApiCsowholeConfirmTemp.setRecordstatus(1001);
					TvwsApiCsowholeConfirmExample exampleTemp = new TvwsApiCsowholeConfirmExample();
					TvwsApiCsowholeConfirmExample.Criteria criteriaTemp = exampleTemp
							.createCriteria();
					criteriaTemp.andWarehouseidEqualTo(tvwsApiCsowholeConfirm.getWarehouseid());
					criteriaTemp.andShiporderidEqualTo(tvwsApiCsowholeConfirm.getShiporderid());
					criteriaTemp.andShipordersequenceEqualTo(tvwsApiCsowholeConfirm.getShipordersequence());
					criteriaTemp.andRecordstatusEqualTo(1000);
					
					vwmsService.updateByExampleSelective(tvwsApiCsowholeConfirmTemp, exampleTemp);
				}
			}
			
			
			//上传ftp并删除本地文件
			FtpUtil.uploadFileBType(ftpurl,
					ftpuser,ftppassword,"EDIInputFiles/VWMS/CSOConfirmation/EDI/",
					"UTF-8","wmscso","cso");
			
			
			Et1Constant.is_doing_wmscso = 0 ;
		
			return "任务执行成功";
	}
	
	
	@RequestMapping(value = "/vwms/wmsinventory/confirm", produces = MediaTypes.JSON_UTF_8)
	public String WMSInventoryConfirm(){
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, -3);  //3个小时前
		if((0 != Et1Constant.is_doing_wmsinventory)){
			return "任务正在执行";
		}
			Et1Constant.is_doing_wmsinventory = 1 ;
			//创建临时文件夹
			File CSOINFODIR = new File("wmsinventory");
			if(!CSOINFODIR.exists()){
				CSOINFODIR.mkdir();
			}
			
			TvwsApiProductinventoryExample example = new TvwsApiProductinventoryExample();
			TvwsApiProductinventoryExample.Criteria criteria = example
					.createCriteria();
			criteria.andRecordstatusEqualTo(1000);
			
			//获取当前时间字符串
			TvwsApiProductinventory tvwsApiProductinventory = new TvwsApiProductinventory();
			tvwsApiProductinventory.setRecordcreatedtime(DateUtil.getTodayTime());
			
			List<TvwsApiProductinventory> list  = vwmsService.selectByExample(example);
			//生成本地文件
			if(ListToTxtUtil.WMSInventoryWriteListToFile(list)){
				//上传ftp并删除本地文件
				
				FtpUtil.uploadFileBType(ftpurl,
						ftpuser,ftppassword,"EDIInputFiles/VWMS/InventoryUpdates/EDI/",
						"UTF-8","wmsinventory","cso");
				Et1Constant.is_doing_wmsinventory = 0 ;
				vwmsService.modifyProductinventoryByProc(tvwsApiProductinventory);
				
				
				/**
				for(TvwsApiProductinventory tvwsApiProductinventory : list){
					
					TvwsApiProductinventory  tvwsApiProductinventoryTemp = new TvwsApiProductinventory();
					tvwsApiProductinventoryTemp.setRecordstatus(1001);
					TvwsApiProductinventoryExample exampleTemp = new TvwsApiProductinventoryExample();
					TvwsApiProductinventoryExample.Criteria criteriaTemp = exampleTemp
							.createCriteria();
					criteriaTemp.andWarehouseidEqualTo(tvwsApiProductinventory.getWarehouseid());
					criteriaTemp.andColourclassEqualTo(tvwsApiProductinventory.getColourclass());
					criteriaTemp.andColourcodeEqualTo(tvwsApiProductinventory.getColourcode());
					criteriaTemp.andStyleclassEqualTo(tvwsApiProductinventory.getStyleclass());
					criteriaTemp.andStylecodeEqualTo(tvwsApiProductinventory.getStylecode());
					criteriaTemp.andRecordstatusEqualTo(1000);
					
					vwmsService.updateByExampleSelective(tvwsApiProductinventoryTemp, exampleTemp);
				}*/
				
			}
			
			
		
			return "任务执行成功";
	}
	
	

	@RequestMapping(value = "/vwms/wmssro/confirm", produces = MediaTypes.JSON_UTF_8)
	public String WMSSROConfirm(){
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, -3);  //3个小时前
		if((0 != Et1Constant.is_doing_wmssro)){
			return "任务正在执行";
		}
			Et1Constant.is_doing_wmssro = 1 ;
			//创建临时文件夹
			File CSOINFODIR = new File("wmssro");
			if(!CSOINFODIR.exists()){
				CSOINFODIR.mkdir();
			}
			
			TvwsApiReturnorderconfirmExample example = new TvwsApiReturnorderconfirmExample();
			TvwsApiReturnorderconfirmExample.Criteria criteria = example
					.createCriteria();
			criteria.andRecordstatusEqualTo(1000);
			List<TvwsApiReturnorderconfirm> list  = vwmsService.selectByExample(example);
			
			
			//生成本地文件
			if(ListToTxtUtil.WMSSROWriteListToFile(list)){
				for(TvwsApiReturnorderconfirm tvwsApiReturnorderconfirm : list){
					TvwsApiReturnorderconfirm  tvwsApiReturnorderconfirmTemp = new TvwsApiReturnorderconfirm();
					tvwsApiReturnorderconfirmTemp.setRecordstatus(1001);
					TvwsApiReturnorderconfirmExample exampleTemp = new TvwsApiReturnorderconfirmExample();
					TvwsApiReturnorderconfirmExample.Criteria criteriaTemp = exampleTemp
							.createCriteria();
					criteriaTemp.andWarehouseidEqualTo(tvwsApiReturnorderconfirm.getWarehouseid());
					criteriaTemp.andReturnorderidEqualTo(tvwsApiReturnorderconfirm.getReturnorderid());
					criteriaTemp.andReturnordersequenceEqualTo(tvwsApiReturnorderconfirm.getReturnordersequence());
					criteriaTemp.andRecordstatusEqualTo(1000);
					
					vwmsService.updateByExampleSelective(tvwsApiReturnorderconfirmTemp, exampleTemp);
				}
			}
			
			//上传ftp并删除本地文件
			FtpUtil.uploadFileBType(ftpurl,
					ftpuser,ftppassword,"EDIInputFiles/VWMS/SalesReturnConf/EDI/",
					"UTF-8","wmssro","cso");
			
			
			Et1Constant.is_doing_wmssro = 0 ;
		
			return "任务执行成功";
	}
	
	
	@RequestMapping(value = "/vwms/wmssso/confirm", produces = MediaTypes.JSON_UTF_8)
	public String WMSSSOConfirm(){
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, -3);  //3个小时前
		if((0 != Et1Constant.is_doing_wmssso)){
			return "任务正在执行";
		}
			Et1Constant.is_doing_wmssso = 1 ;
			//创建临时文件夹
			File CSOINFODIR = new File("wmssso");
			if(!CSOINFODIR.exists()){
				CSOINFODIR.mkdir();
			}
			
			
			TvwsApiSuppliershipconfirmExample example = new TvwsApiSuppliershipconfirmExample();
			TvwsApiSuppliershipconfirmExample.Criteria criteria = example
					.createCriteria();
			criteria.andRecordstatusEqualTo(1000);
			List<TvwsApiSuppliershipconfirm> list  = vwmsService.selectByExample(example);
			
			//生成本地文件
			if(ListToTxtUtil.WMSSSOWriteListToFile(list)){
				for(TvwsApiSuppliershipconfirm tvwsApiSuppliershipconfirm : list){
					
					TvwsApiSuppliershipconfirm  tvwsApiSuppliershipconfirmtemp = new TvwsApiSuppliershipconfirm();
					tvwsApiSuppliershipconfirmtemp.setRecordstatus(1001);
					
					TvwsApiSuppliershipconfirmExample exampleTemp = new TvwsApiSuppliershipconfirmExample();
					TvwsApiSuppliershipconfirmExample.Criteria criteriaTemp = exampleTemp
							.createCriteria();
					criteriaTemp.andWarehouseidEqualTo(tvwsApiSuppliershipconfirm.getWarehouseid());
					criteriaTemp.andSuppliershiporderidEqualTo(tvwsApiSuppliershipconfirm.getSuppliershiporderid());
					criteriaTemp.andProductidEqualTo(tvwsApiSuppliershipconfirm.getProductid());
					criteriaTemp.andColourclassEqualTo(tvwsApiSuppliershipconfirm.getColourclass());
					criteriaTemp.andColourcodeEqualTo(tvwsApiSuppliershipconfirm.getColourcode());
					criteriaTemp.andStyleclassEqualTo(tvwsApiSuppliershipconfirm.getStyleclass());
					criteriaTemp.andStylecodeEqualTo(tvwsApiSuppliershipconfirm.getStylecode());
					criteriaTemp.andRecordstatusEqualTo(1000);
					
					vwmsService.updateByExampleSelective(tvwsApiSuppliershipconfirmtemp, exampleTemp);
				}
			}
			
			//上传ftp并删除本地文件
			FtpUtil.uploadFileBType(ftpurl,
					ftpuser,ftppassword,"EDIInputFiles/VWMS/SSOConf/EDI/",
					"UTF-8","wmssso","cso");
			
			
			Et1Constant.is_doing_wmssso = 0 ;
		
			return "任务执行成功";
	}
	
	
	
	@RequestMapping(value = "/vwms/wmsrtv/confirm", produces = MediaTypes.JSON_UTF_8)
	public String WMSRTVConfirm(){
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, -3);  //3个小时前
		if((0 != Et1Constant.is_doing_wmsrtv)){
			return "任务正在执行";
		}
			Et1Constant.is_doing_wmsrtv = 1 ;
			//创建临时文件夹
			File CSOINFODIR = new File("wmsrtv");
			if(!CSOINFODIR.exists()){
				CSOINFODIR.mkdir();
			}
			
			TvwsApiRtvconfirmExample example = new TvwsApiRtvconfirmExample();
			TvwsApiRtvconfirmExample.Criteria criteria = example
					.createCriteria();
			criteria.andRecordstatusEqualTo(1000);
			List<TvwsApiRtvconfirm> list  = vwmsService.selectByExample(example);
			
			//生成本地文件
			if(ListToTxtUtil.WMSRTVWriteListToFile(list)){
				for(TvwsApiRtvconfirm tvwsApiRtvconfirm : list){
					
					TvwsApiRtvconfirm  tvwsApiRtvconfirmTemp  = new TvwsApiRtvconfirm();
					tvwsApiRtvconfirmTemp.setRecordstatus(1001);
					TvwsApiRtvconfirmExample exampleTemp = new TvwsApiRtvconfirmExample();
					TvwsApiRtvconfirmExample.Criteria criteriaTemp = exampleTemp
							.createCriteria();
					criteriaTemp.andWarehouseidEqualTo(tvwsApiRtvconfirm.getWarehouseid());
					criteriaTemp.andRtvorderidEqualTo(tvwsApiRtvconfirm.getRtvorderid());
					criteriaTemp.andRtvordersequenceEqualTo(tvwsApiRtvconfirm.getRtvordersequence());
					criteriaTemp.andRecordstatusEqualTo(1000);
					
					vwmsService.updateByExampleSelective(tvwsApiRtvconfirmTemp, exampleTemp);
			}
			}
			//上传ftp并删除本地文件
			FtpUtil.uploadFileBType(ftpurl,
					ftpuser,ftppassword,"EDIInputFiles/VWMS/RTVConfirmation/EDI/",
					"UTF-8","wmsrtv","cso");
			
			
			Et1Constant.is_doing_wmsrtv = 0 ;
		
			return "任务执行成功";
	}

}
