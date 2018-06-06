package com.best1.api.entity.oaf.order;

import com.best1.api.entity.BaseObject;

/**
 * 
 * This field corresponds to the database table  TSCM_CUSTOMERSHIPORDER 
 *
 * 
 */
public class TscmCustomershiporderKey   extends BaseObject {

    private Integer sequenceno;
 
    private Long shiporderid;

	public Integer getSequenceno() {
		return sequenceno;
	}

	public void setSequenceno(Integer sequenceno) {
		this.sequenceno = sequenceno;
	}

	public Long getShiporderid() {
		return shiporderid;
	}

	public void setShiporderid(Long shiporderid) {
		this.shiporderid = shiporderid;
	}
 
    
}