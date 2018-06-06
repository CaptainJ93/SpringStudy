/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.returnpackage.entity;

import org.hibernate.validator.constraints.Length;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.best1.scm.common.persistence.DataEntity;
import com.best1.scm.modules.vws.entity.CarrierInfo;
import com.best1.scm.modules.vws.entity.Carrierzipcode;

/**
 * 退换货信息Entity
 * @author hwh
 * @version 2016-03-15
 */
public class ReturnReturnintransit extends DataEntity<ReturnReturnintransit> {
	
	private static final long serialVersionUID = 1L;
	private int warehouseid;		// 仓库编号
	private String zipcode;		// 邮编
	private String receiveaddress1;		// 收货地址1
	private String receiveaddress2;		// 收货地址2
	private String customername;		// 客户姓名
	private String telephonenumber;		// 客户电话号码
	private String mobilenumber;		// 客户手机号码
	private Date returntime;		// 销退建立时间
	private Long  returnid;		// 前台销退号
	private int returntype;		// 销退类型
	private Long customerid;		// 客户编号
	private Long selectedcarrier;		// 选择的快递公司
	private int isfacetofacerefund;		// 是否当面退款
	private double refundcodnumber;		// 当面退款cod金额
	private int isneedinvoice;		// 是否需要回收发票
	private Date receiptsuccesstime;		// 收货成功时间
	private Date tohygwarehousetime;		// 到达好易购仓库时间
	private Date receiptconfirmtime;		// 好易购仓库收货确认时间
	private String receiptdeliveryorderid;		// 收回使用的快递单号
	private int receiptstatus;		// 收回状态状态码
	private Date recordcreatedtime;		// 记录创建时间
	private String recordcreatedby;		// 记录创建人
	private String lastupdatedby;		// lastupdatedby
	private Date lastupdatedtime;		// lastupdatedtime
	
	private int deliverytype; //配送方式
	private int subdeliverytype;//子配送方式

	private CarrierInfo carrier;	
	
	private Date createDateStart;    
	private Date createDateEnd;
	
    private List<ReturnReturnintransitDetail> returnReturnintransitDetail;//包裹明细
	
	private List<ReturnReturnintransitPathdetail> returnReturnintransitPathdetail;//包裹路由
	
	private Carrierzipcode carrierzipcode;//配送时效
	
	private Date recordcreatedtimeStart;  //记录创建时间起
	private Date recordcreatedtimeEnd;//记录创建时间止
	
	

	public int getDeliverytype() {
		return deliverytype;
	}

	public void setDeliverytype(int deliverytype) {
		this.deliverytype = deliverytype;
	}

	public int getSubdeliverytype() {
		return subdeliverytype;
	}

	public void setSubdeliverytype(int subdeliverytype) {
		this.subdeliverytype = subdeliverytype;
	}

	public Date getRecordcreatedtimeStart() {
		return recordcreatedtimeStart;
	}

	public void setRecordcreatedtimeStart(Date recordcreatedtimeStart) {
		this.recordcreatedtimeStart = recordcreatedtimeStart;
	}

	public Date getRecordcreatedtimeEnd() {
		return recordcreatedtimeEnd;
	}

	public void setRecordcreatedtimeEnd(Date recordcreatedtimeEnd) {
		this.recordcreatedtimeEnd = recordcreatedtimeEnd;
	}

	public CarrierInfo getCarrier() {
		return carrier;
	}

	public void setCarrier(CarrierInfo carrier) {
		this.carrier = carrier;
	}

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

	public List<ReturnReturnintransitDetail> getReturnReturnintransitDetail() {
		return returnReturnintransitDetail;
	}

	public void setReturnReturnintransitDetail(
			List<ReturnReturnintransitDetail> returnReturnintransitDetail) {
		this.returnReturnintransitDetail = returnReturnintransitDetail;
	}

	public List<ReturnReturnintransitPathdetail> getReturnReturnintransitPathdetail() {
		return returnReturnintransitPathdetail;
	}

	public void setReturnReturnintransitPathdetail(
			List<ReturnReturnintransitPathdetail> returnReturnintransitPathdetail) {
		this.returnReturnintransitPathdetail = returnReturnintransitPathdetail;
	}

