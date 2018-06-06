package com.best1.api.entity.crm;

import java.util.Date;

import com.best1.api.entity.BaseObject;

public class TcrmCallworkcode extends BaseObject{
  
    private Long callworkcodeid;

  
    private Long parentcallworkcodeid;

  
    private String callworkcodename;

    private Long createdby;

    
    private Date createdtimestamp;

   
    private Long lastmodifiedby;

  
    private Date lastmodifiedtimestamp;

    private Integer status;


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}


	public Long getCallworkcodeid() {
		return callworkcodeid;
	}


	public void setCallworkcodeid(Long callworkcodeid) {
		this.callworkcodeid = callworkcodeid;
	}


	public Long getParentcallworkcodeid() {
		return parentcallworkcodeid;
	}


	public void setParentcallworkcodeid(Long parentcallworkcodeid) {
		this.parentcallworkcodeid = parentcallworkcodeid;
	}


	public String getCallworkcodename() {
		return callworkcodename;
	}


	public void setCallworkcodename(String callworkcodename) {
		this.callworkcodename = callworkcodename;
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

  
    
    
}