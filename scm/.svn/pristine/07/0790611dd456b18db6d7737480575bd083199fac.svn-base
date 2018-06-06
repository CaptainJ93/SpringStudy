/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.vws.entity;

import org.hibernate.validator.constraints.Length;

import com.best1.scm.common.persistence.DataEntity;

/**
 * zipcodeEntity
 * @author fanxuankai
 * @version 2017-03-08
 */
public class Zipcode extends DataEntity<Zipcode> {
	
	private static final long serialVersionUID = 1L;
	private String zipcode;		// 邮政编码
	private String zipcodedetail;		// 邮编的地址信息
	private String city;		// 城市
	private String area;		// 区域
	
	public Zipcode() {
		super();
	}

	public Zipcode(String zipCode){
		this.zipcode = zipCode;
	}

	@Length(min=1, max=16, message="邮政编码长度必须介于 1 和 16 之间")
	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	@Length(min=0, max=100, message="邮编的地址信息长度必须介于 0 和 100 之间")
	public String getZipcodedetail() {
		return zipcodedetail;
	}

	public void setZipcodedetail(String zipcodedetail) {
		this.zipcodedetail = zipcodedetail;
	}
	
	@Length(min=0, max=100, message="城市长度必须介于 0 和 100 之间")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Length(min=0, max=100, message="区域长度必须介于 0 和 100 之间")
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
}