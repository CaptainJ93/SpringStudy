package com.best1.scm.modules.webapi.entity;

import java.util.Date;

public class ExpressCarrierInfo {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	private String trackingnumber;
	private Long carrierid;
	private String apicode;

	private Integer deliveryType;
	private Integer deliverySubtype;
	private Date recordcreatedtimeStart;

	private Integer trackingstatus;
	private Date receiptorrejecttime;
	private Date lastupdatedtime;
	
	private Date time;
	
	private String pathdesc;
	private Date pathdatetime;
	private String receiptperson;
	private Date recordcreatedtime;
	private Integer recordcreatedby;
	private Integer deliverycode; 
	
	public Date getLastupdatedtime() {
		return lastupdatedtime;
	}
	public void setLastupdatedtime(Date lastupdatedtime) {
		this.lastupdatedtime = lastupdatedtime;
	}
	public Integer getDeliverycode() {
		return deliverycode;
	}
	public void setDeliverycode(Integer deliverycode) {
		this.deliverycode = deliverycode;
	}
	public String getPathdesc() {
		return pathdesc;
	}
	public void setPathdesc(String pathdesc) {
		this.pathdesc = pathdesc;
	}
	public Date getPathdatetime() {
		return pathdatetime;
	}
	public void setPathdatetime(Date pathdatetime) {
		this.pathdatetime = pathdatetime;
	}
	public String getReceiptperson() {
		return receiptperson;
	}
	public void setReceiptperson(String receiptperson) {
		this.receiptperson = receiptperson;
	}
	public Date getRecordcreatedtime() {
		return recordcreatedtime;
	}
	public void setRecordcreatedtime(Date recordcreatedtime) {
		this.recordcreatedtime = recordcreatedtime;
	}
	public Integer getRecordcreatedby() {
		return recordcreatedby;
	}
	public void setRecordcreatedby(Integer recordcreatedby) {
		this.recordcreatedby = recordcreatedby;
	}
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

	private String context;
	
	public Integer getTrackingstatus() {
		return trackingstatus;
	}
	public void setTrackingstatus(Integer scmTrackingStatus) {
		this.trackingstatus = scmTrackingStatus;
	}
	public Date getReceiptorrejecttime() {
		return receiptorrejecttime;
	}
	public void setReceiptorrejecttime(Date receiptorrejecttime) {
		this.receiptorrejecttime = receiptorrejecttime;
	}
	
	public String getTrackingnumber() {
		return trackingnumber;
	}

	public void setTrackingnumber(String trackingnumber) {
		this.trackingnumber = trackingnumber;
	}

	public Long getCarrierid() {
		return carrierid;
	}

	public void setCarrierid(Long carrierid) {
		this.carrierid = carrierid;
	}

	public String getApicode() {
		return apicode;
	}

	public void setApicode(String apicode) {
		this.apicode = apicode;
	}

	public Integer getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(Integer deliveryType) {
		this.deliveryType = deliveryType;
	}

	public Integer getDeliverySubtype() {
		return deliverySubtype;
	}

	public void setDeliverySubtype(Integer deliverySubtype) {
		this.deliverySubtype = deliverySubtype;
	}

	public Date getRecordcreatedtimeStart() {
		return recordcreatedtimeStart;
	}

	public void setRecordcreatedtimeStart(Date recordcreatedtimeStart) {
		this.recordcreatedtimeStart = recordcreatedtimeStart;
	}

}
