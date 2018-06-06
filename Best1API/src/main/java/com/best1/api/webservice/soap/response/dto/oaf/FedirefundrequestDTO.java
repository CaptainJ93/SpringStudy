package com.best1.api.webservice.soap.response.dto.oaf;

import java.util.Date;

import com.best1.api.webservice.soap.response.dto.BasicDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class FedirefundrequestDTO extends BasicDTO {
	private Long refundid;

	private Long customerid;

	private Long orderid;

	private Integer itemid;

	private Long companyid;

	private String companyname;

	private Double refundamount;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	private Date refunddate;

	private String accountno;

	private String accholdername;
	@JsonIgnore
	private String personalid;

	private String hometelephonenumber;

	private Long bankid;

	private String bankcode;

	private String bankname;

	private Long bankrequestid;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	private Date recordcreatedtime;

	private String batchid;

	public Long getRefundid() {
		return refundid;
	}

	public void setRefundid(Long refundid) {
		this.refundid = refundid;
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

	public Long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public Double getRefundamount() {
		return refundamount;
	}

	public void setRefundamount(Double refundamount) {
		this.refundamount = refundamount;
	}

	public Date getRefunddate() {
		return refunddate;
	}

	public void setRefunddate(Date refunddate) {
		this.refunddate = refunddate;
	}

	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}

	public String getAccholdername() {
		return accholdername;
	}

	public void setAccholdername(String accholdername) {
		this.accholdername = accholdername;
	}

	public String getPersonalid() {
		return personalid;
	}

	public void setPersonalid(String personalid) {
		this.personalid = personalid;
	}

	public String getHometelephonenumber() {
		return hometelephonenumber;
	}

	public void setHometelephonenumber(String hometelephonenumber) {
		this.hometelephonenumber = hometelephonenumber;
	}

	public Long getBankid() {
		return bankid;
	}

	public void setBankid(Long bankid) {
		this.bankid = bankid;
	}

	public String getBankcode() {
		return bankcode;
	}

	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public Long getBankrequestid() {
		return bankrequestid;
	}

	public void setBankrequestid(Long bankrequestid) {
		this.bankrequestid = bankrequestid;
	}

	public Date getRecordcreatedtime() {
		return recordcreatedtime;
	}

	public void setRecordcreatedtime(Date recordcreatedtime) {
		this.recordcreatedtime = recordcreatedtime;
	}

	public String getBatchid() {
		return batchid;
	}

	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}
	
	
	

}
