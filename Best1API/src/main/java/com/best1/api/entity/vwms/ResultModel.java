package com.best1.api.entity.vwms;

import java.io.Serializable;


public class ResultModel implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int issucess;
	private String errormsg;
	
	public int getIssucess() {
		return issucess;
	}
	public void setIssucess(int issucess) {
		this.issucess = issucess;
	}
	public String getErrormsg() {
		return errormsg;
	}
	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
}
