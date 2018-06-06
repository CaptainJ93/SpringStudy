package com.best1.api.entity.scm.product;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.best1.api.entity.BaseObject;
/**
 * 
 * This field corresponds to the database  table TSCM_PRODUCTLOGISTIC
 *
 * 
 */
@Entity
@Table(name = "Tscm_Productlogistic")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TscmProductlogistic  extends BaseObject{

    private Long productlogisticpackid;

    private Long productid;

    private Long createdby;

    private Date createdtimestamp;

    private Long lastmodifiedby;

    private Date lastmodifiedtimestamp;

    private Integer leadtime;

    private Integer salestype;
 
    private Integer deliverytype;
 
    private Integer returntype;
 
    private Double widthbeforepacking;
 
    private Double widthafterpacking;
 
    private Double heightbeforepacking;
 
    private Double heightafterpacking;
 
    private Double lengthbeforepacking;
 
    private Double lengthafterpacking;
 
    private Double weightbeforepacking;
 
    private Double weightafterpacking;

    private Long quantityperbox;

    private Integer storagetype;

    private String returnallowed;

    private String replaceallowed;

    private String exchangeallowed;

    private String consolidationallowed;

    private String specialpackaging;

    private String singlepackaging;

    private String offshoredelivery;

    private String packagingunit;

    private String notesfordelivery;

    private Integer temperature;
 
    private Integer subdeliverytype;
 
    private Integer subreturntype;
 
    private String boxid;
 
    private String onedayship;

	public Long getProductlogisticpackid() {
		return productlogisticpackid;
	}

	public void setProductlogisticpackid(Long productlogisticpackid) {
		this.productlogisticpackid = productlogisticpackid;
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
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

	public Integer getLeadtime() {
		return leadtime;
	}

	public void setLeadtime(Integer leadtime) {
		this.leadtime = leadtime;
	}

	public Integer getSalestype() {
		return salestype;
	}

	public void setSalestype(Integer salestype) {
		this.salestype = salestype;
	}

	public Integer getDeliverytype() {
		return deliverytype;
	}

	public void setDeliverytype(Integer deliverytype) {
		this.deliverytype = deliverytype;
	}

	public Integer getReturntype() {
		return returntype;
	}

	public void setReturntype(Integer returntype) {
		this.returntype = returntype;
	}

	public Double getWidthbeforepacking() {
		return widthbeforepacking;
	}

	public void setWidthbeforepacking(Double widthbeforepacking) {
		this.widthbeforepacking = widthbeforepacking;
	}

	public Double getWidthafterpacking() {
		return widthafterpacking;
	}

	public void setWidthafterpacking(Double widthafterpacking) {
		this.widthafterpacking = widthafterpacking;
	}

	public Double getHeightbeforepacking() {
		return heightbeforepacking;
	}

	public void setHeightbeforepacking(Double heightbeforepacking) {
		this.heightbeforepacking = heightbeforepacking;
	}

	public Double getHeightafterpacking() {
		return heightafterpacking;
	}

	public void setHeightafterpacking(Double heightafterpacking) {
		this.heightafterpacking = heightafterpacking;
	}

	public Double getLengthbeforepacking() {
		return lengthbeforepacking;
	}

	public void setLengthbeforepacking(Double lengthbeforepacking) {
		this.lengthbeforepacking = lengthbeforepacking;
	}

	public Double getLengthafterpacking() {
		return lengthafterpacking;
	}

	public void setLengthafterpacking(Double lengthafterpacking) {
		this.lengthafterpacking = lengthafterpacking;
	}

	public Double getWeightbeforepacking() {
		return weightbeforepacking;
	}

	public void setWeightbeforepacking(Double weightbeforepacking) {
		this.weightbeforepacking = weightbeforepacking;
	}

	public Double getWeightafterpacking() {
		return weightafterpacking;
	}

	public void setWeightafterpacking(Double weightafterpacking) {
		this.weightafterpacking = weightafterpacking;
	}

	public Long getQuantityperbox() {
		return quantityperbox;
	}

	public void setQuantityperbox(Long quantityperbox) {
		this.quantityperbox = quantityperbox;
	}

	public Integer getStoragetype() {
		return storagetype;
	}

	public void setStoragetype(Integer storagetype) {
		this.storagetype = storagetype;
	}

	public String getReturnallowed() {
		return returnallowed;
	}

	public void setReturnallowed(String returnallowed) {
		this.returnallowed = returnallowed;
	}

	public String getReplaceallowed() {
		return replaceallowed;
	}

	public void setReplaceallowed(String replaceallowed) {
		this.replaceallowed = replaceallowed;
	}

	public String getExchangeallowed() {
		return exchangeallowed;
	}

	public void setExchangeallowed(String exchangeallowed) {
		this.exchangeallowed = exchangeallowed;
	}

	public String getConsolidationallowed() {
		return consolidationallowed;
	}

	public void setConsolidationallowed(String consolidationallowed) {
		this.consolidationallowed = consolidationallowed;
	}

	public String getSpecialpackaging() {
		return specialpackaging;
	}

	public void setSpecialpackaging(String specialpackaging) {
		this.specialpackaging = specialpackaging;
	}

	public String getSinglepackaging() {
		return singlepackaging;
	}

	public void setSinglepackaging(String singlepackaging) {
		this.singlepackaging = singlepackaging;
	}

	public String getOffshoredelivery() {
		return offshoredelivery;
	}

	public void setOffshoredelivery(String offshoredelivery) {
		this.offshoredelivery = offshoredelivery;
	}

	public String getPackagingunit() {
		return packagingunit;
	}

	public void setPackagingunit(String packagingunit) {
		this.packagingunit = packagingunit;
	}

	public String getNotesfordelivery() {
		return notesfordelivery;
	}

	public void setNotesfordelivery(String notesfordelivery) {
		this.notesfordelivery = notesfordelivery;
	}

	public Integer getTemperature() {
		return temperature;
	}

	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}

	public Integer getSubdeliverytype() {
		return subdeliverytype;
	}

	public void setSubdeliverytype(Integer subdeliverytype) {
		this.subdeliverytype = subdeliverytype;
	}

	public Integer getSubreturntype() {
		return subreturntype;
	}

	public void setSubreturntype(Integer subreturntype) {
		this.subreturntype = subreturntype;
	}

	public String getBoxid() {
		return boxid;
	}

	public void setBoxid(String boxid) {
		this.boxid = boxid;
	}

	public String getOnedayship() {
		return onedayship;
	}

	public void setOnedayship(String onedayship) {
		this.onedayship = onedayship;
	}

    
}