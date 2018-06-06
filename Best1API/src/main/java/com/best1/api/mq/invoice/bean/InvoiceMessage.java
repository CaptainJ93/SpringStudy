package com.best1.api.mq.invoice.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InvoiceMessage {
private GlobalInfo globalInfo;
private ReturnStateInfo  returnstateinfo;
@JsonProperty("Data")
private Data data;

public GlobalInfo getGlobalInfo() {
	return globalInfo;
}

public void setGlobalInfo(GlobalInfo globalInfo) {
	this.globalInfo = globalInfo;
}

public ReturnStateInfo getReturnstateinfo() {
	return returnstateinfo;
}

public void setReturnstateinfo(ReturnStateInfo returnstateinfo) {
	this.returnstateinfo = returnstateinfo;
}

public Data getData() {
	return data;
}

public void setData(Data data) {
	this.data = data;
}




}
