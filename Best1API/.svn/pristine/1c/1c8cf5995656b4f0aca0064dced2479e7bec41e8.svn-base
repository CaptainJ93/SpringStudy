package com.best1.api.webservice.soap.scm;


import javax.jws.WebParam;
import javax.jws.WebService;

import com.best1.api.utils.APIConstant;
import com.best1.api.utils.SCMConstant;
import com.best1.api.webservice.soap.response.dto.scm.WebSendProductImage;
import com.best1.api.webservice.soap.response.result.scm.ProductInfosResult;
import com.best1.api.webservice.soap.response.result.scm.ProductResult;
import com.best1.api.webservice.soap.response.result.scm.ProductcolourstyleResult;
import com.best1.api.webservice.soap.response.result.scm.ProductcolourstylesResult;
import com.best1.api.webservice.soap.response.result.scm.ProductgeneralResult;
import com.best1.api.webservice.soap.response.result.scm.ProductgeneralsResult;
import com.best1.api.webservice.soap.response.result.scm.ProductimageResult;
import com.best1.api.webservice.soap.response.result.scm.ProductlogisticsResult;
import com.best1.api.webservice.soap.response.result.scm.ProductsResult;
import com.best1.api.webservice.soap.response.result.scm.ProductwarehousesResult;
import com.best1.api.webservice.soap.response.result.scm.SpmProductattributeResult;
import com.best1.api.webservice.soap.response.result.scm.SpmProductwarehousesResult;
import com.best1.api.webservice.soap.response.result.scm.SpmProductResult;
import com.best1.api.webservice.soap.response.result.scm.SpmProductcolourstyleResult;
import com.best1.api.webservice.soap.response.result.scm.SpmProductgeneralReult;
import com.best1.api.webservice.soap.response.result.scm.TscmSpmscmProductResult;
import com.best1.api.webservice.utils.WsConstants;

@WebService(name = "ProductService", targetNamespace = WsConstants.NS)
public interface ProductSoapService {

	/**
	 * 商品基本信息
	 * */
	public ProductInfosResult productBaseInfo(
			@WebParam(name = APIConstant.PRODUCTID) Long productid);

	/**
	 * 商品可接单量
	 * 
	 * */
	public ProductcolourstyleResult productColourStyleInfo(
			@WebParam(name = APIConstant.PRODUCTID) Long productid,
			@WebParam(name = APIConstant.COLOURCODE) Integer colourcode,
			@WebParam(name = APIConstant.STYLECODE) Integer stylecode);

	/**
	 * 商品基本信息List
	 * */
	public ProductsResult queryproductInfoes(
			@WebParam(name = APIConstant.STARTDATE) String startdate,
			@WebParam(name = APIConstant.ENDDATE) String enddate);

	/**
	 * 通过供应代码_公司代码_商品基本信息List
	 * */
	public ProductsResult queryProductBySupplier(
			@WebParam(name = APIConstant.SUPPLIERID) Long supplierid,
			@WebParam(name = APIConstant.COMPANYID) Long companyid,
			@WebParam(name = APIConstant.STARTDATE) String startdate,
			@WebParam(name = APIConstant.ENDDATE) String enddate);

	/**
	 * 商品基本信息
	 * */
	public ProductsResult queryproductInfo(
			@WebParam(name = APIConstant.PRODUCTID) Long productid,
			@WebParam(name = APIConstant.PRODUCTVERSION) Integer productversion);

	/**
	 * 商品颜色款式
	 * */
	public ProductcolourstylesResult queryproductcolourstyle(
			@WebParam(name = APIConstant.PRODUCTID) Long productid);

	/**
	 * 商品包装信息，主商品信息等
	 * */
	public ProductgeneralsResult queryproductgeneral(
			@WebParam(name = APIConstant.PRODUCTID) Long productid);

	/**
	 * 商品配送方式
	 * */
	public ProductlogisticsResult queryproductlogistic(
			@WebParam(name = APIConstant.PRODUCTID) Long productid);

