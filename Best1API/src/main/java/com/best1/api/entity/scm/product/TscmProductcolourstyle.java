package com.best1.api.entity.scm.product;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.best1.api.entity.BaseObject;
/**
 * 
 * This field corresponds to the database table TSCM_PRODUCTCOLOURSTYLE
 *
 * 
 */
@Entity
@Table(name = "TSCM_PRODUCTCOLOURSTYLE")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TscmProductcolourstyle  extends BaseObject{

    private Long colourstyleid;
 
    private Long productid;

    private Integer colourcode;

    private Integer stylecode;
 
    private Integer colourclass;
 
    private Integer styleclass;
 
    private String forsale;

    private Long createdby;

    private Date createdtimestamp;

    private Long lastmodifiedby;

    private Date lastmodifiedtimestamp;

    private Long quantity;

    private Long forsalelastmodifiedby;

    private Date forsalelastmodifiedtimestamp;

    /**TSCM_PRODUCTLOGISTIC**/
    private Integer salestype;
    
    private String colourname;
    private String stylename;
    private Integer productversion;
    private Integer productavailaleqty;
    private Integer productmaxqty;
    private Integer rtncode;
    private String  rtnmsg;
    
    
    
    
    
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

	public Integer getProductversion() {
		return productversion;
	}

	public void setProductversion(Integer productversion) {
		this.productversion = productversion;
	}

	public Integer getProductavailaleqty() {
		return productavailaleqty;
	}

	public void setProductavailaleqty(Integer productavailaleqty) {
		this.productavailaleqty = productavailaleqty;
	}

	public Integer getProductmaxqty() {
		return productmaxqty;
	}

	public void setProductmaxqty(Integer productmaxqty) {
		this.productmaxqty = productmaxqty;
	}

	public Long getColourstyleid() {
		return colourstyleid;
	}

	public void setColourstyleid(Long colourstyleid) {
		this.colourstyleid = colourstyleid;
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

	public Integer getStylecode() {
		return stylecode;
	}

	public void setStylecode(Integer stylecode) {
		this.stylecode = stylecode;
	}

	public Integer getColourclass() {
		return colourclass;
	}

	public void setColourclass(Integer colourclass) {
		this.colourclass = colourclass;
	}

	public Integer getStyleclass() {
		return styleclass;
	}

	public void setStyleclass(Integer styleclass) {
		this.styleclass = styleclass;
	}

	public String getForsale() {
		return forsale;
	}

	public void setForsale(String forsale) {
		this.forsale = forsale;
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

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getForsalelastmodifiedby() {
		return forsalelastmodifiedby;
	}

	public void setForsalelastmodifiedby(Long forsalelastmodifiedby) {
		this.forsalelastmodifiedby = forsalelastmodifiedby;
	}

	public Date getForsalelastmodifiedtimestamp() {
		return forsalelastmodifiedtimestamp;
	}

	public void setForsalelastmodifiedtimestamp(Date forsalelastmodifiedtimestamp) {
		this.forsalelastmodifiedtimestamp = forsalelastmodifiedtimestamp;
	}

	public Integer getSalestype() {
		return salestype;
	}

	public void setSalestype(Integer salestype) {
		this.salestype = salestype;
	}

	public String getColourname() {
		return colourname;
	}

	public void setColourname(String colourname) {
		this.colourname = colourname;
	}

	public String getStylename() {
		return stylename;
	}

	public void setStylename(String stylename) {
		this.stylename = stylename;
	}

	
}