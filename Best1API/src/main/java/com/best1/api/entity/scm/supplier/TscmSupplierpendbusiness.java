package com.best1.api.entity.scm.supplier;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.best1.api.entity.BaseObject;

/**
 *  This field corresponds to the database table TSCM_SUPPLIERPENDBUSINESS
 * 
 */
@Entity
@Table(name = "TSCM_SUPPLIERPENDBUSINESS")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TscmSupplierpendbusiness extends BaseObject {

    private String isdefault;
    private Integer businesstype;

    private Long supplierrecordid;
    
    private Integer rtncode;
	private String  rtnmsg;

	public Integer getBusinesstype() {
		return businesstype;
	}

	public void setBusinesstype(Integer businesstype) {
		this.businesstype = businesstype;
	}

	public Long getSupplierrecordid() {
		return supplierrecordid;
	}

	public void setSupplierrecordid(Long supplierrecordid) {
		this.supplierrecordid = supplierrecordid;
	}
	public String getIsdefault() {
		return isdefault;
	}
	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}

	public Integer getRtncode() {
		return rtncode;
	}

	public void setRtncode(Integer rtncode) {
		this.rtncode = rtncode;
	}

	public String getRtnmsg() {
		return rtnmsg;
	}

	public void setRtnmsg(String rtnmsg) {
		this.rtnmsg = rtnmsg;
	}
    
}