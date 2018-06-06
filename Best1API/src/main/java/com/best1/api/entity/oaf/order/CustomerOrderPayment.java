package com.best1.api.entity.oaf.order;

import java.util.Date;

import com.best1.api.entity.BaseObject;

public class CustomerOrderPayment extends BaseObject{
	
	private Integer ordertype;

	private Long companyid;

	private Long multicodeid;

	private Integer paymentstatus;

	private Integer orderstatus;

	private String iscodpayment;

	private Integer colourcode;

	private Integer colourclass;

	private Integer stylecode;

	private Integer styleclass;

	private Double servicefee;

	private Double bonuspointsgained;

	private Double discountamount;

	private Double offshoredeliverycharges;

	private Double productamount;

	private String productname;

	private String customername;

	private String receivername;

	private Double sellingprice;
	
	private Integer paymentmodeid;
	
	private Long orderid;

	private Integer itemid;

	private Long productid;

	private Integer productversion;

	private Long customerid;

	private Double paymentamount ;
	
	private Double balanceamount ;
	
	private Long paymentid;
	
		
	private Long createdby;

	private Date createdtimestamp;

	private Long lastmodifiedby;

	private Date lastmodifiedtimestamp;
	
	private String payeename;
	private String transferaccno;
	private String payableto;
	private Long bankid;
	private String callnumber;
	
	
	private Integer rtncode;
	
	private String  rtnmsg;
	
	
	
	

	public String getPayableto() {
		return payableto;
	}

	public void setPayableto(String payableto) {
		this.payableto = payableto;
	}

	public String getPayeename() {
		return payeename;
	}

	public void setPayeename(String payeename) {
		this.payeename = payeename;
	}

	public String getTransferaccno() {
		return transferaccno;
	}

	public void setTransferaccno(String transferaccno) {
		this.transferaccno = transferaccno;
	}

	public Long getBankid() {
		return bankid;
	}

	public void setBankid(Long bankid) {
		this.bankid = bankid;
	}

	public String getCallnumber() {
		return callnumber;
	}

	public void setCallnumber(String callnumber) {
		this.callnumber = callnumber;
	}

	public Integer getOrdertype() {
		return ordertype;
	}

	public void setOrdertype(Integer ordertype) {
		this.ordertype = ordertype;
	}

	public Long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}

	public Long getMulticodeid() {
		return multicodeid;
	}

	public void setMulticodeid(Long multicodeid) {
		this.multicodeid = multicodeid;
	}

	public Integer getPaymentstatus() {
		return paymentstatus;
	}

	public void setPaymentstatus(Integer paymentstatus) {
		this.paymentstatus = paymentstatus;
	}

	public Integer getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(Integer orderstatus) {
		this.orderstatus = orderstatus;
	}

	public String getIscodpayment() {
		return iscodpayment;
	}

	public void setIscodpayment(String iscodpayment) {
		this.iscodpayment = iscodpayment;
	}

	public Integer getColourcode() {
		return colourcode;
	}

	public void setColourcode(Integer colourcode) {
		this.colourcode = colourcode;
	}

	public Integer getColourclass() {
		return colourclass;
	}

	public void setColourclass(Integer colourclass) {
		this.colourclass = colourclass;
	}

	public Integer getStylecode() {
		return stylecode;
	}

	public void setStylecode(Integer stylecode) {
		this.stylecode = stylecode;
	}

	public Integer getStyleclass() {
		return styleclass;
	}

	public void setStyleclass(Integer styleclass) {
		this.styleclass = styleclass;
	}

	public Double getServicefee() {
		return servicefee;
	}

	public void setServicefee(Double servicefee) {
		this.servicefee = servicefee;
	}

	public Double getBonuspointsgained() {
		return bonuspointsgained;
	}

	public void setBonuspointsgained(Double bonuspointsgained) {
		this.bonuspointsgained = bonuspointsgained;
	}

	public Double getDiscountamount() {
		return discountamount;
	}

	public void setDiscountamount(Double discountamount) {
		this.discountamount = discountamount;
	}

	public Double getOffshoredeliverycharges() {
		return offshoredeliverycharges;
	}

	public void setOffshoredeliverycharges(Double offshoredeliverycharges) {
		this.offshoredeliverycharges = offshoredeliverycharges;
	}

	public Double getProductamount() {
		return productamount;
	}

	public void setProductamount(Double productamount) {
		this.productamount = productamount;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getReceivername() {
		return receivername;
	}

	public void setReceivername(String receivername) {
		this.receivername = receivername;
	}

	public Double getSellingprice() {
		return sellingprice;
	}

	public void setSellingprice(Double sellingprice) {
		this.sellingprice = sellingprice;
	}

	public Integer getPaymentmodeid() {
		return paymentmodeid;
	}

	public void setPaymentmodeid(Integer paymentmodeid) {
		this.paymentmodeid = paymentmodeid;
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

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public Integer getProductversion() {
		return productversion;
	}

	public void setProductversion(Integer productversion) {
		this.productversion = productversion;
	}

	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}

	public Double getPaymentamount() {
		return paymentamount;
	}

	public void setPaymentamount(Double paymentamount) {
		this.paymentamount = paymentamount;
	}

	public Double getBalanceamount() {
		return balanceamount;
	}

	public void setBalanceamount(Double balanceamount) {
		this.balanceamount = balanceamount;
	}

	public Long getPaymentid() {
		return paymentid;
	}

	public void setPaymentid(Long paymentid) {
		this.paymentid = paymentid;
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
