package com.best1.api.webservice.soap.crm;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.best1.api.utils.APIConstant;
import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.result.crm.CustomerAccountBalanceResult;
import com.best1.api.webservice.soap.response.result.crm.CustomerAddressResult;
import com.best1.api.webservice.soap.response.result.crm.CustomerAddressesResult;
import com.best1.api.webservice.soap.response.result.crm.CustomerAndAddressResult;
import com.best1.api.webservice.soap.response.result.crm.CustomerEleccouponsResult;
import com.best1.api.webservice.soap.response.result.crm.CustomerLotteryBonusResult;
import com.best1.api.webservice.soap.response.result.crm.CustomerLotteryBonusesResult;
import com.best1.api.webservice.soap.response.result.crm.CustomerNetworkResult;
import com.best1.api.webservice.soap.response.result.crm.CustomerNetworksResult;
import com.best1.api.webservice.soap.response.result.crm.CustomerResult;
import com.best1.api.webservice.utils.WsConstants;

/**
 * JAX-WS2.0的WebService接口定义类.
 * 
 * 使用JAX-WS2.0 annotation设置WSDL中的定义. 使用WSResult及其子类类包裹返回结果.
 * 使用DTO传输对象隔绝系统内部领域对象的修改对外系统的影响.
 * 
 * 
 */
@WebService(name = "CustomerService", targetNamespace = WsConstants.NS)
public interface CustomerSoapService {
	public WSResult buildTempCustomer(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid,
			@WebParam(name = APIConstant.SOURCEINFORMATION) Long sourceinformation,
			@WebParam(name = APIConstant.ADDRESSID) Long addressid,
			@WebParam(name = APIConstant.CUSTOMERNAME) String customername,
			@WebParam(name = APIConstant.CREATEDBY) Long createdby,
			@WebParam(name = APIConstant.CUSTOMERTYPE) Integer customertype,
			@WebParam(name = APIConstant.GENDER) String gender,
			@WebParam(name = APIConstant.PERSONID) String personid,
			@WebParam(name = APIConstant.EMAIL1) String email1,
			@WebParam(name = APIConstant.EMAIL2) String email2,
			@WebParam(name = APIConstant.INTRODUCERID) Long introducerid,
			@WebParam(name = APIConstant.CREDENTIALTYPE) Integer credentialtype,
			@WebParam(name = APIConstant.ZIPCODE) Integer zipcode,
			@WebParam(name = APIConstant.ADDRESS1) String address1,
			@WebParam(name = APIConstant.ADDRESS2) String address2,
			@WebParam(name = APIConstant.MOBILENUMBER) String mobilenumber,
			@WebParam(name = APIConstant.HOMETELEPHONEAREACODE) String hometelephoneareacode,
			@WebParam(name = APIConstant.HOMETELEPHONENUMBER) String hometelephonenumber);

	public WSResult buildCustomer(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid);

	public CustomerResult queryCustomer(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid);

	public CustomerResult fetchCustomerId();

	public CustomerAddressResult fetchAddressId();

	public CustomerResult cancellationCustomer(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid);

	public WSResult buildTempCustomerAddress(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid,
			@WebParam(name = APIConstant.ADDRESSID) Long addressid,
			@WebParam(name = APIConstant.CREATEDBY) Long createdby,
			@WebParam(name = APIConstant.ZIPCODE) Integer zipcode,
			@WebParam(name = APIConstant.ADDRESS1) String address1,
			@WebParam(name = APIConstant.ADDRESS2) String address2,
			@WebParam(name = APIConstant.MOBILENUMBER) String mobilenumber,
			@WebParam(name = APIConstant.HOMETELEPHONEAREACODE) String hometelephoneareacode,
			@WebParam(name = APIConstant.HOMETELEPHONENUMBER) String hometelephonenumber,
			@WebParam(name = APIConstant.RECEIVERNAME) String receivername);

	public WSResult buildCustomerAddress(
			@WebParam(name = APIConstant.ADDRESSID) Long addressid);

	/**
	 * 客户证件类型与证件号，查询客户信息
	 * **/
	public CustomerResult custidFromPsnidAndIdType(
			@WebParam(name = APIConstant.PERSONID) String personid,
			@WebParam(name = APIConstant.CREDENTIALTYPE) Integer credentialtype);

	/**
	 * 根据客代，邮编，地址二，返回地址信息
	 * **/
	public CustomerAddressesResult queryaddressByzipcodeAndAd(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid,
			@WebParam(name = APIConstant.ZIPCODE) Integer zipcode,
			@WebParam(name = APIConstant.ADDRESS2) String address2);

	/**
	 * 根据客代，地址一，地址二，返回地址信息
	 * **/
	public CustomerAddressesResult queryaddressIdByAddress(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid,
			@WebParam(name = APIConstant.ADDRESS1) String address1,
			@WebParam(name = APIConstant.ADDRESS2) String address2);

