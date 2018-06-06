package com.best1.api.entity.scm.supplier;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.best1.api.entity.BaseObject;

@Entity
@Table(name = "TSCM_SUPPLIERDELIVERYPENDING")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TscmSupplierdeliverypending extends BaseObject {

  
    private Long supplierrecordid;

 
    private Integer deliveryterm;

    
    private Long createdby;

  
    private Date createdtimestamp;


	public Long getSupplierrecordid() {
		return supplierrecordid;
	}


	public void setSupplierrecordid(Long supplierrecordid) {
		this.supplierrecordid = supplierrecordid;
	}


	public Integer getDeliveryterm() {
		return deliveryterm;
	}


	public void setDeliveryterm(Integer deliveryterm) {
		this.deliveryterm = deliveryterm;
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

  
 
}