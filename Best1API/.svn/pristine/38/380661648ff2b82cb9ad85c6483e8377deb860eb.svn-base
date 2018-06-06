package com.best1.api.entity.scm.supplier;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.best1.api.entity.BaseObject;

@Entity
@Table(name = "TSCM_SUPPLIERCONTRACTPENDING")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TscmSuppliercontractpendingKey extends BaseObject{
  
    private Long contractno;

 
    private Long supplierrecordid;


	public Long getContractno() {
		return contractno;
	}


	public void setContractno(Long contractno) {
		this.contractno = contractno;
	}


	public Long getSupplierrecordid() {
		return supplierrecordid;
	}


	public void setSupplierrecordid(Long supplierrecordid) {
		this.supplierrecordid = supplierrecordid;
	}

    
}