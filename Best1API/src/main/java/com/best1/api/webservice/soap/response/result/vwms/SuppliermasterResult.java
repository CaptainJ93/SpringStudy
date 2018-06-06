package com.best1.api.webservice.soap.response.result.vwms;

import java.util.List;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.vwms.SuppliermasterDTO;

public class SuppliermasterResult  extends WSResult{
	
private List<SuppliermasterDTO> suppliermasters;

public List<SuppliermasterDTO> getSuppliermasters() {
	return suppliermasters;
}

public void setSuppliermasters(List<SuppliermasterDTO> suppliermasters) {
	this.suppliermasters = suppliermasters;
}


}
