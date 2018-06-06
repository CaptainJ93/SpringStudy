package com.best1.api.webservice.soap.oaf;

import javax.jws.WebParam;
import javax.jws.WebService;


import com.best1.api.utils.APIConstant;
import com.best1.api.webservice.soap.response.result.oaf.CustomerOrderInfoResult;
import com.best1.api.webservice.soap.response.result.oaf.CustomerOrderPaymentResult;
import com.best1.api.webservice.soap.response.result.oaf.CustomerOrderPaymentsResult;
import com.best1.api.webservice.soap.response.result.oaf.CustomerOrdersInfoResult;
import com.best1.api.webservice.soap.response.result.oaf.FedirefundrequestResult;
import com.best1.api.webservice.soap.response.result.oaf.FedirefundresponseResult;
import com.best1.api.webservice.soap.response.result.oaf.OrderInvoiceInfoResult;
import com.best1.api.webservice.soap.response.result.oaf.OrderReasonInfoesResult;
import com.best1.api.webservice.soap.response.result.oaf.OrderResult;
import com.best1.api.webservice.utils.WsConstants;

/**
 * JAX-WS2.0的WebService接口定义类.
 * 
 * 使用JAX-WS2.0 annotation设置WSDL中的定义. 使用WSResult及其子类类包裹返回结果.
 * 使用DTO传输对象隔绝系统内部领域对象的修改对外系统的影响.
 * 
 * 
 */
@WebService(name = "CustomerOrderService", targetNamespace = WsConstants.NS)
public interface CustomerOrderSoapService {

