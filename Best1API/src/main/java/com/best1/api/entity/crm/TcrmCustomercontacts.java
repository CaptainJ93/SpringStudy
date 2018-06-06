package com.best1.api.entity.crm;

import java.util.Date;

public class TcrmCustomercontacts {
  
    private Long customercontactsid;


    private Long customerid;

   
    private Long createdby;

    private Date createdtimestamp;

   
    private Long lastmodifiedby;

   
    private Date lastmodifiedtimestamp;

   
    private Integer relationship;

   
    private Integer contacttype;

  
    private String contactnumber;

  
    private Integer status;


	public Long getCustomercontactsid() {
		return customercontactsid;
	}


	public void setCustomercontactsid(Long customercontactsid) {
		this.customercontactsid = customercontactsid;
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


	public Integer getRelationship() {
		return relationship;
	}


	public void setRelationship(Integer relationship) {
		this.relationship = relationship;
	}


	public Integer getContacttype() {
		return contacttype;
	}


	public void setContacttype(Integer contacttype) {
		this.contacttype = contacttype;
	}


	public String getContactnumber() {
		return contactnumber;
	}


	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}


	public Integer getStatus() {
		return status;
	}


	public void setStatus(Integer status) {
		this.status = status;
	}

    
    
    
}