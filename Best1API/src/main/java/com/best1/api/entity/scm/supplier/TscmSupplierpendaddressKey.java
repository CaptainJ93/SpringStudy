package com.best1.api.entity.scm.supplier;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.best1.api.entity.BaseObject;


@Entity
@Table(name = "TSCM_SUPPLIERPENDADDRESS")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TscmSupplierpendaddressKey extends BaseObject {

 
    private Long supplierrecordid;

    
    private Integer addresstype;

  
    private Integer addresssequence;


	public Long getSupplierrecordid() {
		return supplierrecordid;
	}


	public void setSupplierrecordid(Long supplierrecordid) {
		this.supplierrecordid = supplierrecordid;
	}


	public Integer getAddresstype() {
		return addresstype;
	}


	public void setAddresstype(Integer addresstype) {
		this.addresstype = addresstype;
	}


	public Integer getAddresssequence() {
		return addresssequence;
	}


	public void setAddresssequence(Integer addresssequence) {
		this.addresssequence = addresssequence;
	}



}