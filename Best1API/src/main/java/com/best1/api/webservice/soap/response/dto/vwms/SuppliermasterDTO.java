package com.best1.api.webservice.soap.response.dto.vwms;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SuppliermasterDTO {

	private Long supplierid;

	  
    private String suppliercompanyname;

    private String supplierregno;

    private String contactperson;

   
    private String contactpersonnamelogistics;

   
    private String contactpersoncountrycode;

    private String contactpersonareacode;

  
    private String contactpersonphoneno;

    private String contactpersonextension;

  
    private String contactpersonfaxcountrycode;

    private String contactpersonfaxareacode;

 
    private String contactpersonfaxno;

    private String supplierlevel;

  
    private String logisticdetails;

   
    private String contactpersonmobileno;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    private Date recordcreatedtime;

    private String batchid;

	public Long getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Long supplierid) {
		this.supplierid = supplierid;
	}

	public String getSuppliercompanyname() {
		return suppliercompanyname;
	}

	public void setSuppliercompanyname(String suppliercompanyname) {
		this.suppliercompanyname = suppliercompanyname;
	}

	public String getSupplierregno() {
		return supplierregno;
	}

	public void setSupplierregno(String supplierregno) {
		this.supplierregno = supplierregno;
	}

	public String getContactperson() {
		return contactperson;
	}

	public void setContactperson(String contactperson) {
		this.contactperson = contactperson;
	}

	public String getContactpersonnamelogistics() {
		return contactpersonnamelogistics;
	}

	public void setContactpersonnamelogistics(String contactpersonnamelogistics) {
		this.contactpersonnamelogistics = contactpersonnamelogistics;
	}

	public String getContactpersoncountrycode() {
		return contactpersoncountrycode;
	}

	public void setContactpersoncountrycode(String contactpersoncountrycode) {
		this.contactpersoncountrycode = contactpersoncountrycode;
	}

	public String getContactpersonareacode() {
		return contactpersonareacode;
	}

	public void setContactpersonareacode(String contactpersonareacode) {
		this.contactpersonareacode = contactpersonareacode;
	}

	public String getContactpersonphoneno() {
		return contactpersonphoneno;
	}

	public void setContactpersonphoneno(String contactpersonphoneno) {
		this.contactpersonphoneno = contactpersonphoneno;
	}

	public String getContactpersonextension() {
		return contactpersonextension;
	}

	public void setContactpersonextension(String contactpersonextension) {
		this.contactpersonextension = contactpersonextension;
	}

	public String getContactpersonfaxcountrycode() {
		return contactpersonfaxcountrycode;
	}

	public void setContactpersonfaxcountrycode(String contactpersonfaxcountrycode) {
		this.contactpersonfaxcountrycode = contactpersonfaxcountrycode;
	}

	public String getContactpersonfaxareacode() {
		return contactpersonfaxareacode;
	}

	public void setContactpersonfaxareacode(String contactpersonfaxareacode) {
		this.contactpersonfaxareacode = contactpersonfaxareacode;
	}

	public String getContactpersonfaxno() {
		return contactpersonfaxno;
	}

	public void setContactpersonfaxno(String contactpersonfaxno) {
		this.contactpersonfaxno = contactpersonfaxno;
	}

	public String getSupplierlevel() {
		return supplierlevel;
	}

	public void setSupplierlevel(String supplierlevel) {
		this.supplierlevel = supplierlevel;
	}

	public String getLogisticdetails() {
		return logisticdetails;
	}

	public void setLogisticdetails(String logisticdetails) {
		this.logisticdetails = logisticdetails;
	}

	public String getContactpersonmobileno() {
		return contactpersonmobileno;
	}

	public void setContactpersonmobileno(String contactpersonmobileno) {
		this.contactpersonmobileno = contactpersonmobileno;
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
