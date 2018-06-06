package com.best1.api.service.oaf.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.javasimon.aop.Monitored;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.entity.crm.TcrmCustomeraccountbalance;
import com.best1.api.entity.crm.TcrmCustomeraccountbalanceExample;
import com.best1.api.entity.crm.TcrmCusttransactiondetails;
import com.best1.api.entity.crm.campaigndetail.TcrmDiscounttransaction;
import com.best1.api.entity.oaf.order.CustomerOrderInfo;
import com.best1.api.entity.oaf.order.CustomerOrderPayment;
import com.best1.api.entity.oaf.order.OrderPayment;
import com.best1.api.entity.oaf.order.OrderPaymentMode;
import com.best1.api.entity.oaf.order.ToafAddressextrainfo;
import com.best1.api.entity.oaf.order.ToafAddressextrainfoKey;
import com.best1.api.entity.oaf.order.ToafOrder;
import com.best1.api.entity.oaf.order.ToafOrderedproduct;
import com.best1.api.entity.oaf.order.ToafOrderedproductKey;
import com.best1.api.entity.oaf.order.ToafOrderinvoiceinfo;
import com.best1.api.entity.oaf.order.ToafOrderinvoiceinfoExample;
import com.best1.api.entity.oaf.order.ToafOrderpayment;
import com.best1.api.entity.oaf.order.ToafOrderpaymentExample;
import com.best1.api.entity.oaf.order.ToafPaybypost;
import com.best1.api.entity.oaf.order.ToafPostacknowledgement;
import com.best1.api.entity.oaf.order.TscmOrderreasoninfo;
import com.best1.api.mapper.crm.TcrmCustomeraccountbalanceMapper;
import com.best1.api.mapper.crm.TcrmCusttransactiondetailsMapper;
import com.best1.api.mapper.crm.TcrmDiscounttransactionMapper;
import com.best1.api.mapper.crm.TcrmLotterybonusMapper;
import com.best1.api.mapper.oaf.order.ToafAddressextrainfoMapper;
import com.best1.api.mapper.oaf.order.ToafOrderedproductMapper;
import com.best1.api.mapper.oaf.order.ToafOrderinvoiceinfoMapper;
import com.best1.api.mapper.oaf.order.ToafOrderpaymentMapper;
import com.best1.api.mapper.oaf.order.ToafPaybypostMapper;
import com.best1.api.mapper.oaf.order.ToafPostacknowledgementMapper;
import com.best1.api.service.crm.CustomerManageService;
import com.best1.api.service.oaf.CustomerOrderManageSerevice;
import com.best1.api.utils.APIConstant;
import com.best1.api.utils.Arith;
import com.best1.api.utils.ConfigInfo;
import com.best1.api.utils.ConnectET1Util;
import com.best1.api.utils.DateUtil;
import com.best1.api.utils.IOAFConstants;
import com.best1.api.utils.IOAFDomainConstants;
import com.best1.api.utils.SCMConstant;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.response.dto.oaf.OrderDiscounttransactionDTO;
import com.best1.api.webservice.soap.response.dto.oaf.OrderPaymentDTO;
import com.best1.api.webservice.soap.response.dto.oaf.OrderPaymentModeDTO;

@Component
@Transactional
@Monitored
public class CustomerOrderManageSereviceImpl implements CustomerOrderManageSerevice {
	private static Logger logger = LoggerFactory.getLogger(CustomerOrderManageSereviceImpl.class);

	@Autowired
	private ToafAddressextrainfoMapper addressextrainfoDao;

	@Autowired
	private ToafOrderedproductMapper orderedproductDao;

	@Autowired
	private TcrmLotterybonusMapper lotterybonusDAO;

	@Autowired
	private ToafOrderinvoiceinfoMapper orderInvoiceDAO;

	@Autowired
	private ConfigInfo configInfo;

	@Autowired
	private ToafPostacknowledgementMapper postacknowledgementDAO;

	@Autowired
	private ToafOrderpaymentMapper orderpaymentMapperDAO;

	@Autowired
	private TcrmCusttransactiondetailsMapper custtransactiondetailsMapperDAO;
	@Autowired
	private TcrmCustomeraccountbalanceMapper customeraccountbalanceMapperDAO;

	@Autowired
	private CustomerManageService customerManageService;
	@Autowired
	private ToafPaybypostMapper paybyPostMapperDAO;

	@Autowired
	private TcrmDiscounttransactionMapper discounttransactionMapperDAO;

	@Override
	public Long fetchOrderId() {
		// TODO Auto-generated method stub
		return orderedproductDao.fetchOrderId();
	}

	@Override
	public int saveTempOrder(ToafOrder order, ToafOrderedproduct orderproduct) {
		Map<String, Object> paramMap = new HashMap<String, Object>();

		if (StringUtils.equalsIgnoreCase(orderproduct.getIseinvoice(), APIConstant.API_YES)) {
			orderproduct.setIsreprinted(APIConstant.API_YES);
		}

		paramMap.put(APIConstant.P_ORDERID, order.getOrderid());
		paramMap.put(APIConstant.P_ORDERTYPE, order.getOrdertype());
		paramMap.put(APIConstant.P_ITEMID, orderproduct.getItemid());
		paramMap.put(APIConstant.P_CUSTOMERID, orderproduct.getCustomerid());
		paramMap.put(APIConstant.P_CUSTOMERNAME, orderproduct.getCustomername());
		paramMap.put(APIConstant.P_CALLATTENDEDBY, orderproduct.getCreatedby());
		paramMap.put(APIConstant.P_MULTICODEID, orderproduct.getMulticodeid());
		paramMap.put(APIConstant.P_PRODUCTID, orderproduct.getProductid());
		paramMap.put(APIConstant.P_PRODUCTVERSION, orderproduct.getProductversion());
		paramMap.put(APIConstant.P_ISOFFSHOREDELIVERY, orderproduct.getIsoffshoredelivery());
		paramMap.put(APIConstant.P_COLOURCODE, orderproduct.getColourcode());
		paramMap.put(APIConstant.P_COLOURCLASS, orderproduct.getColourclass());
		paramMap.put(APIConstant.P_STYLECODE, orderproduct.getStylecode());
		paramMap.put(APIConstant.P_STYLECLASS, orderproduct.getStyleclass());
		paramMap.put(APIConstant.P_SERVICEFEE, orderproduct.getServicefee());
		paramMap.put(APIConstant.P_BOUNSPOINTSGAINED, orderproduct.getBonuspointsgained());
		paramMap.put(APIConstant.P_OFFSHOREDELIVERYCHARGES, orderproduct.getOffshoredeliverycharges());
		paramMap.put(APIConstant.P_DISCOUNT, orderproduct.getDiscountamount());
		paramMap.put(APIConstant.P_PRODUCTNAME, orderproduct.getProductname());
		paramMap.put(APIConstant.P_RECEIVERNAME, orderproduct.getReceivername());
		paramMap.put(APIConstant.P_ADDRESSID, orderproduct.getAddressid());
		paramMap.put(APIConstant.P_SELLINGPRICE, orderproduct.getSellingprice());
		paramMap.put(APIConstant.P_INVOICETYPE, orderproduct.getInvoicetype());
		paramMap.put(APIConstant.P_TAXTYPE, orderproduct.getTaxtype());
		paramMap.put(APIConstant.P_PAYMENTMODEID, orderproduct.getPaymentmodeid());
		paramMap.put(APIConstant.P_INVOICETITLE, orderproduct.getInvoicetitle());
		paramMap.put(APIConstant.P_COMPANYNO, orderproduct.getCompanyno());
		paramMap.put(APIConstant.P_INVOICERECEIVERNAME, orderproduct.getInvoicereceivername());
		paramMap.put(APIConstant.P_INSTRUCTIONTOSCM, orderproduct.getInstructiontoscm());
		paramMap.put(APIConstant.P_ORDER_DESC, orderproduct.getOrderdesc());
		paramMap.put(APIConstant.P_ISPROMOTIONALPRODUCT, orderproduct.getIspromotionalproduct());
		paramMap.put(APIConstant.P_STORECHAINID, orderproduct.getStorechainid());
		paramMap.put(APIConstant.P_STOREID, orderproduct.getStoreid());
		paramMap.put(APIConstant.P_SUBDELIVERYTYPE, orderproduct.getSubdeliverytype());
		paramMap.put(APIConstant.P_ISREPRINTED, orderproduct.getIsreprinted());
		paramMap.put(APIConstant.P_ISEINVOICE, orderproduct.getIseinvoice());

		orderedproductDao.createTempOrder(paramMap);
		java.math.BigDecimal rtncode = (java.math.BigDecimal) paramMap.get(APIConstant.SP_RI_RTNCODE);

		return rtncode.intValue();
	}

