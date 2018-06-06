package com.best1.api.entity.scm.spm;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.best1.api.entity.BaseObject;
/**
 * 
 * This field corresponds to the database table TSPM_PRODUCTGENERAL
 *
 * 
 */

@Entity
@Table(name = "Tspm_Productgeneral")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TspmProductgeneral extends BaseObject{

    private Long productmiscinfoid;

    private Long productid;

    private Integer generalinfocode;

    private Integer commentsequence;

    private String comments;

    private String commenttype;

    private Long createdby;

    private Date createdtimestamp;

    private Long lastmodifiedby;

    private Date lastmodifiedtimestamp;
    
    private Integer rtncode;

	public Integer getRtncode() {
		return rtncode;
	}

	public void setRtncode(Integer rtncode) {
		this.rtncode = rtncode;
	}

	public Long getProductmiscinfoid() {
		return productmiscinfoid;
	}

	public void setProductmiscinfoid(Long productmiscinfoid) {
		this.productmiscinfoid = productmiscinfoid;
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public Integer getGeneralinfocode() {
		return generalinfocode;
	}

	public void setGeneralinfocode(Integer generalinfocode) {
		this.generalinfocode = generalinfocode;
	}

	public Integer getCommentsequence() {
		return commentsequence;
	}

	public void setCommentsequence(Integer commentsequence) {
		this.commentsequence = commentsequence;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCommenttype() {
		return commenttype;
	}

	public void setCommenttype(String commenttype) {
		this.commenttype = commenttype;
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

}