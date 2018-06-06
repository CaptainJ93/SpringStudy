package com.best1.api.entity.crm.campaigndetail;

import java.util.Date;
import java.util.List;

import com.best1.api.entity.BaseObject;


/**
 *  
 * This field corresponds to the database column  TCRM_CAMPAIGNCRITERIAOFFER
 *
 * 
 * 
 */
public class TcrmCampaigncriteriaoffer extends BaseObject{

    private Long offerno;
 
    private Long criteriano;
 
    private Integer offertype;
 
    private String offername;
 
    private Long createdby;
 
    private Date createdtimestamp;
 
    private Object offerproductidlist;
    private List<Includeproductid> offerproductids;
    private Object addnlproductidlist;
    private List<Includeproductid> addnlproductids;
    private Long offervalue;
 
    private Integer discountunitid;
 
    private Long delayedinstallmentperiod;
 
    private Integer delayedinstperiodunit;
 
    private Double additionalvalue;
 
    private Integer additionalvalueunit;
 
    private Integer displayorder;
 
    private Long maximumlimit;

 
    private Date deliverydate;
 
    private String newproduct;
 
    private String giftreturnable;
 
    private String valid;
 
    private Integer noofinstallments;

  
    private Integer offercategory;
 
    private Integer priority;
 
    private Long availed;

 
    private Date lastmodifiedtimestamp;


	public Long getOfferno() {
		return offerno;
	}


	public void setOfferno(Long offerno) {
		this.offerno = offerno;
	}


	public Long getCriteriano() {
		return criteriano;
	}


	public void setCriteriano(Long criteriano) {
		this.criteriano = criteriano;
	}


	public Integer getOffertype() {
		return offertype;
	}


	public void setOffertype(Integer offertype) {
		this.offertype = offertype;
	}


	public String getOffername() {
		return offername;
	}


	public void setOffername(String offername) {
		this.offername = offername;
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


	public Object getOfferproductidlist() {
		return offerproductidlist;
	}


	public void setOfferproductidlist(Object offerproductidlist) {
		this.offerproductidlist = offerproductidlist;
	}


	public Object getAddnlproductidlist() {
		return addnlproductidlist;
	}


	public void setAddnlproductidlist(Object addnlproductidlist) {
		this.addnlproductidlist = addnlproductidlist;
	}


	public Long getOffervalue() {
		return offervalue;
	}


	public void setOffervalue(Long offervalue) {
		this.offervalue = offervalue;
	}


	public Integer getDiscountunitid() {
		return discountunitid;
	}


	public void setDiscountunitid(Integer discountunitid) {
		this.discountunitid = discountunitid;
	}


	public Long getDelayedinstallmentperiod() {
		return delayedinstallmentperiod;
	}


	public void setDelayedinstallmentperiod(Long delayedinstallmentperiod) {
		this.delayedinstallmentperiod = delayedinstallmentperiod;
	}


	public Integer getDelayedinstperiodunit() {
		return delayedinstperiodunit;
	}


	public void setDelayedinstperiodunit(Integer delayedinstperiodunit) {
		this.delayedinstperiodunit = delayedinstperiodunit;
	}


	public Double getAdditionalvalue() {
		return additionalvalue;
	}


	public void setAdditionalvalue(Double additionalvalue) {
		this.additionalvalue = additionalvalue;
	}


	public Integer getAdditionalvalueunit() {
		return additionalvalueunit;
	}


	public void setAdditionalvalueunit(Integer additionalvalueunit) {
		this.additionalvalueunit = additionalvalueunit;
	}


	public Integer getDisplayorder() {
		return displayorder;
	}


	public void setDisplayorder(Integer displayorder) {
		this.displayorder = displayorder;
	}


	public Long getMaximumlimit() {
		return maximumlimit;
	}


	public void setMaximumlimit(Long maximumlimit) {
		this.maximumlimit = maximumlimit;
	}


	public Date getDeliverydate() {
		return deliverydate;
	}


	public void setDeliverydate(Date deliverydate) {
		this.deliverydate = deliverydate;
	}


	public String getNewproduct() {
		return newproduct;
	}


	public void setNewproduct(String newproduct) {
		this.newproduct = newproduct;
	}


	public String getGiftreturnable() {
		return giftreturnable;
	}


	public void setGiftreturnable(String giftreturnable) {
		this.giftreturnable = giftreturnable;
	}


	public String getValid() {
		return valid;
	}


	public void setValid(String valid) {
		this.valid = valid;
	}


	public Integer getNoofinstallments() {
		return noofinstallments;
	}


	public void setNoofinstallments(Integer noofinstallments) {
		this.noofinstallments = noofinstallments;
	}


	public Integer getOffercategory() {
		return offercategory;
	}


	public void setOffercategory(Integer offercategory) {
		this.offercategory = offercategory;
	}


	public Integer getPriority() {
		return priority;
	}


	public void setPriority(Integer priority) {
		this.priority = priority;
	}


	public Long getAvailed() {
		return availed;
	}


	public void setAvailed(Long availed) {
		this.availed = availed;
	}


	public Date getLastmodifiedtimestamp() {
		return lastmodifiedtimestamp;
	}


	public void setLastmodifiedtimestamp(Date lastmodifiedtimestamp) {
		this.lastmodifiedtimestamp = lastmodifiedtimestamp;
	}


	public List<Includeproductid> getOfferproductids() {
		return offerproductids;
	}


	public void setOfferproductids(List<Includeproductid> offerproductids) {
		this.offerproductids = offerproductids;
	}


	public List<Includeproductid> getAddnlproductids() {
		return addnlproductids;
	}


	public void setAddnlproductids(List<Includeproductid> addnlproductids) {
		this.addnlproductids = addnlproductids;
	}
 
    
    
}