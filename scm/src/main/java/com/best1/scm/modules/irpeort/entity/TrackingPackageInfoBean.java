package com.best1.scm.modules.irpeort.entity;

import java.util.ArrayList;
import java.util.List;


/**
 * 配送面单号信息
 * @author zhangzujie
 *
 */
public class TrackingPackageInfoBean {
	private String SO_NO;
	private String  CDWH_POSTCODE ;
	private String  WMOR_C_ZIP ;
	private String   WMOR_C_TEL1;
	private String  WMOR_C_TEL2 ;
	private String  CDWH_ADDRESS ;
	private String  ISNEWCUSTOMER ;
	private String   INSTRUCTIONTOSCM;
	private String  ET1_NO ;
	private String  WMOR_SOREFERENCE1 ;
	private String  WMAA_LOGISTICSID ;
	private String  WMOR_CONSIGNEENAME ;
	private String  CDWH_TEL ;
	private String   ROW_NUM;
	private String   TYPE_OF_PAYMENT;
	private String   SUM_NUM;
	private String   WMOR_CONSIGNEEID;
	private String  CARRIER_SHORT ;
	private String  WMAA_WAVE_NO ;
	private String  CDWH_NAME ;
	private String  WMOR_C_ADDRESS1 ;
	private String   EBPL_NAME_CN;
	private String  INSTRUCTIONTOWMS ;
	private String  COD_PRICE ;
	private String   CDPD_GROSSW;
	private String  CDSK_SKU_NAME ;
	private String   CDSK_SKU_GROUP6;
	private String  CDSK_SKU_CODE ;
	private String  CDSK_SKU_GROUP3 ;
	private String   USERDEFINED13;
	private String   WMOS_D_EDI_06;
	
	public static List<TrackingPackageInfoBean> getList() {
		List<TrackingPackageInfoBean> list = new ArrayList<TrackingPackageInfoBean>();
		TrackingPackageInfoBean  t1 =new TrackingPackageInfoBean();
		TrackingPackageInfoBean  t2 = new TrackingPackageInfoBean();
		t1.setWMAA_LOGISTICSID("ZJ001");
		t2.setWMAA_LOGISTICSID("ZJ002");
		list.add(t1);
		list.add(t2);
		
		return list;
	}
	
