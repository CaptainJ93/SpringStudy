package com.best1.api.webservice.soap.response.dto.oaf;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.best1.api.webservice.soap.response.dto.BasicDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL) 
public class OrderDiscounttransactionDTO extends BasicDTO {

	private Long transactionid;

	private Long customerid;

	private String couponserialno;

	private Long coupongroupnumber;

	private Integer coupontype;

	private Integer usage;

	private Long orderid;

	private Integer itemid;

	private Double amount;

	@DateTimeFormat(pattern = "yyyy-MM-dd")  
	private Date transactiondate;

	private Long createdby;

	@DateTimeFormat(pattern = "yyyy-MM-dd h:mm:ss")
	private Date createdtimestamp;

	private Long lastmodifiedby;

	@DateTimeFormat(pattern = "yyyy-MM-dd h:mm:ss")
	private Date lastmodifiedtimestamp;

	private Integer bookletpageno;

	private Long campaignno;

	private String customerusedflag;
	
	private String couponusedflag;

	public String getCouponusedflag() {
		return couponusedflag;
	}

	public void setCouponusedflag(String couponusedflag) {
		this.couponusedflag = couponusedflag;
	}

	public String getCustomerusedflag() {
		return customerusedflag;
	}

	public void setCustomerusedflag(String customerusedflag) {
		this.customerusedflag = customerusedflag;
	}

	public Long getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(Long transactionid) {
		this.transactionid = transactionid;
	}

	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}

	public String getCouponserialno() {
		return couponserialno;
	}

	public void setCouponserialno(String couponserialno) {
		this.couponserialno = couponserialno;
	}

	public Long getCoupongroupnumber() {
		return coupongroupnumber;
	}

	public void setCoupongroupnumber(Long coupongroupnumber) {
		this.coupongroupnumber = coupongroupnumber;
	}

	public Integer getCoupontype() {
		return coupontype;
	}

	public void setCoupontype(Integer coupontype) {
		this.coupontype = coupontype;
	}

	public Integer getUsage() {
		return usage;
	}

	public void setUsage(Integer usage) {
		this.usage = usage;
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

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getTransactiondate() {
		return transactiondate;
	}

	public void setTransactiondate(Date transactiondate) {
		this.transactiondate = transactiondate;
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

	public Integer getBookletpageno() {
		return bookletpageno;
	}

	public void setBookletpageno(Integer bookletpageno) {
		this.bookletpageno = bookletpageno;
	}

	public Long getCampaignno() {
		return campaignno;
	}

	public void setCampaignno(Long campaignno) {
		this.campaignno = campaignno;
	}

}
