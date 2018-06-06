/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.supplier.entity;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.best1.scm.common.persistence.DataEntity;
import com.best1.scm.common.utils.excel.annotation.ExcelField;

/**
 * 供应商-退货单头信息Entity
 * @author admin
 * @version 2016-12-13
 */
public class ScmSupplierSroheader extends DataEntity<ScmSupplierSroheader> {
	
	private static final long serialVersionUID = 1L;
	private Integer warehouseid;		// 仓库编号
	private String zipcode;		// 邮编
	private String receiveaddress1;		// 收货地址1
	private String receiveaddress2;		// 收货地址2
	private String customername;		// 客户姓名
	private String telephonenumber;		// 客户电话号码
	private String mobilenumber;		// 客户手机号码
	private Date returntime;		// 销退建立时间
	private Long returnid;		// 前台销退号
	private Integer returntype;		// 销退类型
	private Long customerid;		// 客户编号
	private Long selectedcarrier;		// 选择的快递公司
	private Integer isfacetofacerefund;		// 是否当面退款
	private Double refundcodnumber;		// 当面退款cod金额
	private Integer isneedinvoice;		// 是否需要回收发票
	private Date receiptsuccesstime;		// 收货成功时间
	private Date tohygwarehousetime;		// 到达好易购仓库时间
	private Date receiptconfirmtime;		// 好易购仓库收货确认时间
	private String receiptdeliveryorderid;		// 收回使用的快递单号
	private Integer receiptstatus;		// 收回状态码
	private Date recordcreatedtime;		// 记录创建时间
	private String recordcreatedby;		// 记录创建人
	private String lastupdatedby;		// 修改人
	private Date lastupdatedtime;		// 修改时间
	private Integer deliverytype;		// 配送方式
	private Integer subdeliverytype;		// 子配送方式
	private List<ScmSupplierSrodetail> returnReturnintransitDetail;
	private String toet1flag;
	private Long supplierid; //供应商id
	
	private Date recordcreatedtimeStart;  //记录创建时间起
	private Date recordcreatedtimeEnd;//记录创建时间止
	private Date returntimeStart; //销退建立时间起
	private Date returntimeEnd; //销退建立时间止
	private Date receiptsuccesstimeStart;		// 收货成功时间起
	private Date receiptsuccesstimeEnd;		// 收货成功时间止
	
	private Long productid;		// 商品编号
	private Integer productversion;		// 商品版本号
	private String productname;		// 商品名称
	private String colorvalue;		// 颜色值
	private String stylevalue;		// 款式值
	private Long productnumber;		// 商品数量
	private String productdetail;		// 商品明细
	private String productboxingdetail;		// 商品装箱明细
	
	private String selectedcarriername;		// 选择的快递公司名称
	
	public List<ScmSupplierSrodetail> getReturnReturnintransitDetail() {
		return returnReturnintransitDetail;
	}

	public void setReturnReturnintransitDetail(
			List<ScmSupplierSrodetail> returnReturnintransitDetail) {
		this.returnReturnintransitDetail = returnReturnintransitDetail;
	}

	public ScmSupplierSroheader() {
		super();
	}

	public ScmSupplierSroheader(String id){
		super(id);
	}

	@NotNull(message="仓库编号不能为空")
	@ExcelField(title="仓库编号", sort=15)
	public Integer getWarehouseid() {
		return warehouseid;
	}

	public void setWarehouseid(Integer warehouseid) {
		this.warehouseid = warehouseid;
	}
	
	@Length(min=1, max=20, message="邮编长度必须介于 1 和 20 之间")
	@ExcelField(title="邮编", sort=20)
	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	@Length(min=1, max=100, message="收货地址1长度必须介于 1 和 100 之间")
	@ExcelField(title="收货地址1", sort=30)
	public String getReceiveaddress1() {
		return receiveaddress1;
	}

	public void setReceiveaddress1(String receiveaddress1) {
		this.receiveaddress1 = receiveaddress1;
	}
	
