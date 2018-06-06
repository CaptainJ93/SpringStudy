package com.best1.api.entity.oaf.order;

import com.best1.api.entity.BaseObject;

public class ToafOrderedproductKey extends BaseObject{
 
    private Integer itemid;

 
    private Long orderid;


	public Integer getItemid() {
		return itemid;
	}

	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}


	public Long getOrderid() {
		return orderid;
	}


	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

 
  
}