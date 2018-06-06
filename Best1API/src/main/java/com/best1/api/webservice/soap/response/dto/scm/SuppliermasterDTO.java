package com.best1.api.webservice.soap.response.dto.scm;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "suppliermaster")
public class SuppliermasterDTO {
	private Long supplierid;

	private Integer version;

	private Long assigneduserid;

	private Long groupid;

	private Integer supplierstatus;

	private Integer supplierlevel;

	private Integer permissiongrantstatus;

	private Integer preferredcontactmethod;

	private Integer noofemployees;

	private Long noofproductsdealt;

	private Long turnoverpreviousyear;

	private Long revenuegenerated;

	private Integer paymentmethod;

	private Long maxloadqty;

	private Integer paymentday;

	private String hascod;

	private String hassignedcontract;

	private Long defaultproductname;

	private String contactperson;

	private String contactpersonrole;

	private String contactdepartment;

	private String contactpersonemailid;

	private String registrationdoneby;

	private String suppliercompanyname;

	private String companyhomepage;

	private String contactpersonnamefinance;

	private String accountholdername;

	private String contactpersonnamelogistics;

	private String suppliername;

	private String representativename;

	private String accountno;

	private Long createdby;

	private Date createdtimestamp;

	private Long lastmodifiedby;

	private Date lastmodifiedtimestamp;

	private Date foundationday;

	private Date permissiongrantdate;

	private String supervisorname;

	private String otherdetailsfinance;

	private String logisticdetails;

	private String contactpersoncountrycode;

	private String contactpersonareacode;

	private String contactpersonphoneno;

	private String contactpersonextension;

	private String contactpersonfaxcountrycode;

	private String contactpersonfaxareacode;

	private String contactpersonfaxno;

	private String contactpersonmobileno;

	private Long bankid;

	private String productdetails;

	private String supplierregno;

	private Integer withPki;

	private String superior;

	private Date supplierlastmodifiedtimestamp;

	private String smscontactname;

	private String smscontactphoneno;

	private String smflag;

	private String smcontactperson;

	private String smcontactmobile;

	private String smnote;

	private String ignoreseminar;

