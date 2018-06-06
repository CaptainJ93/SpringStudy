
package com.best1.api.entity.scm.product;


import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.best1.api.entity.BaseObject;

/**
 *  This field corresponds to the database table TSCM_PRODUCTSCLASS
 * 
 */
@Entity
@Table(name = "TSCM_PRODUCTSCLASS")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TscmProductsclass extends BaseObject{

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