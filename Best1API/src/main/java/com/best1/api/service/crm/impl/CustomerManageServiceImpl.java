package com.best1.api.service.crm.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.javasimon.aop.Monitored;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.apache.commons.lang.StringUtils;

import com.best1.api.entity.crm.TcrmCustomeraddressExample;
import com.best1.api.entity.cmn.TcmnBatchrequest;
import com.best1.api.entity.cmn.TcmnUser;
import com.best1.api.entity.crm.CustomerAccountBalance;
import com.best1.api.entity.crm.TcrmCallworkcode;
import com.best1.api.entity.crm.TcrmCallworkcodeExample;
import com.best1.api.entity.crm.TcrmContactcwccomments;
import com.best1.api.entity.crm.TcrmContacthistory;
import com.best1.api.entity.crm.TcrmContactreferencedetails;
import com.best1.api.entity.crm.TcrmCustomer;
import com.best1.api.entity.crm.TcrmCustomeraccountbalance;
import com.best1.api.entity.crm.TcrmCustomerEleccoupons;
import com.best1.api.entity.crm.TcrmCustomeraccountbalanceExample;
import com.best1.api.entity.crm.TcrmCustomeraccountbalanceKey;
import com.best1.api.entity.crm.TcrmCustomeraddress;
import com.best1.api.entity.crm.TcrmCustomerNetwork;
import com.best1.api.entity.crm.TcrmCustomerbaseaddress;
import com.best1.api.entity.crm.TcrmCustomerbaseaddressExample;
import com.best1.api.entity.crm.TcrmCustomerblacklist;
import com.best1.api.entity.crm.TcrmCustomercontacts;
import com.best1.api.entity.crm.TcrmCustomercontactsExample;
import com.best1.api.entity.crm.TcrmCustomermessage;
import com.best1.api.entity.crm.TcrmCustomerpassword;
import com.best1.api.entity.crm.TcrmCustomerpasswordKey;
import com.best1.api.entity.crm.TcrmCusttransactiondetails;
import com.best1.api.entity.crm.TcrmLotterybonus;
import com.best1.api.entity.oaf.order.ToafBonuspointbatch;
import com.best1.api.entity.oaf.order.ToafBonuspointbatchdetail;
import com.best1.api.mapper.cmn.TcmnBatchMapper;
import com.best1.api.mapper.cmn.TcmnUserMapper;
import com.best1.api.mapper.crm.TcrmCallworkcodeMapper;
import com.best1.api.mapper.crm.TcrmContactcwccommentsMapper;
import com.best1.api.mapper.crm.TcrmContacthistoryMapper;
import com.best1.api.mapper.crm.TcrmContactreferencedetailsMapper;
import com.best1.api.mapper.crm.TcrmCustomerMapper;
import com.best1.api.mapper.crm.TcrmCustomeraccountbalanceMapper;
import com.best1.api.mapper.crm.TcrmCustomeraddressMapper;
import com.best1.api.mapper.crm.TcrmCustomerbaseaddressMapper;
import com.best1.api.mapper.crm.TcrmCustomerblacklistMapper;
import com.best1.api.mapper.crm.TcrmCustomercontactsMapper;
import com.best1.api.mapper.crm.TcrmCustomermessageMapper;
import com.best1.api.mapper.crm.TcrmCustomerpasswordMapper;
import com.best1.api.mapper.crm.TcrmCusttransactiondetailsMapper;
import com.best1.api.mapper.crm.TcrmLotterybonusMapper;
import com.best1.api.mapper.oaf.order.ToafBonuspointbatchMapper;
import com.best1.api.service.crm.CustomerManageService;
import com.best1.api.utils.APIConstant;
import com.best1.api.utils.Arith;
import com.best1.api.utils.DateUtil;
import com.best1.api.utils.IOAFConstants;
import com.best1.api.utils.IOAFDomainConstants;
import com.best1.api.utils.CRMConstants;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.response.dto.crm.CallworkcodeDTO;
import com.best1.api.webservice.soap.response.dto.crm.ContacthistoryDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomerAccountBalanceDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomerAddressDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomerBlacklistDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomerDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomerVipDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomercontactsDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomermessageDTO;

@Component
@Transactional
@Monitored
public class CustomerManageServiceImpl implements CustomerManageService {
	private static Logger logger = LoggerFactory
			.getLogger(CustomerManageServiceImpl.class);
	@Autowired
	private TcrmCustomerMapper customerDao;
	@Autowired
	private TcrmCustomeraddressMapper customeraddressDao;

	@Autowired
	private TcrmCustomerbaseaddressMapper cstomerbaseaddressDao;

	@Autowired
	private TcrmContacthistoryMapper contacthistoryDao;

	@Autowired
	private TcrmContactreferencedetailsMapper contactreferencedetailsDao;

	@Autowired
	private TcrmCallworkcodeMapper callworkcodeDao;

	@Autowired
	private TcrmContactcwccommentsMapper contactcwccommentsDao;

	@Autowired
	private TcmnBatchMapper batchDao;

	@Autowired
	private ToafBonuspointbatchMapper bonuspointbatchDao;
	@Autowired
	private TcrmLotterybonusMapper lotterybonusDAO;

	@Autowired
	private TcrmCusttransactiondetailsMapper custtransactiondetailsMapperDAO;
	@Autowired
	private TcrmCustomeraccountbalanceMapper customeraccountbalanceMapperDAO;

	@Autowired
	private TcrmCustomerblacklistMapper customerblacklistMapperDAO;

	@Autowired
	private TcrmCustomerpasswordMapper customerpasswordMapperDAO;

	@Autowired
	private TcrmCallworkcodeMapper callworkcodeDAO;

	@Autowired
	private TcrmCustomermessageMapper customermessageMapperDAO;

	@Autowired
	private TcmnUserMapper userMapperDAO;

	@Autowired
	private TcrmCustomercontactsMapper customercontactsMapperDAO;

	@Override
	public Long fetchCustomerId() {

		return customerDao.fetchCustomerId();
	}

	@Override
	public Long fetchAddressId() {

		return customeraddressDao.fetchAddressId();
	}

	@Override
	public TcrmCustomer queryCustomer(TcrmCustomer customer) {
		customer = customerDao.selectByPrimaryKey(customer.getCustomerid());

		return customer;
	}

