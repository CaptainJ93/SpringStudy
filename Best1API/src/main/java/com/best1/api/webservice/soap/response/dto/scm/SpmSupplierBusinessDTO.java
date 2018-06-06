package com.best1.api.webservice.soap.response.dto.scm;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="spmsupplierbusiness")
public class SpmSupplierBusinessDTO {

	private String isdefault;
	private Integer businesstype;
	private Long supplierrecordid;
	private Integer rtncode;
	private String  rtnmsg;

	public String getIsdefault() {
		return isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}

	public Integer getBusinesstype() {
		return businesstype;
	}

	public void setBusinesstype(Integer businesstype) {
		this.businesstype = businesstype;
	}

	public Long getSupplierrecordid() {
		return supplierrecordid;
	}

	public void setSupplierrecordid(Long supplierrecordid) {
		this.supplierrecordid = supplierrecordid;
	}

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
	
}