	public Carrierzipcode getCarrierzipcode() {
		return carrierzipcode;
	}

	public void setCarrierzipcode(Carrierzipcode carrierzipcode) {
		this.carrierzipcode = carrierzipcode;
	}

	public ReturnReturnintransit() {
		super();
	}

	public ReturnReturnintransit(String id){
		super(id);
	}

	public int getWarehouseid() {
		return warehouseid;
	}

	public void setWarehouseid(int warehouseid) {
		this.warehouseid = warehouseid;
	}
	
	@Length(min=0, max=20, message="邮编长度必须介于 0 和 20 之间")
	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	@Length(min=0, max=100, message="收货地址1长度必须介于 0 和 100 之间")
	public String getReceiveaddress1() {
		return receiveaddress1;
	}

	public void setReceiveaddress1(String receiveaddress1) {
		this.receiveaddress1 = receiveaddress1;
	}
	
	@Length(min=0, max=100, message="收货地址2长度必须介于 0 和 100 之间")
	public String getReceiveaddress2() {
		return receiveaddress2;
	}

	public void setReceiveaddress2(String receiveaddress2) {
		this.receiveaddress2 = receiveaddress2;
	}
	
	@Length(min=0, max=40, message="客户姓名长度必须介于 0 和 40 之间")
	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}
	
	@Length(min=0, max=40, message="客户电话号码长度必须介于 0 和 40 之间")
	public String getTelephonenumber() {
		return telephonenumber;
	}

	public void setTelephonenumber(String telephonenumber) {
		this.telephonenumber = telephonenumber;
	}
	
	@Length(min=0, max=40, message="客户手机号码长度必须介于 0 和 40 之间")
	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getReturntime() {
		return returntime;
	}

	public void setReturntime(Date returntime) {
		this.returntime = returntime;
	}
	public Long getReturnid() {
		return returnid;
	}

	public void setReturnid(Long returnid) {
		this.returnid = returnid;
	}
public int getReturntype() {
		return returntype;
	}

	public void setReturntype(int returntype) {
		this.returntype = returntype;
	}
	
	
	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}
	
	
	public Long getSelectedcarrier() {
		return selectedcarrier;
	}

	public void setSelectedcarrier(Long selectedcarrier) {
		this.selectedcarrier = selectedcarrier;
	}
	
	
	public int getIsfacetofacerefund() {
		return isfacetofacerefund;
	}

	public void setIsfacetofacerefund(int isfacetofacerefund) {
		this.isfacetofacerefund = isfacetofacerefund;
	}
	
	public double getRefundcodnumber() {
		return refundcodnumber;
	}

	public void setRefundcodnumber(double refundcodnumber) {
		this.refundcodnumber = refundcodnumber;
	}
	
	
	public int getIsneedinvoice() {
		return isneedinvoice;
	}

	public void setIsneedinvoice(int isneedinvoice) {
		this.isneedinvoice = isneedinvoice;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getReceiptsuccesstime() {
		return receiptsuccesstime;
	}

	public void setReceiptsuccesstime(Date receiptsuccesstime) {
		this.receiptsuccesstime = receiptsuccesstime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getTohygwarehousetime() {
		return tohygwarehousetime;
	}

	public void setTohygwarehousetime(Date tohygwarehousetime) {
		this.tohygwarehousetime = tohygwarehousetime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getReceiptconfirmtime() {
		return receiptconfirmtime;
	}

	public void setReceiptconfirmtime(Date receiptconfirmtime) {
		this.receiptconfirmtime = receiptconfirmtime;
	}
	
	@Length(min=0, max=20, message="收回使用的快递单号长度必须介于 0 和 20 之间")
	public String getReceiptdeliveryorderid() {
		return receiptdeliveryorderid;
	}

	public void setReceiptdeliveryorderid(String receiptdeliveryorderid) {
		this.receiptdeliveryorderid = receiptdeliveryorderid;
	}
	
	
	public int getReceiptstatus() {
		return receiptstatus;
	}

	public void setReceiptstatus(int receiptstatus) {
		this.receiptstatus = receiptstatus;
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