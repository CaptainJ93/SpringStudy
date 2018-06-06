package com.best1.api.entity.cmn;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "Tcmn_User")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TcmnUser {

	private Long userid;

	private Integer location;

	private Long defaultrole;

	private Date startdate;

	private Date enddate;

	private String username;

	private String password;

	private String emailid;

	private String userloginid;

	private Integer status;

	private Date lastpasswordchangedate;

	private Long departmentid;

	private Long designationid;

	private String mobileno;

	private Integer communicationmethod;

	private Long nodeid;

	private String nodename;

	private Long parentnodeid;
	
	private String ctiuserid;
	
	

	public String getCtiuserid() {
		return ctiuserid;
	}

	public void setCtiuserid(String ctiuserid) {
		this.ctiuserid = ctiuserid;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Integer getLocation() {
		return location;
	}

	public void setLocation(Integer location) {
		this.location = location;
	}

	public Long getDefaultrole() {
		return defaultrole;
	}

	public void setDefaultrole(Long defaultrole) {
		this.defaultrole = defaultrole;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getUserloginid() {
		return userloginid;
	}

	public void setUserloginid(String userloginid) {
		this.userloginid = userloginid;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getLastpasswordchangedate() {
		return lastpasswordchangedate;
	}

	public void setLastpasswordchangedate(Date lastpasswordchangedate) {
		this.lastpasswordchangedate = lastpasswordchangedate;
	}

	public Long getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(Long departmentid) {
		this.departmentid = departmentid;
	}

	public Long getDesignationid() {
		return designationid;
	}

	public void setDesignationid(Long designationid) {
		this.designationid = designationid;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public Integer getCommunicationmethod() {
		return communicationmethod;
	}

	public void setCommunicationmethod(Integer communicationmethod) {
		this.communicationmethod = communicationmethod;
	}

	public Long getNodeid() {
		return nodeid;
	}

	public void setNodeid(Long nodeid) {
		this.nodeid = nodeid;
	}

	public String getNodename() {
		return nodename;
	}

	public void setNodename(String nodename) {
		this.nodename = nodename;
	}

	public Long getParentnodeid() {
		return parentnodeid;
	}

	public void setParentnodeid(Long parentnodeid) {
		this.parentnodeid = parentnodeid;
	}

}