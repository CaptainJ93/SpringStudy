package com.best1.api.webapp.mvc.crm;

import java.util.List;
import java.util.ArrayList;

import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.lang.StringUtils;

import com.best1.api.entity.crm.CustomerAccountBalance;
import com.best1.api.entity.crm.TcrmCustomer;
import com.best1.api.service.crm.CustomerManageService;
import com.best1.api.utils.APIConstant;
import com.best1.api.utils.MediaTypes;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.response.dto.crm.CallworkcodeDTO;
import com.best1.api.webservice.soap.response.dto.crm.ContacthistoryDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomerAccountBalanceDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomerAddressDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomerBlacklistDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomerDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomerVipDTO;
import com.best1.api.webservice.soap.response.dto.crm.CustomercontactsDTO;
import com.best1.api.webservice.soap.response.result.crm.CallWorkCodesResult;
import com.best1.api.webservice.soap.response.result.crm.ContacthistoryResult;
import com.best1.api.webservice.soap.response.result.crm.CustomerAccountBalanceResult;
import com.best1.api.webservice.soap.response.result.crm.CustomerAddressResult;
import com.best1.api.webservice.soap.response.result.crm.CustomerBlacklistResult;
import com.best1.api.webservice.soap.response.result.crm.CustomerResult;
import com.best1.api.webservice.soap.response.result.crm.CustomerVipResult;
import com.best1.api.webservice.soap.response.result.crm.CustomercontactsResult;
import com.best1.api.webservice.soap.response.result.crm.CustomersResult;
import com.best1.api.webservice.utils.ApiHandleError;

@RestController
public class CustomerController {
	private static Logger logger = LoggerFactory
			.getLogger(CustomerController.class);

	@Autowired
	private CustomerManageService customerManageService;

