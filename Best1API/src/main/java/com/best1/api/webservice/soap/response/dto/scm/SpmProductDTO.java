package com.best1.api.webservice.soap.response.dto.scm;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "spmproduct")
public class SpmProductDTO {

	private Long productid;

	private Long supplierid;

	private String manufacturername;

	private Integer productcategory;

	private Integer productstatus;

	private Long maximumquantity;

	private Double costprice;

	private Long realsupplierid;

	private String realsuppliername;

	private String productname1;

	private String productname2;

	private Long createdby;

	private Date createdtimestamp;

	private Long lastmodifiedby;

	private Date lastmodifiedtimestamp;

	private Integer leadtime;

	private Long economicorderquantity;

	private Long maximumdiscountquantity;

	private Long quantityprocessedperday;

	private Double widthbeforepacking;

	private Double widthafterpacking;

	private Double heightbeforepacking;

	private Double heightafterpacking;

	private Double lengthbeforepacking;

	private Double lengthafterpacking;

	private Double weightbeforepacking;

	private Double weightafterpacking;

	private Integer warrantyperiod;

	private Double sellingprice;

	private Double marketprice;

	private Double shippingprice;

	private String offshoredelivery;

	private String giftpackage;

	private String usermanual;

	private String warranty;

	private String brandname;

	private String manufacturingplace;

	private String notesfordelivery;

	private String productimagepath;

	private String boxid;

	private Integer deliverytype;

	private Integer returntype;

	private Integer subdeliverytype;

	private Integer subreturntype;
	private Integer salestype;
	private Integer commisiontype;

	private Double commissionrate;

	private Integer lclasscode;
	private Integer mclasscode;

	private Integer sclasscode;
	private Integer purchaseid;
	private Integer mdid;
	private Integer potype;

	/** 错误代码 **/
	private Integer rtncode;

	public Integer getMdid() {
		return mdid;
	}

	public void setMdid(Integer mdid) {
		this.mdid = mdid;
	}

	public Integer getSalestype() {
		return salestype;
	}

	public void setSalestype(Integer salestype) {
		this.salestype = salestype;
	}

	public Integer getPurchaseid() {
		return purchaseid;
	}

	public void setPurchaseid(Integer purchaseid) {
		this.purchaseid = purchaseid;
	}

	public Integer getPotype() {
		return potype;
	}

	public void setPotype(Integer potype) {
		this.potype = potype;
	}

	public Integer getLclasscode() {
		return lclasscode;
	}

	public void setLclasscode(Integer lclasscode) {
		this.lclasscode = lclasscode;
	}

	public Integer getMclasscode() {
		return mclasscode;
	}

	public void setMclasscode(Integer mclasscode) {
		this.mclasscode = mclasscode;
	}

	public Integer getSclasscode() {
		return sclasscode;
	}

	public void setSclasscode(Integer sclasscode) {
		this.sclasscode = sclasscode;
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public Long getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(Long supplierid) {
		this.supplierid = supplierid;
	}

	public String getManufacturername() {
		return manufacturername;
	}

	public void setManufacturername(String manufacturername) {
		this.manufacturername = manufacturername;
	}

	public Integer getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(Integer productcategory) {
		this.productcategory = productcategory;
	}

	public Integer getProductstatus() {
		return productstatus;
	}

	public void setProductstatus(Integer productstatus) {
		this.productstatus = productstatus;
	}

	public Long getMaximumquantity() {
		return maximumquantity;
	}

	public void setMaximumquantity(Long maximumquantity) {
		this.maximumquantity = maximumquantity;
	}

	public Double getCostprice() {
		return costprice;
	}

	public void setCostprice(Double costprice) {
		this.costprice = costprice;
	}

	public Long getRealsupplierid() {
		return realsupplierid;
	}

	public void setRealsupplierid(Long realsupplierid) {
		this.realsupplierid = realsupplierid;
	}

	public String getRealsuppliername() {
		return realsuppliername;
	}

	public void setRealsuppliername(String realsuppliername) {
		this.realsuppliername = realsuppliername;
	}

	public String getProductname1() {
		return productname1;
	}

	public void setProductname1(String productname1) {
		this.productname1 = productname1;
	}

	public String getProductname2() {
		return productname2;
	}

	public void setProductname2(String productname2) {
		this.productname2 = productname2;
	}

	public Long getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}

	public Date getCreatedtimestamp() {
		return createdtimestamp;
	}

	public void setCreatedtimestamp(Date createdtimestamp) {
		this.createdtimestamp = createdtimestamp;
	}

	public Long getLastmodifiedby() {
		return lastmodifiedby;
	}

	public void setLastmodifiedby(Long lastmodifiedby) {
		this.lastmodifiedby = lastmodifiedby;
	}

	public Date getLastmodifiedtimestamp() {
		return lastmodifiedtimestamp;
	}

	public void setLastmodifiedtimestamp(Date lastmodifiedtimestamp) {
		this.lastmodifiedtimestamp = lastmodifiedtimestamp;
	}

	public Integer getLeadtime() {
		return leadtime;
	}

	public void setLeadtime(Integer leadtime) {
		this.leadtime = leadtime;
	}

	public Long getEconomicorderquantity() {
		return economicorderquantity;
	}

