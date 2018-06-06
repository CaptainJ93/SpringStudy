package com.best1.api.entity.crm.campaigndetail;


import com.best1.api.entity.BaseObject;


public class Includeproductid extends BaseObject {

	private Long multicodeid;
	private Long productid;
	private Integer colourcode;
	private Integer stylecode;
	private Integer colourclass;
	private Integer styleclass;

	public Long getMulticodeid() {
		return multicodeid;
	}

	public void setMulticodeid(Long multicodeid) {
		this.multicodeid = multicodeid;
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public Integer getColourcode() {
		return colourcode;
	}

	public void setColourcode(Integer colourcode) {
		this.colourcode = colourcode;
	}

	public Integer getStylecode() {
		return stylecode;
	}

	public void setStylecode(Integer stylecode) {
		this.stylecode = stylecode;
	}

	public Integer getColourclass() {
		return colourclass;
	}

	public void setColourclass(Integer colourclass) {
		this.colourclass = colourclass;
	}

	public Integer getStyleclass() {
		return styleclass;
	}

	public void setStyleclass(Integer styleclass) {
		this.styleclass = styleclass;
	}



}
