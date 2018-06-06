package com.best1.api.webservice.soap.response.dto.vwms;

 
public class ReturnProductsDetailDTO {

    private Long returnorderid;

    private Long shiporderid;

    private Integer shipordersequence;

  
    private Integer sequenceno;


    private String noneedtotakebackflag; //使否须收回

    private Integer returnordersequence;

    
    private Long productid;

   
    private Integer productversion;

 
    private Integer colourcode;

    
    private Integer colourclass;

  
    private Integer stylecode;

    
    private Integer styleclass;

   
    private Long requestquantity;

    //是否需核准发票
    private String checkinvoiceflag;
    private String logid;
    private String canceloriginalshiporderflag;
    

	public Long getReturnorderid() {
		return returnorderid;
	}


	public void setReturnorderid(Long returnorderid) {
		this.returnorderid = returnorderid;
	}


	public Long getShiporderid() {
		return shiporderid;
	}


	public void setShiporderid(Long shiporderid) {
		this.shiporderid = shiporderid;
	}


	public Integer getShipordersequence() {
		return shipordersequence;
	}


	public void setShipordersequence(Integer shipordersequence) {
		this.shipordersequence = shipordersequence;
	}


	public Integer getSequenceno() {
		return sequenceno;
	}


	public void setSequenceno(Integer sequenceno) {
		this.sequenceno = sequenceno;
	}


	public String getNoneedtotakebackflag() {
		return noneedtotakebackflag;
	}


	public void setNoneedtotakebackflag(String noneedtotakebackflag) {
		this.noneedtotakebackflag = noneedtotakebackflag;
	}


	public Integer getReturnordersequence() {
		return returnordersequence;
	}


	public void setReturnordersequence(Integer returnordersequence) {
		this.returnordersequence = returnordersequence;
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


	public Long getRequestquantity() {
		return requestquantity;
	}


	public void setRequestquantity(Long requestquantity) {
		this.requestquantity = requestquantity;
	}


	public String getCheckinvoiceflag() {
		return checkinvoiceflag;
	}


	public void setCheckinvoiceflag(String checkinvoiceflag) {
		this.checkinvoiceflag = checkinvoiceflag;
	}


	public String getLogid() {
		return logid;
	}


	public void setLogid(String logid) {
		this.logid = logid;
	}


	public String getCanceloriginalshiporderflag() {
		return canceloriginalshiporderflag;
	}


	public void setCanceloriginalshiporderflag(String canceloriginalshiporderflag) {
		this.canceloriginalshiporderflag = canceloriginalshiporderflag;
	}

   
    
    

    
}