	public void setEconomicorderquantity(Long economicorderquantity) {
		this.economicorderquantity = economicorderquantity;
	}

	public Long getMaximumdiscountquantity() {
		return maximumdiscountquantity;
	}

	public void setMaximumdiscountquantity(Long maximumdiscountquantity) {
		this.maximumdiscountquantity = maximumdiscountquantity;
	}

	public Long getQuantityprocessedperday() {
		return quantityprocessedperday;
	}

	public void setQuantityprocessedperday(Long quantityprocessedperday) {
		this.quantityprocessedperday = quantityprocessedperday;
	}

	public Double getWidthbeforepacking() {
		return widthbeforepacking;
	}

	public void setWidthbeforepacking(Double widthbeforepacking) {
		this.widthbeforepacking = widthbeforepacking;
	}

	public Double getWidthafterpacking() {
		return widthafterpacking;
	}

	public void setWidthafterpacking(Double widthafterpacking) {
		this.widthafterpacking = widthafterpacking;
	}

	public Double getHeightbeforepacking() {
		return heightbeforepacking;
	}

	public void setHeightbeforepacking(Double heightbeforepacking) {
		this.heightbeforepacking = heightbeforepacking;
	}

	public Double getHeightafterpacking() {
		return heightafterpacking;
	}

	public void setHeightafterpacking(Double heightafterpacking) {
		this.heightafterpacking = heightafterpacking;
	}

	public Double getLengthbeforepacking() {
		return lengthbeforepacking;
	}

	public void setLengthbeforepacking(Double lengthbeforepacking) {
		this.lengthbeforepacking = lengthbeforepacking;
	}

	public Double getLengthafterpacking() {
		return lengthafterpacking;
	}

	public void setLengthafterpacking(Double lengthafterpacking) {
		this.lengthafterpacking = lengthafterpacking;
	}

	public Double getWeightbeforepacking() {
		return weightbeforepacking;
	}

	public void setWeightbeforepacking(Double weightbeforepacking) {
		this.weightbeforepacking = weightbeforepacking;
	}

	public Double getWeightafterpacking() {
		return weightafterpacking;
	}

	public void setWeightafterpacking(Double weightafterpacking) {
		this.weightafterpacking = weightafterpacking;
	}

	public Integer getWarrantyperiod() {
		return warrantyperiod;
	}

	public void setWarrantyperiod(Integer warrantyperiod) {
		this.warrantyperiod = warrantyperiod;
	}

	public Double getSellingprice() {
		return sellingprice;
	}

	public void setSellingprice(Double sellingprice) {
		this.sellingprice = sellingprice;
	}

	public Double getMarketprice() {
		return marketprice;
	}

	public void setMarketprice(Double marketprice) {
		this.marketprice = marketprice;
	}

	public Double getShippingprice() {
		return shippingprice;
	}

	public void setShippingprice(Double shippingprice) {
		this.shippingprice = shippingprice;
	}

	public String getOffshoredelivery() {
		return offshoredelivery;
	}

	public void setOffshoredelivery(String offshoredelivery) {
		this.offshoredelivery = offshoredelivery;
	}

	public String getGiftpackage() {
		return giftpackage;
	}

	public void setGiftpackage(String giftpackage) {
		this.giftpackage = giftpackage;
	}

	public String getUsermanual() {
		return usermanual;
	}

	public void setUsermanual(String usermanual) {
		this.usermanual = usermanual;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getBrandname() {
		return brandname;
	}

	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}

	public String getManufacturingplace() {
		return manufacturingplace;
	}

	public void setManufacturingplace(String manufacturingplace) {
		this.manufacturingplace = manufacturingplace;
	}

	public String getNotesfordelivery() {
		return notesfordelivery;
	}

	public void setNotesfordelivery(String notesfordelivery) {
		this.notesfordelivery = notesfordelivery;
	}

	public String getProductimagepath() {
		return productimagepath;
	}

	public void setProductimagepath(String productimagepath) {
		this.productimagepath = productimagepath;
	}

	public String getBoxid() {
		return boxid;
	}

	public void setBoxid(String boxid) {
		this.boxid = boxid;
	}

	public Integer getDeliverytype() {
		return deliverytype;
	}

	public void setDeliverytype(Integer deliverytype) {
		this.deliverytype = deliverytype;
	}

	public Integer getReturntype() {
		return returntype;
	}

	public void setReturntype(Integer returntype) {
		this.returntype = returntype;
	}

	public Integer getSubdeliverytype() {
		return subdeliverytype;
	}

	public void setSubdeliverytype(Integer subdeliverytype) {
		this.subdeliverytype = subdeliverytype;
	}

	public Integer getSubreturntype() {
		return subreturntype;
	}

	public void setSubreturntype(Integer subreturntype) {
		this.subreturntype = subreturntype;
	}

	public Integer getCommisiontype() {
		return commisiontype;
	}

	public void setCommisiontype(Integer commisiontype) {
		this.commisiontype = commisiontype;
	}

	public Double getCommissionrate() {
		return commissionrate;
	}

	public void setCommissionrate(Double commissionrate) {
		this.commissionrate = commissionrate;
	}

	public Integer getRtncode() {
		return rtncode;
	}

	public void setRtncode(Integer rtncode) {
		this.rtncode = rtncode;
	}

}
