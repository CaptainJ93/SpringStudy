package com.best1.api.webapp.mvc.chm;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.best1.api.entity.chm.Programdetail;
import com.best1.api.service.chm.PgmManageService;
import com.best1.api.utils.MediaTypes;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.chm.ProgramdetailDTO;
import com.best1.api.webservice.soap.response.result.chm.ProgramdetailsResult;
import com.best1.api.webservice.utils.ApiHandleError;


@RestController
public class ProgramController {
	private static Logger logger = LoggerFactory
			.getLogger(ProgramController.class);
	@Autowired
	private PgmManageService pgmManageService;
	
	@RequestMapping(value = "/chm/programdetails/query", method = { RequestMethod.POST },produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public ProgramdetailsResult queryProgramdetails(
			@RequestParam(value = "nfmpgmscheduleid", required = false) Long nfmpgmscheduleid,
			@RequestParam(value = "subchannelid", required = false) Long subchannelid, 
			@RequestParam(value = "pgmstatus", required = false) Integer pgmstatus,
			@RequestParam(value = "startdate", required = false) String startdate,
			@RequestParam(value = "enddate", required = false) String enddate) {
		ProgramdetailsResult result = new ProgramdetailsResult();
		try {
			if (nfmpgmscheduleid == null && subchannelid == null
					&& pgmstatus == null && StringUtils.isBlank(startdate)
					&& StringUtils.isBlank(enddate)) {
				return result;
			}
			Programdetail programdetail = new Programdetail();
			if (nfmpgmscheduleid != null) {
				programdetail.setNfmpgmscheduleid(nfmpgmscheduleid);
			}

			if (subchannelid != null) {
				programdetail.setSubchannelid(subchannelid);
			}
			if (pgmstatus != null) {
				programdetail.setPgmstatus(pgmstatus);
			}
			if (!StringUtils.isBlank(startdate)) {
				programdetail.setStartdate(startdate);
			}
			if (!StringUtils.isBlank(enddate)) {
				programdetail.setEnddate(enddate);
			}
			List<Programdetail> programdetails = pgmManageService
					.programDetailInfo(programdetail);
			List<ProgramdetailDTO> dtoes = BeanMapper.mapList(programdetails,
					ProgramdetailDTO.class);
			result.setProgramdetails(dtoes);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@RequestMapping(value = "/chm/tape/create", method = { RequestMethod.POST },produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public WSResult createTape(
			@RequestParam(value = "nfmpgmscheduleid", required = true)Long nfmpgmscheduleid,
			@RequestParam(value = "nfmsubchannelid", required = true)Long nfmsubchannelid,
			@RequestParam(value = "tapename", required = true)String tapename, 
			@RequestParam(value = "productid", required = true)Long productid, 
			@RequestParam(value = "fathertapename", required = true)String fathertapename,
			@RequestParam(value = "childtapename", required = true)String childtapename,
			@RequestParam(value = "createdby", required = true)Long createdby) {
		WSResult result = new WSResult();
		try {
			Validate.notNull(nfmpgmscheduleid, "nfmpgmscheduleid参数为空");
			Validate.notNull(nfmsubchannelid, "nfmsubchannelid参数为空");
			Validate.notNull(productid, "productid参数为空");
			Validate.notNull(fathertapename, "fathertapename参数为空");
			Validate.notNull(childtapename, "childtapename参数为空");
			Validate.notNull(createdby, "createdby参数为空");

			int returncode = pgmManageService.createTape(nfmpgmscheduleid,
					nfmsubchannelid, tapename, productid, fathertapename,
					childtapename, createdby);
			result.setCode(returncode + "");
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@RequestMapping(value = "/chm/programproduct/query", method = { RequestMethod.POST },produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public ProgramdetailsResult queryProgramProductdetails(
			@RequestParam(value = "nfmpgmscheduleid", required = true) Long nfmpgmscheduleid, 
			@RequestParam(value = "productid", required = true)Long productid, 
			@RequestParam(value = "startdate", required = true)String startdate,
			@RequestParam(value = "enddate", required = true) String enddate) {
		ProgramdetailsResult result = new ProgramdetailsResult();
		try {
			if (nfmpgmscheduleid == null && productid == null
				 && StringUtils.isBlank(startdate)
					&& StringUtils.isBlank(enddate)) {
				return result;
			}
			Programdetail programdetail = new Programdetail();
			if (nfmpgmscheduleid != null) {
				programdetail.setNfmpgmscheduleid(nfmpgmscheduleid);
			}

			if (productid != null) {
				programdetail.setProductid(productid);
			}
			
			if (!StringUtils.isBlank(startdate)) {
				programdetail.setStartdate(startdate);
			}
			if (!StringUtils.isBlank(enddate)) {
				programdetail.setEnddate(enddate);
			}
		
			List<Programdetail> programdetails = pgmManageService.livenFmProgProductInfo(programdetail);
			List<ProgramdetailDTO> dtoes = BeanMapper.mapList(programdetails,
					ProgramdetailDTO.class);
			result.setProgramdetails(dtoes);

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
