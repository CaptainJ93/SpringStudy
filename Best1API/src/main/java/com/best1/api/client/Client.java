package com.best1.api.client;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;
import java.util.Date;
import java.util.Random;

import javax.xml.namespace.QName;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.encoding.ser.BeanDeserializerFactory;
import org.apache.axis.encoding.ser.BeanSerializerFactory;

import com.best1.api.entity.chm.PgmProduct;
import com.best1.api.entity.oaf.order.CustomerOrderInfo;


public class Client {

	
	private int[] ll_arry12;

	public void aa(String as_string,int as_option,int al_flag){
		
		
		    //String as_string="7301003224";
	        //String as_option="";
	        char ls_data[] = new char[10];
	      //  int al_flag=1;
	        char ls_val[]= new char[11];
	        int ls_position=new Random().nextInt(5) + 1;
	        int ll_count;
	        		
	        
			int ll_arry1[];
			int ll_arry2[];
			
			
			switch(as_option) 
			{ 
			case 1: 

				 ll_arry1 =new int[] {-1,1,7,5,3,9};
				 ll_arry2 = new int[]{-1,2,8,4,6,10};
			break; 
			case 2: 
				ll_arry1 = new int[]{-1,6,2,5,1,9};
				ll_arry2 = new int[]{-1,10,7,3,4,8}; 
			break; 
			case 3: 
				ll_arry1 = new int[]{-1,3,5,6,7,8};
				ll_arry2 = new int[]{-1,9,10,4,2,1};
			break; 
			case 4: 
				ll_arry1 = new int[]{-1,4,3,1,6,7};
				ll_arry2 = new int[]{-1,5,8,2,10,9};
			break; 
			default: 
				ll_arry1 = new int[]{-1,7,5,3,4,2};
				ll_arry2 = new int[]{-1,9,8,6,1,10};
			break; 
			}
			
			 ll_count = as_string.length();
			char[] ls_valx=as_string.toCharArray();
			
			
			int ls_valxint=ls_valx.length;
			
			for (int x=0;x<ls_valxint;x++){
				ls_val[x+1]=ls_valx[x];	
				
			}
		
			ll_count=ll_arry1.length;
		
			int ascint;
			char ls_datachar;
			if(al_flag==1){
				for (int k =1 ;k< ll_count;k++)
				{	
					
					ls_data[1] = ls_val[ll_arry1[k]];
					ls_data[2] = ls_val[ll_arry2[k]];
					ls_datachar = ls_data[2];
					ascint=(int)ls_datachar;
					System.out.println(ls_datachar+"|"+ascint);
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
			System.out.println("加密="+str);
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
	
	
	public static void main(String[] args) throws Exception {
        Client c=new Client();
//        String as_string="7301003224";
//        int  as_option=1;
//        int al_flag=1;
//        c.aa(as_string, as_option, al_flag);
//       // c.aa();
//        CustomerServer.doGet("http://127.0.0.1:8080/Best1API/cxf/crm/customerservice/querylotterybonuFromCustomerid", null);
	}

	/***
	 * 销退终止
	 * 
	 * select * from toaf_returnproducts rt, toaf_orderedproduct o where
	 * rt.orderid = o.orderid and rt.itemid = o.itemid and o.deliverytype = 1002
	 * and rt.returnstatus=1003 and o.orderstatus!=1006
	 * 
	 * 
	 * 
	 * **/
	public void returnFailAbortRejectAPI() throws Exception {

		CustomerOrderInfo c = new CustomerOrderInfo();
		c.setOrderid(2060806L);
		c.setSupplierid(1L);
		// c.setItemid(1);

		// c.setDeliveryorderid("ZJ0000001DS");
		// c.setSelectedcarrier(1000032L);
		c.setCreatedby(30364L);
		// c.setActualshippeddate(new Date());
		c.setReasoncode(10 + "");
		c.setRemarks("R01联络不上客户");
		c.setDeleverystatus(1002);// 固定
		/**
		 * 
		 * 配送公司----到厂取货 aDeliveryOrderId =
		 * orderedResultDetails.getDeliveryorderid(); aReturnActualPickUpDate =
		 * EHSNDateUtil .convertToDate(orderedResultDetails
		 * .getReturnactualpickupdate());
		 * **/

		Service service = new Service();
		Call call = (Call) service.createCall();

		QName qn = new QName("urn:BeanService", "CustomerOrderInfo");
		call.registerTypeMapping(CustomerOrderInfo.class, qn,
				new BeanSerializerFactory(CustomerOrderInfo.class, qn),
				new BeanDeserializerFactory(CustomerOrderInfo.class, qn));

		String wsdlUrl = "http://127.0.0.1:7001/erpapi/returnOrderForSupplierWS?wsdl";
		String nameSpaceUri = "http://127.0.0.1:7001/erpapi/returnOrderForSupplierWS";

		QName getDescQn = new QName(nameSpaceUri, "returnFailAbortRejectAPI");
		call.setOperationName(getDescQn);
		call.setTargetEndpointAddress(new java.net.URL(wsdlUrl));
		String retk = (String) call.invoke(new Object[] { c });
		System.out.print(retk);

	}

	/*** 销退入库 **/
	public void returnConfirmAPI() throws Exception {

		CustomerOrderInfo c = new CustomerOrderInfo();
		c.setOrderid(2060806L);
		c.setSupplierid(1L);
		// c.setItemid(1);

		// c.setDeliveryorderid("ZJ0000001DS");
		// c.setSelectedcarrier(1000032L);
		c.setCreatedby(30364L);
		// c.setActualshippeddate(new Date());
		// c.setReasoncode(10+"");
		// c.setRemarks("R01联络不上客户");
		/**
		 * 
		 * 配送公司----到厂取货 aDeliveryOrderId =
		 * orderedResultDetails.getDeliveryorderid(); aReturnActualPickUpDate =
		 * EHSNDateUtil .convertToDate(orderedResultDetails
		 * .getReturnactualpickupdate());
		 * **/

		Service service = new Service();
		Call call = (Call) service.createCall();

		QName qn = new QName("urn:BeanService", "CustomerOrderInfo");
		call.registerTypeMapping(CustomerOrderInfo.class, qn,
				new BeanSerializerFactory(CustomerOrderInfo.class, qn),
				new BeanDeserializerFactory(CustomerOrderInfo.class, qn));

		String wsdlUrl = "http://127.0.0.1:7001/erpapi/returnOrderForSupplierWS?wsdl";
		String nameSpaceUri = "http://127.0.0.1:7001/erpapi/returnOrderForSupplierWS";

		QName getDescQn = new QName(nameSpaceUri, "returnConfirmAPI");
		call.setOperationName(getDescQn);
		call.setTargetEndpointAddress(new java.net.URL(wsdlUrl));
		String retk = (String) call.invoke(new Object[] { c });
		System.out.print(retk);

	}

	/*** 销退逾期 **/
	public void returnReasonInfoAPI() throws Exception {

		CustomerOrderInfo c = new CustomerOrderInfo();
		c.setOrderid(2060806L);
		c.setSupplierid(1L);
		// c.setItemid(1);

		// c.setDeliveryorderid("ZJ0000001DS");
		// c.setSelectedcarrier(1000032L);
		c.setCreatedby(30364L);
		// c.setActualshippeddate(new Date());
		/***
		 * select * from tcmn_domaindata dk where
		 * dk.domainname='AbortReasonCode' 新增，ID,表示客户填写，配送公司以及配送号
		 * 
		 * **/
		c.setReasoncode(10 + "");

		/***
		 * 
		 * select * from tcmn_domaindata dk where
		 * dk.domainname='AbortReasonCode' 客户寄回 新增，Remarks，配送公司以及配送号
		 * 
		 * **/
		c.setRemarks("R01联络不上客户");

		Service service = new Service();
		Call call = (Call) service.createCall();

		QName qn = new QName("urn:BeanService", "CustomerOrderInfo");
		call.registerTypeMapping(CustomerOrderInfo.class, qn,
				new BeanSerializerFactory(CustomerOrderInfo.class, qn),
				new BeanDeserializerFactory(CustomerOrderInfo.class, qn));

		String wsdlUrl = "http://127.0.0.1:7001/erpapi/returnOrderForSupplierWS?wsdl";
		String nameSpaceUri = "http://127.0.0.1:7001/erpapi/returnOrderForSupplierWS";

		QName getDescQn = new QName(nameSpaceUri, "returnReasonInfoAPI");
		call.setOperationName(getDescQn);
		call.setTargetEndpointAddress(new java.net.URL(wsdlUrl));
		String retk = (String) call.invoke(new Object[] { c });
		System.out.print(retk);

	}

	/*** 配送终止 **/
	public void failureCustomerShipOrderAPI() throws Exception {

		CustomerOrderInfo c = new CustomerOrderInfo();
		// c.setOrderid(1283L);
		// c.setItemid(1);
		c.setShiporderid(4948790L);
		c.setSequenceno(1);
		c.setSupplierid(1L);
		// c.setDeliveryorderid("ZJ0000001DS");
		// c.setSelectedcarrier(1000032L);
		c.setCreatedby(30364L);
		c.setDeliveryresult("1002");
		// c.setActualshippeddate(new Date());
		c.setWsdate("2014-11-20");

		Service service = new Service();
		Call call = (Call) service.createCall();

		QName qn = new QName("urn:BeanService", "CustomerOrderInfo");
		call.registerTypeMapping(CustomerOrderInfo.class, qn,
				new BeanSerializerFactory(CustomerOrderInfo.class, qn),
				new BeanDeserializerFactory(CustomerOrderInfo.class, qn));

		String wsdlUrl = "http://127.0.0.1:7001/erpapi/customerShipOrderWS?wsdl";
		String nameSpaceUri = "http://127.0.0.1:7001/erpapi/customerShipOrderWS";

		QName getDescQn = new QName(nameSpaceUri, "failureCustomerShipOrderAPI");
		call.setOperationName(getDescQn);
		call.setTargetEndpointAddress(new java.net.URL(wsdlUrl));
		String retk = (String) call.invoke(new Object[] { c });
		System.out.print(retk);

	}

	/*** 配送确认 **/
	public void confirmCustomerShipOrderAPI() throws Exception {

		CustomerOrderInfo c = new CustomerOrderInfo();
		// c.setOrderid(1283L);
		// c.setItemid(1);
		c.setShiporderid(1781824L);
		c.setSequenceno(1);
		c.setSupplierid(1L);
		// c.setDeliveryorderid("ZJ0000001DS");
		// c.setSelectedcarrier(1000032L);
		c.setCreatedby(30364L);
		c.setActualdeliverydate(new Date());

		Service service = new Service();
		Call call = (Call) service.createCall();

		QName qn = new QName("urn:BeanService", "CustomerOrderInfo");
		call.registerTypeMapping(CustomerOrderInfo.class, qn,
				new BeanSerializerFactory(CustomerOrderInfo.class, qn),
				new BeanDeserializerFactory(CustomerOrderInfo.class, qn));

		String wsdlUrl = "http://127.0.0.1:7001/erpapi/customerShipOrderWS?wsdl";
		String nameSpaceUri = "http://127.0.0.1:7001/erpapi/customerShipOrderWS";

		QName getDescQn = new QName(nameSpaceUri, "confirmCustomerShipOrderAPI");
		call.setOperationName(getDescQn);
		call.setTargetEndpointAddress(new java.net.URL(wsdlUrl));
		String retk = (String) call.invoke(new Object[] { c });
		System.out.print(retk);

	}

	/** 逾期处理 **/
	public void reasonInfoAPI() throws Exception {

		CustomerOrderInfo c = new CustomerOrderInfo();
		// c.setOrderid(1283L);
		// c.setItemid(1);
		c.setShiporderid(1781824L);
		c.setSequenceno(1);
		c.setSupplierid(1L);
		// c.setDeliveryorderid("ZJ0000001DS");
		// c.setSelectedcarrier(1000031L);
		c.setReasoncode(10 + "");
		c.setRemarks("R01 主商品缺货");
		c.setCreatedby(30364L);

		Service service = new Service();
		Call call = (Call) service.createCall();

		QName qn = new QName("urn:BeanService", "CustomerOrderInfo");
		call.registerTypeMapping(CustomerOrderInfo.class, qn,
				new BeanSerializerFactory(CustomerOrderInfo.class, qn),
				new BeanDeserializerFactory(CustomerOrderInfo.class, qn));

		String wsdlUrl = "http://127.0.0.1:7001/erpapi/customerShipOrderWS?wsdl";
		String nameSpaceUri = "http://127.0.0.1:7001/erpapi/customerShipOrderWS";

		QName getDescQn = new QName(nameSpaceUri, "reasonInfoAPI");
		call.setOperationName(getDescQn);
		call.setTargetEndpointAddress(new java.net.URL(wsdlUrl));
		String retk = (String) call.invoke(new Object[] { c });
		System.out.print(retk);

	}

	/** 出货，确认 */
	public void shippingConfirmedAPI() throws Exception {

		CustomerOrderInfo c = new CustomerOrderInfo();
		// c.setOrderid(1283L);
		// c.setItemid(1);
		c.setShiporderid(2368055L);
		c.setSequenceno(1);
		c.setSupplierid(1L);
		c.setDeliveryorderid("ZJ0000001DS");
		c.setSelectedcarrier(1000032L);
		c.setCreatedby(30364L);
		// c.setShipordercreateddate(new Date());
		c.setWsdate("2014-11-19");

		Service service = new Service();
		Call call = (Call) service.createCall();

		QName qn = new QName("urn:BeanService", "CustomerOrderInfo");
		call.registerTypeMapping(CustomerOrderInfo.class, qn,
				new BeanSerializerFactory(CustomerOrderInfo.class, qn),
				new BeanDeserializerFactory(CustomerOrderInfo.class, qn));

		String wsdlUrl = "http://127.0.0.1:7001/erpapi/customerShipOrderWS?wsdl";
		String nameSpaceUri = "http://127.0.0.1:7001/erpapi/customerShipOrderWS";

		QName getDescQn = new QName(nameSpaceUri, "shippingConfirmedAPI");
		call.setOperationName(getDescQn);
		call.setTargetEndpointAddress(new java.net.URL(wsdlUrl));
		String retk = (String) call.invoke(new Object[] { c });
		System.out.print(retk);

	}

	/** 上架 */
	public void WebProductSelectionAPI() throws Exception {

		PgmProduct c = new PgmProduct();
		c.setProductid(110888L);//
		c.setCreatedby(30364L);//
		c.setColourcode(5037);//
		c.setColourclass(5001);// /
		c.setStylecode(5172);//
		c.setStyleclass(5016);//
		c.setProductversion(1);//
		c.setProductname("测试2_驳回0611");
		c.setCostprice(3567.00);
		c.setSellingprice(4545.00);
		c.setStarttime("2014/10/20");//
		c.setLclasscode(20000);
		c.setMclasscode(20400);
		c.setSclasscode(20416);
		c.setMdid(30822L);
		c.setMxavailableqty(10000000L);
		c.setSalestype(1001);
		c.setDeliverytype(1001);
		c.setProducttype(1002);
		c.setSubchannelid(5L);//
		c.setPlannedquantity(100);//

		/***
		 * c.setPaymentstatus(3202); c.setOrderstatus(1000);
		 * c.setProductid(110880L); c.setCustomerid(20011L);
		 * c.setMulticodeid(1110880L);
		 * c.setProductname("更改商品名称测试更改商品名称商品美的四开门冰箱bcd12 "); c.setQuantity(1);
		 * c.setDeliverytype(1001); c.setColourclass(5005);
		 * c.setColourcode(5054); c.setStyleclass(5016); c.setStylecode(5172);
		 * c.setIspromotionalproduct("N"); c.setIsoffshoredelivery("Y");
		 * c.setCreatedby(30364L); c.setProductamount(2810.0);
		 * c.setSecondarycancelreason(232); c.setPrimarycancelreason(1007);
		 ***/

		// c.setRemarks("AAAAAAAA");

		Service service = new Service();
		Call call = (Call) service.createCall();

		QName qn = new QName("urn:BeanService", "PgmProduct");
		call.registerTypeMapping(PgmProduct.class, qn,
				new BeanSerializerFactory(PgmProduct.class, qn),
				new BeanDeserializerFactory(PgmProduct.class, qn));

		String wsdlUrl = "http://127.0.0.1:7001/erpapi/webProductSelectionWS?wsdl";
		String nameSpaceUri = "http://127.0.0.1:7001/erpapi/webProductSelectionWS";

		QName getDescQn = new QName(nameSpaceUri, "webPrdSelectionAPI");
		call.setOperationName(getDescQn);
		call.setTargetEndpointAddress(new java.net.URL(wsdlUrl));
		String retk = (String) call.invoke(new Object[] { c });
		System.out.print(retk);

	}

	/** 换换 */
	public void exchangeProductAPI() throws Exception {

		CustomerOrderInfo c = new CustomerOrderInfo();
		c.setOrderid(1283L);//
		c.setItemid(1);//
		c.setReturnqty(1);
		c.setReturntype(1002);//
		c.setReturnreason1(1001);//
		c.setReturnreason2(1016);//
		c.setCreatedby(30364L);//
		c.setColourcode(5037);//
		c.setColourclass(5001);// //
		c.setStylecode(5172);//
		c.setStyleclass(5016);//
		c.setProductid(10L);//
		c.setProductversion(1);//
		c.setProductname("ET1展示商审会商品一");//

		/***
		 * c.setPaymentstatus(3202); c.setOrderstatus(1000);
		 * c.setProductid(110880L); c.setCustomerid(20011L);
		 * c.setMulticodeid(1110880L);
		 * c.setProductname("更改商品名称测试更改商品名称商品美的四开门冰箱bcd12 "); c.setQuantity(1);
		 * c.setDeliverytype(1001); c.setColourclass(5005);
		 * c.setColourcode(5054); c.setStyleclass(5016); c.setStylecode(5172);
		 * c.setIspromotionalproduct("N"); c.setIsoffshoredelivery("Y");
		 * c.setCreatedby(30364L); c.setProductamount(2810.0);
		 * c.setSecondarycancelreason(232); c.setPrimarycancelreason(1007);
		 ***/
		c.setLastmodifiedtimestamp(new Date("2014/09/09  16:38 "));
		c.setCustomerid(198L);
		// c.setRemarks("AAAAAAAA");

		Service service = new Service();
		Call call = (Call) service.createCall();

		QName qn = new QName("urn:BeanService", "CustomerOrderInfo");
		call.registerTypeMapping(CustomerOrderInfo.class, qn,
				new BeanSerializerFactory(CustomerOrderInfo.class, qn),
				new BeanDeserializerFactory(CustomerOrderInfo.class, qn));

		String wsdlUrl = "http://127.0.0.1:7001/erpapi/acceptReturnWS?wsdl";
		String nameSpaceUri = "http://127.0.0.1:7001/erpapi/acceptReturnWS";

		QName getDescQn = new QName(nameSpaceUri, "exchangeProductAPI");
		call.setOperationName(getDescQn);
		call.setTargetEndpointAddress(new java.net.URL(wsdlUrl));
		String retk = (String) call.invoke(new Object[] { c });
		System.out.print(retk);

	}

	/** 销退 **/
	public void returnProductAPI() throws Exception {

		CustomerOrderInfo c = new CustomerOrderInfo();
		c.setOrderid(2366357L);//
		c.setItemid(1);//
		c.setReturnqty(1);
		c.setReturntype(1001);//
		c.setReturnreason1(1001);//
		c.setReturnreason2(1016);//
		c.setCreatedby(30364L);//

		/***
		 * c.setPaymentstatus(3202); c.setOrderstatus(1000);
		 * c.setProductid(110880L); c.setCustomerid(20011L);
		 * c.setMulticodeid(1110880L);
		 * c.setProductname("更改商品名称测试更改商品名称商品美的四开门冰箱bcd12 "); c.setQuantity(1);
		 * c.setDeliverytype(1001); c.setColourclass(5005);
		 * c.setColourcode(5054); c.setStyleclass(5016); c.setStylecode(5172);
		 * c.setIspromotionalproduct("N"); c.setIsoffshoredelivery("Y");
		 * c.setCreatedby(30364L); c.setProductamount(2810.0);
		 * c.setSecondarycancelreason(232); c.setPrimarycancelreason(1007);
		 ***/
		c.setLastmodifiedtimestamp(new Date("2014/09/09  16:38 "));
		// c.setRemarks("AAAAAAAA");

		Service service = new Service();
		Call call = (Call) service.createCall();

		QName qn = new QName("urn:BeanService", "CustomerOrderInfo");
		call.registerTypeMapping(CustomerOrderInfo.class, qn,
				new BeanSerializerFactory(CustomerOrderInfo.class, qn),
				new BeanDeserializerFactory(CustomerOrderInfo.class, qn));

		String wsdlUrl = "http://127.0.0.1:7001/erpapi/acceptReturnWS?wsdl";
		String nameSpaceUri = "http://127.0.0.1:7001/erpapi/acceptReturnWS";

		QName getDescQn = new QName(nameSpaceUri, "returnProductAPI");
		call.setOperationName(getDescQn);
		call.setTargetEndpointAddress(new java.net.URL(wsdlUrl));
		String retk = (String) call.invoke(new Object[] { c });

		System.out.print(retk);

	}

	/**
	 * 订单取消
	 * **/
	public void cancelProductAPI() throws Exception {

		CustomerOrderInfo c = new CustomerOrderInfo();
		c.setOrderid(2366381L);//
		c.setItemid(1);//
		c.setPaymentstatus(3202);
		c.setOrderstatus(1000);
		c.setProductid(110880L);
		c.setCustomerid(20011L);
		c.setMulticodeid(1110880L);
		c.setProductname("更改商品名称测试更改商品名称商品美的四开门冰箱bcd12 ");
		c.setQuantity(1);
		c.setDeliverytype(1001);
		c.setColourclass(5005);
		c.setColourcode(5054);
		c.setStyleclass(5016);
		c.setStylecode(5172);
		c.setIspromotionalproduct("N");
		c.setIsoffshoredelivery("Y");
		c.setCreatedby(30364L);//
		c.setProductamount(2810.0);
		c.setSecondarycancelreason(232);//
		c.setPrimarycancelreason(1007);//
		c.setLastmodifiedtimestamp(new Date("2014/09/09  16:38 "));
		c.setRemarks("AAAAAAAA");//

		Service service = new Service();
		Call call = (Call) service.createCall();

		QName qn = new QName("urn:BeanService", "CustomerOrderInfo");
		call.registerTypeMapping(CustomerOrderInfo.class, qn,
				new BeanSerializerFactory(CustomerOrderInfo.class, qn),
				new BeanDeserializerFactory(CustomerOrderInfo.class, qn));

		// String wsdlUrl =
		// "http://localhost:8080/axis/services/SimpleObjectService?wsdl";
		// String nameSpaceUri =
		// "http://localhost:8080/axis/services/SimpleObjectService";
		String wsdlUrl = "http://127.0.0.1:7001/erpapi/cancelProductWS?wsdl";
		String nameSpaceUri = "http://127.0.0.1:7001/erpapi/cancelProductWS";

		/**
		 * call.setOperationName(new QName(nameSpaceUri, "say"));
		 * call.setTargetEndpointAddress(new java.net.URL(wsdlUrl)); String ret
		 * = (String) call.invoke(new Object[] { "liu2" });
		 * System.out.print(ret);
		 ***/
		QName getDescQn = new QName(nameSpaceUri, "cancelProductAPI");
		call.setOperationName(getDescQn);
		call.setTargetEndpointAddress(new java.net.URL(wsdlUrl));
		String retk = (String) call.invoke(new Object[] { c });
		System.out.print(retk);

	}
}
