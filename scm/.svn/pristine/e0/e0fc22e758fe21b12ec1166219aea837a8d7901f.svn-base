
package com.best1.scm.modules.delivery.entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.best1.scm.common.persistence.DataEntity;
import com.best1.scm.modules.vws.entity.CarrierInfo;
import com.best1.scm.modules.vws.entity.Carrierzipcode;

/**
 * 配送包裹Entity
 * @author hwh
 * @version 2016-03-02
 * 
 * 
 */
public class DeliveryOrderintransit extends DataEntity<DeliveryOrderintransit> {
	
	private static final long serialVersionUID = 1L;
	
	@NotBlank
	@Length(min=1, max=4, message="订单包裹仓库编码长度必须介于 1 和 4 之间")
	private int warehouseid;		// 订单包裹仓库编码
	
	
	
	private String trackingnumber;		// 快递单号
	private Long customerid;		// 收件人客户代码
	private String customertelnumber;		// 收件人电话号码
	private String customermobnumber;		// 收件人手机号码
	private String customername;		// 收件人姓名
	private String receivingzipcode;		// 收件地邮编
	private String receivingaddress1;		// 收件地省
	private String receivingaddress2;		// 收件地具体地址
	private double packageweight;		// 包裹重量
	private String packagevolume;        //包裹体积
	private double packagecodnum;		// 包裹代收货款金额
	private String packageremark;		// 包裹备注信息
	private String selectedcarrier;		// 包裹委托派送的快递公司编码
	private Date actualshipdate;		// 实际出货日期时间
	private int trackingstatus;		// 包裹状态码
	private Date receiptorrejecttime;   //签收、拒收时间
	private int isnoinventoryorders;		// 是否是无库存接单包裹
	private Date recordcreatedtime;		// 记录创建时间
	private String recordcreatedby;		// 记录创建人
	private String lastupdatedby;		// lastupdatedby
	private Date lastupdatedtime;		// lastupdatedtime
	private int packagetype;  //包裹类型
	private int deliverytype; //配送方式
	private int subdeliverytype;//子配送方式
	
	private String toet1flag;// 是否签收拒收信息已发送给et1
	private CarrierInfo carrier;	
	
	private Date createDateStart;  
	private Date createDateEnd;
	
	private List<DeliveryOrderintransitDetail> deliveryOrderintransitDetail;//包裹明细
	
	private List<DeliveryOrderintransitPathdetail> deliveryOrderintransitPathdetail;//包裹路由
	
	private Carrierzipcode carrierzipcode;//配送时效
	
	private Date recordcreatedtimeStart; // 记录创建时间起
	private Date recordcreatedtimeEnd; //记录创建时间止
	
	
	
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
	public String getPackagevolume() {
		return packagevolume;
	}

	public void setPackagevolume(String packagevolume) {
		this.packagevolume = packagevolume;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getReceiptorrejecttime() {
		return receiptorrejecttime;
	}

	public void setReceiptorrejecttime(Date receiptorrejecttime) {
		this.receiptorrejecttime = receiptorrejecttime;
	}

	public Carrierzipcode getCarrierzipcode() {
		return carrierzipcode;
	}

	public void setCarrierzipcode(Carrierzipcode carrierzipcode) {
		this.carrierzipcode = carrierzipcode;
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

	public CarrierInfo getCarrier() {
		return carrier;
	}

	public void setCarrier(CarrierInfo carrier) {
		this.carrier = carrier;
	}

	public DeliveryOrderintransit() {
		super();
	}

	public DeliveryOrderintransit(String id){
		super(id);
	}

	
	public int getWarehouseid() {
		return warehouseid;
	}

	public void setWarehouseid(int warehouseid) {
		this.warehouseid = warehouseid;
	}
	
	@Length(min=1, max=20, message="快递单号长度必须介于 1 和 20 之间")
	public String getTrackingnumber() {
		return trackingnumber;
	}

	public void setTrackingnumber(String trackingnumber) {
		this.trackingnumber = trackingnumber;
	}
	
	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}
	
	@Length(min=0, max=30, message="收件人电话号码长度必须介于 0 和 30 之间")
	public String getCustomertelnumber() {
		return customertelnumber;
	}

	public void setCustomertelnumber(String customertelnumber) {
		this.customertelnumber = customertelnumber;
	}
	
	@Length(min=0, max=30, message="收件人手机号码长度必须介于 0 和 30 之间")
	public String getCustomermobnumber() {
		return customermobnumber;
	}

	public void setCustomermobnumber(String customermobnumber) {
		this.customermobnumber = customermobnumber;
	}
	
	@Length(min=0, max=20, message="收件人姓名长度必须介于 0 和 20 之间")
	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}
	
