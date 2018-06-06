package com.best1.scm.modules.delivery.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.NotNull;

import com.best1.scm.common.persistence.DataEntity;

/**
 * 配送包裹明细Entity
 * @author hwh
 * @version 2016-03-02
 */
public class DeliveryOrderintransitDetail extends DataEntity<DeliveryOrderintransitDetail> {
	
	private static final long serialVersionUID = 1L;
	private long orderid;		// 客户订购ERP订单号
	private int itemid;		// 客户订购ERP中订单序号
	private long shiporderid;		// 客户订购ERP中出货单号
	private int shipordersequence;		// 客户订购ERP中出货单序号
	private long productid;		// 客户订购ERP中商品编号
	private int productversion;		// 商品版本号
	private String productname;		// 客户订购ERP中商品名称
	private int colorclasscode;		// 客户订购ERP中颜色类别代码
	private int colorcode;		// 客户订购ERP中颜色代码
	private int styleclasscode;		// 客户订购ERP中款式类别代码
	private int stylecode;		// 客户订购ERP中款式代码
	private String colorvalue;		// 客户订购ERP中颜色值
	private String stylevalue;		// 客户订购ERP中款式值
	private int productnum;		// 客户订购ERP中订购商品重量
	private double codnum;		// 订单cod金额
	private Date createdtimestamp;		// 客户订购ERP中订单创建时间
	private String trackingnumber;		// 对应的包裹号(快递单号)
	private int orderdeliverystatus;		// 订单配送状态，当半签半退时使用
	private Date recordcreatedtime;		// 记录创建时间
	private String recordcreatedby;		// 记录创建人
	private String lastupdatedby;		// lastupdatedby
	private Date lastupdatedtime;		// lastupdatedtime
	private int istoet1flag;   //是否回传Et1
	private int paymentstatus;//冲账状态
	private Date paymenttimestamp;//冲账回款日期时间
	
	
	
	
	
	
	
	
	public int getPaymentstatus() {
		return paymentstatus;
	}

	public void setPaymentstatus(int paymentstatus) {
		this.paymentstatus = paymentstatus;
	}

	public Date getPaymenttimestamp() {
		return paymenttimestamp;
	}

	public void setPaymenttimestamp(Date paymenttimestamp) {
		this.paymenttimestamp = paymenttimestamp;
	}

	public int getIstoet1flag() {
		return istoet1flag;
	}

	public void setIstoet1flag(int istoet1flag) {
		this.istoet1flag = istoet1flag;
	}

	public DeliveryOrderintransitDetail() {
		super();
	}

	public DeliveryOrderintransitDetail(String id){
		super(id);
	}

	
	public long getOrderid() {
		return orderid;
	}

	public void setOrderid(long orderid) {
		this.orderid = orderid;
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
	
	
	public int getShipordersequence() {
		return shipordersequence;
	}

	public void setShipordersequence(int shipordersequence) {
		this.shipordersequence = shipordersequence;
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
	
	@Length(min=1, max=50, message="客户订购ERP中商品名称长度必须介于 1 和 50 之间")
	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	
	public int getColorclasscode() {
		return colorclasscode;
	}

	public void setColorclasscode(int colorclasscode) {
		this.colorclasscode = colorclasscode;
	}
	
	
	public int getColorcode() {
		return colorcode;
	}

	public void setColorcode(int colorcode) {
		this.colorcode = colorcode;
	}
	
	
	public int getStyleclasscode() {
		return styleclasscode;
	}

	public void setStyleclasscode(int styleclasscode) {
		this.styleclasscode = styleclasscode;
	}
	

	public int getStylecode() {
		return stylecode;
	}

	public void setStylecode(int stylecode) {
		this.stylecode = stylecode;
	}
	
	@Length(min=0, max=10, message="客户订购ERP中颜色值长度必须介于 0 和 10 之间")
	public String getColorvalue() {
		return colorvalue;
	}

	public void setColorvalue(String colorvalue) {
		this.colorvalue = colorvalue;
	}
	
	@Length(min=0, max=10, message="客户订购ERP中款式值长度必须介于 0 和 10 之间")
	public String getStylevalue() {
		return stylevalue;
	}

	public void setStylevalue(String stylevalue) {
		this.stylevalue = stylevalue;
	}
	

	public int getProductnum() {
		return productnum;
	}

	public void setProductnum(int productnum) {
		this.productnum = productnum;
	}
	
	public double getCodnum() {
		return codnum;
	}

	public void setCodnum(double codnum) {
		this.codnum = codnum;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="客户订购ERP中订单创建时间不能为空")
	public Date getCreatedtimestamp() {
		return createdtimestamp;
	}

	public void setCreatedtimestamp(Date createdtimestamp) {
		this.createdtimestamp = createdtimestamp;
	}
	
	@Length(min=1, max=20, message="对应的包裹号(快递单号)长度必须介于 1 和 20 之间")
	public String getTrackingnumber() {
		return trackingnumber;
	}

	public void setTrackingnumber(String trackingnumber) {
		this.trackingnumber = trackingnumber;
	}
	
	
	public int getOrderdeliverystatus() {
		return orderdeliverystatus;
	}

	public void setOrderdeliverystatus(int orderdeliverystatus) {
		this.orderdeliverystatus = orderdeliverystatus;
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