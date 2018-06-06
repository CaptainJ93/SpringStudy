package com.best1.api.entity.crm;

import java.util.Date;

public class TcrmCustomermessagemarketing {

    private Long marketingid;


    private Long customerid;

    private Long createdby;


    private Date createdtimestamp;

  
    private Long lastmodifiedby;


    private Date lastmodifiedtimestamp;

 
    private String targetobj;

 
    private Integer priority;

 
    private String title;

    private String message;


    private Date planTime;

    
    private Integer status;
    
    private Integer messagetype;
    
    
    

	public Integer getMessagetype() {
		return messagetype;
	}


	public void setMessagetype(Integer messagetype) {
		this.messagetype = messagetype;
	}


	public Long getMarketingid() {
		return marketingid;
	}


	public void setMarketingid(Long marketingid) {
		this.marketingid = marketingid;
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


	public String getTargetobj() {
		return targetobj;
	}


	public void setTargetobj(String targetobj) {
		this.targetobj = targetobj;
	}


	public Integer getPriority() {
		return priority;
	}


	public void setPriority(Integer priority) {
		this.priority = priority;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public Date getPlanTime() {
		return planTime;
	}


	public void setPlanTime(Date planTime) {
		this.planTime = planTime;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}

    
    
    
    
}