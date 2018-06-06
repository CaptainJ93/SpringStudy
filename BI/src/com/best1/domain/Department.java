package com.best1.domain;

import java.util.Date;

import com.best1.base.BasePO;


public class Department extends BasePO{

	
	private Long departmentId;
	private String departmentName;
	private Long departmentPid;
	private Long createdby;
	private Date createDate;
	private Long lastmodifyby;
	private Date lastModifyDate;
	
	
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Long getDepartmentPid() {
		return departmentPid;
	}
	public void setDepartmentPid(Long departmentPid) {
		this.departmentPid = departmentPid;
	}
	public Long getCreatedby() {
		return createdby;
	}
	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Long getLastmodifyby() {
		return lastmodifyby;
	}
	public void setLastmodifyby(Long lastmodifyby) {
		this.lastmodifyby = lastmodifyby;
	}
	public Date getLastModifyDate() {
		return lastModifyDate;
	}
	public void setLastModifyDate(Date lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
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
