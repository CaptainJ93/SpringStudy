/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.supplier.entity;

import java.util.Date;

import org.hibernate.validator.constraints.Length;

import com.best1.scm.common.persistence.DataEntity;
import com.best1.scm.common.utils.excel.annotation.ExcelField;
import com.best1.scm.modules.sys.utils.UserUtils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 指送订单Entity
 * 
 * @author fanxuankai
 * @version 2017-01-05
 */
public class ScmSupplierCsoinfo extends DataEntity<ScmSupplierCsoinfo> {

	private static final long serialVersionUID = 1L;
	private Long shiporderid; // 出货单号
	private Long orderid; // 订单号
	private Integer itemid; // 订单序号
	private Integer orderstatus; // 订单状态
	private Double codamount; // 代收金额
	private Long productid; // 商品号
	private String productname; // 商品名称
	private Integer productversion; // 商品版本
	private Long productquantity; // 商品数量
	private String productstyledescription; // 商品款式
	private String productcolourdescription; // 商品颜色
	private Long supplierid; // 商品供应商代码
	private String suppliercompanyname; // 商品供应商公司名
	private String deliveryaddress1; // 收货地址1
	private String deliveryaddress2; // 收货地址2
	private Long customerid; // 客户代码
	private String customername; // 客户姓名
	private String hometelephone1; // 电话
	private String mobileno1; // 手机
	private String customerzipcode; // 邮编
	private String isneedinvoice; // 开具发票
	private String invoicenumber; // 发票号
	private String invoicecompanyno; // 发票公司编号
	private String invoicetitle; // 发票抬头
	private Double invoiceamount; // 发票金额
	private String invoicezipcode; // 发票邮编
	private String invoiceaddress1; // 发票地址1
	private String invoiceaddress2; // 发票地址2
	private Integer invoicetype; // 发票类型
	private Long invoiceaddressid; // 发票地址编号
	private String deliveryorderid; // 配送单号
	private Integer deliverytype; // 配送类别
	private Integer subdeliverytype; // 子配送类别
	private Long carrieridprimary; // 推荐的配送公司代码
	private Long selectedcarrier; // 选择的配送公司代码
	private String carrieridprimaryname; // 推荐的配送公司名称
	private String selectedcarriername; // 选择的配送公司名称
	private Date scheduledshipdate; // 计划出货时间
	private Date scheduleddeliverydate; // 计划配送日期
	private Date requireddeliverytime; // 要求配送时间
	private Long deliveryaddressid; // 配送地址编号
	private Integer warehouseid; // 仓库编号
	private Integer orderpriority; // 订单优先级
	private Integer shipordertype; // 出货单方式
	private String crossdockflag; // 越库
	private String isspecialpacking; // 特殊包装
	private String isoffshoredelivery; // 离岸配送
	private Integer shipordersequence; // 出货单序号
	private String giftpackmessage; // 礼品信息
	private String instructiontowms; // 仓库指送
	private String instructiontoscm; // 配送指示
	private Integer productcolourclass; // 商品颜色分类代码
	private Integer productcolourcode; // 商品颜色代码
	private Integer productstyleclass; // 商品款式分类代码
	private Integer productstylecode; // 商品款式代码
	private Integer subchannelid; // 通路
	private String paymentmode; // 付款方式
	private String ispromotionalproduct; // 赠品
	private Integer promotionrelationseq; // 赠品对应的主品序号
	private Double servicefee; // 服务费
	private Double offshoredeliverycharges; // 离岸配送费用
	private String isnewcustomer; // 新客户
	private Long membershiplevelid; // 客户等级
	private Date actualshipdate; // 实际发货日期
	private Date shipordercreateddate; // 出货单产生日期
	private String toet1flag; // 是否发送到et1的标记
	private Date recordcreatedtime; // 创建时间
	private String recordcreatedby; // 创建人
	private String lastupdatedby; // 修改人
	private Date lastupdatedtime; // 修改时间

	public ScmSupplierCsoinfo() {
		super();
	}

	public ScmSupplierCsoinfo(String id) {
		super(id);
	}

	public ScmSupplierCsoinfo(Long orderid, Integer itemid) {
		this.orderid = orderid;
		this.itemid = itemid;
	}

	public Long getShiporderid() {
		return shiporderid;
	}

