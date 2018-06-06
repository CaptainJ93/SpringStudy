package com.best1.api.client.scm.spm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.best1.api.utils.SCMConstant;
import com.best1.api.webservice.soap.scm.ProductSoapService;

/**
 * 示范：spm商品基本资料导入
 */
@WebServlet("/SpmImportServlet")
@Transactional
public class SpmImportServlet extends HttpServlet {

	final static Logger LOG = LoggerFactory.getLogger(SpmImportServlet.class);

	private static final long serialVersionUID = 6833688147345340845L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		LOG.info("hello");

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(ProductSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/scm/productservice");
		ProductSoapService service = (ProductSoapService) factory.create();

		Long supplierid = 26l;// 厂商代码
		String manufacturername = "广州市番禺区东涌万邦五金加工厂";// 厂商名称
		Long purchaseid = 30863l;// MA
		Long mdid = 30863l;// MD
		Long maximumquantity = 888888l;// 最大供应量
		Double costprice = 50.0;// 成本
		Long realsupplierid = 26l;// 厂商实际代码
		String realsuppliername = "上海蝶蒙贸易有限公司";// 厂商实际名称
		String productname1 = "小米";// 商品名称1
		String productname2 = "13";// 商品名称2
		Long createdby = 30863l;// userid
		Integer leadtime = 7;// 备货时间
		Long economicorderquantity = 4000l;// 经济运送量
		Long maximumdiscountquantity = 50l;// 最大折扣量
		Long quantityprocessedperday = 1000l;// 每日可处理量
		Double widthbeforepacking = 1.0;// 包装前宽度
		Double widthafterpacking = 2.0;// 包装后宽度
		Double heightbeforepacking = 1.0;// 包装前高度
		Double heightafterpacking = 2.0;// 包装后高度
		Double lengthbeforepacking = 1.0;// 包装前长度
		Double lengthafterpacking = 2.0;// 包装后长度
		Double weightbeforepacking = 1.0;// 包装前重量
		Double weightafterpacking = 2.0;// 包装后重量
		Integer warrantyperiod = 20;// 保证期
		Double sellingprice = 50.0;// 销售价格
		Double marketprice = 50.0;// 市场价格
		Double shippingprice = 5.0;// 附加运送费
		String offshoredelivery = "Y";// 外省配送
		String giftpackage = "N";// 包装规格PCS(单位)
		String usermanual = "N";// 使用手册
		String warranty = "N";// 保证书
		String brandname = "MIUI";// 品牌名称
		String manufacturingplace = "北京";// 制造地点
		String notesfordelivery = "易碎商品，不易摔";// 配送注意事项
		// String productimagepath =
		// "/bea/data_exchange/SCM/productimages/1166_img_1.jpg,/bea/data_exchange/SCM/productimages/1166_img_2.jpg,/bea/data_exchange/SCM/productimages/1166_img_3.jpg,/bea/data_exchange/SCM/productimages/1166_img_4.jpg,/bea/data_exchange/SCM/productimages/1166_img_5.jpg,/bea/data_exchange/SCM/productimages/1166_img_6.jpg,";
		// String productimagepath = "";
		String boxid = "PT002";// 纸箱编号
		Integer deliverytype = SCMConstant.SCM_PROD_DELIVERY_TYPE_NORMAL;// 配送方式
		Integer returntype = SCMConstant.SCM_PROD_RETURN_TYPE_NORMAL;// 销退方式
		Integer subdeliverytype = SCMConstant.SCM_PROD_SUBDELIVERY_TYPE_NORMAL;// 子配送别
		Integer subreturntype = SCMConstant.SCM_PROD_SUBRETURN_TYPE_NORMAL;// 子销退类别
		Integer salestype = SCMConstant.SCM_PROD_SALES_TYPE_BY_STOCK;// 接单方式
		Integer commisiontype = SCMConstant.SCM_PROC_PRODUCT_PO_TYPE_NORMAL;// 佣金类别
		Integer productcategory = SCMConstant.SCM_PROD_CATEGORY_CONSIGNMENT;// 商品种类
		Integer potype = SCMConstant.SCM_PROD_PO_TYPE_NORMAL;// 采购单类别

		Double commissionrate = 1.5;// 佣金比例
		Integer lclasscode = 10000;// 大分类
		Integer mclasscode = 10100;// 中分类
		Integer sclasscode = 10101;// 小分类
		Long companyid = 2l;

		service.productSpmImport(supplierid, manufacturername, productcategory,
				maximumquantity, costprice, realsupplierid, realsuppliername,
				productname1, productname2, createdby, leadtime,
				economicorderquantity, maximumdiscountquantity,
				quantityprocessedperday, widthbeforepacking, widthafterpacking,
				heightbeforepacking, heightafterpacking, lengthbeforepacking,
				lengthafterpacking, weightbeforepacking, weightafterpacking,
				warrantyperiod, sellingprice, marketprice, shippingprice,
				offshoredelivery, giftpackage, usermanual, warranty, brandname,
				manufacturingplace, notesfordelivery, boxid, deliverytype,
				returntype, subdeliverytype, subreturntype, salestype,
				commisiontype, commissionrate, lclasscode, mclasscode,
				sclasscode, purchaseid, mdid, potype, companyid);

		LOG.info("end");
	}
}