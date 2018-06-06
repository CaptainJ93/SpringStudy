package com.best1.scm.modules.delivery.entity;

import java.util.Date;

import com.best1.scm.common.persistence.DataEntity;
import com.best1.scm.modules.vws.entity.CarrierInfo;

/**
 * 每日订单反馈表
 * @author zhangzujie
 *
 */
public class DeliveryQualityReportEveryDay  extends DataEntity<DeliveryQualityReportEveryDay>{
	private CarrierInfo carrier;	
	private String selectedcarrier;	//配送公司代码
	private Date createDateStart;  
	private Date createDateEnd;
	private Date everyday;  //日期
	
	private  int  signNum; //签收量
	private  int  rejectnum;  // 拒收量
	private  int  deliverynum; //封发量
	
	
	private  int  totalSignNum; //总签收量
	private  int  totalRejectnum;  // 总拒收量
	private  int  totalDeliverynum; //总封发量
	
	
	
	
	

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

	public int getTotalSignNum() {
		return totalSignNum;
	}

	public void setTotalSignNum(int totalSignNum) {
		this.totalSignNum = totalSignNum;
	}

	public int getTotalRejectnum() {
		return totalRejectnum;
	}

	public void setTotalRejectnum(int totalRejectnum) {
		this.totalRejectnum = totalRejectnum;
	}

	public int getTotalDeliverynum() {
		return totalDeliverynum;
	}

	public void setTotalDeliverynum(int totalDeliverynum) {
		this.totalDeliverynum = totalDeliverynum;
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

	public Date getEveryday() {
		return everyday;
	}

	public void setEveryday(Date everyday) {
		this.everyday = everyday;
	}

	
}
