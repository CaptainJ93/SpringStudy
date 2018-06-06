package com.best1.scm.modules.delivery.entity;

import java.util.Date;

import com.best1.scm.common.persistence.DataEntity;
import com.best1.scm.modules.vws.entity.CarrierInfo;

/**
 * 配送质量，时区占比 及时签收概况
 * @author zhangzujie
 *
 */
public class DeliveryQualityReportTimeAreaProportion  extends DataEntity<DeliveryQualityReportTimeAreaProportion>{
	private CarrierInfo carrier;	
	private String selectedcarrier;	//配送公司代码
	private Date createDateStart;  
	private Date createDateEnd;
	private Date everyday;  //日期
	
	private  int signInTimeNum; //及时签收量
	private int  timeareatotalnum;  // 每家快递公司每个时区内总量
	private  int carriertimeareatotalnum; //快递公司时区内总量
	
	private String receivingzipcode;		// 收件地邮编
	private String timearea; //时区
	private int signNum;       //绝对签收量
	
	
	
	public int getSignNum() {
		return signNum;
	}
	public void setSignNum(int signNum) {
		this.signNum = signNum;
	}
	
	public String getTimearea() {
		return timearea;
	}

	public void setTimearea(String timearea) {
		this.timearea = timearea;
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

	public int getTimeareatotalnum() {
		return timeareatotalnum;
	}

	public void setTimeareatotalnum(int timeareatotalnum) {
		this.timeareatotalnum = timeareatotalnum;
	}

	public int getSignInTimeNum() {
		return signInTimeNum;
	}

	public void setSignInTimeNum(int signInTimeNum) {
		this.signInTimeNum = signInTimeNum;
	}

	public int getCarriertimeareatotalnum() {
		return carriertimeareatotalnum;
	}

	public void setCarriertimeareatotalnum(int carriertimeareatotalnum) {
		this.carriertimeareatotalnum = carriertimeareatotalnum;
	}

	public String getReceivingzipcode() {
		return receivingzipcode;
	}

	public void setReceivingzipcode(String receivingzipcode) {
		this.receivingzipcode = receivingzipcode;
	}
	
	
}