	@Override
	public int saveTempCustomer(TcrmCustomer customer,
			TcrmCustomeraddress address) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_CUSTOMERID, customer.getCustomerid());
		paramMap.put(APIConstant.SP_SOURCEINFORMATION,
				customer.getSourceinformation());
		paramMap.put(APIConstant.SP_ADDRESSID, address.getAddressid());
		paramMap.put(APIConstant.SP_CUSTOMERNAME, customer.getCustomername());
		paramMap.put(APIConstant.SP_CREATEDBY, customer.getCreatedby());
		paramMap.put(APIConstant.SP_CUSTOMERTYPE, customer.getCustomertype());
		paramMap.put(APIConstant.SP_GENDER, customer.getGender());
		paramMap.put(APIConstant.SP_PERSONID, customer.getPersonid());
		paramMap.put(APIConstant.SP_EMAIL1, customer.getEmail1());
		paramMap.put(APIConstant.SP_EMAIL2, customer.getEmail2());
		paramMap.put(APIConstant.SP_INTRODUCERID, customer.getIntroducerid());
		paramMap.put(APIConstant.SP_CREDENTIALTYPE,
				customer.getCredentialtype());
		paramMap.put(APIConstant.SP_ZIPCODE, address.getZipcode());
		paramMap.put(APIConstant.SP_ADDRESS1, address.getAddress1());
		paramMap.put(APIConstant.SP_ADDRESS2, address.getAddress2());
		paramMap.put(APIConstant.SP_MOBILE, address.getMobilenumber());
		paramMap.put(APIConstant.SP_HOMENUM_AREA,
				address.getHometelephoneareacode());
		paramMap.put(APIConstant.SP_HOMENUM_DTL,
				address.getHometelephonenumber());
		customerDao.createTempCustomer(paramMap);

		java.math.BigDecimal rtncode = (java.math.BigDecimal) paramMap
				.get(APIConstant.SP_RI_RTNCODE);
		if (rtncode != null)
			return rtncode.intValue();
		return APIConstant.RTNCODE_APP_ERROR;

	}

	@Override
	public int createCustomer(TcrmCustomer customer) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_CUSTOMERID, customer.getCustomerid());
		customerDao.createCustomer(paramMap);
		java.math.BigDecimal rtncode = (java.math.BigDecimal) paramMap
				.get(APIConstant.SP_RTN_CODE);
		if (rtncode != null)
			return rtncode.intValue();
		return APIConstant.RTNCODE_APP_ERROR;
	}

	@Override
	public int updateCustomer(TcrmCustomer customer) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_AN_CUSTID, customer.getCustomerid());
		customerDao.modifyCustomer(paramMap);
		java.math.BigDecimal rtncode = (java.math.BigDecimal) paramMap
				.get(APIConstant.SP_RTN_CODE);

		if (rtncode != null)
			return rtncode.intValue();
		return APIConstant.RTNCODE_APP_ERROR;
	}

	@Override
	public int stopModifyCustomer(TcrmCustomer customer) {
		customer.setLastmodifiedtimestamp(DateUtil.getTodayTime());
		int count = customerDao.updateByPrimaryKeySelective(customer);
		if (count > 0) {
			return APIConstant.RTNCODE_OK;
		}
		return APIConstant.RTNCODE_FAIL;

	}

	@Override
	public int cancellationCustomer(TcrmCustomer customer) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_CUSTID, customer.getCustomerid());
		customerDao.rollbacknewCustomer(paramMap);
		java.math.BigDecimal rtncode = (java.math.BigDecimal) paramMap
				.get(APIConstant.SP_RTN_CODE);
		if (rtncode != null)
			return rtncode.intValue();
		return APIConstant.RTNCODE_APP_ERROR;
	}

	@Override
	public int createTempCustomerAddress(TcrmCustomeraddress address) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_CUSTOMERID, address.getCustomerid());
		paramMap.put(APIConstant.SP_CREATEDBY, address.getCreatedby());
		paramMap.put(APIConstant.SP_ADDRESSID, address.getAddressid());
		paramMap.put(APIConstant.SP_ZIPCODE, address.getZipcode());
		paramMap.put(APIConstant.SP_ADDRESS1, address.getAddress1());
		paramMap.put(APIConstant.SP_ADDRESS2, address.getAddress2());
		paramMap.put(APIConstant.SP_MOBILE, address.getMobilenumber());
		paramMap.put(APIConstant.SP_HOMENUM_AREA,
				address.getHometelephoneareacode());
		paramMap.put(APIConstant.SP_HOMENUM_DTL,
				address.getHometelephonenumber());
		paramMap.put(APIConstant.SP_RECEIVERNAME, address.getReceivername());
		customeraddressDao.createTempCustomerAddress(paramMap);

		java.math.BigDecimal rtncode = (java.math.BigDecimal) paramMap
				.get(APIConstant.SP_RI_RTNCODE);
		if (rtncode != null)
			return rtncode.intValue();
		return APIConstant.RTNCODE_APP_ERROR;
	}

	@Override
	public int createCustomerAddress(TcrmCustomeraddress address) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_AN_CUSTADDRESSID, address.getAddressid());
		customeraddressDao.createCustomerAddress(paramMap);
		java.math.BigDecimal rtncode = (java.math.BigDecimal) paramMap
				.get(APIConstant.SP_RTN_CODE);
		if (rtncode != null)
			return rtncode.intValue();
		return APIConstant.RTNCODE_APP_ERROR;
	}

	@Override
	public int modifyCustomerAddress(TcrmCustomeraddress address) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_AN_CUSTID, address.getCustomerid());
		paramMap.put(APIConstant.SP_AN_CUSTADDRESSID, address.getAddressid());
		customeraddressDao.modifyCustomerAddress(paramMap);
		java.math.BigDecimal rtncode = (java.math.BigDecimal) paramMap
				.get(APIConstant.SP_RTN_CODE);
		if (rtncode != null)
			return rtncode.intValue();

		return APIConstant.RTNCODE_APP_ERROR;
	}

	@Override
	public CustomerAddressDTO modifyCustomerAddress(CustomerAddressDTO dto) {
		if (dto.getCustomerid() != null && dto.getAddressid() != null) {
			TcrmCustomeraddressExample adexample = new TcrmCustomeraddressExample();
			TcrmCustomeraddressExample.Criteria adcriteria = adexample
					.createCriteria();
			adcriteria.andCustomeridEqualTo(dto.getCustomerid());
			adcriteria.andAddressidEqualTo(dto.getAddressid());
			if (customeraddressDao.countByExample(adexample) > 0) {

				if (StringUtils.equals(dto.getIscontactaddress(),
						APIConstant.API_YES)) {
					TcrmCustomeraddressExample example = new TcrmCustomeraddressExample();
					TcrmCustomeraddressExample.Criteria criteria = example
							.createCriteria();
					criteria.andCustomeridEqualTo(dto.getCustomerid());
					criteria.andIscontactaddressEqualTo(APIConstant.API_YES);
					TcrmCustomeraddress customeraddress = new TcrmCustomeraddress();
					customeraddress.setIscontactaddress(APIConstant.API_NO);

					customeraddressDao.updateByExampleSelective(
							customeraddress, example);

					TcrmCustomerbaseaddressExample baseexample = new TcrmCustomerbaseaddressExample();
					TcrmCustomerbaseaddressExample.Criteria basecriteria = baseexample
							.createCriteria();
					basecriteria.andCustomeridEqualTo(dto.getCustomerid());
					basecriteria
							.andIscontactaddressEqualTo(APIConstant.API_YES);
					TcrmCustomerbaseaddress customerbaseaddress = new TcrmCustomerbaseaddress();
					customerbaseaddress.setIscontactaddress(APIConstant.API_NO);
					customerbaseaddress.setLastmodifiedtimestamp(DateUtil
							.getTodayTime());
					customerbaseaddress.setLastmodifiedby(dto.getCreatedby());
					cstomerbaseaddressDao.updateByExampleSelective(
							customerbaseaddress, baseexample);

					customeraddress = BeanMapper.map(dto,
							TcrmCustomeraddress.class);
					customeraddress.setCreatedby(null);
					customeraddress.setLastmodifiedtimestamp(DateUtil
							.getTodayTime());
					customeraddress.setLastmodifiedby(dto.getCreatedby());

					customeraddressDao
							.updateByPrimaryKeySelective(customeraddress);

					customerbaseaddress = BeanMapper.map(dto,
							TcrmCustomerbaseaddress.class);
					customerbaseaddress.setCreatedby(null);
					customerbaseaddress.setLastmodifiedtimestamp(DateUtil
							.getTodayTime());
					customerbaseaddress.setLastmodifiedby(dto.getCreatedby());

					cstomerbaseaddressDao
							.updateByPrimaryKeySelective(customerbaseaddress);

					TcrmCustomer customer = new TcrmCustomer();
					customer.setCustomerid(dto.getCustomerid());
					customer.setLastmodifiedtimestamp(DateUtil.getTodayTime());
					customer.setLastmodifiedby(dto.getCreatedby());
					customerDao.updateByPrimaryKey(customer);

					dto.setRtncode(APIConstant.RTNCODE_OK);

				}

				else if (StringUtils.equals(dto.getIsdefault(),
						APIConstant.API_YES)) {

					TcrmCustomeraddressExample example = new TcrmCustomeraddressExample();
					TcrmCustomeraddressExample.Criteria criteria = example
							.createCriteria();
					criteria.andCustomeridEqualTo(dto.getCustomerid());
					criteria.andIsdefaultEqualTo(APIConstant.API_YES);
					TcrmCustomeraddress customeraddress = new TcrmCustomeraddress();
					customeraddress.setIsdefault(APIConstant.API_NO);
					customeraddress.setLastmodifiedtimestamp(DateUtil
							.getTodayTime());
					customeraddress.setLastmodifiedby(dto.getCreatedby());
					customeraddressDao.updateByExampleSelective(
							customeraddress, example);

					TcrmCustomerbaseaddressExample baseexample = new TcrmCustomerbaseaddressExample();
					TcrmCustomerbaseaddressExample.Criteria basecriteria = baseexample
							.createCriteria();
					basecriteria.andCustomeridEqualTo(dto.getCustomerid());
					basecriteria.andIsdefaultEqualTo(APIConstant.API_YES);

					TcrmCustomerbaseaddress customerbaseaddress = new TcrmCustomerbaseaddress();
					customerbaseaddress.setIsdefault(APIConstant.API_NO);
					customerbaseaddress.setLastmodifiedtimestamp(DateUtil
							.getTodayTime());
					customerbaseaddress.setLastmodifiedby(dto.getCreatedby());
					cstomerbaseaddressDao.updateByExampleSelective(
							customerbaseaddress, baseexample);

					customeraddress = BeanMapper.map(dto,
							TcrmCustomeraddress.class);
					customeraddress.setCreatedby(null);
					customeraddress.setLastmodifiedtimestamp(DateUtil
							.getTodayTime());
					customeraddress.setLastmodifiedby(dto.getCreatedby());

					customeraddressDao
							.updateByPrimaryKeySelective(customeraddress);

					customerbaseaddress = BeanMapper.map(dto,
							TcrmCustomerbaseaddress.class);
					customerbaseaddress.setCreatedby(null);
					customerbaseaddress.setLastmodifiedtimestamp(DateUtil
							.getTodayTime());
					customerbaseaddress.setLastmodifiedby(dto.getCreatedby());

					cstomerbaseaddressDao
							.updateByPrimaryKeySelective(customerbaseaddress);

					TcrmCustomer customer = new TcrmCustomer();
					customer.setCustomerid(dto.getCustomerid());
					customer.setLastmodifiedtimestamp(DateUtil.getTodayTime());
					customer.setLastmodifiedby(dto.getCreatedby());
					customerDao.updateByPrimaryKey(customer);

					dto.setRtncode(APIConstant.RTNCODE_OK);
				} else {
					dto.setRtncode(APIConstant.RTNCODE_NO_DATA);
				}

			} else {
				dto.setRtncode(APIConstant.RTNCODE_NO_DATA);
			}
		} else {
			dto.setRtncode(APIConstant.RTNCODE_NO_DATA);

		}
		return dto;
	}

	@Override
	public Long customerByPersonAndType(TcrmCustomer customer) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_PERSONID, customer.getPersonid());
		paramMap.put(APIConstant.SP_CREDENTIALTYPE,
				customer.getCredentialtype());
		Long customerid = customerDao.selectByPersonAndType(paramMap);

		return customerid;
	}

	@Override
	public List<TcrmCustomeraddress> addressrByzipcodeAndAd(
			TcrmCustomeraddress address) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_CUSTID, address.getCustomerid());
		paramMap.put(APIConstant.SP_AN_ZIPCODEID, address.getZipcode());
		paramMap.put(APIConstant.SP_AN_ADDRESS2, address.getAddress2());
		customeraddressDao.fetchAddressByCustomer(paramMap);

		List<TcrmCustomeraddress> customerAndAddresses = (List<TcrmCustomeraddress>) paramMap
				.get(APIConstant.SP_RI_MSGS);

		return customerAndAddresses;
	}

	@Override
	public List<TcrmCustomeraddress> customerIsExistAddress(
			TcrmCustomeraddress address) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_CUSTID, address.getCustomerid());
		paramMap.put(APIConstant.SP_AN_ADDRESS1, address.getAddress1());
		paramMap.put(APIConstant.SP_AN_ADDRESS2, address.getAddress2());
		paramMap.put(APIConstant.SP_AN_CREATEDBY, address.getCreatedby());
		customeraddressDao.isExistAddress(paramMap);

		List<TcrmCustomeraddress> customerAndAddresses = (List<TcrmCustomeraddress>) paramMap
				.get(APIConstant.SP_RI_MSGS);

		return customerAndAddresses;
	}

	@Override
	public List<TcrmCustomer> selectCustomerByIdCardAndCardType(
			TcrmCustomer customer) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_PERSONID, customer.getPersonid());
		paramMap.put(APIConstant.SP_CREDENTIALTYPE,
				customer.getCredentialtype());
		customerDao.selectByCustomerAndAddress(paramMap);
		List<TcrmCustomer> customers = (List<TcrmCustomer>) paramMap
				.get(APIConstant.SP_RI_CUSTINFO);
		return customers;
	}

	@Override
	public List<TcrmCustomer> selectCustomerById(TcrmCustomer customer) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_AI_CUSTID, customer.getCustomerid());
		customerDao.selectCustomerAndAddressById(paramMap);
		List<TcrmCustomer> customers = (List<TcrmCustomer>) paramMap
				.get(APIConstant.SP_RI_CUSTINFO);
		return customers;
	}

	@Override
	public List<TcrmCustomeraddress> selectAddressByExample(
			TcrmCustomeraddress address) {
		return customeraddressDao.selectByCustomer(address);
	}

	@Override
	public List<TcrmCustomeraccountbalance> selectAccountBalanceById(
			TcrmCustomer customer) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_AI_CUSTID, customer.getCustomerid());
		customerDao.selectByCustomerAccountBalance(paramMap);
		List<TcrmCustomeraccountbalance> accountbalances = (List<TcrmCustomeraccountbalance>) paramMap
				.get(APIConstant.SP_RI_MSGS);
		return accountbalances;
	}

	@Override
	public List<TcrmLotterybonus> selectLotteryBonusById(TcrmCustomer customer) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_AI_CUSTID, customer.getCustomerid());
		customerDao.selectByCustomerLotteryBonus(paramMap);
		List<TcrmLotterybonus> lotterybonus = (List<TcrmLotterybonus>) paramMap
				.get(APIConstant.SP_RI_MSGS);
		return lotterybonus;
	}

	@Override
	public List<TcrmLotterybonus> selectLotteryBonusByValid(
			TcrmCustomer customer) {

		List<TcrmLotterybonus> lotterybonus = customerDao
				.customerLotteryBonusvalid(customer.getCustomerid());

		return lotterybonus;
	}

	@Override
	public Double selectLotteryBonusCountByValid(TcrmCustomer customer) {

		return customerDao.countByCustomerLotteryBonusvalid(customer
				.getCustomerid());
	}

	@Override
	public TcrmCustomer customerAvaiAmount(TcrmCustomer customer) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.P_CUSTOMERID, customer.getCustomerid());
		customerDao.customerAvaiamount(paramMap);

		java.math.BigDecimal R_AVAIAMOUNT = (java.math.BigDecimal) paramMap
				.get(APIConstant.R_AVAIAMOUNT);
		java.math.BigDecimal R_AVAIQUANTITY = (java.math.BigDecimal) paramMap
				.get(APIConstant.R_AVAIQUANTITY);
		java.math.BigDecimal R_STATUS = (java.math.BigDecimal) paramMap
				.get(APIConstant.R_SP_STATUS);
		if (R_AVAIAMOUNT != null)
			customer.setAvaiamount(R_AVAIAMOUNT.doubleValue());
		if (R_AVAIQUANTITY != null)
			customer.setAvaiquantity(R_AVAIQUANTITY.intValue());
		customer.setStatus(R_STATUS.intValue());
		return customer;
	}

	@Override
	public TcrmCustomer checkCustomerCard(TcrmCustomer customer) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.P_COUPONID, customer.getCouponid());
		paramMap.put(APIConstant.P_CARDPWD, customer.getCardpwd());

		customerDao.checkCustomerCard(paramMap);

		java.math.BigDecimal P_TRANSACTIONAMOUNT = (java.math.BigDecimal) paramMap
				.get(APIConstant.P_TRANSACTIONAMOUNT);
		java.math.BigDecimal RTN_CODE = (java.math.BigDecimal) paramMap
				.get(APIConstant.RTN_CODE);
		String RTN_MSG = (String) paramMap.get(APIConstant.RTN_MSG);
		if (P_TRANSACTIONAMOUNT != null)
			customer.setTransactionamount(P_TRANSACTIONAMOUNT.doubleValue());
		if (RTN_CODE != null)
			customer.setRtncode(RTN_CODE.intValue());
		customer.setRtnmsg(RTN_MSG);
		return customer;
	}

	@Override
	public TcrmCustomer updCustomerBalance(TcrmCustomer customer) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.P_CUSTOMERID, customer.getCustomerid());
		paramMap.put(APIConstant.P_COUPONID, customer.getCouponid());
		paramMap.put(APIConstant.P_CARDPWD, customer.getCardpwd());
		customerDao.updCustomerBalance(paramMap);

		java.math.BigDecimal R_ACOUNT = (java.math.BigDecimal) paramMap
				.get(APIConstant.R_ACOUNT);
		java.math.BigDecimal RTN_CODE = (java.math.BigDecimal) paramMap
				.get(APIConstant.RTN_CODE);
		String RTN_MSG = (String) paramMap.get(APIConstant.RTN_MSG);
		if (R_ACOUNT != null)
			customer.setAcount(R_ACOUNT.doubleValue());
		if (RTN_CODE != null)
			customer.setRtncode(RTN_CODE.intValue());
		customer.setRtnmsg(RTN_MSG);
		return customer;
	}

	@Override
	public List<TcrmCustomerEleccoupons> selectCustomerEleccoupons(
			TcrmCustomerEleccoupons customereleccoupons) {
		return customerDao.customerEleccoupons(customereleccoupons);
	}

	@Override
	public TcrmCustomer customerPaymentCod(TcrmCustomer customer) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.AS_PRODUCTID, customer.getProductid());
		paramMap.put(APIConstant.AS_PRODUCTVERSION,
				customer.getProductversion());
		paramMap.put(APIConstant.AS_CUSTOMERID, customer.getCustomerid());
		paramMap.put(APIConstant.AV_CREDITLEVELCODE,
				customer.getCustomercreditlevelid());
		paramMap.put(APIConstant.AS_ZIPCODE, customer.getZipcode());
		customerDao.customerPaymentCod(paramMap);

		java.math.BigDecimal RTN_CODE = (java.math.BigDecimal) paramMap
				.get(APIConstant.AS_RTN_CODE);
		if (RTN_CODE != null)
			customer.setRtncode(RTN_CODE.intValue());

		return customer;
	}

	@Override
	public void customerSmsSend(TcrmCustomer customer) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put(APIConstant.SP_MOBILE, customer.getMobilenumber());
		paramMap.put(APIConstant.SP_SENDMSG, customer.getSendmsg());

		customerDao.sendCustomerSms(paramMap);

	}

	@Override
	public void updcustomerLotteryBonus(TcrmLotterybonus lotterybonus) {

		TcmnBatchrequest batchrequest = new TcmnBatchrequest();

		batchrequest.setBatchid(IOAFConstants.BONUSPOINTS_AUTOBATCH_ID);
		batchrequest.setRundate(DateUtil.getToday().getTime());
		batchrequest.setRequestedby(lotterybonus.getCreatedby());
		batchrequest.setRequeststatus(IOAFConstants.INSTLNO_ZERO);
		batchDao.batchrequest(batchrequest);

		ToafBonuspointbatch bonuspointbatch = new ToafBonuspointbatch();

		bonuspointbatch
				.setTransactiontype(IOAFConstants.LOTTERY_TRANSACTIONTYPE);
		bonuspointbatch
				.setAccount_reference_type(IOAFConstants.SYSTEM_AUTO_ADD_LOTTERY);
		bonuspointbatch
				.setTransaction_details(IOAFConstants.SYSTEM_AUTO_ADD_TYPE);
		bonuspointbatch.setBatchcomment(lotterybonus.getExceptiondesc());
		bonuspointbatch.setCreatedby(lotterybonus.getCreatedby());
		bonuspointbatch.setCreatedtimestamp(DateUtil.getToday().getTime());
		bonuspointbatch.setLastmodifiedby(lotterybonus.getCreatedby());
		bonuspointbatch.setLastmodifiedtimestamp(DateUtil.getToday().getTime());
		bonuspointbatch
				.setImportresult(IOAFConstants.LOTTERY_BONUS_AUTO_IMPORT);

		bonuspointbatchDao.insertBonuspointbatch(bonuspointbatch);

		ToafBonuspointbatchdetail bonuspointbatchdetail = new ToafBonuspointbatchdetail();
		bonuspointbatchdetail.setRunbatchid(bonuspointbatch.getRunbatchid());
		bonuspointbatchdetail.setCustomerid(lotterybonus.getCustomerid());
		bonuspointbatchdetail.setOrderid(lotterybonus.getReferencevalue());
		bonuspointbatchdetail.setItemid(lotterybonus.getReferenceitem());
		bonuspointbatchdetail.setBounspointamount(lotterybonus
				.getTransactionamount());
		bonuspointbatchdetail.setCompanyid(lotterybonus.getCompanyid());
		bonuspointbatchdetail
				.setCheckresult(IOAFConstants.SYSTEM_AUTO_ADD_TYPE);
		bonuspointbatchdetail.setCreatedby(lotterybonus.getCreatedby());
		bonuspointbatchdetail
				.setCreatedtimestamp(DateUtil.getToday().getTime());
		bonuspointbatchDao.insertBonuspointbatchdetail(bonuspointbatchdetail);

		lotterybonus.setCreatedtimestamp(DateUtil.getToday().getTime());
		lotterybonus.setLastmodifiedby(lotterybonus.getCreatedby());
		lotterybonus.setLastmodifiedtimestamp(DateUtil.getToday().getTime());
		lotterybonus.setTransactiondate(DateUtil.getToday().getTime());
		lotterybonus.setReferencetypeid(IOAFConstants.LOTTERY_BONUS_SPECIALADD);
		lotterybonusDAO.insertSelective(lotterybonus);

		// TCMN_BATCHREQUEST
	}

	@Override
	public TcrmCustomerNetwork createCustomerNetwork(
			TcrmCustomerNetwork customernetwork) {
		int rtncode = IOAFConstants.rtncode;
		List<TcrmCustomerNetwork> list = this
				.selectCustomerNetwork(customernetwork);
		if (list.size() > 0) {
			customernetwork.setRtncode(rtncode);
			return customernetwork;
		}
		customernetwork.setAccountstate(IOAFConstants.ACCOUNTSTATE_VALID);
		customernetwork.setCreatedtimestamp(DateUtil.getToday().getTime());
		customernetwork.setLastmodifiedby(customernetwork.getCreatedby());
		customernetwork.setLastmodifiedtimestamp(DateUtil.getToday().getTime());
		rtncode = customerDao.insertCustomernetwork(customernetwork);
		customernetwork.setRtncode(rtncode);

		return customernetwork;
	}

	@Override
	public TcrmCustomerNetwork updateCustomerNetwork(
			TcrmCustomerNetwork customernetwork) {
		customernetwork.setCreatedtimestamp(DateUtil.getToday().getTime());
		customernetwork.setLastmodifiedtimestamp(DateUtil.getToday().getTime());
		int rtncode = customerDao.updateCustomernetwork(customernetwork);
		customernetwork.setRtncode(rtncode);

		return customernetwork;
	}

	@Override
	public List<TcrmCustomerNetwork> selectCustomerNetwork(
			TcrmCustomerNetwork customernetwork) {

		return customerDao.selectCustomerNetwork(customernetwork);
	}

	@Override
	public ContacthistoryDTO createContacthistory(ContacthistoryDTO dto) {
		TcrmContacthistory contacthistory = BeanMapper.map(dto,
				TcrmContacthistory.class);
		boolean isinsert = false;
		contacthistory.setCreatedtimestamp(DateUtil.getTodayTime());

		if (contacthistoryDao.insertSelective(contacthistory) > 0) {
			isinsert = true;

		} else {
			isinsert = false;

		}

		dto = BeanMapper.map(contacthistory, ContacthistoryDTO.class);
		if (isinsert == true) {
			dto.setRtncode(APIConstant.RTNCODE_OK);
		} else {
			dto.setRtncode(APIConstant.RTNCODE_NO_DATA);
			return dto;

		}
		TcrmContactreferencedetails contactreferencedetails = new TcrmContactreferencedetails();
		if (dto.getReferencetype() != null && dto.getReferencevalue() != null) {

			contactreferencedetails.setContactid(contacthistory.getContactid());
			contactreferencedetails.setReferencetype(dto.getReferencetype());
			contactreferencedetails.setReferencevalue(dto.getReferencevalue());
			contactreferencedetailsDao.insertSelective(contactreferencedetails);
		}
		if (dto.getCallworkcodeid() != null) {
			TcrmContactcwccomments contactcwccomments = new TcrmContactcwccomments();
			contactcwccomments.setContactid(contacthistory.getContactid());
			contactcwccomments.setCallworkcodeid(dto.getCallworkcodeid());
			contactcwccomments.setCallworkcodename(dto.getCallworkcodename());
			contactcwccomments.setCallworkcodecomments(dto
					.getCallworkcodecomments());
			if (contactreferencedetails.getContactreferenceid() != null) {
				contactcwccomments
						.setContactreferenceid(contactreferencedetails
								.getContactreferenceid());
			}
			contactcwccommentsDao.insertSelective(contactcwccomments);
		}
		// public static int CONTACTTYPE_VOICEINBOUND=1004;
		// public static int CONTACTTYPE_VOICEOUTBOUND=1005;
		if (isinsert == true
				&& contacthistory.getCustomerid() != null
				&& contacthistory.getCustomerid() > 0
				&& (contacthistory.getContacttype() == APIConstant.CONTACTTYPE_VOICEINBOUND || contacthistory
						.getContacttype() == APIConstant.CONTACTTYPE_VOICEOUTBOUND)
				|| contacthistory.getContacttype() == APIConstant.CONTACTTYPE_IVR) {
			TcrmCustomer customer = new TcrmCustomer();
			customer.setCustomerid(contacthistory.getCustomerid());
			customer.setLastcall(dto.getCallstartdate());
			customer.setLastmodifiedby(APIConstant.CTI_USER_ID);
			customer.setLastmodifiedtimestamp(DateUtil.getTodayTime());
			customerDao.updateByPrimaryKeySelective(customer);

			if (!StringUtils.isBlank(dto.getCallattendedby())) {
				TcmnUser user = userMapperDAO.selectByUserloginid(dto
						.getCallattendedby());
				if (user != null) {
					dto.setReceptionid(user.getUserid());
				} else {
					dto.setRtncode(APIConstant.RTNCODE_FAIL);
					return dto;
				}
			}

			TcrmCustomerpasswordKey vipkey = new TcrmCustomerpasswordKey();
			vipkey.setCustomerid(customer.getCustomerid());
			vipkey.setViptype(APIConstant.VIPTYPE_SERVICE);
			TcrmCustomerpassword customerpasswordvip = customerpasswordMapperDAO
					.selectByPrimaryKey(vipkey);

			if (customerpasswordvip != null
					&& StringUtils.endsWith(dto.getCallattendedby(),
							customerpasswordvip.getUserloginid())) {
				customerpasswordvip.setLastcall(dto.getCallstartdate());
				customerpasswordvip.setLastmodifiedby(APIConstant.CTI_USER_ID);
				customerpasswordvip.setLastmodifiedtimestamp(DateUtil
						.getTodayTime());

				customerpasswordMapperDAO
						.updateByPrimaryKeySelective(customerpasswordvip);
			}
			// updateByPrimaryKey
			TcrmCustomerpasswordKey key = new TcrmCustomerpasswordKey();
			key.setCustomerid(customer.getCustomerid());

			if (StringUtils.endsWithAny(dto.getVdncd(), new String[] {
					APIConstant.VDNCD_CALL_CENTER_LIVE,
					APIConstant.VDNCD_CALL_CENTER_RECORD })) {
				key.setViptype(APIConstant.VIPTYPE_CALL_CENTER);
			} else if (StringUtils.endsWithAny(dto.getVdncd(),
					new String[] { APIConstant.VDNCD_SERVICE_CALL })) {
				key.setViptype(APIConstant.VIPTYPE_SERVICE_CALL);
			} else {
				key.setViptype(APIConstant.VIPTYPE_CALL);
			}
			TcrmCustomerpassword customerpassword = customerpasswordMapperDAO
					.selectByPrimaryKey(key);

			if (customerpassword != null) {
				customerpassword.setReceptionid(dto.getReceptionid());
				customerpassword.setUserloginid(dto.getCallattendedby());
				customerpassword.setLastcall(dto.getCallstartdate());
				// customerpassword.setCreatedby(APIConstant.CTI_USER_ID);
				// customerpassword.setCreatedtimestamp(DateUtil.getTodayTime());
				customerpassword.setLastmodifiedby(APIConstant.CTI_USER_ID);
				customerpassword.setLastmodifiedtimestamp(DateUtil
						.getTodayTime());
				if (customerpasswordMapperDAO
						.updateByPrimaryKeySelective(customerpassword) > 0) {

					dto.setRtncode(APIConstant.RTNCODE_OK);
				} else {
					dto.setRtncode(APIConstant.RTNCODE_NO_DATA);

				}

			} else {
				customerpassword = new TcrmCustomerpassword();
				customerpassword.setCustomerid(customer.getCustomerid());
				customerpassword.setViptype(key.getViptype());
				customerpassword.setReceptionid(dto.getReceptionid());
				customerpassword.setUserloginid(dto.getCallattendedby());
				customerpassword.setLastcall(dto.getCallstartdate());
				customerpassword.setCreatedby(APIConstant.CTI_USER_ID);
				customerpassword.setCreatedtimestamp(DateUtil.getTodayTime());
				customerpassword.setLastmodifiedby(APIConstant.CTI_USER_ID);
				customerpassword.setLastmodifiedtimestamp(DateUtil
						.getTodayTime());

				if (customerpasswordMapperDAO.insertSelective(customerpassword) > 0) {
					dto.setRtncode(APIConstant.RTNCODE_OK);
				} else {
					dto.setRtncode(APIConstant.RTNCODE_NO_DATA);

				}
			}

		}
		return dto;

	}

	@Override
	public TcrmCustomeraccountbalance useOfAccountBalance(
			TcrmCusttransactiondetails custtransactiondetails) {
		TcrmCustomeraccountbalanceKey key = new TcrmCustomeraccountbalanceKey();
		key.setCustomerid(custtransactiondetails.getCustomerid());
		key.setAccountno(custtransactiondetails.getAccountnumber());
		key.setAccounttypeid(custtransactiondetails.getAccounttypeid());
		TcrmCustomeraccountbalance custaccountbalance = customeraccountbalanceMapperDAO
				.selectByPrimaryKey(key);
		TcrmCustomeraccountbalance accountbalance = new TcrmCustomeraccountbalance();
		accountbalance.setCustomerid(custtransactiondetails.getCustomerid());
		accountbalance.setAccountno(custtransactiondetails.getAccountnumber());
		accountbalance.setAccounttypeid(custtransactiondetails
				.getAccounttypeid());
		accountbalance.setLastmodifiedby(custtransactiondetails
				.getLastmodifiedby());
		accountbalance.setLastmodifiedtimestamp(DateUtil.getTodayTime());
		if (StringUtils.contains(custtransactiondetails.getCreditdebitflg(),
				IOAFDomainConstants.BONUS_POINTS_BATCH_TYPE_ADD_STR)) {
			accountbalance.setEffectivebalance(Arith.add(
					custaccountbalance.getEffectivebalance(),
					custtransactiondetails.getTransactionamount()));

		}
		if (StringUtils.contains(custtransactiondetails.getCreditdebitflg(),
				IOAFDomainConstants.BONUS_POINTS_BATCH_TYPE_SUBTRACTION_STR)) {
			accountbalance.setEffectivebalance(Arith.sub(
					custaccountbalance.getEffectivebalance(),
					custtransactiondetails.getTransactionamount()));

		}

		customeraccountbalanceMapperDAO
				.updateByPrimaryKeySelective(accountbalance);
		custtransactiondetails.setCreatedtimestamp(DateUtil.getTodayTime());
		custtransactiondetails
				.setLastmodifiedtimestamp(DateUtil.getTodayTime());
		custtransactiondetailsMapperDAO.insertSelective(custtransactiondetails);
		return accountbalance;
	}

	@Override
	public List<CustomerAccountBalanceDTO> depositOfAccountBalance(
			CustomerAccountBalance custaccountbalance) {
		CustomerAccountBalanceDTO dto = new CustomerAccountBalanceDTO();
		TcrmCustomeraccountbalanceExample example = new TcrmCustomeraccountbalanceExample();
		TcrmCustomeraccountbalanceExample.Criteria criteria = example
				.createCriteria();
		criteria.andCustomeridEqualTo(custaccountbalance.getCustomerid());
		criteria.andAccounttypeidEqualTo(custaccountbalance.getAccounttypeid());
		criteria.andAccountnoEqualTo(custaccountbalance.getAccountnumber());
		if (customeraccountbalanceMapperDAO.countByExample(example) == 0) {
			dto = BeanMapper.map(custaccountbalance,
					CustomerAccountBalanceDTO.class);
			dto.setRtncode(APIConstant.RTNCODE_NO_DATA);
			List<CustomerAccountBalanceDTO> dtoes = new ArrayList<CustomerAccountBalanceDTO>();
			dtoes.add(dto);
			return dtoes;
		}
		TcrmCusttransactiondetails custtransactiondetails = new TcrmCusttransactiondetails();
		custtransactiondetails
				.setCustomerid(custaccountbalance.getCustomerid());
		custtransactiondetails.setReferencevalue(custaccountbalance
				.getReferencevalue());
		custtransactiondetails.setCompanyid(custaccountbalance.getCompanyid());
		custtransactiondetails.setTransactionamount(custaccountbalance
				.getTransactionamount());
		custtransactiondetails.setTransactiondate(DateUtil.getTodayTime());
		/**
		 * *
		 * 
		 * custtransactiondetails.setCreditdebitflg(IOAFDomainConstants.
		 * BONUS_POINTS_BATCH_TYPE_ADD_STR);
		 * custtransactiondetails.setAccounttypeid
		 * (IOAFDomainConstants.ACCOUNT_TYPE_CASH);
		 * custtransactiondetails.setAccountnumber
		 * (IOAFDomainConstants.ACCOUNT_NUMBER_CASH);
		 * custtransactiondetails.setReferencetypeid
		 * (IOAFDomainConstants.REFERENCE_TYPE_ORDER);
		 * custtransactiondetails.setTransactiondetailsid
		 * (IOAFDomainConstants.TRANSACTION_DETAILS_PAYMENT_CANCEL_CASH);
		 **
		 **/
		custtransactiondetails.setReferencetypeid(custaccountbalance
				.getReferencetypeid());
		custtransactiondetails.setTransactiondetailsid(custaccountbalance
				.getTransactiondetailsid());
		custtransactiondetails.setCreditdebitflg(custaccountbalance
				.getCreditdebitflg());
		custtransactiondetails.setAccounttypeid(custaccountbalance
				.getAccounttypeid());
		custtransactiondetails.setAccountnumber(custaccountbalance
				.getAccountnumber());
		custtransactiondetails.setCreatedby(custaccountbalance.getCreatedby());
		custtransactiondetails.setLastmodifiedby(custaccountbalance
				.getCreatedby());
		custtransactiondetails.setProductid(custaccountbalance.getProductid());
		custtransactiondetails.setMulticodeid(custaccountbalance
				.getMulticodeid());
		custtransactiondetails.setOrderid(custaccountbalance.getOrderid());
		custtransactiondetails.setItemid(custaccountbalance.getItemid());
		custtransactiondetails
				.setCreditdebitflg(IOAFDomainConstants.BONUS_POINTS_BATCH_TYPE_ADD_STR);
		custtransactiondetails.setExceptiondesc(custaccountbalance
				.getExceptiondesc());

		TcrmCustomeraccountbalance obj = useOfAccountBalance(custtransactiondetails);
		TcrmCustomeraccountbalanceKey key = new TcrmCustomeraccountbalanceKey();
		key.setCustomerid(custaccountbalance.getCustomerid());
		key.setAccountno(custaccountbalance.getAccountnumber());
		key.setAccounttypeid(custaccountbalance.getAccounttypeid());

		double effectivebalance = customeraccountbalanceMapperDAO
				.sumByPrimaryKey(key);
		custaccountbalance.setEffectivebalance(effectivebalance);

		dto = BeanMapper.map(obj, CustomerAccountBalanceDTO.class);

		if (obj != null) {

			dto.setRtncode(APIConstant.RTNCODE_OK);

		} else {
			dto.setRtncode(APIConstant.RTNCODE_NO_DATA);

		}
		List<CustomerAccountBalanceDTO> dtoes = new ArrayList<CustomerAccountBalanceDTO>();
		dtoes.add(dto);
		return dtoes;

	}

	@Override
	public CustomerDTO modifyCustomer(CustomerDTO dto) {

		TcrmCustomer customer = customerDao.selectByPrimaryKey(dto
				.getCustomerid());
		if (customer != null) {
			if (customer.getIntroducerid() != null) {
				dto.setIntroducerid(null);
			}
			TcrmCustomer record = BeanMapper.map(dto, TcrmCustomer.class);
			record.setCreatedby(null);
			record.setLastmodifiedtimestamp(DateUtil.getTodayTime());
			if (customerDao.updateByPrimaryKeySelective(record) > 0) {
				dto.setRtncode(APIConstant.RTNCODE_OK);
			} else {
				dto.setRtncode(APIConstant.RTNCODE_NO_DATA);
			}
		} else {

			dto.setRtncode(APIConstant.RTNCODE_NO_DATA);
		}
		return dto;
	}

	@Override
	public CustomerBlacklistDTO queryCustomerBlack(CustomerBlacklistDTO dto) {
		TcrmCustomerblacklist customer = customerblacklistMapperDAO
				.selectByPrimaryKey(dto.getContactnumber());
		if (customer != null)
			dto = BeanMapper.map(customer, CustomerBlacklistDTO.class);
		dto.setRtncode(APIConstant.RTNCODE_OK);
		return dto;
	}

	@Override
	public CustomerBlacklistDTO createCustomerBlack(CustomerBlacklistDTO dto) {
		TcrmCustomerblacklist customer = customerblacklistMapperDAO
				.selectByPrimaryKey(dto.getContactnumber());
		if (customer != null) {
			customerblacklistMapperDAO.updateByPrimaryKeySelective(customer);
			dto = BeanMapper.map(customer, CustomerBlacklistDTO.class);
		} else {
			customer = BeanMapper.map(dto, TcrmCustomerblacklist.class);

			customer.setLastmodifiedby(customer.getCreatedby());
			customer.setCreatedtimestamp(DateUtil.getTodayTime());
			customer.setLastmodifiedtimestamp(DateUtil.getTodayTime());

			customerblacklistMapperDAO.insertSelective(customer);
			dto = BeanMapper.map(customer, CustomerBlacklistDTO.class);

		}

		dto.setRtncode(APIConstant.RTNCODE_OK);
		return dto;
	}

	@Override
	public CustomerVipDTO createCustomerPassword(CustomerVipDTO dto) {

		TcrmCustomerpasswordKey key = BeanMapper.map(dto,
				TcrmCustomerpasswordKey.class);
		TcrmCustomerpassword customer = customerpasswordMapperDAO
				.selectByPrimaryKey(key);
		if (!StringUtils.isBlank(dto.getUserloginid())) {
			TcmnUser user = userMapperDAO.selectByUserloginid(dto
					.getUserloginid());
			if (user != null) {
				dto.setReceptionid(user.getUserid());
			} else {
				dto.setRtncode(APIConstant.RTNCODE_FAIL);
				return dto;
			}
		} else {
			dto.setRtncode(APIConstant.RTNCODE_FAIL);
			return dto;
		}

		if (customer != null) {
			customer = BeanMapper.map(dto, TcrmCustomerpassword.class);
			if (dto.getFlag() == APIConstant.DATA_MODIFY) {
				// customerpassword.setCreatedby(APIConstant.CTI_USER_ID);
				// customerpassword.setCreatedtimestamp(DateUtil.getTodayTime());
				customer.setLastcall(null);
				customer.setLastmodifiedby(APIConstant.CTI_USER_ID);
				customer.setLastmodifiedtimestamp(DateUtil.getTodayTime());
				if (customerpasswordMapperDAO
						.updateByPrimaryKeySelective(customer) > 0) {

					dto.setRtncode(APIConstant.RTNCODE_OK);
				} else {
					dto.setRtncode(APIConstant.RTNCODE_NO_DATA);
				}
			}

			if (dto.getFlag() == APIConstant.DATA_DELETE) {
				if (customerpasswordMapperDAO.deleteByPrimaryKey(key) > 0) {

					dto.setRtncode(APIConstant.RTNCODE_OK);
				} else {
					dto.setRtncode(APIConstant.RTNCODE_NO_DATA);
				}
			}
			if (dto.getFlag() == APIConstant.DATA_CREATE) {
				dto.setRtncode(APIConstant.RTNCODE_EXIST);
			}
		} else {
			customer = BeanMapper.map(dto, TcrmCustomerpassword.class);
			if (dto.getFlag() == APIConstant.DATA_CREATE) {
				customer.setCreatedby(APIConstant.CTI_USER_ID);
				customer.setCreatedtimestamp(DateUtil.getTodayTime());
				customer.setLastmodifiedby(APIConstant.CTI_USER_ID);
				customer.setLastmodifiedtimestamp(DateUtil.getTodayTime());
				if (customerpasswordMapperDAO.insertSelective(customer) > 0) {
					dto.setRtncode(APIConstant.RTNCODE_OK);
				} else {
					dto.setRtncode(APIConstant.RTNCODE_NO_DATA);
				}
			}
			if (dto.getFlag() == APIConstant.DATA_DELETE) {
				dto.setRtncode(APIConstant.RTNCODE_ILLEGAL);
			}

			if (dto.getFlag() == APIConstant.DATA_MODIFY) {
				dto.setRtncode(APIConstant.RTNCODE_ILLEGAL);
			}
		}

		return dto;
	}

	@Override
	public List<CustomerDTO> queryCustomerVip(CustomerDTO dto) {
		List<CustomerDTO> dtoes = null;
		if (!StringUtils.isBlank(dto.getMobilenumber())) {
			dto.setCredentialtype(CRMConstants.CREDENTIALTYPE_MOBILENUMBER);
		}
		TcrmCustomer customer = BeanMapper.map(dto, TcrmCustomer.class);
		List<TcrmCustomer> customers = customerDao.selectCustomerVIP(customer);
		dtoes = BeanMapper.mapList(customers, CustomerDTO.class);

		return dtoes;
	}

	@Override
	public List<CallworkcodeDTO> queryCallWorkCode() {
		TcrmCallworkcodeExample example = new TcrmCallworkcodeExample();
		TcrmCallworkcodeExample.Criteria criteria = example.createCriteria();
		criteria.andStatusEqualTo(APIConstant.RECORD_STATUS_VALID);
		List<TcrmCallworkcode> callworkcodes = callworkcodeDAO
				.selectByExample(example);

		List<CallworkcodeDTO> dtoes = BeanMapper.mapList(callworkcodes,
				CallworkcodeDTO.class);
		return dtoes;
	}

	@Override
	public CustomermessageDTO sendCustomerMessage(CustomermessageDTO dto) {
		TcrmCustomermessage message = BeanMapper.map(dto,
				TcrmCustomermessage.class);
		if (!StringUtils.isBlank(dto.getUserloginid())) {
			TcmnUser user = userMapperDAO.selectByUserloginid(dto
					.getUserloginid());
			if (user != null) {
				message.setCreatedby(user.getUserid());
			} else {
				dto.setRtncode(APIConstant.RTNCODE_FAIL);
				return dto;
			}
		} else {
			dto.setRtncode(APIConstant.RTNCODE_FAIL);
			return dto;
		}
		if (dto.getPriority() == 0) {
			message.setPriority(APIConstant.CUSTOMER_SMS_PRIORITY);
		}
		message.setCreatedtimestamp(DateUtil.getTodayTime());
		message.setLastmodifiedtimestamp(DateUtil.getTodayTime());
		message.setLastmodifiedby(message.getCreatedby());
		message.setStatus(APIConstant.RECORD_STATUS_NEW);
		if (message.getPlanTime() == null) {
			message.setPlanTime(DateUtil.getTodayTime());
		}

		if (customermessageMapperDAO.insertSelective(message) > 0) {

			dto.setRtncode(APIConstant.RTNCODE_OK);

		} else {
			dto.setRtncode(APIConstant.RTNCODE_NO_DATA);

		}
		return dto;
	}

	@Override
	public CustomercontactsDTO createCustomercontacts(CustomercontactsDTO dto) {
		TcrmCustomercontactsExample example = new TcrmCustomercontactsExample();
		TcrmCustomercontactsExample.Criteria criteria = example
				.createCriteria();
		criteria.andCustomeridEqualTo(dto.getCustomerid());
		criteria.andContactnumberEqualTo(dto.getContactnumber());

		int count = customercontactsMapperDAO.countByExample(example);
		if (count > 0 && dto.getFlag() == APIConstant.DATA_CREATE) {
			dto.setRtncode(APIConstant.RTNCODE_ALREADY_EXISTS);
			return dto;
		}
		if (count == 0
				&& (dto.getFlag() == APIConstant.DATA_MODIFY || dto.getFlag() == APIConstant.DATA_DELETE)) {
			dto.setRtncode(APIConstant.RTNCODE_NO_DATA);
			return dto;
		}
		TcrmCustomer customer = customerDao.selectByPrimaryKey(dto
				.getCustomerid());

		if (customer != null) {

			TcrmCustomercontacts customercontacts = BeanMapper.map(dto,
					TcrmCustomercontacts.class);
			if (dto.getFlag() == APIConstant.DATA_MODIFY) {
				customercontacts.setLastmodifiedtimestamp(DateUtil
						.getTodayTime());
				// customercontacts.setLastmodifiedby(customercontacts.getCreatedby());
				if (customercontactsMapperDAO.updateByExampleSelective(
						customercontacts, example) > 0) {

					dto.setRtncode(APIConstant.RTNCODE_OK);
				} else {
					dto.setRtncode(APIConstant.RTNCODE_NO_DATA);
				}
			}

			if (dto.getFlag() == APIConstant.DATA_DELETE) {
				customercontacts.setStatus(APIConstant.RECORD_STATUS_INVALID);
				// customercontacts.setLastmodifiedby(customercontacts.getCreatedby());
				customercontacts.setLastmodifiedtimestamp(DateUtil
						.getTodayTime());

				if (customercontactsMapperDAO.updateByExampleSelective(
						customercontacts, example) > 0) {

					dto.setRtncode(APIConstant.RTNCODE_OK);
				} else {
					dto.setRtncode(APIConstant.RTNCODE_NO_DATA);
				}
			}
			if (dto.getFlag() == APIConstant.DATA_CREATE) {
				customercontacts.setStatus(APIConstant.RECORD_STATUS_VALID);
				customercontacts.setCreatedby(customercontacts
						.getLastmodifiedby());
				customercontacts.setCreatedtimestamp(DateUtil.getTodayTime());
				customercontacts.setLastmodifiedtimestamp(DateUtil
						.getTodayTime());
				if (customercontactsMapperDAO.insertSelective(customercontacts) > 0) {

					dto.setRtncode(APIConstant.RTNCODE_OK);
				} else {
					dto.setRtncode(APIConstant.RTNCODE_NO_DATA);
				}
			}
		} else {
			dto.setRtncode(APIConstant.RTNCODE_NO_DATA);
		}

		return dto;
	}

}
