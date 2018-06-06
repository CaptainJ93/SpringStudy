package com.best1.api.webservice.soap.response.dto.crm;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.validator.constraints.NotBlank;

import com.best1.api.webservice.soap.response.dto.BasicDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@XmlRootElement(name = "CustomerAddress")

@JsonInclude(Include.NON_NULL) 
public class CustomerAddressDTO  extends BasicDTO{

	    private Long addressid;
	  
	    private Long customerid;
	 
	    private Integer country;
	 
	    private Integer zipcode;
	 
	    private String iscontactaddress;
	 
	    private String isdefault;
	 
	    private String isisland;
	 
	    private String address1;
	 
	    private String address2;
	 
	    private Long createdby;
	    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	    private Date createdtimestamp;
	 
	    private Long lastmodifiedby;
	    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	    private Date lastmodifiedtimestamp;
	 
	    private String hometelephonecountrycode;
	 
	    private String hometelephoneareacode;
	 
	    private String hometelephonenumber;
	 
	    private String mobilenumber;
	 
	    private String officeetelephonecountrycode;
	 
	    private String officetelephoneareacode;
	 
	    private String officetelephonenumber;
	 
	    private String officetelephoneextension;
	 
	    private String faxcountrycode;

	    private String faxareacode;
	 
	    private String faxnumber;
	    
	    private String receivername;

		public Long getAddressid() {
			return addressid;
		}

		public void setAddressid(Long addressid) {
			this.addressid = addressid;
		}

		public Long getCustomerid() {
			return customerid;
		}

		public void setCustomerid(Long customerid) {
			this.customerid = customerid;
		}

		public Integer getCountry() {
			return country;
		}

		public void setCountry(Integer country) {
			this.country = country;
		}

		public Integer getZipcode() {
			return zipcode;
		}

		public void setZipcode(Integer zipcode) {
			this.zipcode = zipcode;
		}

		public String getIscontactaddress() {
			return iscontactaddress;
		}

		public void setIscontactaddress(String iscontactaddress) {
			this.iscontactaddress = iscontactaddress;
		}

		public String getIsdefault() {
			return isdefault;
		}

		public void setIsdefault(String isdefault) {
			this.isdefault = isdefault;
		}

		public String getIsisland() {
			return isisland;
		}

		public void setIsisland(String isisland) {
			this.isisland = isisland;
		}
		@NotBlank
		public String getAddress1() {
			return address1;
		}

		public void setAddress1(String address1) {
			this.address1 = address1;
		}
		@NotBlank
		public String getAddress2() {
			return address2;
		}

		public void setAddress2(String address2) {
			this.address2 = address2;
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

		public String getHometelephonecountrycode() {
			return hometelephonecountrycode;
		}

		public void setHometelephonecountrycode(String hometelephonecountrycode) {
			this.hometelephonecountrycode = hometelephonecountrycode;
		}

		public String getHometelephoneareacode() {
			return hometelephoneareacode;
		}

		public void setHometelephoneareacode(String hometelephoneareacode) {
			this.hometelephoneareacode = hometelephoneareacode;
		}

		public String getHometelephonenumber() {
			return hometelephonenumber;
		}

		public void setHometelephonenumber(String hometelephonenumber) {
			this.hometelephonenumber = hometelephonenumber;
		}

		public String getMobilenumber() {
			return mobilenumber;
		}

		public void setMobilenumber(String mobilenumber) {
			this.mobilenumber = mobilenumber;
		}

		public String getOfficeetelephonecountrycode() {
			return officeetelephonecountrycode;
		}

		public void setOfficeetelephonecountrycode(String officeetelephonecountrycode) {
			this.officeetelephonecountrycode = officeetelephonecountrycode;
		}

		public String getOfficetelephoneareacode() {
			return officetelephoneareacode;
		}

		public void setOfficetelephoneareacode(String officetelephoneareacode) {
			this.officetelephoneareacode = officetelephoneareacode;
		}

		public String getOfficetelephonenumber() {
			return officetelephonenumber;
		}

		public void setOfficetelephonenumber(String officetelephonenumber) {
			this.officetelephonenumber = officetelephonenumber;
		}

		public String getOfficetelephoneextension() {
			return officetelephoneextension;
		}

		public void setOfficetelephoneextension(String officetelephoneextension) {
			this.officetelephoneextension = officetelephoneextension;
		}

		public String getFaxcountrycode() {
			return faxcountrycode;
		}

		public void setFaxcountrycode(String faxcountrycode) {
			this.faxcountrycode = faxcountrycode;
		}

		public String getFaxareacode() {
			return faxareacode;
		}

		public void setFaxareacode(String faxareacode) {
			this.faxareacode = faxareacode;
		}

		public String getFaxnumber() {
			return faxnumber;
		}

		public void setFaxnumber(String faxnumber) {
			this.faxnumber = faxnumber;
		}

		public String getReceivername() {
			return receivername;
		}

		public void setReceivername(String receivername) {
			this.receivername = receivername;
		}
		
		/**
		 * 重新实现toString()函数方便在日志中打印DTO信息.
		 */
		@Override
		public String toString() {
			return ToStringBuilder.reflectionToString(this);
		}
}
