package com.best1.api.webservice.soap.scm.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.activation.DataHandler;
import javax.jws.WebService;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang3.Validate;
import org.apache.cxf.feature.Features;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;




import com.best1.api.entity.scm.product.ProductInfo;
import com.best1.api.entity.scm.product.TscmProduct;
import com.best1.api.entity.scm.product.TscmProductcolourstyle;
import com.best1.api.entity.scm.product.TscmProductgeneral;
import com.best1.api.entity.scm.product.TscmProductimage;
import com.best1.api.entity.scm.product.TscmProductlogistic;
import com.best1.api.entity.scm.product.TscmProductwarehouse;
import com.best1.api.entity.scm.product.TspmProductattribute;
import com.best1.api.entity.scm.product.TspmProductwarehouse;
import com.best1.api.entity.scm.spm.TscmSpmscmproduct;
import com.best1.api.entity.scm.spm.TspmProduct;
import com.best1.api.entity.scm.spm.TspmProductcolourstyle;
import com.best1.api.entity.scm.spm.TspmProductgeneral;
import com.best1.api.service.scm.ProductManageSerevice;
import com.best1.api.service.scm.SpmProductManageSerevice;
import com.best1.api.utils.SCMConstant;
import com.best1.api.utils.bean.BeanMapper;
import com.best1.api.webservice.soap.response.dto.scm.ProductDTO;
import com.best1.api.webservice.soap.response.dto.scm.ProductInfoDTO;
import com.best1.api.webservice.soap.response.dto.scm.ProductcolourstyleDTO;
import com.best1.api.webservice.soap.response.dto.scm.ProductgeneralDTO;
import com.best1.api.webservice.soap.response.dto.scm.ProductimageDTO;
import com.best1.api.webservice.soap.response.dto.scm.ProductlogisticDTO;
import com.best1.api.webservice.soap.response.dto.scm.ProductwarehouseDTO;
import com.best1.api.webservice.soap.response.dto.scm.SpmProductattributeDTO;
import com.best1.api.webservice.soap.response.dto.scm.SpmProductwarehouseDTO;
import com.best1.api.webservice.soap.response.dto.scm.SpmProductDTO;
import com.best1.api.webservice.soap.response.dto.scm.SpmProductcolourstyleDTO;
import com.best1.api.webservice.soap.response.dto.scm.SpmProductgeneralDTO;
import com.best1.api.webservice.soap.response.dto.scm.TscmSpmscmproductDTO;
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
import com.best1.api.webservice.soap.scm.ProductSoapService;
import com.best1.api.webservice.utils.ApiHandleError;
import com.best1.api.webservice.utils.WsConstants;
//serviceName指明WSDL中<wsdl:service>与<wsdl:binding>元素的名称,
//endpointInterface属性指向Interface类全称.

