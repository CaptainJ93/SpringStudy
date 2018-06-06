/**
 */
package com.best1.scm.modules.supplier.entity;

import com.best1.scm.common.utils.excel.annotation.ExcelField;

/**
 * 物流部门出货明细Excel模板
 * 
 * @author fanxuankai
 * @version 2017-04-10
 */
public class ScmSupplierDeliveryOrder {

	@ExcelField(title = "配送单号", sort = 0)
	private String deliveryorderid; // 配送单号
	@ExcelField(title = "配送状态", sort = 10, dictType = "Tracking_Status")
	private int trackingstatus; // 包裹状态码
	@ExcelField(title = "配送时间", sort = 20)
	private String receiptorrejecttime; // 签收、拒收时间
	@ExcelField(title = "客户姓名", sort = 100)
	private String customername; // 客户姓名
	@ExcelField(title = "客户身份证", sort = 110)
	private String idcard; // 客户身份证
	@ExcelField(title = "电话", sort = 200)
	private String hometelephone1; // 电话
	@ExcelField(title = "手机", sort = 300)
	private String mobileno1; // 手机
	@ExcelField(title = "收货地址1", sort = 400)
	private String deliveryaddress1; // 收货地址1
	@ExcelField(title = "收货地址2", sort = 500)
	private String deliveryaddress2; // 收货地址2
	@ExcelField(title = "订单号", sort = 600)
	private Long orderid; // 订单号
	@ExcelField(title = "代收金额", sort = 700)
	private Double codamount; // 代收金额
	@ExcelField(title = "商品号", sort = 800)
	private Long productid; // 商品号
	@ExcelField(title = "商品名称", sort = 900)
	private String productname; // 商品名称
	@ExcelField(title = "通路", sort = 910)
	private Integer subchannelid;
	@ExcelField(title = "出货重量(kg)", sort = 1000)
	private Double packageWeight; // 出货重量
	@ExcelField(title = "仓库指送", sort = 1010)
	private String instructiontowms; // 仓库指送
	@ExcelField(title = "配送指示", sort = 1020)
	private String instructiontoscm; // 配送指示
	@ExcelField(title = "创建时间", sort = 1100)
	private String recordcreatedtime; // 创建时间
	@ExcelField(title = "订单状态", sort = 1200)
	private Integer orderstatus; // 订单状态
	@ExcelField(title = "出货时间", sort = 1300)
	private String actualshipdate; // 出货时间

	public String getDeliveryorderid() {
		return deliveryorderid;
	}

	public void setDeliveryorderid(String deliveryorderid) {
		this.deliveryorderid = deliveryorderid;
	}

	public int getTrackingstatus() {
		return trackingstatus;
	}

	public void setTrackingstatus(int trackingstatus) {
		this.trackingstatus = trackingstatus;
	}

	public String getReceiptorrejecttime() {
		return receiptorrejecttime;
	}

	public void setReceiptorrejecttime(String receiptorrejecttime) {
		this.receiptorrejecttime = receiptorrejecttime;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
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

	public String getDeliveryaddress1() {
		return deliveryaddress1;
	}

	public void setDeliveryaddress1(String deliveryaddress1) {
		this.deliveryaddress1 = deliveryaddress1;
	}

	public String getDeliveryaddress2() {
		return deliveryaddress2;
	}

	public void setDeliveryaddress2(String deliveryaddress2) {
		this.deliveryaddress2 = deliveryaddress2;
	}

	public Long getOrderid() {
		return orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

	public Double getCodamount() {
		return codamount;
	}

	public void setCodamount(Double codamount) {
		this.codamount = codamount;
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Integer getSubchannelid() {
		return subchannelid;
	}

	public void setSubchannelid(Integer subchannelid) {
		this.subchannelid = subchannelid;
	}

	public Double getPackageWeight() {
		return packageWeight;
	}

	public void setPackageWeight(Double packageWeight) {
		this.packageWeight = packageWeight;
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

	public String getRecordcreatedtime() {
		return recordcreatedtime;
	}

	public void setRecordcreatedtime(String recordcreatedtime) {
		this.recordcreatedtime = recordcreatedtime;
	}

	public Integer getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(Integer orderstatus) {
		this.orderstatus = orderstatus;
	}

	public String getActualshipdate() {
		return actualshipdate;
	}

	public void setActualshipdate(String actualshipdate) {
		this.actualshipdate = actualshipdate;
	}

}