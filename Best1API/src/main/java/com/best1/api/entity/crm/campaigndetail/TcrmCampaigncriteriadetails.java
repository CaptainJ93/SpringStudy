package com.best1.api.entity.crm.campaigndetail;

import java.util.Date;
import java.util.List;

import com.best1.api.entity.BaseObject;

/**
 * 
 * This field corresponds to the database column TCRM_CAMPAIGNCRITERIADETAILS
 * 
 * 
 * 
 * 
 */
public class TcrmCampaigncriteriadetails extends BaseObject {

	private Long criteriano;

	private Long campaignno;

	private String isbasecriteria;

	private String criterianame;

	private Integer criteriatype;

	private Long createdby;

	private Date createdtimestamp;

	private Object subchannelidlist;

	private List<Subchannel> subchannelids;

	private Object customertypelist;

	private List<Customertype> customertypes;

	private Object paymentmodeidlist;

	private List<Paymentmode> paymentmodes;

	private Object includeproductidlist;

	private List<Includeproductid> includeproductids;

	private Object excludeproductidlist;

	private List<Includeproductid> excludeproductids;

	private Integer agerangefrom;

	private Integer agerangeto;

	private Long membershiplevelid;

	private Integer ordertype;

	private Long creditcardbankidOld;

	private Long creditcardtypeid;

	private Long cardfirstsixdigit;

	private Long holidaysubchannelid;

	private Long holidayid;

	private Integer anyquantity;

	private Integer allquantity;

	private Integer anyproducts;

	private Integer durationtype;

	private Integer durationunit;

	private Integer durationvalue;

	private Double singlelowertransactionlimit;

	private Double totaltransactionvalue;

	private Integer nooforders;

	private Date birthdatefrom;

	private Date birthdateto;

	private Date startdate;

	private Date enddate;

	private String customertypeincludeflag;

	private String paymentmodeincludeflag;

	private String holidaytype;

	private String valid;

	private String offeroption;

	private String birthdayflag;

	private String taiwancitizenflag;

	private String subchanneloption;

	private String ruleName;

	private String ruleSetName;

	private Long productsearchcriteriaid;

	private Long noofcustomers;

	private Long frequencyofpurchase;

	private String creditcardbankid;

	private Object customeridlist;
	
	private List<Customer> customerids;
	
	
	 private String criteriafilter;

	 private String criteriacondition;

	public Long getCriteriano() {
		return criteriano;
	}

	public void setCriteriano(Long criteriano) {
		this.criteriano = criteriano;
	}

	public Long getCampaignno() {
		return campaignno;
	}

	public void setCampaignno(Long campaignno) {
		this.campaignno = campaignno;
	}

	public String getIsbasecriteria() {
		return isbasecriteria;
	}

	public void setIsbasecriteria(String isbasecriteria) {
		this.isbasecriteria = isbasecriteria;
	}

	public String getCriterianame() {
		return criterianame;
	}

	public void setCriterianame(String criterianame) {
		this.criterianame = criterianame;
	}

	public Integer getCriteriatype() {
		return criteriatype;
	}

