package com.best1.api.entity.cmn;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.best1.api.entity.BaseObject;
@Entity
@Table(name = "TCMN_BATCHREQUEST")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TcmnBatchrequest extends BaseObject {
	
	private Long requestid;
	private String batchid;
	private Date rundate;
	private Long requestedby;
	private Date requestedtimestamp;
	private Integer requeststatus;
	private Long noofrecordsprocessed;
	private Long nooferrorrecords;
	private String errorfilename;
	private String reportfilename;
	public Long getRequestid() {
		return requestid;
	}
	public void setRequestid(Long requestid) {
		this.requestid = requestid;
	}
	public String getBatchid() {
		return batchid;
	}
	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}
	public Date getRundate() {
		return rundate;
	}
	public void setRundate(Date rundate) {
		this.rundate = rundate;
	}
	public Long getRequestedby() {
		return requestedby;
	}
	public void setRequestedby(Long requestedby) {
		this.requestedby = requestedby;
	}
	public Date getRequestedtimestamp() {
		return requestedtimestamp;
	}
	public void setRequestedtimestamp(Date requestedtimestamp) {
		this.requestedtimestamp = requestedtimestamp;
	}
	public Integer getRequeststatus() {
		return requeststatus;
	}
	public void setRequeststatus(Integer requeststatus) {
		this.requeststatus = requeststatus;
	}
	public Long getNoofrecordsprocessed() {
		return noofrecordsprocessed;
	}
	public void setNoofrecordsprocessed(Long noofrecordsprocessed) {
		this.noofrecordsprocessed = noofrecordsprocessed;
	}
	public Long getNooferrorrecords() {
		return nooferrorrecords;
	}
	public void setNooferrorrecords(Long nooferrorrecords) {
		this.nooferrorrecords = nooferrorrecords;
	}
	public String getErrorfilename() {
		return errorfilename;
	}
	public void setErrorfilename(String errorfilename) {
		this.errorfilename = errorfilename;
	}
	public String getReportfilename() {
		return reportfilename;
	}
	public void setReportfilename(String reportfilename) {
		this.reportfilename = reportfilename;
	}
	
	
	
	

}
