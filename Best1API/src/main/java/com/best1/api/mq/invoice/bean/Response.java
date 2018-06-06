package com.best1.api.mq.invoice.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * {"FPQQLSH":"2016983665456858231",
 * "FP_DM":"050003521011",
 * "FP_HM":"60305123",
 * "JYM":"00564825426500993747",
 * "KPRQ":"20160510143125",
 * "PDF_URL":"http://218.17.158.39:8101/dzfp-platform/downloadAction.do?method=download&request=CHnK39H87yYrpoya*COhxbmBriNPgQQMuHcPmtbrxNvb0ruQrok*xnzHFgpKDfIS6qsWNpAE41yNKoYqS79dEQ__%5EDAiBjcajGI"}

 * 
 * */
public class Response {

	@JsonProperty("FPQQLSH")
	private String fpqqlsh;
	@JsonProperty("FP_DM")
	private String fp_dm;
	@JsonProperty("FP_HM")
	private String fp_hm;
	@JsonProperty("KPRQ")
	private String kprq;
	@JsonProperty("JYM")
	private String jym;
	@JsonProperty("PDF_URL")
	private String pdf_url;
	@JsonProperty("SP_URL")
	private String sp_url;
	
	
	
	public String getSp_url() {
		return sp_url;
	}
	public void setSp_url(String sp_url) {
		this.sp_url = sp_url;
	}
	public String getFpqqlsh() {
		return fpqqlsh;
	}
	public void setFpqqlsh(String fpqqlsh) {
		this.fpqqlsh = fpqqlsh;
	}
	public String getFp_dm() {
		return fp_dm;
	}
	public void setFp_dm(String fp_dm) {
		this.fp_dm = fp_dm;
	}
	public String getFp_hm() {
		return fp_hm;
	}
	public void setFp_hm(String fp_hm) {
		this.fp_hm = fp_hm;
	}
	public String getKprq() {
		return kprq;
	}
	public void setKprq(String kprq) {
		this.kprq = kprq;
	}
	public String getJym() {
		return jym;
	}
	public void setJym(String jym) {
		this.jym = jym;
	}
	public String getPdf_url() {
		return pdf_url;
	}
	public void setPdf_url(String pdf_url) {
		this.pdf_url = pdf_url;
	}
	
	
	
	
	
	
	
	
	
}
