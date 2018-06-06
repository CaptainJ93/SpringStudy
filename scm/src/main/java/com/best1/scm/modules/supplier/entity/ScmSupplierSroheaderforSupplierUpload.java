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
 * 供应商上传确认退货单信息Entity
 * @author admin
 * @version 2016-12-23
 */
public class ScmSupplierSroheaderforSupplierUpload extends DataEntity<ScmSupplierSroheaderforSupplierUpload> {
	
	private static final long serialVersionUID = 1L;
	private Long returnid;		// 前台销退号
	private Long supplierid; //供应商id
	
	private Long selectedcarrier;		// 快递公司编号
	private String receiptdeliveryorderid;  //快递单号
	
	@ExcelField(title="前台销退号", sort=1)
	public Long getReturnid() {
		return returnid;
	}

	public void setReturnid(Long returnid) {
		this.returnid = returnid;
	}
	
	@ExcelField(title="供应商id", sort=10)
	public Long getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Long supplierid) {
		this.supplierid = supplierid;
	}
	@ExcelField(title="快递公司编号", sort=20)
	public Long getSelectedcarrier() {
		return selectedcarrier;
	}

	public void setSelectedcarrier(Long selectedcarrier) {
		this.selectedcarrier = selectedcarrier;
	}
	
	@ExcelField(title="快递单号", sort=30)
	public String getReceiptdeliveryorderid() {
		return receiptdeliveryorderid;
	}

	public void setReceiptdeliveryorderid(String receiptdeliveryorderid) {
		this.receiptdeliveryorderid = receiptdeliveryorderid;
	}

	
}