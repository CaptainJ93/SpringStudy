package com.best1.api.entity.vwms;

import java.util.Date;

import com.best1.api.entity.BaseObject;

public class TvwsApiProductdetail extends BaseObject{
    private Long warehouseid;


    private Long productid;

  
    private Integer productversion;

   
    private Integer colourcode;

    
    private Integer colourclass;

  
    private Integer stylecode;

    private Integer styleclass;

  
    private Integer commentsequence;

 
    private String comments;

  
    private Date recordcreatedtime;

  
    private String batchid;


	public Long getWarehouseid() {
		return warehouseid;
	}


	public void setWarehouseid(Long warehouseid) {
		this.warehouseid = warehouseid;
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


	public Date getRecordcreatedtime() {
		return recordcreatedtime;
	}


	public void setRecordcreatedtime(Date recordcreatedtime) {
		this.recordcreatedtime = recordcreatedtime;
	}


	public String getBatchid() {
		return batchid;
	}


	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}

    
    
    
  
}