	/**
	 * 商品仓库
	 * */
	public ProductwarehousesResult queryproductwarehouse(
			@WebParam(name = APIConstant.PRODUCTID) Long productid);

	/**
	 * 商品颜色
	 * */
	public ProductcolourstylesResult queryproductcolour(
			@WebParam(name = APIConstant.PRODUCTID) Long productid);

	/**
	 * 商品款式
	 * */
	public ProductcolourstylesResult queryproductstyle(
			@WebParam(name = APIConstant.PRODUCTID) Long productid);

	/**
	 * 商品可接单理
	 * */
	public ProductcolourstyleResult queryproductstock(
			@WebParam(name = APIConstant.PRODUCTID) Long productid,
			@WebParam(name = APIConstant.PRODUCTVERSION) Integer productversion,
			@WebParam(name = APIConstant.COLOURCODE) Integer colourcode,
			@WebParam(name = APIConstant.COLOURCLASS) Integer colourclass,
			@WebParam(name = APIConstant.STYLECODE) Integer stylecode,
			@WebParam(name = APIConstant.STYLECLASS) Integer styleclass

	);

	/**
	 * SPM商品导入
	 * */
	public SpmProductResult productSpmImport(
			@WebParam(name = SCMConstant.SUPPLIERID) Long supplierid,
			@WebParam(name = SCMConstant.MANUFACTURERNAME) String manufacturername,
			@WebParam(name = SCMConstant.PRODUCTCATEGORY) Integer productcategory,
			@WebParam(name = SCMConstant.MAXIMUMQUANTITY) Long maximumquantity,
			@WebParam(name = SCMConstant.COSTPRICE) Double costprice,
			@WebParam(name = SCMConstant.REALSUPPLIERID) Long realsupplierid,
			@WebParam(name = SCMConstant.REALSUPPLIERNAME) String realsuppliername,
			@WebParam(name = SCMConstant.PRODUCTNAME1) String productname1,
			@WebParam(name = SCMConstant.PRODUCTNAME2) String productname2,
			@WebParam(name = SCMConstant.CREATEDBY) Long createdby,
			@WebParam(name = SCMConstant.LEADTIME) Integer leadtime,
			@WebParam(name = SCMConstant.ECONOMICORDERQUANTITY) Long economicorderquantity,
			@WebParam(name = SCMConstant.MAXIMUMDISCOUNTQUANTITY) Long maximumdiscountquantity,
			@WebParam(name = SCMConstant.QUANTITYPROCESSEDPERDAY) Long quantityprocessedperday,
			@WebParam(name = SCMConstant.WIDTHBEFOREPACKING) Double widthbeforepacking,
			@WebParam(name = SCMConstant.WIDTHAFTERPACKING) Double widthafterpacking,
			@WebParam(name = SCMConstant.HEIGHTBEFOREPACKING) Double heightbeforepacking,
			@WebParam(name = SCMConstant.HEIGHTAFTERPACKING) Double heightafterpacking,
			@WebParam(name = SCMConstant.LENGTHBEFOREPACKING) Double lengthbeforepacking,
			@WebParam(name = SCMConstant.LENGTHAFTERPACKING) Double lengthafterpacking,
			@WebParam(name = SCMConstant.WEIGHTBEFOREPACKING) Double weightbeforepacking,
			@WebParam(name = SCMConstant.WEIGHTAFTERPACKING) Double weightafterpacking,
			@WebParam(name = SCMConstant.WARRANTYPERIOD) Integer warrantyperiod,
			@WebParam(name = SCMConstant.SELLINGPRICE) Double sellingprice,
			@WebParam(name = SCMConstant.MARKETPRICE) Double marketprice,
			@WebParam(name = SCMConstant.SHIPPINGPRICE) Double shippingprice,
			@WebParam(name = SCMConstant.OFFSHOREDELIVERY) String offshoredelivery,
			@WebParam(name = SCMConstant.GIFTPACKAGE) String giftpackage,
			@WebParam(name = SCMConstant.USERMANUAL) String usermanual,
			@WebParam(name = SCMConstant.WARRANTY) String warranty,
			@WebParam(name = SCMConstant.BRANDNAME) String brandname,
			@WebParam(name = SCMConstant.MANUFACTURINGPLACE) String manufacturingplace,
			@WebParam(name = SCMConstant.NOTESFORDELIVERY) String notesfordelivery,
			@WebParam(name = SCMConstant.BOXID) String boxid,
			@WebParam(name = SCMConstant.DELIVERYTYPE) Integer deliverytype,
			@WebParam(name = SCMConstant.RETURNTYPE) Integer returntype,
			@WebParam(name = SCMConstant.SUBDELIVERYTYPE) Integer subdeliverytype,
			@WebParam(name = SCMConstant.SUBRETURNTYPE) Integer subreturntype,
			@WebParam(name = SCMConstant.SALESTYPE) Integer salestype,
			@WebParam(name = SCMConstant.COMMISIONTYPE) Integer commisiontype,
			@WebParam(name = SCMConstant.COMMISSIONRATE) Double commissionrate,
			@WebParam(name = SCMConstant.LCLASSCODE) Integer lclasscode,
			@WebParam(name = SCMConstant.MCLASSCODE) Integer mclasscode,
			@WebParam(name = SCMConstant.SCLASSCODE) Integer sclasscode,
			@WebParam(name = SCMConstant.PURCHASEID) Long purchaseid,
			@WebParam(name = SCMConstant.MDID) Long mdid,
			@WebParam(name = SCMConstant.POTYPE) Integer potype,
			@WebParam(name = SCMConstant.COMPANYID) Long companyid);

