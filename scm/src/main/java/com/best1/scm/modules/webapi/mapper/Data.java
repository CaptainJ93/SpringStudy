package com.best1.scm.modules.webapi.mapper;

import java.io.Serializable;
import java.util.Date;

public class Data implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5899757804667427481L;
	private Date time;
	private String context;
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	@Override
	public String toString() {
		return "Data [time=" + time + ", context=" + context + "]";
	}
	
}