	@Length(min=0, max=30, message="收件地邮编长度必须介于 0 和 30 之间")
	public String getReceivingzipcode() {
		return receivingzipcode;
	}

	public void setReceivingzipcode(String receivingzipcode) {
		this.receivingzipcode = receivingzipcode;
	}
	
	@Length(min=0, max=100, message="收件地省长度必须介于 0 和 100 之间")
	public String getReceivingaddress1() {
		return receivingaddress1;
	}

	public void setReceivingaddress1(String receivingaddress1) {
		this.receivingaddress1 = receivingaddress1;
	}
	
	@Length(min=0, max=100, message="收件地具体地址长度必须介于 0 和 100 之间")
	public String getReceivingaddress2() {
		return receivingaddress2;
	}

	public void setReceivingaddress2(String receivingaddress2) {
		this.receivingaddress2 = receivingaddress2;
	}
	
	public double getPackageweight() {
		return packageweight;
	}

	public void setPackageweight(double packageweight) {
		this.packageweight = packageweight;
	}
	
	public double getPackagecodnum() {
		return packagecodnum;
	}

	public void setPackagecodnum(double packagecodnum) {
		this.packagecodnum = packagecodnum;
	}
	
	@Length(min=0, max=100, message="包裹备注信息长度必须介于 0 和 100 之间")
	public String getPackageremark() {
		return packageremark;
	}

	public void setPackageremark(String packageremark) {
		this.packageremark = packageremark;
	}
	
	@Length(min=0, max=20, message="包裹委托派送的快递公司编码长度必须介于 0 和 20 之间")
	public String getSelectedcarrier() {
		return selectedcarrier;
	}

	public void setSelectedcarrier(String selectedcarrier) {
		this.selectedcarrier = selectedcarrier;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getActualshipdate() {
		return actualshipdate;
	}

	public void setActualshipdate(Date actualshipdate) {
		this.actualshipdate = actualshipdate;
	}
	
	
	public int getTrackingstatus() {
		return trackingstatus;
	}

	public void setTrackingstatus(int trackingstatus) {
		this.trackingstatus = trackingstatus;
	}
	
	
	public int getIsnoinventoryorders() {
		return isnoinventoryorders;
	}

	public void setIsnoinventoryorders(int isnoinventoryorders) {
		this.isnoinventoryorders = isnoinventoryorders;
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

	public List<DeliveryOrderintransitDetail> getDeliveryOrderintransitDetail() {
		return deliveryOrderintransitDetail;
	}

	public void setDeliveryOrderintransitDetail(
			List<DeliveryOrderintransitDetail> deliveryOrderintransitDetail) {
		this.deliveryOrderintransitDetail = deliveryOrderintransitDetail;
	}

	public List<DeliveryOrderintransitPathdetail> getDeliveryOrderintransitPathdetail() {
		return deliveryOrderintransitPathdetail;
	}

	public void setDeliveryOrderintransitPathdetail(
			List<DeliveryOrderintransitPathdetail> deliveryOrderintransitPathdetail) {
		this.deliveryOrderintransitPathdetail = deliveryOrderintransitPathdetail;
	}

	public int getPackagetype() {
		return packagetype;
	}

	public void setPackagetype(int packagetype) {
		this.packagetype = packagetype;
	}
	

	public String getToet1flag() {
		return toet1flag;
	}

	public void setToet1flag(String toet1flag) {
		this.toet1flag = toet1flag;
	}

	
}