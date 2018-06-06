package com.best1.api.entity.vwms;

import com.best1.api.entity.BaseObject;

/**
 * 订购商品详细信息
 * @author zhangzujie
 *
 */
public class OrderProductDetail extends BaseObject{

	private int shiporderid;    //出货单号
	private int productid;    //	商品代码
	private int productversion;    //	商品版本
	private int productcolourclass;    //	颜色分类
	private int productcolourcode;    //	颜色代码
	private String productcolourdescription;    //	颜色值
	private int productstyleclass;    //	款式分类
	private int productstylecode;    //	款式代码
	private String productstyledescription;    //	款式值
	private int productquantity;    //	商品数量
	private int shipordersequence;    //	出货单序号
	private int orderid;    //	订单号
	private int itemid;    //	订单序号
	private char ispromotionalproduct;    //	是否是赠品
	private int promotionrelationseq;    //	赠品关联主品订单序号
	private String orderkey;   //订单号+"-"+订单序号
	
	public int getShiporderid() {
		return shiporderid;
	}
	public void setShiporderid(int shiporderid) {
		this.shiporderid = shiporderid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getProductversion() {
		return productversion;
	}
	public void setProductversion(int productversion) {
		this.productversion = productversion;
	}
	public int getProductcolourclass() {
		return productcolourclass;
	}
	public void setProductcolourclass(int productcolourclass) {
		this.productcolourclass = productcolourclass;
	}
	public int getProductcolourcode() {
		return productcolourcode;
	}
	public void setProductcolourcode(int productcolourcode) {
		this.productcolourcode = productcolourcode;
	}
	public String getProductcolourdescription() {
		return productcolourdescription;
	}
	public void setProductcolourdescription(String productcolourdescription) {
		this.productcolourdescription = productcolourdescription;
	}
	public int getProductstyleclass() {
		return productstyleclass;
	}
	public void setProductstyleclass(int productstyleclass) {
		this.productstyleclass = productstyleclass;
	}
	public int getProductstylecode() {
		return productstylecode;
	}
	public void setProductstylecode(int productstylecode) {
		this.productstylecode = productstylecode;
	}
	public String getProductstyledescription() {
		return productstyledescription;
	}
	public void setProductstyledescription(String productstyledescription) {
		this.productstyledescription = productstyledescription;
	}
	public int getProductquantity() {
		return productquantity;
	}
	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}
	public int getShipordersequence() {
		return shipordersequence;
	}
	public void setShipordersequence(int shipordersequence) {
		this.shipordersequence = shipordersequence;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public char getIspromotionalproduct() {
		return ispromotionalproduct;
	}
	public void setIspromotionalproduct(char ispromotionalproduct) {
		this.ispromotionalproduct = ispromotionalproduct;
	}
	public int getPromotionrelationseq() {
		return promotionrelationseq;
	}
	public void setPromotionrelationseq(int promotionrelationseq) {
		this.promotionrelationseq = promotionrelationseq;
	}
	public String getOrderkey() {
		return orderkey;
	}
	public void setOrderkey(String orderkey) {
		this.orderkey = orderkey;
	}

}
