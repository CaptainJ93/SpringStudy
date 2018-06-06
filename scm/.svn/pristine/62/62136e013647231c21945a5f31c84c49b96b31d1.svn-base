/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.returnpackage.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.best1.scm.common.persistence.DataEntity;

/**
 * 退换货包裹路由Entity
 * @author hwh
 * @version 2016-03-15
 */
public class ReturnReturnintransitPathdetail extends DataEntity<ReturnReturnintransitPathdetail> {
	
	private static final long serialVersionUID = 1L;
	private String pathid;		// 收回路由编号
	private long returnid;		// 前台销退号
	private String pathdesc;		// 收回路由描述信息
	private Date pathdatetime;		// 节点时间
	private int returncode;		// 收回状态码
	private Date receiptsuccesstime;		// 收货成功时间
	private String receiptperson;		// 上门收件员
	private String receiptpersoncontact;		// 上门收件员联系方式
	private double longitude;		// 经度
	private double dimensionvalue;		// 维度
	private long returnorderid;		// 收回单号
	private int returnorderseq;		// 收回单序号
	private String receiptdeliveryorderid;		// 收回使用的新的面单号
	private Date recordcreatedtime;		// 记录创建时间
	private String recordcreatedby;		// 记录创建人
	private String lastupdatedby;		// lastupdatedby
	private Date lastupdatedtime;		// lastupdatedtime
	
	public ReturnReturnintransitPathdetail() {
		super();
	}

	public ReturnReturnintransitPathdetail(String id){
		super(id);
	}

	@Length(min=0, max=4, message="收回路由编号长度必须介于 0 和 4 之间")
	public String getPathid() {
		return pathid;
	}

	public void setPathid(String pathid) {
		this.pathid = pathid;
	}
	
	
	public long getReturnid() {
		return returnid;
	}

	public void setReturnid(long returnid) {
		this.returnid = returnid;
	}
	
	@Length(min=0, max=100, message="收回路由描述信息长度必须介于 0 和 100 之间")
	public String getPathdesc() {
		return pathdesc;
	}

	public void setPathdesc(String pathdesc) {
		this.pathdesc = pathdesc;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPathdatetime() {
		return pathdatetime;
	}

	public void setPathdatetime(Date pathdatetime) {
		this.pathdatetime = pathdatetime;
	}
	
	
	public int getReturncode() {
		return returncode;
	}

	public void setReturncode(int returncode) {
		this.returncode = returncode;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getReceiptsuccesstime() {
		return receiptsuccesstime;
	}

	public void setReceiptsuccesstime(Date receiptsuccesstime) {
		this.receiptsuccesstime = receiptsuccesstime;
	}
	
	@Length(min=0, max=20, message="上门收件员长度必须介于 0 和 20 之间")
	public String getReceiptperson() {
		return receiptperson;
	}

	public void setReceiptperson(String receiptperson) {
		this.receiptperson = receiptperson;
	}
	
	@Length(min=0, max=50, message="上门收件员联系方式长度必须介于 0 和 50 之间")
	public String getReceiptpersoncontact() {
		return receiptpersoncontact;
	}

	public void setReceiptpersoncontact(String receiptpersoncontact) {
		this.receiptpersoncontact = receiptpersoncontact;
	}
	
	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public double getDimensionvalue() {
		return dimensionvalue;
	}

	public void setDimensionvalue(double dimensionvalue) {
		this.dimensionvalue = dimensionvalue;
	}
	
	
	public long getReturnorderid() {
		return returnorderid;
	}

	public void setReturnorderid(long returnorderid) {
		this.returnorderid = returnorderid;
	}
	
	
	public int getReturnorderseq() {
		return returnorderseq;
	}

	public void setReturnorderseq(int returnorderseq) {
		this.returnorderseq = returnorderseq;
	}
	
	@Length(min=0, max=20, message="收回使用的新的面单号长度必须介于 0 和 20 之间")
	public String getReceiptdeliveryorderid() {
		return receiptdeliveryorderid;
	}

	public void setReceiptdeliveryorderid(String receiptdeliveryorderid) {
		this.receiptdeliveryorderid = receiptdeliveryorderid;
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
	
	@Length(min=0, max=4, message="lastupdatedby长度必须介于 0 和 4 之间")
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