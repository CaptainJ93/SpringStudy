package com.best1.api.service.oaf;

import java.util.List;

import com.best1.api.entity.oaf.order.CustomerOrderInfo;
import com.best1.api.entity.oaf.order.CustomerOrderPayment;
import com.best1.api.entity.oaf.order.OrderPayment;
import com.best1.api.entity.oaf.order.ToafAddressextrainfo;
import com.best1.api.entity.oaf.order.ToafAddressextrainfoKey;
import com.best1.api.entity.oaf.order.ToafOrder;
import com.best1.api.entity.oaf.order.ToafOrderedproduct;
import com.best1.api.entity.oaf.order.ToafOrderinvoiceinfo;
import com.best1.api.entity.oaf.order.ToafPostacknowledgement;
import com.best1.api.entity.oaf.order.TscmOrderreasoninfo;
import com.best1.api.webservice.soap.response.dto.oaf.OrderDiscounttransactionDTO;
import com.best1.api.webservice.soap.response.dto.oaf.OrderPaymentDTO;

public interface CustomerOrderManageSerevice {

	public Long fetchOrderId();

	/**
	 * 新增订单信息temp表
	 **/
	public int saveTempOrder(ToafOrder order, ToafOrderedproduct orderproduct);

	/**
	 * 新增订单付款方式temp表
	 **/
	public int saveTempOrderPayment(ToafOrderedproduct orderproduct);

	/**
	 * 新增订单付款方式temp表
	 **/
	public int createTempOrderPayment(ToafOrderedproduct orderproduct);

	/**
	 * 积分付款 目前已整合的创建订单的SP中
	 **/
	public ToafOrderedproduct webLotteryBonusPay(ToafOrderedproduct orderproduct);

	/**
	 * 创建订单信息
	 **/
	public ToafOrder createOrder(ToafOrder order);

	/**
	 * 在线支付冲账
	 */
	public ToafOrder postOrderReceivable(ToafOrder order);

	/**
	 * 修改更改配送地資訊
	 * 
	 **/

	public int modifyAddressExtraInfo(ToafAddressextrainfo addressextrainfo);

	public ToafAddressextrainfo queryAddressextrainfo(ToafAddressextrainfoKey key);

	/** 客户订单信息 **/
	public List<CustomerOrderInfo> selectCustomerOrderInfo(CustomerOrderInfo orderinfo);

	/** 客户订单配送信息 **/
	public List<TscmOrderreasoninfo> selectOrderreasoninfo(TscmOrderreasoninfo orderreasoninfo);

	/** 使用折價卷 **/
	public CustomerOrderInfo useOrderCoupons(CustomerOrderInfo orderinfo);

	/** 订单取消 **/
	public CustomerOrderInfo cancelCustomerOrder(CustomerOrderInfo orderinfo) throws Exception;

	/** 销退 **/
	public CustomerOrderInfo acceptReturnable(CustomerOrderInfo orderinfo) throws Exception;

	/** 出货确认 **/
	public CustomerOrderInfo shipConfirmable(CustomerOrderInfo orderinfo) throws Exception;

	/** 换货 **/
	public CustomerOrderInfo exchangeProductable(CustomerOrderInfo orderinfo) throws Exception;

	/**
	 * 配送确认、配送终止、逾期处理
	 * 
	 * @param orderinfo
	 * @return
	 * @throws Exception
	 */
	public CustomerOrderInfo deleveryConfirmOrAbort(CustomerOrderInfo orderinfo) throws Exception;

	/**
	 * 销退终止、销退入库、销退逾期
	 * 
	 * @param orderinfo
	 * @param type
	 * @return
	 * @throws Exception
	 */
	public CustomerOrderInfo orderRefundAbortOrStorageOrOverdue(CustomerOrderInfo orderinfo, int type) throws Exception;

	/**
	 * 
	 * @param orderinfo
	 * @return
	 */
	public boolean isOverdueOrNot(CustomerOrderInfo orderinfo);

	/**
	 * 发票核销
	 * 
	 * @param orderinfo
	 * @return
	 * @throws Exception
	 */
	public ToafOrderinvoiceinfo checkInvoice(ToafOrderinvoiceinfo orderinvoice) throws Exception;

	/** 客户电购支付订单订单信息 **/
	public List<CustomerOrderPayment> selectCustomerOrderPay(CustomerOrderPayment orderinfo);

	/** 客户电购支付订单订单信息 **/
	public ToafPostacknowledgement postCustomerOrderPay(ToafPostacknowledgement orderpost);

	/** 订单支付方式调整 **/
	public OrderPaymentDTO changeOrderPayment(OrderPayment orderpay);

	/** 会员是否已使用优惠 **/
	public OrderDiscounttransactionDTO userCampaignDiscount(OrderDiscounttransactionDTO orderDiscounttransactionDTO);

	/** 订单成立后插入通关密语使用流水表 **/
	public OrderDiscounttransactionDTO createDiscountTransaction(OrderDiscounttransactionDTO orderDiscounttransactionDTO);

	/** 折价券是否被使用过 **/
	public OrderDiscounttransactionDTO couponUsed(OrderDiscounttransactionDTO orderDiscounttransactionDTO);
}
