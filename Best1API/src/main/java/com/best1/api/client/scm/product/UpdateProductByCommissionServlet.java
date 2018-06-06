package com.best1.api.client.scm.product;

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

import com.best1.api.webservice.soap.scm.ProductSoapService;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/UpdateProductByCommissionServlet")
@Transactional
public class UpdateProductByCommissionServlet extends HttpServlet {

	static final long serialVersionUID = -3493446380756305585L;

	final static Logger LOG = LoggerFactory
			.getLogger(UpdateProductByCommissionServlet.class);

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		LOG.info("start");

		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(ProductSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/scm/productservice");
		ProductSoapService service = (ProductSoapService) factory.create();

		Long productid = 111550L;// 商品代码
		// Long supplierid;//厂代
		// Long purchaseid;//MA人员
		// Long mdid;//MD人员
		// String manufacturername;//制造商
		// Integer productversion;//商品版本
		// Integer mclasscode;//中分类
		// Integer sclasscode;//小分类
		// Integer productcategory;//商品种类
		// Integer producttype;//商品类别
		// Integer taxtype;//税别 应税,免税,特定消费税,零税,部分课税
		Double costprice = 1000.00;// 成本价
		Double sellingprice = 2000.00;// 销售价
		Double marketprice = 3000.00;// 市价
		Double memberprice = 3000.00;// 会员价
		// Integer potype;//采购单类别
		// String productname1;//商品名称1
		// String productname2;//商品名称2
		// Long createdby;//创建人
		// Date createdtimestamp;//创建时间
		Long createdby = 30863L;// 最后修改人
		// Date lastmodifiedtimestamp;// 最后修改时间
		// Integer noofinstallment;//分期付款期数
		// Integer commisiontype;//佣金类别 依比例,固定值
		// Double commissionrate;//佣金比例
		// Integer currencytype;//币别 人民币,美金
		// Integer productstatus;//商品状态
		// Integer localorimported;//产地 1001国产 1002进口-原厂输入 1003进口-真品平行输入
		Integer warrantyperiod = 0;// 保固期限
		Long maximumquantity = 900000L;// 最大可供货量
		Long economicorderquantity = 1L;// 经济运送量
		Long maximumdiscountquantity = 0L;// 最高可折扣量
		Long quantityprocessedperday = 1L;// 每日可处理量
		// Integer bonustype;// 红利金区分 依比例 固定值
		// Long safetystock;// 安全存量
		// Long firstpoquantity;// 第一库存量????/ 首次采购单量
		// Double bonusvalue;// 红利金额度
		// Double shippingprice;// 附加运送费
		// Double serviceprice;// 服务费
		// Double importingprice;// 进口价
		// Double importingcost;// 进口成本
		// Integer repurchaseperiod;// 推估客户再购买时间
		// Integer expirydays;// 入仓时最低有效期限
		// Long realsupplierid;// 厂商实际代号
		// Double averagecost;// 平均成本
		Double surpriseprice = null;// 惊喜价
		// Date regapproveddate;// 注册核准日期
		// Date commiteeapproveddate;// 核准日期
		// String warranty;// 保证书
		// String usermanual;// 使用手册
		// String downpayment;// 可否分期
		// String invoicerequired;// 是否需开发票
		// String tv;// default 'Y', 上架通路 电视
		// String catalog;// default 'Y', 上架通路 型录
		// String web;// default 'Y', 上架通路 网络
		// String newspaper;// 报纸销售
		// String project;// 专案可销售
		// String broadcasting;// 广播可销售
		// String ownbrands;// 自有品牌
		// String selfpromotion;// 电话营销
		// String bonuspointallowed;// 购物金购买
		// String ivrorder;// IVR接单
		// String giftcertificatepurchase;// 以礼卷购买
		// String giftpackage;// 礼品包装
		// String brandname;// 品牌名称
		// String manufacturingplace;// 制造地点
		// String realsuppliername;// 厂商实际名称
		// String productimagepath;// 商品图路径
		// Integer lclasscode;// 大分类
		// Long lastrequestraisedby;//
		// Long companyid;// 此商品专属之公司
		// String tax;// 课税计算
		// String productnameconcat;// 商品全名
		// Integer importtaxtype;// 进货税别 应税,免税,特定消费税,零税,部分课税
		// Double partialtaxamount;// 部分课税金额
		// String pendingorder;// default 'Y'延迟订单
		// Integer paymentterms;// default 1006 ,
		// // 付款条件:30天内,60天内,90天内,120天内,150天内,180天内
		// Long originalproductid;//
		// String autoship;//
		// Integer multiple;//
		// Double rtnordrate;//
		// String smssuppliername;//
		// String smscontactphone;//
		// String smssendflag;//
		// String simpletask;//
		// Long exclusivechannel;// 专属开发通路
		// Long mdidlastmodifiedby;// MDID最后修改人
		// Date mdidlastmodifiedtimestamp;// MDID最后修改日
		// Date lastrequestraisedts;//
		// String changedfields;//
		// Double profit;//
		// Double profitrate;//
		// Double taxpercent;//
		// service.updateCommissionProductInfo(productid, costprice,
		// sellingprice,
		// marketprice, memberprice, lastmodifiedby, warrantyperiod,
		// maximumquantity, economicorderquantity,
		// maximumdiscountquantity, quantityprocessedperday, surpriseprice);

		service.changeProductInfoByCommission(productid, createdby, costprice,
				sellingprice, marketprice, memberprice, warrantyperiod,
				maximumquantity, economicorderquantity,
				maximumdiscountquantity, quantityprocessedperday, surpriseprice);

		LOG.info("end");
	}
}