	/**
	 * 根据客代，返回地址信息
	 * **/
	public CustomerAddressesResult queryaddressByCustomerid(
			@WebParam(name = APIConstant.ADDRESSID) Long addressid,
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid,
			@WebParam(name = APIConstant.ZIPCODE) Integer zipcode,
			@WebParam(name = APIConstant.ADDRESS1) String address1,
			@WebParam(name = APIConstant.ADDRESS2) String address2,
			@WebParam(name = APIConstant.MOBILENUMBER) String mobilenumber,
			@WebParam(name = APIConstant.HOMETELEPHONECOUNTRYCODE) String hometelephonecountrycode,
			@WebParam(name = APIConstant.HOMETELEPHONEAREACODE) String hometelephoneareacode,
			@WebParam(name = APIConstant.HOMETELEPHONENUMBER) String hometelephonenumber,
			@WebParam(name = APIConstant.RECEIVERNAME) String receivername);

	/**
	 * 客户证件类型与证件号，查询客户与地址信息
	 * **/
	public CustomerAndAddressResult queryaddressFromPsnidAndIdType(
			@WebParam(name = APIConstant.PERSONID) String personid,
			@WebParam(name = APIConstant.CREDENTIALTYPE) Integer credentialtype);

	/**
	 * 客户客代，查询客户与地址信息
	 * **/
	public CustomerAndAddressResult queryaddressFromCustomerid(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid);

	/**
	 * 客户客代，查询客户账户信息
	 * **/
	public CustomerAccountBalanceResult queryaccountbalanceFromCustomerid(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid);

	/**
	 * 客户客代，查询客户积分信息
	 * **/
	public CustomerLotteryBonusesResult querylotterybonuFromCustomerid(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid);

	/**
	 * 客户客代，查询客户有效积分信息
	 * **/
	public CustomerLotteryBonusesResult querylotterybonuValidFromCustomerid(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid);

	/**
	 * 客户客代，查询客户有效积分信息值
	 * **/
	public CustomerLotteryBonusResult querylotterybonuValidcountFromCustomerid(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid);

	/**
	 * 客户客代,订单金额与数量
	 * **/

	public CustomerResult customerAvaiAmount(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid);

	/**
	 * 验证
	 * */
	public CustomerResult checkingCustomerCard(
			@WebParam(name = APIConstant.COUPONID) String couponid,
			@WebParam(name = APIConstant.CARDPWD) String cardpwd);

	/**
	 * 冲值
	 * */
	public CustomerResult deltaCustomerCard(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid,
			@WebParam(name = APIConstant.COUPONID) String couponid,
			@WebParam(name = APIConstant.CARDPWD) String cardpwd);

	/**
	 * 客户客代,电子折价号
	 * **/

	public CustomerEleccouponsResult querycustomerEleccoupons(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid);

	/**
	 * 
	 * 多重码 客户客代 客户信用等级 配送地区 是否支持COD
	 * **/
	public CustomerResult customerPaymentCod(
			@WebParam(name = APIConstant.PRODUCTID) Long productid,
			@WebParam(name = APIConstant.PRODUCTVERSION) Integer productversion,
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid,
			@WebParam(name = APIConstant.CREDITLEVELCODE) Long creditlevelcode,
			@WebParam(name = APIConstant.ZIPCODE) Integer zipcode);

	/**
	 * 短信
	 * */
	public CustomerResult sendSmsMessage(
			@WebParam(name = APIConstant.MOBILENUMBER) String mobile,
			@WebParam(name = APIConstant.PRIORITY) String priority,
			@WebParam(name = APIConstant.MESSAGE) String message);

	/**
	 * 积分充值
	 * **/
	public CustomerLotteryBonusResult customerlotterybonusspecialadd(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid,
			@WebParam(name = APIConstant.TRANSACTIONAMOUNT) Double transactionamount,
			@WebParam(name = APIConstant.STARTDATE) String startdate,
			@WebParam(name = APIConstant.ENDDATE) String enddate,
			@WebParam(name = APIConstant.EXCEPTIONDESC) String exceptiondesc,
			@WebParam(name = APIConstant.CREATEDBY) Long createdby);

	/**
	 * 修改客户邮箱以及手机
	 * **/
	public WSResult modifyCustomer(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid,
			@WebParam(name = APIConstant.LASTMODIFIEDBY) Long lastmodifiedby,
			@WebParam(name = APIConstant.EMAIL1) String email1,
			@WebParam(name = APIConstant.EMAIL2) String email2,
			@WebParam(name = APIConstant.PERSONID) String personid,
			@WebParam(name = APIConstant.CREDENTIALTYPE) Integer credentialtype);

	/**
	 * 获取客户网络账户
	 * **/
	public CustomerNetworksResult querycustomerNetwork(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid);

	/**
	 * 新增客户网络账户
	 * **/
	public CustomerNetworkResult createCustomerNetwork(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid,
			@WebParam(name = APIConstant.NETWORKTYPE) Integer networktype,
			@WebParam(name = APIConstant.NETWORKACCOUNT) String networkaccount,
			@WebParam(name = APIConstant.CREATEDBY) Long createdby);
	/**
	 * 修改客户网络账户
	 * **/
	public CustomerNetworkResult modifyCustomerNetwork(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid,
			@WebParam(name = APIConstant.NETWORKTYPE) Integer networktype,
			@WebParam(name = APIConstant.NETWORKACCOUNT) String networkaccount,
			@WebParam(name = APIConstant.ACCOUNTSTATE) Integer accountstate,
			@WebParam(name = APIConstant.CREATEDBY) Long createdby);

}
