package com.best1.api.webapp.mvc.cmn;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.best1.api.entity.cmn.TcmnApiBatchinfo;
import com.best1.api.service.cmn.ApiBatchinfoService;
import com.best1.api.service.cmn.RedisCacheUtilService;
import com.best1.api.utils.MediaTypes;
import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.cmn.ApiBatchinfoDTO;
import com.best1.api.webservice.soap.response.result.cmn.ApiBatchinfoResult;
import com.best1.api.webservice.utils.ApiHandleError;

@RestController
public class ApiBatchInfoController {

	private static Logger logger = LoggerFactory
			.getLogger(ApiBatchInfoController.class);
	
	@Autowired
	private ApiBatchinfoService apiBatchinfoService;
	
	@Autowired
	private RedisCacheUtilService redis;
	
	
	@RequestMapping(value = "/cmn/apiBatchinfo/list", produces = MediaTypes.JSON_UTF_8)
	public ApiBatchinfoResult apiBatchInfo(
			@RequestParam(value = "batchtype", required = true) String batchtype,
			@RequestParam(value = "startdate", required = true) String startdate,
			@RequestParam(value = "enddate", required = true) String enddate,
			@RequestParam(value = "batchid", required = false) String batchid) {
		ApiBatchinfoResult result = new ApiBatchinfoResult();
		try {

			logger.info(startdate);
			logger.info(enddate);
			TcmnApiBatchinfo batchinfo = new TcmnApiBatchinfo();
			batchinfo.setBatchtype(batchtype);
			batchinfo.setStartdate(startdate);
			batchinfo.setEnddate(enddate);
			batchinfo.setBatchid(batchid);
			// ApiBatchinfoResult result = vwmsService.apiBatchInfo(batchinfo);
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

	@RequestMapping(value = "/cmn/apiBatchinfo/delete", produces = MediaTypes.JSON_UTF_8)
	public WSResult apiBatchInfoDelete(
			@RequestParam(value = "batchtype", required = true) String batchtype,
			@RequestParam(value = "batchid", required = true) String batchid) {
		WSResult result = new WSResult();
		try {
			logger.info(batchtype);
			logger.info(batchid);
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

	@RequestMapping(value = "/cmn/smspayurl/decrypt", produces = MediaTypes.JSON_UTF_8)
	public  WSResult apiSmsPayUrlDecrypt(
			@RequestParam(value = "encrypt", required = true) String encrypt) {
		WSResult result = new WSResult();
		try {
			logger.info(encrypt);
			
			String url=(String)redis.getCacheObject(encrypt);
			logger.info(url);
			result.setUrl(url);
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