	/**
	 * SPM商品颜色款式导入
	 * */
	public SpmProductcolourstyleResult productcolourstyleSpmImport(
			@WebParam(name = SCMConstant.PRODUCTID) Long productid,
			@WebParam(name = SCMConstant.COLOURCODE) Integer colourcode,
			@WebParam(name = SCMConstant.COLOURCLASS) Integer colourclass,
			@WebParam(name = SCMConstant.STYLECODE) Integer stylecode,
			@WebParam(name = SCMConstant.STYLECLASS) Integer styleclass,
			@WebParam(name = SCMConstant.CREATEDBY) Long createdby,
			@WebParam(name = SCMConstant.FORSALE) String forsale,
			@WebParam(name = SCMConstant.QUANTITY) Long quantity);

	/**
	 * SPM商品说明导入
	 * */
	public SpmProductgeneralReult productgeneralsSpmImport(
			@WebParam(name = SCMConstant.PRODUCTID) Long productid,
			@WebParam(name = SCMConstant.GENERALINFOCODE) Integer generalinfocode,
			@WebParam(name = SCMConstant.COMMENTS) String comments,
			@WebParam(name = SCMConstant.COMMENTTYPE) String commenttype,
			@WebParam(name = SCMConstant.CREATEDBY) Long createdby);

	/**
	 * SPM商品图片导入
	 * */
	public ProductimageResult productimageSpmImport(
			@WebParam(name = SCMConstant.PRDIMAGE) WebSendProductImage prdimage);

	/**
	 * SPM商品仓库导入
	 * 
	 * @return SpmProductwarehousesResult
	 */
	public SpmProductwarehousesResult productwarehouserSpmImport(
			@WebParam(name = SCMConstant.PRODUCTID) Long productid,
			@WebParam(name = SCMConstant.WAREHOUSEID) Long warehouseid,
			@WebParam(name = SCMConstant.CREATEDBY) Long createdby);

