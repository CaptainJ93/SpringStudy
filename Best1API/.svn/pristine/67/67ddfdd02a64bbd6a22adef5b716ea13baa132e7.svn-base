package com.best1.api.webservice.soap.chm;


import javax.jws.WebParam;
import javax.jws.WebService;











import com.best1.api.utils.APIConstant;
import com.best1.api.utils.SCMConstant;
import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.result.chm.PgmProductResult;
import com.best1.api.webservice.soap.response.result.chm.ProgramdetailsResult;
import com.best1.api.webservice.soap.response.result.chm.WebchannelProductselResult;
import com.best1.api.webservice.utils.WsConstants;

/**
 * JAX-WS2.0的WebService接口定义类.
 * 
 * 使用JAX-WS2.0 annotation设置WSDL中的定义. 使用WSResult及其子类类包裹返回结果.
 * 使用DTO传输对象隔绝系统内部领域对象的修改对外系统的影响.
 * 
 * 
 */
@WebService(name = "PgmService", targetNamespace = WsConstants.NS)
public interface PgmSoapService {

	/**
	 * 根据时间，天数，通路，查询PGM信息
	 * **/
	public PgmProductResult queryProgram(
			@WebParam(name = APIConstant.STARTTIME) String starttime,
			@WebParam(name = APIConstant.DAYS) Integer days,
			@WebParam(name = APIConstant.SUBCHANNELID) Long subchannelid);
	
	/**
	 * 上架
	 * 
	 * @return PgmProductInfoResult
	 */
	public WebchannelProductselResult webProductSelection(
			@WebParam(name = SCMConstant.PRODUCTID) Long productid,
			@WebParam(name = SCMConstant.CREATEDBY) Long createdby,
			@WebParam(name = SCMConstant.COLOURCODE) Integer colourcode,
			@WebParam(name = SCMConstant.COLOURCLASS) Integer colourclass,
			@WebParam(name = SCMConstant.STYLECODE) Integer stylecode,
			@WebParam(name = SCMConstant.STYLECLASS) Integer styleclass,
			@WebParam(name = APIConstant.STARTTIME) String starttime,
			@WebParam(name = SCMConstant.SUBCHANNELID) Long subchannelid,
			@WebParam(name = SCMConstant.PLANNEDQUANTITY) Integer plannedquantity);
	
	
	public ProgramdetailsResult queryProgramdetails( 
			@WebParam(name = APIConstant.NFMPGMSCHEDULEID)  Long nfmpgmscheduleid,
			@WebParam(name = APIConstant.SUBCHANNELID) Long subchannelid,
			@WebParam(name = APIConstant.PGMSTATUS) Integer pgmstatus,
			@WebParam(name = APIConstant.STARTDATE) String startdate,
			@WebParam(name = APIConstant.ENDDATE) String enddate);
	
	
	public WSResult createTape(
			@WebParam(name = APIConstant.NFMPGMSCHEDULEID) Long nfmpgmscheduleid,
			@WebParam(name = APIConstant.NFMSUBCHANNELID) Long nfmsubchannelid,
			@WebParam(name = APIConstant.TAPENAME) String tapename,
			@WebParam(name = APIConstant.PRODUCTID) Long productid,
			@WebParam(name = APIConstant.FATHERTAPENAME) String fathertapename,
			@WebParam(name = APIConstant.CHILDTAPENAME) String childtapename,
			@WebParam(name = SCMConstant.CREATEDBY) Long createdby);
	
	
	public ProgramdetailsResult queryProgramProductdetails( 
			@WebParam(name = APIConstant.NFMPGMSCHEDULEID)  Long nfmpgmscheduleid,
			@WebParam(name = APIConstant.PRODUCTID) Long productid,
			@WebParam(name = APIConstant.STARTDATE) String startdate,
			@WebParam(name = APIConstant.ENDDATE) String enddate);
	
}
