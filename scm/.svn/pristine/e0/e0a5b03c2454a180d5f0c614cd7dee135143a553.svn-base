/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.supplier.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.best1.scm.common.persistence.DataEntity;

/**
 * 供应商-供应商信息Entity
 * @author admin
 * @version 2016-12-22
 */
public class ScmSupplierSupplierinfo extends DataEntity<ScmSupplierSupplierinfo> {
	
	private static final long serialVersionUID = 1L;
	private Long supplierid;		// 供应商id
	private String supplierregno;		// 供应商税号、登陆号
	private String supplierregpassword;		// 供应商登陆密码
	private String suppliercompanyname;		// 供应商名称
	private String zipcode;		// 邮编
	private String address1;		// 地址1
	private String address2;		// 地址2
	private String contactperson;		// 联系人
	private String contactphone;		// 联系方式
	private String supplierlevel;		// 供应商等级
	private String logisticdetails;		// 物流信息
	private Integer supplierstatus;		// 供应商状态
	private Date recordcreatedtime;		// 记录创建时间
	private String recordcreatedby;		// 记录创建人
	private String lastupdatedby;		// 最后修改人
	private Date lastupdatedtime;		// 最后修改时间
	
	public ScmSupplierSupplierinfo() {
		super();
	}

	public ScmSupplierSupplierinfo(String id){
		super(id);
	}

	public Long getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Long supplierid) {
		this.supplierid = supplierid;
	}
	
	@Length(min=0, max=50, message="供应商税号、登陆号长度必须介于 0 和 50 之间")
	public String getSupplierregno() {
		return supplierregno;
	}

	public void setSupplierregno(String supplierregno) {
		this.supplierregno = supplierregno;
	}
	
	@Length(min=0, max=255, message="供应商登陆密码长度必须介于 0 和 255 之间")
	public String getSupplierregpassword() {
		return supplierregpassword;
	}

	public void setSupplierregpassword(String supplierregpassword) {
		this.supplierregpassword = supplierregpassword;
	}
	
	@Length(min=0, max=30, message="供应商名称长度必须介于 0 和 30 之间")
	public String getSuppliercompanyname() {
		return suppliercompanyname;
	}

	public void setSuppliercompanyname(String suppliercompanyname) {
		this.suppliercompanyname = suppliercompanyname;
	}
	
	@Length(min=0, max=13, message="邮编长度必须介于 0 和 13 之间")
	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	@Length(min=0, max=120, message="地址1长度必须介于 0 和 120 之间")
	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	
	@Length(min=0, max=60, message="地址2长度必须介于 0 和 60 之间")
	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	@Length(min=0, max=40, message="联系人长度必须介于 0 和 40 之间")
	public String getContactperson() {
		return contactperson;
	}

	public void setContactperson(String contactperson) {
		this.contactperson = contactperson;
	}
	
	@Length(min=0, max=40, message="联系方式长度必须介于 0 和 40 之间")
	public String getContactphone() {
		return contactphone;
	}

	public void setContactphone(String contactphone) {
		this.contactphone = contactphone;
	}
	
	@Length(min=0, max=4, message="供应商等级长度必须介于 0 和 4 之间")
	public String getSupplierlevel() {
		return supplierlevel;
	}

	public void setSupplierlevel(String supplierlevel) {
		this.supplierlevel = supplierlevel;
	}
	
	@Length(min=0, max=275, message="物流信息长度必须介于 0 和 275 之间")
	public String getLogisticdetails() {
		return logisticdetails;
	}

	public void setLogisticdetails(String logisticdetails) {
		this.logisticdetails = logisticdetails;
	}
	
	public Integer getSupplierstatus() {
		return supplierstatus;
	}

	public void setSupplierstatus(Integer supplierstatus) {
		this.supplierstatus = supplierstatus;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getRecordcreatedtime() {
		return recordcreatedtime;
	}

	public void setRecordcreatedtime(Date recordcreatedtime) {
		this.recordcreatedtime = recordcreatedtime;
	}
	
	@Length(min=0, max=4, message="记录创建人长度必须介于 0 和 4 之间")
	public String getRecordcreatedby() {
		return recordcreatedby;
	}

	public void setRecordcreatedby(String recordcreatedby) {
		this.recordcreatedby = recordcreatedby;
	}
	
	@Length(min=0, max=4, message="最后修改人长度必须介于 0 和 4 之间")
	public String getLastupdatedby() {
		return lastupdatedby;
	}

	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getLastupdatedtime() {
		return lastupdatedtime;
	}

	public void setLastupdatedtime(Date lastupdatedtime) {
		this.lastupdatedtime = lastupdatedtime;
	}
	
}