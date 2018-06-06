package com.best1.api.webservice.soap.response.dto.vwms;

import java.util.Date;

import com.best1.api.webservice.soap.response.dto.BasicDTO;

public class WhtransferodconfirmDTO extends BasicDTO{

    private Long interwhorderid;

  
    private Long fromwarehouseid;

    private Long towarehouseid;

   
    private Long productid;

 
    private Integer productversion;

    private Integer colourcode;

   
    private Integer colourclass;

    private Integer stylecode;

    private Integer styleclass;

    
    private Long transferorderqty;

   
    private Long receivedquantity;

    
    private Date receiveddate;

   
    private String messagetype;

    private String reason;

  
    private String shippedproducttype;

   
    private Integer transferstatus;

    
    private Date recordcreatedtime;

   
    private Integer recordstatus;

    
    private Long createdby;


	public Long getInterwhorderid() {
		return interwhorderid;
	}


	public void setInterwhorderid(Long interwhorderid) {
		this.interwhorderid = interwhorderid;
	}


	public Long getFromwarehouseid() {
		return fromwarehouseid;
	}


	public void setFromwarehouseid(Long fromwarehouseid) {
		this.fromwarehouseid = fromwarehouseid;
	}


	public Long getTowarehouseid() {
		return towarehouseid;
	}


	public void setTowarehouseid(Long towarehouseid) {
		this.towarehouseid = towarehouseid;
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


	public Long getTransferorderqty() {
		return transferorderqty;
	}


	public void setTransferorderqty(Long transferorderqty) {
		this.transferorderqty = transferorderqty;
	}


	public Long getReceivedquantity() {
		return receivedquantity;
	}


	public void setReceivedquantity(Long receivedquantity) {
		this.receivedquantity = receivedquantity;
	}


	public Date getReceiveddate() {
		return receiveddate;
	}


	public void setReceiveddate(Date receiveddate) {
		this.receiveddate = receiveddate;
	}


	public String getMessagetype() {
		return messagetype;
	}


	public void setMessagetype(String messagetype) {
		this.messagetype = messagetype;
	}


	public String getReason() {
		return reason;
	}


	public void setReason(String reason) {
		this.reason = reason;
	}


	public String getShippedproducttype() {
		return shippedproducttype;
	}


	public void setShippedproducttype(String shippedproducttype) {
		this.shippedproducttype = shippedproducttype;
	}


	public Integer getTransferstatus() {
		return transferstatus;
	}


	public void setTransferstatus(Integer transferstatus) {
		this.transferstatus = transferstatus;
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