	public void setShiporderid(Long shiporderid) {
		this.shiporderid = shiporderid;
	}

	@ExcelField(title = "订单号", sort = 300)
	public Long getOrderid() {
		return orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

	@ExcelField(title = "订单序号", sort = 400)
	public Integer getItemid() {
		return itemid;
	}

	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}

	@ExcelField(title = "订单状态", sort = 500, dictType = "OrderStatus")
	public Integer getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(Integer orderstatus) {
		this.orderstatus = orderstatus;
	}

	@ExcelField(title = "代收金额", sort = 510)
	public Double getCodamount() {
		return codamount;
	}

	public void setCodamount(Double codamount) {
		this.codamount = codamount;
	}

	@ExcelField(title = "商品号", sort = 600)
	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	@Length(min = 0, max = 50, message = "商品名称长度必须介于 0 和 50 之间")
	@ExcelField(title = "商品名称", sort = 610)
	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Integer getProductversion() {
		return productversion;
	}

	public void setProductversion(Integer productversion) {
		this.productversion = productversion;
	}

	@ExcelField(title = "商品数量", sort = 800)
	public Long getProductquantity() {
		return productquantity;
	}

	public void setProductquantity(Long productquantity) {
		this.productquantity = productquantity;
	}

	@Length(min = 0, max = 75, message = "商品款式长度必须介于 0 和 75 之间")
	@ExcelField(title = "商品款式", sort = 900)
	public String getProductstyledescription() {
		return productstyledescription;
	}

	public void setProductstyledescription(String productstyledescription) {
		this.productstyledescription = productstyledescription;
	}

	@Length(min = 0, max = 75, message = "商品颜色长度必须介于 0 和 75 之间")
	@ExcelField(title = "商品颜色", sort = 1000)
	public String getProductcolourdescription() {
		return productcolourdescription;
	}

	public void setProductcolourdescription(String productcolourdescription) {
		this.productcolourdescription = productcolourdescription;
	}