	/**
	 * SPM商品属性导入
	 * 
	 * @return SpmProductattributeResult
	 */
	public SpmProductattributeResult productattributeSpmImport(
			@WebParam(name = SCMConstant.PRODUCTID) Long productid,
			@WebParam(name = SCMConstant.ATTRIBUTECATEGORYID) Integer attributecategoryid,
			@WebParam(name = SCMConstant.ATTRIBUTEVALUE) Integer attributevalue,
			@WebParam(name = SCMConstant.CREATEDBY) Long createdby);

	/**
	 * 佣金商品资料修改
	 * 
	 */
	public ProductResult changeProductInfoByCommission(
			@WebParam(name = SCMConstant.PRODUCTID) Long productid,
			@WebParam(name = SCMConstant.LASTMODIFIEDBY) Long lastmodifiedby,
			@WebParam(name = SCMConstant.COSTPRICE) Double costprice,
			@WebParam(name = SCMConstant.SELLINGPRICE) Double sellingprice,
			@WebParam(name = SCMConstant.MARKETPRICE) Double marketprice,
			@WebParam(name = SCMConstant.MEMBERPRICE) Double memberprice,
			@WebParam(name = SCMConstant.WARRANTYPERIOD) Integer warrantyperiod,
			@WebParam(name = SCMConstant.MAXIMUMQUANTITY) Long maximumquantity,
			@WebParam(name = SCMConstant.ECONOMICORDERQUANTITY) Long economicorderquantity,
			@WebParam(name = SCMConstant.MAXIMUMDISCOUNTQUANTITY) Long maximumdiscountquantity,
			@WebParam(name = SCMConstant.QUANTITYPROCESSEDPERDAY) Long quantityprocessedperday,
			@WebParam(name = SCMConstant.SURPRISEPRICE) Double surpriseprice);
	
	/**
	 * 佣金商品增加颜色款式
	 */
	public ProductcolourstyleResult addProductColourStyleByCommission(
			@WebParam(name = SCMConstant.PRODUCTID) Long productid,
			@WebParam(name = SCMConstant.COLOURCODE) Integer colourcode,
			@WebParam(name = SCMConstant.COLOURCLASS) Integer colourclass,
			@WebParam(name = SCMConstant.STYLECODE) Integer stylecode,
			@WebParam(name = SCMConstant.STYLECLASS) Integer styleclass,
			@WebParam(name = SCMConstant.CREATEDBY) Long createdby,
			@WebParam(name = SCMConstant.FORSALE) String forsale,
			@WebParam(name = SCMConstant.QUANTITY) Long quantity);
	
	/**
	 * 佣金商品修改颜色款式是否可销售或下架
	 */
	public ProductcolourstyleResult changeProductColourStyleByCommission(
			@WebParam(name = SCMConstant.PRODUCTID) Long productid,
			@WebParam(name = SCMConstant.COLOURCODE) Integer colourcode,
			@WebParam(name = SCMConstant.COLOURCLASS) Integer colourclass,
			@WebParam(name = SCMConstant.STYLECODE) Integer stylecode,
			@WebParam(name = SCMConstant.STYLECLASS) Integer styleclass,
			@WebParam(name = SCMConstant.LASTMODIFIEDBY) Long lastmodifiedby,
			@WebParam(name = SCMConstant.FORSALE) String forsale,
			@WebParam(name = SCMConstant.QUANTITY) Long quantity);
	
	/**
	 * 佣金商品添加主商品规格说明
	 */
	public ProductgeneralResult addProductGeneralByCommission(
			@WebParam(name = SCMConstant.PRODUCTID) Long productid,
			@WebParam(name = SCMConstant.COMMENTS) String comments,
			@WebParam(name = SCMConstant.COMMENTTYPE) String commenttype,
			@WebParam(name = SCMConstant.CREATEDBY) Long createdby);
	
	/**
	 * 获取spm商品储存后的商品ID,即scm商品代码
	 */
	public TscmSpmscmProductResult queryScmProductId(
			@WebParam(name = SCMConstant.SPMPRODUCTID) Long spmProductId);
}
