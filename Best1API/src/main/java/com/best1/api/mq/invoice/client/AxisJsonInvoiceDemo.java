package com.best1.api.mq.invoice.client;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

import sun.misc.BASE64Encoder;
/**
 * 用axis调用webservice开票demo
 * @author Anne
 * @date 2016-04-13  
 * @version V1.0
 * 说明：需要的jar包：axis.jar、commons-discovery-0.2.jar、commons-logging-1.0.4.jar、wsdl4j-1.5.1.jar
 */
public class AxisJsonInvoiceDemo {
	
	public static void main(String[] args) throws UnsupportedEncodingException, MalformedURLException {
		Call call;
		String val = "";
		String content = jsonContent();
		String baseContent = new BASE64Encoder().encodeBuffer(content.getBytes("UTF-8"));
		baseContent = baseContent.trim().replaceAll("\r\n", "");
		String json = jsonCommon("DFXJ1001", baseContent);
		json = json.replaceAll("\r\n", "");
		try {
			/**
			 * 	 进入test.cer所在目录，执行如下操作（注意配置环境变量），生成testclient.truststore文件:
			 *   keytool -import -file test.cer -storepass 123456 -keystore testclient.truststore
			 *   然后输入“y”，回车
			 *   命令说明：
			 *   keytool  JDK提供的证书生成工具，所有参数的用法参见keytool –help
			 *   -import  执行导入
			 *   -file test.cer  要导入的证书，即从ie上导出的证书
			 *   -storepass 123456  证书的存取密码
			 *   -keystore testclient.truststore 保存路径及文件名
			 */
			//String ssl_store = "E:/cszs/testclient.truststore";
			//String ssl_store = "C:/cer/fapiao.truststore";
			String ssl_store = "C:/cer/testclient.truststore";
			String ssl_pwd = "123456";
			System.setProperty("javax.net.ssl.trustStore", ssl_store);
			System.setProperty("javax.net.ssl.keyStorePassword", ssl_pwd);
			HostnameVerifier hv = new HostnameVerifier() {
				public boolean verify(String urlHostName, SSLSession session) {
					System.out.println("Warning: URL Host: " + urlHostName
							+ " vs. " + session.getPeerHost());
					return true;
				}
			};
			HttpsURLConnection.setDefaultHostnameVerifier(hv);
			
			Service s = new Service();
			call = (Call) s.createCall();
			//call.setTargetEndpointAddress(new java.net.URL("https://218.17.158.39:8999/fpt_dsqz/services/DZFPJsonService"));
			call.setTargetEndpointAddress(new java.net.URL("https://202.104.113.26:8999/fpt_dsqz/services/DZFPJsonService"));
			//https://202.104.113.26:8999/fpt_dsqz/services/DZFPJsonService
			
			call.setOperation("doJsonService");
			System.out.println("Json");
			
			Object[] fn01 = {json};
			val = (String) call.invoke(fn01);
			System.out.println(val);
		} catch (Exception e) {
			val=e.getMessage();//返回错误信息
			System.out.println(val);
		}
	}
	
	//组装json格式报文头
	public static String jsonCommon(String interfaceCode, String content){
		StringBuffer sb = new StringBuffer("");
		sb.append("{\"globalInfo\": {");
//		sb.append("\"appId\":\"百望电子提供appId\"" );//错误的appID
		//正确的测试appId
		sb.append("\"appId\":\""+ "502361120b63e2bd10d526aa811687bfa59f2173b552fefbb4ffece161094413" +"\"" );
		sb.append(",\"interfaceId\": \"2222\"");
		sb.append(",\"interfaceCode\":\""+interfaceCode+"\"");
		sb.append(",\"requestCode\":\"DZFPQZ\"");
		sb.append(",\"requestTime\":\""+formatToTime()+"\"");
		sb.append(",\"responseCode\":\"DS\"");
		sb.append(",\"dataExchangeId\":"+"\"DZFPQZ" + interfaceCode + formatToDay() + randNineData()+"\"");
		sb.append("},\"returnStateInfo\": {\"returnCode\":\"0000(成功) 0001-9999(错误码)\"");
		sb.append(",\"returnMessage\":\"成功或错误的详细消息\"");
		sb.append("},\"Data\":{\"dataDescription\":{\"zipCode\":\"0\"");
		sb.append("},\"content\":\""+content +"\"}}");
		
		return sb.toString();
	}
	
	//组装json报文格式cotent
	public static String jsonContent(){
		StringBuffer sb = new StringBuffer("");
		sb.append("{\"REQUEST_COMMON_FPKJ\": {");
		sb.append("\"FPQQLSH\":\"201604130959001\"");
		sb.append(",\"KPLX\":\"0\"");
		sb.append(",\"XSF_NSRSBH\":\"440300568519737\"");
		sb.append(",\"XSF_MC\":\"电子发票测试\"");
		sb.append(",\"XSF_DZDH\":\"南山区蛇口、83484949\"");
		sb.append(",\"XSF_YHZH\":\"610118191919191919\"");
		sb.append(",\"GMF_MC\": \"张三\"");
		sb.append(",\"KPR\": \"Anne\"");
		sb.append(",\"SKR\": \"Carol\"");
		sb.append(",\"FHR\": \"Windy\"");
		sb.append(",\"JSHJ\": \"117\"");
		sb.append(",\"HJJE\": \"100\"");
		sb.append(",\"HJSE\": \"17\"");
		sb.append(",\"BZ\": \"备注\"");
		sb.append(",\"GMF_SJH\": \"15920066345,18964787876\"");
		sb.append(",\"GMF_DZYX\": \"fengfan_yan@139.com\"");
		sb.append(",\"HYLX\": \"0\"");
		sb.append(",\"BY1\": \"1\"");
		sb.append(",\"COMMON_FPKJ_XMXXS\": {");
		sb.append("\"COMMON_FPKJ_XMXX\": {");
		sb.append("\"FPHXZ\": \"0\"");
		sb.append(",\"XMMC\": \"洗衣液\"");
		sb.append(",\"GGXH\": \"500克\"");
		sb.append(",\"DW\": \"袋\"");
		sb.append(",\"XMSL\": \"1\"");
		sb.append(",\"XMDJ\": \"100\"");
		sb.append(",\"XMJE\": \"100\"");
		sb.append(",\"SL\": \"0.17\"");
		sb.append(",\"SE\": \"17\"");
		sb.append("} } } }");
		
		return sb.toString();
	}
	
	public static String jsonContent2(){
		StringBuffer sb = new StringBuffer("");
		sb.append("{\"REQUEST_COMMON_FPKJ\": {");
		sb.append("\"FPQQLSH\":\"201604130959001\"");
		sb.append(",\"XSF_NSRSBH\":\"440300568519737\"}");
		
		return sb.toString();
	} 
	
	/************************************************************************
	 * 格式化时间-时间
	 */
	public static String formatToTime(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format((new Date()));
	}
	
	/************************************************************************
	 * 格式化时间-日
	 */
	public static String formatToDay(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd");
		return sdf.format((new Date()));
	}
	
	/************************************************************************
	 * 9位随机整数
	 */
	public static String randNineData(){
		return String.valueOf((int)(Math.random()*900000000+100000000));
	}
}
