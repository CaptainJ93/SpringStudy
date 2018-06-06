package com.best1.api.webservice.soap.response.dto.vwms;

import java.util.Date;

import com.best1.api.webservice.soap.response.dto.BasicDTO;
import com.fasterxml.jackson.annotation.JsonFormat;

public class SuppliershipconfirmDTO extends BasicDTO {

	private Long warehouseid;

	private Long suppliershiporderid;

	private Long productid;

	private Integer productversion;

	private Integer colourcode;

	private Integer colourclass;

	private Integer stylecode;

	private Integer styleclass;

	private Long recievedquantity;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	private Date arrivaldate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	private Date receivedtime;

	private Integer ssostatus;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	private Date recordcreatedtime;

	private Integer recordstatus;

	private Long createdby;

	public Long getWarehouseid() {
		return warehouseid;
	}

	public void setWarehouseid(Long warehouseid) {
		this.warehouseid = warehouseid;
	}

	public Long getSuppliershiporderid() {
		return suppliershiporderid;
	}

	public void setSuppliershiporderid(Long suppliershiporderid) {
		this.suppliershiporderid = suppliershiporderid;
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public Integer getProductversion() {
		return productversion;
	}

	public void setProductversion(Integer productversion) {
		this.productversion = productversion;
	}

	public Integer getColourcode() {
		return colourcode;
	}

	public void setColourcode(Integer colourcode) {
		this.colourcode = colourcode;
	}

	public Integer getColourclass() {
		return colourclass;
	}

	public void setColourclass(Integer colourclass) {
		this.colourclass = colourclass;
	}

	public Integer getStylecode() {
		return stylecode;
	}

	public void setStylecode(Integer stylecode) {
		this.stylecode = stylecode;
	}

	public Integer getStyleclass() {
		return styleclass;
	}

	public void setStyleclass(Integer styleclass) {
		this.styleclass = styleclass;
	}

	public Long getRecievedquantity() {
		return recievedquantity;
	}

	public void setRecievedquantity(Long recievedquantity) {
		this.recievedquantity = recievedquantity;
	}

	public Date getArrivaldate() {
		return arrivaldate;
	}

	public void setArrivaldate(Date arrivaldate) {
		this.arrivaldate = arrivaldate;
	}

	public Date getReceivedtime() {
		return receivedtime;
	}

	public void setReceivedtime(Date receivedtime) {
		this.receivedtime = receivedtime;
	}

	public Integer getSsostatus() {
		return ssostatus;
	}

	public void setSsostatus(Integer ssostatus) {
		this.ssostatus = ssostatus;
	}

	public Date getRecordcreatedtime() {
		return recordcreatedtime;
	}

	public void setRecordcreatedtime(Date recordcreatedtime) {
		this.recordcreatedtime = recordcreatedtime;
	}

	public Integer getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(Integer recordstatus) {
		this.recordstatus = recordstatus;
	}

	public Long getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}

}
