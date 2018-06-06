package com.best1.api.client.scm.supplier;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.best1.api.webservice.soap.response.result.scm.SpmSupplierResult;
import com.best1.api.webservice.soap.scm.SupplierSoapService;

@WebServlet("/SupplierTestServlet")
public class SupplierTestServlet extends HttpServlet {

	private static final Logger logger = LoggerFactory
			.getLogger(SupplierTestServlet.class);

	private static final long serialVersionUID = 9030803067815242682L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		logger.info("Supplier Testing begins");
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.setServiceClass(SupplierSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/scm/supplierservice");
		
		
		SupplierSoapService service = (SupplierSoapService) factory.create();
		
		
		//厂商信息(测试已OK)
		Long assigneduserid = 30364L;
		Integer preferredcontactmethod = 1001;
		Integer noofemployees = 1000;
		Long noofproductsdealt = 10l;
		Long turnoverpreviousyear = 80000l;
		Long revenuegenerated = 900000l;
		String suppliername = "上海证券交易所";
		Long defaultproductname = 60401l;
		String contactperson = "萌萌哒";
		String contactpersonrole = "COO";
		String contactdepartment = "研发部";
		String contactpersonemailid = "creaway@163.com";
		String registrationdoneby = "萌萌哒";
		String suppliercompanyname = "上海证券交易所";
		String companyhomepage = "www.creaway.com";
		Long createdby = 304301l;
		Integer paymentday = 2;
		Integer paymentmethod = 2;
		Long maxloadqty = 2l;
		Integer supplierlevel = 2;
		Long groupid = 2l;
		String hascod = null;
		String ishistory = "N";
		Date foundationday = new Date();
		Date permissiongrantdate = null;
		String contactpersonnamefinance = null;
		String contactpersonnamelogistics = null;
		String representativename = null;
		String accountholdername = null;
		String accountno = null;
		String supervisorname = "萌萌哒";
		String otherdetailsfinance = null;
		String logisticdetails = null;
		String contactpersoncountrycode = "86";
		String contactpersonareacode = "021";
		String contactpersonphoneno = "65423198";
		String contactpersonextension = null;
		String contactpersonfaxareacode = null;
		String contactpersonfaxno = null;
		Long targetuserid = 2l;
		String contactpersonmobileno = "15205579876";
		String comments = "这里的产品真的不错噢！，快来看看吧。";
		Long bankid = 2l;
		String productdetails = null;
		String supplierregno = "88888888333333";
		String ignoreseminar = null;
		
		 SpmSupplierResult result = service.spmSupplierRegister(
				 assigneduserid, preferredcontactmethod, defaultproductname, contactperson, suppliercompanyname,
				 createdby, paymentday, paymentmethod, maxloadqty, supplierlevel, groupid, hascod, ishistory, 
				 permissiongrantdate, representativename, accountholdername, accountno, otherdetailsfinance, logisticdetails,
				 targetuserid, comments, bankid, ignoreseminar, suppliername, noofemployees, supplierregno, registrationdoneby, 
				 turnoverpreviousyear, noofproductsdealt, productdetails, revenuegenerated, foundationday, companyhomepage, 
				 contactpersonnamefinance, contactpersonnamelogistics, contactpersonrole, contactdepartment, supervisorname,
				 contactpersonemailid, contactpersoncountrycode, contactpersonareacode, contactpersonphoneno, contactpersonextension, 
				 contactpersonfaxareacode, contactpersonfaxno, contactpersonmobileno);
		
		
		//厂商地址(测试已OK)
		Long supplierrecordid = result.getSuppliers().getSupplierrecordid();
		Integer addresssequence = 12;
		Integer addresstype = 1001;
		String isdefault = "Y";
		String contactpersoname = "Kobe";
		String mobilenumber = "15205816762";
		Integer country = 9004;
		String zipcode = "310000";
		String address1 = "浙江省杭州市";
		String address2 = "下沙街道";
		String officephoneareacode = "0571";
		String officephonenumber = "56775999";
		String officeextension = null;
		String faxcountrycode = null;
		String faxareacode = null;
		String faxnumber = null;

		service.supplierAddressRegister(
				supplierrecordid, addresstype, createdby,
				isdefault, contactpersoname, mobilenumber, country, zipcode, address1, 
				address2, officephoneareacode, officephonenumber, officeextension, 
				faxcountrycode,faxareacode, faxnumber);
		
		
		
		//厂商类别(测试已OK)
		 Integer businesstype = 1002;
		 
		 service.supplierBusinessRegister(supplierrecordid, isdefault, businesstype);

		 
		//产品分类(测试已OK)
		Long supplierid = result.getSuppliers().getSupplierid();
	    Integer productsclass = 60401;
	    Integer productmclass = 60400;
	    
	    service.scmProductClassRegister(supplierid, productsclass, productmclass);
		
	}
}
