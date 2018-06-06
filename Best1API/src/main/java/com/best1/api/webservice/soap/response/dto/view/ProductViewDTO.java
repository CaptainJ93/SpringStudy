package com.best1.api.webservice.soap.response.dto.view;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ProductView")
public class ProductViewDTO {

	private Long supplierid;
	private Long  productid;
	private Long companyid;
	private Integer productversion;
    private String  productname;
    private Integer  colourcode;
    private Integer colourclass;
    private Integer stylecode;
    private Integer styleclass;
    private Double costprice;
    private Integer taxrate;
    private Double sellingprice;
    private Integer mclasscode;
    private Integer sclasscode;
    private Integer lclasscode;
    private Integer deliverytype;
    private Integer returntype;
    
    private String colourcn;
	private String stylecn;
	private String mclasscn;
	private String sclasscn;
	private String lclasscn;
 
    private Integer productcategory;//商品种类
    
    
	private Long warehouseid; // 仓库代码

	
    
	public String getColourcn() {
		return colourcn;
	}
	public void setColourcn(String colourcn) {
		this.colourcn = colourcn;
	}
	public String getStylecn() {
		return stylecn;
	}
	public void setStylecn(String stylecn) {
		this.stylecn = stylecn;
	}
	public String getMclasscn() {
		return mclasscn;
	}
	public void setMclasscn(String mclasscn) {
		this.mclasscn = mclasscn;
	}
	public String getSclasscn() {
		return sclasscn;
	}
	public void setSclasscn(String sclasscn) {
		this.sclasscn = sclasscn;
	}
	public String getLclasscn() {
		return lclasscn;
	}
	public void setLclasscn(String lclasscn) {
		this.lclasscn = lclasscn;
	}
	public Long getWarehouseid() {
		return warehouseid;
	}
	public void setWarehouseid(Long warehouseid) {
		this.warehouseid = warehouseid;
	}
	public Integer getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(Integer productcategory) {
		this.productcategory = productcategory;
	}
	public Long getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}
	public Long getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(Long supplierid) {
		this.supplierid = supplierid;
	}
	public Long getProductid() {
		return productid;
	}
	public void setProductid(Long productid) {
		this.productid = productid;
	}
	public Integer getProductversion() {
		return productversion;
	}
	public void setProductversion(Integer productversion) {
		this.productversion = productversion;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public Integer getColourcode() {
		return colourcode;
	}
	public void setColourcode(Integer colourcode) {
		this.colourcode = colourcode;
	}
	public Integer getColourclass() {
		return colourclass;
	}
	public void setColourclass(Integer colourclass) {
		this.colourclass = colourclass;
	}
	public Integer getStylecode() {
		return stylecode;
	}
	public void setStylecode(Integer stylecode) {
		this.stylecode = stylecode;
	}
	public Integer getStyleclass() {
		return styleclass;
	}
	public void setStyleclass(Integer styleclass) {
		this.styleclass = styleclass;
	}


	public Double getCostprice() {
		return costprice;
	}
	public void setCostprice(Double costprice) {
		this.costprice = costprice;
	}
	public Integer getTaxrate() {
		return taxrate;
	}
	public void setTaxrate(Integer taxrate) {
		this.taxrate = taxrate;
	}
	public Double getSellingprice() {
		return sellingprice;
	}
	public void setSellingprice(Double sellingprice) {
		this.sellingprice = sellingprice;
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
	public Integer getLclasscode() {
		return lclasscode;
	}
	public void setLclasscode(Integer lclasscode) {
		this.lclasscode = lclasscode;
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

    
    
    
}
