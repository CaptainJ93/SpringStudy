package com.best1.api.webservice.soap.response.dto.oaf;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL) 
public class RefunddetailsDTO {

	  private Long refundid;

	  
	    private Long orderid;

	  
	    private Integer itemid;

	    private Long customerid;

	   
	    private Integer refundmode;

	    private Integer refundstatus;

	  
	    private Integer referencetype;

	 
	    private Long referenceno;

	 
	    private Long createdby;

	    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	    private Date createdtimestamp;

	    private Long lastmodifiedby;

	    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	    private Date lastmodifiedtimestamp;

	 
	    private Long productid;

	  
	    private Long multicodeid;

	  
	    private Long paymentid;

	  
	    private Double refundamount;

	    private Integer productversion;


	    private Date refunddate;

	 
	    private Long company;

	    private Integer originalamount;

		public Long getRefundid() {
			return refundid;
		}

		public void setRefundid(Long refundid) {
			this.refundid = refundid;
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

		public Long getCustomerid() {
			return customerid;
		}

		public void setCustomerid(Long customerid) {
			this.customerid = customerid;
		}

		public Integer getRefundmode() {
			return refundmode;
		}

		public void setRefundmode(Integer refundmode) {
			this.refundmode = refundmode;
		}

		public Integer getRefundstatus() {
			return refundstatus;
		}

		public void setRefundstatus(Integer refundstatus) {
			this.refundstatus = refundstatus;
		}

		public Integer getReferencetype() {
			return referencetype;
		}

		public void setReferencetype(Integer referencetype) {
			this.referencetype = referencetype;
		}

		public Long getReferenceno() {
			return referenceno;
		}

		public void setReferenceno(Long referenceno) {
			this.referenceno = referenceno;
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

		public Long getProductid() {
			return productid;
		}

		public void setProductid(Long productid) {
			this.productid = productid;
		}

		public Long getMulticodeid() {
			return multicodeid;
		}

		public void setMulticodeid(Long multicodeid) {
			this.multicodeid = multicodeid;
		}

		public Long getPaymentid() {
			return paymentid;
		}

		public void setPaymentid(Long paymentid) {
			this.paymentid = paymentid;
		}

		public Double getRefundamount() {
			return refundamount;
		}

		public void setRefundamount(Double refundamount) {
			this.refundamount = refundamount;
		}

		public Integer getProductversion() {
			return productversion;
		}

		public void setProductversion(Integer productversion) {
			this.productversion = productversion;
		}

		public Date getRefunddate() {
			return refunddate;
		}

		public void setRefunddate(Date refunddate) {
			this.refunddate = refunddate;
		}

		public Long getCompany() {
			return company;
		}

		public void setCompany(Long company) {
			this.company = company;
		}

		public Integer getOriginalamount() {
			return originalamount;
		}

		public void setOriginalamount(Integer originalamount) {
			this.originalamount = originalamount;
		}
	    
	    
	    
}
