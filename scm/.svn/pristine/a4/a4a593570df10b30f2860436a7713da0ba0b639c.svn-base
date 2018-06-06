/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.deliveryfee.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.best1.scm.common.persistence.DataEntity;
import com.best1.scm.modules.vws.entity.CarrierInfo;

/**
 * 配送费用计算Entity
 * @author admin
 * @version 2016-07-27
 */
public class ScmDeliveryfeeCodfee extends DataEntity<ScmDeliveryfeeCodfee> {
	
	private static final long serialVersionUID = 1L;
	private Integer selectedcarrier;		// 快递公司
	private Double codfeerate;		// cod费率 百分比的值
	private Double rejectrate;		// 拒收优惠折扣比
	private Date expbegindate;		// 记录有效 开始时间
	private Date expenddate;		// 记录有效 结束时间
	private CarrierInfo carrier;
	
	public CarrierInfo getCarrier() {
		return carrier;
	}

	public void setCarrier(CarrierInfo carrier) {
		this.carrier = carrier;
	}

	public ScmDeliveryfeeCodfee() {
		super();
	}

	public ScmDeliveryfeeCodfee(String id){
		super(id);
	}

	public Integer getSelectedcarrier() {
		return selectedcarrier;
	}

	public void setSelectedcarrier(Integer selectedcarrier) {
		this.selectedcarrier = selectedcarrier;
	}
	
	public Double getCodfeerate() {
		return codfeerate;
	}

	public void setCodfeerate(Double codfeerate) {
		this.codfeerate = codfeerate;
	}
	
	public Double getRejectrate() {
		return rejectrate;
	}

	public void setRejectrate(Double rejectrate) {
		this.rejectrate = rejectrate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getExpbegindate() {
		return expbegindate;
	}

	public void setExpbegindate(Date expbegindate) {
		this.expbegindate = expbegindate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getExpenddate() {
		return expenddate;
	}

	public void setExpenddate(Date expenddate) {
		this.expenddate = expenddate;
	}
	
}