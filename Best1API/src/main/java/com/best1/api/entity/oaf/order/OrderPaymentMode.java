package com.best1.api.entity.oaf.order;

import com.best1.api.entity.BaseObject;

public class OrderPaymentMode extends BaseObject {
	private Integer paymentmodeid;
	private Double paymentamount;
	private String codpaymentmode;
	private String payeename;

	private String transferaccno;

	private Long bankid;

	/**
	 * private Integer paymentstatus;
	 * 
	 * private Long paymentid;
	 * 
	 * private Double recievedamount;
	 * 
	 * private Double balanceamount; 
	 * private Double bonuspointsused;
	 * 
	 * private Integer noofinstallment;
	 * 
	 * 
	 * private Integer paymentchangereasoncode;
	 * 
	 * private Date paymentduedate;
	 * 
	 * private Date actualpaymentdate;
	 * 
	 * private String paymentmodedescription;
	 * 
	 * private Integer delayedinstallment;
	 * 
	 * private String isattendbonusdeduct;
	 * 
	 * private String isinstallmentformat;
	 **/

	public String getPayeename() {
		return payeename;
	}

	public void setPayeename(String payeename) {
		this.payeename = payeename;
	}

	public String getTransferaccno() {
		return transferaccno;
	}

	public void setTransferaccno(String transferaccno) {
		this.transferaccno = transferaccno;
	}

	public Long getBankid() {
		return bankid;
	}

	public void setBankid(Long bankid) {
		this.bankid = bankid;
	}

	public Integer getPaymentmodeid() {
		return paymentmodeid;
	}

	public void setPaymentmodeid(Integer paymentmodeid) {
		this.paymentmodeid = paymentmodeid;
	}

	public Double getPaymentamount() {
		return paymentamount;
	}

	public void setPaymentamount(Double paymentamount) {
		this.paymentamount = paymentamount;
	}

	public String getCodpaymentmode() {
		return codpaymentmode;
	}

	public void setCodpaymentmode(String codpaymentmode) {
		this.codpaymentmode = codpaymentmode;
	}

}
