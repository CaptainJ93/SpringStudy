package com.best1.api.webservice.soap.response.dto.scm;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="productclass")
public class ProductClassDTO {
	
	private Long supplierid;

    private Integer productsclass;

    private Integer productmclass;
    
    private Integer rtncode;
    
	private String  rtnmsg;

	public Long getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Long supplierid) {
		this.supplierid = supplierid;
	}

	public Integer getProductsclass() {
		return productsclass;
	}

	public void setProductsclass(Integer productsclass) {
		this.productsclass = productsclass;
	}

	public Integer getProductmclass() {
		return productmclass;
	}

	public void setProductmclass(Integer productmclass) {
		this.productmclass = productmclass;
	}

	public Integer getRtncode() {
		return rtncode;
	}

	public void setRtncode(Integer rtncode) {
		this.rtncode = rtncode;
	}

	public String getRtnmsg() {
		return rtnmsg;
	}

	public void setRtnmsg(String rtnmsg) {
		this.rtnmsg = rtnmsg;
	}
    
}
