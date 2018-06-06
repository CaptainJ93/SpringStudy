package com.best1.api.webapp.mvc.oaf.ftp;

import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.best1.api.entity.oaf.order.ToafApiFedirefundresponse;
import com.best1.api.service.oaf.CustomerRefundManageSerevice;
import com.best1.api.utils.FtpUtil;
import com.best1.api.utils.MediaTypes;
import com.best1.api.webservice.soap.response.dto.oaf.FedirefundresponseDTO;


@RestController
public class FediRefundFtpController {

	 @Value("${ftp.url}") 
	private String   ftpurl;

	 @Value("${ftp.user}") 
	private String   ftpuser;

	 @Value("${ftp.password}") 
	private String   ftppassword;
	 
	 @Value("${ftp.code}")
	private String ftpcode;
	 
	private static Logger logger = LoggerFactory
			.getLogger(FediRefundFtpController.class);
	
	@Autowired
	private CustomerRefundManageSerevice  customerRefundService;
	
	
	@RequestMapping(value = "/oaf/fedirefundtoftp", produces = MediaTypes.JSON_UTF_8)
	public String fediRefundToFtp(){
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.HOUR, -3);  //3个小时前
		if((0 != FediRefundConstant.is_doing)){
			return "任务正在执行";
		}
		FediRefundConstant.is_doing = 1 ;
			//创建临时文件夹
			File fedirefunddir = new File("fedirefund");
			if(!fedirefunddir.exists()){
				fedirefunddir.mkdir();
			}
			
			List<FedirefundresponseDTO> list  = new ArrayList<FedirefundresponseDTO>();
			
			ToafApiFedirefundresponse response = new ToafApiFedirefundresponse();
			
			response.setRecordstatus(1000);
			
			list = customerRefundService.queryFedirefundResponse(response);
			
			//生成本地文件
			FediRefundListToTxtUtil.FediRefundWriteListToFile(list) ;
			
			
			ToafApiFedirefundresponse toafApiFedirefundresponse = new ToafApiFedirefundresponse();
			for(FedirefundresponseDTO fedirefundresponseDTO : list ){
				
				toafApiFedirefundresponse.setRecordstatus(1001);
				toafApiFedirefundresponse.setRefundid(fedirefundresponseDTO.getRefundid());
				
				customerRefundService.UpdateFedirefundResponse(toafApiFedirefundresponse);
			}
			
			//上传ftp并删除本地文件
			FtpUtil.uploadFileBySun(ftpurl,
					ftpuser,ftppassword,"EDIInputFiles/OAF/FEDIResponse/Primary/",
					ftpcode,"fedirefund");
			
			
			FediRefundConstant.is_doing = 0 ;
		
			return "任务执行成功";
	}
	
}