	public Long getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Long supplierid) {
		this.supplierid = supplierid;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Long getAssigneduserid() {
		return assigneduserid;
	}

	public void setAssigneduserid(Long assigneduserid) {
		this.assigneduserid = assigneduserid;
	}

	public Long getGroupid() {
		return groupid;
	}

	public void setGroupid(Long groupid) {
		this.groupid = groupid;
	}

	public Integer getSupplierstatus() {
		return supplierstatus;
	}

	public void setSupplierstatus(Integer supplierstatus) {
		this.supplierstatus = supplierstatus;
	}

	public Integer getSupplierlevel() {
		return supplierlevel;
	}

	public void setSupplierlevel(Integer supplierlevel) {
		this.supplierlevel = supplierlevel;
	}

	public Integer getPermissiongrantstatus() {
		return permissiongrantstatus;
	}

	public void setPermissiongrantstatus(Integer permissiongrantstatus) {
		this.permissiongrantstatus = permissiongrantstatus;
	}

	public Integer getPreferredcontactmethod() {
		return preferredcontactmethod;
	}

	public void setPreferredcontactmethod(Integer preferredcontactmethod) {
		this.preferredcontactmethod = preferredcontactmethod;
	}

	public Integer getNoofemployees() {
		return noofemployees;
	}

	public void setNoofemployees(Integer noofemployees) {
		this.noofemployees = noofemployees;
	}

	public Long getNoofproductsdealt() {
		return noofproductsdealt;
	}

	public void setNoofproductsdealt(Long noofproductsdealt) {
		this.noofproductsdealt = noofproductsdealt;
	}

	public Long getTurnoverpreviousyear() {
		return turnoverpreviousyear;
	}

	public void setTurnoverpreviousyear(Long turnoverpreviousyear) {
		this.turnoverpreviousyear = turnoverpreviousyear;
	}

	public Long getRevenuegenerated() {
		return revenuegenerated;
	}

	public void setRevenuegenerated(Long revenuegenerated) {
		this.revenuegenerated = revenuegenerated;
	}

	public Integer getPaymentmethod() {
		return paymentmethod;
	}

	public void setPaymentmethod(Integer paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	public Long getMaxloadqty() {
		return maxloadqty;
	}

	public void setMaxloadqty(Long maxloadqty) {
		this.maxloadqty = maxloadqty;
	}

	public Integer getPaymentday() {
		return paymentday;
	}

	public void setPaymentday(Integer paymentday) {
		this.paymentday = paymentday;
	}

	public String getHascod() {
		return hascod;
	}

	public void setHascod(String hascod) {
		this.hascod = hascod;
	}

	public String getHassignedcontract() {
		return hassignedcontract;
	}

	public void setHassignedcontract(String hassignedcontract) {
		this.hassignedcontract = hassignedcontract;
	}

	public Long getDefaultproductname() {
		return defaultproductname;
	}

	public void setDefaultproductname(Long defaultproductname) {
		this.defaultproductname = defaultproductname;
	}

	public String getContactperson() {
		return contactperson;
	}

	public void setContactperson(String contactperson) {
		this.contactperson = contactperson;
	}

	public String getContactpersonrole() {
		return contactpersonrole;
	}

	public void setContactpersonrole(String contactpersonrole) {
		this.contactpersonrole = contactpersonrole;
	}

	public String getContactdepartment() {
		return contactdepartment;
	}

	public void setContactdepartment(String contactdepartment) {
		this.contactdepartment = contactdepartment;
	}

	public String getContactpersonemailid() {
		return contactpersonemailid;
	}

	public void setContactpersonemailid(String contactpersonemailid) {
		this.contactpersonemailid = contactpersonemailid;
	}

	public String getRegistrationdoneby() {
		return registrationdoneby;
	}

	public void setRegistrationdoneby(String registrationdoneby) {
		this.registrationdoneby = registrationdoneby;
	}

	public String getSuppliercompanyname() {
		return suppliercompanyname;
	}

	public void setSuppliercompanyname(String suppliercompanyname) {
		this.suppliercompanyname = suppliercompanyname;
	}

	public String getCompanyhomepage() {
		return companyhomepage;
	}

	public void setCompanyhomepage(String companyhomepage) {
		this.companyhomepage = companyhomepage;
	}

	public String getContactpersonnamefinance() {
		return contactpersonnamefinance;
	}

	public void setContactpersonnamefinance(String contactpersonnamefinance) {
		this.contactpersonnamefinance = contactpersonnamefinance;
	}

	public String getAccountholdername() {
		return accountholdername;
	}

	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}

	public String getContactpersonnamelogistics() {
		return contactpersonnamelogistics;
	}

	public void setContactpersonnamelogistics(String contactpersonnamelogistics) {
		this.contactpersonnamelogistics = contactpersonnamelogistics;
	}

	public String getSuppliername() {
		return suppliername;
	}

	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}

	public String getRepresentativename() {
		return representativename;
	}

	public void setRepresentativename(String representativename) {
		this.representativename = representativename;
	}

	public String getAccountno() {
		return accountno;
	}

	public void setAccountno(String accountno) {
		this.accountno = accountno;
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

	public Date getFoundationday() {
		return foundationday;
	}

	public void setFoundationday(Date foundationday) {
		this.foundationday = foundationday;
	}

	public Date getPermissiongrantdate() {
		return permissiongrantdate;
	}

	public void setPermissiongrantdate(Date permissiongrantdate) {
		this.permissiongrantdate = permissiongrantdate;
	}

	public String getSupervisorname() {
		return supervisorname;
	}

	public void setSupervisorname(String supervisorname) {
		this.supervisorname = supervisorname;
	}

	public String getOtherdetailsfinance() {
		return otherdetailsfinance;
	}

	public void setOtherdetailsfinance(String otherdetailsfinance) {
		this.otherdetailsfinance = otherdetailsfinance;
	}

	public String getLogisticdetails() {
		return logisticdetails;
	}

	public void setLogisticdetails(String logisticdetails) {
		this.logisticdetails = logisticdetails;
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

	public String getContactpersonmobileno() {
		return contactpersonmobileno;
	}

	public void setContactpersonmobileno(String contactpersonmobileno) {
		this.contactpersonmobileno = contactpersonmobileno;
	}

	public Long getBankid() {
		return bankid;
	}

	public void setBankid(Long bankid) {
		this.bankid = bankid;
	}

	public String getProductdetails() {
		return productdetails;
	}

	public void setProductdetails(String productdetails) {
		this.productdetails = productdetails;
	}

	public String getSupplierregno() {
		return supplierregno;
	}

	public void setSupplierregno(String supplierregno) {
		this.supplierregno = supplierregno;
	}

	public Integer getWithPki() {
		return withPki;
	}

	public void setWithPki(Integer withPki) {
		this.withPki = withPki;
	}

	public String getSuperior() {
		return superior;
	}

	public void setSuperior(String superior) {
		this.superior = superior;
	}

	public Date getSupplierlastmodifiedtimestamp() {
		return supplierlastmodifiedtimestamp;
	}

	public void setSupplierlastmodifiedtimestamp(Date supplierlastmodifiedtimestamp) {
		this.supplierlastmodifiedtimestamp = supplierlastmodifiedtimestamp;
	}

	public String getSmscontactname() {
		return smscontactname;
	}

	public void setSmscontactname(String smscontactname) {
		this.smscontactname = smscontactname;
	}

	public String getSmscontactphoneno() {
		return smscontactphoneno;
	}

	public void setSmscontactphoneno(String smscontactphoneno) {
		this.smscontactphoneno = smscontactphoneno;
	}

	public String getSmflag() {
		return smflag;
	}

	public void setSmflag(String smflag) {
		this.smflag = smflag;
	}

	public String getSmcontactperson() {
		return smcontactperson;
	}

	public void setSmcontactperson(String smcontactperson) {
		this.smcontactperson = smcontactperson;
	}

	public String getSmcontactmobile() {
		return smcontactmobile;
	}

	public void setSmcontactmobile(String smcontactmobile) {
		this.smcontactmobile = smcontactmobile;
	}

	public String getSmnote() {
		return smnote;
	}

	public void setSmnote(String smnote) {
		this.smnote = smnote;
	}

	public String getIgnoreseminar() {
		return ignoreseminar;
	}

	public void setIgnoreseminar(String ignoreseminar) {
		this.ignoreseminar = ignoreseminar;
	}
	
}
