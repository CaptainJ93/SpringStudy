/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.vws.entity;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.best1.scm.common.persistence.DataEntity;
import com.google.common.collect.Lists;

/**
 * vwsEntity
 * @author hwh
 * @version 2016-02-23
 */

public class CarrierInfo extends DataEntity<CarrierInfo> {
	
	private static final long serialVersionUID = 1L;
	private Long carrierid;		// carrierid
	private String carriername;		// carriername
	private Integer freeze;		// freeze
	
	
	private List<Carrieradress> carrieradressList = Lists.newArrayList(); // 拥有地址列表

	
	

	public List<Carrieradress> getCarrieradressList() {
		return carrieradressList;
	}
	
	public void setCarrieradressList(List<Carrieradress> carrieradressList) {
		this.carrieradressList = carrieradressList;
	}

	

	
	
	public CarrierInfo() {
		super();
	}

	public CarrierInfo(String id){
		super(id);
	}

	@NotNull(message="carrierid不能为空")
	public Long getCarrierid() {
		return carrierid;
	}

	public void setCarrierid(Long carrierid) {
		this.carrierid = carrierid;
	}
	
	@Length(min=1, max=100, message="carriername长度必须介于 1 和 100 之间")
	public String getCarriername() {
		return carriername;
	}

	public void setCarriername(String carriername) {
		this.carriername = carriername;
	}
	
	@NotNull(message="freeze不能为空")
	public Integer getFreeze() {
		return freeze;
	}

	public void setFreeze(Integer freeze) {
		this.freeze = freeze;
	}
	
}