	@Override
	public int saveTempOrderPayment(ToafOrderedproduct orderproduct) {
		Map<String, Object> paramMap = new HashMap<String, Object>();

		paramMap.put(APIConstant.SP_ORDIERID, orderproduct.getOrderid());
		paramMap.put(APIConstant.SP_ISACNTFIRST, orderproduct.getIsacntfirst());
		paramMap.put(APIConstant.SP_ISHONGLIOK, orderproduct.getIshonglioK());
		paramMap.put(APIConstant.SP_ISPAYMENTMODEID, orderproduct.getPaymentmodeid());
		paramMap.put(APIConstant.SP_TRANSFERACCNO, orderproduct.getTransferaccno());
		orderedproductDao.createTempPayment(paramMap);
		java.math.BigDecimal rtncode = (java.math.BigDecimal) paramMap.get(APIConstant.SP_RI_RTNCODE);
		if (rtncode != null)
			return rtncode.intValue();
		return APIConstant.RTNCODE_APP_ERROR;

	}

	@Override
	public int createTempOrderPayment(ToafOrderedproduct orderproduct) {
		Map<String, Object> paramMap = new HashMap<String, Object>();

		paramMap.put(APIConstant.P_ORDERID, orderproduct.getOrderid());
		paramMap.put(APIConstant.P_PAYMENTMODEID, orderproduct.getPaymentmodeid());
		paramMap.put(APIConstant.P_TRANSFERACCNO, orderproduct.getTransferaccno());
		orderedproductDao.createOrderTempPayment(paramMap);
		java.math.BigDecimal rtncode = (java.math.BigDecimal) paramMap.get(APIConstant.SP_RI_RTNCODE);
		if (rtncode != null)
			return rtncode.intValue();
		return APIConstant.RTNCODE_APP_ERROR;
	}

	@Override
	public ToafOrderedproduct webLotteryBonusPay(ToafOrderedproduct orderproduct) {
		Map<String, Object> paramMap = new HashMap<String, Object>();

		paramMap.put(APIConstant.P_ORDERID, orderproduct.getOrderid());
		paramMap.put(APIConstant.P_ITEMID, orderproduct.getItemid());
		paramMap.put(APIConstant.P_USERID, orderproduct.getCreatedby());
		paramMap.put(APIConstant.P_PRODUCTPRICE, orderproduct.getSellingprice());
		orderedproductDao.createTempPayment(paramMap);
		java.math.BigDecimal R_PAYNEED = (java.math.BigDecimal) paramMap.get(APIConstant.R_PAYNEED);
		java.math.BigDecimal R_STATUS = (java.math.BigDecimal) paramMap.get(APIConstant.R_STATUS);
		if (R_PAYNEED != null)
			orderproduct.setPayneed(R_PAYNEED.doubleValue());
		if (R_STATUS != null)
			orderproduct.setRstatus(R_STATUS.intValue());

		return orderproduct;
	}

