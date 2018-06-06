package com.best1.api.webservice.soap.response.dto.view;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OrderedProductView")
public class OrderedProductViewDTO {
	private String actualShippedDate; // 仓库出货日yyyymmdd
	private Long orderID; // 订单号
	private Integer itemID; // 订单序号
	private Long productID; // 商品代码
	private Integer productVersion; // 商品版本
	private Integer multicodeID; // 多重码
	private String productName; // 商品名称
	private Integer colourClass; // 颜色
	private Integer colourCode; // 颜色
	private Integer styleClass; // 款式
	private Integer styleCode; // 款式
	private Double productAmount; // 订单金额
	private Integer quantity; // 订购数量
	private Double amount; // 发票金额
	private String prefix; // 发票前置
	private Integer invoiceNO; // 发票号
	private String isCod; // 是否COD
	private Double codAmount; // cod金额
	private Long selectedCarrier; // 货运公司
	private Integer deliveryType; // 配送方式
	private Integer subDeliveryType; // 子配送方式
	private Long supplierID; // 供应商
	private Double  discountamount;//折扣
	private Double transactionamount;//积分抵扣
	
	private Long companyid;
	private Long warehouseid; // 仓库代码

	
	private Long customerid; 
	private String customername;
	private String zipcode;
	private String address1;
	private String address2;
	private Long  subchannelid;
    private String subchannelname;

    
	
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

	public Long getSubchannelid() {
		return subchannelid;
	}

	public void setSubchannelid(Long subchannelid) {
		this.subchannelid = subchannelid;
	}

	public String getSubchannelname() {
		return subchannelname;
	}

	public void setSubchannelname(String subchannelname) {
		this.subchannelname = subchannelname;
	}

	public Long getWarehouseid() {
		return warehouseid;
	}

	public void setWarehouseid(Long warehouseid) {
		this.warehouseid = warehouseid;
	}

	public Long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	
	public Double getTransactionamount() {
		return transactionamount;
	}

	public void setTransactionamount(Double transactionamount) {
		this.transactionamount = transactionamount;
	}

	public Double getDiscountamount() {
		return discountamount;
	}

	public void setDiscountamount(Double discountamount) {
		this.discountamount = discountamount;
	}

	private String actualShippedDateFrom; // 仓库出货开始日期yyyymmdd
	private String actualShippedDateTo; // 仓库出货结束日期yyyymmdd

	public String getActualShippedDate() {
		return actualShippedDate;
	}

	public void setActualShippedDate(String actualShippedDate) {
		this.actualShippedDate = actualShippedDate;
	}

	public Long getOrderID() {
		return orderID;
	}

	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public Long getProductID() {
		return productID;
	}

	public void setProductID(Long productID) {
		this.productID = productID;
	}

	public Integer getProductVersion() {
		return productVersion;
	}

	public void setProductVersion(Integer productVersion) {
		this.productVersion = productVersion;
	}

	public Integer getMulticodeID() {
		return multicodeID;
	}

	public void setMulticodeID(Integer multicodeID) {
		this.multicodeID = multicodeID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getColourClass() {
		return colourClass;
	}

	public void setColourClass(Integer colourClass) {
		this.colourClass = colourClass;
	}

	public Integer getColourCode() {
		return colourCode;
	}

	public void setColourCode(Integer colourCode) {
		this.colourCode = colourCode;
	}

	public Integer getStyleClass() {
		return styleClass;
	}

	public void setStyleClass(Integer styleClass) {
		this.styleClass = styleClass;
	}

	public Integer getStyleCode() {
		return styleCode;
	}

	public void setStyleCode(Integer styleCode) {
		this.styleCode = styleCode;
	}

	public Double getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(Double productAmount) {
		this.productAmount = productAmount;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public Integer getInvoiceNO() {
		return invoiceNO;
	}

	public void setInvoiceNO(Integer invoiceNO) {
		this.invoiceNO = invoiceNO;
	}

	public String getIsCod() {
		return isCod;
	}

	public void setIsCod(String isCod) {
		this.isCod = isCod;
	}

	public Double getCodAmount() {
		return codAmount;
	}

	public void setCodAmount(Double codAmount) {
		this.codAmount = codAmount;
	}

	public Long getSelectedCarrier() {
		return selectedCarrier;
	}

	public void setSelectedCarrier(Long selectedCarrier) {
		this.selectedCarrier = selectedCarrier;
	}

	public Integer getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(Integer deliveryType) {
		this.deliveryType = deliveryType;
	}

	public Integer getSubDeliveryType() {
		return subDeliveryType;
	}

	public void setSubDeliveryType(Integer subDeliveryType) {
		this.subDeliveryType = subDeliveryType;
	}

	public Long getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(Long supplierID) {
		this.supplierID = supplierID;
	}

	public String getActualShippedDateFrom() {
		return actualShippedDateFrom;
	}

	public void setActualShippedDateFrom(String actualShippedDateFrom) {
		this.actualShippedDateFrom = actualShippedDateFrom;
	}

	public String getActualShippedDateTo() {
		return actualShippedDateTo;
	}

	public void setActualShippedDateTo(String actualShippedDateTo) {
		this.actualShippedDateTo = actualShippedDateTo;
	}
}
