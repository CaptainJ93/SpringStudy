package com.best1.api.entity.chm;

import java.util.Date;

import javax.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.best1.api.entity.BaseObject;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Programdetail extends BaseObject{

	private Long nfmpgmscheduleid;
	private Long nfmsubchannelid;
	private Long subchannelid;
	private Long multicodeid;
    private String subchannelname;

	private Integer pgmlength;
	private Long productid;
	private String productname;
	
	private Integer broadcastsequence;
	private Integer plannedduration;
	private String istape;
	
	private String promotionsdesc;
	
	private String fathertypename;

	private String childtypename;

	private Integer status;
	private Integer pgmstatus;
	private Integer productselectionstatus;
	
	
	
	private Date starttime;
	
	private String startdate;
	
	private String enddate;
	
	
	
	private Date pgmstartdate;
	private Date pgmstarttime;
	
	
	private Date prdqstarttime;
	private Integer length;
    private Long orderquantity;
    private Double orderamount;

	
    
    
	public Date getPrdqstarttime() {
		return prdqstarttime;
	}
	public void setPrdqstarttime(Date prdqstarttime) {
		this.prdqstarttime = prdqstarttime;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Long getOrderquantity() {
		return orderquantity;
	}
	public void setOrderquantity(Long orderquantity) {
		this.orderquantity = orderquantity;
	}
	public Double getOrderamount() {
		return orderamount;
	}
	public void setOrderamount(Double orderamount) {
		this.orderamount = orderamount;
	}
	public Date getLivestarttime() {
		return prdqstarttime;
	}
	public void setLivestarttime(Date prdqstarttime) {
		this.prdqstarttime = prdqstarttime;
	}

	public Long getMulticodeid() {
		return multicodeid;
	}
	public void setMulticodeid(Long multicodeid) {
		this.multicodeid = multicodeid;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getPgmstatus() {
		return pgmstatus;
	}
	public void setPgmstatus(Integer pgmstatus) {
		this.pgmstatus = pgmstatus;
	}
	public Integer getProductselectionstatus() {
		return productselectionstatus;
	}
	public void setProductselectionstatus(Integer productselectionstatus) {
		this.productselectionstatus = productselectionstatus;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	
	
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public Long getNfmpgmscheduleid() {
		return nfmpgmscheduleid;
	}
	public void setNfmpgmscheduleid(Long nfmpgmscheduleid) {
		this.nfmpgmscheduleid = nfmpgmscheduleid;
	}
	public Long getNfmsubchannelid() {
		return nfmsubchannelid;
	}
	public void setNfmsubchannelid(Long nfmsubchannelid) {
		this.nfmsubchannelid = nfmsubchannelid;
	}
	public Long getSubchannelid() {
		return subchannelid;
	}
	public void setSubchannelid(Long subchannelid) {
		this.subchannelid = subchannelid;
	}
	public String getSubchannelname() {
		return subchannelname;
	}
	public void setSubchannelname(String subchannelname) {
		this.subchannelname = subchannelname;
	}
	public Date getPgmstartdate() {
		return pgmstartdate;
	}
	public void setPgmstartdate(Date pgmstartdate) {
		this.pgmstartdate = pgmstartdate;
	}
	public Date getPgmstarttime() {
		return pgmstarttime;
	}
	public void setPgmstarttime(Date pgmstarttime) {
		this.pgmstarttime = pgmstarttime;
	}
	public Integer getPgmlength() {
		return pgmlength;
	}
	public void setPgmlength(Integer pgmlength) {
		this.pgmlength = pgmlength;
	}
	public Long getProductid() {
		return productid;
	}
	public void setProductid(Long productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public Integer getBroadcastsequence() {
		return broadcastsequence;
	}
	public void setBroadcastsequence(Integer broadcastsequence) {
		this.broadcastsequence = broadcastsequence;
	}
	public Integer getPlannedduration() {
		return plannedduration;
	}
	public void setPlannedduration(Integer plannedduration) {
		this.plannedduration = plannedduration;
	}
	public String getIstape() {
		return istape;
	}
	public void setIstape(String istape) {
		this.istape = istape;
	}
	public String getPromotionsdesc() {
		return promotionsdesc;
	}
	public void setPromotionsdesc(String promotionsdesc) {
		this.promotionsdesc = promotionsdesc;
	}

	public String getFathertypename() {
		return fathertypename;
	}
	public void setFathertypename(String fathertypename) {
		this.fathertypename = fathertypename;
	}
	public String getChildtypename() {
		return childtypename;
	}
	public void setChildtypename(String childtypename) {
		this.childtypename = childtypename;
	}
	
	
	
}
