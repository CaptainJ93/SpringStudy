package com.best1.api.webservice.soap.response.result.chm;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.chm.WebchannelProductselDTO;
import com.best1.api.webservice.utils.WsConstants;

@XmlType(name = "webchannelProductselResult", namespace = WsConstants.NS)
public class WebchannelProductselResult extends WSResult {
	private WebchannelProductselDTO productsel;

	public WebchannelProductselResult() {
	}

	public WebchannelProductselResult(WebchannelProductselDTO productsel) {
		this.productsel = productsel;
	}

	@XmlElement(name = "webchannelproductsel")
	public WebchannelProductselDTO getProductsel() {
		return productsel;
	}

	public void setProductsel(WebchannelProductselDTO productsel) {
		this.productsel = productsel;
	}
}