@WebService(serviceName = "ProductService", endpointInterface = "com.best1.api.webservice.soap.scm.ProductSoapService", targetNamespace = WsConstants.NS)
// 增加inbound/outbound SOAP内容的日志
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class ProductSoapServiceImpl implements ProductSoapService {
	private static Logger logger = LoggerFactory
			.getLogger(ProductSoapServiceImpl.class);
	@Autowired
	private ProductManageSerevice productManageSerevice;

	@Autowired
	private SpmProductManageSerevice spmproductManageSerevice;
	

	

	@Override
	public ProductInfosResult productBaseInfo(Long productid) {
		ProductInfosResult result = new ProductInfosResult();
		try {
			Validate.notNull(productid, "productid参数为空");
			ProductInfo product = new ProductInfo();
			product.setProductid(productid);
			List<ProductInfo> productInfoes = productManageSerevice
					.selectProductInfoById(product);

			List<ProductInfoDTO> dtoes = BeanMapper.mapList(productInfoes,
					ProductInfoDTO.class);
			result.setProducts(dtoes);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public ProductcolourstyleResult productColourStyleInfo(Long productid,
			Integer colourcode, Integer stylecode) {
		ProductcolourstyleResult result = new ProductcolourstyleResult();
		try {
			Validate.notNull(productid, "productid参数为空");
			Validate.notNull(colourcode, "colourcode参数为空");
			Validate.notNull(stylecode, "stylecode参数为空");
			TscmProductcolourstyle prdcolsty = new TscmProductcolourstyle();
			prdcolsty.setProductid(productid);
			prdcolsty.setColourcode(colourcode);
			prdcolsty.setStylecode(stylecode);
			Long prodavailqty = productManageSerevice
					.porductAvailQty(prdcolsty);
			prdcolsty.setQuantity(prodavailqty);
			ProductcolourstyleDTO dto = BeanMapper.map(prdcolsty,
					ProductcolourstyleDTO.class);
			result.setProductcolourstyle(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public ProductsResult queryproductInfo(Long productid,
			Integer productversion) {
		ProductsResult result = new ProductsResult();
		try {
			Validate.notNull(productid, "productid参数为空");
			Validate.notNull(productversion, "productversion参数为空");
			TscmProduct product = new TscmProduct();
			product.setProductid(productid);
			product.setProductversion(productversion);

			List<TscmProduct> products = productManageSerevice
					.selectInfoByProduct(product);

			List<ProductDTO> dtoes = BeanMapper.mapList(products,
					ProductDTO.class);
			result.setProducts(dtoes);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public ProductsResult queryproductInfoes(String startdate, String enddate) {
		ProductsResult result = new ProductsResult();
		try {
			Validate.notNull(startdate, "startdate参数为空");
			Validate.notNull(enddate, "enddate参数为空");
			TscmProduct product = new TscmProduct();
			product.setStartdate(startdate);
			product.setEnddate(enddate);
			List<TscmProduct> products = productManageSerevice
					.selectInfoByProduct(product);

			List<ProductDTO> dtoes = BeanMapper.mapList(products,
					ProductDTO.class);
			result.setProducts(dtoes);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public ProductcolourstylesResult queryproductcolourstyle(Long productid) {
		ProductcolourstylesResult result = new ProductcolourstylesResult();
		try {
			Validate.notNull(productid, "productid参数为空");
			TscmProductcolourstyle prdcolsty = new TscmProductcolourstyle();
			prdcolsty.setProductid(productid);
			List<TscmProductcolourstyle> prdcolstys = productManageSerevice
					.selectProductColourStyleByProduct(prdcolsty);

			List<ProductcolourstyleDTO> dtoes = BeanMapper.mapList(prdcolstys,
					ProductcolourstyleDTO.class);
			result.setProductcolourstyles(dtoes);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public ProductgeneralsResult queryproductgeneral(Long productid) {
		ProductgeneralsResult result = new ProductgeneralsResult();
		try {
			Validate.notNull(productid, "productid参数为空");

			TscmProductgeneral prdgeeral = new TscmProductgeneral();
			prdgeeral.setProductid(productid);
			List<TscmProductgeneral> prdgeerals = productManageSerevice
					.selectProductGeneralProduct(prdgeeral);

			List<ProductgeneralDTO> dtoes = BeanMapper.mapList(prdgeerals,
					ProductgeneralDTO.class);
			result.setProductgenerales(dtoes);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public ProductlogisticsResult queryproductlogistic(Long productid) {
		ProductlogisticsResult result = new ProductlogisticsResult();
		try {
			Validate.notNull(productid, "productid参数为空");

			TscmProductlogistic prdlogistic = new TscmProductlogistic();
			prdlogistic.setProductid(productid);
			List<TscmProductlogistic> prdlogistics = productManageSerevice
					.selectProductLogisticProduct(prdlogistic);

			List<ProductlogisticDTO> dtoes = BeanMapper.mapList(prdlogistics,
					ProductlogisticDTO.class);
			result.setProductlogistics(dtoes);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public ProductwarehousesResult queryproductwarehouse(Long productid) {
		ProductwarehousesResult result = new ProductwarehousesResult();
		try {
			Validate.notNull(productid, "productid参数为空");

			TscmProductwarehouse prdwarehouse = new TscmProductwarehouse();
			prdwarehouse.setProductid(productid);
			List<TscmProductwarehouse> prdwarehouses = productManageSerevice
					.selectProductWarehouseProduct(prdwarehouse);

			List<ProductwarehouseDTO> dtoes = BeanMapper.mapList(prdwarehouses,
					ProductwarehouseDTO.class);
			result.setProductwarehouses(dtoes);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public ProductcolourstylesResult queryproductcolour(Long productid) {
		ProductcolourstylesResult result = new ProductcolourstylesResult();
		try {
			Validate.notNull(productid, "productid参数为空");

			TscmProductcolourstyle prdcolour = new TscmProductcolourstyle();
			prdcolour.setProductid(productid);
			List<TscmProductcolourstyle> prdcolstys = productManageSerevice
					.selectProductColourByProduct(prdcolour);

			List<ProductcolourstyleDTO> dtoes = BeanMapper.mapList(prdcolstys,
					ProductcolourstyleDTO.class);
			result.setProductcolourstyles(dtoes);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public ProductcolourstylesResult queryproductstyle(Long productid) {
		ProductcolourstylesResult result = new ProductcolourstylesResult();
		try {
			Validate.notNull(productid, "productid参数为空");

			TscmProductcolourstyle prdstyle = new TscmProductcolourstyle();
			prdstyle.setProductid(productid);
			List<TscmProductcolourstyle> prdcolstys = productManageSerevice
					.selectProductStyleByProduct(prdstyle);
			List<ProductcolourstyleDTO> dtoes = BeanMapper.mapList(prdcolstys,
					ProductcolourstyleDTO.class);
			result.setProductcolourstyles(dtoes);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public ProductcolourstyleResult queryproductstock(Long productid,
			Integer productversion, Integer colourcode, Integer colourclass,
			Integer stylecode, Integer styleclass) {
		ProductcolourstyleResult result = new ProductcolourstyleResult();
		try {
			Validate.notNull(productid, "productid参数为空");
			Validate.notNull(productversion, "productversion参数为空");
			Validate.notNull(colourcode, "colourcode参数为空");
			Validate.notNull(stylecode, "stylecode参数为空");
			Validate.notNull(colourclass, "colourclass参数为空");
			Validate.notNull(styleclass, "styleclass参数为空");
			TscmProductcolourstyle prdcolsty = new TscmProductcolourstyle();
			prdcolsty.setProductid(productid);
			prdcolsty.setProductversion(productversion);
			prdcolsty.setColourcode(colourcode);
			prdcolsty.setColourclass(colourclass);
			prdcolsty.setStyleclass(styleclass);
			prdcolsty.setStylecode(stylecode);
			prdcolsty = productManageSerevice
					.selectStockProductByProduct(prdcolsty);

			ProductcolourstyleDTO dto = BeanMapper.map(prdcolsty,
					ProductcolourstyleDTO.class);
			result.setProductcolourstyle(dto);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public SpmProductResult productSpmImport(Long supplierid,
			String manufacturername, Integer productcategory,
			Long maximumquantity, Double costprice, Long realsupplierid,
			String realsuppliername, String productname1, String productname2,
			Long createdby, Integer leadtime, Long economicorderquantity,
			Long maximumdiscountquantity, Long quantityprocessedperday,
			Double widthbeforepacking, Double widthafterpacking,
			Double heightbeforepacking, Double heightafterpacking,
			Double lengthbeforepacking, Double lengthafterpacking,
			Double weightbeforepacking, Double weightafterpacking,
			Integer warrantyperiod, Double sellingprice, Double marketprice,
			Double shippingprice, String offshoredelivery, String giftpackage,
			String usermanual, String warranty, String brandname,
			String manufacturingplace, String notesfordelivery, String boxid,
			Integer deliverytype, Integer returntype, Integer subdeliverytype,
			Integer subreturntype, Integer commisiontype, Integer salestype,
			Double commissionrate, Integer lclasscode, Integer mclasscode,
			Integer sclasscode, Long purchaseid, Long mdid, Integer potype,
			Long companyid) {
		SpmProductResult result = new SpmProductResult();
		try {
			Validate.notNull(supplierid, "supplierid参数为空");
			Validate.notNull(manufacturername, "manufacturername参数为空");
			Validate.notNull(productcategory, "productcategory参数为空");
			Validate.notNull(costprice, "costprice参数为空");
			Validate.notNull(realsupplierid, "realsupplierid参数为空");
			Validate.notNull(realsuppliername, "realsuppliername参数为空");
			Validate.notNull(productname1, "productname1参数为空");
			Validate.notNull(productname2, "productname2参数为空");
			Validate.notNull(createdby, "createdby参数为空");
			Validate.notNull(widthbeforepacking, "widthbeforepacking参数为空");
			Validate.notNull(widthafterpacking, "widthafterpacking参数为空");
			Validate.notNull(heightbeforepacking, "heightbeforepacking参数为空");
			Validate.notNull(heightafterpacking, "heightafterpacking参数为空");
			Validate.notNull(lengthbeforepacking, "lengthbeforepacking参数为空");
			Validate.notNull(lengthafterpacking, "lengthafterpacking参数为空");
			Validate.notNull(weightbeforepacking, "weightbeforepacking参数为空");
			Validate.notNull(weightafterpacking, "weightafterpacking参数为空");
			Validate.notNull(warrantyperiod, "warrantyperiod参数为空");
			Validate.notNull(sellingprice, "sellingprice参数为空");
			Validate.notNull(marketprice, "marketprice参数为空");
			Validate.notNull(shippingprice, "shippingprice参数为空");
			Validate.notNull(offshoredelivery, "offshoredelivery参数为空");
			Validate.notNull(giftpackage, "giftpackage参数为空");
			Validate.notNull(usermanual, "usermanual参数为空");
			Validate.notNull(warranty, "warranty参数为空");
			Validate.notNull(brandname, "brandname参数为空");
			Validate.notNull(manufacturingplace, "manufacturingplace参数为空");
			Validate.notNull(deliverytype, "deliverytype参数为空");
			Validate.notNull(returntype, "returntype参数为空");
			Validate.notNull(subdeliverytype, "subdeliverytype参数为空");
			Validate.notNull(subreturntype, "subreturntype参数为空");
			Validate.notNull(commisiontype, "commisiontype参数为空");
			Validate.notNull(salestype, "salestype参数为空");
			Validate.notNull(lclasscode, "lclasscode参数为空");
			Validate.notNull(mclasscode, "mclasscode参数为空");
			Validate.notNull(sclasscode, "sclasscode参数为空");
			Validate.notNull(mdid, "mdid参数为空");
			Validate.notNull(potype, "potype参数为空");
			Validate.notNull(companyid, "companyid参数为空");

			TspmProduct spmprd = new TspmProduct();
			spmprd.setBoxid(boxid);
			spmprd.setBrandname(brandname);
			spmprd.setCompanyid(companyid);
			spmprd.setCommisiontype(commisiontype);
			spmprd.setCommissionrate(commissionrate);
			spmprd.setCostprice(costprice);
			spmprd.setCreatedby(createdby);
			spmprd.setDeliverytype(deliverytype);
			spmprd.setEconomicorderquantity(economicorderquantity);
			spmprd.setGiftpackage(giftpackage);
			spmprd.setHeightafterpacking(heightafterpacking);
			spmprd.setHeightbeforepacking(heightbeforepacking);
			spmprd.setLclasscode(lclasscode);
			spmprd.setLeadtime(leadtime);
			spmprd.setLengthafterpacking(lengthafterpacking);
			spmprd.setLengthbeforepacking(lengthbeforepacking);
			spmprd.setMclasscode(mclasscode);
			spmprd.setManufacturername(manufacturername);
			spmprd.setManufacturingplace(manufacturingplace);
			spmprd.setMarketprice(marketprice);
			spmprd.setMaximumdiscountquantity(maximumdiscountquantity);
			spmprd.setMaximumquantity(maximumquantity);
			spmprd.setMdid(mdid);
			spmprd.setNotesfordelivery(notesfordelivery);
			spmprd.setOffshoredelivery(offshoredelivery);
			spmprd.setPotype(potype);
			spmprd.setProductcategory(productcategory);
			spmprd.setProductname1(productname1);
			spmprd.setProductname2(productname2);
			spmprd.setPurchaseid(purchaseid);
			spmprd.setQuantityprocessedperday(quantityprocessedperday);
			spmprd.setRealsupplierid(realsupplierid);
			spmprd.setRealsuppliername(realsuppliername);
			spmprd.setReturntype(returntype);
			spmprd.setSclasscode(sclasscode);
			spmprd.setSalestype(salestype);
			spmprd.setSellingprice(sellingprice);
			spmprd.setShippingprice(shippingprice);
			spmprd.setSubdeliverytype(subdeliverytype);
			spmprd.setSubreturntype(subreturntype);
			spmprd.setSupplierid(supplierid);
			spmprd.setUsermanual(usermanual);
			spmprd.setWarranty(warranty);
			spmprd.setWarrantyperiod(warrantyperiod);
			spmprd.setWeightafterpacking(weightafterpacking);
			spmprd.setWeightbeforepacking(weightbeforepacking);
			spmprd.setWidthafterpacking(widthafterpacking);
			spmprd.setWidthbeforepacking(widthbeforepacking);

			spmprd = spmproductManageSerevice.spmProductImport(spmprd);

			SpmProductDTO dto = BeanMapper.map(spmprd, SpmProductDTO.class);
			result.setSpmproduct(dto);
			
			logger.info("rtncode:"+spmprd.getRtncode());
			
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public SpmProductcolourstyleResult productcolourstyleSpmImport(
			Long productid, Integer colourcode, Integer colourclass,
			Integer stylecode, Integer styleclass, Long createdby,
			String forsale, Long quantity) {

		SpmProductcolourstyleResult result = new SpmProductcolourstyleResult();
		try {
			Validate.notNull(productid, "productid参数为空");
			Validate.notNull(forsale, "forsale参数为空");
			Validate.notNull(colourcode, "colourcode参数为空");
			Validate.notNull(stylecode, "stylecode参数为空");
			Validate.notNull(colourclass, "colourclass参数为空");
			Validate.notNull(styleclass, "styleclass参数为空");

			TspmProductcolourstyle spmprdcolourstyle = new TspmProductcolourstyle();
			spmprdcolourstyle.setProductid(productid);
			spmprdcolourstyle.setColourclass(colourclass);
			spmprdcolourstyle.setColourcode(colourcode);
			spmprdcolourstyle.setStyleclass(styleclass);
			spmprdcolourstyle.setStylecode(stylecode);
			spmprdcolourstyle.setCreatedby(createdby);
			spmprdcolourstyle.setLastmodifiedby(createdby);
			spmprdcolourstyle.setForsale(forsale);
			spmprdcolourstyle.setQuantity(quantity);

			spmprdcolourstyle = spmproductManageSerevice
					.spmPrdcolourstyleImport(spmprdcolourstyle);

			SpmProductcolourstyleDTO dto = BeanMapper.map(spmprdcolourstyle,
					SpmProductcolourstyleDTO.class);
			result.setSpmproductcolourstyle(dto);

			logger.info("rtncode:"+spmprdcolourstyle.getRtncode());
			
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public SpmProductgeneralReult productgeneralsSpmImport(Long productid,
			Integer generalinfocode, String comments, String commenttype,
			Long createdby) {
		SpmProductgeneralReult result = new SpmProductgeneralReult();
		try {
			Validate.notNull(productid, "productid参数为空");
			Validate.notNull(generalinfocode, "generalinfocode参数为空");
			Validate.notNull(comments, "comments参数为空");
			Validate.notNull(createdby, "createdby参数为空");

			TspmProductgeneral spmprdgeneral = new TspmProductgeneral();
			spmprdgeneral.setProductid(productid);
			spmprdgeneral.setGeneralinfocode(generalinfocode);
			spmprdgeneral.setComments(comments);
			spmprdgeneral.setCommenttype(commenttype);
			spmprdgeneral.setCreatedby(createdby);

			spmprdgeneral = spmproductManageSerevice
					.spmPrdgeneralImport(spmprdgeneral);

			SpmProductgeneralDTO dto = BeanMapper.map(spmprdgeneral,
					SpmProductgeneralDTO.class);
			result.setSpmproductgeneral(dto);
			
			logger.info("rtncode:"+spmprdgeneral.getRtncode());
			
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public ProductimageResult productimageSpmImport(WebSendProductImage prdimage) {
		ProductimageResult result = new ProductimageResult();
		try {
			Validate.notNull(prdimage.getSpmproductid(), "spmproductid参数为空");
			Validate.notNull(prdimage.getFilepath(), "filepath参数为空");
			Validate.notNull(prdimage.getImagedescrption(),
					"imagedescrption参数为空");
			Validate.notNull(prdimage.getCreatedby(), "createdby参数为空");
			Validate.notNull(prdimage.getImagetype(), "imagetype参数为空");
			String filepath = prdimage.getFilepath();
			String orginalfilename = filepath.substring(
					filepath.lastIndexOf("/") + 1, filepath.lastIndexOf("."));
			prdimage.setOrginalfilename(orginalfilename);
			prdimage.setImageFileType(filepath.substring(filepath
					.lastIndexOf(".") + 1));
			prdimage.setCandidateName(prdimage.getSpmproductid() + "_"
					+ prdimage.getOrginalfilename());

			prdimage = uploadPrdImage(prdimage);

			TscmProductimage spmprodimage = new TscmProductimage();
			spmprodimage.setSpmproductid(prdimage.getSpmproductid());
			spmprodimage.setImagedescrption(prdimage.getImagedescrption());
			spmprodimage.setCreatedby(prdimage.getCreatedby());
			spmprodimage.setImagepath(prdimage.getImagepath());
			spmprodimage.setOrginalfilename(prdimage.getOrginalfilename());
			spmprodimage.setImagetype(prdimage.getImagetype());

			spmprodimage = spmproductManageSerevice
					.spmPrdimageImport(spmprodimage);

			ProductimageDTO dto = BeanMapper.map(spmprodimage,
					ProductimageDTO.class);
			result.setProductimage(dto);
			
			logger.info("rtncode:"+spmprodimage.getRtncode());
			
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}

	}

	private WebSendProductImage uploadPrdImage(WebSendProductImage prdimage) {
		DataHandler handler = prdimage.getImagefile();
		try {
			InputStream is = handler.getInputStream();
			File file = new File(SCMConstant.PRDIMAGEPATH);
			if (!file.exists()) {
				file.mkdirs();
			}
			String imagepath = SCMConstant.PRDIMAGEPATH
					+ prdimage.getCandidateName() + "."
					+ prdimage.getImageFileType();
			OutputStream os = new FileOutputStream(new File(imagepath));
			byte[] b = new byte[100000];
			int bytesRead = 0;
			while ((bytesRead = is.read(b)) != -1) {
				os.write(b, 0, bytesRead);
			}
			os.flush();
			os.close();
			is.close();
			prdimage.setImagepath(imagepath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prdimage;
	}

	@Override
	public SpmProductwarehousesResult productwarehouserSpmImport(
			Long productid, Long warehouseid, Long createdby) {
		SpmProductwarehousesResult result = new SpmProductwarehousesResult();
		try {
			Validate.notNull(productid, "productid参数为空");
			Validate.notNull(warehouseid, "warehouseid参数为空");
			Validate.notNull(createdby, "createdby参数为空");

			TspmProductwarehouse spmprodwarehouse = new TspmProductwarehouse();
			spmprodwarehouse.setProductid(productid);
			spmprodwarehouse.setWarehouseid(warehouseid);
			spmprodwarehouse.setCreatedby(createdby);

			spmprodwarehouse = spmproductManageSerevice
					.spmPrdwarehouseImport(spmprodwarehouse);
			SpmProductwarehouseDTO dto = BeanMapper.map(spmprodwarehouse,
					SpmProductwarehouseDTO.class);
			result.setProductwarehouse(dto);
			
			logger.info("rtncode:"+spmprodwarehouse.getRtncode());
			
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public SpmProductattributeResult productattributeSpmImport(Long productid,
			Integer attributecategoryid, Integer attributevalue, Long createdby) {
		SpmProductattributeResult result = new SpmProductattributeResult();
		try {
			Validate.notNull(productid, "productid参数为空");
			Validate.notNull(attributecategoryid, "attributecategoryid参数为空");
			Validate.notNull(attributevalue, "attributevalue参数为空");
			Validate.notNull(createdby, "createdby参数为空");

			TspmProductattribute spmproductattribute = new TspmProductattribute();

			spmproductattribute.setProductid(productid);
			spmproductattribute.setAttributecategoryid(attributecategoryid);
			spmproductattribute.setAttributevalue(attributevalue);
			spmproductattribute.setCreatedby(createdby);

			spmproductattribute = spmproductManageSerevice
					.spmPrdattributeImport(spmproductattribute);
			SpmProductattributeDTO dto = BeanMapper.map(spmproductattribute,
					SpmProductattributeDTO.class);
			result.setProductattribute(dto);
			
			logger.info("rtncode:"+spmproductattribute.getRtncode());
			
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public ProductResult changeProductInfoByCommission(Long productid,
			Long lastmodifiedby, Double costprice, Double sellingprice,
			Double marketprice, Double memberprice, Integer warrantyperiod,
			Long maximumquantity, Long economicorderquantity,
			Long maximumdiscountquantity, Long quantityprocessedperday,
			Double surpriseprice) {
		ProductResult result = new ProductResult();
		try {
			Validate.notNull(productid, "productid参数为空");
			Validate.notNull(lastmodifiedby, "lastmodifiedby参数为空");

			TscmProduct product = new TscmProduct();
			product.setProductid(productid);
			product.setCostprice(costprice);
			product.setSellingprice(sellingprice);
			product.setMarketprice(marketprice);
			product.setMemberprice(memberprice);
			product.setLastmodifiedby(lastmodifiedby);
			product.setWarrantyperiod(warrantyperiod);
			product.setMaximumquantity(maximumquantity);
			product.setEconomicorderquantity(economicorderquantity);
			product.setMaximumdiscountquantity(maximumdiscountquantity);
			product.setQuantityprocessedperday(quantityprocessedperday);
			product.setSurpriseprice(surpriseprice);
			
			product = productManageSerevice.updateProductInfoByCommission(product);
			ProductDTO dto = BeanMapper.map(product, ProductDTO.class);
			result.setProduct(dto);
			
			logger.info("rtncode:"+product.getRtncode());
			
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public ProductcolourstyleResult addProductColourStyleByCommission(
			Long productid, Integer colourcode, Integer colourclass,
			Integer stylecode, Integer styleclass, Long createdby,
			String forsale, Long quantity) {
		ProductcolourstyleResult result = new ProductcolourstyleResult();
		try {
			Validate.notNull(productid, "productid参数为空");
			Validate.notNull(colourcode, "colourcode参数为空");
			Validate.notNull(colourclass, "colourclass参数为空");
			Validate.notNull(stylecode, "stylecode参数为空");
			Validate.notNull(styleclass, "styleclass参数为空");
			Validate.notNull(createdby, "createdby参数为空");
			Validate.notNull(forsale, "forsale参数为空");
			
			TscmProductcolourstyle prdcolourstyle = new TscmProductcolourstyle();
			prdcolourstyle.setProductid(productid);
			prdcolourstyle.setColourclass(colourclass);
			prdcolourstyle.setColourcode(colourcode);
			prdcolourstyle.setStyleclass(styleclass);
			prdcolourstyle.setStylecode(stylecode);
			prdcolourstyle.setCreatedby(createdby);
			prdcolourstyle.setLastmodifiedby(createdby);
			prdcolourstyle.setForsale(forsale);
			prdcolourstyle
					.setQuantity(quantity == null ? SCMConstant.SCM_PROD_PENDINGORDER_QTY
							: quantity);
			
			prdcolourstyle = productManageSerevice.insertProductColourStyleByCommission(prdcolourstyle);
			ProductcolourstyleDTO dto = BeanMapper.map(prdcolourstyle, ProductcolourstyleDTO.class);
			result.setProductcolourstyle(dto);
			
			logger.info("rtncode:" + prdcolourstyle.getRtncode());
			
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public ProductcolourstyleResult changeProductColourStyleByCommission(
			Long productid, Integer colourcode,
			Integer colourclass, Integer stylecode, Integer styleclass,
			Long lastmodifiedby, String forsale, Long quantity) {
		ProductcolourstyleResult result = new ProductcolourstyleResult();
		try {
			Validate.notNull(productid, "productid参数为空");
			Validate.notNull(lastmodifiedby, "lastmodifiedby参数为空");
			Validate.notNull(colourcode, "colourcode参数为空");
			Validate.notNull(colourclass, "colourclass参数为空");
			Validate.notNull(stylecode, "stylecode参数为空");
			Validate.notNull(styleclass, "styleclass参数为空");
			Validate.notNull(forsale, "forsale参数为空");
			
			TscmProductcolourstyle prdcolourstyle = new TscmProductcolourstyle();
			prdcolourstyle.setProductid(productid);
			prdcolourstyle.setColourclass(colourclass);
			prdcolourstyle.setColourcode(colourcode);
			prdcolourstyle.setStyleclass(styleclass);
			prdcolourstyle.setStylecode(stylecode);
			prdcolourstyle.setLastmodifiedby(lastmodifiedby);
			prdcolourstyle.setForsale(forsale);
			prdcolourstyle.setQuantity(quantity);

			prdcolourstyle = productManageSerevice
					.updateProductColourStyleByCommission(prdcolourstyle);
			ProductcolourstyleDTO dto = BeanMapper.map(prdcolourstyle,
					ProductcolourstyleDTO.class);
			result.setProductcolourstyle(dto);

			logger.info("rtncode:" + prdcolourstyle.getRtncode());

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public ProductgeneralResult addProductGeneralByCommission(Long productid,
			String comments, String commenttype, Long createdby) {
		ProductgeneralResult result = new ProductgeneralResult();
		try {
			Validate.notNull(productid, "productid参数为空");
			Validate.notNull(comments, "comments参数为空");
			Validate.notNull(createdby, "createdby参数为空");
			
			TscmProductgeneral prodgeneral = new TscmProductgeneral();
			prodgeneral.setProductid(productid);
			prodgeneral.setComments(comments);
			prodgeneral.setCommenttype(commenttype);
			prodgeneral.setCreatedby(createdby);
			
			prodgeneral = productManageSerevice.insertProductGeneralByCommission(prodgeneral);
			ProductgeneralDTO dto = BeanMapper.map(prodgeneral, ProductgeneralDTO.class);
			result.setProductgeneral(dto);
			
			logger.info("rtncode:"+prodgeneral.getRtncode());
			
			return result;
		}  catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public TscmSpmscmProductResult queryScmProductId(Long spmProductId) {
		TscmSpmscmProductResult result = new TscmSpmscmProductResult();
		try {
			Validate.notNull(spmProductId, "spmProductId参数为空");

			TscmSpmscmproduct product = new TscmSpmscmproduct();
			product.setSpmproductid(spmProductId);

			product = spmproductManageSerevice.tscmSpmscmproduct(product);
			TscmSpmscmproductDTO dto = BeanMapper.map(product,
					TscmSpmscmproductDTO.class);
			result.setTscmspmscmproductDTO(dto);

			logger.info("rtncode:" + product.getRtncode());

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

	@Override
	public ProductsResult queryProductBySupplier(Long supplierid,Long companyid,String startdate,
	 String enddate) {
		ProductsResult result = new ProductsResult();
		try {
			Validate.notNull(supplierid, "supplierid参数为空");
			Validate.notNull(companyid, "companyid参数为空");
			
			
			TscmProduct product = new TscmProduct();
			product.setSupplierid(supplierid);
			product.setCompanyid(companyid);
			if(!StringUtils.isBlank(startdate)&&!StringUtils.isBlank(enddate)){
			product.setStartdate(startdate);
			product.setEnddate(enddate);
			}
			List<TscmProduct> products = productManageSerevice
					.selectInfoByProduct(product);

			List<ProductDTO> dtoes = BeanMapper.mapList(products,
					ProductDTO.class);
			result.setProducts(dtoes);

			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
	}

}
