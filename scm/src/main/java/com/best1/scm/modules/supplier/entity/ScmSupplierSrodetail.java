/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.supplier.entity;

import org.hibernate.validator.constraints.Length;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.best1.scm.common.persistence.DataEntity;
import com.best1.scm.common.utils.excel.annotation.ExcelField;

/**
 * 退货单明细信息Entity
 * @author admin
 * @version 2016-12-23
 */
public class ScmSupplierSrodetail extends DataEntity<ScmSupplierSrodetail> {
	
	private static final long serialVersionUID = 1L;
	private Long returnid;		// 前台销退号
	private Long orderid;		// 订单号
	private Integer itemid;		// 订单序号
	private Long shiporderid;		// 出货单号
	private Integer shiporderseq;		// 出货单号序号
	private Long productid;		// 商品编号
	private Integer productversion;		// 商品版本号
	private String productname;		// 商品名称
	private Integer colorclasscode;		// 颜色分类值
	private Integer colorcode;		// 颜色code值
	private String colorvalue;		// 颜色值
	private Integer styleclasscode;		// 款式分类


	private Integer stylecode;		// 款式code值
	private String stylevalue;		// 款式值
	private Long productnumber;		// 商品数量
	private String productdetail;		// 商品明细
	private String productboxingdetail;		// 商品装箱明细
	private Long returnorderid;		// 收回单号
	private Long returnorderseq;		// 收回单号序号
	private Date recordcreatedtime;		// 创建时间
	private String recordcreatedby;		// 创建人
	private String lastupdatedby;		// 修改人
	private Date lastupdatedtime;		// 修改时间

	private Long supplierid; //供应商id

	@ExcelField(title="颜色分类值", sort=60)
	public Integer getColorclasscode() {
		return colorclasscode;
	}
	
	
	public void setColorclasscode(Integer colorclasscode) {
		this.colorclasscode = colorclasscode;
	}
	@ExcelField(title="款式分类", sort=75)
	public Integer getStyleclasscode() {
		return styleclasscode;
	}

	public void setStyleclasscode(Integer styleclasscode) {
		this.styleclasscode = styleclasscode;
	}
	
	public Long getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Long supplierid) {
		this.supplierid = supplierid;
	}

	public ScmSupplierSrodetail() {
		super();
	}

	public ScmSupplierSrodetail(String id){
		super(id);
	}

	@ExcelField(title="退货单号", sort=1)
	public Long getReturnid() {
		return returnid;
	}

	public void setReturnid(Long returnid) {
		this.returnid = returnid;
	}
	
	@ExcelField(title="订单号", sort=20)
	public Long getOrderid() {
		return orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}
	
	@ExcelField(title="订单序号", sort=25)
	public Integer getItemid() {
		return itemid;
	}

	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}
	
	@ExcelField(title="出货单号", sort=30)
	public Long getShiporderid() {
		return shiporderid;
	}

	public void setShiporderid(Long shiporderid) {
		this.shiporderid = shiporderid;
	}
	
	@ExcelField(title="出货单号序号", sort=35)
	public Integer getShiporderseq() {
		return shiporderseq;
	}

	public void setShiporderseq(Integer shiporderseq) {
		this.shiporderseq = shiporderseq;
	}
	
	@ExcelField(title="商品编号", sort=40)
	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}
	
	@ExcelField(title="商品版本号", sort=45)
	public Integer getProductversion() {
		return productversion;
	}

	public void setProductversion(Integer productversion) {
		this.productversion = productversion;
	}
	
	@Length(min=0, max=100, message="商品名称长度必须介于 0 和 100 之间")
	@ExcelField(title="商品名称", sort=50)
	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}
	

	
	@ExcelField(title="颜色code值", sort=65)
	public Integer getColorcode() {
		return colorcode;
	}

	public void setColorcode(Integer colorcode) {
		this.colorcode = colorcode;
	}
	
	@Length(min=0, max=20, message="颜色值长度必须介于 0 和 20 之间")
	@ExcelField(title="颜色值", sort=70)
	public String getColorvalue() {
		return colorvalue;
	}

	public void setColorvalue(String colorvalue) {
		this.colorvalue = colorvalue;
	}
	

	
	@ExcelField(title="款式code值", sort=80)
	public Integer getStylecode() {
		return stylecode;
	}

	public void setStylecode(Integer stylecode) {
		this.stylecode = stylecode;
	}
	
	@Length(min=0, max=20, message="款式值长度必须介于 0 和 20 之间")
	@ExcelField(title="款式值", sort=85)
	public String getStylevalue() {
		return stylevalue;
	}

	public void setStylevalue(String stylevalue) {
		this.stylevalue = stylevalue;
	}
	
	@ExcelField(title="商品数量", sort=90)
	public Long getProductnumber() {
		return productnumber;
	}

	public void setProductnumber(Long productnumber) {
		this.productnumber = productnumber;
	}
	
	@Length(min=0, max=4000, message="商品明细长度必须介于 0 和 4000 之间")
	@ExcelField(title="商品明细", sort=95)
	public String getProductdetail() {
		return productdetail;
	}

	public void setProductdetail(String productdetail) {
		this.productdetail = productdetail;
	}
	
	@Length(min=0, max=4000, message="商品装箱明细长度必须介于 0 和 4000 之间")
	@ExcelField(title="商品装箱明细", sort=110)
	public String getProductboxingdetail() {
		return productboxingdetail;
	}

	public void setProductboxingdetail(String productboxingdetail) {
		this.productboxingdetail = productboxingdetail;
	}
	
	@ExcelField(title="收回单号", sort=115)
	public Long getReturnorderid() {
		return returnorderid;
	}

	public void setReturnorderid(Long returnorderid) {
		this.returnorderid = returnorderid;
	}
	
	@ExcelField(title="收回单号序号", sort=120)
	public Long getReturnorderseq() {
		return returnorderseq;
	}

	public void setReturnorderseq(Long returnorderseq) {
		this.returnorderseq = returnorderseq;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ExcelField(title="创建时间", sort=125)
	public Date getRecordcreatedtime() {
		return recordcreatedtime;
	}

	public void setRecordcreatedtime(Date recordcreatedtime) {
		this.recordcreatedtime = recordcreatedtime;
	}
	
	@Length(min=0, max=100, message="创建人长度必须介于 0 和 100 之间")
	@ExcelField(title="创建人", sort=130)
	public String getRecordcreatedby() {
		return recordcreatedby;
	}

	public void setRecordcreatedby(String recordcreatedby) {
		this.recordcreatedby = recordcreatedby;
	}
	
	@Length(min=0, max=100, message="最后修改人长度必须介于 0 和 100 之间")
	@ExcelField(title="修改人", sort=135)
	public String getLastupdatedby() {
		return lastupdatedby;
	}

	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ExcelField(title="修改时间", sort=140)
	public Date getLastupdatedtime() {
		return lastupdatedtime;
	}

	public void setLastupdatedtime(Date lastupdatedtime) {
		this.lastupdatedtime = lastupdatedtime;
	}
	
}