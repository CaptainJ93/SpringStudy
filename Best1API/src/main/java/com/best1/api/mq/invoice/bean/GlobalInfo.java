package com.best1.api.mq.invoice.bean;

public class GlobalInfo {

private String appId;

private String interfaceId;

private String interfaceCode;


private String requestCode;

private String requestTime;

private String responseCode;

private String dataExchangeId;


public String getAppId() {
	return appId;
}

public void setAppId(String appId) {
	this.appId = appId;
}

public String getInterfaceId() {
	return interfaceId;
}

public void setInterfaceId(String interfaceId) {
	this.interfaceId = interfaceId;
}

public String getInterfaceCode() {
	return interfaceCode;
}

public void setInterfaceCode(String interfaceCode) {
	this.interfaceCode = interfaceCode;
}

public String getRequestCode() {
	return requestCode;
}

public void setRequestCode(String requestCode) {
	this.requestCode = requestCode;
}

public String getRequestTime() {
	return requestTime;
}

public void setRequestTime(String requestTime) {
	this.requestTime = requestTime;
}

public String getResponseCode() {
	return responseCode;
}

public void setResponseCode(String responseCode) {
	this.responseCode = responseCode;
}

public String getDataExchangeId() {
	return dataExchangeId;
}

public void setDataExchangeId(String dataExchangeId) {
	this.dataExchangeId = dataExchangeId;
}




}
