package com.best1.api.entity.scm.product;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import com.best1.api.entity.BaseObject;


/**
 *  This field corresponds to the database table TSCM_PRODUCT
 * 
 */
@Entity
@Table(name = "TSCM_PRODUCT")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TscmProduct  extends BaseObject{
 
	private Long productid;
 
	private Long supplierid;
 
	private Long purchaseid;
 
	private Long mdid;
 
	private String manufacturername;
 
	private Integer productversion;
 
	private Integer mclasscode;
 
	private Integer sclasscode;
 
	private Integer productcategory;
 
	private Integer producttype;
 
	private Integer taxtype;
 
	private Double costprice;
 
	private Double sellingprice;
 
	private Double marketprice;
 
	private Double memberprice;
 
	private Integer potype;
 
	private String productname1;
 
	private String productname2;
 
	private Long createdby;
 
	private Date createdtimestamp;
 
	private Long lastmodifiedby;
 
	private Date lastmodifiedtimestamp;
 
	private Integer noofinstallment;
 
	private Integer commisiontype;
 
	private Double commissionrate;
 
	private Integer currencytype;
 
	private Integer productstatus;
 
	private Integer localorimported;
 
	private Integer warrantyperiod;
 
	private Long maximumquantity;
 
	private Long economicorderquantity;
 
	private Long maximumdiscountquantity;
 
	private Long quantityprocessedperday;

	private Integer bonustype;

	private Long safetystock;
 
	private Long firstpoquantity;
 
	private Double bonusvalue;
 
	private Double shippingprice;
 
	private Double serviceprice;
 
	private Double importingprice;
 
	private Double importingcost;
 
	private Integer repurchaseperiod;
 
	private Integer expirydays;
 
	private Long realsupplierid;
 
	private Double averagecost;
 
	private Double surpriseprice;
 
	private Date regapproveddate;
 
	private Date commiteeapproveddate;
 
	private String warranty;
 
	private String usermanual;
 
	private String downpayment;
 
	private String invoicerequired;
 
	private String tv;
 
	private String catalog;
 
	private String web;
 
	private String newspaper;
 
	private String project;
 
	private String broadcasting;
 
	private String ownbrands;
 
	private String selfpromotion;
 
	private String bonuspointallowed;
 
	private String ivrorder;
 
	private String giftcertificatepurchase;
 
	private String giftpackage;
 
	private String brandname;
 
	private String manufacturingplace;
 
	private String realsuppliername;
 
	private String productimagepath;
 
	private Integer lclasscode;
 
	private Long lastrequestraisedby;
 
	private Long companyid;
 
	private String tax;
 
	private String productnameconcat;
 
	private Integer importtaxtype;
 
	private Double partialtaxamount;
 
	private String pendingorder;
 
	private Integer paymentterms;
 
	private Long originalproductid;
 
	private String autoship;
 
	private Integer multiple;
 
	private Double rtnordrate;
 
	private String smssuppliername;
 
	private String smscontactphone;
 
	private String smssendflag;
 
	private String simpletask;
 
	private Long exclusivechannel;

	private Long mdidlastmodifiedby;

	private Date mdidlastmodifiedtimestamp;

	private Date lastrequestraisedts;

	private String changedfields;

	private Double profit;

	private Double profitrate;

	private Double taxpercent;
	
    private Integer rtncode;
    private String rtnmsg;
	
	/**SPM提交商品代码***/
	private Long spmproductid;
	private String startdate;
	private String enddate;
    private Long scmproductid;
	
	
	
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

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
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

	public Long getPurchaseid() {
		return purchaseid;
	}

	public void setPurchaseid(Long purchaseid) {
		this.purchaseid = purchaseid;
	}

	public Long getMdid() {
		return mdid;
	}

	public void setMdid(Long mdid) {
		this.mdid = mdid;
	}

	public String getManufacturername() {
		return manufacturername;
	}

	public void setManufacturername(String manufacturername) {
		this.manufacturername = manufacturername;
	}

	public Integer getProductversion() {
		return productversion;
	}

	public void setProductversion(Integer productversion) {
		this.productversion = productversion;
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

	public Integer getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(Integer productcategory) {
		this.productcategory = productcategory;
	}

	public Integer getProducttype() {
		return producttype;
	}

	public void setProducttype(Integer producttype) {
		this.producttype = producttype;
	}

	public Integer getTaxtype() {
		return taxtype;
	}

	public void setTaxtype(Integer taxtype) {
		this.taxtype = taxtype;
	}

	public Double getCostprice() {
		return costprice;
	}

	public void setCostprice(Double costprice) {
		this.costprice = costprice;
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

	public Double getMemberprice() {
		return memberprice;
	}

	public void setMemberprice(Double memberprice) {
		this.memberprice = memberprice;
	}

	public Integer getPotype() {
		return potype;
	}

	public void setPotype(Integer potype) {
		this.potype = potype;
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

	public Integer getNoofinstallment() {
		return noofinstallment;
	}

	public void setNoofinstallment(Integer noofinstallment) {
		this.noofinstallment = noofinstallment;
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

	public Integer getCurrencytype() {
		return currencytype;
	}

	public void setCurrencytype(Integer currencytype) {
		this.currencytype = currencytype;
	}

	public Integer getProductstatus() {
		return productstatus;
	}

	public void setProductstatus(Integer productstatus) {
		this.productstatus = productstatus;
	}

	public Integer getLocalorimported() {
		return localorimported;
	}

	public void setLocalorimported(Integer localorimported) {
		this.localorimported = localorimported;
	}

	public Integer getWarrantyperiod() {
		return warrantyperiod;
	}

	public void setWarrantyperiod(Integer warrantyperiod) {
		this.warrantyperiod = warrantyperiod;
	}

	public Long getMaximumquantity() {
		return maximumquantity;
	}

	public void setMaximumquantity(Long maximumquantity) {
		this.maximumquantity = maximumquantity;
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

	public Integer getBonustype() {
		return bonustype;
	}

	public void setBonustype(Integer bonustype) {
		this.bonustype = bonustype;
	}

	public Long getSafetystock() {
		return safetystock;
	}

	public void setSafetystock(Long safetystock) {
		this.safetystock = safetystock;
	}

	public Long getFirstpoquantity() {
		return firstpoquantity;
	}

	public void setFirstpoquantity(Long firstpoquantity) {
		this.firstpoquantity = firstpoquantity;
	}

	public Double getBonusvalue() {
		return bonusvalue;
	}

	public void setBonusvalue(Double bonusvalue) {
		this.bonusvalue = bonusvalue;
	}

	public Double getShippingprice() {
		return shippingprice;
	}

	public void setShippingprice(Double shippingprice) {
		this.shippingprice = shippingprice;
	}

	public Double getServiceprice() {
		return serviceprice;
	}

	public void setServiceprice(Double serviceprice) {
		this.serviceprice = serviceprice;
	}

	public Double getImportingprice() {
		return importingprice;
	}

	public void setImportingprice(Double importingprice) {
		this.importingprice = importingprice;
	}

	public Double getImportingcost() {
		return importingcost;
	}

	public void setImportingcost(Double importingcost) {
		this.importingcost = importingcost;
	}

	public Integer getRepurchaseperiod() {
		return repurchaseperiod;
	}

	public void setRepurchaseperiod(Integer repurchaseperiod) {
		this.repurchaseperiod = repurchaseperiod;
	}

	public Integer getExpirydays() {
		return expirydays;
	}

	public void setExpirydays(Integer expirydays) {
		this.expirydays = expirydays;
	}

	public Long getRealsupplierid() {
		return realsupplierid;
	}

	public void setRealsupplierid(Long realsupplierid) {
		this.realsupplierid = realsupplierid;
	}

	public Double getAveragecost() {
		return averagecost;
	}

	public void setAveragecost(Double averagecost) {
		this.averagecost = averagecost;
	}

	public Double getSurpriseprice() {
		return surpriseprice;
	}

	public void setSurpriseprice(Double surpriseprice) {
		this.surpriseprice = surpriseprice;
	}

	public Date getRegapproveddate() {
		return regapproveddate;
	}

	public void setRegapproveddate(Date regapproveddate) {
		this.regapproveddate = regapproveddate;
	}

	public Date getCommiteeapproveddate() {
		return commiteeapproveddate;
	}

	public void setCommiteeapproveddate(Date commiteeapproveddate) {
		this.commiteeapproveddate = commiteeapproveddate;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}

	public String getUsermanual() {
		return usermanual;
	}

	public void setUsermanual(String usermanual) {
		this.usermanual = usermanual;
	}

	public String getDownpayment() {
		return downpayment;
	}

	public void setDownpayment(String downpayment) {
		this.downpayment = downpayment;
	}

	public String getInvoicerequired() {
		return invoicerequired;
	}

	public void setInvoicerequired(String invoicerequired) {
		this.invoicerequired = invoicerequired;
	}

	public String getTv() {
		return tv;
	}

	public void setTv(String tv) {
		this.tv = tv;
	}

	public String getCatalog() {
		return catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getNewspaper() {
		return newspaper;
	}

	public void setNewspaper(String newspaper) {
		this.newspaper = newspaper;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getBroadcasting() {
		return broadcasting;
	}

	public void setBroadcasting(String broadcasting) {
		this.broadcasting = broadcasting;
	}

	public String getOwnbrands() {
		return ownbrands;
	}

	public void setOwnbrands(String ownbrands) {
		this.ownbrands = ownbrands;
	}

	public String getSelfpromotion() {
		return selfpromotion;
	}

	public void setSelfpromotion(String selfpromotion) {
		this.selfpromotion = selfpromotion;
	}

	public String getBonuspointallowed() {
		return bonuspointallowed;
	}

	public void setBonuspointallowed(String bonuspointallowed) {
		this.bonuspointallowed = bonuspointallowed;
	}

	public String getIvrorder() {
		return ivrorder;
	}

	public void setIvrorder(String ivrorder) {
		this.ivrorder = ivrorder;
	}

	public String getGiftcertificatepurchase() {
		return giftcertificatepurchase;
	}

	public void setGiftcertificatepurchase(String giftcertificatepurchase) {
		this.giftcertificatepurchase = giftcertificatepurchase;
	}

	public String getGiftpackage() {
		return giftpackage;
	}

	public void setGiftpackage(String giftpackage) {
		this.giftpackage = giftpackage;
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

	public String getRealsuppliername() {
		return realsuppliername;
	}

	public void setRealsuppliername(String realsuppliername) {
		this.realsuppliername = realsuppliername;
	}

	public String getProductimagepath() {
		return productimagepath;
	}

	public void setProductimagepath(String productimagepath) {
		this.productimagepath = productimagepath;
	}

	public Integer getLclasscode() {
		return lclasscode;
	}

	public void setLclasscode(Integer lclasscode) {
		this.lclasscode = lclasscode;
	}

	public Long getLastrequestraisedby() {
		return lastrequestraisedby;
	}

	public void setLastrequestraisedby(Long lastrequestraisedby) {
		this.lastrequestraisedby = lastrequestraisedby;
	}

	public Long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}

	public String getTax() {
		return tax;
	}

	public void setTax(String tax) {
		this.tax = tax;
	}

	public String getProductnameconcat() {
		return productnameconcat;
	}

	public void setProductnameconcat(String productnameconcat) {
		this.productnameconcat = productnameconcat;
	}

	public Integer getImporttaxtype() {
		return importtaxtype;
	}

	public void setImporttaxtype(Integer importtaxtype) {
		this.importtaxtype = importtaxtype;
	}

	public Double getPartialtaxamount() {
		return partialtaxamount;
	}

	public void setPartialtaxamount(Double partialtaxamount) {
		this.partialtaxamount = partialtaxamount;
	}

	public String getPendingorder() {
		return pendingorder;
	}

	public void setPendingorder(String pendingorder) {
		this.pendingorder = pendingorder;
	}

	public Integer getPaymentterms() {
		return paymentterms;
	}

	public void setPaymentterms(Integer paymentterms) {
		this.paymentterms = paymentterms;
	}

	public Long getOriginalproductid() {
		return originalproductid;
	}

	public void setOriginalproductid(Long originalproductid) {
		this.originalproductid = originalproductid;
	}

	public String getAutoship() {
		return autoship;
	}

	public void setAutoship(String autoship) {
		this.autoship = autoship;
	}

	public Integer getMultiple() {
		return multiple;
	}

	public void setMultiple(Integer multiple) {
		this.multiple = multiple;
	}

	public Double getRtnordrate() {
		return rtnordrate;
	}

	public void setRtnordrate(Double rtnordrate) {
		this.rtnordrate = rtnordrate;
	}

	public String getSmssuppliername() {
		return smssuppliername;
	}

	public void setSmssuppliername(String smssuppliername) {
		this.smssuppliername = smssuppliername;
	}

	public String getSmscontactphone() {
		return smscontactphone;
	}

	public void setSmscontactphone(String smscontactphone) {
		this.smscontactphone = smscontactphone;
	}

	public String getSmssendflag() {
		return smssendflag;
	}

	public void setSmssendflag(String smssendflag) {
		this.smssendflag = smssendflag;
	}

	public String getSimpletask() {
		return simpletask;
	}

	public void setSimpletask(String simpletask) {
		this.simpletask = simpletask;
	}

	public Long getExclusivechannel() {
		return exclusivechannel;
	}

	public void setExclusivechannel(Long exclusivechannel) {
		this.exclusivechannel = exclusivechannel;
	}

	public Long getMdidlastmodifiedby() {
		return mdidlastmodifiedby;
	}

	public void setMdidlastmodifiedby(Long mdidlastmodifiedby) {
		this.mdidlastmodifiedby = mdidlastmodifiedby;
	}

	public Date getMdidlastmodifiedtimestamp() {
		return mdidlastmodifiedtimestamp;
	}

	public void setMdidlastmodifiedtimestamp(Date mdidlastmodifiedtimestamp) {
		this.mdidlastmodifiedtimestamp = mdidlastmodifiedtimestamp;
	}

	public Date getLastrequestraisedts() {
		return lastrequestraisedts;
	}

	public void setLastrequestraisedts(Date lastrequestraisedts) {
		this.lastrequestraisedts = lastrequestraisedts;
	}

	public String getChangedfields() {
		return changedfields;
	}

	public void setChangedfields(String changedfields) {
		this.changedfields = changedfields;
	}

	public Double getProfit() {
		return profit;
	}

	public void setProfit(Double profit) {
		this.profit = profit;
	}

	public Double getProfitrate() {
		return profitrate;
	}

	public void setProfitrate(Double profitrate) {
		this.profitrate = profitrate;
	}

	public Double getTaxpercent() {
		return taxpercent;
	}

	public void setTaxpercent(Double taxpercent) {
		this.taxpercent = taxpercent;
	}

	public Long getSpmproductid() {
		return spmproductid;
	}

	public void setSpmproductid(Long spmproductid) {
		this.spmproductid = spmproductid;
	}

	public String getProductname() {
		return this.getProductname1()+"_"+this.getProductname2();
	}

	public Long getScmproductid() {
		return scmproductid;
	}

	public void setScmproductid(Long scmproductid) {
		this.scmproductid = scmproductid;
	}

	
}