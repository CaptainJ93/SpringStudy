package com.best1.api.webservice.soap.response.dto.scm;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "tscmspmscmproduct")
public class TscmSpmscmproductDTO {

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