	public String getSO_NO() {
		return SO_NO;
	}
	public void setSO_NO(String sO_NO) {
		SO_NO = sO_NO;
	}
	public String getCDWH_POSTCODE() {
		return CDWH_POSTCODE;
	}
	public void setCDWH_POSTCODE(String cDWH_POSTCODE) {
		CDWH_POSTCODE = cDWH_POSTCODE;
	}
	public String getWMOR_C_ZIP() {
		return WMOR_C_ZIP;
	}
	public void setWMOR_C_ZIP(String wMOR_C_ZIP) {
		WMOR_C_ZIP = wMOR_C_ZIP;
	}
	public String getWMOR_C_TEL1() {
		return WMOR_C_TEL1;
	}
	public void setWMOR_C_TEL1(String wMOR_C_TEL1) {
		WMOR_C_TEL1 = wMOR_C_TEL1;
	}
	public String getWMOR_C_TEL2() {
		return WMOR_C_TEL2;
	}
	public void setWMOR_C_TEL2(String wMOR_C_TEL2) {
		WMOR_C_TEL2 = wMOR_C_TEL2;
	}
	public String getCDWH_ADDRESS() {
		return CDWH_ADDRESS;
	}
	public void setCDWH_ADDRESS(String cDWH_ADDRESS) {
		CDWH_ADDRESS = cDWH_ADDRESS;
	}
	public String getISNEWCUSTOMER() {
		return ISNEWCUSTOMER;
	}
	public void setISNEWCUSTOMER(String iSNEWCUSTOMER) {
		ISNEWCUSTOMER = iSNEWCUSTOMER;
	}
	public String getINSTRUCTIONTOSCM() {
		return INSTRUCTIONTOSCM;
	}
	public void setINSTRUCTIONTOSCM(String iNSTRUCTIONTOSCM) {
		INSTRUCTIONTOSCM = iNSTRUCTIONTOSCM;
	}
	public String getET1_NO() {
		return ET1_NO;
	}
	public void setET1_NO(String eT1_NO) {
		ET1_NO = eT1_NO;
	}
	public String getWMOR_SOREFERENCE1() {
		return WMOR_SOREFERENCE1;
	}
	public void setWMOR_SOREFERENCE1(String wMOR_SOREFERENCE1) {
		WMOR_SOREFERENCE1 = wMOR_SOREFERENCE1;
	}
	public String getWMAA_LOGISTICSID() {
		return WMAA_LOGISTICSID;
	}
	public void setWMAA_LOGISTICSID(String wMAA_LOGISTICSID) {
		WMAA_LOGISTICSID = wMAA_LOGISTICSID;
	}
	public String getWMOR_CONSIGNEENAME() {
		return WMOR_CONSIGNEENAME;
	}
	public void setWMOR_CONSIGNEENAME(String wMOR_CONSIGNEENAME) {
		WMOR_CONSIGNEENAME = wMOR_CONSIGNEENAME;
	}
	public String getCDWH_TEL() {
		return CDWH_TEL;
	}
	public void setCDWH_TEL(String cDWH_TEL) {
		CDWH_TEL = cDWH_TEL;
	}
	public String getROW_NUM() {
		return ROW_NUM;
	}
	public void setROW_NUM(String rOW_NUM) {
		ROW_NUM = rOW_NUM;
	}
	public String getTYPE_OF_PAYMENT() {
		return TYPE_OF_PAYMENT;
	}
	public void setTYPE_OF_PAYMENT(String tYPE_OF_PAYMENT) {
		TYPE_OF_PAYMENT = tYPE_OF_PAYMENT;
	}
	public String getSUM_NUM() {
		return SUM_NUM;
	}
	public void setSUM_NUM(String sUM_NUM) {
		SUM_NUM = sUM_NUM;
	}
	public String getWMOR_CONSIGNEEID() {
		return WMOR_CONSIGNEEID;
	}
	public void setWMOR_CONSIGNEEID(String wMOR_CONSIGNEEID) {
		WMOR_CONSIGNEEID = wMOR_CONSIGNEEID;
	}
	public String getCARRIER_SHORT() {
		return CARRIER_SHORT;
	}
	public void setCARRIER_SHORT(String cARRIER_SHORT) {
		CARRIER_SHORT = cARRIER_SHORT;
	}
	public String getWMAA_WAVE_NO() {
		return WMAA_WAVE_NO;
	}
	public void setWMAA_WAVE_NO(String wMAA_WAVE_NO) {
		WMAA_WAVE_NO = wMAA_WAVE_NO;
	}
	public String getCDWH_NAME() {
		return CDWH_NAME;
	}
	public void setCDWH_NAME(String cDWH_NAME) {
		CDWH_NAME = cDWH_NAME;
	}
	public String getWMOR_C_ADDRESS1() {
		return WMOR_C_ADDRESS1;
	}
	public void setWMOR_C_ADDRESS1(String wMOR_C_ADDRESS1) {
		WMOR_C_ADDRESS1 = wMOR_C_ADDRESS1;
	}
	public String getEBPL_NAME_CN() {
		return EBPL_NAME_CN;
	}
	public void setEBPL_NAME_CN(String eBPL_NAME_CN) {
		EBPL_NAME_CN = eBPL_NAME_CN;
	}
	public String getINSTRUCTIONTOWMS() {
		return INSTRUCTIONTOWMS;
	}
	public void setINSTRUCTIONTOWMS(String iNSTRUCTIONTOWMS) {
		INSTRUCTIONTOWMS = iNSTRUCTIONTOWMS;
	}
	public String getCOD_PRICE() {
		return COD_PRICE;
	}
	public void setCOD_PRICE(String cOD_PRICE) {
		COD_PRICE = cOD_PRICE;
	}
	public String getCDPD_GROSSW() {
		return CDPD_GROSSW;
	}
	public void setCDPD_GROSSW(String cDPD_GROSSW) {
		CDPD_GROSSW = cDPD_GROSSW;
	}
	public String getCDSK_SKU_NAME() {
		return CDSK_SKU_NAME;
	}
	public void setCDSK_SKU_NAME(String cDSK_SKU_NAME) {
		CDSK_SKU_NAME = cDSK_SKU_NAME;
	}
	public String getCDSK_SKU_GROUP6() {
		return CDSK_SKU_GROUP6;
	}
	public void setCDSK_SKU_GROUP6(String cDSK_SKU_GROUP6) {
		CDSK_SKU_GROUP6 = cDSK_SKU_GROUP6;
	}
	public String getCDSK_SKU_CODE() {
		return CDSK_SKU_CODE;
	}
	public void setCDSK_SKU_CODE(String cDSK_SKU_CODE) {
		CDSK_SKU_CODE = cDSK_SKU_CODE;
	}
	public String getCDSK_SKU_GROUP3() {
		return CDSK_SKU_GROUP3;
	}
	public void setCDSK_SKU_GROUP3(String cDSK_SKU_GROUP3) {
		CDSK_SKU_GROUP3 = cDSK_SKU_GROUP3;
	}
	public String getUSERDEFINED13() {
		return USERDEFINED13;
	}
	public void setUSERDEFINED13(String uSERDEFINED13) {
		USERDEFINED13 = uSERDEFINED13;
	}
	public String getWMOS_D_EDI_06() {
		return WMOS_D_EDI_06;
	}
	public void setWMOS_D_EDI_06(String wMOS_D_EDI_06) {
		WMOS_D_EDI_06 = wMOS_D_EDI_06;
	}



}
