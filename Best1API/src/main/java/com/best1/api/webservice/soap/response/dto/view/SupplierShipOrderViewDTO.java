package com.best1.api.webservice.soap.response.dto.view;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SupplierShipOrderView")
public class SupplierShipOrderViewDTO {
	private Long supplierShipOrderID; // 送货单号
	private Long supplierID; // 供应商代码
	private String deliveryDate; // 实际入库日期
	private Long productID; // 品号
	private Integer productVersion; // 商品版本号
	private Integer colourClass; // 颜色分类
	private Integer colourCode; // 颜色值
	private Integer styleClass; // 款式分类
	private Integer styleCode; // 款式值
	private Integer recievedQuantity; // 进货数量
	private Long warehouseid; // 仓库代码

	private String deliveryDateFrom; // 实际入库日期from
	private String deliveryDateTo; // 实际入库日期to

	
	
	public Long getWarehouseid() {
		return warehouseid;
	}

	public void setWarehouseid(Long warehouseid) {
		this.warehouseid = warehouseid;
	}

	public Long getSupplierShipOrderID() {
		return supplierShipOrderID;
	}

	public void setSupplierShipOrderID(Long supplierShipOrderID) {
		this.supplierShipOrderID = supplierShipOrderID;
	}

	public Long getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(Long supplierID) {
		this.supplierID = supplierID;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
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

	public Integer getRecievedQuantity() {
		return recievedQuantity;
	}

	public void setRecievedQuantity(Integer recievedQuantity) {
		this.recievedQuantity = recievedQuantity;
	}

	public String getDeliveryDateFrom() {
		return deliveryDateFrom;
	}

	public void setDeliveryDateFrom(String deliveryDateFrom) {
		this.deliveryDateFrom = deliveryDateFrom;
	}

	public String getDeliveryDateTo() {
		return deliveryDateTo;
	}

	public void setDeliveryDateTo(String deliveryDateTo) {
		this.deliveryDateTo = deliveryDateTo;
	}
}
