package com.best1.api.webservice.soap.response.dto.vwms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;


public class ReturnProductsDTO {

	private Long warehouseid;

    private Long returnid;

   
    private Integer returntype;


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    private Date plannedpickupdate;

   
    private Long customerid;

   
    private Integer returngoodslevel;

   
    private String customername;

  
    private Integer country;

   
    private String zipcode;

   
    private String address1;

    private String address2;

    private String pickupaddress;

    private String hometelephonenumber;

    private String hometelephoneareacode;

   
    private String hometelephonecountrycode;

    
    private String mobilenumber;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    private Date returnordercreatedate;//收货指示日

    
    private Long carrieridprimary;

   
    private Integer returnreason1;

   
    private Integer returnreason2;

    
    private Long neworderid;

   
    private Integer newitemid;

   
    private String returndesc;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
    private Date recordcreatedtime;

    //仓库指示
    private String splinstr;

    
    
    private String batchid;

	private List<ReturnProductsDetailDTO> srowholedetails = new ArrayList<ReturnProductsDetailDTO>();

	




	public List<ReturnProductsDetailDTO> getSrowholedetails() {
		return srowholedetails;
	}


	public void setSrowholedetails(List<ReturnProductsDetailDTO> srowholedetails) {
		this.srowholedetails = srowholedetails;
	}


	public Long getWarehouseid() {
		return warehouseid;
	}


	public void setWarehouseid(Long warehouseid) {
		this.warehouseid = warehouseid;
	}


	public Long getReturnid() {
		return returnid;
	}


	public void setReturnid(Long returnid) {
		this.returnid = returnid;
	}


	public Integer getReturntype() {
		return returntype;
	}


	public void setReturntype(Integer returntype) {
		this.returntype = returntype;
	}


	public Date getPlannedpickupdate() {
		return plannedpickupdate;
	}


	public void setPlannedpickupdate(Date plannedpickupdate) {
		this.plannedpickupdate = plannedpickupdate;
	}


	public Long getCustomerid() {
		return customerid;
	}


	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}


	public Integer getReturngoodslevel() {
		return returngoodslevel;
	}


	public void setReturngoodslevel(Integer returngoodslevel) {
		this.returngoodslevel = returngoodslevel;
	}


	public String getCustomername() {
		return customername;
	}


	public void setCustomername(String customername) {
		this.customername = customername;
	}


	public Integer getCountry() {
		return country;
	}


	public void setCountry(Integer country) {
		this.country = country;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	public String getAddress1() {
		return address1;
	}


	public void setAddress1(String address1) {
		this.address1 = address1;
	}


	public String getAddress2() {
		return address2;
	}


	public void setAddress2(String address2) {
		this.address2 = address2;
	}


	public String getHometelephonenumber() {
		return hometelephonenumber;
	}


	public void setHometelephonenumber(String hometelephonenumber) {
		this.hometelephonenumber = hometelephonenumber;
	}


	public String getHometelephoneareacode() {
		return hometelephoneareacode;
	}


	public void setHometelephoneareacode(String hometelephoneareacode) {
		this.hometelephoneareacode = hometelephoneareacode;
	}


	public String getHometelephonecountrycode() {
		return hometelephonecountrycode;
	}


	public void setHometelephonecountrycode(String hometelephonecountrycode) {
		this.hometelephonecountrycode = hometelephonecountrycode;
	}


	public String getMobilenumber() {
		return mobilenumber;
	}


	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}


	public Date getReturnordercreatedate() {
		return returnordercreatedate;
	}


	public void setReturnordercreatedate(Date returnordercreatedate) {
		this.returnordercreatedate = returnordercreatedate;
	}


	public Long getCarrieridprimary() {
		return carrieridprimary;
	}


	public void setCarrieridprimary(Long carrieridprimary) {
		this.carrieridprimary = carrieridprimary;
	}


	public Integer getReturnreason1() {
		return returnreason1;
	}


	public void setReturnreason1(Integer returnreason1) {
		this.returnreason1 = returnreason1;
	}


	public Integer getReturnreason2() {
		return returnreason2;
	}


	public void setReturnreason2(Integer returnreason2) {
		this.returnreason2 = returnreason2;
	}


	public Long getNeworderid() {
		return neworderid;
	}


	public void setNeworderid(Long neworderid) {
		this.neworderid = neworderid;
	}


	public Integer getNewitemid() {
		return newitemid;
	}


	public void setNewitemid(Integer newitemid) {
		this.newitemid = newitemid;
	}


	public String getReturndesc() {
		return returndesc;
	}


	public void setReturndesc(String returndesc) {
		this.returndesc = returndesc;
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


	public String getPickupaddress() {
		return pickupaddress;
	}


	public void setPickupaddress(String pickupaddress) {
		this.pickupaddress = pickupaddress;
	}


	public String getSplinstr() {
		return splinstr;
	}


	public void setSplinstr(String splinstr) {
		this.splinstr = splinstr;
	}

    
    
    
    
    
    
    
}