	/**
	 * 创建临时订单
	 * 
	 * ***/
	public OrderResult buildTempOrder(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.ORDERTYPE) Integer ordertype,
			@WebParam(name = APIConstant.ITEMID) Integer itemid,
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid,
			@WebParam(name = APIConstant.CUSTOMERNAME) String customername,
			@WebParam(name = APIConstant.CALLATTENDEDBY) Long callattendedby,
			@WebParam(name = APIConstant.MULTICODEID) Long multicodeid,
			@WebParam(name = APIConstant.PRODUCTID) Long productid,
			@WebParam(name = APIConstant.PRODUCTVERSION) Integer productversion,
			@WebParam(name = APIConstant.ISOFFSHOREDELIVERY) String isoffshoredelivery,
			@WebParam(name = APIConstant.COLOURCODE) Integer colourcode,
			@WebParam(name = APIConstant.COLOURCLASS) Integer colourclass,
			@WebParam(name = APIConstant.STYLECODE) Integer stylecode,
			@WebParam(name = APIConstant.STYLECLASS) Integer styleclass,
			@WebParam(name = APIConstant.SERVICEFEE) Double servicefee,
			@WebParam(name = APIConstant.BONUSPOINTSGAINED) Double bonuspointsgained,
			@WebParam(name = APIConstant.OFFSHOREDELIVERYCHARGES) Double offshoredeliverycharges,
			@WebParam(name = APIConstant.DISCOUNT) Double discount,
			@WebParam(name = APIConstant.PRODUCTNAME) String productname,
			@WebParam(name = APIConstant.RECEIVERNAME) String receivername,
			@WebParam(name = APIConstant.ADDRESSID) Long addressid,
			@WebParam(name = APIConstant.SELLINGPRICE) Double sellingprice,
			@WebParam(name = APIConstant.INVOICETYPE) Integer invoicetype,
			@WebParam(name = APIConstant.ISREPRINTED) String isreprinted,
			@WebParam(name = APIConstant.ISEINVOICE) String iseinvoice,
			@WebParam(name = APIConstant.TAXTYPE) Integer taxtype,
			@WebParam(name = APIConstant.PAYMENTMODEID) Integer paymentmodeid,
			@WebParam(name = APIConstant.INVOICETITLE) String invoicetitle,
			@WebParam(name = APIConstant.COMPANYNO) String companyno,
			@WebParam(name = APIConstant.INVOICERECEIVERNAME) String invoicereceivername,
			@WebParam(name = APIConstant.INSTRUCTIONTOSCM) String instructiontoscm,
			@WebParam(name = APIConstant.ORDER_DESC) String order_desc,
			@WebParam(name = APIConstant.ISPROMOTIONALPRODUCT) String ispromotionalproduct,
			@WebParam(name = APIConstant.STORECHAINID) Long storechainid,
			@WebParam(name = APIConstant.STOREID) Long storeid,
			@WebParam(name = APIConstant.SUBDELIVERYTYPE) Integer subdeliverytype);

	/**
	 * 支付方式
	 * */
	public OrderResult buildTempOrderPayment(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.ISACNTFIRST) Integer isacntfirst,
			@WebParam(name = APIConstant.BONUS) Integer bonus,
			@WebParam(name = APIConstant.PAYMENTMODEID) Integer paymentmodeid,
			@WebParam(name = APIConstant.TRANSFERACCNO) Integer transferaccno);
	/**
	 * 支付方式
	 * */
	public OrderResult createTempOrderPayment(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.PAYMENTMODEID) Integer paymentmodeid,
			@WebParam(name = APIConstant.TRANSFERACCNO) Integer transferaccno);
	
	/**
	 * 正式订单
	 * */
	public OrderResult buildOrder(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid,
			@WebParam(name = APIConstant.CALLATTENDEDBY) Long callattendedby,
			@WebParam(name = APIConstant.USELOTTERYBONUS) Integer uselotterybonus,
			@WebParam(name = APIConstant.SUBCHANNELID) Long subcharnelid,
			@WebParam(name = APIConstant.AREACODE) String areacode,
			@WebParam(name = APIConstant.REFEREEID) String reffereeid,
			@WebParam(name = APIConstant.REFEREETYPE) Integer refereetype);

	/**
	 * 在线支付冲账
	 * */
	public OrderResult postOrder(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid,
			@WebParam(name = APIConstant.PAYERNAME) String payername,
			@WebParam(name = APIConstant.RECEIPTNO) String receiptno);

	public OrderResult fetchOrderId();

	/**
	 * 订单信息查询 查询订单二年内
	 * 
	 * ***/
	public CustomerOrdersInfoResult queryCustomerOrder(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.ITEMID) Integer itemid,
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid);

	/**
	 * 
	 * 物流
	 * 
	 *
	 * ***/
	public OrderReasonInfoesResult queryOrderReasonInfo(
			@WebParam(name = APIConstant.SHIPORDERID) Long shiporderid,
			@WebParam(name = APIConstant.SEQUENCENO) Integer sequenceno,
			@WebParam(name = APIConstant.ISSHIPORDER) String isshiporder);

	// 取消订单
	public CustomerOrderInfoResult cancelCustomerOrder(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.ITEMID) Integer itemid,
			@WebParam(name = APIConstant.CREATEDBY) Long createdby,
			@WebParam(name = APIConstant.REMARKS) String remarks,
			@WebParam(name = APIConstant.PRIMARYCANCELREASON) Integer primarycancelreason,
			@WebParam(name = APIConstant.SECONDARYCANCELREASON) Integer secondarycancelreason);

	// 配送终止
	public CustomerOrderInfoResult failureCustomerShipOrder(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.ITEMID) Integer itemid,
			@WebParam(name = APIConstant.CREATEDBY) Long createdby);

	/**
	 * 销退
	 * 
	 * @return CustomerOrdersInfoResult
	 */
	public CustomerOrderInfoResult acceptReturn(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.ITEMID) Integer itemid,
			@WebParam(name = APIConstant.RETURNTYPE) Integer returntype,
			@WebParam(name = APIConstant.RETURNREASON1) Integer returnreason1,
			@WebParam(name = APIConstant.RETURNREASON2) Integer returnreason2,
			@WebParam(name = APIConstant.CREATEDBY) Long createdby);

	// 配送确定
	public CustomerOrderInfoResult confirmCustomerShipOrder(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.ITEMID) Integer itemid,
			@WebParam(name = APIConstant.CREATEDBY) Long createdby);

	// 逾期处理
	public CustomerOrderInfoResult reasonInfo(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.ITEMID) Integer itemid,
			@WebParam(name = APIConstant.REMARKS) String remarks,
			@WebParam(name = APIConstant.CREATEDBY) Long createdby,
			@WebParam(name = APIConstant.REASONCODE) String reasoncode);

	/**
	 * 出货确认
	 * 
	 * @return CustomerOrderInfoResult
	 */
	public CustomerOrderInfoResult shipConfirm(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.ITEMID) Integer itemid,
			@WebParam(name = APIConstant.DELIVERYORDERID) String deliveryorderid,
			@WebParam(name = APIConstant.SELECTEDCARRIER) Long selectedcarrier,
			@WebParam(name = APIConstant.CREATEDBY) Long createdby,
			@WebParam(name = APIConstant.ACTUALSHIPPEDDATE) String actualshippeddate);

	/**
	 * 换货
	 * 
	 * @return CustomerOrderInfoResult
	 */
	public CustomerOrderInfoResult exchangeProduct(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.ITEMID) Integer itemid,
			@WebParam(name = APIConstant.RETURNTYPE) Integer returntype,
			@WebParam(name = APIConstant.RETURNREASON1) Integer returnreason1,
			@WebParam(name = APIConstant.RETURNREASON2) Integer returnreason2,
			@WebParam(name = APIConstant.CREATEDBY) Long createdby,
			@WebParam(name = APIConstant.COLOURCODE) Integer colourcode,
			@WebParam(name = APIConstant.COLOURCLASS) Integer colourclass,
			@WebParam(name = APIConstant.STYLECODE) Integer stylecode,
			@WebParam(name = APIConstant.STYLECLASS) Integer styleclass);

	/**
	 * 发票核销
	 * 
	 * @param orderid
	 * @param itemid
	 * @param customerid
	 * @return CustomerOrderInfoResult
	 */
	public OrderInvoiceInfoResult checkInvoice(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.ITEMID) Integer itemid,
			@WebParam(name = APIConstant.CREATEDBY) Long createdby);

	// 销退终止
	public CustomerOrderInfoResult failAbortReject(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.ITEMID) Integer itemid,
			@WebParam(name = APIConstant.CREATEDBY) Long createdby,
			@WebParam(name = APIConstant.REMARKS) String remarks,
			@WebParam(name = APIConstant.REASONCODE) String reasoncode);

	// 销退入库
	public CustomerOrderInfoResult returnConfirm(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.ITEMID) Integer itemid,
			@WebParam(name = APIConstant.CREATEDBY) Long createdby,
			@WebParam(name = APIConstant.REMARKS) String remarks,
			@WebParam(name = APIConstant.REASONCODE) String reasoncode);

	// 客户寄回
	public CustomerOrderInfoResult returnReasonInfo(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.ITEMID) Integer itemid,
			@WebParam(name = APIConstant.CREATEDBY) Long createdby,
			@WebParam(name = APIConstant.REMARKS) String remarks,
			@WebParam(name = APIConstant.REASONCODE) String reasoncode);

	public CustomerOrderInfoResult orderRefundAbortOrStorageOrOverdueCommon(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.ITEMID) Integer itemid,
			@WebParam(name = APIConstant.CREATEDBY) Long createdby,
			@WebParam(name = APIConstant.REMARKS) String remarks,
			@WebParam(name = APIConstant.REASONCODE) String reasoncode,
			@WebParam(name = APIConstant.TYPE) int type);

	/**
	 * 
	 * @param orderid
	 * @param coupontype
	 * @param coupongroupnumber
	 * @param usage
	 * @param offervaluepercent
	 * @param offervalue
	 * @param customerid
	 * @param createdby
	 * @param productid
	 * @param productversion
	 * @param quantity
	 * @return
	 */
	public CustomerOrderInfoResult orderCoupons(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.COUPONNUMBER) Long couponnumber,
			@WebParam(name = APIConstant.COUPONTYPE) Integer coupontype,
			@WebParam(name = APIConstant.COUPONGROUPNUMBER) Long coupongroupnumber,
			@WebParam(name = APIConstant.USAGE) Integer usage,
			@WebParam(name = APIConstant.OFFERVALUEPERCENT) Integer offervaluepercent,
			@WebParam(name = APIConstant.OFFERVALUE) Integer offervalue,
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid,
			@WebParam(name = APIConstant.CREATEDBY) Long createdby,
			@WebParam(name = APIConstant.PRODUCTID) Long productid,
			@WebParam(name = APIConstant.PRODUCTVERSION) Integer productversion,
			@WebParam(name = APIConstant.PRODUCTAMOUNT) Double productamount,
			@WebParam(name = APIConstant.QUANTITY) Integer quantity);
	
	/**
	 * 电网在线支付订单
	 * 
	 * **/
	public CustomerOrderPaymentsResult queryCustomerOrderPay(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.ITEMID) Integer itemid,
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid,
			@WebParam(name = APIConstant.TRANSFERACCNO) String transferaccno);
	
	
	/**
	 * 电网在线支付订单
	 * 
	 * **/
	public CustomerOrderPaymentResult postCustomerOrderPay(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.PAYMENTAMOUNT) Double paymentamount,
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid,
			@WebParam(name = APIConstant.PAYERNAME) String payername,
			@WebParam(name = APIConstant.TRANSFERACCNO) String transferaccno,
			@WebParam(name = APIConstant.RECEIPTNO) String receiptno,
			@WebParam(name = APIConstant.CREATEDBY) Long createdby);
	
	
	/**
	 * 发票信息
	 * 
	 * **/
	public OrderInvoiceInfoResult customerOrderInvoice(
			@WebParam(name = APIConstant.ORDERID) Long orderid,
			@WebParam(name = APIConstant.ITEMID) Integer itemid,
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid);
	
	/**
	 *退款信息 
	 * */
	public FedirefundrequestResult fedireFundRequest(
			@WebParam(name = APIConstant.BANKCODE) String bankcode,
			@WebParam(name = APIConstant.BATCHID) String batchid);
	
	/**
	 *退款确认 
	 * */
	public FedirefundresponseResult fedireFundResponse(
			@WebParam(name = APIConstant.COMPANYID) Long companyid,
			@WebParam(name = APIConstant.BANKCODE) String bankcode,
			@WebParam(name = APIConstant.REFUNDID) Long refundid,
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid,
			@WebParam(name = APIConstant.REFUNDAMOUNT) Double refundamount,
			@WebParam(name = APIConstant.REFUNDSTATUS) Integer refundstatus,
			@WebParam(name = APIConstant.TRANSACTIONSEQUENCE) String transactionsequence,
			@WebParam(name = APIConstant.PAYMENTDATE) String paymentdate,
			@WebParam(name = APIConstant.PAYINGACCOUNTNUMBER) String payingaccountnumber,
			@WebParam(name = APIConstant.RECIPIENTACCOUNT) String recipientaccount,
			@WebParam(name = APIConstant.RECIPIENTNAME) String recipientname,
			@WebParam(name = APIConstant.CREATEDBY) Long createdby,
			@WebParam(name = APIConstant.PAYINGBANKID) Long payingbankid,
			@WebParam(name = APIConstant.RECIPIENTBANKID) Long recipientbankid,
			@WebParam(name = APIConstant.PERSONALID) String personalid,
			@WebParam(name = APIConstant.SERVICEFEE) Double servicefee,
			@WebParam(name = APIConstant.BUSINESSCODE) String businesscode,
			@WebParam(name = APIConstant.PAYERNAME) String payername,
			@WebParam(name = APIConstant.REPAYID) Long repayid);
}
