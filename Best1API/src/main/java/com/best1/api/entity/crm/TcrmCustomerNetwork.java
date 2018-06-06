package com.best1.api.entity.crm;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.best1.api.entity.BaseObject;

@Entity
@Table(name = "Tcrm_Customernetwork")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TcrmCustomerNetwork extends BaseObject{

    private Long customerid;
    private Long createdby;

    private Date createdtimestamp;

    private Long lastmodifiedby;

    private Date lastmodifiedtimestamp;

    private Integer networktype;
    private Integer accountstate;
    private String  networkaccount;
    
    
    private Integer  rtncode;
    private String  rtnmsg;
    
    
    
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
	public Long getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
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
	public Integer getNetworktype() {
		return networktype;
	}
	public void setNetworktype(Integer networktype) {
		this.networktype = networktype;
	}
	public Integer getAccountstate() {
		return accountstate;
	}
	public void setAccountstate(Integer accountstate) {
		this.accountstate = accountstate;
	}
	public String getNetworkaccount() {
		return networkaccount;
	}
	public void setNetworkaccount(String networkaccount) {
		this.networkaccount = networkaccount;
	}
    
    
    
    
}
