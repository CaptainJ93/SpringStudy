package com.best1.api.webservice.soap.response.dto.oaf;

import java.util.Date;

import com.best1.api.webservice.soap.response.dto.BasicDTO;
import com.fasterxml.jackson.annotation.JsonFormat;

public class FedirefundresponseDTO extends BasicDTO{
	 private Long companyid;

	   
	    private String bankcode;

	  
	    private Long refundid;

	   
	    private Long customerid;

	   
	    private Double refundamount;

	  
	    private Integer refundstatus;

	   
	    private String transactionsequence;

		@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	    private Date paymentdate;

	  
	    private String payingaccountnumber;

	   
	    private String recipientaccount;

	  
	    private String recipientname;

	  
	    private Long createdby;

		@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	    private Date createdtimestamp;

	  
	    private Long payingbankid;

	 
	    private Long recipientbankid;

	 
	    private String personalid;

	 
	    private Double servicefee;

	 
	    private String businesscode;

	 
	    private String payername;

	    private Long repayid;

		@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	    private Date recordcreatedtime;

	   
	    private Integer recordstatus;

	    
	    

		public Date getRecordcreatedtime() {
			return recordcreatedtime;
		}

		public void setRecordcreatedtime(Date recordcreatedtime) {
			this.recordcreatedtime = recordcreatedtime;
		}

		public Integer getRecordstatus() {
			return recordstatus;
		}

		public void setRecordstatus(Integer recordstatus) {
			this.recordstatus = recordstatus;
		}

		public Long getCompanyid() {
			return companyid;
		}

		public void setCompanyid(Long companyid) {
			this.companyid = companyid;
		}

		public String getBankcode() {
			return bankcode;
		}

		public void setBankcode(String bankcode) {
			this.bankcode = bankcode;
		}

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

		public Double getRefundamount() {
			return refundamount;
		}

		public void setRefundamount(Double refundamount) {
			this.refundamount = refundamount;
		}

		public Integer getRefundstatus() {
			return refundstatus;
		}

		public void setRefundstatus(Integer refundstatus) {
			this.refundstatus = refundstatus;
		}

		public String getTransactionsequence() {
			return transactionsequence;
		}

		public void setTransactionsequence(String transactionsequence) {
			this.transactionsequence = transactionsequence;
		}

		public Date getPaymentdate() {
			return paymentdate;
		}

		public void setPaymentdate(Date paymentdate) {
			this.paymentdate = paymentdate;
		}

		public String getPayingaccountnumber() {
			return payingaccountnumber;
		}

		public void setPayingaccountnumber(String payingaccountnumber) {
			this.payingaccountnumber = payingaccountnumber;
		}

		public String getRecipientaccount() {
			return recipientaccount;
		}

		public void setRecipientaccount(String recipientaccount) {
			this.recipientaccount = recipientaccount;
		}

		public String getRecipientname() {
			return recipientname;
		}

		public void setRecipientname(String recipientname) {
			this.recipientname = recipientname;
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

		public Long getPayingbankid() {
			return payingbankid;
		}

		public void setPayingbankid(Long payingbankid) {
			this.payingbankid = payingbankid;
		}

		public Long getRecipientbankid() {
			return recipientbankid;
		}

		public void setRecipientbankid(Long recipientbankid) {
			this.recipientbankid = recipientbankid;
		}

		public String getPersonalid() {
			return personalid;
		}

		public void setPersonalid(String personalid) {
			this.personalid = personalid;
		}

		public Double getServicefee() {
			return servicefee;
		}

		public void setServicefee(Double servicefee) {
			this.servicefee = servicefee;
		}

		public String getBusinesscode() {
			return businesscode;
		}

		public void setBusinesscode(String businesscode) {
			this.businesscode = businesscode;
		}

		public String getPayername() {
			return payername;
		}

		public void setPayername(String payername) {
			this.payername = payername;
		}

		public Long getRepayid() {
			return repayid;
		}

		public void setRepayid(Long repayid) {
			this.repayid = repayid;
		}

	    
	    
	    
}
