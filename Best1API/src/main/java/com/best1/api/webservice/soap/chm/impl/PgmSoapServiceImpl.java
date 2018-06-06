package com.best1.api.webservice.soap.chm.impl;

import com.best1.api.webservice.soap.chm.PgmSoapService;
import com.best1.api.webservice.soap.oaf.impl.CustomerOrderSoapServiceImpl;
import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.result.chm.PgmProductResult;
import com.best1.api.webservice.soap.response.result.chm.ProgramdetailsResult;
import com.best1.api.webservice.soap.response.result.chm.WebchannelProductselResult;

import java.util.List;

import javax.jws.WebService;

import org.apache.commons.lang3.Validate;
import org.apache.commons.lang.StringUtils;
import org.apache.cxf.feature.Features;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.best1.api.entity.chm.PgmProduct;
import com.best1.api.entity.chm.Programdetail;
import com.best1.api.entity.chm.TchmWebchannelproductsel;
import com.best1.api.service.chm.PgmManageService;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.response.dto.chm.PgmProductDTO;
import com.best1.api.webservice.soap.response.dto.chm.ProgramdetailDTO;
import com.best1.api.webservice.soap.response.dto.chm.WebchannelProductselDTO;
import com.best1.api.webservice.utils.ApiHandleError;
import com.best1.api.webservice.utils.WsConstants;

/**
 * WebService服务端实现类.
 * 
 * 
 */
// serviceName指明WSDL中<wsdl:service>与<wsdl:binding>元素的名称,
// endpointInterface属性指向Interface类全称.
@WebService(serviceName = "PgmService", endpointInterface = "com.best1.api.webservice.soap.chm.PgmSoapService", targetNamespace = WsConstants.NS)
// 增加inbound/outbound SOAP内容的日志
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class PgmSoapServiceImpl implements PgmSoapService {

	private static Logger logger = LoggerFactory
			.getLogger(CustomerOrderSoapServiceImpl.class);

	@Autowired
	private PgmManageService pgmManageService;

	@Override
	public PgmProductResult queryProgram(String starttime, Integer days,
			Long subchannelid) {
		PgmProductResult result = new PgmProductResult();
		try {

			PgmProduct pmg = new PgmProduct();
			Validate.notNull(starttime, "startime参数为空");
			Validate.notNull(days, "days参数为空");
			Validate.notNull(subchannelid, "subchannelid参数为空");
			pmg.setStarttime(starttime);
			pmg.setDays(days);
			pmg.setSubchannelid(subchannelid);
			List<PgmProduct> pgms = pgmManageService.selectPgmProduct(pmg);
			List<PgmProductDTO> dtoes = BeanMapper.mapList(pgms,
					PgmProductDTO.class);
			result.setPgmproducts(dtoes);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			System.out.println("测试信息=" + e.getMessage());
		}
		return null;

	}

	@Override
	public WebchannelProductselResult webProductSelection(Long productid,
			Long createdby, Integer colourcode, Integer colourclass,
			Integer stylecode, Integer styleclass, String starttime,
			Long subchannelid, Integer plannedquantity) {
		WebchannelProductselResult result = new WebchannelProductselResult();
		try {
			Validate.notNull(productid, "productid参数为空");
			Validate.notNull(createdby, "createdby参数为空");
			Validate.notNull(colourcode, "colourcode参数为空");
			Validate.notNull(colourclass, "colourclass参数为空");
			Validate.notNull(stylecode, "stylecode参数为空");
			Validate.notNull(styleclass, "styleclass参数为空");
			Validate.notNull(starttime, "starttime参数为空");
			Validate.notNull(subchannelid, "subchannelid参数为空");
			Validate.notNull(plannedquantity, "plannedquantity参数为空");

			PgmProduct pgminfo = new PgmProduct();
			pgminfo.setProductid(productid);
			pgminfo.setCreatedby(createdby);
			pgminfo.setColourcode(colourcode);
			pgminfo.setColourclass(colourclass);
			pgminfo.setStylecode(stylecode);
			pgminfo.setStyleclass(styleclass);
			pgminfo.setStarttime(starttime);
			pgminfo.setSubchannelid(subchannelid);
			pgminfo.setPlannedquantity(plannedquantity);

			TchmWebchannelproductsel productsel = pgmManageService
					.webProductSelectionable(pgminfo);
			WebchannelProductselDTO dto = BeanMapper.map(productsel,
					WebchannelProductselDTO.class);

			result.setProductsel(dto);

			logger.info("Rtncode:" + productsel.getRtncode());

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
	public ProgramdetailsResult queryProgramdetails(Long nfmpgmscheduleid,
			Long subchannelid, Integer pgmstatus, String startdate,
			String enddate) {
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

	@Override
	public WSResult createTape(Long nfmpgmscheduleid, Long nfmsubchannelid,
			String tapename, Long productid, String fathertapename,
			String childtapename, Long createdby) {
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

	@Override
	public ProgramdetailsResult queryProgramProductdetails(
			Long nfmpgmscheduleid, Long productid, String startdate,
			String enddate) {
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
