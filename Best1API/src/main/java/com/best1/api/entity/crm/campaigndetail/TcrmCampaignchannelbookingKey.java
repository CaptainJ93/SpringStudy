package com.best1.api.entity.crm.campaigndetail;


import com.best1.api.entity.BaseObject;

/**
 *  
 * This field corresponds to the database column  TCRM_CAMPAIGNCHANNELBOOKING 
 *
 * 
 */
public class TcrmCampaignchannelbookingKey extends BaseObject{
 
    private Long campaignno;
 
    private Long nfmpgmscheduleid;

	public Long getCampaignno() {
		return campaignno;
	}

	public void setCampaignno(Long campaignno) {
		this.campaignno = campaignno;
	}

	public Long getNfmpgmscheduleid() {
		return nfmpgmscheduleid;
	}

	public void setNfmpgmscheduleid(Long nfmpgmscheduleid) {
		this.nfmpgmscheduleid = nfmpgmscheduleid;
	}

    
}