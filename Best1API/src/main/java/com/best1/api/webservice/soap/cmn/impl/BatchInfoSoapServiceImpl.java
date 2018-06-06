package com.best1.api.webservice.soap.cmn.impl;

import java.util.List;

import javax.jws.WebService;

import org.apache.commons.lang3.Validate;
import org.apache.cxf.feature.Features;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.best1.api.entity.cmn.TcmnApiBatchinfo;
import com.best1.api.service.cmn.ApiBatchinfoService;
import com.best1.api.webservice.soap.cmn.BatchInfoSoapService;
import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.cmn.ApiBatchinfoDTO;
import com.best1.api.webservice.soap.response.result.cmn.ApiBatchinfoResult;
import com.best1.api.webservice.utils.ApiHandleError;
import com.best1.api.webservice.utils.WsConstants;

@WebService(serviceName = "BatchInfoService", endpointInterface = "com.best1.api.webservice.soap.cmn.BatchInfoSoapService", targetNamespace = WsConstants.NS)
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class BatchInfoSoapServiceImpl implements BatchInfoSoapService {

	private static Logger logger = LoggerFactory
			.getLogger(BatchInfoSoapServiceImpl.class);
	
	@Autowired
	private ApiBatchinfoService apiBatchinfoService;
	
	@Override
	public ApiBatchinfoResult apiBatchInfo(String batchtype, String startdate,
			String enddate, String batchid) {
		ApiBatchinfoResult result = new ApiBatchinfoResult();
		try {
			Validate.notNull(batchtype, "batchtype参数为空");
			Validate.notNull(startdate, "startdate参数为空");
			Validate.notNull(enddate, "enddate参数为空");
			
			logger.info(startdate);
			logger.info(enddate);
			TcmnApiBatchinfo batchinfo = new TcmnApiBatchinfo();
			batchinfo.setBatchtype(batchtype);
			batchinfo.setStartdate(startdate);
			batchinfo.setEnddate(enddate);
			batchinfo.setBatchid(batchid);
			List<ApiBatchinfoDTO> batchinfoes = apiBatchinfoService
					.apiBatchInfo(batchinfo);
			result.setApiBatchinfoes(batchinfoes);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}

	@Override
	public WSResult apiBatchInfoDelete(String batchtype, String batchid) {
		WSResult result = new WSResult();
		try {
			logger.info(batchtype);
			logger.info(batchid);
			Validate.notNull(batchtype, "batchtype参数为空");
			Validate.notNull(batchid, "batchid参数为空");
	
			
			TcmnApiBatchinfo batchinfo = new TcmnApiBatchinfo();
			batchinfo.setBatchtype(batchtype);
			batchinfo.setBatchid(batchid);
			// int mark=vwmsService.apiDeleteBatchInfo(batchinfo);
			int mark = apiBatchinfoService.apiUpdateBatchInfo(batchinfo);

			if (mark > 0) {
				// result.setCode(0+"");
				result.setMessage("删除成功");
			} else {
				result.setCode(-1 + "");
				result.setMessage("删除失败或删除信息不存");
			}

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	

}
