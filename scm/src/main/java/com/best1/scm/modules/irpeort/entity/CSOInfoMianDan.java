package com.best1.scm.modules.irpeort.entity;

import static org.apache.commons.lang3.StringUtils.trimToEmpty;

import com.best1.scm.common.utils.StringUtils;
import com.best1.scm.modules.supplier.entity.ScmSupplierCsoinfo;
import com.best1.scm.modules.supplier.entity.ScmSupplierShipConfirmInfo;
import com.best1.scm.modules.vws.entity.Zipcode;

import net.sf.jasperreports.engine.JRDataSource;

public class CSOInfoMianDan {
	private String sZipcode;
	private String cZipcode;
	private String cTelephone;
	private String cMobileno;
	private String sAddress;
	private String packageRemark;
	private String shipOrderId;
	private String orderId;
	private String logisticsId;
	private String customerName;
	private String sTelephone;
	private String rowNum;
	private String sumNum;
	private String paymentType;
	private String customerId;
	private String carrierShort;
	private String sender;
	private String cAddress;
	private String cCity;
	private String cArea;
	private boolean instructionToWMS;

	private JRDataSource subInfoDS;

	public String getsZipcode() {
		return sZipcode;
	}

	public void setsZipcode(String sZipcode) {
		this.sZipcode = sZipcode;
	}

	public String getcZipcode() {
		return cZipcode;
	}

	public void setcZipcode(String cZipcode) {
		this.cZipcode = cZipcode;
	}

	public String getcTelephone() {
		return cTelephone;
	}

	public void setcTelephone(String cTelephone) {
		this.cTelephone = cTelephone;
	}

	public String getcMobileno() {
		return cMobileno;
	}

	public void setcMobileno(String cMobileno) {
		this.cMobileno = cMobileno;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public String getPackageRemark() {
		return packageRemark;
	}

	public void setPackageRemark(String packageRemark) {
		this.packageRemark = packageRemark;
	}

	public String getShipOrderId() {
		return shipOrderId;
	}

	public void setShipOrderId(String shipOrderId) {
		this.shipOrderId = shipOrderId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getLogisticsId() {
		return logisticsId;
	}

	public void setLogisticsId(String logisticsId) {
		this.logisticsId = logisticsId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getsTelephone() {
		return sTelephone;
	}

	public void setsTelephone(String sTelephone) {
		this.sTelephone = sTelephone;
	}

	public String getRowNum() {
		return rowNum;
	}

	public void setRowNum(String rowNum) {
		this.rowNum = rowNum;
	}

	public String getSumNum() {
		return sumNum;
	}

	public void setSumNum(String sumNum) {
		this.sumNum = sumNum;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCarrierShort() {
		return carrierShort;
	}

	public void setCarrierShort(String carrierShort) {
		this.carrierShort = carrierShort;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public String getcCity() {
		return cCity;
	}

	public void setcCity(String cCity) {
		this.cCity = cCity;
	}

	public String getcArea() {
		return cArea;
	}

	public void setcArea(String cArea) {
		this.cArea = cArea;
	}

	public boolean isInstructionToWMS() {
		return instructionToWMS;
	}

	public void setInstructionToWMS(boolean instructionToWMS) {
		this.instructionToWMS = instructionToWMS;
	}

	public JRDataSource getSubInfoDS() {
		return subInfoDS;
	}

	public void setSubInfoDS(JRDataSource subInfoDS) {
		this.subInfoDS = subInfoDS;
	}

	public void setValue(CSOMianDanSenderInfo senderInfo, ScmSupplierCsoinfo csoinfo,
			ScmSupplierShipConfirmInfo confirmInfo, Zipcode zipCode) {
		setSender(trimToEmpty(senderInfo.getSender()));
		setsAddress(trimToEmpty(senderInfo.getSenderAddress()));
		setsTelephone(trimToEmpty(senderInfo.getSenderTelephone()));
		setsZipcode(trimToEmpty(senderInfo.getSenderZipcode()));
		setcCity(trimToEmpty(zipCode.getCity()));
		setcArea(trimToEmpty(zipCode.getArea()));
		setcAddress(trimToEmpty(csoinfo.getDeliveryaddress1()) + trimToEmpty(csoinfo.getDeliveryaddress2()));
		setCarrierShort(trimToEmpty(csoinfo.getSelectedcarriername()));
		setcZipcode(trimToEmpty(csoinfo.getCustomerzipcode()));
		setcTelephone(trimToEmpty(csoinfo.getHometelephone1()));
		setcMobileno(trimToEmpty(csoinfo.getMobileno1()));
		Long customerId = csoinfo.getCustomerid();
		setCustomerId(customerId == null ? StringUtils.EMPTY : customerId.toString());
		setCustomerName(trimToEmpty(csoinfo.getCustomername()));
		Long orderId = csoinfo.getOrderid();
		setOrderId(orderId == null ? "0" : orderId.toString());
		setPaymentType(trimToEmpty(csoinfo.getPaymentmode()));
		setRowNum("1");
		setSumNum("1");
		Long shipOrderId = csoinfo.getShiporderid();
		setShipOrderId(shipOrderId == null ? StringUtils.EMPTY : shipOrderId.toString());
		if (StringUtils.isEmpty(csoinfo.getDeliveryorderid())) {
			setLogisticsId("0");
		} else {
			setLogisticsId(csoinfo.getDeliveryorderid());
		}
		setPackageRemark(trimToEmpty(confirmInfo.getPackageRemark()));
	}

}