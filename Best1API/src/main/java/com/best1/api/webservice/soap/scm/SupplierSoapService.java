package com.best1.api.webservice.soap.scm;

import java.util.Date;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.best1.api.utils.SCMConstant;
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
import com.best1.api.webservice.utils.WsConstants;

@WebService(name = "SupplierService", targetNamespace = WsConstants.NS)
public interface SupplierSoapService {
	
	/**
	 * 厂商基本信息
	 */
	public SpmSupplierResult supplierBaseInfo(
			@WebParam(name = SCMConstant.SUPPLIERRECORDID) Long SUPPLIERRECORDID
			);
	
	/**
	 * SPM厂商注册
	 */
	public SpmSupplierResult spmSupplierRegister(
			@WebParam(name = SCMConstant.ASSIGNEDUSERID) Long assigneduserid,
			@WebParam(name = SCMConstant.PREFERREDCONTACTMETHOD) Integer preferredcontactmethod,
			@WebParam(name = SCMConstant.DEFAULTPRODUCTNAME) Long defaultproductname,
			@WebParam(name = SCMConstant.CONTACTPERSON) String contactperson,
			@WebParam(name = SCMConstant.SUPPLIERCOMPANYNAME) String suppliercompanyname,
			@WebParam(name = SCMConstant.CREATEDBY) Long createdby,
			@WebParam(name = SCMConstant.PAYMENTDAY) Integer paymentday,
			@WebParam(name = SCMConstant.PAYMENTMETHOD) Integer paymentmethod,
			@WebParam(name = SCMConstant.MAXLOADQTY) Long maxloadqty,
			@WebParam(name = SCMConstant.SUPPLIERLEVEL) Integer supplierlevel,
			@WebParam(name = SCMConstant.GROUPID) Long groupid,
			@WebParam(name = SCMConstant.HASCOD) String hascod,
			@WebParam(name = SCMConstant.ISHISTORY) String ishistory,
			@WebParam(name = SCMConstant.PERMISSIONGRANTDATE) Date permissiongrantdate,
			@WebParam(name = SCMConstant.REPRESENTATIVENAME) String representativename,
			@WebParam(name = SCMConstant.ACCOUNTHOLDERNAME) String accountholdername,
			@WebParam(name = SCMConstant.ACCOUNTNO) String accountno,
			@WebParam(name = SCMConstant.OTHERDETAILSFINANCE) String otherdetailsfinance,
			@WebParam(name = SCMConstant.LOGISTICDETAILS) String logisticdetails,
			@WebParam(name = SCMConstant.TARGETUSERID) Long targetuserid,
			@WebParam(name = SCMConstant.COMMENTS) String comments,
			@WebParam(name = SCMConstant.BANKID) Long bankid,
			@WebParam(name = SCMConstant.IGNORESEMINAR) String ignoreseminar,
			@WebParam(name = SCMConstant.SUPPLIERNAME) String suppliername,
			@WebParam(name = SCMConstant.NOOFEMPLOYEES) Integer noofemployees,
			@WebParam(name = SCMConstant.SUPPLIERREGNO) String supplierregno,
			@WebParam(name = SCMConstant.REGISTRATIONDONEBY) String registrationdoneby,
			@WebParam(name = SCMConstant.TURNOVERPREVIOUSYEAR) Long turnoverpreviousyear, 
			@WebParam(name = SCMConstant.NOOFPRODUCTSDEALT) Long noofproductsdealt,
			@WebParam(name = SCMConstant.PRODUCTDETAILS) String productdetails,
			@WebParam(name = SCMConstant.REVENUEGENERATED) Long revenuegenerated,
			@WebParam(name = SCMConstant.FOUNDATIONDAY) Date foundationday,
			@WebParam(name = SCMConstant.COMPANYHOMEPAGE) String companyhomepage,
			@WebParam(name = SCMConstant.CONTACTPERSONNAMEFINANCE) String contactpersonnamefinance,
			@WebParam(name = SCMConstant.CONTACTPERSONNAMELOGISTICS) String contactpersonnamelogistics,
			@WebParam(name = SCMConstant.CONTACTPERSONROLE) String contactpersonrole,
			@WebParam(name = SCMConstant.CONTACTDEPARTMENT) String contactdepartment,
			@WebParam(name = SCMConstant.SUPERVISORNAME) String supervisorname,
			@WebParam(name = SCMConstant.CONTACTPERSONEMAILID) String contactpersonemailid,
			@WebParam(name = SCMConstant.CONTACTPERSONCOUNTRYCODE) String contactpersoncountrycode,
			@WebParam(name = SCMConstant.CONTACTPERSONAREACODE) String contactpersonareacode,
			@WebParam(name = SCMConstant.CONTACTPERSONPHONENO) String contactpersonphoneno,
			@WebParam(name = SCMConstant.CONTACTPERSONEXTENSION) String contactpersonextension,
			@WebParam(name = SCMConstant.CONTACTPERSONFAXAREACODE) String contactpersonfaxareacode,
			@WebParam(name = SCMConstant.CONTACTPERSONFAXNO) String contactpersonfaxno,
			@WebParam(name = SCMConstant.CONTACTPERSONMOBILENO) String contactpersonmobileno
			
			);
	
