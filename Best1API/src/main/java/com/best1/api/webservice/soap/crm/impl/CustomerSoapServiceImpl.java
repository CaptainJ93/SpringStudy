package com.best1.api.webservice.soap.crm.impl;

import java.text.ParseException;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import org.apache.commons.lang3.Validate;
import org.apache.cxf.feature.Features;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.best1.api.entity.crm.TcrmCustomer;
import com.best1.api.entity.crm.TcrmCustomerNetwork;
import com.best1.api.entity.crm.TcrmCustomeraccountbalance;
import com.best1.api.entity.crm.TcrmCustomerEleccoupons;
import com.best1.api.entity.crm.TcrmCustomeraddress;
import com.best1.api.entity.crm.TcrmLotterybonus;
import com.best1.api.service.crm.CustomerManageService;
import com.best1.api.utils.APIConstant;
import com.best1.api.utils.DateUtil;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.crm.CustomerSoapService;
import com.best1.api.webservice.soap.response.WSResult;
import com.best1.api.webservice.soap.response.dto.crm.CustomerAccountBalanceDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomerAddressDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomerDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomerEleccouponsDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomerLotteryBonusDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomerNetworkDTO;
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
import com.best1.api.webservice.utils.ApiHandleError;
import com.best1.api.webservice.utils.WsConstants;

/**
 * WebService服务端实现类.
 * 
 */
