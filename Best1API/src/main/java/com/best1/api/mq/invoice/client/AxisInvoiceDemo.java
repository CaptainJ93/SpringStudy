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
 * @author guojb
 * @date 2015-11-23 下午02:19:59 
 * @version V1.0
 * 说明：需要的jar包：axis.jar、commons-discovery-0.2.jar、commons-logging-1.0.4.jar、wsdl4j-1.5.1.jar
 */
public class AxisInvoiceDemo {
	
	public static void main(String[] args) throws UnsupportedEncodingException, MalformedURLException {
		Call call;
		String val = "";
		String content = "<REQUEST_COMMON_FPKJ class='REQUEST_COMMON_FPKJ'> <FPQQLSH>2016050908888</FPQQLSH><KPLX>0</KPLX><XSF_NSRSBH>440300568519737</XSF_NSRSBH><XSF_MC>电子发票测试</XSF_MC><XSF_DZDH>山东省青岛市</XSF_DZDH><XSF_YHZH>92523123213412341234</XSF_YHZH><GMF_NSRSBH>440300568519737</GMF_NSRSBH><GMF_MC>张三</GMF_MC><GMF_DZDH>浙江省杭州市余杭区文一西路xxx号18234561212</GMF_DZDH><GMF_YHZH>123412341234</GMF_YHZH><GMF_SJH>18234561212</GMF_SJH><GMF_DZYX>mytest@xxx.com</GMF_DZYX><FPT_ZH></FPT_ZH><KPR>小张</KPR><SKR></SKR><FHR>小林</FHR><YFP_DM>111100000000</YFP_DM><YFP_HM>00004349</YFP_HM><JSHJ>1170.00</JSHJ><HJJE>1000.00</HJJE><HJSE>170.00</HJSE><BZ>电子发票测试</BZ><HYLX>1</HYLX><BY1></BY1><BY2></BY2><BY3></BY3><BY4></BY4><BY5></BY5><BY6></BY6><BY7></BY7><BY8></BY8><BY9></BY9><BY10></BY10><COMMON_FPKJ_XMXXS class='COMMON_FPKJ_XMXX' size='1'><COMMON_FPKJ_XMXX><FPHXZ>0</FPHXZ><XMMC>电视机</XMMC><GGXH>X100</GGXH><DW>台</DW><XMSL>10</XMSL><XMDJ>100.00</XMDJ><XMJE>1000.00</XMJE><SL>0.17</SL><SE>170.00</SE><BY1></BY1><BY2></BY2><BY3></BY3><BY4></BY4><BY5></BY5><BY6></BY6></COMMON_FPKJ_XMXX></COMMON_FPKJ_XMXXS></REQUEST_COMMON_FPKJ>";
		String xml = getCommonXml("DFXJ1001", new BASE64Encoder().encodeBuffer(content.getBytes("UTF-8")));
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
			String ssl_store = "C:/cer/fapiao.truststore";
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
			call.setTargetEndpointAddress(new java.net.URL("https://218.17.158.39:8999/fpt_dsqz/services/DZFPService"));
			call.setOperation("doService");
			Object[] fn01 = {xml};
			val = (String) call.invoke(fn01);
			System.out.println(val);
		} catch (Exception e) {
			val=e.getMessage();//返回错误信息
			System.out.println(val);
		}
	}
	
	public static String getCommonXml(String interfaceCode,String content){
		StringBuffer sb = new StringBuffer("");
		sb.append("<?xml version='1.0' encoding='UTF-8' ?>");
		sb.append("<interface xmlns=\"\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:schemaLocation=\"http://www.chinatax.gov.cn/tirip/dataspec/interfaces.xsd\" version=\""
				+ "DZFPQZ0.2" + "\"> ");
		sb.append("<globalInfo>");
		sb.append("<appId>502361120b63e2bd10d526aa811687bfa59f2173b552fefbb4ffece161094413</appId>");
		sb.append("<interfaceId></interfaceId>");
		sb.append("<interfaceCode>" + interfaceCode + "</interfaceCode>");
		sb.append("<requestCode>DZFPQZ</requestCode>");
		sb.append("<requestTime>" + formatToTime() + "</requestTime>");
		sb.append("<responseCode>Ds</responseCode>");
		sb.append("<dataExchangeId>" + "DZFPQZ" + interfaceCode
				+ formatToDay() + randNineData()
				+ "</dataExchangeId>");
		sb.append("</globalInfo>");
		sb.append("<returnStateInfo>");
		sb.append("<returnCode></returnCode>");
		sb.append("<returnMessage></returnMessage>");
		sb.append("</returnStateInfo>");
		sb.append("<Data>");
		sb.append("<dataDescription>");
		sb.append("<zipCode>0</zipCode>");
		sb.append("</dataDescription>");
		sb.append("<content>");
		sb.append(content);
		sb.append("</content>");
		sb.append("</Data>");
		sb.append("</interface>");
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
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format((new Date()));
	}
	
	/************************************************************************
	 * 9位随机整数
	 */
	public static String randNineData(){
		return String.valueOf((int)(Math.random()*900000000+100000000));
	}
}
