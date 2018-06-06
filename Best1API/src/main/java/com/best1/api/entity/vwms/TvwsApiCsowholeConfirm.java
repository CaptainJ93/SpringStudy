package com.best1.api.entity.vwms;

import java.util.Date;

import com.best1.api.entity.BaseObject;

public class TvwsApiCsowholeConfirm extends BaseObject{
  
    private Long warehouseid;
 
  
    private Long shiporderid;

 
    private Integer shipordersequence;

 
    private Long productid;

   
    private Integer productversion;

   
    private Integer colourclass;

    
    private Integer colourcode;

   
    private Integer styleclass;

    private Integer stylecode;

    
    private Long productquantity;

    
    private Long intransitquantity;

   
    private Date actualshippeddate;

   
    private Long selectedcarrier;

   
    private String deliverynumber;

    
    private String reason;

    
    private Integer csostatus;

    
    private String deliveryarea;

    
    private Date recordcreatedtime;

   
    private Integer recordstatus;

    
    private Long  createdby;
    
    

	public Long getCreatedby() {
		return createdby;
	}


	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}


	public Long getWarehouseid() {
		return warehouseid;
	}


	public void setWarehouseid(Long warehouseid) {
		this.warehouseid = warehouseid;
	}


	public Long getShiporderid() {
		return shiporderid;
	}


	public void setShiporderid(Long shiporderid) {
		this.shiporderid = shiporderid;
	}


	public Integer getShipordersequence() {
		return shipordersequence;
	}


	public void setShipordersequence(Integer shipordersequence) {
		this.shipordersequence = shipordersequence;
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


	public Integer getColourclass() {
		return colourclass;
	}


	public void setColourclass(Integer colourclass) {
		this.colourclass = colourclass;
	}


	public Integer getColourcode() {
		return colourcode;
	}


	public void setColourcode(Integer colourcode) {
		this.colourcode = colourcode;
	}


	public Integer getStyleclass() {
		return styleclass;
	}


	public void setStyleclass(Integer styleclass) {
		this.styleclass = styleclass;
	}


	public Integer getStylecode() {
		return stylecode;
	}


	public void setStylecode(Integer stylecode) {
		this.stylecode = stylecode;
	}


	public Long getProductquantity() {
		return productquantity;
	}


	public void setProductquantity(Long productquantity) {
		this.productquantity = productquantity;
	}


	public Long getIntransitquantity() {
		return intransitquantity;
	}


	public void setIntransitquantity(Long intransitquantity) {
		this.intransitquantity = intransitquantity;
	}


	public Date getActualshippeddate() {
		return actualshippeddate;
	}


	public void setActualshippeddate(Date actualshippeddate) {
		this.actualshippeddate = actualshippeddate;
	}


	public Long getSelectedcarrier() {
		return selectedcarrier;
	}


	public void setSelectedcarrier(Long selectedcarrier) {
		this.selectedcarrier = selectedcarrier;
	}


	public String getDeliverynumber() {
		return deliverynumber;
	}


	public void setDeliverynumber(String deliverynumber) {
		this.deliverynumber = deliverynumber;
	}


	public String getReason() {
		return reason;
	}


	public void setReason(String reason) {
		this.reason = reason;
	}


	public Integer getCsostatus() {
		return csostatus;
	}


	public void setCsostatus(Integer csostatus) {
		this.csostatus = csostatus;
	}


	public String getDeliveryarea() {
		return deliveryarea;
	}


	public void setDeliveryarea(String deliveryarea) {
		this.deliveryarea = deliveryarea;
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
    
    
    

    
}