// serviceName指明WSDL中<wsdl:service>与<wsdl:binding>元素的名称,
// endpointInterface属性指向Interface类全称.
@WebService(serviceName = "CustomerService", endpointInterface = "com.best1.api.webservice.soap.crm.CustomerSoapService", targetNamespace = WsConstants.NS)
// 增加inbound/outbound SOAP内容的日志
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class CustomerSoapServiceImpl implements CustomerSoapService {
	private static Logger logger = LoggerFactory
			.getLogger(CustomerSoapServiceImpl.class);
	@Autowired
	private CustomerManageService customerManageService;

	@Override
	public WSResult buildTempCustomer(Long customerid, Long sourceinformation,
			Long addressid, String customername, Long createdby,
			Integer customertype, String gender, String personid,
			String email1, String email2, Long introducerid,
			Integer credentialtype, Integer zipcode, String address1,
			String address2, String mobilenumber, String hometelephoneareacode,
			String hometelephonenumber) {
		WSResult wsresult = new WSResult();
		try {
			Validate.notNull(customerid, "customerid参数为空");
			Validate.notNull(customername, "customername参数为空");
			Validate.notNull(createdby, "createdby参数为空");
			Validate.notNull(personid, "personid参数为空");
			Validate.notNull(credentialtype, "credentialtype参数为空");
			Validate.notNull(addressid, "addressid参数为空");
			Validate.notNull(address1, "address1参数为空");
			Validate.notNull(address2, "address2");

			TcrmCustomer customer = new TcrmCustomer();
			customer.setCustomerid(customerid);
			customer.setSourceinformation(sourceinformation);
			customer.setAddressid(addressid);
			customer.setCustomername(customername);
			customer.setCreatedby(createdby);
			customer.setCustomertype(customertype);
			customer.setGender(gender);
			customer.setPersonid(personid);
			customer.setEmail1(email1);
			customer.setEmail2(email2);
			customer.setIntroducerid(introducerid);
			customer.setCredentialtype(credentialtype);

			TcrmCustomeraddress address = new TcrmCustomeraddress();
			address.setAddressid(addressid);
			address.setCreatedby(createdby);
			address.setZipcode(zipcode);
			address.setAddress1(address1);
			address.setAddress2(address2);
			address.setMobilenumber(mobilenumber);
			address.setHometelephoneareacode(hometelephoneareacode);
			address.setHometelephonenumber(hometelephonenumber);

			int resultCode = customerManageService.saveTempCustomer(customer,
					address);
			wsresult.setCode(resultCode + "");

			return wsresult;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(wsresult, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(wsresult, e);
		}
	}

	@Override
	public WSResult buildCustomer(Long customerid) {
		WSResult wsresult = new WSResult();
		try {
			Validate.notNull(customerid, "customerid参数为空");

			TcrmCustomer customer = new TcrmCustomer();
			customer.setCustomerid(customerid);
			int resultCode = customerManageService.createCustomer(customer);
			wsresult.setCode(resultCode + "");

			return wsresult;

		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(wsresult, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(wsresult, e);
		}
	}

	@Override
	public CustomerResult queryCustomer(Long customerid) {
		CustomerResult result = new CustomerResult();
		try {

			Validate.notNull(customerid, "customerid参数为空");

			TcrmCustomer customer = new TcrmCustomer();
			customer.setCustomerid(customerid);
			customer = customerManageService.queryCustomer(customer);

			// Validate.notNull(customer, "客户信息不存在(customerid:" + customerid +
			// ")");

			CustomerDTO dto = BeanMapper.map(customer, CustomerDTO.class);
			result.setCustomer(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerResult fetchCustomerId() {
		CustomerResult result = new CustomerResult();
		try {

			TcrmCustomer customer = new TcrmCustomer();

			Long customerid = customerManageService.fetchCustomerId();

			Validate.notNull(customerid, "客户ID获取错误(customerid:" + customerid
					+ ")");
			customer.setCustomerid(customerid);

			CustomerDTO dto = BeanMapper.map(customer, CustomerDTO.class);
			result.setCustomer(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerAddressResult fetchAddressId() {
		CustomerAddressResult result = new CustomerAddressResult();
		try {
			TcrmCustomeraddress customeraddress = new TcrmCustomeraddress();
			Long addressid = customerManageService.fetchAddressId();
			Validate.notNull(addressid, "客户ID获取错误(addressid:" + addressid + ")");
			customeraddress.setAddressid(addressid);
			CustomerAddressDTO dto = BeanMapper.map(customeraddress,
					CustomerAddressDTO.class);
			result.setCustomeraddress(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerResult cancellationCustomer(Long customerid) {
		CustomerResult result = new CustomerResult();
		try {

			TcrmCustomer customer = new TcrmCustomer();

			Validate.notNull(customerid, "客户ID获取错误(customerid:" + customerid
					+ ")");
			customer.setCustomerid(customerid);
			customerManageService.cancellationCustomer(customer);
			CustomerDTO dto = BeanMapper.map(customer, CustomerDTO.class);
			result.setCustomer(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public WSResult buildTempCustomerAddress(Long customerid, Long addressid,
			Long createdby, Integer zipcode, String address1, String address2,
			String mobilenumber, String hometelephoneareacode,
			String hometelephonenumber, String receivername) {
		WSResult wsresult = new WSResult();
		try {
			Validate.notNull(customerid, "客户customerid获取错误(addressid:"
					+ customerid + ")");
			Validate.notNull(addressid, "客户addressid获取错误(addressid:"
					+ addressid + ")");
			Validate.notNull(zipcode, "客户addressid获取错误(zipcode:" + zipcode
					+ ")");
			Validate.notNull(address1, "客户address1获取错误(address1:" + address1
					+ ")");
			Validate.notNull(address2, "客户address2获取错误(address2:" + address2
					+ ")");

			TcrmCustomeraddress address = new TcrmCustomeraddress();
			address.setCustomerid(customerid);
			address.setAddressid(addressid);
			address.setCreatedby(createdby);
			address.setZipcode(zipcode);
			address.setAddress1(address1);
			address.setAddress2(address2);
			address.setMobilenumber(mobilenumber);
			address.setHometelephoneareacode(hometelephoneareacode);
			address.setHometelephonenumber(hometelephonenumber);
			address.setReceivername(receivername);

			int resultCode = customerManageService
					.createTempCustomerAddress(address);
			wsresult.setCode(resultCode + "");

			return wsresult;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(wsresult, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(wsresult, e);
		}
	}

	@Override
	public WSResult buildCustomerAddress(Long addressid) {
		WSResult wsresult = new WSResult();
		try {
			Validate.notNull(addressid, "客户addressid获取错误(addressid:"
					+ addressid + ")");
			TcrmCustomeraddress address = new TcrmCustomeraddress();
			address.setAddressid(addressid);
			int resultCode = customerManageService
					.createCustomerAddress(address);
			wsresult.setCode(resultCode + "");

			return wsresult;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(wsresult, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(wsresult, e);
		}
	}

	@Override
	public CustomerResult custidFromPsnidAndIdType(String personid,
			Integer credentialtype) {
		CustomerResult result = new CustomerResult();
		try {

			TcrmCustomer customer = new TcrmCustomer();

			Validate.notNull(personid, "客户Personid获取错误(personid:" + personid
					+ ")");
			Validate.notNull(credentialtype,
					"客户credentialtype获取错误(credentialtype:" + credentialtype
							+ ")");
			customer.setPersonid(personid);
			customer.setCredentialtype(credentialtype);
			Long customerid = customerManageService
					.customerByPersonAndType(customer);
			customer.setCustomerid(customerid);
			CustomerDTO dto = BeanMapper.map(customer, CustomerDTO.class);
			result.setCustomer(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerAddressesResult queryaddressByzipcodeAndAd(Long customerid,
			Integer zipcode, String address2) {
		CustomerAddressesResult result = new CustomerAddressesResult();
		try {
			Validate.notNull(customerid, "客户customerid获取错误(customerid:"
					+ customerid + ")");

			Validate.notNull(zipcode, "客户addressid获取错误(zipcode:" + zipcode
					+ ")");

			Validate.notNull(address2, "客户address2获取错误(address2:" + address2
					+ ")");
			TcrmCustomeraddress address = new TcrmCustomeraddress();
			address.setCustomerid(customerid);
			address.setZipcode(zipcode);
			address.setAddress2(address2);

			List<TcrmCustomeraddress> customeraddresses = customerManageService
					.addressrByzipcodeAndAd(address);

			List<CustomerAddressDTO> dtoes = BeanMapper.mapList(
					customeraddresses, CustomerAddressDTO.class);
			result.setCustomeraddresses(dtoes);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}

	@Override
	public CustomerAddressesResult queryaddressIdByAddress(
			@WebParam(name = APIConstant.CUSTOMERID) Long customerid,
			@WebParam(name = APIConstant.ADDRESS1) String address1,
			@WebParam(name = APIConstant.ADDRESS2) String address2) {
		CustomerAddressesResult result = new CustomerAddressesResult();
		try {
			Validate.notNull(customerid, "客户customerid获取错误(addressid:"
					+ customerid + ")");

			Validate.notNull(address1, "客户address1获取错误(address1:" + address1
					+ ")");

			Validate.notNull(address2, "客户address2获取错误(address2:" + address2
					+ ")");

			TcrmCustomeraddress address = new TcrmCustomeraddress();
			address.setCustomerid(customerid);
			address.setAddress1(address1);
			address.setAddress2(address2);

			List<TcrmCustomeraddress> customeraddresses = customerManageService
					.customerIsExistAddress(address);

			List<CustomerAddressDTO> dtoes = BeanMapper.mapList(
					customeraddresses, CustomerAddressDTO.class);
			result.setCustomeraddresses(dtoes);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerAddressesResult queryaddressByCustomerid(Long addressid,
			Long customerid, Integer zipcode, String address1, String address2,
			String mobilenumber, String hometelephonecountrycode,
			String hometelephoneareacode, String hometelephonenumber,
			String receivername) {
		CustomerAddressesResult result = new CustomerAddressesResult();
		try {
			Validate.notNull(customerid, "客户customerid获取错误(customerid:"
					+ customerid + ")");

			TcrmCustomeraddress address = new TcrmCustomeraddress();
			address.setAddressid(addressid);
			address.setCustomerid(customerid);
			address.setZipcode(zipcode);
			address.setAddress1(address1);
			address.setAddress2(address2);
			address.setMobilenumber(mobilenumber);
			address.setHometelephonecountrycode(hometelephonecountrycode);
			address.setHometelephoneareacode(hometelephoneareacode);
			address.setHometelephonenumber(hometelephonenumber);
			address.setReceivername(receivername);
			List<TcrmCustomeraddress> addresses = customerManageService
					.selectAddressByExample(address);

			List<CustomerAddressDTO> dtoes = BeanMapper.mapList(addresses,
					CustomerAddressDTO.class);
			result.setCustomeraddresses(dtoes);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerAndAddressResult queryaddressFromPsnidAndIdType(
			String personid, Integer credentialtype) {
		CustomerAndAddressResult result = new CustomerAndAddressResult();
		try {
			Validate.notNull(personid, "客户personid获取错误(personid:" + personid
					+ ")");

			Validate.notNull(credentialtype,
					"客户credentialtype获取错误(credentialtype:" + credentialtype
							+ ")");

			TcrmCustomer customer = new TcrmCustomer();
			customer.setPersonid(personid);
			customer.setCredentialtype(credentialtype);
			List<TcrmCustomer> customerandaddresses = customerManageService
					.selectCustomerByIdCardAndCardType(customer);

			List<CustomerDTO> dtoes = BeanMapper.mapList(customerandaddresses,
					CustomerDTO.class);
			result.setCustomerandaddresses(dtoes);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerAndAddressResult queryaddressFromCustomerid(Long customerid) {
		CustomerAndAddressResult result = new CustomerAndAddressResult();
		try {
			Validate.notNull(customerid, "客户customerid获取错误(customerid:"
					+ customerid + ")");
			TcrmCustomer customer = new TcrmCustomer();
			customer.setCustomerid(customerid);
			List<TcrmCustomer> customerandaddresses = customerManageService
					.selectCustomerById(customer);

			List<CustomerDTO> dtoes = BeanMapper.mapList(customerandaddresses,
					CustomerDTO.class);
			result.setCustomerandaddresses(dtoes);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerAccountBalanceResult queryaccountbalanceFromCustomerid(
			Long customerid) {
		CustomerAccountBalanceResult result = new CustomerAccountBalanceResult();
		try {
			Validate.notNull(customerid, "客户customerid获取错误(customerid:"
					+ customerid + ")");
			TcrmCustomer customer = new TcrmCustomer();
			customer.setCustomerid(customerid);
			List<TcrmCustomeraccountbalance> customeraccountbalances = customerManageService
					.selectAccountBalanceById(customer);

			List<CustomerAccountBalanceDTO> dtoes = BeanMapper.mapList(
					customeraccountbalances, CustomerAccountBalanceDTO.class);
			result.setCustomeraccountbalances(dtoes);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerLotteryBonusesResult querylotterybonuFromCustomerid(
			Long customerid) {
		CustomerLotteryBonusesResult result = new CustomerLotteryBonusesResult();
		try {
			Validate.notNull(customerid, "客户customerid获取错误(customerid:"
					+ customerid + ")");
			TcrmCustomer customer = new TcrmCustomer();
			customer.setCustomerid(customerid);
			List<TcrmLotterybonus> customerlotterybonuses = customerManageService
					.selectLotteryBonusById(customer);

			List<CustomerLotteryBonusDTO> dtoes = BeanMapper.mapList(
					customerlotterybonuses, CustomerLotteryBonusDTO.class);
			result.setCustomerlotterybonuses(dtoes);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerLotteryBonusesResult querylotterybonuValidFromCustomerid(
			Long customerid) {
		CustomerLotteryBonusesResult result = new CustomerLotteryBonusesResult();
		try {
			Validate.notNull(customerid, "客户customerid获取错误(customerid:"
					+ customerid + ")");
			TcrmCustomer customer = new TcrmCustomer();
			customer.setCustomerid(customerid);
			List<TcrmLotterybonus> customerlotterybonuses = customerManageService
					.selectLotteryBonusByValid(customer);

			List<CustomerLotteryBonusDTO> dtoes = BeanMapper.mapList(
					customerlotterybonuses, CustomerLotteryBonusDTO.class);
			result.setCustomerlotterybonuses(dtoes);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerLotteryBonusResult querylotterybonuValidcountFromCustomerid(
			Long customerid) {
		CustomerLotteryBonusResult result = new CustomerLotteryBonusResult();
		try {

			TcrmCustomer customer = new TcrmCustomer();
			TcrmLotterybonus customerLotteryBonus = new TcrmLotterybonus();
			Validate.notNull(customerid, "客户customerid获取错误(customerid:"
					+ customerid + ")");
			customer.setCustomerid(customerid);
			Double availablelotterybonus = customerManageService
					.selectLotteryBonusCountByValid(customer);
			customerLotteryBonus.setCustomerid(customerid);
			customerLotteryBonus
					.setAvailablelotterybonus(availablelotterybonus);
			CustomerLotteryBonusDTO dto = BeanMapper.map(customerLotteryBonus,
					CustomerLotteryBonusDTO.class);
			result.setCustomerlotterybonus(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerResult customerAvaiAmount(Long customerid) {
		CustomerResult result = new CustomerResult();
		try {

			TcrmCustomer customer = new TcrmCustomer();

			Validate.notNull(customerid, "客户customerid获取错误(customerid:"
					+ customerid + ")");
			customer.setCustomerid(customerid);
			customer = customerManageService.customerAvaiAmount(customer);

			CustomerDTO dto = BeanMapper.map(customer, CustomerDTO.class);
			result.setCustomer(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerResult checkingCustomerCard(String couponid, String cardpwd) {
		CustomerResult result = new CustomerResult();
		try {

			TcrmCustomer customer = new TcrmCustomer();

			Validate.notNull(couponid, "couponid获取错误(couponid:" + couponid
					+ ")");
			Validate.notNull(cardpwd, "cardpwd获取错误(cardpwd:" + cardpwd + ")");
			customer.setCouponid(couponid);
			customer.setCardpwd(cardpwd);
			customerManageService.checkCustomerCard(customer);

			CustomerDTO dto = BeanMapper.map(customer, CustomerDTO.class);
			result.setCustomer(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}

	@Override
	public CustomerResult deltaCustomerCard(Long customerid, String couponid,
			String cardpwd) {
		CustomerResult result = new CustomerResult();
		try {
			TcrmCustomer customer = new TcrmCustomer();

			Validate.notNull(customerid, "customerid获取错误(customerid:"
					+ customerid + ")");
			Validate.notNull(couponid, "couponid获取错误(couponid:" + couponid
					+ ")");
			Validate.notNull(cardpwd, "cardpwd获取错误(cardpwd:" + cardpwd + ")");
			customer.setCouponid(couponid);
			customer.setCardpwd(cardpwd);
			customer.setCustomerid(customerid);
			customerManageService.updCustomerBalance(customer);

			CustomerDTO dto = BeanMapper.map(customer, CustomerDTO.class);
			result.setCustomer(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerEleccouponsResult querycustomerEleccoupons(Long customerid) {
		CustomerEleccouponsResult result = new CustomerEleccouponsResult();
		try {
			TcrmCustomerEleccoupons customereleccoupons = new TcrmCustomerEleccoupons();

			Validate.notNull(customerid, "customerid获取错误(customerid:"
					+ customerid + ")");

			customereleccoupons.setCustomerid(customerid);
			List<TcrmCustomerEleccoupons> customereleccouponses = customerManageService
					.selectCustomerEleccoupons(customereleccoupons);

			List<CustomerEleccouponsDTO> dtoes = BeanMapper.mapList(
					customereleccouponses, CustomerEleccouponsDTO.class);
			result.setCustomereleccouponses(dtoes);

			return result;

		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerResult customerPaymentCod(Long productid,
			Integer productversion, Long customerid, Long creditlevelcode,
			Integer zipcode) {
		CustomerResult result = new CustomerResult();
		try {
			TcrmCustomer customer = new TcrmCustomer();

			Validate.notNull(productid, "productid获取错误(multicodeid:"
					+ productid + ")");
			Validate.notNull(customerid, "customerid获取错误(customerid:"
					+ customerid + ")");
			Validate.notNull(creditlevelcode,
					"creditlevelcode获取错误(creditlevelcode:" + creditlevelcode
							+ ")");

			customer.setCustomerid(customerid);
			customer.setProductid(productid);
			customer.setProductversion(productversion);
			customer.setCustomercreditlevelid(creditlevelcode);
			customer.setZipcode(zipcode);
			customerManageService.customerPaymentCod(customer);

			CustomerDTO dto = BeanMapper.map(customer, CustomerDTO.class);
			result.setCustomer(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerResult sendSmsMessage(String mobile, String priority,
			String message) {
		CustomerResult result = new CustomerResult();
		try {
			TcrmCustomer customer = new TcrmCustomer();

			Validate.notNull(mobile, "mobile获取错误(mobile:" + mobile + ")");
			Validate.notNull(priority, "priority获取错误(priority:" + priority
					+ ")");
			Validate.notNull(message, "message获取错误(message:" + message + ")");

			customer.setMobilenumber(mobile);
			customer.setSendmsg(message);
			customerManageService.customerSmsSend(customer);

			CustomerDTO dto = BeanMapper.map(customer, CustomerDTO.class);
			result.setCustomer(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerLotteryBonusResult customerlotterybonusspecialadd(
			Long customerid, Double transactionamount, String startdate,
			String enddate, String exceptiondesc, Long createdby) {
		CustomerLotteryBonusResult result = new CustomerLotteryBonusResult();
		try {
			TcrmLotterybonus lotterybonus = new TcrmLotterybonus();
			Validate.notNull(customerid, "customerid获取错误(customerid:"
					+ customerid + ")");
			Validate.notNull(transactionamount,
					"transactionamount获取错误(transactionamount:"
							+ transactionamount + ")");
			Validate.notNull(startdate, "startdate获取错误(startdate:" + startdate
					+ ")");
			Validate.notNull(enddate, "enddate获取错误(enddate:" + enddate + ")");
			Validate.notNull(exceptiondesc, "exceptiondesc获取错误(exceptiondesc:"
					+ exceptiondesc + ")");
			Validate.notNull(createdby, "createdby获取错误(createdby:" + createdby
					+ ")");
			lotterybonus.setCustomerid(customerid);
			lotterybonus.setCreatedby(createdby);
			lotterybonus.setTransactionamount(transactionamount);

			lotterybonus.setStartdate(DateUtil.convertStringToDate(startdate));

			lotterybonus.setEnddate(DateUtil.convertStringToDate(enddate));
			lotterybonus.setExceptiondesc(exceptiondesc);

			customerManageService.updcustomerLotteryBonus(lotterybonus);

			CustomerLotteryBonusDTO dto = BeanMapper.map(lotterybonus,
					CustomerLotteryBonusDTO.class);
			result.setCustomerlotterybonus(dto);

			return result;

		} catch (ParseException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public WSResult modifyCustomer(Long customerid, Long lastmodifiedby,
			String email1, String email2, String personid,
			Integer credentialtype) {
		WSResult wsresult = new WSResult();
		wsresult.setCode(WsConstants.errcode);
		try {
			Validate.notNull(customerid, "customerid参数为空");
			Validate.notNull(lastmodifiedby, "lastmodifiedby参数为空");

			Validate.notNull(personid, "personid参数为空");
			Validate.notNull(credentialtype, "credentialtype参数为空");
			// Validate.notNull(email1, "email1参数为空");
			// Validate.notNull(email2, "email2参数为空");

			TcrmCustomer customer = new TcrmCustomer();
			customer.setCustomerid(customerid);
			customer.setLastmodifiedby(lastmodifiedby);
			customer.setEmail1(email1);
			customer.setEmail2(email2);
			customer.setPersonid(personid);
			customer.setTaiwanid(personid);
			customer.setCredentialtype(credentialtype);

			int resultCode = customerManageService.stopModifyCustomer(customer);
			wsresult.setCode(resultCode + "");

			return wsresult;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(wsresult, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(wsresult, e);
		}
	}

	@Override
	public CustomerNetworksResult querycustomerNetwork(Long customerid) {
		CustomerNetworksResult result = new CustomerNetworksResult();
		try {

			Validate.notNull(customerid, "customerid参数为空");

			TcrmCustomerNetwork customernetwork = new TcrmCustomerNetwork();
			customernetwork.setCustomerid(customerid);
			List<TcrmCustomerNetwork> customernetworks = customerManageService
					.selectCustomerNetwork(customernetwork);

			List<CustomerNetworkDTO> dtoes = BeanMapper.mapList(
					customernetworks, CustomerNetworkDTO.class);
			result.setCustomernetworks(dtoes);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerNetworkResult createCustomerNetwork(Long customerid,
			Integer networktype, String networkaccount, Long createdby) {
		CustomerNetworkResult result = new CustomerNetworkResult();
		try {
			TcrmCustomerNetwork customernetwork = new TcrmCustomerNetwork();

			Validate.notNull(customerid, "customerid获取错误(customerid:"
					+ customerid + ")");
			Validate.notNull(networktype,
					"networktype获取错误(pnetworktyperiority:" + networktype + ")");
			Validate.notNull(networkaccount,
					"networkaccount获取错误(networkaccount:" + networkaccount + ")");
			Validate.notNull(createdby, "createdby获取错误(createdby:" + createdby
					+ ")");

			customernetwork.setCustomerid(customerid);
			customernetwork.setNetworktype(networktype);
			customernetwork.setCreatedby(createdby);
			customernetwork.setNetworkaccount(networkaccount);

			customernetwork = customerManageService
					.createCustomerNetwork(customernetwork);

			CustomerNetworkDTO dto = BeanMapper.map(customernetwork,
					CustomerNetworkDTO.class);

			result.setCustomernetwork(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public CustomerNetworkResult modifyCustomerNetwork(Long customerid,
			Integer networktype, String networkaccount, Integer accountstate,
			Long createdby) {
		CustomerNetworkResult result = new CustomerNetworkResult();
		try {
			TcrmCustomerNetwork customernetwork = new TcrmCustomerNetwork();

			Validate.notNull(customerid, "customerid获取错误(customerid:"
					+ customerid + ")");
			Validate.notNull(networktype,
					"networktype获取错误(pnetworktyperiority:" + networktype + ")");
			Validate.notNull(networkaccount,
					"networkaccount获取错误(networkaccount:" + networkaccount + ")");
			Validate.notNull(accountstate, "accountstate获取错误(accountstate:"
					+ accountstate + ")");
			Validate.notNull(createdby, "createdby获取错误(createdby:" + createdby
					+ ")");

			customernetwork.setCustomerid(customerid);
			customernetwork.setNetworktype(networktype);
			customernetwork.setLastmodifiedby(createdby);
			customernetwork.setNetworkaccount(networkaccount);
			customernetwork.setAccountstate(accountstate);

			customernetwork = customerManageService
					.updateCustomerNetwork(customernetwork);

			CustomerNetworkDTO dto = BeanMapper.map(customernetwork,
					CustomerNetworkDTO.class);

			result.setCustomernetwork(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}
}
