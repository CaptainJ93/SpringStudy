/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.supplier.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.best1.scm.common.persistence.DataEntity;

/**
 * 供应商-商品信息Entity
 * @author admin
 * @version 2016-12-22
 */
public class ScmSupplierSkuinfo extends DataEntity<ScmSupplierSkuinfo> {
	
	private static final long serialVersionUID = 1L;
	private Long productid;		// 商品品号
	private Integer productversion;		// 商品版本号
	private String productname;		// 商品名称
	private Integer colorclasscode;		// 颜色分类code
	private Integer colorcode;		// 颜色code
	private Integer styleclasscode;		// 款式分类code
	private Integer stylecode;		// 款式code
	private String colorvalue;		// 颜色值
	private String stylevalue;		// 款式值
	private String productskucode;		// 商品仓库编号
	private Long supplierid;		// 供应商编号
	private String remark;		// 商品备注信息
	private Date recordcreatedtime;		// 记录创建时间
	private String recordcreatedby;		// 记录创建人
	private String lastupdatedby;		// 记录修改人
	private Date lastupdatedtime;		// 记录修改时间
	private int recordstatus;  //单据状态
	
	public int getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(int recordstatus) {
		this.recordstatus = recordstatus;
	}

	public ScmSupplierSkuinfo() {
		super();
	}

	public ScmSupplierSkuinfo(String id){
		super(id);
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}
	
	public Integer getProductversion() {
		return productversion;
	}

	public void setProductversion(Integer productversion) {
		this.productversion = productversion;
	}
	
	@Length(min=0, max=50, message="商品名称长度必须介于 0 和 50 之间")
	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	public Integer getColorclasscode() {
		return colorclasscode;
	}

	public void setColorclasscode(Integer colorclasscode) {
		this.colorclasscode = colorclasscode;
	}
	
	public Integer getColorcode() {
		return colorcode;
	}

	public void setColorcode(Integer colorcode) {
		this.colorcode = colorcode;
	}
	
	public Integer getStyleclasscode() {
		return styleclasscode;
	}

	public void setStyleclasscode(Integer styleclasscode) {
		this.styleclasscode = styleclasscode;
	}
	
	public Integer getStylecode() {
		return stylecode;
	}

	public void setStylecode(Integer stylecode) {
		this.stylecode = stylecode;
	}
	
	@Length(min=0, max=10, message="颜色值长度必须介于 0 和 10 之间")
	public String getColorvalue() {
		return colorvalue;
	}

	public void setColorvalue(String colorvalue) {
		this.colorvalue = colorvalue;
	}
	
	@Length(min=0, max=10, message="款式值长度必须介于 0 和 10 之间")
	public String getStylevalue() {
		return stylevalue;
	}

	public void setStylevalue(String stylevalue) {
		this.stylevalue = stylevalue;
	}
	
	@Length(min=0, max=20, message="商品仓库编号长度必须介于 0 和 20 之间")
	public String getProductskucode() {
		return productskucode;
	}

	public void setProductskucode(String productskucode) {
		this.productskucode = productskucode;
	}
	
	public Long getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Long supplierid) {
		this.supplierid = supplierid;
	}
	
	@Length(min=0, max=2000, message="商品备注信息长度必须介于 0 和 2000 之间")
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
	
	@Length(min=0, max=4, message="记录修改人长度必须介于 0 和 4 之间")
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