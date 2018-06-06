package com.best1.api.webservice.soap.response.dto.oaf;

import java.util.List;

import com.best1.api.webservice.soap.response.dto.BasicDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.NON_NULL) 
public class OrderPaymentDTO extends BasicDTO{

	private Long orderid;

	private Integer itemid;

	
	private Long createdby;
	private Double productamount;

	private Long customerid;

	private String exceptiondesc;
	
	private Integer paymentchangereasoncode;
	
	private List<OrderPaymentModeDTO> paymentmodes;

	/**
	
	private Long companyid;

	private Long multicodeid;
	private Long productid;

	private Integer productversion;

	private Integer ordertype;
    private Integer colourcode;
	private Integer colourclass;

	private Integer stylecode;

	private Integer styleclass;
	
	private String productname;
  	private Date createdtimestamp;

	private Long lastmodifiedby;

	private Date lastmodifiedtimestamp;
**/

	public Long getOrderid() {
		return orderid;
	}

	public void setOrderid(Long orderid) {
		this.orderid = orderid;
	}

	public Integer getItemid() {
		return itemid;
	}

	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}



	public Long getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}

	public Double getProductamount() {
		return productamount;
	}

	public void setProductamount(Double productamount) {
		this.productamount = productamount;
	}

	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}

	public String getExceptiondesc() {
		return exceptiondesc;
	}

	public void setExceptiondesc(String exceptiondesc) {
		this.exceptiondesc = exceptiondesc;
	}

	public Integer getPaymentchangereasoncode() {
		return paymentchangereasoncode;
	}

	public void setPaymentchangereasoncode(Integer paymentchangereasoncode) {
		this.paymentchangereasoncode = paymentchangereasoncode;
	}

	public List<OrderPaymentModeDTO> getPaymentmodes() {
		return paymentmodes;
	}

	public void setPaymentmodes(List<OrderPaymentModeDTO> paymentmodes) {
		this.paymentmodes = paymentmodes;
	}
	

	
}
