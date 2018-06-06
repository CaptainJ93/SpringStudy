package com.best1.api.entity.scm.supplier;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.best1.api.entity.BaseObject;

@Entity
@Table(name = "TSCM_SUPPLIERCONTRACT")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TscmSuppliercontract extends BaseObject {

    private Long contractno;

   
    private Integer supplierid;

  
    private Short status;

  
    private Date contractdate;

   
    private Short paymentterms;

    
    private String contractname;

  
    private String suppliercontractsignername;

   
    private Long createdby;

   
    private Date createdtimestamp;

   
    private Long lastmodifiedby;

  
    private Date lastmodifiedtimestamp;

  
    private String normaldelivery;

    private String directdelivery;

   
    private String specialdelivery;

    
    private String offshoredelivery;

   
    private String paymentdeliveryterms;

   
    private String registrationcertificate;


    private String suppliersurveyform;

  
    private String supplierprofile;

  
    private String taiwanid;

 
    private String form401;

 
    private String supplierinfoinspm;

    
    private String otherterms;

   
    private String marketingfee;

   
    private Short warrantyflag;

  
    private Date warrantyhandindate;

   
    private Date warrantycanceldate;

  
    private Short warrantytitle;

 
    private String warrantyno;


    private String certificateflag;

  
    private Date certificatefeedate;

    
    private Date certificatevaliddatefrom;


    private Date certificatevaliddateto;


	public Long getContractno() {
		return contractno;
	}


	public void setContractno(Long contractno) {
		this.contractno = contractno;
	}


	public Integer getSupplierid() {
		return supplierid;
	}


	public void setSupplierid(Integer supplierid) {
		this.supplierid = supplierid;
	}


	public Short getStatus() {
		return status;
	}


	public void setStatus(Short status) {
		this.status = status;
	}


	public Date getContractdate() {
		return contractdate;
	}


	public void setContractdate(Date contractdate) {
		this.contractdate = contractdate;
	}


	public Short getPaymentterms() {
		return paymentterms;
	}


	public void setPaymentterms(Short paymentterms) {
		this.paymentterms = paymentterms;
	}


	public String getContractname() {
		return contractname;
	}


	public void setContractname(String contractname) {
		this.contractname = contractname;
	}


	public String getSuppliercontractsignername() {
		return suppliercontractsignername;
	}


	public void setSuppliercontractsignername(String suppliercontractsignername) {
		this.suppliercontractsignername = suppliercontractsignername;
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


	public String getNormaldelivery() {
		return normaldelivery;
	}


	public void setNormaldelivery(String normaldelivery) {
		this.normaldelivery = normaldelivery;
	}


	public String getDirectdelivery() {
		return directdelivery;
	}


	public void setDirectdelivery(String directdelivery) {
		this.directdelivery = directdelivery;
	}


	public String getSpecialdelivery() {
		return specialdelivery;
	}


	public void setSpecialdelivery(String specialdelivery) {
		this.specialdelivery = specialdelivery;
	}


	public String getOffshoredelivery() {
		return offshoredelivery;
	}


	public void setOffshoredelivery(String offshoredelivery) {
		this.offshoredelivery = offshoredelivery;
	}


	public String getPaymentdeliveryterms() {
		return paymentdeliveryterms;
	}


	public void setPaymentdeliveryterms(String paymentdeliveryterms) {
		this.paymentdeliveryterms = paymentdeliveryterms;
	}


	public String getRegistrationcertificate() {
		return registrationcertificate;
	}


	public void setRegistrationcertificate(String registrationcertificate) {
		this.registrationcertificate = registrationcertificate;
	}


	public String getSuppliersurveyform() {
		return suppliersurveyform;
	}


	public void setSuppliersurveyform(String suppliersurveyform) {
		this.suppliersurveyform = suppliersurveyform;
	}


	public String getSupplierprofile() {
		return supplierprofile;
	}


	public void setSupplierprofile(String supplierprofile) {
		this.supplierprofile = supplierprofile;
	}


	public String getTaiwanid() {
		return taiwanid;
	}


	public void setTaiwanid(String taiwanid) {
		this.taiwanid = taiwanid;
	}


	public String getForm401() {
		return form401;
	}


	public void setForm401(String form401) {
		this.form401 = form401;
	}


	public String getSupplierinfoinspm() {
		return supplierinfoinspm;
	}


	public void setSupplierinfoinspm(String supplierinfoinspm) {
		this.supplierinfoinspm = supplierinfoinspm;
	}


	public String getOtherterms() {
		return otherterms;
	}


	public void setOtherterms(String otherterms) {
		this.otherterms = otherterms;
	}


	public String getMarketingfee() {
		return marketingfee;
	}


	public void setMarketingfee(String marketingfee) {
		this.marketingfee = marketingfee;
	}


	public Short getWarrantyflag() {
		return warrantyflag;
	}


	public void setWarrantyflag(Short warrantyflag) {
		this.warrantyflag = warrantyflag;
	}


	public Date getWarrantyhandindate() {
		return warrantyhandindate;
	}


	public void setWarrantyhandindate(Date warrantyhandindate) {
		this.warrantyhandindate = warrantyhandindate;
	}


	public Date getWarrantycanceldate() {
		return warrantycanceldate;
	}


	public void setWarrantycanceldate(Date warrantycanceldate) {
		this.warrantycanceldate = warrantycanceldate;
	}


	public Short getWarrantytitle() {
		return warrantytitle;
	}


	public void setWarrantytitle(Short warrantytitle) {
		this.warrantytitle = warrantytitle;
	}


	public String getWarrantyno() {
		return warrantyno;
	}


	public void setWarrantyno(String warrantyno) {
		this.warrantyno = warrantyno;
	}


	public String getCertificateflag() {
		return certificateflag;
	}


	public void setCertificateflag(String certificateflag) {
		this.certificateflag = certificateflag;
	}


	public Date getCertificatefeedate() {
		return certificatefeedate;
	}


	public void setCertificatefeedate(Date certificatefeedate) {
		this.certificatefeedate = certificatefeedate;
	}


	public Date getCertificatevaliddatefrom() {
		return certificatevaliddatefrom;
	}


	public void setCertificatevaliddatefrom(Date certificatevaliddatefrom) {
		this.certificatevaliddatefrom = certificatevaliddatefrom;
	}


	public Date getCertificatevaliddateto() {
		return certificatevaliddateto;
	}


	public void setCertificatevaliddateto(Date certificatevaliddateto) {
		this.certificatevaliddateto = certificatevaliddateto;
	}

   
}