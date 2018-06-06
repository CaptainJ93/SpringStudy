package com.best1.api.entity.scm.supplier;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.best1.api.entity.BaseObject;


@Entity
@Table(name = "TSCM_SUPPLIERBUSINESS")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TscmSupplierbusinessKey extends BaseObject {

    private Long supplierid;


    private Integer businesstype;


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