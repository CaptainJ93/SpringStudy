package com.best1.api.webservice.soap.scm.impl;

import java.util.Date;
import java.util.List;

import javax.jws.WebService;

import org.apache.commons.lang3.Validate;
import org.apache.cxf.feature.Features;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.best1.api.entity.scm.product.TscmProductsclass;
import com.best1.api.entity.scm.spm.TcmnSpmuser;
import com.best1.api.entity.scm.supplier.TscmSupplieraddress;
import com.best1.api.entity.scm.supplier.TscmSupplieraddressExample;
import com.best1.api.entity.scm.supplier.TscmSupplierbusiness;
import com.best1.api.entity.scm.supplier.TscmSupplierbusinessExample;
import com.best1.api.entity.scm.supplier.TscmSuppliercontract;
import com.best1.api.entity.scm.supplier.TscmSuppliercontractExample;
import com.best1.api.entity.scm.supplier.TscmSupplierdelivery;
import com.best1.api.entity.scm.supplier.TscmSupplierdeliveryExample;
import com.best1.api.entity.scm.supplier.TscmSuppliermaster;
import com.best1.api.entity.scm.supplier.TscmSuppliermasterExample;
import com.best1.api.entity.scm.supplier.TscmSupplierpendaddress;
import com.best1.api.entity.scm.supplier.TscmSupplierpendbusiness;
import com.best1.api.entity.scm.supplier.TscmSupplierpending;
import com.best1.api.service.scm.SupplierManageService;
import com.best1.api.utils.DateUtil;
import com.best1.api.utils.SCMConstant;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.response.dto.scm.ProductClassDTO;
import com.best1.api.webservice.soap.response.dto.scm.SpmSupplierAddressDTO;
import com.best1.api.webservice.soap.response.dto.scm.SpmSupplierBusinessDTO;
import com.best1.api.webservice.soap.response.dto.scm.SpmSupplierDTO;
import com.best1.api.webservice.soap.response.dto.scm.SupplieraddressDTO;
import com.best1.api.webservice.soap.response.dto.scm.SupplierbusinessDTO;
import com.best1.api.webservice.soap.response.dto.scm.SuppliercontractDTO;
import com.best1.api.webservice.soap.response.dto.scm.SupplierdeliveryDTO;
import com.best1.api.webservice.soap.response.dto.scm.SuppliermasterDTO;
import com.best1.api.webservice.soap.response.result.scm.ProductClassResult;
import com.best1.api.webservice.soap.response.result.scm.SpmSupplierAddressResult;
import com.best1.api.webservice.soap.response.result.scm.SpmSupplierBusinessResult;
import com.best1.api.webservice.soap.response.result.scm.SpmSupplierResult;
import com.best1.api.webservice.soap.response.result.scm.SpmUserResult;
import com.best1.api.webservice.soap.response.result.scm.SupplieraddresssResult;
import com.best1.api.webservice.soap.response.result.scm.SupplierbusinesssResult;
import com.best1.api.webservice.soap.response.result.scm.SuppliercontractsResult;
import com.best1.api.webservice.soap.response.result.scm.SupplierdeliverysResult;
import com.best1.api.webservice.soap.response.result.scm.SuppliermasterResult;
import com.best1.api.webservice.soap.response.result.scm.SuppliermastersResult;
import com.best1.api.webservice.soap.scm.SupplierSoapService;
import com.best1.api.webservice.utils.ApiHandleError;
import com.best1.api.webservice.utils.WsConstants;

