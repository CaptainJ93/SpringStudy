package com.best1.api.webservice.soap.response.dto.scm;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "productimage")
public class ProductimageDTO {
	private Long productid;

    private Integer productversion;

    private Long spmproductid;

    private Long imagekey;

    private String imagepath;

    private Integer status;


    private String imagedescrption;

    private Integer imagetype;


    private String orginalfilename;

    private Long lastmodifiedby;


    private Date lastmodifiedtimestamp;


    private Long createdby;

    private Date createdtimestamp;
    
    private Integer rtncode;
    
    public Integer getRtncode() {
		return rtncode;
	}

	public void setRtncode(Integer rtncode) {
		this.rtncode = rtncode;
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

	public Long getSpmproductid() {
		return spmproductid;
	}

	public void setSpmproductid(Long spmproductid) {
		this.spmproductid = spmproductid;
	}

	public Long getImagekey() {
		return imagekey;
	}

	public void setImagekey(Long imagekey) {
		this.imagekey = imagekey;
	}

	public String getImagepath() {
		return imagepath;
	}

	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getImagedescrption() {
		return imagedescrption;
	}

	public void setImagedescrption(String imagedescrption) {
		this.imagedescrption = imagedescrption;
	}

	public Integer getImagetype() {
		return imagetype;
	}

	public void setImagetype(Integer imagetype) {
		this.imagetype = imagetype;
	}

	public String getOrginalfilename() {
		return orginalfilename;
	}

	public void setOrginalfilename(String orginalfilename) {
		this.orginalfilename = orginalfilename;
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


}
