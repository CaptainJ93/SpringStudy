package com.best1.api.entity.scm.spm;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.best1.api.entity.BaseObject;

/**
 *  This field corresponds to the database table TCMN_SPMUSER
 * 
 */
@Entity
@Table(name = "TCMN_SPMUSER")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TcmnSpmuser extends BaseObject{

    private Long userid;

    private String userloginid;
 
    private Date startdate;
 
    private Date enddate;
 
    private String password;
 
    private String username;
 
    private Long roleid;
 
    private Integer communicationtype;
 
    private String mobileno;
 
    private String emailid;
 
    private Integer status;
 
    private Long createdby;
 
    private Date createdtimestamp;
 
    private Long lastmodifiedby;
 
    private Date lastmodifiedtimestamp;

    private Integer availabletrypasscount;
 
    private Integer passwordinterval;
 
    private String lockstatus;
 
    private Date lockstartdatetime;
 
    private Integer lockinterval;
 
    private Integer trypasscount;
 
    private Date passwordcreateddatetime;
 
    private Integer logmaximum;
    
    private Integer rtncode;
    
	private String  rtnmsg;

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getUserloginid() {
		return userloginid;
	}

	public void setUserloginid(String userloginid) {
		this.userloginid = userloginid;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getRoleid() {
		return roleid;
	}

	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}

	public Integer getCommunicationtype() {
		return communicationtype;
	}

	public void setCommunicationtype(Integer communicationtype) {
		this.communicationtype = communicationtype;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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

	public Integer getAvailabletrypasscount() {
		return availabletrypasscount;
	}

	public void setAvailabletrypasscount(Integer availabletrypasscount) {
		this.availabletrypasscount = availabletrypasscount;
	}

	public Integer getPasswordinterval() {
		return passwordinterval;
	}

	public void setPasswordinterval(Integer passwordinterval) {
		this.passwordinterval = passwordinterval;
	}

	public String getLockstatus() {
		return lockstatus;
	}

	public void setLockstatus(String lockstatus) {
		this.lockstatus = lockstatus;
	}

	public Date getLockstartdatetime() {
		return lockstartdatetime;
	}

	public void setLockstartdatetime(Date lockstartdatetime) {
		this.lockstartdatetime = lockstartdatetime;
	}

	public Integer getLockinterval() {
		return lockinterval;
	}

	public void setLockinterval(Integer lockinterval) {
		this.lockinterval = lockinterval;
	}

	public Integer getTrypasscount() {
		return trypasscount;
	}

	public void setTrypasscount(Integer trypasscount) {
		this.trypasscount = trypasscount;
	}

	public Date getPasswordcreateddatetime() {
		return passwordcreateddatetime;
	}

	public void setPasswordcreateddatetime(Date passwordcreateddatetime) {
		this.passwordcreateddatetime = passwordcreateddatetime;
	}

	public Integer getLogmaximum() {
		return logmaximum;
	}

	public void setLogmaximum(Integer logmaximum) {
		this.logmaximum = logmaximum;
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