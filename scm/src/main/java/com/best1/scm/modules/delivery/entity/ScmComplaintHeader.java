/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.delivery.entity;


import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.best1.scm.common.persistence.DataEntity;
import com.best1.scm.modules.vws.entity.CarrierInfo;

/**
 * 配送包裹客诉处理headerEntity
 * @author admin
 * @version 2016-12-15
 */
public class ScmComplaintHeader extends DataEntity<ScmComplaintHeader> {
	
	private static final long serialVersionUID = 1L;
	private Long cpid;		// 客诉编号，取自erp系统
	private Integer cptype;		// 客诉类型
	private Long cphandledid;		// 客诉处理编号
	private Long orderid;		// 订单号
	private Integer itemid;		// 订单序号
	private String trackingnumber;		// 配送快递单号
	private Integer cpreason1;		// 客诉主因
	private Integer cpreason2;		// 客诉次因
	private Date cpcreatedtime;		// 客诉建立时间
	private Long productid;		// 商品编号
	private String productname;		// 商品名称
	private String receivername;		// 收件人姓名
	private String cpdesc;		// 客诉描述
	private Date actualshiptime;		// 实际配送时间
	private Long returnid;		// 退货号
	private Date returncreatedtime;		// 退货单建立时间
	private String cphandledprogress;		// 客诉处理进度查询
	private String cpselectedcarrier;		// 客诉所属快递公司编码
	private Date cphandledovertime;		// 客诉终结时间
	private Date cphandledupdatetime;   // 客诉处理更新时间
	private Date recordcreatedtime;		// 记录创建时间
	private String recordcreatedby;		// 记录创建人
	private String lastupdatedby;		// lastupdatedby
	private Date lastupdatedtime;		// lastupdatedtime
	private List<ScmComplaintDetail> scmComplaintDetailList;
	private CarrierInfo carrier;
	private String loginid;
	private Date createDateStart;  
	private Date createDateEnd;
	
	public Date getCreateDateStart() {
		return createDateStart;
	}

	public void setCreateDateStart(Date createDateStart) {
		this.createDateStart = createDateStart;
	}

	public Date getCreateDateEnd() {
		return createDateEnd;
	}

	public void setCreateDateEnd(Date createDateEnd) {
		this.createDateEnd = createDateEnd;
	}
	
	public String getLoginid(){
		return loginid;
	}
	public void setLoginid(String loginid){
		this.loginid=loginid;
	}
	
	public CarrierInfo getCarrier(){
		return carrier;
	}
	
	public void setCarrier(CarrierInfo carrier){
		this.carrier=carrier;
	}
	
	public List<ScmComplaintDetail> getScmComplaintDetailList() {
		return scmComplaintDetailList;
	}

	public void setScmComplaintDetailList(
			List<ScmComplaintDetail> scmComplaintDetailList) {
		this.scmComplaintDetailList = scmComplaintDetailList;
	}

	public ScmComplaintHeader() {
		super();
	}

	public ScmComplaintHeader(String id){
		super(id);
	}

	public Long getCpid() {
		return cpid;
	}

	public void setCpid(Long cpid) {
		this.cpid = cpid;
	}
	
	public Integer getCptype() {
		return cptype;
	}

	public void setCptype(Integer cptype) {
		this.cptype = cptype;
	}
	
	public Long getCphandledid() {
		return cphandledid;
	}

	public void setCphandledid(Long cphandledid) {
		this.cphandledid = cphandledid;
	}
	
	public Long getOrderid() {
		return orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}
	
	public Integer getItemid() {
		return itemid;
	}

	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}
	
	@Length(min=0, max=20, message="配送快递单号长度必须介于 0 和 20 之间")
	public String getTrackingnumber() {
		return trackingnumber;
	}

	public void setTrackingnumber(String trackingnumber) {
		this.trackingnumber = trackingnumber;
	}
	
	public Integer getCpreason1() {
		return cpreason1;
	}

	public void setCpreason1(Integer cpreason1) {
		this.cpreason1 = cpreason1;
	}
	
	public Integer getCpreason2() {
		return cpreason2;
	}

	public void setCpreason2(Integer cpreason2) {
		this.cpreason2 = cpreason2;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCpcreatedtime() {
		return cpcreatedtime;
	}

	public void setCpcreatedtime(Date cpcreatedtime) {
		this.cpcreatedtime = cpcreatedtime;
	}
	
	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}
	
	@Length(min=0, max=50, message="商品名称长度必须介于 0 和 50 之间")
	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	@Length(min=0, max=20, message="收件人姓名长度必须介于 0 和 20 之间")
	public String getReceivername() {
		return receivername;
	}

	public void setReceivername(String receivername) {
		this.receivername = receivername;
	}
	
	@Length(min=0, max=100, message="客诉描述长度必须介于 0 和 100 之间")
	public String getCpdesc() {
		return cpdesc;
	}

	public void setCpdesc(String cpdesc) {
		this.cpdesc = cpdesc;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getActualshiptime() {
		return actualshiptime;
	}

	public void setActualshiptime(Date actualshiptime) {
		this.actualshiptime = actualshiptime;
	}
	
	public Long getReturnid() {
		return returnid;
	}

	public void setReturnid(Long returnid) {
		this.returnid = returnid;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getReturncreatedtime() {
		return returncreatedtime;
	}

	public void setReturncreatedtime(Date returncreatedtime) {
		this.returncreatedtime = returncreatedtime;
	}
	
	@Length(min=0, max=100, message="客诉处理进度查询长度必须介于 0 和 100 之间")
	public String getCphandledprogress() {
		return cphandledprogress;
	}

	public void setCphandledprogress(String cphandledprogress) {
		this.cphandledprogress = cphandledprogress;
	}
	
	@Length(min=0, max=20, message="客诉所属快递公司编码长度必须介于 0 和 20 之间")
	public String getCpselectedcarrier() {
		return cpselectedcarrier;
	}

	public void setCpselectedcarrier(String cpselectedcarrier) {
		this.cpselectedcarrier = cpselectedcarrier;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCphandledovertime() {
		return cphandledovertime;
	}

	public void setCphandledovertime(Date cphandledovertime) {
		this.cphandledovertime = cphandledovertime;
	}
	
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCphandledupdatetime() {
		return cphandledupdatetime;
	}

	public void setCphandledupdatetime(Date cphandledupdatetime) {
		this.cphandledupdatetime = cphandledupdatetime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getRecordcreatedtime() {
		return recordcreatedtime;
	}

	public void setRecordcreatedtime(Date recordcreatedtime) {
		this.recordcreatedtime = recordcreatedtime;
	}
	
	public String getRecordcreatedby() {
		return recordcreatedby;
	}

	public void setRecordcreatedby(String recordcreatedby) {
		this.recordcreatedby = recordcreatedby;
	}
	
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