	public void setCriteriatype(Integer criteriatype) {
		this.criteriatype = criteriatype;
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

	public Object getSubchannelidlist() {
		return subchannelidlist;
	}

	public void setSubchannelidlist(Object subchannelidlist) {
		this.subchannelidlist = subchannelidlist;
	}

	public Object getCustomertypelist() {
		return customertypelist;
	}

	public void setCustomertypelist(Object customertypelist) {
		this.customertypelist = customertypelist;
	}

	public Object getPaymentmodeidlist() {
		return paymentmodeidlist;
	}

	public void setPaymentmodeidlist(Object paymentmodeidlist) {
		this.paymentmodeidlist = paymentmodeidlist;
	}

	public Object getIncludeproductidlist() {
		return includeproductidlist;
	}

	public void setIncludeproductidlist(Object includeproductidlist) {
		this.includeproductidlist = includeproductidlist;
	}

	public Object getExcludeproductidlist() {
		return excludeproductidlist;
	}

	public void setExcludeproductidlist(Object excludeproductidlist) {
		this.excludeproductidlist = excludeproductidlist;
	}

	public Integer getAgerangefrom() {
		return agerangefrom;
	}

	public void setAgerangefrom(Integer agerangefrom) {
		this.agerangefrom = agerangefrom;
	}

	public Integer getAgerangeto() {
		return agerangeto;
	}

	public void setAgerangeto(Integer agerangeto) {
		this.agerangeto = agerangeto;
	}

	public Long getMembershiplevelid() {
		return membershiplevelid;
	}

	public void setMembershiplevelid(Long membershiplevelid) {
		this.membershiplevelid = membershiplevelid;
	}

	public Integer getOrdertype() {
		return ordertype;
	}

	public void setOrdertype(Integer ordertype) {
		this.ordertype = ordertype;
	}

	public Long getCreditcardbankidOld() {
		return creditcardbankidOld;
	}

	public void setCreditcardbankidOld(Long creditcardbankidOld) {
		this.creditcardbankidOld = creditcardbankidOld;
	}

	public Long getCreditcardtypeid() {
		return creditcardtypeid;
	}

	public void setCreditcardtypeid(Long creditcardtypeid) {
		this.creditcardtypeid = creditcardtypeid;
	}

	public Long getCardfirstsixdigit() {
		return cardfirstsixdigit;
	}

	public void setCardfirstsixdigit(Long cardfirstsixdigit) {
		this.cardfirstsixdigit = cardfirstsixdigit;
	}

	public Long getHolidaysubchannelid() {
		return holidaysubchannelid;
	}

	public void setHolidaysubchannelid(Long holidaysubchannelid) {
		this.holidaysubchannelid = holidaysubchannelid;
	}

	public Long getHolidayid() {
		return holidayid;
	}

	public void setHolidayid(Long holidayid) {
		this.holidayid = holidayid;
	}

	public Integer getAnyquantity() {
		return anyquantity;
	}

	public void setAnyquantity(Integer anyquantity) {
		this.anyquantity = anyquantity;
	}

	public Integer getAllquantity() {
		return allquantity;
	}

	public void setAllquantity(Integer allquantity) {
		this.allquantity = allquantity;
	}

	public Integer getAnyproducts() {
		return anyproducts;
	}

	public void setAnyproducts(Integer anyproducts) {
		this.anyproducts = anyproducts;
	}

	public Integer getDurationtype() {
		return durationtype;
	}

	public void setDurationtype(Integer durationtype) {
		this.durationtype = durationtype;
	}

	public Integer getDurationunit() {
		return durationunit;
	}

	public void setDurationunit(Integer durationunit) {
		this.durationunit = durationunit;
	}

	public Integer getDurationvalue() {
		return durationvalue;
	}

	public void setDurationvalue(Integer durationvalue) {
		this.durationvalue = durationvalue;
	}

	public Double getSinglelowertransactionlimit() {
		return singlelowertransactionlimit;
	}

	public void setSinglelowertransactionlimit(
			Double singlelowertransactionlimit) {
		this.singlelowertransactionlimit = singlelowertransactionlimit;
	}

	public Double getTotaltransactionvalue() {
		return totaltransactionvalue;
	}

	public void setTotaltransactionvalue(Double totaltransactionvalue) {
		this.totaltransactionvalue = totaltransactionvalue;
	}

	public Integer getNooforders() {
		return nooforders;
	}

	public void setNooforders(Integer nooforders) {
		this.nooforders = nooforders;
	}

	public Date getBirthdatefrom() {
		return birthdatefrom;
	}

	public void setBirthdatefrom(Date birthdatefrom) {
		this.birthdatefrom = birthdatefrom;
	}

	public Date getBirthdateto() {
		return birthdateto;
	}

	public void setBirthdateto(Date birthdateto) {
		this.birthdateto = birthdateto;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getCustomertypeincludeflag() {
		return customertypeincludeflag;
	}

	public void setCustomertypeincludeflag(String customertypeincludeflag) {
		this.customertypeincludeflag = customertypeincludeflag;
	}

	public String getPaymentmodeincludeflag() {
		return paymentmodeincludeflag;
	}

	public void setPaymentmodeincludeflag(String paymentmodeincludeflag) {
		this.paymentmodeincludeflag = paymentmodeincludeflag;
	}

	public String getHolidaytype() {
		return holidaytype;
	}

	public void setHolidaytype(String holidaytype) {
		this.holidaytype = holidaytype;
	}

	public String getValid() {
		return valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
	}

	public String getOfferoption() {
		return offeroption;
	}

	public void setOfferoption(String offeroption) {
		this.offeroption = offeroption;
	}

	public String getBirthdayflag() {
		return birthdayflag;
	}

	public void setBirthdayflag(String birthdayflag) {
		this.birthdayflag = birthdayflag;
	}

	public String getTaiwancitizenflag() {
		return taiwancitizenflag;
	}

	public void setTaiwancitizenflag(String taiwancitizenflag) {
		this.taiwancitizenflag = taiwancitizenflag;
	}

	public String getSubchanneloption() {
		return subchanneloption;
	}

	public void setSubchanneloption(String subchanneloption) {
		this.subchanneloption = subchanneloption;
	}

	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}

	public String getRuleSetName() {
		return ruleSetName;
	}

	public void setRuleSetName(String ruleSetName) {
		this.ruleSetName = ruleSetName;
	}

	public Long getProductsearchcriteriaid() {
		return productsearchcriteriaid;
	}

	public void setProductsearchcriteriaid(Long productsearchcriteriaid) {
		this.productsearchcriteriaid = productsearchcriteriaid;
	}

	public Long getNoofcustomers() {
		return noofcustomers;
	}

	public void setNoofcustomers(Long noofcustomers) {
		this.noofcustomers = noofcustomers;
	}

	public Long getFrequencyofpurchase() {
		return frequencyofpurchase;
	}

	public void setFrequencyofpurchase(Long frequencyofpurchase) {
		this.frequencyofpurchase = frequencyofpurchase;
	}

	public String getCreditcardbankid() {
		return creditcardbankid;
	}

	public void setCreditcardbankid(String creditcardbankid) {
		this.creditcardbankid = creditcardbankid;
	}

	public Object getCustomeridlist() {
		return customeridlist;
	}

	public void setCustomeridlist(Object customeridlist) {
		this.customeridlist = customeridlist;
	}

	public List<Subchannel> getSubchannelids() {
		return subchannelids;
	}

	public void setSubchannelids(List<Subchannel> subchannelids) {
		this.subchannelids = subchannelids;
	}

	public List<Customertype> getCustomertypes() {
		return customertypes;
	}

	public void setCustomertypes(List<Customertype> customertypes) {
		this.customertypes = customertypes;
	}

	public List<Paymentmode> getPaymentmodes() {
		return paymentmodes;
	}

	public void setPaymentmodes(List<Paymentmode> paymentmodes) {
		this.paymentmodes = paymentmodes;
	}

	public List<Includeproductid> getIncludeproductids() {
		return includeproductids;
	}

	public void setIncludeproductids(List<Includeproductid> includeproductids) {
		this.includeproductids = includeproductids;
	}

	public List<Includeproductid> getExcludeproductids() {
		return excludeproductids;
	}

	public void setExcludeproductids(List<Includeproductid> excludeproductids) {
		this.excludeproductids = excludeproductids;
	}

	public List<Customer> getCustomerids() {
		return customerids;
	}

	public void setCustomerids(List<Customer> customerids) {
		this.customerids = customerids;
	}



	    public String getCriteriafilter() {
	        return criteriafilter;
	    }

	    public void setCriteriafilter(String criteriafilter) {
	        this.criteriafilter = criteriafilter;
	    }

	    public String getCriteriacondition() {
	        return criteriacondition;
	    }

	    public void setCriteriacondition(String criteriacondition) {
	        this.criteriacondition = criteriacondition;
	    }
}