@WebService(serviceName = "SupplierService", endpointInterface = "com.best1.api.webservice.soap.scm.SupplierSoapService", targetNamespace = WsConstants.NS)
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class SupplierSoapServiceImpl implements SupplierSoapService {

	private static Logger logger = LoggerFactory
			.getLogger(SupplierSoapServiceImpl.class);

	@Autowired
	SupplierManageService supplierManageService;

	@Override
	public SpmSupplierResult supplierBaseInfo(Long supplierid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SpmSupplierResult spmSupplierRegister(Long assigneduserid,
			Integer preferredcontactmethod, Long defaultproductname,
			String contactperson, String suppliercompanyname, Long createdby,
			Integer paymentday, Integer paymentmethod, Long maxloadqty,
			Integer supplierlevel, Long groupid, String hascod,
			String ishistory, Date permissiongrantdate,
			String representativename, String accountholdername,
			String accountno, String otherdetailsfinance,
			String logisticdetails, Long targetuserid, String comments,
			Long bankid, String ignoreseminar, String suppliername,
			Integer noofemployees, String supplierregno,
			String registrationdoneby, Long turnoverpreviousyear,
			Long noofproductsdealt, String productdetails,
			Long revenuegenerated, Date foundationday, String companyhomepage,
			String contactpersonnamefinance, String contactpersonnamelogistics,
			String contactpersonrole, String contactdepartment,
			String supervisorname, String contactpersonemailid,
			String contactpersoncountrycode, String contactpersonareacode,
			String contactpersonphoneno, String contactpersonextension,
			String contactpersonfaxareacode, String contactpersonfaxno,
			String contactpersonmobileno) {

		SpmSupplierResult result = new SpmSupplierResult();
		try {
			Validate.notNull(preferredcontactmethod,
					"preferredcontactmethod参数不允许为空！");
			Validate.notNull(noofemployees, "noofemployees参数不允许为空！");
			Validate.notNull(noofproductsdealt, "noofproductsdealt参数不允许为空！");
			Validate.notNull(turnoverpreviousyear,
					"turnoverpreviousyear参数不允许为空！");
			Validate.notNull(revenuegenerated, "revenuegenerated参数不允许为空！");
			Validate.notNull(suppliername, "suppliername参数不允许为空！");
			Validate.notNull(defaultproductname, "defaultproductname参数不允许为空！");
			Validate.notNull(contactperson, "contactperson参数不允许为空！");
			Validate.notNull(registrationdoneby, "registrationdoneby参数不允许为空！");

			TscmSupplierpending supplierpending = new TscmSupplierpending();
			supplierpending.setVersion(SCMConstant.SCM_SUPPLIER_VERSION);
			supplierpending.setAssigneduserid(assigneduserid);
			supplierpending
					.setApprovalstatus(SCMConstant.SCM_SUPPLIER_REGISTER_IN_SPM);
			supplierpending.setPreferredcontactmethod(preferredcontactmethod);
			supplierpending.setNoofemployees(noofemployees);
			supplierpending.setNoofproductsdealt(noofproductsdealt);
			supplierpending.setTurnoverpreviousyear(turnoverpreviousyear);
			supplierpending.setRevenuegenerated(revenuegenerated);
			supplierpending
					.setHassignedcontract(SCMConstant.SCM_HAS_SIGNED_CONTRACT);
			supplierpending.setSuppliername(suppliername);
			supplierpending.setDefaultproductname(defaultproductname);
			supplierpending.setContactperson(contactperson);
			supplierpending.setContactpersonrole(contactpersonrole);
			supplierpending.setContactdepartment(contactdepartment);
			supplierpending.setContactpersonemailid(contactpersonemailid);
			supplierpending.setRegistrationdoneby(registrationdoneby);
			supplierpending.setSuppliercompanyname(suppliercompanyname);
			supplierpending.setCompanyhomepage(companyhomepage);
			supplierpending.setCreatedby(createdby);
			supplierpending.setLastmodifiedby(createdby);
			supplierpending.setPaymentday(paymentday);
			supplierpending.setPaymentmethod(paymentmethod);
			supplierpending.setMaxloadqty(maxloadqty);
			supplierpending.setSupplierlevel(supplierlevel);
			supplierpending.setGroupid(groupid);
			supplierpending
					.setPermissiongrantstatus(SCMConstant.PERMISSION_GRANT_STATUS);
			supplierpending.setHascod(hascod);
			supplierpending.setIshistory(ishistory);
			supplierpending.setFoundationday(foundationday);
			supplierpending.setPermissiongrantdate(permissiongrantdate);
			supplierpending
					.setContactpersonnamefinance(contactpersonnamefinance);
			supplierpending
					.setContactpersonnamelogistics(contactpersonnamelogistics);
			supplierpending.setRepresentativename(representativename);
			supplierpending.setAccountholdername(accountholdername);
			supplierpending.setAccountno(accountno);
			supplierpending.setSupervisorname(supervisorname);
			supplierpending.setOtherdetailsfinance(otherdetailsfinance);
			supplierpending.setLogisticdetails(logisticdetails);
			supplierpending
					.setContactpersoncountrycode(contactpersoncountrycode);
			supplierpending.setContactpersonareacode(contactpersonareacode);
			supplierpending.setContactpersonphoneno(contactpersonphoneno);
			supplierpending.setContactpersonextension(contactpersonextension);
			supplierpending
					.setContactpersonfaxcountrycode(SCMConstant.SCM_COUNTRY_CODE);
			supplierpending
					.setContactpersonfaxareacode(contactpersonfaxareacode);
			supplierpending.setContactpersonfaxno(contactpersonfaxno);
			supplierpending.setTargetuserid(targetuserid);
			supplierpending.setCreatedtimestamp(DateUtil.getTodayTime());
			supplierpending.setLastmodifiedtimestamp(DateUtil.getTodayTime());
			supplierpending.setContactpersonmobileno(contactpersonmobileno);
			supplierpending.setComments(comments);
			supplierpending.setBankid(bankid);
			supplierpending.setProductdetails(productdetails);
			supplierpending.setSupplierregno(supplierregno);
			supplierpending.setWithPki(SCMConstant.SCM_WITH_PKI);
			supplierpending.setIgnoreseminar(ignoreseminar);
			TcmnSpmuser spmUser = new TcmnSpmuser();
			spmUser.setUsername(suppliername);
			spmUser.setMobileno(contactpersonmobileno);
			spmUser.setEmailid(contactpersonemailid);
			spmUser.setCreatedby(createdby);
			spmUser.setUserloginid(supplierregno);

			supplierpending = supplierManageService.addSupplierInfo(
					supplierpending, spmUser);

			SpmSupplierDTO dto = BeanMapper.map(supplierpending,
					SpmSupplierDTO.class);
			result.setSuppliers(dto);

		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

		return result;
	}

	@Override
	public SpmSupplierAddressResult supplierAddressInfo(Long supplierrecordid,
			Integer addresssequence, Integer addresstype) {

		return null;
	}

	@Override
	public SpmSupplierAddressResult supplierAddressRegister(
			Long supplierrecordid, Integer addresstype, Long createdby,
			String isdefault, String contactpersoname, String mobilenumber,
			Integer country, String zipcode, String address1, String address2,
			String officephoneareacode, String officephonenumber,
			String officeextension, String faxcountrycode, String faxareacode,
			String faxnumber) {

		SpmSupplierAddressResult result = new SpmSupplierAddressResult();
		try {
			Validate.notNull(supplierrecordid, "supplierrecordid参数不允许为空！");
			Validate.notNull(addresstype, "addresstype参数不允许为空！");
			Validate.notNull(contactpersoname, "contactpersoname参数不允许为空！");
			Validate.notNull(country, "country参数不允许为空！");
			Validate.notNull(zipcode, "zipcode参数不允许为空！");
			Validate.notNull(address1, "address1参数不允许为空！");
			Validate.notNull(address2, "address2参数不允许为空！");

			TscmSupplierpendaddress supplierpendAddress = new TscmSupplierpendaddress();
			supplierpendAddress.setSupplierrecordid(supplierrecordid);
			supplierpendAddress.setAddresstype(addresstype);
			supplierpendAddress.setCreatedby(createdby);
			supplierpendAddress.setLastmodifiedby(createdby);
			supplierpendAddress.setIsdefault(isdefault);
			supplierpendAddress.setContactpersoname(contactpersoname);
			supplierpendAddress.setMobilenumber(mobilenumber);
			supplierpendAddress.setCountry(country);
			supplierpendAddress.setZipcode(zipcode);
			supplierpendAddress.setAddress1(address1);
			supplierpendAddress.setAddress2(address2);
			supplierpendAddress
					.setOfficephonecountrycode(SCMConstant.SCM_COUNTRY_CODE);
			supplierpendAddress.setOfficephoneareacode(officephoneareacode);
			supplierpendAddress.setOfficephonenumber(officephonenumber);
			supplierpendAddress.setOfficeextension(officeextension);
			supplierpendAddress.setFaxcountrycode(faxcountrycode);
			supplierpendAddress.setFaxareacode(faxareacode);
			supplierpendAddress.setFaxnumber(faxnumber);
			supplierpendAddress.setCreatedtimestamp(DateUtil.getTodayTime());
			supplierpendAddress.setLastmodifiedtimestamp(DateUtil
					.getTodayTime());
			supplierpendAddress = supplierManageService
					.addSupplierAddressInfo(supplierpendAddress);

			SpmSupplierAddressDTO dto = BeanMapper.map(supplierpendAddress,
					SpmSupplierAddressDTO.class);
			result.setSupplierAddress(dto);

			return result;

		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}

	@Override
	public SpmSupplierBusinessResult supplierBusinessInfo(Long supplierid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SpmSupplierBusinessResult supplierBusinessRegister(
			Long supplierrecordid, String isdefault, Integer businesstype) {

		SpmSupplierBusinessResult result = new SpmSupplierBusinessResult();
		try {
			Validate.notNull(supplierrecordid, "supplierrecordid参数不允许为空！");
			Validate.notNull(businesstype, "businesstype参数不允许为空！");

			TscmSupplierpendbusiness supplierpendbusiness = new TscmSupplierpendbusiness();
			supplierpendbusiness.setSupplierrecordid(supplierrecordid);
			supplierpendbusiness.setBusinesstype(businesstype);
			supplierpendbusiness.setIsdefault(isdefault);

			supplierpendbusiness = supplierManageService
					.addSupplierBussiness(supplierpendbusiness);

			SpmSupplierBusinessDTO dto = BeanMapper.map(supplierpendbusiness,
					SpmSupplierBusinessDTO.class);
			result.setSupplierBusiness(dto);

		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

		return result;
	}

	@Override
	public SpmUserResult spmUserInfo(Long userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductClassResult scmProductClassInfo(Long supplierid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductClassResult scmProductClassRegister(Long supplierid,
			Integer productsclass, Integer productmclass) {

		ProductClassResult result = new ProductClassResult();
		try {
			Validate.notNull(supplierid, "supplierid参数不允许为空！");
			Validate.notNull(productsclass, "productsclass参数不允许为空！");
			Validate.notNull(productmclass, "productmclass参数不允许为空！");

			TscmProductsclass productClass = new TscmProductsclass();
			productClass.setSupplierid(supplierid);
			productClass.setProductsclass(productsclass);
			productClass.setProductmclass(productmclass);

			productClass = supplierManageService
					.addTscmProductsClass(productClass);

			ProductClassDTO dto = BeanMapper.map(productClass,
					ProductClassDTO.class);
			result.setProductClass(dto);

		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

		return result;
	}

	@Override
	public SuppliermasterResult supplierMasterInfo(Long supplierid) {
		SuppliermasterResult result = new SuppliermasterResult();
		try {
			Validate.notNull(supplierid, "supplierid参数不允许为空！");

			TscmSuppliermaster suppliermaster = new TscmSuppliermaster();
			suppliermaster.setSupplierid(supplierid);

			suppliermaster = supplierManageService
					.selectTscmSuppliermasterByKey(supplierid);

			SuppliermasterDTO dto = BeanMapper.map(suppliermaster,
					SuppliermasterDTO.class);
			result.setSuppliermaster(dto);

		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

		return result;
	}

	@Override
	public SuppliermastersResult supplierMasterInfos(Date createdtimestamp) {
		SuppliermastersResult result = new SuppliermastersResult();
		try {
			Validate.notNull(createdtimestamp, "createdtimestamp参数不允许为空！");

			TscmSuppliermasterExample suppliermaster = new TscmSuppliermasterExample();
			TscmSuppliermasterExample.Criteria criteria = suppliermaster
					.createCriteria();
			criteria.andCreatedtimestampEqualTo(createdtimestamp);

			List<TscmSuppliermaster> tscmSuppliermasters = supplierManageService
					.selectTscmSuppliermasterByExample(suppliermaster);

			List<SuppliermasterDTO> dtos = BeanMapper.mapList(
					tscmSuppliermasters, SuppliermasterDTO.class);
			result.setSuppliermasters(dtos);

		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

		return result;
	}

	@Override
	public SupplierdeliverysResult supplierDeliveryInfo(Long supplierid) {
		SupplierdeliverysResult result = new SupplierdeliverysResult();
		try {
			Validate.notNull(supplierid, "supplierid参数不允许为空！");

			TscmSupplierdeliveryExample supplierdelivery = new TscmSupplierdeliveryExample();
			TscmSupplierdeliveryExample.Criteria criteria = supplierdelivery
					.createCriteria();
			criteria.andSupplieridEqualTo(supplierid);

			List<TscmSupplierdelivery> tscmSupplierdeliverys = supplierManageService
					.selectTscmSupplierdeliveryByExample(supplierdelivery);

			List<SupplierdeliveryDTO> dtos = BeanMapper.mapList(
					tscmSupplierdeliverys, SupplierdeliveryDTO.class);
			result.setSupplierdeliverys(dtos);

		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

		return result;
	}

	@Override
	public SuppliercontractsResult supplierContractInfo(Long supplierid) {
		SuppliercontractsResult result = new SuppliercontractsResult();
		try {
			Validate.notNull(supplierid, "supplierid参数不允许为空！");

			TscmSuppliercontractExample example = new TscmSuppliercontractExample();
			TscmSuppliercontractExample.Criteria criteria = example
					.createCriteria();
			criteria.andSupplieridEqualTo(supplierid);

			List<TscmSuppliercontract> tscmSuppliercontract = supplierManageService
					.selectTscmSuppliercontractByExample(example);

			List<SuppliercontractDTO> dtos = BeanMapper.mapList(
					tscmSuppliercontract, SuppliercontractDTO.class);
			result.setSuppliercontracts(dtos);

		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

		return result;
	}

	@Override
	public SupplierbusinesssResult supplierBusinessInfos(Long supplierid) {
		SupplierbusinesssResult result = new SupplierbusinesssResult();
		try {
			Validate.notNull(supplierid, "supplierid参数不允许为空！");

			TscmSupplierbusinessExample example = new TscmSupplierbusinessExample();
			TscmSupplierbusinessExample.Criteria criteria = example
					.createCriteria();
			criteria.andSupplieridEqualTo(supplierid);

			List<TscmSupplierbusiness> tscmSupplierbusiness = supplierManageService
					.selectTscmSupplierbusinessByExample(example);

			List<SupplierbusinessDTO> dtos = BeanMapper.mapList(
					tscmSupplierbusiness, SupplierbusinessDTO.class);
			result.setSupplierbusinesss(dtos);

		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

		return result;
	}

	@Override
	public SupplieraddresssResult supplierAddresssInfo(Long supplierid) {
		SupplieraddresssResult result = new SupplieraddresssResult();
		try {
			Validate.notNull(supplierid, "supplierid参数不允许为空！");

			TscmSupplieraddressExample example = new TscmSupplieraddressExample();
			TscmSupplieraddressExample.Criteria criteria = example
					.createCriteria();
			criteria.andSupplieridEqualTo(supplierid);

			List<TscmSupplieraddress> tscmSupplieraddresss = supplierManageService
					.selectTscmSupplieraddressByExample(example);

			List<SupplieraddressDTO> dtos = BeanMapper.mapList(
					tscmSupplieraddresss, SupplieraddressDTO.class);
			result.setSupplieraddresss(dtos);

		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

		return result;
	}

}
