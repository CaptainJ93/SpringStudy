/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.deliveryfee.entity;

import org.hibernate.validator.constraints.Length;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.best1.scm.common.persistence.DataEntity;
import com.best1.scm.modules.vws.entity.CarrierInfo;

/**
 * 配送费用计算Entity
 * @author admin
 * @version 2016-07-27
 */
public class ScmDeliveryfeePackagedetail extends DataEntity<ScmDeliveryfeePackagedetail> {
	
	private static final long serialVersionUID = 1L;
	private String trackingnumber;		// 快递单号
	private Integer selectedcarrier;		// 包裹委托派送的快递公司编码
	private Date actualshipdate;		// 实际出货日期时间
	private Integer trackingstatus;		// 包裹状态码
	private String receivingzipcode;		// 收件地邮编
	private String  receivingaddress1 ;  //地址1
	private Double fheavy;		// 首重
	private Double fheavyprice;		// 首重价格
	private Double cheavyunit;		// 续重单位
	private Double cheavyunitprice;		// 续重单位价格
	private Integer type;		// 1代表配送费用 2代表揽收费用
	private Double codfeerate;		// cod费率 百分比的值
	private Double rejectrate;		// 拒收优惠折扣比
	private Double fheavynum;		// 首重金额
	private Double cheavynum;		// 续重金额
	private Double codfeenum;		// cod手续费金额
	private Double rejectnum;		// 拒收折扣金额
	private Double resultnum;		// 最终结果金额
	private Date resulttime;		// 最终结果产生时间
	private CarrierInfo carrier;
	private Date createDateStart;  // 实际出货日期起
	private Date createDateEnd;    // 实际出货日期止
	
	private Double packageweight;  //包裹重量
	private Double packagecodnum;  //包裹cod金额
	private int deliveryfeeflag ; //计费结果
	
	
	public int getDeliveryfeeflag() {
		return deliveryfeeflag;
	}

	public void setDeliveryfeeflag(int deliveryfeeflag) {
		this.deliveryfeeflag = deliveryfeeflag;
	}

	public Double getPackageweight() {
		return packageweight;
	}

	public void setPackageweight(Double packageweight) {
		this.packageweight = packageweight;
	}

	public Double getPackagecodnum() {
		return packagecodnum;
	}

	public void setPackagecodnum(Double packagecodnum) {
		this.packagecodnum = packagecodnum;
	}

	public String getReceivingaddress1() {
		return receivingaddress1;
	}

	public void setReceivingaddress1(String receivingaddress1) {
		this.receivingaddress1 = receivingaddress1;
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

	public CarrierInfo getCarrier() {
		return carrier;
	}

	public void setCarrier(CarrierInfo carrier) {
		this.carrier = carrier;
	}

	public ScmDeliveryfeePackagedetail() {
		super();
	}

	public ScmDeliveryfeePackagedetail(String id){
		super(id);
	}

	@Length(min=0, max=20, message="快递单号长度必须介于 0 和 20 之间")
	public String getTrackingnumber() {
		return trackingnumber;
	}

	public void setTrackingnumber(String trackingnumber) {
		this.trackingnumber = trackingnumber;
	}
	
	public Integer getSelectedcarrier() {
		return selectedcarrier;
	}

	public void setSelectedcarrier(Integer selectedcarrier) {
		this.selectedcarrier = selectedcarrier;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getActualshipdate() {
		return actualshipdate;
	}

	public void setActualshipdate(Date actualshipdate) {
		this.actualshipdate = actualshipdate;
	}
	
	public Integer getTrackingstatus() {
		return trackingstatus;
	}

	public void setTrackingstatus(Integer trackingstatus) {
		this.trackingstatus = trackingstatus;
	}
	
	@Length(min=0, max=30, message="收件地邮编长度必须介于 0 和 30 之间")
	public String getReceivingzipcode() {
		return receivingzipcode;
	}

	public void setReceivingzipcode(String receivingzipcode) {
		this.receivingzipcode = receivingzipcode;
	}
	
	public Double getFheavy() {
		return fheavy;
	}

	public void setFheavy(Double fheavy) {
		this.fheavy = fheavy;
	}
	
	public Double getFheavyprice() {
		return fheavyprice;
	}

	public void setFheavyprice(Double fheavyprice) {
		this.fheavyprice = fheavyprice;
	}
	
	public Double getCheavyunit() {
		return cheavyunit;
	}

	public void setCheavyunit(Double cheavyunit) {
		this.cheavyunit = cheavyunit;
	}
	
	public Double getCheavyunitprice() {
		return cheavyunitprice;
	}

	public void setCheavyunitprice(Double cheavyunitprice) {
		this.cheavyunitprice = cheavyunitprice;
	}
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
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
	
	public Double getFheavynum() {
		return fheavynum;
	}

	public void setFheavynum(Double fheavynum) {
		this.fheavynum = fheavynum;
	}
	
	public Double getCheavynum() {
		return cheavynum;
	}

	public void setCheavynum(Double cheavynum) {
		this.cheavynum = cheavynum;
	}
	
	public Double getCodfeenum() {
		return codfeenum;
	}

	public void setCodfeenum(Double codfeenum) {
		this.codfeenum = codfeenum;
	}
	
	public Double getRejectnum() {
		return rejectnum;
	}

	public void setRejectnum(Double rejectnum) {
		this.rejectnum = rejectnum;
	}
	
	public Double getResultnum() {
		return resultnum;
	}

	public void setResultnum(Double resultnum) {
		this.resultnum = resultnum;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getResulttime() {
		return resulttime;
	}

	public void setResulttime(Date resulttime) {
		this.resulttime = resulttime;
	}
	
}