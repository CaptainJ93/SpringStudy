package com.best1.api.entity.crm.campaigndetail;

import java.util.Date;


import com.best1.api.entity.BaseObject;

public class TcrmLotteryexecution extends BaseObject{

    private Long executionno;

    private Long drawno;

   
    private Long conductedby;

  
    private Date drawdate;


	public Long getExecutionno() {
		return executionno;
	}


	public void setExecutionno(Long executionno) {
		this.executionno = executionno;
	}


	public Long getDrawno() {
		return drawno;
	}


	public void setDrawno(Long drawno) {
		this.drawno = drawno;
	}


	public Long getConductedby() {
		return conductedby;
	}


	public void setConductedby(Long conductedby) {
		this.conductedby = conductedby;
	}


	public Date getDrawdate() {
		return drawdate;
	}


	public void setDrawdate(Date drawdate) {
		this.drawdate = drawdate;
	}

}