	@Length(min=1, max=100, message="收货地址2长度必须介于 1 和 100 之间")
	@ExcelField(title="收货地址2", sort=40)
	public String getReceiveaddress2() {
		return receiveaddress2;
	}

	public void setReceiveaddress2(String receiveaddress2) {
		this.receiveaddress2 = receiveaddress2;
	}
	
	@Length(min=1, max=40, message="客户姓名长度必须介于 1 和 40 之间")
	@ExcelField(title="客户姓名", sort=50)
	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}
	
	@Length(min=0, max=40, message="客户电话号码长度必须介于 0 和 40 之间")
	@ExcelField(title="客户电话号码", sort=60)
	public String getTelephonenumber() {
		return telephonenumber;
	}

	public void setTelephonenumber(String telephonenumber) {
		this.telephonenumber = telephonenumber;
	}
	
	@Length(min=0, max=40, message="客户手机号码长度必须介于 0 和 40 之间")
	@ExcelField(title="客户手机号码", sort=70)
	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ExcelField(title="销退建立时间", sort=80)
	public Date getReturntime() {
		return returntime;
	}

	public void setReturntime(Date returntime) {
		this.returntime = returntime;
	}
	
	@NotNull(message="前台销退号不能为空")
	@ExcelField(title="前台销退号", sort=1)
	public Long getReturnid() {
		return returnid;
	}

	public void setReturnid(Long returnid) {
		this.returnid = returnid;
	}
	
	@NotNull(message="销退类型不能为空")
	@ExcelField(title="销退类型", sort=100)
	public Integer getReturntype() {
		return returntype;
	}

	public void setReturntype(Integer returntype) {
		this.returntype = returntype;
	}
	
	@NotNull(message="客户编号不能为空")
	@ExcelField(title="客户编号", sort=110)
	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}
	
	@NotNull(message="选择的快递公司不能为空")
	@ExcelField(title="选择的快递公司", sort=120)
	public Long getSelectedcarrier() {
		return selectedcarrier;
	}

	public void setSelectedcarrier(Long selectedcarrier) {
		this.selectedcarrier = selectedcarrier;
	}
	
	@NotNull(message="是否当面退款不能为空")
	@ExcelField(title="是否当面退款", sort=130)
	public Integer getIsfacetofacerefund() {
		return isfacetofacerefund;
	}

	public void setIsfacetofacerefund(Integer isfacetofacerefund) {
		this.isfacetofacerefund = isfacetofacerefund;
	}
	
	@ExcelField(title="当面退款COD金额", sort=140)
	public Double getRefundcodnumber() {
		return refundcodnumber;
	}

	public void setRefundcodnumber(Double refundcodnumber) {
		this.refundcodnumber = refundcodnumber;
	}
	
	@ExcelField(title="是否需要回收发票", sort=150)
	public Integer getIsneedinvoice() {
		return isneedinvoice;
	}

	public void setIsneedinvoice(Integer isneedinvoice) {
		this.isneedinvoice = isneedinvoice;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ExcelField(title="收获成功时间", sort=160)
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
	@ExcelField(title="收回使用的快递单号", sort=170)
	public String getReceiptdeliveryorderid() {
		return receiptdeliveryorderid;
	}

	public void setReceiptdeliveryorderid(String receiptdeliveryorderid) {
		this.receiptdeliveryorderid = receiptdeliveryorderid;
	}
	
	@NotNull(message="收回状态状态码不能为空")
	@ExcelField(title="收回状态码", sort=180)
	public Integer getReceiptstatus() {
		return receiptstatus;
	}

	public void setReceiptstatus(Integer receiptstatus) {
		this.receiptstatus = receiptstatus;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ExcelField(title="记录创建时间", sort=190)
	public Date getRecordcreatedtime() {
		return recordcreatedtime;
	}

	public void setRecordcreatedtime(Date recordcreatedtime) {
		this.recordcreatedtime = recordcreatedtime;
	}
	
	@Length(min=0, max=4, message="记录创建人长度必须介于 0 和 4 之间")
	@ExcelField(title="记录创建人", sort=200)
	public String getRecordcreatedby() {
		return recordcreatedby;
	}

	public void setRecordcreatedby(String recordcreatedby) {
		this.recordcreatedby = recordcreatedby;
	}
	
	@Length(min=0, max=100, message="lastupdatedby长度必须介于 0 和 100 之间")
	public String getLastupdatedby() {
		return lastupdatedby;
	}

	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ExcelField(title="修改时间", sort=210)
	public Date getLastupdatedtime() {
		return lastupdatedtime;
	}

	public void setLastupdatedtime(Date lastupdatedtime) {
		this.lastupdatedtime = lastupdatedtime;
	}
	
	@ExcelField(title="配送方式", sort=220)
	public Integer getDeliverytype() {
		return deliverytype;
	}

	public void setDeliverytype(Integer deliverytype) {
		this.deliverytype = deliverytype;
	}
	
	@ExcelField(title="子配送方式", sort=230)
	public Integer getSubdeliverytype() {
		return subdeliverytype;
	}

	public void setSubdeliverytype(Integer subdeliverytype) {
		this.subdeliverytype = subdeliverytype;
	}

	public String getToet1flag() {
		return toet1flag;
	}

	public void setToet1flag(String toet1flag) {
		this.toet1flag = toet1flag;
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

	public Date getReturntimeStart() {
		return returntimeStart;
	}

	public void setReturntimeStart(Date returntimeStart) {
		this.returntimeStart = returntimeStart;
	}

	public Date getReturntimeEnd() {
		return returntimeEnd;
	}

	public void setReturntimeEnd(Date returntimeEnd) {
		this.returntimeEnd = returntimeEnd;
	}

	public Date getReceiptsuccesstimeStart() {
		return receiptsuccesstimeStart;
	}

	public void setReceiptsuccesstimeStart(Date receiptsuccesstimeStart) {
		this.receiptsuccesstimeStart = receiptsuccesstimeStart;
	}

	public Date getReceiptsuccesstimeEnd() {
		return receiptsuccesstimeEnd;
	}

	public void setReceiptsuccesstimeEnd(Date receiptsuccesstimeEnd) {
		this.receiptsuccesstimeEnd = receiptsuccesstimeEnd;
	}

	@ExcelField(title="供应商id", sort=10)
	public Long getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Long supplierid) {
		this.supplierid = supplierid;
	}

	@ExcelField(title="商品编号", sort=240)
	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}
	
	@ExcelField(title="商品版本号", sort=250)
	public Integer getProductversion() {
		return productversion;
	}

	public void setProductversion(Integer productversion) {
		this.productversion = productversion;
	}

	@ExcelField(title="商品名称", sort=260)
	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	@ExcelField(title="颜色值", sort=270)
	public String getColorvalue() {
		return colorvalue;
	}

	public void setColorvalue(String colorvalue) {
		this.colorvalue = colorvalue;
	}

	@ExcelField(title="款式值", sort=280)
	public String getStylevalue() {
		return stylevalue;
	}

	public void setStylevalue(String stylevalue) {
		this.stylevalue = stylevalue;
	}

	@ExcelField(title="商品数量", sort=290)
	public Long getProductnumber() {
		return productnumber;
	}

	public void setProductnumber(Long productnumber) {
		this.productnumber = productnumber;
	}

	@ExcelField(title="商品明细", sort=300)
	public String getProductdetail() {
		return productdetail;
	}

	public void setProductdetail(String productdetail) {
		this.productdetail = productdetail;
	}

	@ExcelField(title="商品装箱明细", sort=310)
	public String getProductboxingdetail() {
		return productboxingdetail;
	}

	public void setProductboxingdetail(String productboxingdetail) {
		this.productboxingdetail = productboxingdetail;
	}

	public String getSelectedcarriername() {
		return selectedcarriername;
	}

	public void setSelectedcarriername(String selectedcarriername) {
		this.selectedcarriername = selectedcarriername;
	}
	
}