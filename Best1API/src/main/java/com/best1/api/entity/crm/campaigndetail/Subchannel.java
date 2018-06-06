package com.best1.api.entity.crm.campaigndetail;


import com.best1.api.entity.BaseObject;

import java.util.Date;



public class Subchannel extends BaseObject {

	private Long channelid;
	private Long subchannelid;
	private Integer issuenumber;
	private Long  productdivisionid;
	private Integer  pagenumber ;
	private Long   nfmpgmscheduleid;
	private Date   startdate;
	private Date   enddate ;
	private String channelname;
	private String  subchannelname;
	private String  issuename ;
	private String  productdivisionname ;
	private String programname ;
	 
	 
	public Long getChannelid() {
		return channelid;
	}

	public void setChannelid(Long channelid) {
		this.channelid = channelid;
	}

	public Long getSubchannelid() {
		return subchannelid;
	}

	public void setSubchannelid(Long subchannelid) {
		this.subchannelid = subchannelid;
	}

	public Integer getIssuenumber() {
		return issuenumber;
	}

	public void setIssuenumber(Integer issuenumber) {
		this.issuenumber = issuenumber;
	}

	public Long getProductdivisionid() {
		return productdivisionid;
	}

	public void setProductdivisionid(Long productdivisionid) {
		this.productdivisionid = productdivisionid;
	}

	

	public Integer getPagenumber() {
		return pagenumber;
	}

	public void setPagenumber(Integer pagenumber) {
		this.pagenumber = pagenumber;
	}

	public Long getNfmpgmscheduleid() {
		return nfmpgmscheduleid;
	}

	public void setNfmpgmscheduleid(Long nfmpgmscheduleid) {
		this.nfmpgmscheduleid = nfmpgmscheduleid;
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

	public String getChannelname() {
		return channelname;
	}

	public void setChannelname(String channelname) {
		this.channelname = channelname;
	}

	public String getSubchannelname() {
		return subchannelname;
	}

	public void setSubchannelname(String subchannelname) {
		this.subchannelname = subchannelname;
	}

	public String getIssuename() {
		return issuename;
	}

	public void setIssuename(String issuename) {
		this.issuename = issuename;
	}

	public String getProductdivisionname() {
		return productdivisionname;
	}

	public void setProductdivisionname(String productdivisionname) {
		this.productdivisionname = productdivisionname;
	}

	public String getProgramname() {
		return programname;
	}

	public void setProgramname(String programname) {
		this.programname = programname;
	}



}
