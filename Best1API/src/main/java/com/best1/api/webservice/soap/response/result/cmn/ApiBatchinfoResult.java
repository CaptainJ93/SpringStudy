package com.best1.api.webservice.soap.response.result.cmn;

import java.util.List;


import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.cmn.ApiBatchinfoDTO;

public class ApiBatchinfoResult extends WSResult{
private List<ApiBatchinfoDTO> apiBatchinfoes;

public List<ApiBatchinfoDTO> getApiBatchinfoes() {
	return apiBatchinfoes;
}

public void setApiBatchinfoes(List<ApiBatchinfoDTO> apiBatchinfoes) {
	this.apiBatchinfoes = apiBatchinfoes;
}




}
