package com.best1.api.entity.oaf.order;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.best1.api.entity.BaseObject;

@Entity
@Table(name = "toaf_bonuspointbatch")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ToafBonuspointbatch extends BaseObject {

	private Integer transactiontype;
	private Integer account_reference_type;
	private Integer transaction_details;
	private String batchcomment;
	private Integer importresult;
	private Long createdby;
	private Long lastmodifiedby;
	private Date createdtimestamp;
	private Date lastmodifiedtimestamp;
	private Long runbatchid;
	public Integer getTransactiontype() {
		return transactiontype;
	}
	public void setTransactiontype(Integer transactiontype) {
		this.transactiontype = transactiontype;
	}
	public Integer getAccount_reference_type() {
		return account_reference_type;
	}
	public void setAccount_reference_type(Integer account_reference_type) {
		this.account_reference_type = account_reference_type;
	}
	public Integer getTransaction_details() {
		return transaction_details;
	}
	public void setTransaction_details(Integer transaction_details) {
		this.transaction_details = transaction_details;
	}
	public String getBatchcomment() {
		return batchcomment;
	}
	public void setBatchcomment(String batchcomment) {
		this.batchcomment = batchcomment;
	}
	public Integer getImportresult() {
		return importresult;
	}
	public void setImportresult(Integer importresult) {
		this.importresult = importresult;
	}
	public Long getCreatedby() {
		return createdby;
	}
	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}
	public Long getLastmodifiedby() {
		return lastmodifiedby;
	}
	public void setLastmodifiedby(Long lastmodifiedby) {
		this.lastmodifiedby = lastmodifiedby;
	}
	public Date getCreatedtimestamp() {
		return createdtimestamp;
	}
	public void setCreatedtimestamp(Date createdtimestamp) {
		this.createdtimestamp = createdtimestamp;
	}
	public Date getLastmodifiedtimestamp() {
		return lastmodifiedtimestamp;
	}
	public void setLastmodifiedtimestamp(Date lastmodifiedtimestamp) {
		this.lastmodifiedtimestamp = lastmodifiedtimestamp;
	}
	public Long getRunbatchid() {
		return runbatchid;
	}
	public void setRunbatchid(Long runbatchid) {
		this.runbatchid = runbatchid;
	}
	
	
	
	

}
