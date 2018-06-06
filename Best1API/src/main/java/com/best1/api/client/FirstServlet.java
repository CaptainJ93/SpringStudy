package com.best1.api.client;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Timestamp;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

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
import com.best1.api.webservice.soap.view.OrderedProductViewSoapService;
import com.best1.api.webservice.soap.view.SupplierViewSoapService;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {

	final static Logger LOG = LoggerFactory.getLogger(FirstServlet.class);

	private static final long serialVersionUID = 6833688147345340845L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		LOG.info("hello");
		PrintWriter out = response.getWriter();
	
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		//factory.setServiceClass(OrderedProductViewSoapService.class);
		//factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/view/orderservice");
		//factory.setAddress("http://127.0.0.1:8080/Best1API/webservice/com.best1.api.webservice.soap.view.SupplierViewSoapService");
		//OrderedProductViewSoapService customerOrderService = (OrderedProductViewSoapService) factory.create();
		
		factory.setServiceClass(SupplierViewSoapService.class);
		factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/view/supplierservice");
		//factory.setAddress("http://127.0.0.1:8080/Best1API/webservice/com.best1.api.webservice.soap.view.SupplierViewSoapService");
		SupplierViewSoapService customerOrderService = (SupplierViewSoapService) factory.create();
		
		
		Long orderID=2372254L;
		Long supplierid=4807L;
		Integer itemID=1;
		String startdate="20060101";
		String enddate="20180125";
		Long customerid=20011L;
		int networktype=1000;
		String networkaccount="12333";
		Long createdby=30384L;
		int accountstate=1001;
		Long productid=null;
		customerOrderService.supplierViewList(supplierid, startdate, enddate);
		//customerOrderService.productViewList(productid, startdate, enddate);
		//customerOrderService.orderedProductViewList(orderID, itemID, startdate, enddate);
		//customerOrderService.supplierViewList(supplierid, startdate, enddate);
		//customerOrderService.createCustomerNetwork(customerid, networktype, networkaccount, createdby);
		//customerOrderService.modifyCustomerNetwork(customerid, networktype, networkaccount, accountstate, createdby);
		//customerOrderService.supplierViewList(supplierid, startdate, enddate);
		//customerOrderService.fetchSuppliers(record)
		//JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		//factory.setServiceClass(CustomerSoapService.class);
		//factory.setAddress("http://127.0.0.1:8080/Best1API/cxf/crm/customerservice");
		//CustomerSoapService server = (CustomerSoapService) factory.create();
		//CustomerResult customer = server.fetchCustomerId();
		//out.println(customer.getCustomer().getCustomerid());

//	this.aa();

	}
	
	
	private void aa(){
		
		
		 String as_string="7301003224";
	        String as_option="";
	        char ls_data[] = new char[10];
	        int al_flag=1;
	        char ls_val[]= new char[11];
	        int ls_position=new Random().nextInt(5) + 1;
	        int ll_count;
	        		
			int ll_arry1[] = {-1,1,7,5,3,9};
			int ll_arry2[] = {-1,2,8,4,6,10};
			 ll_count = as_string.length();
			char[] ls_valx=as_string.toCharArray();
			
			
			int ls_valxint=ls_valx.length;
			
			for (int x=0;x<ls_valxint;x++){
				ls_val[x+1]=ls_valx[x];	
				
			}
			/**for (int k = 0 ;k< ll_count;k++)
					System.out.println(ls_val[k]);
		**/
			ll_count=ll_arry1.length;
			
			//System.out.println(ll_count);
			int ascint;
			char ls_datachar;
			if(al_flag==1){
				for (int k =1 ;k< ll_count;k++)
				{	
					//System.out.println("k="+k+"   ll_arry1[k]"+ll_arry1[k]);
					ls_data[1] = ls_val[ll_arry1[k]];
					//System.out.println("ll_arry2[k]"+ll_arry2[k]);
					ls_data[2] = ls_val[ll_arry2[k]];
					  ls_datachar = ls_data[2];
					  ascint=(int)ls_datachar;
					ls_val[ll_arry1[k]] =(char)(ascint-30);
					 ls_datachar = ls_data[1];
					  ascint=(int)ls_datachar;
					  ls_val[ll_arry2[k]] =(char)(ascint-30);
				
			}
				}
			
			
		
			for (int k = 1 ;k< ll_count;k++)
			{	
				ls_data[1] = ls_val[ll_arry2[k]];
				ls_data[2] = ls_val[ll_arry1[k]];
				  ls_datachar = ls_data[2];
				  ascint=(int)ls_datachar;
				ls_val[ll_arry2[k]] =(char)(ascint+30);
				
				 ls_datachar = ls_data[1];
				  ascint=(int)ls_datachar;
				  ls_val[ll_arry1[k]] =(char)(ascint+30);
			
		}
			
		//	ll_count=ls_val.length;
			
			//System.out.println("加密="+String.valueOf(ls_val));
			String str=String.valueOf(ls_val);
			this.bb(str);
			/**
			 * 
			 * ls_position = string(rand(5))
		ls_coupon_pass_id = wf_set_password(ls_coupon_pass_id,ls_position,1)
		
			 * for k = 1 to ll_count
		ls_data[1] = ls_val[ll_arry2[k]]
		ls_data[2] = ls_val[ll_arry1[k]]
		ls_val[ll_arry2[k]] = char(asc(ls_data[2]) + 30)
		ls_val[ll_arry1[k]] = char(asc(ls_data[1]) + 30)
	next

	ll_count = upperbound(ls_val)

	for k = 1 to ll_count
		ls_rtn = ls_rtn + ls_val[k]
	next
			 * 
			 * */
				
	
	}
	
	
	public void bb(String str){
		
		
		try
		{
		//加载驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//得到连接
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.43.151:1521:qaet1", "et1_china", "et1_chinayezi");
		String sp="{call pkg_customercard.express_password(?,?)}";
		
		//3、使用java.sql.*类
		 CallableStatement cs=conn.prepareCall(sp);
		//4、传入in值
		 cs.setString(1, str);
		 cs.registerOutParameter(2,Types.VARCHAR);
		//6、执行
		cs.execute();
		//7、取出out值
		 String flag=cs.getString(2);
		 System.out.print("测试信息="+flag);
		 
		cs.close();
		conn.close();
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		
	}
}