package com.best1.api.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebParam;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.best1.api.utils.APIConstant;
import com.best1.api.utils.SCMConstant;
import com.best1.api.webservice.soap.chm.PgmSoapService;
import com.best1.api.webservice.soap.crm.CustomerSoapService;
import com.best1.api.webservice.soap.oaf.CustomerOrderSoapService;
import com.best1.api.webservice.soap.response.dto.scm.WebSendProductImage;
import com.best1.api.webservice.soap.response.result.crm.CustomerAddressResult;
import com.best1.api.webservice.soap.response.result.crm.CustomerResult;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.best1.api.webservice.soap.crm.CustomerSoapService;
import com.best1.api.webservice.soap.response.result.crm.CustomerResult;
import com.best1.api.webservice.soap.response.result.oaf.OrderResult;
import com.best1.api.webservice.soap.response.result.scm.SpmProductResult;
import com.best1.api.webservice.soap.scm.ProductSoapService;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/OrderTestingServlet")
public class OrderTestingServlet extends HttpServlet {

	final static Logger LOG = LoggerFactory.getLogger(FirstServlet.class);

	private static final long serialVersionUID = 6833688147345340845L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		LOG.info("hello");
		PrintWriter out = response.getWriter();
		// Long productid = 110880L;
		// Integer colourcode = 5044;
		// Integer stylecode = 5172;
		/****
		 * private String candidateName; private String imageFileType;
		 */
		Integer days = 10;
		Long subchannelid = 4L;
		WebSendProductImage image = new WebSendProductImage();
		image.setProductid(110880l);
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		factory.setServiceClass(CustomerOrderSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/oaf/customerorderservice");

		CustomerOrderSoapService server = (CustomerOrderSoapService) factory
				.create();

		OrderResult order = server.fetchOrderId();

		Long customerid = 20011L;
		Integer itemid = 1;

		String customername = "胡文华";
		Long orderid = order.getOrder().getOrderid();
		Long addressid = 25479L;
		Long callattendedby = 30364L;
		Long multicodeid = 98111556L;

		Long productid = 111556L;
		Integer productversion = 1;
		String isoffshoredelivery = "N";
		Integer colourcode = 5038;
		Integer colourclass = 5002;
		Integer stylecode = 5172;
		Integer styleclass = 5016;
		Double servicefee = null;
		Double bonuspointsgained = null;
		Double offshoredeliverycharges = null;
		Double discount = 0D;
		String productname = "海尔压力锅";
		Double sellingprice = 2000D;
		Integer taxtype = 1002;
		Integer paymentmodeid = 1;
		String invoicetitle = "胡文";
		String companyno = "330100796455317";
		String invoicereceivername = "朱淑秋";
		String instructiontoscm = "早上9前之后";
		String order_desc = "订单信息";
		String ispromotionalproduct = "N";
		Long storechainid = null;
		Long storeid = null;
		Integer subdeliverytype = null;
		String receivername = "胡玖欣";
		Integer ordertype = 1;
		Integer invoicetype = 2;// 不开票
		String isreprinted = "Y";
		// server.customerOrderInvoice(orderid, itemid, customerid);
		String iseinvoice = "Y";
		server.buildTempOrder(orderid, ordertype, itemid, customerid,
				customername, callattendedby, multicodeid, productid,
				productversion, isoffshoredelivery, colourcode, colourclass,
				stylecode, styleclass, servicefee, bonuspointsgained,
				offshoredeliverycharges, discount, productname, receivername,
				addressid, sellingprice, invoicetype, isreprinted, iseinvoice,
				taxtype, paymentmodeid, invoicetitle, companyno,
				invoicereceivername, instructiontoscm, order_desc,
				ispromotionalproduct, storechainid, storeid, subdeliverytype);
		itemid=2;
		discount = 2000D;
		server.buildTempOrder(orderid, ordertype, itemid, customerid,
				customername, callattendedby, multicodeid, productid,
				productversion, isoffshoredelivery, colourcode, colourclass,
				stylecode, styleclass, servicefee, bonuspointsgained,
				offshoredeliverycharges, discount, productname, receivername,
				addressid, sellingprice, invoicetype, isreprinted, iseinvoice,
				taxtype, paymentmodeid, invoicetitle, companyno,
				invoicereceivername, instructiontoscm, order_desc,
				ispromotionalproduct, storechainid, storeid, subdeliverytype);
		/**
		 * String couponNumber="14809000058"; String url=
		 * "http://127.0.0.1:8080/Best1API/mvc/DiscountCouponQuery?INIT=true&COMMAND=DiscountCouponQuery&CONTENTKEY="
		 * +orderid+"&txtCouponNumber="+ couponNumber;
		 * request.getRequestDispatcher(url).forward(request, response); String
		 * str = erpServer(url).trim(); LOG.info("DO_str = " + str); String[]
		 * strs = str.split("-"); for (int i = 0; i < strs.length; i++) {
		 * System.out.println(strs[i]); } LOG.info("str = " + str);
		 * 
		 * Long couponnumber; if ("".equals(strs[3]) || strs[3] == null) {
		 * couponnumber = 0L; } else { couponnumber =Long.valueOf(strs[3]); }
		 * Integer coupontype; if ("".equals(strs[0]) || strs[0] == null) {
		 * coupontype = 0; } else { coupontype = Integer.valueOf(strs[0]); }
		 * Long coupongroupnumber; if ("".equals(strs[2]) || strs[2] == null) {
		 * coupongroupnumber = 0L; } else { coupongroupnumber
		 * =Long.valueOf(strs[2]); } Integer usage; if ("".equals(strs[1]) ||
		 * strs[1] == null) { usage = 0; } else { usage =
		 * Integer.valueOf(strs[1]); }
		 * 
		 * Integer offervaluepercent; if ("".equals(strs[5]) || strs[5] == null)
		 * { offervaluepercent = 0; } else { offervaluepercent =
		 * Integer.valueOf(strs[5]); }
		 * 
		 * Integer offervalue; if ("".equals(strs[6]) || strs[6] == null) {
		 * offervalue = 0; } else { offervalue = Integer.valueOf(strs[6]); }
		 * Integer quantity = 1;
		 * 
		 * server.orderCoupons(orderid, couponnumber, coupontype,
		 * coupongroupnumber, usage, offervaluepercent, offervalue, customerid,
		 * callattendedby, productid, productversion, sellingprice, quantity);
		 **/

		Integer isacntfirst = 0;
		Integer bonus = 0;
		Integer transferaccno = 99;

		/**server.buildTempOrderPayment(orderid, isacntfirst, bonus,
				paymentmodeid, transferaccno);**/
		server.createTempOrderPayment(orderid, paymentmodeid, transferaccno);
		Integer uselotterybonus = 0;
		Long subcharnelid = 20L;
		String areacode = null;
		String reffereeid = null;
		Integer refereetype = 1001;

		server.buildOrder(orderid, customerid, callattendedby, uselotterybonus,
				subcharnelid, areacode, reffereeid, refereetype);

		LOG.info("orderid = " + orderid);

		server.postOrder(orderid, customerid, customername, "11111");

	}

	private String erpServer(String erpurl) {
		String strl = "";
		String str = null;
		try {
			URL url = new URL(erpurl);

			InputStreamReader isr;

			isr = new InputStreamReader(url.openStream());

			BufferedReader br = new BufferedReader(isr);

			while ((str = br.readLine()) != null) {
				strl += str;
			}

			br.close();
			isr.close();
			return strl;

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}
		return strl;
	}

}