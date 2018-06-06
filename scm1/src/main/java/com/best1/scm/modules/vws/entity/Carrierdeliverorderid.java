package com.best1.scm.modules.vws.entity;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.best1.scm.common.persistence.DataEntity;

/**
 * 配送公司面单Entity
 * @author huwh
 * @version 2016-03-30
 */
public class Carrierdeliverorderid extends DataEntity<Carrierdeliverorderid> {
	
	private static final long serialVersionUID = 1L;
	private Long carrierid;		// carrierid
	private String deliveryorderid;		// deliveryorderid
	private Integer status;		// 是否已使用
	
	private CarrierInfo carrier;	
	
	
	public Carrierdeliverorderid() {
		super();
	}

	public Carrierdeliverorderid(String id){
		super(id);
	}

	
	
	public CarrierInfo getCarrier() {
		return carrier;
	}

	public void setCarrier(CarrierInfo carrier) {
		this.carrier = carrier;
	}

	@NotNull(message="carrierid不能为空")
	public Long getCarrierid() {
		return carrierid;
	}

	public void setCarrierid(Long carrierid) {
		this.carrierid = carrierid;
	}
	
	@Length(min=1, max=20, message="deliveryorderid长度必须介于 1 和 20 之间")
	public String getDeliveryorderid() {
		return deliveryorderid;
	}

	public void setDeliveryorderid(String deliveryorderid) {
		this.deliveryorderid = deliveryorderid;
	}
	
	@NotNull(message="是否已使用不能为空")
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
}