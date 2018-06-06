package com.best1.api.entity.scm.product;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.best1.api.entity.BaseObject;
/**
 * This field corresponds to the database table TSCM_PRODUCTWAREHOUSE
 *
 */
@Entity
@Table(name = "Tscm_Productwarehouse")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TscmProductwarehouse extends BaseObject{

    private Long productwarehouseid;

    private Long productid;

    private Long warehouseid;

    private Long createdby;

    private Date createdtimestamp;

    private Long lastmodifiedby;
    
    private Date lastmodifiedtimestamp;

	public Long getProductwarehouseid() {
		return productwarehouseid;
	}

	public void setProductwarehouseid(Long productwarehouseid) {
		this.productwarehouseid = productwarehouseid;
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public Long getWarehouseid() {
		return warehouseid;
	}

	public void setWarehouseid(Long warehouseid) {
		this.warehouseid = warehouseid;
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