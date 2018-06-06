package com.best1.api.entity.scm.spm;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.best1.api.entity.BaseObject;


@Entity
@Table(name = "TSCM_SPMSCMPRODUCT")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class TscmSpmscmproduct extends BaseObject{


    private Long sequenceno;

 
    private Long spmproductid;

 
    private Long scmproductid;
    
    private Integer rtncode;

	public Integer getRtncode() {
		return rtncode;
	}

	public void setRtncode(Integer rtncode) {
		this.rtncode = rtncode;
	}


	public Long getSequenceno() {
		return sequenceno;
	}


	public void setSequenceno(Long sequenceno) {
		this.sequenceno = sequenceno;
	}


	public Long getSpmproductid() {
		return spmproductid;
	}


	public void setSpmproductid(Long spmproductid) {
		this.spmproductid = spmproductid;
	}


	public Long getScmproductid() {
		return scmproductid;
	}


	public void setScmproductid(Long scmproductid) {
		this.scmproductid = scmproductid;
	}

    
}