	/**
	 * 
	 {
    "customerid": 20011,
    "callstartdate": "2017-09-12 14:20:21",
    "callenddate": "2017-09-12 14:30:21",
    "contacttype": 1004,
    "emoticonid": 99,
    "message": "88",
    "duration": 9997,
    "acwenddate": "2017-09-12",
    "voicefilelocation": "VOIcedfdfd",
    "placeid": "P5087",
    "ivrpath": "332",
    "connid": "006b0168509b1834",
    "contactnumber": "18626882159",
    "vdncd": "2522",
    "callattendedby": "huwenhua",
    "referencevalue": 2726638,
    "referencetype": 1003,
    "callworkcodeid": 24,
    "callworkcodename": "配送进度查询电话小结名称",
    "callworkcodecomments": "客户信息内容小结客户输入内容"
}
	 

{
  "code" : "0",
  "message" : null,
  "contacthistory" : {
    "rtncode" : 0,
    "contactid" : 9422935,
    "customerid" : 20011,
    "callstartdate" : "2017-09-12 14:20:21",
    "callenddate" : "2017-09-12 14:30:21",
    "contacttype" : 1004,
    "createdtimestamp" : "2017-09-12 00:00:00",
    "emoticonid" : 99,
    "message" : "88",
    "duration" : 9997,
    "acwenddate" : "2017-09-12",
    "voicefilelocation" : "VOIcedfdfd",
    "placeid" : "P5087",
    "ivrpath" : "332",
    "connid" : "006b0168509b1834",
    "contactnumber" : "18626882159",
    "vdncd" : "2522",
    "callattendedby" : "huwenhua",
    "receptionid" : 30364,
    "callworkcodeid" : 24,
    "callworkcodecomments" : "客户信息内容小结客户输入内容",
    "callworkcodename" : "配送进度查询电话小结名称",
    "referencevalue" : 2726638,
    "referencetype" : 1003
  }
}
 * 
 * 
 *  {
    "customerid": 20011,
    "callstartdate": "2017-11-23 14:20:21",
    "callenddate": "2017-11-23 14:30:21",
    "contacttype": 1004,
    "emoticonid": 99,
    "message": "88",
    "duration": 9997,
    "acwenddate": "2017-09-12",
    "voicefilelocation": "VOIcedfdfd",
    "placeid": "P5087",
    "ivrpath": "332",
    "connid": "006b0168509b1834",
    "contactnumber": "18626882159",
    "vdncd": "4001188188",
    "callattendedby": "huwenhua",
    "referencevalue": 2726638,
    "referencetype": 1003,
    "callworkcodeid": 24,
    "callworkcodename": "配送进度查询电话小结名称",
    "callworkcodecomments": "客户信息内容小结客户输入内容"
}
 * 
 * */
	@RequestMapping(value = "/crm/contacthistory/insert", produces = MediaTypes.JSON_UTF_8)
	public ContacthistoryResult contactHistory(
			@RequestBody ContacthistoryDTO dto) {
		/**
		 * @RequestParam(value = "customerid", required = false) Long
		 *                     customerid,
		 * @RequestParam(value = "callstartdate", required = false) String
		 *                     callstartdate,
		 * @RequestParam(value = "callenddate", required = false) String
		 *                     callenddate,
		 * @RequestParam(value = "contacttype", required = false) Integer
		 *                     contacttype,
		 * @RequestParam(value = "createdtimestamp", required = false) String
		 *                     createdtimestamp,
		 * @RequestParam(value = "emoticonid", required = false) Integer
		 *                     emoticonid,
		 * @RequestParam(value = "message", required = false) String message,
		 * @RequestParam(value = "duration", required = false) Long duration,
		 * @RequestParam(value = "acwenddate", required = false) String
		 *                     acwenddate,
		 * @RequestParam(value = "voicefilelocation", required = false) String
		 *                     voicefilelocation,
		 * @RequestParam(value = "placeid", required = false) String placeid,
		 * @RequestParam(value = "ivrpath", required = false) String ivrpath,
		 * @RequestParam(value = "connid", required = false) String connid,
		 * @RequestParam(value = "contactnumber", required = false) String
		 *                     contactnumber,
		 * @RequestParam(value = "vdncd", required = false) String vdncd,
		 * @RequestParam(value = "callattendedby", required = false) String
		 *                     callattendedby
		 */
		logger.info("客户通话");
		ContacthistoryResult result = new ContacthistoryResult();

		try {
			/***
			 * TcrmContacthistory contacthistory = new TcrmContacthistory();
			 * contacthistory.setCustomerid(customerid);
			 * contacthistory.setCallstartdate(DateUtil.convertStringToDate(
			 * DateUtil.YYYY_MM_DD, callstartdate));
			 * contacthistory.setCallenddate(DateUtil.convertStringToDate(
			 * DateUtil.YYYY_MM_DD, callenddate));
			 * contacthistory.setContacttype(contacttype);
			 * contacthistory.setCreatedtimestamp(DateUtil.convertStringToDate(
			 * DateUtil.YYYY_MM_DD, createdtimestamp));
			 * contacthistory.setEmoticonid(emoticonid);
			 * contacthistory.setMessage(message);
			 * contacthistory.setDuration(duration);
			 * contacthistory.setAcwenddate(DateUtil.convertStringToDate(
			 * DateUtil.YYYY_MM_DD, acwenddate));
			 * contacthistory.setVoicefilelocation(voicefilelocation);
			 * contacthistory.setPlaceid(placeid);
			 * contacthistory.setIvrpath(ivrpath);
			 * contacthistory.setConnid(connid);
			 * contacthistory.setContactnumber(contactnumber);
			 * contacthistory.setVdncd(vdncd);
			 * contacthistory.setCallattendedby(callattendedby);
			 **/
			logger.info("客户代码:"+dto.getCustomerid());
			logger.info("客户通话_Contactnumber:"+dto.getContactnumber());
			logger.info("客户通话_VDNCD:"+dto.getVdncd());
			dto = customerManageService.createContacthistory(dto);

			result.setContacthistory(dto);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}

	@RequestMapping(value = "/crm/customeraccount/deposit", method = { RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public CustomerAccountBalanceResult deposit(
			@RequestBody CustomerAccountBalance custaccountbalance) {
		logger.info("冲值");
		CustomerAccountBalanceResult result = new CustomerAccountBalanceResult();
		try {
			/**
			 * 
			 * 
			 * {"customerid":"2019", "accounttypeid":"4185",
			 * "accountnumber":"3002", "referencevalue":"1222", "companyid":"2",
			 * "transactionamount":"500", "createdby":"30364",
			 * "referencetypeid":"4410", "transactiondetailsid":"1047",
			 * "productid":"110888", "multicodeid":"2110888" }
			 * 
			 */
			Validate.notNull(
					custaccountbalance.getCustomerid(),
					"客户customerid获取错误(customerid:"
							+ custaccountbalance.getCustomerid() + ")");
			Validate.notNull(
					custaccountbalance.getAccounttypeid(),
					"客tAccounttypeid获取错误(Accounttypeid:"
							+ custaccountbalance.getAccounttypeid() + ")");
			Validate.notNull(
					custaccountbalance.getAccountnumber(),
					"客户Accountnumber获取错误(Accountnumber:"
							+ custaccountbalance.getAccountnumber() + ")");
			Validate.notNull(
					custaccountbalance.getReferencevalue(),
					"客户referencevalue获取错误(referencevalue:"
							+ custaccountbalance.getReferencevalue() + ")");

			Validate.notNull(custaccountbalance.getReferencetypeid(),
					"客户referencetypeid获取错误(referencetypeid:"
							+ custaccountbalance.getReferencetypeid() + ")");
			Validate.notNull(custaccountbalance.getTransactiondetailsid(),
					"客户Transactiondetailsid获取错误(Transactiondetailsid:"
							+ custaccountbalance.getTransactiondetailsid()
							+ ")");
			Validate.notNull(
					custaccountbalance.getProductid(),
					"客户Productid获取错误(Productid:"
							+ custaccountbalance.getProductid() + ")");
			Validate.notNull(
					custaccountbalance.getMulticodeid(),
					"客户Multicodeid获取错误(Multicodeid:"
							+ custaccountbalance.getMulticodeid() + ")");
			List<CustomerAccountBalanceDTO> dtoes = customerManageService
					.depositOfAccountBalance(custaccountbalance);
			result.setCustomeraccountbalances(dtoes);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}

	@RequestMapping(value = "/crm/customer/modify", method = { RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public CustomerResult modifyCustomer(@RequestBody CustomerDTO dto) {
		logger.info("修改客户信息");
		CustomerResult result = new CustomerResult();
		try {
			Validate.notNull(dto.getCustomerid(), "客户Customerid获取错误(Customerid:"
					+ dto.getCustomerid() + ")");
			Validate.notNull(dto.getLastmodifiedby(), "客户Lastmodifiedby获取错误(Lastmodifiedby:"
					+ dto.getLastmodifiedby() + ")");
			customerManageService.modifyCustomer(dto);
			result.setCustomer(dto);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@RequestMapping(value = "/crm/customer/querybyPsnidAndIdType", method = { RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public CustomerResult custidFromPsnidAndIdType(@RequestBody CustomerDTO dto) {
		CustomerResult result = new CustomerResult();
		try {

			TcrmCustomer customer = new TcrmCustomer();

			Validate.notNull(dto.getPersonid(), "客户Personid获取错误(personid:"
					+ dto.getPersonid() + ")");
			Validate.notNull(
					dto.getCredentialtype(),
					"客户credentialtype获取错误(credentialtype:"
							+ dto.getCredentialtype() + ")");
			customer.setPersonid(dto.getPersonid());
			customer.setCredentialtype(dto.getCredentialtype());
			Long customerid = customerManageService
					.customerByPersonAndType(customer);
			if (customerid == null || customerid == 0) {
				customer.setCustomerid(null);
			} else {
				customer.setCustomerid(customerid);
			}
			dto = BeanMapper.map(customer, CustomerDTO.class);
			dto.setRtncode(APIConstant.RTNCODE_OK);
			result.setCustomer(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	/**
	 * 
	 * 
	 { "contactnumber":"015962161631" }
	 * 
	 * { "code" : "0", "message" : null, "customerblacklistDTO" : { "rtncode" :
	 * 0, "contactnumber" : "015962161631", "contacttype" : 1000, "telcall" :
	 * 1001,1001黑名单 } }
	 * */

	@RequestMapping(value = "/crm/customer/queryBlack", method = { RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public CustomerBlacklistResult customerBlack(
			@RequestBody CustomerBlacklistDTO dto) {
		CustomerBlacklistResult result = new CustomerBlacklistResult();
		try {
			Validate.notNull(dto.getContactnumber(),
					"Contactnumber获取错误(Contactnumber:" + dto.getContactnumber()
							+ ")");
			dto = customerManageService.queryCustomerBlack(dto);
			result.setCustomerblacklist(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

/**
	 * 
 {
 "customerid": 20011, 
"viptype": 1001,
 "userloginid": "huwenhua" ,
"flag":1000
}

	 * 
	 * 

{
  "code" : "0",
  "message" : null,
  "customervip" : {
    "rtncode" : 0,
    "customerid" : 20011,
    "receptionid" : 30364,
    "userloginid" : "huwenhua",
    "viptype" : 1001,
    "flag" : 1000
  }
}

* */
	@RequestMapping(value = "/crm/customer/createVip", method = { RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public CustomerVipResult createCustomerVip(@RequestBody CustomerVipDTO dto) {
		logger.info("VIP客户建立");
		CustomerVipResult result = new CustomerVipResult();
		try {
			Validate.notNull(dto.getCustomerid(), "Customer获取错误(Customerid:"	+ dto.getCustomerid() + ")");
		//	Validate.notNull(dto.getReceptionid(), "Customer获取错误(Receptionid:"		+ dto.getReceptionid()+ ")");
			Validate.notNull(dto.getUserloginid(), "Customer获取错误(Userloginid:"+ dto.getUserloginid()+ ")");
			dto = customerManageService.createCustomerPassword(dto);
			result.setCustomervip(dto);
		
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}
/**
 * 
 {
    "mobilenumber": "13588892615"
}

{
    "code": "0",
    "message": null,
    "url": null,
    "customers": [
        {
            "customerid": 20013,
            "membershiplevelid": 32,
            "lastcall": "2017-11-23 14:20:21",
            "receptionid": "30364",
            "userloginid": "huwenhua",
            "viptype": 1003
        },
        {
            "customerid": 20013,
            "membershiplevelid": 32,
            "lastcall": "2017-11-23 14:20:21",
            "receptionid": "30364",
            "userloginid": "huwenhua",
            "viptype": 1002
        },
        {
            "customerid": 20013,
            "membershiplevelid": 32,
            "receptionid": "30385",
            "userloginid": "huwenhua",
            "viptype": 1001
        },
        {
            "customerid": 20013,
            "membershiplevelid": 32,
            "receptionid": "30367",
            "userloginid": "huwen",
            "viptype": 1000
        }
    ]
}


{
    "hometelephoneareacode": "0571",
    "hometelephonenumber":"86877391"
}



{
  "code" : "0",
  "message" : null,
  "customer" : {
    "rtncode" : 0,
    "customerid" : 277
  }
}

 * 
 * 
 * */
	@RequestMapping(value = "/crm/customer/queryCustomerVip", method = { RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public CustomersResult querycustomerVip(@RequestBody CustomerDTO dto) {
		logger.info("VIP客户查询");
		CustomersResult result = new CustomersResult();
		 List<CustomerDTO> dtoes=new ArrayList<CustomerDTO> ();;
		try {
			// Validate.notNull(dto.getMobilenumber(),
			// "Mobilenumber获取错误(Mobilenumber:" + dto.getMobilenumber() + ")");
			// hometelephonenumber
			//
			// || (StringUtils.isBlank(dto.getHometelephoneareacode()) &&
			// StringUtils
			// .isBlank(dto.getHometelephonenumber()))
			if (StringUtils.isBlank(dto.getMobilenumber())
					&& StringUtils.isBlank(dto.getHometelephoneareacode())
					&& StringUtils.isBlank(dto.getHometelephonenumber())) {
				dto.setRtncode(APIConstant.RTNCODE_FAIL);
				dtoes.add(dto);

			} else {
				dtoes = customerManageService.queryCustomerVip(dto);
			}
			result.setCustomers(dtoes);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}
	
	
	
	@RequestMapping(value = "/crm/customer/callworkcode", method = { RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public CallWorkCodesResult queryCallWorkcode() {
		CallWorkCodesResult result = new CallWorkCodesResult();
		try {
			List<CallworkcodeDTO> dtoes=customerManageService.queryCallWorkCode();
			result.setCallworkcodes(dtoes);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}
	
/**
 * 
 
{"customerid":20011,
"addressid":5116378,
"iscontactaddress":"Y",
"createdby":30384
}

返回
{
  "code" : "0",
  "message" : null,
  "customeraddress" : {
    "rtncode" : 0,
    "addressid" : 1030682,
    "customerid" : 20011,
    "iscontactaddress" : "Y",
    "createdby" : 30384
  }
}


 * **/	
	
	@RequestMapping(value = "/crm/customeraddress/modify", method = { RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public CustomerAddressResult modifyCustomerAddress(@RequestBody  CustomerAddressDTO dto) {
		CustomerAddressResult result = new CustomerAddressResult();
		try {
			dto=customerManageService.modifyCustomerAddress(dto);
			result.setCustomeraddress(dto);
			
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
		return result;
	}
	
	/***
	 * 
	 * 
 {
   "customerid": "20011",
   "lastmodifiedby":"30364",
   "relationship":1000,
   "contacttype":1000,
   "contactnumber":"18626882159",
   "flag":1000
}


{
    "code": "0",
    "message": null,
    "url": null,
    "customercontacts": {
        "rtncode": 0,
        "customerid": 20011,
        "lastmodifiedby": 30364,
        "relationship": 1000,
        "contacttype": 1000,
        "contactnumber": "18626882159",
        "flag": 1000
    }
}

	 * @param dto
	 * @return
	 */
	@RequestMapping(value = "/crm/customer/contacts", method = { RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public CustomercontactsResult createCustomercontacts(@RequestBody CustomercontactsDTO dto) {
		logger.info("客户关系联系方式");
		CustomercontactsResult result = new CustomercontactsResult();
		try {
			Validate.notNull(dto.getCustomerid(), "Customer获取错误(Customerid:"	+ dto.getCustomerid() + ")");
		//	Validate.notNull(dto.getReceptionid(), "Customer获取错误(Receptionid:"		+ dto.getReceptionid()+ ")");
			Validate.notNull(dto.getContactnumber(), "Customer获取错误(Contactnumber:"+ dto.getContactnumber()+ ")");
			dto = customerManageService.createCustomercontacts(dto);
			result.setCustomercontacts(dto);
		
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}
	
}
