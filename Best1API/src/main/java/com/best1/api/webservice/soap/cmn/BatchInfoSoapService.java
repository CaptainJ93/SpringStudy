package com.best1.api.webservice.soap.cmn;

import javax.jws.WebParam;
import javax.jws.WebService;


import com.best1.api.utils.APIConstant;
import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.result.cmn.ApiBatchinfoResult;
import com.best1.api.webservice.utils.WsConstants;

@WebService(name = "BatchInfoService", targetNamespace = WsConstants.NS)
public interface BatchInfoSoapService {
	public ApiBatchinfoResult apiBatchInfo(
			@WebParam(name = APIConstant.BATCHTYPE) String batchtype,
			@WebParam(name=APIConstant.STARTDATE) String startdate,
			@WebParam(name=APIConstant.ENDDATE) String enddate,
			@WebParam(name=APIConstant.BATCHID) String batchid) ;
	
	public WSResult apiBatchInfoDelete(
			@WebParam(name = APIConstant.BATCHTYPE) String batchtype,

			@WebParam(name=APIConstant.BATCHID) String batchid);
}
