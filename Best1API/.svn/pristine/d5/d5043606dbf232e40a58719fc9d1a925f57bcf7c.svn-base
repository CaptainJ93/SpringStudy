package com.best1.api.entity.scm.product;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.best1.api.entity.BaseObject;

@Entity
@Table(name = "Tspm_Productattribute")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TspmProductattribute extends BaseObject {

	// private Long attributeid;

	private Long productid;

	private Integer attributecategoryid;

	private Integer attributevalue;

	private Long createdby;

	private Date createdtimestamp;
	
	private Integer rtncode;

	// public Long getAttributeid() {
	// return attributeid;
	// }
	//
	// public void setAttributeid(Long attributeid) {
	// this.attributeid = attributeid;
	// }

	public Integer getRtncode() {
		return rtncode;
	}

	public void setRtncode(Integer rtncode) {
		this.rtncode = rtncode;
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public Integer getAttributecategoryid() {
		return attributecategoryid;
	}

	public void setAttributecategoryid(Integer attributecategoryid) {
		this.attributecategoryid = attributecategoryid;
	}

	public Integer getAttributevalue() {
		return attributevalue;
	}

	public void setAttributevalue(Integer attributevalue) {
		this.attributevalue = attributevalue;
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