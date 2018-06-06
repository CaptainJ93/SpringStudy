/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.delivery.entity;

import org.hibernate.validator.constraints.Length;

import com.best1.scm.common.persistence.DataEntity;

/**
 * 配送大区评分Entity
 * @author admin
 * @version 2016-06-30
 */
public class ScmDeliveryTimezoneratescore extends DataEntity<ScmDeliveryTimezoneratescore> {
	
	private static final long serialVersionUID = 1L;
	private String hourzone;		// 大全类别
	private Integer ratebegin;		// 比例起
	private Integer rateend;		// 比例止
	private Integer ratescore;		// 比例得分
	
	public ScmDeliveryTimezoneratescore() {
		super();
	}

	public ScmDeliveryTimezoneratescore(String id){
		super(id);
	}

	@Length(min=1, max=20, message="大全类别长度必须介于 1 和 20 之间")
	public String getHourzone() {
		return hourzone;
	}

	public void setHourzone(String hourzone) {
		this.hourzone = hourzone;
	}
	
	public Integer getRatebegin() {
		return ratebegin;
	}

	public void setRatebegin(Integer ratebegin) {
		this.ratebegin = ratebegin;
	}
	
	public Integer getRateend() {
		return rateend;
	}

	public void setRateend(Integer rateend) {
		this.rateend = rateend;
	}
	
	public Integer getRatescore() {
		return ratescore;
	}

	public void setRatescore(Integer ratescore) {
		this.ratescore = ratescore;
	}
	
}