/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.vws.entity;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.best1.scm.common.persistence.DataEntity;
import com.best1.scm.modules.sys.entity.Area;

/**
 * vwsEntity
 * @author hwh
 * @version 2016-02-25
 */
public class Carrieradress extends DataEntity<Carrieradress> {
	
	private static final long serialVersionUID = 1L;
	private Long carrierid;		// carrierid
	private Integer adresstype;		// adresstype
	private String zipcode;		// zipcode
	private String adress1;		// adress1
	private String adress2;		// adress2
	private String mobilenumber;		// mobilenumber
	private String phoneareacoder;		// phoneareacoder
	private String phonenumber;		// phonenumber
	private String faxareacode;		// faxareacode
	private String faxnumber;		// faxnumber
	private String contactperson;		// contactperson
	
	private String carriername;	
	
	private CarrierInfo carrier;	
	private Area  area;
	
	
	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Carrieradress() {
		super();
	}

	public Carrieradress(String id){
		super(id);
	}

	
	public Long getCarrierid() {
		return carrierid;
	}

	public void setCarrierid(Long carrierid) {
		this.carrierid = carrierid;
	}
	
	@NotNull(message="adresstype不能为空")
	public Integer getAdresstype() {
		return adresstype;
	}

	public void setAdresstype(Integer adresstype) {
		this.adresstype = adresstype;
	}
	
	@Length(min=1, max=6, message="zipcode长度必须介于 1 和 6 之间")
	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	@Length(min=1, max=100, message="adress1长度必须介于 1 和 100 之间")
	public String getAdress1() {
		return adress1;
	}

	public void setAdress1(String adress1) {
		this.adress1 = adress1;
	}
	
	@Length(min=1, max=150, message="adress2长度必须介于 1 和 150 之间")
	public String getAdress2() {
		return adress2;
	}

	public void setAdress2(String adress2) {
		this.adress2 = adress2;
	}
	
	@Length(min=0, max=20, message="mobilenumber长度必须介于 0 和 20 之间")
	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	@Length(min=0, max=20, message="phoneareacoder长度必须介于 0 和 20 之间")
	public String getPhoneareacoder() {
		return phoneareacoder;
	}

	public void setPhoneareacoder(String phoneareacoder) {
		this.phoneareacoder = phoneareacoder;
	}
	
	@Length(min=0, max=30, message="phonenumber长度必须介于 0 和 30 之间")
	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	@Length(min=0, max=20, message="faxareacode长度必须介于 0 和 20 之间")
	public String getFaxareacode() {
		return faxareacode;
	}

	public void setFaxareacode(String faxareacode) {
		this.faxareacode = faxareacode;
	}
	
	@Length(min=0, max=30, message="faxnumber长度必须介于 0 和 30 之间")
	public String getFaxnumber() {
		return faxnumber;
	}

	public void setFaxnumber(String faxnumber) {
		this.faxnumber = faxnumber;
	}
	
	@Length(min=0, max=100, message="contactperson长度必须介于 0 和 100 之间")
	public String getContactperson() {
		return contactperson;
	}

	public void setContactperson(String contactperson) {
		this.contactperson = contactperson;
	}

	public String getCarriername() {
		return carriername;
	}

	public void setCarriername(String carriername) {
		this.carriername = carriername;
	}

	public CarrierInfo getCarrier() {
		return carrier;
	}

	public void setCarrier(CarrierInfo carrier) {
		this.carrier = carrier;
	}
	
}