package com.best1.api.webservice.soap.response.dto.vwms;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CustomerShiporderDTO {

	private Long warehouseid; // 仓库代码
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	private Date shipordercreateddate; // 出货指示日期

	private Integer orderpriority; // 订单优先
	

	private Integer shipordertype;//出货类型
	
	private Long customerid;

	private String customername;// 姓名

	private Long customerzipcode;//

	private String deliveryaddress;

	private Long carrieridprimary;// 货运公司

	private String isspecialpacking;// 特殊包装

	private String isoffshoredelivery;// 是否外省

	private String paymentmode;

	private String giftpackmessage;// 礼物留言
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	private Date scheduledshipdate; // 预计送达日
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	private Date scheduleddeliverydate;// 预计配送日期
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	private Date requireddeliverytime;// 预计配送时间

	private String hometelephone1;

	private String mobileno1;

	private String instructiontowms;// 仓库指示

	private String instructiontoscm;// 配送商指示

	private Long carrieridsecondary;

	private Long orderid;// 订单号

	private Integer itemid;// 订单序号

	private Long subchannelid;// 通路代码

	private Long deliveryaddressid;

	private String isnewcustomer;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+08:00")
	private Date recordcreatedtime;

	private String batchid;

	private Long membershiplevelid;

	private List<CustomerShiporderDetailDTO> csowholedetail = new ArrayList<CustomerShiporderDetailDTO>();

	

	public String getPaymentmode() {
		return paymentmode;
	}

	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	
	
	public Integer getItemid() {
		return itemid;
	}

	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}

	public Long getWarehouseid() {
		return warehouseid;
	}

	public void setWarehouseid(Long warehouseid) {
		this.warehouseid = warehouseid;
	}

	public Date getShipordercreateddate() {
		return shipordercreateddate;
	}

	public void setShipordercreateddate(Date shipordercreateddate) {
		this.shipordercreateddate = shipordercreateddate;
	}

	public Integer getOrderpriority() {
		return orderpriority;
	}

	public void setOrderpriority(Integer orderpriority) {
		this.orderpriority = orderpriority;
	}

	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public Long getCustomerzipcode() {
		return customerzipcode;
	}

	public void setCustomerzipcode(Long customerzipcode) {
		this.customerzipcode = customerzipcode;
	}

	public String getDeliveryaddress() {
		return deliveryaddress;
	}

	public void setDeliveryaddress(String deliveryaddress) {
		this.deliveryaddress = deliveryaddress;
	}

	public Long getCarrieridprimary() {
		return carrieridprimary;
	}

	public void setCarrieridprimary(Long carrieridprimary) {
		this.carrieridprimary = carrieridprimary;
	}

	public String getIsspecialpacking() {
		return isspecialpacking;
	}

	public void setIsspecialpacking(String isspecialpacking) {
		this.isspecialpacking = isspecialpacking;
	}

	public String getIsoffshoredelivery() {
		return isoffshoredelivery;
	}

	public void setIsoffshoredelivery(String isoffshoredelivery) {
		this.isoffshoredelivery = isoffshoredelivery;
	}

	public String getGiftpackmessage() {
		return giftpackmessage;
	}

	public void setGiftpackmessage(String giftpackmessage) {
		this.giftpackmessage = giftpackmessage;
	}

	public Date getScheduledshipdate() {
		return scheduledshipdate;
	}

	public void setScheduledshipdate(Date scheduledshipdate) {
		this.scheduledshipdate = scheduledshipdate;
	}

	public Date getScheduleddeliverydate() {
		return scheduleddeliverydate;
	}

	public void setScheduleddeliverydate(Date scheduleddeliverydate) {
		this.scheduleddeliverydate = scheduleddeliverydate;
	}

	public Date getRequireddeliverytime() {
		return requireddeliverytime;
	}

	public void setRequireddeliverytime(Date requireddeliverytime) {
		this.requireddeliverytime = requireddeliverytime;
	}

	public String getHometelephone1() {
		return hometelephone1;
	}

	public void setHometelephone1(String hometelephone1) {
		this.hometelephone1 = hometelephone1;
	}

	public String getMobileno1() {
		return mobileno1;
	}

	public void setMobileno1(String mobileno1) {
		this.mobileno1 = mobileno1;
	}

	public String getInstructiontowms() {
		return instructiontowms;
	}

	public void setInstructiontowms(String instructiontowms) {
		this.instructiontowms = instructiontowms;
	}

	public String getInstructiontoscm() {
		return instructiontoscm;
	}

	public void setInstructiontoscm(String instructiontoscm) {
		this.instructiontoscm = instructiontoscm;
	}

	public Long getCarrieridsecondary() {
		return carrieridsecondary;
	}

	public void setCarrieridsecondary(Long carrieridsecondary) {
		this.carrieridsecondary = carrieridsecondary;
	}

	public Long getOrderid() {
		return orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

	public Long getSubchannelid() {
		return subchannelid;
	}

	public void setSubchannelid(Long subchannelid) {
		this.subchannelid = subchannelid;
	}

	public Long getDeliveryaddressid() {
		return deliveryaddressid;
	}

	public void setDeliveryaddressid(Long deliveryaddressid) {
		this.deliveryaddressid = deliveryaddressid;
	}

	public String getIsnewcustomer() {
		return isnewcustomer;
	}

	public void setIsnewcustomer(String isnewcustomer) {
		this.isnewcustomer = isnewcustomer;
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

	public Long getMembershiplevelid() {
		return membershiplevelid;
	}

	public void setMembershiplevelid(Long membershiplevelid) {
		this.membershiplevelid = membershiplevelid;
	}

	public List<CustomerShiporderDetailDTO> getCsowholedetail() {
		return csowholedetail;
	}

	public void setCsowholedetail(
			List<CustomerShiporderDetailDTO> csowholedetail) {
		this.csowholedetail = csowholedetail;
	}

	public Integer getShipordertype() {
		return shipordertype;
	}

	public void setShipordertype(Integer shipordertype) {
		this.shipordertype = shipordertype;
	}

	
	
}
