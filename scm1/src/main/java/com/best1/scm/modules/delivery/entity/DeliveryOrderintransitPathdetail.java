/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.delivery.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.best1.scm.common.persistence.DataEntity;

/**
 * 订单包裹配送在途路由信息表Entity
 * @author hwh
 * @version 2016-03-02
 */
public class DeliveryOrderintransitPathdetail extends DataEntity<DeliveryOrderintransitPathdetail> {
	
	private static final long serialVersionUID = 1L;
	private Long pathid;		// 配送路由编号
	private String pathdesc;		// 配送路由描述
	private Date pathdatetime;		// 配送路由时间
	private int deliverycode;		// 配送路由状态码
	private Date receiptorrejecttime;		// 签收/拒收时间
	private String receiptperson;		// 签收人
	private String deliveryperson;		// 快递公司配送员
	private String deliverypersoncontact;		// 快递公司配送员联系方式
	private double longitude;		// 经度
	private double dimensionvalue;		// 维度
	private String trackingnumber;		// 对应的包裹信息(快递单号)
	private Date recordcreatedtime;		// 记录创建时间
	private String recordcreatedby;		// 记录创建人
	private String lastupdatedby;		// lastupdatedby
	private Date lastupdatedtime;		// lastupdatedtime
	
	public DeliveryOrderintransitPathdetail() {
		super();
	}

	public DeliveryOrderintransitPathdetail(String id){
		super(id);
	}

	public Long getPathid() {
		return pathid;
	}

	public void setPathid(Long pathid) {
		this.pathid = pathid;
	}
	
	@Length(min=0, max=100, message="配送路由描述长度必须介于 0 和 100 之间")
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
	

	public int getDeliverycode() {
		return deliverycode;
	}

	public void setDeliverycode(int deliverycode) {
		this.deliverycode = deliverycode;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getReceiptorrejecttime() {
		return receiptorrejecttime;
	}

	public void setReceiptorrejecttime(Date receiptorrejecttime) {
		this.receiptorrejecttime = receiptorrejecttime;
	}
	

	@Length(min=0, max=20, message="签收人长度必须介于 0 和 20 之间")
	public String getReceiptperson() {
		return receiptperson;
	}

	public void setReceiptperson(String receiptperson) {
		this.receiptperson = receiptperson;
	}
	
	@Length(min=0, max=20, message="快递公司配送员长度必须介于 0 和 20 之间")
	public String getDeliveryperson() {
		return deliveryperson;
	}

	public void setDeliveryperson(String deliveryperson) {
		this.deliveryperson = deliveryperson;
	}
	
	@Length(min=0, max=20, message="快递公司配送员联系方式长度必须介于 0 和 20 之间")
	public String getDeliverypersoncontact() {
		return deliverypersoncontact;
	}

	public void setDeliverypersoncontact(String deliverypersoncontact) {
		this.deliverypersoncontact = deliverypersoncontact;
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
	
	@Length(min=0, max=20, message="对应的包裹信息(快递单号)长度必须介于 0 和 20 之间")
	public String getTrackingnumber() {
		return trackingnumber;
	}

	public void setTrackingnumber(String trackingnumber) {
		this.trackingnumber = trackingnumber;
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