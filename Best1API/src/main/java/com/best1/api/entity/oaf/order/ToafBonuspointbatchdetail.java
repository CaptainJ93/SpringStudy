package com.best1.api.entity.oaf.order;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.best1.api.entity.BaseObject;

@Entity
@Table(name = "toaf_bonuspointbatch_detail")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ToafBonuspointbatchdetail extends BaseObject {

	private Long sequenceid;
	private Long runbatchid;
	private Long customerid;
	private Long orderid;
	private Integer itemid;
	private Double bounspointamount;
	private Long companyid;
	private Long createdby;
	private Date createdtimestamp;
	private Long relationid;
	private Long lastmodifiedby;
	private Date lastmodifiedtimestamp;
	private Integer checkresult;
	private Date startdate;
	private Date enddate;
	public Long getSequenceid() {
		return sequenceid;
	}
	public void setSequenceid(Long sequenceid) {
		this.sequenceid = sequenceid;
	}
	public Long getRunbatchid() {
		return runbatchid;
	}
	public void setRunbatchid(Long runbatchid) {
		this.runbatchid = runbatchid;
	}
	public Long getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}
	public Long getOrderid() {
		return orderid;
	}
	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}
	public Integer getItemid() {
		return itemid;
	}
	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}
	public Double getBounspointamount() {
		return bounspointamount;
	}
	public void setBounspointamount(Double bounspointamount) {
		this.bounspointamount = bounspointamount;
	}
	public Long getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
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
	public Long getRelationid() {
		return relationid;
	}
	public void setRelationid(Long relationid) {
		this.relationid = relationid;
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
	public Integer getCheckresult() {
		return checkresult;
	}
	public void setCheckresult(Integer checkresult) {
		this.checkresult = checkresult;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	
	
	
	

}
