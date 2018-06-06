package com.best1.scm.modules.delivery.entity;

import java.util.Date;

import com.best1.scm.common.persistence.DataEntity;
import com.best1.scm.modules.sys.entity.Area;
import com.best1.scm.modules.vws.entity.CarrierInfo;

/**
 * 配送质量，城市占比24小时签收  及时签收概况
 * @author zhangzujie
 *
 */
public class DeliveryQualityReportCityProportion extends DataEntity<DeliveryQualityReportCityProportion>{
	
	private CarrierInfo carrier;	
	private int packagesum;//总包裹数
	private String selectedcarrier;	//配送公司代码
	private String receivingzipcode;		// 收件地邮编
	private Area area;
	private long packagetotalnum;
	private Date createDateStart;  
	private Date createDateEnd;
	
	private Date everyday;  //日期
	private String cityname; //城市名
	
	private int signIn24HNum; //24小时签发量
	private  int signInTimeNum; //及时签收量
	private int signNum;       //绝对签收量
	
	
	
	public int getSignNum() {
		return signNum;
	}
	public void setSignNum(int signNum) {
		this.signNum = signNum;
	}
	public int getSignInTimeNum() {
		return signInTimeNum;
	}
	public void setSignInTimeNum(int signInTimeNum) {
		this.signInTimeNum = signInTimeNum;
	}
	public int getSignIn24HNum() {
		return signIn24HNum;
	}
	public void setSignIn24HNum(int signIn24HNum) {
		this.signIn24HNum = signIn24HNum;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public Date getEveryday() {
		return everyday;
	}
	public void setEveryday(Date everyday) {
		this.everyday = everyday;
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
	public long getPackagetotalnum() {
		return packagetotalnum;
	}
	public void setPackagetotalnum(long packagetotalnum) {
		this.packagetotalnum = packagetotalnum;
	}
	public CarrierInfo getCarrier() {
		return carrier;
	}
	public void setCarrier(CarrierInfo carrier) {
		this.carrier = carrier;
	}
	public int getPackagesum() {
		return packagesum;
	}
	public void setPackagesum(int packagesum) {
		this.packagesum = packagesum;
	}
	public String getSelectedcarrier() {
		return selectedcarrier;
	}
	public void setSelectedcarrier(String selectedcarrier) {
		this.selectedcarrier = selectedcarrier;
	}
	public String getReceivingzipcode() {
		return receivingzipcode;
	}
	public void setReceivingzipcode(String receivingzipcode) {
		this.receivingzipcode = receivingzipcode;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
}
