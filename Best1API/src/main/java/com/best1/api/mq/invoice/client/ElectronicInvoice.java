package com.best1.api.mq.invoice.client;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.best1.api.entity.oaf.order.CustomerOrderinvoiceinfo;
import com.best1.api.entity.oaf.order.ToafEorderinvoiceinfo;
import com.best1.api.mq.invoice.bean.COMMON_FPKJ_XMXX;
import com.best1.api.mq.invoice.bean.COMMON_FPKJ_XMXXS;
import com.best1.api.mq.invoice.bean.Content;
import com.best1.api.mq.invoice.bean.Data;
import com.best1.api.mq.invoice.bean.DataDescription;
import com.best1.api.mq.invoice.bean.GlobalInfo;
import com.best1.api.mq.invoice.bean.InvoiceMessage;
import com.best1.api.mq.invoice.bean.REQUEST_COMMON_FPKJ;
import com.best1.api.mq.invoice.bean.Response;
import com.best1.api.mq.invoice.bean.ReturnStateInfo;
import com.best1.api.mq.weixin.client.MsgSend;
import com.best1.api.service.oaf.InvoiceManageSerevice;
import com.best1.api.utils.APIConstant;
import com.best1.api.utils.ConfigInfo;
import com.best1.api.utils.DESUtil;
import com.best1.api.utils.DateUtil;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ElectronicInvoice {
	private static Logger logger = LoggerFactory
			.getLogger(ElectronicInvoice.class);

	@Autowired
	private ConfigInfo configInfo;
	
	@Autowired
	private MsgSend  msgSend;
	
	
	@Autowired
	private InvoiceManageSerevice invoiceManageSerevice;

	public void InvoicePrint() throws Exception {
		logger.info("发票打印");
		
		int taxrated=configInfo.getTaxrate();
		CustomerOrderinvoiceinfo orderInvoice = new CustomerOrderinvoiceinfo();
		//orderInvoice.setOrderid(2123949L);
		orderInvoice.setIseinvoice("Y");
		// orderInvoice.setOrderid(2368219L);
		 orderInvoice.setOrderstatus(1003);
		orderInvoice.setCompanyid(2L);
		List<CustomerOrderinvoiceinfo> orderInvoices = invoiceManageSerevice
				.orderInvoicePrint(orderInvoice);

		for (CustomerOrderinvoiceinfo obj : orderInvoices) {

			REQUEST_COMMON_FPKJ request_common_fpkj = new REQUEST_COMMON_FPKJ();

			request_common_fpkj.setFPQQLSH(obj.getInvoiceinfoid().toString());
			request_common_fpkj.setKPLX("0");
			request_common_fpkj.setZSFS("0");
			request_common_fpkj.setXSF_NSRSBH(configInfo.getXsf_nsrsbh());
			request_common_fpkj.setXSF_MC(configInfo.getXsf_mc());
			request_common_fpkj.setXSF_DZDH(configInfo.getXsf_dzdh());
			request_common_fpkj.setKPR(configInfo.getInvoice_kpr());
			request_common_fpkj.setSKR(configInfo.getInvoice_skr());
			request_common_fpkj.setXSF_YHZH(configInfo.getXsf_yhzh());// xsf_yhzh
			//request_common_fpkj.setXSF_YHZH(request_common_fpkj.getXSF_YHZH());
			request_common_fpkj.setGMF_MC(obj.getInvoicetitle()+"("+obj.getCustomerid()+")");
			request_common_fpkj.setSKR(configInfo.getInvoice_skr());
			request_common_fpkj.setFHR(configInfo.getInvoice_fhr());
			request_common_fpkj.setJSHJ(obj.getAmount().toString());
			//request_common_fpkj.setGMF_DZYX("huwenhua@best1.com");
			request_common_fpkj.setGMF_DZDH(obj.getAddress() + " "
					+ obj.getMobilenumber());
			request_common_fpkj.setGMF_SJH(obj.getMobilenumber());
			//request_common_fpkj.setGMF_SJH("18626882159");

			// invoice_kpr
            if(obj.getTaxrate()!=null&&obj.getTaxrate()>0){
            	taxrated=obj.getTaxrate();	
            	
            }
            double taxtateDouble=(double)taxrated/100;
            
			//Double hjje = obj.getAmount() / 1.17;// 不含税价
            Double hjje = obj.getAmount() / (taxtateDouble+1);// 不含税价
			//Double se = hjje * 0.17;// 税额
			Double se = hjje * taxtateDouble;// 税额
			DecimalFormat df = new DecimalFormat("######0.00");

			request_common_fpkj.setHJJE(df.format(hjje));

			request_common_fpkj.setHJSE(df.format(se));
			request_common_fpkj.setJSHJ(obj.getAmount().toString());
			if (obj.getItemid() > 9) {
				request_common_fpkj.setBZ(obj.getOrderid() + ""
						+ obj.getItemid());// 订单号
			} else {
				request_common_fpkj.setBZ(obj.getOrderid() + "0"
						+ obj.getItemid());// 订单号
			}

			request_common_fpkj.setHYLX("0");
			request_common_fpkj.setBY1("11");

			List<COMMON_FPKJ_XMXX> common_fpkj_xmxxlist = new ArrayList<COMMON_FPKJ_XMXX>();
			COMMON_FPKJ_XMXX common_fpkj_xmxx = new COMMON_FPKJ_XMXX();
			 common_fpkj_xmxx.setFPHXZ("0");
			 common_fpkj_xmxx.setSPBM(obj.getOveralltax());//编码
			common_fpkj_xmxx.setXMMC(obj.getProductid() + "_"
					+ obj.getProductname());
			//common_fpkj_xmxx.setGGXH("500克");
			 common_fpkj_xmxx.setGGXH(obj.getClr()+"_"+obj.getSty());
			 common_fpkj_xmxx.setDW(configInfo.getInvoice_dw());
			 common_fpkj_xmxx.setXMSL(obj.getQuantity()+"");
			common_fpkj_xmxx.setXMDJ(df.format(hjje));
			common_fpkj_xmxx.setXMJE(df.format(hjje));
			common_fpkj_xmxx.setSL(taxtateDouble+"");
			common_fpkj_xmxx.setSE(df.format(se));
			common_fpkj_xmxxlist.add(common_fpkj_xmxx);

			COMMON_FPKJ_XMXXS common_fpkj_xmxxs = new COMMON_FPKJ_XMXXS();
			common_fpkj_xmxxs.setCommon_fpkj_xmxx(common_fpkj_xmxxlist);
			request_common_fpkj.setCommon_fpkj_xmxxs(common_fpkj_xmxxs);
			Content content = new Content();
			content.setRequest_common_fpkj(request_common_fpkj);

			String contentstr = this.JsonInvoice(content);

			DataDescription dataDescription = new DataDescription();
			dataDescription.setZipCode("0");
			Data data = new Data();
			data.setDataDescription(dataDescription);
			data.setContent(contentstr);
			GlobalInfo globalInfo = this.jsonGlobalInfo();
			ReturnStateInfo returnstateinfo = this.jsonReturnStateInfo();
			InvoiceMessage invoiceMessage = new InvoiceMessage();
			invoiceMessage.setData(data);
			invoiceMessage.setGlobalInfo(globalInfo);
			invoiceMessage.setReturnstateinfo(returnstateinfo);
			String invoicestr = jsonCommon(invoiceMessage);
			logger.info(invoicestr);
			Response response = this.SendInvoice(invoicestr);
			if (response != null) {

				ToafEorderinvoiceinfo eorderinvoice = new ToafEorderinvoiceinfo();
				eorderinvoice.setInvoiceinfoid(Long.parseLong(response.getFpqqlsh()));
				eorderinvoice.setDzfphm(response.getKprq());
				eorderinvoice.setFpdm(response.getFp_dm());//发票代码
				eorderinvoice.setFphm(response.getFp_hm());//发票号码
				eorderinvoice.setCreatedby(1L);
				eorderinvoice.setLastmodifiedby(1L); //
				eorderinvoice.setKprq(response.getKprq());//开票日期
				eorderinvoice
						.setEinvoiceinfostatus(APIConstant.EINVOICEINFOSTATUS_PRINT);
				eorderinvoice.setInvoicepdf(response.getPdf_url());
				this.downLoadFromUrl(response.getPdf_url(), response.getFpqqlsh()+".pdf", configInfo.getFilepath());
				invoiceManageSerevice.createEorderinvoice(eorderinvoice);
			}

		}
	}
	
	
	public void InvoiceReturnConfirm() throws Exception {
		
		logger.info("发票冲红");
		int taxrated=configInfo.getTaxrate();
		
		CustomerOrderinvoiceinfo orderInvoice = new CustomerOrderinvoiceinfo();
		orderInvoice.setIseinvoice("Y");
		orderInvoice.setCompanyid(2L);
		orderInvoice
				.setEinvoiceinfostatus(APIConstant.EINVOICEINFOSTATUS_RETURN);
		//orderInvoice.setOrderid(2123949L);
		List<CustomerOrderinvoiceinfo> orderInvoices = invoiceManageSerevice
				.InvoiceReturnConfirm(orderInvoice);
		for (CustomerOrderinvoiceinfo obj : orderInvoices) {
				logger.info("符合发票冲红");
				REQUEST_COMMON_FPKJ request_common_fpkj = new REQUEST_COMMON_FPKJ();

				//request_common_fpkj.setFPQQLSH(obj.getInvoiceinfoid().toString());
				request_common_fpkj.setFPQQLSH(obj.getEinvoiceinfoid().toString());
				request_common_fpkj.setKPLX("1");
				request_common_fpkj.setYFP_DM(obj.getFpdm());
				request_common_fpkj.setYFP_HM(obj.getFphm());
				request_common_fpkj.setXSF_NSRSBH(configInfo.getXsf_nsrsbh());
				request_common_fpkj.setXSF_MC(configInfo.getXsf_mc());
				request_common_fpkj.setXSF_DZDH(configInfo.getXsf_dzdh());
				request_common_fpkj.setKPR(configInfo.getInvoice_kpr());
				request_common_fpkj.setSKR(configInfo.getInvoice_skr());
				request_common_fpkj.setXSF_YHZH(configInfo.getXsf_yhzh());// xsf_yhzh
				//request_common_fpkj.setXSF_YHZH(request_common_fpkj.getXSF_YHZH());
				request_common_fpkj.setGMF_MC(obj.getInvoicetitle()+"("+obj.getCustomerid()+")");
				request_common_fpkj.setSKR(configInfo.getInvoice_skr());
				request_common_fpkj.setFHR(configInfo.getInvoice_fhr());
				request_common_fpkj.setJSHJ(obj.getAmount().toString());
				// request_common_fpkj.setGMF_DZYX("huwenhua@best1.com");
				request_common_fpkj.setGMF_DZDH(obj.getAddress() + " "
						+ obj.getMobilenumber());
				request_common_fpkj.setGMF_SJH(obj.getMobilenumber());
				//request_common_fpkj.setGMF_SJH("18626882159");
				// invoice_kpr
				  if(obj.getTaxrate()!=null&&obj.getTaxrate()>0){
		            	taxrated=obj.getTaxrate();	
		            	
		            }
		            double taxtateDouble=(double)taxrated/100;
		            
				//Double hjje = obj.getAmount() / 1.17;// 不含税价
				Double hjje = obj.getAmount() / (taxtateDouble+1);// 不含税价
				//Double se = hjje * 0.17;// 税额
				Double se = hjje * taxtateDouble;// 税额
				DecimalFormat df = new DecimalFormat("######0.00");
				
			
				request_common_fpkj.setHJJE(df.format(0-hjje));

				request_common_fpkj.setHJSE(df.format(0-se));
				Double jshj=0-obj.getAmount();
				request_common_fpkj.setJSHJ(jshj.toString());
				if (obj.getItemid() > 9) {
					request_common_fpkj.setBZ(obj.getOrderid() + ""
							+ obj.getItemid());// 订单号
				} else {
					request_common_fpkj.setBZ(obj.getOrderid() + "0"
							+ obj.getItemid());// 订单号
				}

				request_common_fpkj.setHYLX("0");
				request_common_fpkj.setBY1("11");
			

				List<COMMON_FPKJ_XMXX> common_fpkj_xmxxlist = new ArrayList<COMMON_FPKJ_XMXX>();
				COMMON_FPKJ_XMXX common_fpkj_xmxx = new COMMON_FPKJ_XMXX();
				
				common_fpkj_xmxx.setFPHXZ("0");
				common_fpkj_xmxx.setXMMC(obj.getProductid() + "_"
						+ obj.getProductname());
				//common_fpkj_xmxx.setGGXH("500克");
				common_fpkj_xmxx.setGGXH(obj.getClr()+"_"+obj.getSty());
				common_fpkj_xmxx.setDW(configInfo.getInvoice_dw());
				common_fpkj_xmxx.setXMSL((0-obj.getQuantity())+"");
				common_fpkj_xmxx.setXMDJ(df.format(hjje));
				common_fpkj_xmxx.setXMJE(df.format(0-hjje));
				//common_fpkj_xmxx.setSL("0.17");
				common_fpkj_xmxx.setSL(taxtateDouble+"");
				common_fpkj_xmxx.setSE(df.format(0-se));
				common_fpkj_xmxxlist.add(common_fpkj_xmxx);
				
				
				COMMON_FPKJ_XMXXS common_fpkj_xmxxs = new COMMON_FPKJ_XMXXS();
				common_fpkj_xmxxs.setCommon_fpkj_xmxx(common_fpkj_xmxxlist);
				request_common_fpkj.setCommon_fpkj_xmxxs(common_fpkj_xmxxs);
				Content content = new Content();
				content.setRequest_common_fpkj(request_common_fpkj);

				String contentstr = this.JsonInvoice(content);

				DataDescription dataDescription = new DataDescription();
				dataDescription.setZipCode("0");
				Data data = new Data();
				data.setDataDescription(dataDescription);
				data.setContent(contentstr);
				GlobalInfo globalInfo = this.jsonGlobalInfo();
				ReturnStateInfo returnstateinfo = this.jsonReturnStateInfo();
				InvoiceMessage invoiceMessage = new InvoiceMessage();
				invoiceMessage.setData(data);
				invoiceMessage.setGlobalInfo(globalInfo);
				invoiceMessage.setReturnstateinfo(returnstateinfo);
				String invoicestr = jsonCommon(invoiceMessage);
				logger.info(invoicestr);
				Response response = this.SendInvoice(invoicestr);
				if (response != null) {
					CustomerOrderinvoiceinfo eorderinvoice = new CustomerOrderinvoiceinfo();
					eorderinvoice.setEinvoiceinfoid(Long.parseLong(response.getFpqqlsh()));
					eorderinvoice.setLastmodifiedby(1L);

					invoiceManageSerevice.eorderinvoiceReturn(eorderinvoice);
				}

			
			


		}

	}
	
	public static void  downLoadFromUrl(String urlStr,String fileName,String savePath) throws IOException{  
        URL url = new URL(urlStr);    
        HttpURLConnection conn = (HttpURLConnection)url.openConnection();    
                //设置超时间为3秒  
        conn.setConnectTimeout(3*1000);  
        //防止屏蔽程序抓取而返回403错误  
        conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");  
  
        //得到输入流  
        InputStream inputStream = conn.getInputStream();    
        //获取自己数组  
        byte[] getData = readInputStream(inputStream);      
  
        //文件保存位置  
        File saveDir = new File(savePath);  
        if(!saveDir.exists()){  
            saveDir.mkdir();  
        }  
        File file = new File(saveDir+File.separator+fileName);      
        FileOutputStream fos = new FileOutputStream(file);       
        fos.write(getData);   
        if(fos!=null){  
            fos.close();    
        }  
        if(inputStream!=null){  
            inputStream.close();  
        }  
  
  
        logger.info("info:"+url+" download success");   
  
    }  
  
	
	/** 
     * 从输入流中获取字节数组 
     * @param inputStream 
     * @return 
     * @throws IOException 
     */  
    public static  byte[] readInputStream(InputStream inputStream) throws IOException {    
        byte[] buffer = new byte[1024];    
        int len = 0;    
        ByteArrayOutputStream bos = new ByteArrayOutputStream();    
        while((len = inputStream.read(buffer)) != -1) {    
            bos.write(buffer, 0, len);    
        }    
        bos.close();    
        return bos.toByteArray();    
    }    
  
	public String jsonCommon(InvoiceMessage invoiceMessage) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		return mapper.writeValueAsString(invoiceMessage);
	}

	public ReturnStateInfo jsonReturnStateInfo() throws Exception {

		ReturnStateInfo returnStateInfo = new ReturnStateInfo();
		returnStateInfo.setReturnCode("0000");
		returnStateInfo.setReturnMessage("好易购");

		return returnStateInfo;
	}

	public GlobalInfo jsonGlobalInfo() throws Exception {

		GlobalInfo globalinfo = new GlobalInfo();

		globalinfo.setAppId(configInfo.getAppId());
		String interfaceId = "best1";
		globalinfo.setInterfaceId(interfaceId);
		String interfaceCode = "DFXJ1001";
		globalinfo.setInterfaceCode(interfaceCode);
		globalinfo.setRequestCode(configInfo.getRequestCode());
		globalinfo.setRequestTime(DateUtil.formatToTime());
		globalinfo.setResponseCode(DateUtil.getTodayYear());
		globalinfo.setDataExchangeId(globalinfo.getRequestCode()
				+ globalinfo.getInterfaceCode() + DateUtil.getTodayYyyyMmDd()
				+ DESUtil.randNineData());
		ReturnStateInfo returnStateInfo = new ReturnStateInfo();
		returnStateInfo.setReturnCode("0000");
		returnStateInfo.setReturnMessage("好易购");
		DataDescription dataDescription = new DataDescription();
		dataDescription.setZipCode("0");
		return globalinfo;
	}

	private String JsonInvoice(Content content) throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String str = mapper.writeValueAsString(content);
		str = str.toUpperCase();
		
		String baseContent = DESUtil.getAesmBASE64(str);
		baseContent = baseContent.trim().replaceAll("\r\n", "");
		return baseContent;

	}

	private Response SendInvoice(String message) throws Exception {
		Call call;
		String val = "";
		Response response = null;
		try {
			// String ssl_store = "C:/cer/fapiao.truststore";
			String ssl_store = configInfo.getSsl_store();
			// String ssl_pwd = "123456";
			String ssl_pwd = configInfo.getSsl_pwd();
			System.setProperty("javax.net.ssl.trustStore", ssl_store);
			System.setProperty("javax.net.ssl.keyStorePassword", ssl_pwd);
			HostnameVerifier hv = new HostnameVerifier() {
				public boolean verify(String urlHostName, SSLSession session) {
					logger.error("Warning: URL Host: " + urlHostName
							+ " vs. " + session.getPeerHost());
					return true;
				}
			};
			HttpsURLConnection.setDefaultHostnameVerifier(hv);
			Service s = new Service();
			call = (Call) s.createCall();
			// https://218.17.158.39:8999/fpt_dsqz/services/DZFPJsonService?wsdl
			call.setTargetEndpointAddress(new java.net.URL(configInfo
					.getInvoice_serverurl()));
			call.setOperation(configInfo.getInvoice_operation());
			Object[] fn01 = { message };
			val = (String) call.invoke(fn01);
			logger.info("返回数据:" + val);

			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
					false);
			JsonNode node = mapper.readTree(val);
			GlobalInfo globalInfo = mapper.readValue(node.get("globalInfo")
					.toString(), GlobalInfo.class);
			ReturnStateInfo re = mapper.readValue(node.get("returnStateInfo")
					.toString(), ReturnStateInfo.class);

			Data data = mapper.readValue(node.get("Data").toString(),
					Data.class);
			logger.info("返回数据:" + re.getReturnCode()+" "+re.getReturnMessage());
			if (re != null && re.getReturnCode().endsWith("0000")) {

				String contentstr = DESUtil.getFromBASE64(data.getContent());

			//	contentstr = contentstr.toLowerCase();

				response = mapper.readValue(contentstr, Response.class);

			}
		} catch (Exception e) {
			val = e.getMessage();// 返回错误信息
			logger.error(val);
		}
		return response;

	}
}
