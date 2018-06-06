package com.best1.api.webservice.soap.response.dto.scm;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "productInfo")
public class ProductInfoDTO {
	
    private Long    productid;
	private String  productname;
    private Integer colorcode;
    private Integer stylecode;
    private Integer colorclass;
    private Integer styleclass;
    private String  clr;
    private String  sty;
    private Double sellprice;
    private Double marketprice;
    private Long    okqty;
    private String  lclass;
    private String  mclass;
    private String  sclass;
    private String  u8lclass;
    private String  u8sclass;
    private String  mainComment;
    private String  noticeComment;
    private String  optComment;
    private String  cplComment;
    private String  giftComment;
    private String  boxComment;
    private String  outprovince;
    private String  isjifen;
    private Double  jifenprice;
    private Double  rtnjifen;
    
    
	public Long getProductid() {
		return productid;
	}
	public void setProductid(Long productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public Integer getColorcode() {
		return colorcode;
	}
	public void setColorcode(Integer colorcode) {
		this.colorcode = colorcode;
	}
	public Integer getStylecode() {
		return stylecode;
	}
	public void setStylecode(Integer stylecode) {
		this.stylecode = stylecode;
	}
	public Integer getColorclass() {
		return colorclass;
	}
	public void setColorclass(Integer colorclass) {
		this.colorclass = colorclass;
	}
	public Integer getStyleclass() {
		return styleclass;
	}
	public void setStyleclass(Integer styleclass) {
		this.styleclass = styleclass;
	}
	public String getClr() {
		return clr;
	}
	public void setClr(String clr) {
		this.clr = clr;
	}
	public String getSty() {
		return sty;
	}
	public void setSty(String sty) {
		this.sty = sty;
	}
	public Double getSellprice() {
		return sellprice;
	}
	public void setSellprice(Double sellprice) {
		this.sellprice = sellprice;
	}
	public Double getMarketprice() {
		return marketprice;
	}
	public void setMarketprice(Double marketprice) {
		this.marketprice = marketprice;
	}
	public Long getOkqty() {
		return okqty;
	}
	public void setOkqty(Long okqty) {
		this.okqty = okqty;
	}
	public String getLclass() {
		return lclass;
	}
	public void setLclass(String lclass) {
		this.lclass = lclass;
	}
	public String getMclass() {
		return mclass;
	}
	public void setMclass(String mclass) {
		this.mclass = mclass;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	public String getU8lclass() {
		return u8lclass;
	}
	public void setU8lclass(String u8lclass) {
		this.u8lclass = u8lclass;
	}
	public String getU8sclass() {
		return u8sclass;
	}
	public void setU8sclass(String u8sclass) {
		this.u8sclass = u8sclass;
	}
	public String getMainComment() {
		return mainComment;
	}
	public void setMainComment(String mainComment) {
		this.mainComment = mainComment;
	}
	public String getNoticeComment() {
		return noticeComment;
	}
	public void setNoticeComment(String noticeComment) {
		this.noticeComment = noticeComment;
	}
	public String getOptComment() {
		return optComment;
	}
	public void setOptComment(String optComment) {
		this.optComment = optComment;
	}
	public String getCplComment() {
		return cplComment;
	}
	public void setCplComment(String cplComment) {
		this.cplComment = cplComment;
	}
	public String getGiftComment() {
		return giftComment;
	}
	public void setGiftComment(String giftComment) {
		this.giftComment = giftComment;
	}
	public String getBoxComment() {
		return boxComment;
	}
	public void setBoxComment(String boxComment) {
		this.boxComment = boxComment;
	}
	public String getOutprovince() {
		return outprovince;
	}
	public void setOutprovince(String outprovince) {
		this.outprovince = outprovince;
	}
	public String getIsjifen() {
		return isjifen;
	}
	public void setIsjifen(String isjifen) {
		this.isjifen = isjifen;
	}
	public Double getJifenprice() {
		return jifenprice;
	}
	public void setJifenprice(Double jifenprice) {
		this.jifenprice = jifenprice;
	}
	public Double getRtnjifen() {
		return rtnjifen;
	}
	public void setRtnjifen(Double rtnjifen) {
		this.rtnjifen = rtnjifen;
	}
    
    
    
    
}