	/**
	 * 厂商地址信息
	 */
	public SpmSupplierAddressResult supplierAddressInfo(
			@WebParam(name = SCMConstant.SUPPLIERRECORDID) Long supplierrecordid,
			@WebParam(name = SCMConstant.ADDRESSSEQUENCE) Integer addresssequence,
			@WebParam(name = SCMConstant.ADDRESSTYPE) Integer addresstype
			);
	
	/**
	 * SPM厂商地址
	 */
	public SpmSupplierAddressResult supplierAddressRegister(
			@WebParam(name = SCMConstant.SUPPLIERRECORDID) Long supplierrecordid,
			@WebParam(name = SCMConstant.ADDRESSTYPE) Integer addresstype,
			@WebParam(name = SCMConstant.CREATEDBY) Long createdby,
			@WebParam(name = SCMConstant.ISDEFAULT) String isdefault,
			@WebParam(name = SCMConstant.CONTACTPERSONAME) String contactpersoname,
			@WebParam(name = SCMConstant.MOBILENUMBER) String mobilenumber,
			@WebParam(name = SCMConstant.COUNTRY) Integer country,
			@WebParam(name = SCMConstant.ZIPCODE) String zipcode,
			@WebParam(name = SCMConstant.ADDRESS1) String address1,
			@WebParam(name = SCMConstant.ADDRESS2) String address2,
			@WebParam(name = SCMConstant.OFFICEPHONEAREACODE) String officephoneareacode,
			@WebParam(name = SCMConstant.OFFICEPHONENUMBER) String officephonenumber,
			@WebParam(name = SCMConstant.OFFICEEXTENSION) String officeextension,
			@WebParam(name = SCMConstant.FAXCOUNTRYCODE) String faxcountrycode,
			@WebParam(name = SCMConstant.FAXAREACODE) String faxareacode,
			@WebParam(name = SCMConstant.FAXNUMBER) String faxnumber  
			
			);
	
	/**
	 * 厂商类别信息
	 */
	public SpmSupplierBusinessResult supplierBusinessInfo(
			@WebParam(name = SCMConstant.SUPPLIERRECORDID) Long supplierrecordid
			);
	
	/**
	 * SPM厂商类别
	 */
	public SpmSupplierBusinessResult supplierBusinessRegister(
			@WebParam(name = SCMConstant.SUPPLIERRECORDID) Long supplierrecordid,
			@WebParam(name = SCMConstant.ISDEFAULT) String isdefault,
			@WebParam(name = SCMConstant.BUSINESSTYPE) Integer businesstype
			
			);
	
	/**
	 * SPM用户信息
	 */
	public SpmUserResult spmUserInfo(
			@WebParam(name = SCMConstant.USERID) Long userid
			);
	
	/**
	 * 商品分类信息
	 */
	public ProductClassResult scmProductClassInfo(
			@WebParam(name = SCMConstant.SUPPLIERID) Long supplierid
			);
	
	/**
	 * 商品分类
	 */
	public ProductClassResult scmProductClassRegister(
			@WebParam(name = SCMConstant.SUPPLIERID) Long supplierid,
			@WebParam(name = SCMConstant.PRODUCTSCLASS) Integer productsclass,
			@WebParam(name = SCMConstant.PRODUCTMCLASS) Integer productmclass
			);
	
	/**
	 * 厂商信息
	 */
	public SuppliermasterResult supplierMasterInfo(
			@WebParam(name = SCMConstant.SUPPLIERID) Long supplierid
			);
	
	/**
	 * 厂商信息
	 */
	public SuppliermastersResult supplierMasterInfos(
			@WebParam(name = SCMConstant.CREATEDTIMESTAMP) Date createdtimestamp
			);
	
	/**
	 * 厂商物流
	 */
	public SupplierdeliverysResult supplierDeliveryInfo(
			@WebParam(name = SCMConstant.SUPPLIERID) Long supplierid
			);
	
	/**
	 * 厂商合同
	 */
	public SuppliercontractsResult supplierContractInfo(
			@WebParam(name = SCMConstant.SUPPLIERID) Long supplierid
			);
	
	/**
	 * 厂商业务
	 */
	public SupplierbusinesssResult supplierBusinessInfos(
			@WebParam(name = SCMConstant.SUPPLIERID) Long supplierid
			);
		
	/**
	 * 厂商地址
	 */
	public SupplieraddresssResult supplierAddresssInfo(
			@WebParam(name = SCMConstant.SUPPLIERID) Long supplierid
			);
	
}
