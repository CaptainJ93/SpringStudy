package com.best1.scm.modules.delivery.entity;

import java.util.Date;

import com.best1.scm.common.persistence.DataEntity;
import com.best1.scm.modules.vws.entity.CarrierInfo;

/**
 * 每日在途订单
 * @author zhangzujie
 *
 */
public class DeliveryQualityReportOnway  extends DataEntity<DeliveryQualityReportOnway>{
	private CarrierInfo carrier;	
	private String selectedcarrier;	//配送公司代码
	private Date createDateStart;  
	private Date createDateEnd;
	
	private  int  signNum; //签收量
	private  int  rejectnum;  // 拒收量
	private  int  deliverynum; //封发量
	private  int   onwaynum;
	
	public int getOnwaynum() {
		return onwaynum;
	}

	public void setOnwaynum(int onwaynum) {
		this.onwaynum = onwaynum;
	}

	private String receivingzipcode;
	private String  areaname;
	

	public String getReceivingzipcode() {
		return receivingzipcode;
	}

	public void setReceivingzipcode(String receivingzipcode) {
		this.receivingzipcode = receivingzipcode;
	}

	public String getAreaname() {
		return areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}

	public int getSignNum() {
		return signNum;
	}

	public void setSignNum(int signNum) {
		this.signNum = signNum;
	}

	public int getRejectnum() {
		return rejectnum;
	}

	public void setRejectnum(int rejectnum) {
		this.rejectnum = rejectnum;
	}

	public int getDeliverynum() {
		return deliverynum;
	}

	public void setDeliverynum(int deliverynum) {
		this.deliverynum = deliverynum;
	}

	

	public CarrierInfo getCarrier() {
		return carrier;
	}

	public void setCarrier(CarrierInfo carrier) {
		this.carrier = carrier;
	}

	public String getSelectedcarrier() {
		return selectedcarrier;
	}

	public void setSelectedcarrier(String selectedcarrier) {
		this.selectedcarrier = selectedcarrier;
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



	
}
