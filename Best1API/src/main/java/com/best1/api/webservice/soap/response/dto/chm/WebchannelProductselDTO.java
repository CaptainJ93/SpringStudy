package com.best1.api.webservice.soap.response.dto.chm;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "webchannelproductsel")
public class WebchannelProductselDTO {
	private Long webproducttobecampaignedid;

	private Long websubchannelid;

	private Long productid;

	private Integer colourcode;

	private Integer colourclass;

	private Integer stylecode;

	private Integer styleclass;

	private Date startdate;

	private Integer plannedquantity;

	private BigDecimal price;

	private Integer status;

	private Long multicodeid;

	private Date enddate;

	private Long createdby;

	private Date createdtimestamp;

	private Long lastmodifiedby;

	private Date lastmodifiedtimestamp;

	private Integer newversion;

	private Long purchaserequestno;

	private Integer changetype;

	private Integer productversion;

	private Integer producttype;

	private Long parentproductid;

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

	private Integer rtncode;
	private String rtnmsg;

	public Long getWebproducttobecampaignedid() {
		return webproducttobecampaignedid;
	}

	public void setWebproducttobecampaignedid(Long webproducttobecampaignedid) {
		this.webproducttobecampaignedid = webproducttobecampaignedid;
	}

	public Long getWebsubchannelid() {
		return websubchannelid;
	}

	public void setWebsubchannelid(Long websubchannelid) {
		this.websubchannelid = websubchannelid;
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
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

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Integer getPlannedquantity() {
		return plannedquantity;
	}

	public void setPlannedquantity(Integer plannedquantity) {
		this.plannedquantity = plannedquantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getMulticodeid() {
		return multicodeid;
	}

	public void setMulticodeid(Long multicodeid) {
		this.multicodeid = multicodeid;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
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

	public Integer getNewversion() {
		return newversion;
	}

	public void setNewversion(Integer newversion) {
		this.newversion = newversion;
	}

	public Long getPurchaserequestno() {
		return purchaserequestno;
	}

	public void setPurchaserequestno(Long purchaserequestno) {
		this.purchaserequestno = purchaserequestno;
	}

	public Integer getChangetype() {
		return changetype;
	}

	public void setChangetype(Integer changetype) {
		this.changetype = changetype;
	}

	public Integer getProductversion() {
		return productversion;
	}

	public void setProductversion(Integer productversion) {
		this.productversion = productversion;
	}

	public Integer getProducttype() {
		return producttype;
	}

	public void setProducttype(Integer producttype) {
		this.producttype = producttype;
	}

	public Long getParentproductid() {
		return parentproductid;
	}

	public void setParentproductid(Long parentproductid) {
		this.parentproductid = parentproductid;
	}
}
