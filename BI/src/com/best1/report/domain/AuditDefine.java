package com.best1.report.domain;

import com.best1.base.BasePO;

public class AuditDefine extends BasePO{
	private Long auditId;
	private String auditBusiCode;
	private Long departmentId;
	private String busiStatus;
	private String busiStatusDesc;
	private Long nextAuditId;
	private String nextBusiStatus;
	private String failStatus;
	
	public Long getAuditId() {
		return auditId;
	}
	public void setAuditId(Long auditId) {
		this.auditId = auditId;
	}
	public String getAuditBusiCode() {
		return auditBusiCode;
	}
	public void setAuditBusiCode(String auditBusiCode) {
		this.auditBusiCode = auditBusiCode;
	}
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getBusiStatus() {
		return busiStatus;
	}
	public void setBusiStatus(String busiStatus) {
		this.busiStatus = busiStatus;
	}
	public String getBusiStatusDesc() {
		return busiStatusDesc;
	}
	public void setBusiStatusDesc(String busiStatusDesc) {
		this.busiStatusDesc = busiStatusDesc;
	}
	public Long getNextAuditId() {
		return nextAuditId;
	}
	public void setNextAuditId(Long nextAuditId) {
		this.nextAuditId = nextAuditId;
	}
	public String getNextBusiStatus() {
		return nextBusiStatus;
	}
	public void setNextBusiStatus(String nextBusiStatus) {
		this.nextBusiStatus = nextBusiStatus;
	}
	public String getFailStatus() {
		return failStatus;
	}
	public void setFailStatus(String failStatus) {
		this.failStatus = failStatus;
	}
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
}
