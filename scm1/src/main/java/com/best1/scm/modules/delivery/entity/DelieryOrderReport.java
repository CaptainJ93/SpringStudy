package com.best1.scm.modules.delivery.entity;

import java.util.Date;

import com.best1.scm.common.persistence.DataEntity;
import com.best1.scm.modules.vws.entity.CarrierInfo;

public class DelieryOrderReport  extends DataEntity<DelieryOrderReport> {

	private CarrierInfo carrier;	
	private Date createDateStart; // 记录创建时间起
	private Date createDateEnd; //记录创建时间止
	
	
	private int packagesum;//总包裹数
	private int packagesamount;//包裹总金额
	private int deliveredsum;//妥投数
	private double deliveredpercent;//妥投比率
	private double deliveredamount;//妥投金额
	private int refusedsum;//拒收
	private double refusedpercent;//拒收比率
	private double refusedamount;//拒收金额
	
	private int distributioninsum;//配送中包裹数
	private int distributioninamount;//配送中包金额
	
	private int receivedpayments;//总回款金额
	private int noreceivedpayments;//未回款金额
	
	private double receivedpaymentspercent;//回款金额比率

	private String selectedcarrier;	//配送公司代码
	
	private int signforpackage;//半签半退
	private double signforpackageamout;//半签半退金额
	            
	private int trackingstatus;		// 包裹状态码
	private int packagetype;  //包裹类型
	private int limitations;
	



	public double getDeliveredamount() {
		return deliveredamount;
	}

	public void setDeliveredamount(double deliveredamount) {
		this.deliveredamount = deliveredamount;
	}

	public double getRefusedamount() {
		return refusedamount;
	}

	public void setRefusedamount(double refusedamount) {
		this.refusedamount = refusedamount;
	}

	public int getDistributioninamount() {
		return distributioninamount;
	}

	public void setDistributioninamount(int distributioninamount) {
		this.distributioninamount = distributioninamount;
	}

	public double getSignforpackageamout() {
		return signforpackageamout;
	}

	public void setSignforpackageamout(double signforpackageamout) {
		this.signforpackageamout = signforpackageamout;
	}

	public int getLimitations() {
		return limitations;
	}

	public void setLimitations(int limitations) {
		this.limitations = limitations;
	}

	public int getSignforpackage() {
		return signforpackage;
	}

	public void setSignforpackage(int signforpackage) {
		this.signforpackage = signforpackage;
	}

	public int getDistributioninsum() {
		return distributioninsum;
	}

	public void setDistributioninsum(int distributioninsum) {
		this.distributioninsum = distributioninsum;
	}

	public int getTrackingstatus() {
		return trackingstatus;
	}

	public void setTrackingstatus(int trackingstatus) {
		this.trackingstatus = trackingstatus;
	}

	public int getPackagetype() {
		return packagetype;
	}

	public void setPackagetype(int packagetype) {
		this.packagetype = packagetype;
	}

	public String getSelectedcarrier() {
		return selectedcarrier;
	}

	public void setSelectedcarrier(String selectedcarrier) {
		this.selectedcarrier = selectedcarrier;
	}

	public CarrierInfo getCarrier() {
		return carrier;
	}

	public void setCarrier(CarrierInfo carrier) {
		this.carrier = carrier;
	}

	
	public Date getCreateDateStart() {
		return createDateStart;
	}

	public void setCreateDateStart(Date createDateStart) {
		this.createDateStart = createDateStart;
	}

	public Date getCreateDateEnd() {
		return createDateEnd;
	}

	public void setCreateDateEnd(Date createDateEnd) {
		this.createDateEnd = createDateEnd;
	}

	public int getPackagesum() {
		return packagesum;
	}

	public void setPackagesum(int packagesum) {
		this.packagesum = packagesum;
	}

	public int getPackagesamount() {
		return packagesamount;
	}

	public void setPackagesamount(int packagesamount) {
		this.packagesamount = packagesamount;
	}

	public int getDeliveredsum() {
		return deliveredsum;
	}

	public void setDeliveredsum(int deliveredsum) {
		this.deliveredsum = deliveredsum;
	}

	public double getDeliveredpercent() {
		return deliveredpercent;
	}

	public void setDeliveredpercent(double deliveredpercent) {
		this.deliveredpercent = deliveredpercent;
	}

	public int getRefusedsum() {
		return refusedsum;
	}

	public void setRefusedsum(int refusedsum) {
		this.refusedsum = refusedsum;
	}

	public double getRefusedpercent() {
		return refusedpercent;
	}

	public void setRefusedpercent(double refusedpercent) {
		this.refusedpercent = refusedpercent;
	}

	public int getReceivedpayments() {
		return receivedpayments;
	}

	public void setReceivedpayments(int receivedpayments) {
		this.receivedpayments = receivedpayments;
	}

	public int getNoreceivedpayments() {
		return noreceivedpayments;
	}

	public void setNoreceivedpayments(int noreceivedpayments) {
		this.noreceivedpayments = noreceivedpayments;
	}

	public double getReceivedpaymentspercent() {
		return receivedpaymentspercent;
	}

	public void setReceivedpaymentspercent(double receivedpaymentspercent) {
		this.receivedpaymentspercent = receivedpaymentspercent;
	}
	
	
	
	
	
	
	
}
