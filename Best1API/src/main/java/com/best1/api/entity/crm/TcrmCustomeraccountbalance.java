package com.best1.api.entity.crm;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


@Entity
@Table(name = "TCRM_CUSTOMERACCOUNTBALANCE")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TcrmCustomeraccountbalance extends TcrmCustomeraccountbalanceKey {

    private Double effectivebalance;

  
    private Long createdby;

    
    private Date createdtimestamp;

    private Long lastmodifiedby;

 
    private Date lastmodifiedtimestamp;


	public Double getEffectivebalance() {
		return effectivebalance;
	}


	public void setEffectivebalance(Double effectivebalance) {
		this.effectivebalance = effectivebalance;
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