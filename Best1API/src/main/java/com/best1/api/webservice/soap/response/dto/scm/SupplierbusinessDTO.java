package com.best1.api.webservice.soap.response.dto.scm;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "supplierbusiness")
public class SupplierbusinessDTO {
	private String isdefault;

	private Long createdby;

	private Date createdtimestamp;

	private Long lastmodifiedby;

	private Date lastmodifiedtimestamp;
	
	private Long supplierid;
	
    private Integer businesstype;

	public String getIsdefault() {
		return isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
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

	public Long getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Long supplierid) {
		this.supplierid = supplierid;
	}

	public Integer getBusinesstype() {
		return businesstype;
	}

	public void setBusinesstype(Integer businesstype) {
		this.businesstype = businesstype;
	}

}
