package com.best1.api.webservice.soap.response.dto.view;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OrderPaymentView")
public class OrderPaymentViewDTO {
	private Long paymentID;
	private Integer paymentModeID; // 支付方式ID
	private Double paymentAmount; // 支付金额
	private Integer paymentstatus;
	private Long orderID;
	private Integer itemID;

	
	
	public Integer getPaymentstatus() {
		return paymentstatus;
	}

	public void setPaymentstatus(Integer paymentstatus) {
		this.paymentstatus = paymentstatus;
	}

	public Long getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(Long paymentID) {
		this.paymentID = paymentID;
	}

	public Integer getPaymentModeID() {
		return paymentModeID;
	}

	public void setPaymentModeID(Integer paymentModeID) {
		this.paymentModeID = paymentModeID;
	}

	public Double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
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
}
