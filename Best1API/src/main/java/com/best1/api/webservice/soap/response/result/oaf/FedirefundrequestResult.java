package com.best1.api.webservice.soap.response.result.oaf;

import java.util.List;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.oaf.FedirefundrequestDTO;

public class FedirefundrequestResult extends WSResult {
	
private List<FedirefundrequestDTO>  fedirefundrequests;

public List<FedirefundrequestDTO> getFedirefundrequests() {
	return fedirefundrequests;
}

public void setFedirefundrequests(List<FedirefundrequestDTO> fedirefundrequests) {
	this.fedirefundrequests = fedirefundrequests;
}




}
