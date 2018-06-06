/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.deliveryfee.entity;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.best1.scm.common.persistence.DataEntity;
import com.best1.scm.modules.vws.entity.CarrierInfo;

/**
 * 配送费用计算Entity
 * @author admin
 * @version 2016-07-27
 */
public class ScmDeliveryfeePrice extends DataEntity<ScmDeliveryfeePrice> {
	
	private static final long serialVersionUID = 1L;
	private String zipcode;		// 邮编
	private Integer selectedcarrier;		// 快递公司
	private Double fheavy;		// 首重
	private Double fheavyprice;		// 首重价格
	private Double cheavyunit;		// 续重单位
	private Double cheavyunitprice;		// 续重单位价格
	private Integer type;		// 1代表配送费用 2代表揽收费用
	private Date expbegindate;		// 记录有效 开始时间
	private Date expenddate;		// 记录有效 结束时间
	private CarrierInfo carrier;
	
	public CarrierInfo getCarrier() {
		return carrier;
	}

	public void setCarrier(CarrierInfo carrier) {
		this.carrier = carrier;
	}

	public ScmDeliveryfeePrice() {
		super();
	}

	public ScmDeliveryfeePrice(String id){
		super(id);
	}

	@Length(min=1, max=30, message="邮编长度必须介于 1 和 30 之间")
	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	@NotNull(message="快递公司不能为空")
	public Integer getSelectedcarrier() {
		return selectedcarrier;
	}

	public void setSelectedcarrier(Integer selectedcarrier) {
		this.selectedcarrier = selectedcarrier;
	}
	
	@NotNull(message="首重不能为空")
	public Double getFheavy() {
		return fheavy;
	}

	public void setFheavy(Double fheavy) {
		this.fheavy = fheavy;
	}
	
	@NotNull(message="首重价格不能为空")
	public Double getFheavyprice() {
		return fheavyprice;
	}

	public void setFheavyprice(Double fheavyprice) {
		this.fheavyprice = fheavyprice;
	}
	
	@NotNull(message="续重单位不能为空")
	public Double getCheavyunit() {
		return cheavyunit;
	}

	public void setCheavyunit(Double cheavyunit) {
		this.cheavyunit = cheavyunit;
	}
	
	@NotNull(message="续重单位价格不能为空")
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