	public Long getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Long supplierid) {
		this.supplierid = supplierid;
	}

	@ExcelField(title = "商品供应商公司名", sort = 1020)
	public String getSuppliercompanyname() {
		return suppliercompanyname;
	}

	public void setSuppliercompanyname(String suppliercompanyname) {
		this.suppliercompanyname = suppliercompanyname;
	}

	@Length(min = 0, max = 180, message = "收货地址1长度必须介于 0 和 180 之间")
	@ExcelField(title = "收货地址1", sort = 1100)
	public String getDeliveryaddress1() {
		return deliveryaddress1;
	}

	public void setDeliveryaddress1(String deliveryaddress1) {
		this.deliveryaddress1 = deliveryaddress1;
	}

	@Length(min = 0, max = 180, message = "收货地址2长度必须介于 0 和 180 之间")
	@ExcelField(title = "收货地址2", sort = 1200)
	public String getDeliveryaddress2() {
		return deliveryaddress2;
	}

	public void setDeliveryaddress2(String deliveryaddress2) {
		this.deliveryaddress2 = deliveryaddress2;
	}

	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}

	@Length(min = 0, max = 64, message = "客户姓名长度必须介于 0 和 64 之间")
	@ExcelField(title = "客户姓名", sort = 1400)
	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	@Length(min = 0, max = 20, message = "电话长度必须介于 0 和 20 之间")
	@ExcelField(title = "电话", sort = 1500)
	public String getHometelephone1() {
		return hometelephone1;
	}

	public void setHometelephone1(String hometelephone1) {
		this.hometelephone1 = hometelephone1;
	}

	@Length(min = 0, max = 12, message = "手机长度必须介于 0 和 12 之间")
	@ExcelField(title = "手机", sort = 1600)
	public String getMobileno1() {
		return mobileno1;
	}

	public void setMobileno1(String mobileno1) {
		this.mobileno1 = mobileno1;
	}

	@Length(min = 0, max = 6, message = "邮编长度必须介于 0 和 6 之间")
	public String getCustomerzipcode() {
		return customerzipcode;
	}

	public void setCustomerzipcode(String customerzipcode) {
		this.customerzipcode = customerzipcode;
	}

	@Length(min = 0, max = 1, message = "开具发票长度必须介于 0 和 1 之间")
	public String getIsneedinvoice() {
		return isneedinvoice;
	}

	public void setIsneedinvoice(String isneedinvoice) {
		this.isneedinvoice = isneedinvoice;
	}

	@Length(min = 0, max = 42, message = "发票号长度必须介于 0 和 42 之间")
	public String getInvoicenumber() {
		return invoicenumber;
	}

	public void setInvoicenumber(String invoicenumber) {
		this.invoicenumber = invoicenumber;
	}

	@Length(min = 0, max = 20, message = "发票公司编号长度必须介于 0 和 20 之间")
	public String getInvoicecompanyno() {
		return invoicecompanyno;
	}

	public void setInvoicecompanyno(String invoicecompanyno) {
		this.invoicecompanyno = invoicecompanyno;
	}

	@Length(min = 0, max = 200, message = "发票抬头长度必须介于 0 和 200 之间")
	public String getInvoicetitle() {
		return invoicetitle;
	}

	public void setInvoicetitle(String invoicetitle) {
		this.invoicetitle = invoicetitle;
	}

	public Double getInvoiceamount() {
		return invoiceamount;
	}

	public void setInvoiceamount(Double invoiceamount) {
		this.invoiceamount = invoiceamount;
	}

	@Length(min = 0, max = 6, message = "发票邮编长度必须介于 0 和 6 之间")
	public String getInvoicezipcode() {
		return invoicezipcode;
	}

	public void setInvoicezipcode(String invoicezipcode) {
		this.invoicezipcode = invoicezipcode;
	}

	@Length(min = 0, max = 120, message = "发票地址1长度必须介于 0 和 120 之间")
	public String getInvoiceaddress1() {
		return invoiceaddress1;
	}

	public void setInvoiceaddress1(String invoiceaddress1) {
		this.invoiceaddress1 = invoiceaddress1;
	}

	@Length(min = 0, max = 120, message = "发票地址2长度必须介于 0 和 120 之间")
	public String getInvoiceaddress2() {
		return invoiceaddress2;
	}

	public void setInvoiceaddress2(String invoiceaddress2) {
		this.invoiceaddress2 = invoiceaddress2;
	}

	public Integer getInvoicetype() {
		return invoicetype;
	}

	public void setInvoicetype(Integer invoicetype) {
		this.invoicetype = invoicetype;
	}

	public Long getInvoiceaddressid() {
		return invoiceaddressid;
	}

	public void setInvoiceaddressid(Long invoiceaddressid) {
		this.invoiceaddressid = invoiceaddressid;
	}

	@Length(min = 0, max = 20, message = "配送单号长度必须介于 0 和 20 之间")
	@ExcelField(title = "配送单号", sort = 2800)
	public String getDeliveryorderid() {
		return deliveryorderid;
	}

	public void setDeliveryorderid(String deliveryorderid) {
		this.deliveryorderid = deliveryorderid;
	}

	public Integer getDeliverytype() {
		return deliverytype;
	}

	public void setDeliverytype(Integer deliverytype) {
		this.deliverytype = deliverytype;
	}

	@ExcelField(title = "子配送类别", sort = 3000, dictType = "SubDeliveryType")
	public Integer getSubdeliverytype() {
		return subdeliverytype;
	}

	public void setSubdeliverytype(Integer subdeliverytype) {
		this.subdeliverytype = subdeliverytype;
	}

	public Long getCarrieridprimary() {
		return carrieridprimary;
	}

	public void setCarrieridprimary(Long carrieridprimary) {
		this.carrieridprimary = carrieridprimary;
	}

	public Long getSelectedcarrier() {
		return selectedcarrier;
	}

	public void setSelectedcarrier(Long selectedcarrier) {
		this.selectedcarrier = selectedcarrier;
	}

	@ExcelField(title = "推荐的配送公司名称", sort = 3110)
	public String getCarrieridprimaryname() {
		return carrieridprimaryname;
	}

	public void setCarrieridprimaryname(String carrieridprimaryname) {
		this.carrieridprimaryname = carrieridprimaryname;
	}

	@ExcelField(title = "选择的配送公司名称", sort = 3210)
	public String getSelectedcarriername() {
		return selectedcarriername;
	}

	public void setSelectedcarriername(String selectedcarriername) {
		this.selectedcarriername = selectedcarriername;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getScheduledshipdate() {
		return scheduledshipdate;
	}

	public void setScheduledshipdate(Date scheduledshipdate) {
		this.scheduledshipdate = scheduledshipdate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getScheduleddeliverydate() {
		return scheduleddeliverydate;
	}

	public void setScheduleddeliverydate(Date scheduleddeliverydate) {
		this.scheduleddeliverydate = scheduleddeliverydate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getRequireddeliverytime() {
		return requireddeliverytime;
	}

	public void setRequireddeliverytime(Date requireddeliverytime) {
		this.requireddeliverytime = requireddeliverytime;
	}

	public Long getDeliveryaddressid() {
		return deliveryaddressid;
	}

	public void setDeliveryaddressid(Long deliveryaddressid) {
		this.deliveryaddressid = deliveryaddressid;
	}

	public Integer getWarehouseid() {
		return warehouseid;
	}

	public void setWarehouseid(Integer warehouseid) {
		this.warehouseid = warehouseid;
	}

	public Integer getOrderpriority() {
		return orderpriority;
	}

	public void setOrderpriority(Integer orderpriority) {
		this.orderpriority = orderpriority;
	}

	public Integer getShipordertype() {
		return shipordertype;
	}

	public void setShipordertype(Integer shipordertype) {
		this.shipordertype = shipordertype;
	}

	@Length(min = 0, max = 1, message = "越库长度必须介于 0 和 1 之间")
	public String getCrossdockflag() {
		return crossdockflag;
	}

	public void setCrossdockflag(String crossdockflag) {
		this.crossdockflag = crossdockflag;
	}

	@Length(min = 0, max = 1, message = "特殊包装长度必须介于 0 和 1 之间")
	public String getIsspecialpacking() {
		return isspecialpacking;
	}

	public void setIsspecialpacking(String isspecialpacking) {
		this.isspecialpacking = isspecialpacking;
	}

	@Length(min = 0, max = 1, message = "离岸配送长度必须介于 0 和 1 之间")
	public String getIsoffshoredelivery() {
		return isoffshoredelivery;
	}

	public void setIsoffshoredelivery(String isoffshoredelivery) {
		this.isoffshoredelivery = isoffshoredelivery;
	}

	public Integer getShipordersequence() {
		return shipordersequence;
	}

	public void setShipordersequence(Integer shipordersequence) {
		this.shipordersequence = shipordersequence;
	}

	@Length(min = 0, max = 200, message = "礼品信息长度必须介于 0 和 200 之间")
	public String getGiftpackmessage() {
		return giftpackmessage;
	}

	public void setGiftpackmessage(String giftpackmessage) {
		this.giftpackmessage = giftpackmessage;
	}

	@Length(min = 0, max = 200, message = "仓库指送长度必须介于 0 和 200 之间")
	public String getInstructiontowms() {
		return instructiontowms;
	}

	public void setInstructiontowms(String instructiontowms) {
		this.instructiontowms = instructiontowms;
	}

	@Length(min = 0, max = 200, message = "配送指示长度必须介于 0 和 200 之间")
	public String getInstructiontoscm() {
		return instructiontoscm;
	}

	public void setInstructiontoscm(String instructiontoscm) {
		this.instructiontoscm = instructiontoscm;
	}

	public Integer getProductcolourclass() {
		return productcolourclass;
	}

	public void setProductcolourclass(Integer productcolourclass) {
		this.productcolourclass = productcolourclass;
	}

	public Integer getProductcolourcode() {
		return productcolourcode;
	}

	public void setProductcolourcode(Integer productcolourcode) {
		this.productcolourcode = productcolourcode;
	}

	public Integer getProductstyleclass() {
		return productstyleclass;
	}

	public void setProductstyleclass(Integer productstyleclass) {
		this.productstyleclass = productstyleclass;
	}

	public Integer getProductstylecode() {
		return productstylecode;
	}

	public void setProductstylecode(Integer productstylecode) {
		this.productstylecode = productstylecode;
	}

	public Integer getSubchannelid() {
		return subchannelid;
	}

	public void setSubchannelid(Integer subchannelid) {
		this.subchannelid = subchannelid;
	}

	@Length(min = 0, max = 1, message = "付款方式长度必须介于 0 和 1 之间")
	public String getPaymentmode() {
		return paymentmode;
	}

	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}

	@Length(min = 0, max = 1, message = "赠品长度必须介于 0 和 1 之间")
	public String getIspromotionalproduct() {
		return ispromotionalproduct;
	}

	public void setIspromotionalproduct(String ispromotionalproduct) {
		this.ispromotionalproduct = ispromotionalproduct;
	}

	public Integer getPromotionrelationseq() {
		return promotionrelationseq;
	}

	public void setPromotionrelationseq(Integer promotionrelationseq) {
		this.promotionrelationseq = promotionrelationseq;
	}

	public Double getServicefee() {
		return servicefee;
	}

	public void setServicefee(Double servicefee) {
		this.servicefee = servicefee;
	}

	public Double getOffshoredeliverycharges() {
		return offshoredeliverycharges;
	}

	public void setOffshoredeliverycharges(Double offshoredeliverycharges) {
		this.offshoredeliverycharges = offshoredeliverycharges;
	}

	@Length(min = 0, max = 1, message = "新客户长度必须介于 0 和 1 之间")
	public String getIsnewcustomer() {
		return isnewcustomer;
	}

	public void setIsnewcustomer(String isnewcustomer) {
		this.isnewcustomer = isnewcustomer;
	}

	public Long getMembershiplevelid() {
		return membershiplevelid;
	}

	public void setMembershiplevelid(Long membershiplevelid) {
		this.membershiplevelid = membershiplevelid;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getActualshipdate() {
		return actualshipdate;
	}

	public void setActualshipdate(Date actualshipdate) {
		this.actualshipdate = actualshipdate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getShipordercreateddate() {
		return shipordercreateddate;
	}

	public void setShipordercreateddate(Date shipordercreateddate) {
		this.shipordercreateddate = shipordercreateddate;
	}

	@Length(min = 0, max = 4, message = "是否发送到et1的标记长度必须介于 0 和 4 之间")
	public String getToet1flag() {
		return toet1flag;
	}

	public void setToet1flag(String toet1flag) {
		this.toet1flag = toet1flag;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@ExcelField(title = "创建时间", sort = 6200)
	public Date getRecordcreatedtime() {
		return recordcreatedtime;
	}

	public void setRecordcreatedtime(Date recordcreatedtime) {
		this.recordcreatedtime = recordcreatedtime;
	}

	@Length(min = 0, max = 100, message = "创建人长度必须介于 0 和 100 之间")
	public String getRecordcreatedby() {
		return recordcreatedby;
	}

	public void setRecordcreatedby(String recordcreatedby) {
		this.recordcreatedby = recordcreatedby;
	}

	@Length(min = 0, max = 100, message = "修改人长度必须介于 0 和 100 之间")
	public String getLastupdatedby() {
		return lastupdatedby;
	}

	public void setLastupdatedby(String lastupdatedby) {
		this.lastupdatedby = lastupdatedby;
	}

	// 修改人用户名
	public String getLastupdatedbyUsername() {
		if (lastupdatedby == null) {
			return null;
		}
		return UserUtils.get(lastupdatedby).getName();
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getLastupdatedtime() {
		return lastupdatedtime;
	}

	public void setLastupdatedtime(Date lastupdatedtime) {
		this.lastupdatedtime = lastupdatedtime;
	}

	private Criteria criteria; // 搜索条件

	@JsonIgnore
	public Criteria getCriteria() {
		if (criteria == null) {
			criteria = new Criteria();
		}
		return criteria;
	}

	public void setCriteria(Criteria criteria) {
		this.criteria = criteria;
	}

	public class Criteria {
		private Date createDateFrom;
		private Date createDateTo;
		private boolean byCarrier;
		private boolean bySupplier;

		public Date getCreateDateFrom() {
			return createDateFrom;
		}

		public void setCreateDateFrom(Date createDateFrom) {
			this.createDateFrom = createDateFrom;
		}

		public Date getCreateDateTo() {
			return createDateTo;
		}

		public void setCreateDateTo(Date createDateTo) {
			this.createDateTo = createDateTo;
		}

		public boolean isByCarrier() {
			return byCarrier;
		}

		public void setByCarrier(boolean byCarrier) {
			this.byCarrier = byCarrier;
		}

		public boolean isBySupplier() {
			return bySupplier;
		}

		public void setBySupplier(boolean bySupplier) {
			this.bySupplier = bySupplier;
		}

	}
}