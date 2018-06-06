package com.best1.api.entity.crm;

import java.util.Date;

public class TcrmCustomerreceive {

    private Long receiveid;


    private Long customerid;

 
    private Long createdby;


    private Date createdtimestamp;

    private Long lastmodifiedby;

 
    private Date lastmodifiedtimestamp;

    private Integer receivetype;


    private Date recvtime;


    private String targetobj;


    private String content;


    private String receiveumber;

   private String smsNumber;
    
    
    private String mobile;
    
    
    
    
	public String getSmsNumber() {
		return smsNumber;
	}


	public void setSmsNumber(String smsNumber) {
		this.smsNumber = smsNumber;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public Long getReceiveid() {
		return receiveid;
	}


	public void setReceiveid(Long receiveid) {
		this.receiveid = receiveid;
	}


	public Long getCustomerid() {
		return customerid;
	}


	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}


	public Long getCreatedby() {
		return createdby;
	}


	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}


	public Date getCreatedtimestamp() {
		return createdtimestamp;
	}


	public void setCreatedtimestamp(Date createdtimestamp) {
		this.createdtimestamp = createdtimestamp;
	}


	public Long getLastmodifiedby() {
		return lastmodifiedby;
	}


	public void setLastmodifiedby(Long lastmodifiedby) {
		this.lastmodifiedby = lastmodifiedby;
	}


	public Date getLastmodifiedtimestamp() {
		return lastmodifiedtimestamp;
	}


	public void setLastmodifiedtimestamp(Date lastmodifiedtimestamp) {
		this.lastmodifiedtimestamp = lastmodifiedtimestamp;
	}


	public Integer getReceivetype() {
		return receivetype;
	}


	public void setReceivetype(Integer receivetype) {
		this.receivetype = receivetype;
	}


	public Date getRecvtime() {
		return recvtime;
	}


	public void setRecvtime(Date recvtime) {
		this.recvtime = recvtime;
	}


	public String getTargetobj() {
		return targetobj;
	}


	public void setTargetobj(String targetobj) {
		this.targetobj = targetobj;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getReceiveumber() {
		return receiveumber;
	}


	public void setReceiveumber(String receiveumber) {
		this.receiveumber = receiveumber;
	}



}