/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.returnpackage.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.best1.scm.common.persistence.DataEntity;

/**
 * 退换货明细Entity
 * @author hwh
 * @version 2016-03-15
 */
public class ReturnReturnintransitDetail extends DataEntity<ReturnReturnintransitDetail> {
	
	private static final long serialVersionUID = 1L;
	private long orderid;		// 订单号
	private long returnid;		// 前台销退号
	private int itemid;		// 订单序号
	private long shiporderid;		// 出货单号
	private int shiporderseq;		// 出货单号序号
	private long productid;		// 商品编号
	private int productversion;		// 商品版本号
	private String productname;		// 商品名称
	private int colorclass;		// 颜色分类值
	private int colorcode;		// 颜色code值
	private String colorvalue;		// 颜色值
	private int styleclass;		// 款式分类
	private int stylecode;		// 款式code值
	private String stylevalue;		// 款式值
	private int productnumber;		// 商品数量
	private String productdetail;		// 商品明细
	private String productboxingdetail;		// 商品装箱明细
	private long returnorderid;		// 收回单号
	private int returnorderseq;		// 收回单号序号
	private Date recordcreatedtime;		// 记录创建时间
	private String recordcreatedby;		// 记录创建人
	private String lastupdatedby;		// lastupdatedby
	private Date lastupdatedtime;		// lastupdatedtime
	
	
	
	
	public ReturnReturnintransitDetail() {
		super();
	}

	public ReturnReturnintransitDetail(String id){
		super(id);
	}

	
	public long getOrderid() {
		return orderid;
	}

	public void setOrderid(long orderid) {
		this.orderid = orderid;
	}
	
	
	public long getReturnid() {
		return returnid;
	}

	public void setReturnid(long returnid) {
		this.returnid = returnid;
	}
	
	
	public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	
	
	public long getShiporderid() {
		return shiporderid;
	}

	public void setShiporderid(long shiporderid) {
		this.shiporderid = shiporderid;
	}
	
	
	public int getShiporderseq() {
		return shiporderseq;
	}

	public void setShiporderseq(int shiporderseq) {
		this.shiporderseq = shiporderseq;
	}
	
	
	public long getProductid() {
		return productid;
	}

	public void setProductid(long productid) {
		this.productid = productid;
	}
	

	public int getProductversion() {
		return productversion;
	}

	public void setProductversion(int productversion) {
		this.productversion = productversion;
	}
	
	@Length(min=0, max=100, message="商品名称长度必须介于 0 和 100 之间")
	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	
	public int getColorclass() {
		return colorclass;
	}

	public void setColorclass(int colorclass) {
		this.colorclass = colorclass;
	}
	
	
	public int getColorcode() {
		return colorcode;
	}

	public void setColorcode(int colorcode) {
		this.colorcode = colorcode;
	}
	
	@Length(min=0, max=20, message="颜色值长度必须介于 0 和 20 之间")
	public String getColorvalue() {
		return colorvalue;
	}

	public void setColorvalue(String colorvalue) {
		this.colorvalue = colorvalue;
	}
	
	
	public int getStyleclass() {
		return styleclass;
	}

	public void setStyleclass(int styleclass) {
		this.styleclass = styleclass;
	}
	
	
	public int getStylecode() {
		return stylecode;
	}

	public void setStylecode(int stylecode) {
		this.stylecode = stylecode;
	}
	

	public String getStylevalue() {
		return stylevalue;
	}

	public void setStylevalue(String stylevalue) {
		this.stylevalue = stylevalue;
	}
	
	
	public int getProductnumber() {
		return productnumber;
	}

	public void setProductnumber(int productnumber) {
		this.productnumber = productnumber;
	}
	
	@Length(min=0, max=100, message="商品明细长度必须介于 0 和 100 之间")
	public String getProductdetail() {
		return productdetail;
	}

	public void setProductdetail(String productdetail) {
		this.productdetail = productdetail;
	}
	
	@Length(min=0, max=100, message="商品装箱明细长度必须介于 0 和 100 之间")
	public String getProductboxingdetail() {
		return productboxingdetail;
	}

	public void setProductboxingdetail(String productboxingdetail) {
		this.productboxingdetail = productboxingdetail;
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