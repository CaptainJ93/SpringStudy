package com.best1.api.webservice.soap.response.dto.crm;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.best1.api.webservice.soap.response.dto.BasicDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlRootElement(name = "CustomerAccountBalance")
@JsonInclude(Include.NON_NULL) 
public class CustomerAccountBalanceDTO extends BasicDTO {

	
	private Long customerid;
	private Integer accounttypeid;
	private Long accountno;
	private Double effectivebalance;
	private Long createdby;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	private Date createdtimestamp;
	private Long lastmodifiedby;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	private Date lastmodifiedtimestamp;

	private Long referencevalue;

	private Long companyid;

	private Long accountnumber;

	private Double transactionamount;

	private Date transactiondate;

	private String creditdebitflg;

	private Long productid;

	private Integer referencetypeid;

	private Long multicodeid;

	private Integer transactiondetailsid;

	private Long orderid;

	private Integer itemid;

	private String exceptiondesc;

	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}

	public Integer getAccounttypeid() {
		return accounttypeid;
	}

	public void setAccounttypeid(Integer accounttypeid) {
		this.accounttypeid = accounttypeid;
	}

	public Long getAccountno() {
		return accountno;
	}

	public void setAccountno(Long accountno) {
		this.accountno = accountno;
	}

	public Double getEffectivebalance() {
		return effectivebalance;
	}

	public void setEffectivebalance(Double effectivebalance) {
		this.effectivebalance = effectivebalance;
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

	public Long getReferencevalue() {
		return referencevalue;
	}

	public void setReferencevalue(Long referencevalue) {
		this.referencevalue = referencevalue;
	}

	public Long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}

	public Long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(Long accountnumber) {
		this.accountnumber = accountnumber;
	}

	public Double getTransactionamount() {
		return transactionamount;
	}

	public void setTransactionamount(Double transactionamount) {
		this.transactionamount = transactionamount;
	}

	public Date getTransactiondate() {
		return transactiondate;
	}

	public void setTransactiondate(Date transactiondate) {
		this.transactiondate = transactiondate;
	}

	public String getCreditdebitflg() {
		return creditdebitflg;
	}

	public void setCreditdebitflg(String creditdebitflg) {
		this.creditdebitflg = creditdebitflg;
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public Integer getReferencetypeid() {
		return referencetypeid;
	}

	public void setReferencetypeid(Integer referencetypeid) {
		this.referencetypeid = referencetypeid;
	}

	public Long getMulticodeid() {
		return multicodeid;
	}

	public void setMulticodeid(Long multicodeid) {
		this.multicodeid = multicodeid;
	}

	public Integer getTransactiondetailsid() {
		return transactiondetailsid;
	}

	public void setTransactiondetailsid(Integer transactiondetailsid) {
		this.transactiondetailsid = transactiondetailsid;
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

	public String getExceptiondesc() {
		return exceptiondesc;
	}

	public void setExceptiondesc(String exceptiondesc) {
		this.exceptiondesc = exceptiondesc;
	}

	public void setLastmodifiedtimestamp(Date lastmodifiedtimestamp) {
		this.lastmodifiedtimestamp = lastmodifiedtimestamp;
	}
	
	
	

}
