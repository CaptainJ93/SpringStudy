/**
 * Copyright &copy; 2012-2014 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.best1.scm.modules.vws.entity;



import org.hibernate.validator.constraints.Length;

import com.best1.scm.common.persistence.DataEntity;
import com.best1.scm.modules.sys.entity.Area;

/**
 * 配送区域时效Entity
 * @author hwh
 * @version 2016-02-26
 */
public class Carrierzipcode extends DataEntity<Carrierzipcode> {
	
	private static final long serialVersionUID = 1L;
	private Long carrierzipcodeid;		// carrierzipcodeid
	private Long carrierid;		// carrierid
	private String zipcode;		// zipcode
	private String deliveryarea;		// deliveryarea
	private String limitations;		// 时效
	private String freeze;		// freeze
	private int receivedpayments; //回款时效
	private int returntime;//退货时效
	
	
	
	
	private String carriername;	
	
	private CarrierInfo carrier;	
	private Area  area;
	
	
	
	public int getReturntime() {
		return returntime;
	}

	public void setReturntime(int returntime) {
		this.returntime = returntime;
	}

	public String getCarriername() {
		return carriername;
	}

	public void setCarriername(String carriername) {
		this.carriername = carriername;
	}

	public CarrierInfo getCarrier() {
		return carrier;
	}

	public void setCarrier(CarrierInfo carrier) {
		this.carrier = carrier;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Carrierzipcode() {
		super();
	}

	public Carrierzipcode(String id){
		super(id);
	}

	
	public Long getCarrierzipcodeid() {
		return carrierzipcodeid;
	}

	public void setCarrierzipcodeid(Long carrierzipcodeid) {
		this.carrierzipcodeid = carrierzipcodeid;
	}
	
	
	public Long getCarrierid() {
		return carrierid;
	}

	public void setCarrierid(Long carrierid) {
		this.carrierid = carrierid;
	}
	

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
	public String getDeliveryarea() {
		return deliveryarea;
	}

	public void setDeliveryarea(String deliveryarea) {
		this.deliveryarea = deliveryarea;
	}
	
	@Length(min=1, max=6, message="时效长度必须介于 1 和 6 之间")
	public String getLimitations() {
		return limitations;
	}

	public void setLimitations(String limitations) {
		this.limitations = limitations;
	}
	
	@Length(min=1, max=4, message="freeze长度必须介于 1 和 4 之间")
	public String getFreeze() {
		return freeze;
	}

	public void setFreeze(String freeze) {
		this.freeze = freeze;
	}

	public int getReceivedpayments() {
		return receivedpayments;
	}

	public void setReceivedpayments(int receivedpayments) {
		this.receivedpayments = receivedpayments;
	}
	
}