	@Override
	public ToafOrder createOrder(ToafOrder order) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.P_ORDERID, order.getOrderid());
		paramMap.put(APIConstant.P_CUSTOMERID, order.getCustomerid());
		paramMap.put(APIConstant.P_CALLATTENDEDBY, order.getCreatedby());
		paramMap.put(APIConstant.P_LOTTERYBONUS, order.getIslotterybonus());

		paramMap.put(APIConstant.P_SUBCHANNELID, order.getSubcharnelid());
		paramMap.put(APIConstant.P_AREACODE, order.getAreacode());
		paramMap.put(APIConstant.P_REFEREEID, order.getRefereeid());
		paramMap.put(APIConstant.P_REFEREETYPE, order.getRefereetype());

		orderedproductDao.createOrder(paramMap);
		java.math.BigDecimal P_RTN_PAYMENTAMOUNT = (java.math.BigDecimal) paramMap.get(APIConstant.P_RTN_PAYMENTAMOUNT);
		String P_RTN_CODE = (String) paramMap.get(APIConstant.P_RTN_CODE);
		String P_RTN_MSG = (String) paramMap.get(APIConstant.P_RTN_MSG);
		if (P_RTN_PAYMENTAMOUNT != null)
			order.setTotalorderamount(P_RTN_PAYMENTAMOUNT.doubleValue());
		order.setRtncode(P_RTN_CODE);
		order.setRtnmsg(P_RTN_MSG);

		return order;
	}

	@Override
	public ToafOrder postOrderReceivable(ToafOrder order) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.P_ORDERID, order.getOrderid());
		paramMap.put(APIConstant.P_CUSTOMERID, order.getCustomerid());
		paramMap.put(APIConstant.P_PAYERNAME, order.getPayername());
		paramMap.put(APIConstant.P_RECEIPTNO, order.getReceiptno());
		orderedproductDao.postOrderReceivable(paramMap);
		java.math.BigDecimal P_RTN_CODE = (java.math.BigDecimal) paramMap.get(APIConstant.P_RTN_CODE);
		String P_RTN_MSG = (String) paramMap.get(APIConstant.P_RTN_MSG);
		if (P_RTN_CODE != null)
			order.setRtncode(P_RTN_CODE.toString());
		order.setRtnmsg(P_RTN_MSG);
		return order;
	}

	@Override
	public int modifyAddressExtraInfo(ToafAddressextrainfo addressextrainfo) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_V_CUSTID, addressextrainfo.getCustomerid());
		paramMap.put(APIConstant.SP_V_ADDRESSID, addressextrainfo.getAddressid());
		paramMap.put(APIConstant.SP_V_RECEIVERNAME, addressextrainfo.getReceivername());
		paramMap.put(APIConstant.SP_V_CREATEDBY, addressextrainfo.getCreatedby());
		addressextrainfoDao.modifyAddressExtraInfo(paramMap);
		java.math.BigDecimal rtncode = (java.math.BigDecimal) paramMap.get(APIConstant.SP_RTN_CODE);
		if (rtncode != null)
			return rtncode.intValue();
		return APIConstant.RTNCODE_APP_ERROR;
	}

	@Override
	public ToafAddressextrainfo queryAddressextrainfo(ToafAddressextrainfoKey key) {
		// TODO Auto-generated method stub
		return addressextrainfoDao.selectByPrimaryKey(key);
	}

	@Override
	public List<CustomerOrderInfo> selectCustomerOrderInfo(CustomerOrderInfo orderinfo) {

		return orderedproductDao.selectCustomerOrderInfo(orderinfo);
	}

	@Override
	public List<TscmOrderreasoninfo> selectOrderreasoninfo(TscmOrderreasoninfo orderreasoninfo) {
		// TODO Auto-generated method stub
		return orderedproductDao.selectOrderreasoninfo(orderreasoninfo);
	}

	@Override
	public CustomerOrderInfo useOrderCoupons(CustomerOrderInfo orderinfo) {

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.P_ORDERID, orderinfo.getOrderid());
		paramMap.put(APIConstant.P_COUPONNUMBER, orderinfo.getCouponnumber());
		paramMap.put(APIConstant.P_COUPONTYPE, orderinfo.getCoupontype());
		paramMap.put(APIConstant.P_COUPONGROUPNUMBER, orderinfo.getCoupongroupnumber());
		paramMap.put(APIConstant.P_USAGE, orderinfo.getUsage());
		paramMap.put(APIConstant.P_OFFERVALUE_PERCENT, orderinfo.getOffervaluepercent());
		paramMap.put(APIConstant.P_OFFERVALUE, orderinfo.getOffervalue());
		paramMap.put(APIConstant.P_CUSTOMERID, orderinfo.getCustomerid());
		paramMap.put(APIConstant.P_CALLATTENDEDBY, orderinfo.getCreatedby());
		paramMap.put(APIConstant.P_PRODUCTID, orderinfo.getProductid());
		paramMap.put(APIConstant.P_PRODUCTVERSION, orderinfo.getProductversion());
		paramMap.put(APIConstant.P_SELLINGPRICE, orderinfo.getProductamount());
		paramMap.put(APIConstant.P_QTY, orderinfo.getQuantity());
		orderedproductDao.offerInsert(paramMap);
		java.math.BigDecimal rtncode = (java.math.BigDecimal) paramMap.get(APIConstant.RTN_CODE);
		String rtnmsg = (String) paramMap.get(APIConstant.RTN_MSG);
		if (rtncode != null)
			orderinfo.setRtncode(rtncode.intValue());
		orderinfo.setRtnmsg(rtnmsg);
		return orderinfo;
	}

	@Override
	public CustomerOrderInfo cancelCustomerOrder(CustomerOrderInfo orderinfo) throws Exception {
		List<CustomerOrderInfo> list = orderedproductDao.selectCustomerOrderInfo(orderinfo);
		if (list != null && list.size() > 0) {
			CustomerOrderInfo customerOrderInfo = list.get(0);
			System.out.println(customerOrderInfo.getOrderstatus() + " " + customerOrderInfo.getOrderid());
			if (customerOrderInfo.getOrderstatus() == APIConstant.ORDER_STATUS_HANDLE
					|| customerOrderInfo.getOrderstatus() == APIConstant.ORDER_STATUS_WATING) {

				customerOrderInfo.setCreatedby(orderinfo.getCreatedby());
				customerOrderInfo.setRemarks(orderinfo.getRemarks());
				customerOrderInfo.setPrimarycancelreason(orderinfo.getPrimarycancelreason());
				customerOrderInfo.setSecondarycancelreason(orderinfo.getSecondarycancelreason());

				String apiType = APIConstant.CANCELPRODUCTAPI;
				String WSType = configInfo.getErp_cancel_product_ws_name().trim();
				String retk = ConnectET1Util.erpReturnResult(configInfo.getErpws(), apiType, WSType,
						APIConstant.CUSTOMERORDERINFO, new CustomerOrderInfo(), customerOrderInfo);

				if (retk == null || APIConstant.RETURN_SUCCESS_FROM_ET1.equals(retk)) {
					orderinfo.setRtncode(APIConstant.RETURN_OK);
				} else {
					orderinfo.setRtncode(APIConstant.RETURN_FAILED);
				}
				orderinfo.setRtnmsg(retk);

			} else {
				orderinfo.setRtncode(APIConstant.RETURN_CANNOT_CANCEL_ORDER);
				orderinfo.setRtnmsg(APIConstant.RETURN_CANNOT_CANCEL_ORDER_MESSAGE);
			}
		} else {
			orderinfo.setRtncode(APIConstant.RETURN_NO_DATA);
			orderinfo.setRtnmsg(APIConstant.RETURN_NO_DATA_MESSAGE);
		}

		return orderinfo;
	}

	@Override
	public CustomerOrderInfo acceptReturnable(CustomerOrderInfo orderinfo) throws Exception {
		List<CustomerOrderInfo> customerorderinfoes = orderedproductDao.selectCustomerOrderInfo(orderinfo);
		if (customerorderinfoes != null && customerorderinfoes.size() > 0) {
			Integer returntype = orderinfo.getReturntype();
			Integer returnreason1 = orderinfo.getReturnreason1();
			Integer returnreason2 = orderinfo.getReturnreason2();
			Long createdby = orderinfo.getCreatedby();
			orderinfo = customerorderinfoes.get(0);
			Integer orderstatus = orderinfo.getOrderstatus();
			if (orderstatus != null) {
				// 出货进行中||出货确认||配送确认
				if (orderstatus == IOAFDomainConstants.ORDER_STATUS_SHIPPING_IN_PROGRESS
						|| orderstatus == IOAFDomainConstants.ORDER_STATUS_SHIPPING_CONFIRMED
						|| orderstatus == IOAFDomainConstants.ORDER_STATUS_DELIVERY_CONFIRMED) {
					orderinfo.setReturntype(returntype);
					orderinfo.setReturnreason1(returnreason1);
					orderinfo.setReturnreason2(returnreason2);
					orderinfo.setCreatedby(createdby);
					orderinfo.setLastmodifiedtimestamp(new Date());
					orderinfo.setReturnqty(IOAFConstants.RETURN_PRODUCT_RETURNQTY_DEFAULT);

					String erpwsurl = configInfo.getErpws();
					String WSType = configInfo.getErp_return_product_ws_name();
					String apiType = IOAFConstants.RETURN_PRODUCT_APITYPE;
					String beanName = IOAFConstants.RETURN_PRODUCT_BEANNAME;
					String retk = ConnectET1Util.erpReturnResult(erpwsurl, apiType, WSType, beanName,
							new CustomerOrderInfo(), orderinfo);
					if (retk != null) {
						if (APIConstant.RETURN_SUCCESS_FROM_ET1.equals(retk)) {
							orderinfo.setRtncode(APIConstant.RTNCODE_OK);
						} else {
							orderinfo.setRtncode(APIConstant.RTNCODE_FAIL);
							orderinfo.setRtnmsg(retk);
						}
					}
				} else {
					orderinfo.setRtncode(APIConstant.RTNCODE_INFEASIBLE);
				}
			}
		} else {
			orderinfo.setRtncode(APIConstant.RTNCODE_NO_DATA);// 没有该订单
		}
		return orderinfo;
	}

	@Override
	public CustomerOrderInfo shipConfirmable(CustomerOrderInfo orderinfo) throws Exception {
		List<CustomerOrderInfo> customerorderinfoes = orderedproductDao.selectCustomerOrderInfo(orderinfo);
		if (customerorderinfoes != null && customerorderinfoes.size() > 0) {

			String deliveryorderid = orderinfo.getDeliveryorderid();
			Long selectedcarrier = orderinfo.getSelectedcarrier();
			Long createdby = orderinfo.getCreatedby();
			Date actualshippeddate = orderinfo.getActualshippeddate();

			orderinfo = customerorderinfoes.get(0);

			Integer deliverytype = orderinfo.getDeliverytype();
			Integer orderstatus = orderinfo.getOrderstatus();

			// 指送 出货进行中
			if (deliverytype == IOAFDomainConstants.DELIVERYTYPE_DIRECT
					&& orderstatus == IOAFDomainConstants.ORDER_STATUS_SHIPPING_IN_PROGRESS) {

				if (isOverdueOrNot(orderinfo)) {
					orderinfo.setRtncode(APIConstant.SHIP_CONFIRM_OVER_DUE);
				} else {
					orderinfo.setDeliveryorderid(deliveryorderid);
					orderinfo.setSelectedcarrier(selectedcarrier);
					orderinfo.setCreatedby(createdby);
					// orderinfo.setActualshippeddate(actualshippeddate);
					orderinfo.setWsdate(DateUtil.getDateYyyyMmDd(actualshippeddate));
					String erpwsurl = configInfo.getErpws();
					String WSType = configInfo.getErp_customer_ship_order_ws_name();
					String apiType = IOAFConstants.SHIP_CONFIRM_APITYPE;
					String beanName = IOAFConstants.SHIP_CONFIRM_BEANNAME;
					String retk = ConnectET1Util.erpReturnResult(erpwsurl, apiType, WSType, beanName,
							new CustomerOrderInfo(), orderinfo);
					if (retk != null) {
						if (APIConstant.RETURN_SUCCESS_FROM_ET1.equals(retk)) {
							orderinfo.setRtncode(APIConstant.RTNCODE_OK);
						} else {
							orderinfo.setRtncode(APIConstant.RTNCODE_FAIL);
							orderinfo.setRtnmsg(retk);
						}
					}
				}
			} else {
				if (deliverytype == IOAFDomainConstants.DELIVERYTYPE_DIRECT
						&& orderstatus == IOAFDomainConstants.ORDER_STATUS_SHIPPING_CONFIRMED) {
					orderinfo.setRtncode(APIConstant.RTNCODE_OK);
				} else {
					orderinfo.setRtncode(APIConstant.RTNCODE_INFEASIBLE);
				}
			}

		} else {
			orderinfo.setRtncode(APIConstant.RTNCODE_NO_DATA);
		}
		return orderinfo;
	}

	@Override
	public CustomerOrderInfo exchangeProductable(CustomerOrderInfo orderinfo) throws Exception {
		List<CustomerOrderInfo> customerorderinfoes = orderedproductDao.selectCustomerOrderInfo(orderinfo);
		if (customerorderinfoes != null && customerorderinfoes.size() > 0) {
			Integer returntype = orderinfo.getReturntype();
			Integer returnreason1 = orderinfo.getReturnreason1();
			Integer returnreason2 = orderinfo.getReturnreason2();
			Long createdby = orderinfo.getCreatedby();
			Integer colourcode = orderinfo.getColourcode();
			Integer colourclass = orderinfo.getColourclass();
			Integer stylecode = orderinfo.getStylecode();
			Integer styleclass = orderinfo.getStyleclass();
			orderinfo = customerorderinfoes.get(0);
			Integer orderstatus = orderinfo.getOrderstatus();
			// 订单受理、等待出货、订单取消时不能换货
			if (orderstatus != IOAFDomainConstants.ORDER_STATUS_ORDER_ACCEPTED
					&& orderstatus != IOAFDomainConstants.ORDER_STATUS_READY_FOR_SHIPPING
					&& orderstatus != IOAFDomainConstants.ORDER_STATUS_ORDER_CANCELLED) {
				orderinfo.setReturntype(returntype);
				orderinfo.setReturnreason1(returnreason1);
				orderinfo.setReturnreason2(returnreason2);
				orderinfo.setCreatedby(createdby);
				orderinfo.setLastmodifiedtimestamp(new Date());
				orderinfo.setColourcode(colourcode);
				orderinfo.setColourclass(colourclass);
				orderinfo.setStylecode(stylecode);
				orderinfo.setStyleclass(styleclass);
				orderinfo.setReturnqty(IOAFConstants.EXCHANGE_PRODUCT_RETURNQTY_DEFAULT);
				orderinfo.setProductversion(SCMConstant.SCM_PRODUCT_START_VERSION);

				String erpwsurl = configInfo.getErpws();
				String WSType = configInfo.getErp_return_product_ws_name();
				String apiType = IOAFConstants.EXCHANGE_PRODUCT_APITYPE;
				String beanName = IOAFConstants.EXCHANGE_PRODUCT_BEANNAME;
				String retk = ConnectET1Util.erpReturnResult(erpwsurl, apiType, WSType, beanName,
						new CustomerOrderInfo(), orderinfo);
				if (retk != null) {
					if (APIConstant.RETURN_SUCCESS_FROM_ET1.equals(retk)) {
						orderinfo.setRtncode(APIConstant.RTNCODE_OK);
					} else {
						orderinfo.setRtncode(APIConstant.RTNCODE_FAIL);
						orderinfo.setRtnmsg(retk);
					}
				}
			} else {
				orderinfo.setRtncode(APIConstant.RTNCODE_INFEASIBLE);
			}
		} else {
			orderinfo.setRtncode(APIConstant.RTNCODE_NO_DATA);
		}
		return orderinfo;
	}

	@Override
	public CustomerOrderInfo deleveryConfirmOrAbort(CustomerOrderInfo orderinfo) throws Exception {
		String apiType = null;
		String WSType = null;
		String retk = null;
		List<CustomerOrderInfo> list = selectCustomerOrderInfo(orderinfo);
		if (list != null && list.size() > 0) {
			CustomerOrderInfo customerOrderInfo = list.get(0);
			boolean flag = isOverdueOrNot(customerOrderInfo);

			if (flag == true && ((orderinfo.getDeleverystatus() != null
					&& orderinfo.getDeleverystatus() == APIConstant.ORDER_SHIP_CONFIRM)
					|| (orderinfo.getDeleverystatus() != null
							&& orderinfo.getDeleverystatus() == APIConstant.ORDER_SHIP_ABORT))) {
				customerOrderInfo.setCreatedby(orderinfo.getCreatedby());
				customerOrderInfo.setReasoncode(orderinfo.getReasoncode());
				customerOrderInfo.setRemarks(orderinfo.getRemarks());
				apiType = APIConstant.REASONINFOAPI;
				WSType = configInfo.getErp_customer_ship_order_ws_name().trim();
				retk = ConnectET1Util.erpReturnResult(configInfo.getErpws(), apiType, WSType,
						APIConstant.CUSTOMERORDERINFO, new CustomerOrderInfo(), customerOrderInfo);
			}
			if (customerOrderInfo.getOrderstatus() == APIConstant.ORDER_STATUS_DELEVERY_CONFIRM) {
				// 配送确认
				if (orderinfo.getDeleverystatus() != null
						&& orderinfo.getDeleverystatus() == APIConstant.ORDER_SHIP_CONFIRM) {
					customerOrderInfo.setCreatedby(orderinfo.getCreatedby());

					// customerOrderInfo.setActualdeliverydate(DateUtil.getTodayTime());
					customerOrderInfo.setWsdate(DateUtil.convertDateToString(DateUtil.YYYY_MM_DD, new Date()));

					apiType = APIConstant.CONFIRMCUSTOMERSHIPORDERAPI;
					// 配送终止
				} else if (orderinfo.getDeleverystatus() != null
						&& orderinfo.getDeleverystatus() == APIConstant.ORDER_SHIP_ABORT) {
					customerOrderInfo.setCreatedby(orderinfo.getCreatedby());
					customerOrderInfo.setDeliveryresult(APIConstant.DELIVERY_RESULT);
					// customerOrderInfo.setActualshippeddate(DateUtil.getTodayTime());
					customerOrderInfo.setWsdate(DateUtil.convertDateToString(DateUtil.YYYY_MM_DD, new Date()));

					apiType = APIConstant.FAILURECUSTOMERSHIPORDERAPI;
					// 逾期处理
				} else {
					customerOrderInfo.setCreatedby(orderinfo.getCreatedby());
					customerOrderInfo.setReasoncode(orderinfo.getReasoncode());
					customerOrderInfo.setRemarks(orderinfo.getRemarks());
					apiType = APIConstant.REASONINFOAPI;
				}
				WSType = configInfo.getErp_customer_ship_order_ws_name().trim();
				retk = ConnectET1Util.erpReturnResult(configInfo.getErpws(), apiType, WSType,
						APIConstant.CUSTOMERORDERINFO, new CustomerOrderInfo(), customerOrderInfo);

				if (retk == null || APIConstant.RETURN_SUCCESS_FROM_ET1.equals(retk)) {
					orderinfo.setRtncode(APIConstant.RETURN_OK);
				} else {
					orderinfo.setRtncode(APIConstant.RETURN_FAILED);
				}
				orderinfo.setRtnmsg(retk);

			} else {
				if (customerOrderInfo.getOrderstatus() == APIConstant.ORDER_SHIP_CONFIRM) {
					orderinfo.setRtncode(APIConstant.DELIVERY_CONFIRMED);
				} else {
					if (customerOrderInfo.getOrderstatus() == APIConstant.ORDER_SHIP_ABORT) {
						orderinfo.setRtncode(APIConstant.DELIVERY_FAILED);
					} else {
						orderinfo.setRtncode(APIConstant.RETURN_IS_NOT_DELEVERY_STATUS);
						orderinfo.setRtnmsg(APIConstant.RETURN_IS_NOT_DELEVERY_STATUS_MESSAGE);
					}

				}
			}

		} else {
			orderinfo.setRtncode(APIConstant.RETURN_NO_DATA);
			orderinfo.setRtnmsg(APIConstant.RETURN_NO_DATA_MESSAGE);
		}

		return orderinfo;
	}

	@Override
	public CustomerOrderInfo orderRefundAbortOrStorageOrOverdue(CustomerOrderInfo orderinfo, int type)
			throws Exception {
		String apiType = null;
		List<CustomerOrderInfo> list = selectCustomerOrderInfo(orderinfo);
		if (list != null && list.size() > 0) {
			CustomerOrderInfo customerOrderInfo = list.get(0);
			apiType = APIConstant.RETURNREASONINFOAPI;// 客户寄回

			customerOrderInfo.setCreatedby(orderinfo.getCreatedby());
			// customerOrderInfo.setActualshippeddate(DateUtil.getTodayTime());
			customerOrderInfo.setWsdate(DateUtil.convertDateToString(DateUtil.YYYY_MM_DD, new Date()));
			customerOrderInfo.setReasoncode(orderinfo.getReasoncode());
			customerOrderInfo.setRemarks(orderinfo.getRemarks());

			String WSType = configInfo.getErp_return_order_for_supplier_ws_name().trim();
			String retk = ConnectET1Util.erpReturnResult(configInfo.getErpws(), apiType, WSType,
					APIConstant.CUSTOMERORDERINFO, new CustomerOrderInfo(), customerOrderInfo);

			CustomerOrderInfo customerOrderInfo1 = null;
			if (type != 2) {
				List<CustomerOrderInfo> list1 = selectCustomerOrderInfo(orderinfo);
				customerOrderInfo1 = list1.get(0);
				customerOrderInfo1.setCreatedby(orderinfo.getCreatedby());
				// customerOrderInfo1.setActualshippeddate(DateUtil.getTodayTime());
				customerOrderInfo1.setWsdate(DateUtil.convertDateToString(DateUtil.YYYY_MM_DD, new Date()));
				customerOrderInfo1.setReasoncode(orderinfo.getReasoncode());
				customerOrderInfo1.setRemarks(orderinfo.getRemarks());
			}

			if (type == 0) {
				customerOrderInfo1.setDeleverystatus(orderinfo.getDeleverystatus());
				apiType = APIConstant.RETURNFAILABORTREJECTAPI;// 销退终止
			} else if (type == 1) {
				apiType = APIConstant.RETURNCONFIRMAPI;// 销退入库
			} else {
				if (retk == null || APIConstant.RETURN_SUCCESS_FROM_ET1.equals(retk)) {
					orderinfo.setRtncode(APIConstant.RETURN_OK);
				} else {
					orderinfo.setRtncode(APIConstant.RETURN_FAILED);
				}
				orderinfo.setRtnmsg(retk);
				return orderinfo;
			}

			retk = ConnectET1Util.erpReturnResult(configInfo.getErpws(), apiType, WSType, APIConstant.CUSTOMERORDERINFO,
					new CustomerOrderInfo(), customerOrderInfo1);

			if (retk == null || APIConstant.RETURN_SUCCESS_FROM_ET1.equals(retk)) {
				orderinfo.setRtncode(APIConstant.RETURN_OK);
			} else {
				orderinfo.setRtncode(APIConstant.RETURN_FAILED);
			}
			orderinfo.setRtnmsg(retk);

		} else {
			orderinfo.setRtncode(APIConstant.RETURN_NO_DATA);
			orderinfo.setRtnmsg(APIConstant.RETURN_NO_DATA_MESSAGE);
		}

		return orderinfo;
	}

	@Override
	public boolean isOverdueOrNot(CustomerOrderInfo orderinfo) {
		boolean flag = false;
		Date scheduleddeliverydate = orderinfo.getScheduleddeliverydate();
		Date currDate = new Date();
		String pattern = DateUtil.YYYY_MM_DD_HH_MM_SS;

		String scheduleddeliverydate1 = DateUtil.convertDateToString(pattern, scheduleddeliverydate);
		String currDate1 = DateUtil.convertDateToString(pattern, currDate);

		int result = scheduleddeliverydate1.compareTo(currDate1);
		if (result < 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public ToafOrderinvoiceinfo checkInvoice(ToafOrderinvoiceinfo orderinvoice) throws Exception {
		logger.info("发票核销");
		CustomerOrderInfo orderInfo = null;
		Integer invoiceStatus = null;
		ToafOrderinvoiceinfo orderInvoiceInfo = null;
		ToafOrderinvoiceinfoExample example = new ToafOrderinvoiceinfoExample();
		ToafOrderinvoiceinfoExample.Criteria criteria = example.createCriteria();
		criteria.andOrderidEqualTo(orderinvoice.getOrderid());
		criteria.andItemidEqualTo(orderinvoice.getItemid());

		List<ToafOrderinvoiceinfo> orderInvoiceInfoes = orderInvoiceDAO.selectByExample(example);
		if (orderInvoiceInfoes != null && orderInvoiceInfoes.size() > 0) {
			orderInvoiceInfo = orderInvoiceInfoes.get(0);
			invoiceStatus = orderInvoiceInfo.getInvoicestatus();

			if (invoiceStatus == APIConstant.ORDER_INVOICE_STATUS) {
				Long orderId = orderInvoiceInfo.getOrderid();
				Integer itemId = orderInvoiceInfo.getItemid();
				Long customerId = orderInvoiceInfo.getCustomerid();
				orderInfo = new CustomerOrderInfo();
				orderInfo.setOrderid(orderId);
				orderInfo.setItemid(itemId);
				orderInfo.setCustomerid(customerId);
				orderInfo.setCreatedby(orderinvoice.getCreatedby());

				String apiType = APIConstant.ORIDERINVOICRETURNAPI;// 发票核销
				String WSType = configInfo.getErp_order_invoice_ws_name().trim();
				String retk = ConnectET1Util.erpReturnResult(configInfo.getErpws(), apiType, WSType,
						APIConstant.CUSTOMERORDERINFO, new CustomerOrderInfo(), orderInfo);

				if (retk == null || APIConstant.ORDER_INVOICE_HANDLE_RESULT.equals(retk)) {
					orderInvoiceInfo.setRtncode(APIConstant.RETURN_OK);
				} else {
					orderInvoiceInfo.setRtncode(APIConstant.RETURN_FAILED);
				}
				orderInvoiceInfo.setRtnmsg(retk);

			} else {
				orderInvoiceInfo.setRtncode(APIConstant.ORDER_INVOICE_STATUS_IS_NOT_ISSUE);
				orderInvoiceInfo.setRtnmsg(APIConstant.ORDER_INVOICE_STATUS_IS_NOT_ISSUE_MESSAGE);
			}

		} else {
			return orderInvoiceInfo;
		}

		return orderInvoiceInfo;
	}

	@Override
	public List<CustomerOrderPayment> selectCustomerOrderPay(CustomerOrderPayment orderinfo) {

		return orderedproductDao.selectCustomerOrderPay(orderinfo);
	}

	@Override
	public ToafPostacknowledgement postCustomerOrderPay(ToafPostacknowledgement orderpost) {

		if (postacknowledgementDAO.countOrderPost(orderpost) > 0) {
			orderpost.setRtncode(APIConstant.RTNCODE_INFEASIBLE + "");
			return orderpost;
		}

		ToafOrderpayment orderpayment = new ToafOrderpayment();
		orderpayment.setOrderid(orderpost.getOrderid());
		orderpayment.setCustomerid(orderpost.getCustomerid());
		orderpayment.setPaymentstatus(APIConstant.Payment_Pending);
		orderpayment.setPaymentmodeid(APIConstant.PaymentMode_Post);

		if (orderpaymentMapperDAO.countByOrderPayment(orderpayment) == 0) {
			orderpost.setRtncode(APIConstant.RTNCODE_NO_DATA + "");
			return orderpost;
		}

		Double needpaymentamount = orderpaymentMapperDAO.sumByExample(orderpayment);

		Double paymentamount = orderpost.getAmountreceived();
		if (needpaymentamount == null || paymentamount == null || needpaymentamount.doubleValue() <= 0
				|| paymentamount.doubleValue() <= 0 || needpaymentamount.doubleValue() != paymentamount.doubleValue()) {
			orderpost.setRtncode(APIConstant.RTNCODE_FAIL + "");
			return orderpost;
		}

		orderpost.setBatchstatus(APIConstant.API_YES);
		orderpost.setEntrydate(DateUtil.getTodayTime());
		orderpost.setTransferdate(DateUtil.getTodayTime());
		orderpost.setCreatedtimestamp(DateUtil.getTodayTime());
		orderpost.setLastmodifiedtimestamp(DateUtil.getTodayTime());
		orderpost.setLastmodifiedby(orderpost.getCreatedby());
		orderpost.setMatchedtoorder(APIConstant.API_I);
		orderpost.setIsvalid(APIConstant.API_YES);
		orderpost.setRtncode(postacknowledgementDAO.insertSelective(orderpost) + "");

		return orderpost;
	}

	@Override
	public OrderPaymentDTO changeOrderPayment(OrderPayment orderpay) {
		OrderPaymentDTO dto = new OrderPaymentDTO();

		Long orderid = orderpay.getOrderid();
		Integer itemid = orderpay.getItemid();
		Long customerid = orderpay.getCustomerid();
		Double paymentamount = 0.0;
		Double orderpaymount = 0.0;
		Double dou = 0.0;
		ToafOrderedproductKey key = new ToafOrderedproductKey();
		key.setOrderid(orderid);
		key.setItemid(itemid);
		ToafOrderedproduct orderproduct = orderedproductDao.selectByPrimaryKey(key);
		if (orderproduct == null) {
			dto.setRtncode(APIConstant.RTNCODE_NO_DATA);
			return dto;
			// 不存在
		}
		if (!orderproduct.getCustomerid().equals(customerid)) {
			// 客代与订单不符
			dto.setRtncode(APIConstant.RTNCODE_ERROR_CUSTOMERID);
			return dto;
		}

		if (orderproduct.getOrderstatus() != IOAFDomainConstants.ORDER_STATUS_ORDER_ACCEPTED) {
			// 订单状态不是，订单受理
			dto.setRtncode(APIConstant.RTNCODE_ERROR_ORDERSTATUS);
			return dto;
		}
		dou = Arith.sub(orderproduct.getProductamount(), orderpay.getProductamount());
		if (dou.doubleValue() != 0) {
			// 订单金额与冲账金额不符
			dto.setRtncode(APIConstant.RTNCODE_ERROR_ORDERPRODUCTAMOUNT);
			return dto;
		}

		ToafOrderpaymentExample example = new ToafOrderpaymentExample();
		ToafOrderpaymentExample.Criteria criteria = example.createCriteria();
		criteria.andOrderidEqualTo(orderid);
		criteria.andItemidEqualTo(itemid);
		List<Integer> values = new ArrayList<Integer>();
		values.add(IOAFDomainConstants.PAYMENT_STATUS_PAYMENT_PENDING);
		values.add(IOAFDomainConstants.PAYMENT_STATUS_PAYMENT_OFFSET);
		criteria.andPaymentstatusIn(values);
		List<ToafOrderpayment> oldpayments = orderpaymentMapperDAO.selectByExample(example);
		for (ToafOrderpayment oldpayment : oldpayments) {
			paymentamount += oldpayment.getPaymentamount();
		}
		dou = Arith.sub(orderpay.getProductamount(), paymentamount);
		if (dou.doubleValue() != 0) {
			// 订单金额与冲账金额不符

			dto.setRtncode(APIConstant.RTNCODE_ERROR_ORDERPRODUCTAMOUNT);
			return dto;
		}
		Double EFFECTIVEBALANCE_CASH = 0.0D, EFFECTIVEBALANCE_CERT_PICKUP = 0.0D;
		int Cash_PayFlag = 1000;
		int Cert_Pickup_PayFlag = 1000;
		TcrmCustomeraccountbalanceExample accountexample = new TcrmCustomeraccountbalanceExample();
		TcrmCustomeraccountbalanceExample.Criteria accountcriteria = accountexample.createCriteria();
		accountcriteria.andCustomeridEqualTo(orderpay.getCustomerid());
		List<TcrmCustomeraccountbalance> custmaccounts = customeraccountbalanceMapperDAO
				.selectByExample(accountexample);// 客户账户
		for (TcrmCustomeraccountbalance custmaccount : custmaccounts) {
			switch (custmaccount.getAccounttypeid()) {
			case IOAFDomainConstants.ACCOUNT_TYPE_CASH:// 现金
				EFFECTIVEBALANCE_CASH += custmaccount.getEffectivebalance();

				break;
			case IOAFDomainConstants.ACCOUNT_TYPE_CERT_PICKUP:// 会员卡
				EFFECTIVEBALANCE_CERT_PICKUP += custmaccount.getEffectivebalance();
				break;
			default:
				break;
			}
		}
		List<OrderPaymentMode> paymentmodes = orderpay.getPaymentmodes();
		for (OrderPaymentMode payment : paymentmodes) {
			orderpaymount += payment.getPaymentamount();
			switch (payment.getPaymentmodeid()) {
			case IOAFDomainConstants.PAYMENT_MODE_CASH:// 现金
				if (Arith.sub(EFFECTIVEBALANCE_CASH, payment.getPaymentamount()) >= 0)
					Cash_PayFlag = 1001;
				else
					Cash_PayFlag = 1002;
				break;
			case IOAFDomainConstants.PAYMENT_MODE_PICKUP_CERTIFICATE:// 会员卡
				if (Arith.sub(EFFECTIVEBALANCE_CERT_PICKUP, payment.getPaymentamount()) >= 0)
					Cert_Pickup_PayFlag = 1001;
				else
					Cert_Pickup_PayFlag = 1002;
				break;
			default:
				break;
			}
		}

		if ((Arith.sub(orderpay.getProductamount(), orderpaymount) != 0)) {

			dto.setRtncode(APIConstant.RTNCODE_ERROR_ORDERDDETAIL);
			return dto;// 明细金额与头金额不同

		}

		if (Cert_Pickup_PayFlag == 1002 || Cash_PayFlag == 1002) {

			dto.setRtncode(APIConstant.RTNCODE_ERROR_NOT_ENOUGH);
			return dto;// 账户金额不足

		}

		for (ToafOrderpayment oldpayment : oldpayments) {
			TcrmCusttransactiondetails custtransactiondetails = new TcrmCusttransactiondetails();
			custtransactiondetails.setCustomerid(oldpayment.getCustomerid());
			custtransactiondetails.setReferencevalue(oldpayment.getOrderid());
			custtransactiondetails.setCompanyid(orderproduct.getCompanyid());
			custtransactiondetails.setTransactionamount(oldpayment.getRecievedamount());
			custtransactiondetails.setTransactiondate(DateUtil.getToday().getTime());
			custtransactiondetails.setCreditdebitflg(IOAFDomainConstants.BONUS_POINTS_BATCH_TYPE_ADD_STR);
			custtransactiondetails.setCreatedby(orderpay.getCreatedby());
			custtransactiondetails.setLastmodifiedby(orderpay.getCreatedby());
			custtransactiondetails.setProductid(orderproduct.getProductid());
			custtransactiondetails.setMulticodeid(orderproduct.getMulticodeid());
			custtransactiondetails.setOrderid(orderid);
			custtransactiondetails.setItemid(itemid);
			// custtransactiondetails.setExceptiondesc(orderpay.getExceptiondesc());
			switch (oldpayment.getPaymentmodeid()) {
			case IOAFDomainConstants.PAYMENT_MODE_CASH:// 现金

				custtransactiondetails.setAccounttypeid(IOAFDomainConstants.ACCOUNT_TYPE_CASH);
				custtransactiondetails.setAccountnumber(IOAFDomainConstants.ACCOUNT_NUMBER_CASH);
				custtransactiondetails.setReferencetypeid(IOAFDomainConstants.REFERENCE_TYPE_ORDER);
				custtransactiondetails
						.setTransactiondetailsid(IOAFDomainConstants.TRANSACTION_DETAILS_PAYMENT_CANCEL_CASH);
				customerManageService.useOfAccountBalance(custtransactiondetails);

				break;
			case IOAFDomainConstants.PAYMENT_MODE_PICKUP_CERTIFICATE:// 会员卡

				custtransactiondetails.setAccounttypeid(IOAFDomainConstants.ACCOUNT_TYPE_CERT_PICKUP);
				custtransactiondetails.setAccountnumber(IOAFDomainConstants.ACCOUNT_NUMBER_PICKUP);
				custtransactiondetails.setReferencetypeid(IOAFDomainConstants.REFERENCE_TYPE_ORDER);
				custtransactiondetails
						.setTransactiondetailsid(IOAFDomainConstants.TRANSACTION_DETAILS_PAYMENT_CANCEL_PICKUP_CERTIF);

				customerManageService.useOfAccountBalance(custtransactiondetails);

				break;
			case IOAFDomainConstants.PAYMENT_MODE_POST:// 邮局
				break;
			default:
				break;
			}
			oldpayment.setPaymentchangereasoncode(orderpay.getPaymentchangereasoncode());
			oldpayment.setPaymentstatus(IOAFDomainConstants.OAF_PAYMENT_STATUS_CANCELLED);
			oldpayment.setLastmodifiedby(orderpay.getCreatedby());
			oldpayment.setLastmodifiedtimestamp(DateUtil.getToday().getTime());
			orderpaymentMapperDAO.updateByPrimaryKeySelective(oldpayment);

		}

		for (OrderPaymentMode payment : paymentmodes) {
			ToafOrderpayment orderpayment = new ToafOrderpayment();
			orderpayment.setCustomerid(orderpay.getCustomerid());
			orderpayment.setOrderid(orderpay.getOrderid());
			orderpayment.setItemid(orderpay.getItemid());
			orderpayment.setIsattendbonusdeduct(APIConstant.API_NO);
			orderpayment.setIsinstallmentformat(APIConstant.API_NO);
			orderpayment.setCreatedby(orderpay.getCreatedby());
			orderpayment.setCreatedtimestamp(DateUtil.getTodayTime());
			orderpayment.setLastmodifiedby(orderpay.getCreatedby());
			orderpayment.setLastmodifiedtimestamp(DateUtil.getTodayTime());
			TcrmCusttransactiondetails custtransactiondetails = new TcrmCusttransactiondetails();
			custtransactiondetails.setCustomerid(orderpay.getCustomerid());
			custtransactiondetails.setReferencevalue(orderpay.getOrderid());
			custtransactiondetails.setCompanyid(orderproduct.getCompanyid());

			custtransactiondetails.setTransactiondate(DateUtil.getToday().getTime());
			custtransactiondetails.setCreditdebitflg(IOAFDomainConstants.BONUS_POINTS_BATCH_TYPE_SUBTRACTION_STR);
			custtransactiondetails.setCreatedby(orderpay.getCreatedby());
			custtransactiondetails.setLastmodifiedby(orderpay.getCreatedby());
			custtransactiondetails.setProductid(orderproduct.getProductid());
			custtransactiondetails.setMulticodeid(orderproduct.getMulticodeid());
			custtransactiondetails.setOrderid(orderid);
			custtransactiondetails.setItemid(itemid);
			custtransactiondetails.setExceptiondesc(orderpay.getExceptiondesc());
			switch (payment.getPaymentmodeid()) {
			case IOAFDomainConstants.PAYMENT_MODE_CASH:// 现金
				orderpayment.setPaymentamount(payment.getPaymentamount());
				orderpayment.setRecievedamount(payment.getPaymentamount());
				orderpayment.setPaymentstatus(IOAFDomainConstants.OAF_PAYMENT_STATUS_OFFSET);
				orderpayment.setActualpaymentdate(DateUtil.getToday().getTime());
				orderpayment.setPaymentmodeid(payment.getPaymentmodeid());
				orderpaymentMapperDAO.insertSelective(orderpayment);
				custtransactiondetails.setAccounttypeid(IOAFDomainConstants.ACCOUNT_TYPE_CASH);
				custtransactiondetails.setAccountnumber(IOAFDomainConstants.ACCOUNT_NUMBER_CASH);
				custtransactiondetails.setReferencetypeid(IOAFDomainConstants.REFERENCE_TYPE_ORDER);
				custtransactiondetails.setTransactiondetailsid(IOAFDomainConstants.TRANSACTION_DETAILS_PAYMENT_CASH);
				custtransactiondetails.setTransactionamount(payment.getPaymentamount());
				customerManageService.useOfAccountBalance(custtransactiondetails);

				break;
			case IOAFDomainConstants.PAYMENT_MODE_PICKUP_CERTIFICATE:// 会员卡
				orderpayment.setPaymentamount(payment.getPaymentamount());
				orderpayment.setRecievedamount(payment.getPaymentamount());
				orderpayment.setPaymentstatus(IOAFDomainConstants.OAF_PAYMENT_STATUS_OFFSET);
				orderpayment.setActualpaymentdate(DateUtil.getToday().getTime());

				orderpayment.setPaymentmodeid(payment.getPaymentmodeid());
				orderpaymentMapperDAO.insertSelective(orderpayment);

				custtransactiondetails.setAccounttypeid(IOAFDomainConstants.ACCOUNT_TYPE_CERT_PICKUP);
				custtransactiondetails.setAccountnumber(IOAFDomainConstants.ACCOUNT_NUMBER_PICKUP);
				custtransactiondetails.setReferencetypeid(IOAFDomainConstants.REFERENCE_TYPE_ORDER);
				custtransactiondetails
						.setTransactiondetailsid(IOAFDomainConstants.TRANSACTION_DETAILS_PAYMENT_PICKUP_CERTIFICATE);
				custtransactiondetails.setTransactionamount(payment.getPaymentamount());
				customerManageService.useOfAccountBalance(custtransactiondetails);
				break;
			case IOAFDomainConstants.PAYMENT_MODE_POST:// POS

				orderpayment.setPaymentamount(payment.getPaymentamount());
				orderpayment.setRecievedamount(0.0);
				orderpayment.setBalanceamount(payment.getPaymentamount());
				orderpayment.setPaymentstatus(IOAFDomainConstants.OAF_PAYMENT_STATUS_PENDING);
				orderpayment.setPaymentduedate(DateUtil.getDateADDDay(DateUtil.getToday().getTime(), 7));
				orderpayment.setPaymentmodeid(payment.getPaymentmodeid());
				orderpaymentMapperDAO.insertSelective(orderpayment);

				ToafPaybypost paybypost = new ToafPaybypost();
				paybypost.setPaymentid(orderpayment.getPaymentid());
				paybypost.setCompanyid(orderproduct.getCompanyid());
				paybypost.setOrderid(orderid);
				paybypost.setItemid(itemid);
				paybypost.setPayeename(payment.getPayeename());
				paybypost.setTransferaccno(payment.getTransferaccno());
				paybypost.setCreatedby(orderpay.getCreatedby());
				paybypost.setCreatedtimestamp(DateUtil.getToday().getTime());
				paybypost.setLastmodifiedby(orderpay.getCreatedby());
				paybypost.setLastmodifiedtimestamp(DateUtil.getToday().getTime());
				paybypost.setBankid(payment.getBankid());
				paybyPostMapperDAO.insertSelective(paybypost);

				break;

			case IOAFDomainConstants.PAYMENT_MODE_COD:// COD

				break;
			default:
				break;
			}

		}
		List<OrderPaymentModeDTO> paymentmoddto = new ArrayList<OrderPaymentModeDTO>();
		paymentmoddto = BeanMapper.mapList(paymentmodes, OrderPaymentModeDTO.class);
		dto = BeanMapper.map(orderpay, OrderPaymentDTO.class);
		dto.setPaymentmodes(paymentmoddto);
		dto.setRtncode(APIConstant.RTNCODE_OK);

		return dto;
	}

	/** 会员使用优惠统计 **/
	@Override
	public OrderDiscounttransactionDTO userCampaignDiscount(OrderDiscounttransactionDTO orderDiscounttransactionDTO) {
		// TODO Auto-generated method stub
		TcrmDiscounttransaction tcrmDiscounttransaction = BeanMapper.map(orderDiscounttransactionDTO,
				TcrmDiscounttransaction.class);
		Integer result = discounttransactionMapperDAO.countByCampaignnoAndCustomerid(tcrmDiscounttransaction);
		if (result > 0) {
			orderDiscounttransactionDTO.setCustomerusedflag(APIConstant.API_YES);
		} else {
			orderDiscounttransactionDTO.setCustomerusedflag(APIConstant.API_NO);
		}

		orderDiscounttransactionDTO.setRtncode(APIConstant.RTNCODE_OK);
		return orderDiscounttransactionDTO;
	}

	/** 订单成立后插入通关密语使用流水表 **/
	@Override
	public OrderDiscounttransactionDTO createDiscountTransaction(
			OrderDiscounttransactionDTO orderDiscounttransactionDTO) {
		// TODO Auto-generated method stub
		TcrmDiscounttransaction tcrmDiscounttransaction = BeanMapper.map(orderDiscounttransactionDTO,
				TcrmDiscounttransaction.class);

		//tcrmDiscounttransaction.setCoupontype(APIConstant.DISCOUNTTRANSACTION_COUPONTYPE);
		tcrmDiscounttransaction.setUsage(APIConstant.DISCOUNTTRANSACTION_USAGE);
		tcrmDiscounttransaction.setCreatedtimestamp(DateUtil.getTodayTime());
		tcrmDiscounttransaction.setLastmodifiedby(tcrmDiscounttransaction.getCreatedby());
		tcrmDiscounttransaction.setLastmodifiedtimestamp(DateUtil.getTodayTime());
		
		//couponserialno不能为空默认-
		if(StringUtils.isBlank(tcrmDiscounttransaction.getCouponserialno()) == true){
			tcrmDiscounttransaction.setCouponserialno("-");
		}
		
		orderDiscounttransactionDTO = BeanMapper.map(tcrmDiscounttransaction, OrderDiscounttransactionDTO.class);

		if (discounttransactionMapperDAO.insertSelective(tcrmDiscounttransaction) > 0) {
			orderDiscounttransactionDTO.setRtncode(APIConstant.RTNCODE_OK);
		} else {
			orderDiscounttransactionDTO.setRtncode(APIConstant.RTNCODE_FAIL);
		}

		return orderDiscounttransactionDTO;
	}
	
	/** 折价券是否被使用过 **/
	@Override
	public OrderDiscounttransactionDTO couponUsed(OrderDiscounttransactionDTO orderDiscounttransactionDTO) {
		// TODO Auto-generated method stub
		TcrmDiscounttransaction tcrmDiscounttransaction = BeanMapper.map(orderDiscounttransactionDTO,
				TcrmDiscounttransaction.class);
		Integer result = discounttransactionMapperDAO.couponUsed(tcrmDiscounttransaction);
		if (result > 0) {
			orderDiscounttransactionDTO.setCouponusedflag(APIConstant.API_YES);
		} else {
			orderDiscounttransactionDTO.setCouponusedflag(APIConstant.API_NO);
		}

		orderDiscounttransactionDTO.setRtncode(APIConstant.RTNCODE_OK);
		return orderDiscounttransactionDTO;
	}
}
