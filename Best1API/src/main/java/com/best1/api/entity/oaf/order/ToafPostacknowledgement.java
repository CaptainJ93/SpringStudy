package com.best1.api.entity.oaf.order;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.best1.api.entity.BaseObject;

@Entity
@Table(name = "Toaf_Postacknowledgement")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class ToafPostacknowledgement  extends BaseObject {

    private Long transactionid;

    private String batchstatus;

 
    private Long createdby;

  
    private Date createdtimestamp;

   
    private Long lastmodifiedby;

 
    private Date lastmodifiedtimestamp;


    private Double amountreceived;

  
    private Double amountappropriated;


    private Double excessamount;

   
    private Date entrydate;

   
    private Date transferdate;

    private String matchedtoorder;

    private String payername;

  
    private String remarks;

 
    private String isvalid;

 
    private Long customerid;

 
    private Long orderid;

   
    private String postaccountnumber;


    private String receiptno;

    
    private String rtncode;
    
	private String rtnmsg;
	
	
	

	public String getRtncode() {
		return rtncode;
	}


	public void setRtncode(String rtncode) {
		this.rtncode = rtncode;
	}


	public String getRtnmsg() {
		return rtnmsg;
	}


	public void setRtnmsg(String rtnmsg) {
		this.rtnmsg = rtnmsg;
	}


	public Long getTransactionid() {
		return transactionid;
	}


	public void setTransactionid(Long transactionid) {
		this.transactionid = transactionid;
	}


	public String getBatchstatus() {
		return batchstatus;
	}


	public void setBatchstatus(String batchstatus) {
		this.batchstatus = batchstatus;
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


	public Double getAmountreceived() {
		return amountreceived;
	}


	public void setAmountreceived(Double amountreceived) {
		this.amountreceived = amountreceived;
	}


	public Double getAmountappropriated() {
		return amountappropriated;
	}


	public void setAmountappropriated(Double amountappropriated) {
		this.amountappropriated = amountappropriated;
	}


	public Double getExcessamount() {
		return excessamount;
	}


	public void setExcessamount(Double excessamount) {
		this.excessamount = excessamount;
	}


	public Date getEntrydate() {
		return entrydate;
	}


	public void setEntrydate(Date entrydate) {
		this.entrydate = entrydate;
	}


	public Date getTransferdate() {
		return transferdate;
	}


	public void setTransferdate(Date transferdate) {
		this.transferdate = transferdate;
	}


	public String getMatchedtoorder() {
		return matchedtoorder;
	}


	public void setMatchedtoorder(String matchedtoorder) {
		this.matchedtoorder = matchedtoorder;
	}


	public String getPayername() {
		return payername;
	}


	public void setPayername(String payername) {
		this.payername = payername;
	}


	public String getRemarks() {
		return remarks;
	}


	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}


	public String getIsvalid() {
		return isvalid;
	}


	public void setIsvalid(String isvalid) {
		this.isvalid = isvalid;
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


	public String getPostaccountnumber() {
		return postaccountnumber;
	}


	public void setPostaccountnumber(String postaccountnumber) {
		this.postaccountnumber = postaccountnumber;
	}


	public String getReceiptno() {
		return receiptno;
	}


	public void setReceiptno(String receiptno) {
		this.receiptno = receiptno;
	}

   
    
}