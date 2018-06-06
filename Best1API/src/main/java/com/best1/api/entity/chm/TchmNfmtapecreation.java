package com.best1.api.entity.chm;

import java.util.Date;

public class TchmNfmtapecreation extends TchmNfmtapecreationKey {

    private Long nfmpgmscheduleid;


    private Integer status;

    private Long createdby;

 
    private Date createdtimestamp;

 
    private Long lastmodifiedby;


    private Date lastmodifiedtimestamp;


    private String manualeditremarks;

  
    private Long childtapeid;

    private Long productid;

	public Long getNfmpgmscheduleid() {
		return nfmpgmscheduleid;
	}

	public void setNfmpgmscheduleid(Long nfmpgmscheduleid) {
		this.nfmpgmscheduleid = nfmpgmscheduleid;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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

	public String getManualeditremarks() {
		return manualeditremarks;
	}

	public void setManualeditremarks(String manualeditremarks) {
		this.manualeditremarks = manualeditremarks;
	}

	public Long getChildtapeid() {
		return childtapeid;
	}

	public void setChildtapeid(Long childtapeid) {
		this.childtapeid = childtapeid;
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}
    
    
    
    
    

}