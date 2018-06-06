package com.best1.api.webservice.soap.response.dto.view;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OrderedProductView")
public class ReturnToVenderViewDTO {
	private Long rtvOrderID; // 退厂单号
	private Long supplierID; // 供应商
	private String returnOrderConfirmDate; // 退厂日期
	private Long productID; // 品号
	private Integer productVersion; // 商品版本
	private Integer colourClass; // 颜色分类
	private Integer colourCode; // 颜色值,
	private Integer styleClass; // 款式分类
	private Integer styleCode; // 款式值
	private Integer normalQuantity; // 良品需求量,
	private Integer damagedQuantity; // 不良品数量
	private Integer actualNormalQuantity; // 实际退厂量良品,
	private Integer actualDamagedQuantity; // 实际退厂量不良品
	private Long warehouseid; // 仓库代码

	private String returnOrderConfirmDateFrom;// 退厂起始日期
	private String returnOrderConfirmDateTo;// 退厂截止日期

	
	
	public Long getWarehouseid() {
		return warehouseid;
	}

	public void setWarehouseid(Long warehouseid) {
		this.warehouseid = warehouseid;
	}

	public Long getRtvOrderID() {
		return rtvOrderID;
	}

	public void setRtvOrderID(Long rtvOrderID) {
		this.rtvOrderID = rtvOrderID;
	}

	public Long getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(Long supplierID) {
		this.supplierID = supplierID;
	}

	public String getReturnOrderConfirmDate() {
		return returnOrderConfirmDate;
	}

	public void setReturnOrderConfirmDate(String returnOrderConfirmDate) {
		this.returnOrderConfirmDate = returnOrderConfirmDate;
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

	public Integer getNormalQuantity() {
		return normalQuantity;
	}

	public void setNormalQuantity(Integer normalQuantity) {
		this.normalQuantity = normalQuantity;
	}

	public Integer getDamagedQuantity() {
		return damagedQuantity;
	}

	public void setDamagedQuantity(Integer damagedQuantity) {
		this.damagedQuantity = damagedQuantity;
	}

	public Integer getActualNormalQuantity() {
		return actualNormalQuantity;
	}

	public void setActualNormalQuantity(Integer actualNormalQuantity) {
		this.actualNormalQuantity = actualNormalQuantity;
	}

	public Integer getActualDamagedQuantity() {
		return actualDamagedQuantity;
	}

	public void setActualDamagedQuantity(Integer actualDamagedQuantity) {
		this.actualDamagedQuantity = actualDamagedQuantity;
	}

	public String getReturnOrderConfirmDateFrom() {
		return returnOrderConfirmDateFrom;
	}

	public void setReturnOrderConfirmDateFrom(String returnOrderConfirmDateFrom) {
		this.returnOrderConfirmDateFrom = returnOrderConfirmDateFrom;
	}

	public String getReturnOrderConfirmDateTo() {
		return returnOrderConfirmDateTo;
	}

	public void setReturnOrderConfirmDateTo(String returnOrderConfirmDateTo) {
		this.returnOrderConfirmDateTo = returnOrderConfirmDateTo;
	}
}
