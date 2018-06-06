package com.best1.api.webapp.mvc.sms;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.MessageFormat;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.best1.api.service.crm.CustomerManageService;
import com.best1.api.utils.MediaTypes;
import com.best1.api.webservice.soap.response.dto.crm.CustomermessageDTO;
import com.best1.api.webservice.soap.response.result.crm.CustomermessageResult;
import com.best1.api.webservice.utils.ApiHandleError;


@Controller
public class SmSController {

	private static Logger logger = LoggerFactory.getLogger(SmSController.class);

	@Autowired
	private CustomerManageService customerManageService;

	
	@Value("${sms.url}")
	private String url;

	@Value("${sms.sname}")
	private String sname;

	@Value("${sms.spwd}")
	private String spwd;
	@Value("${sms.scorpid}")
	private String scorpid;
	@Value("${sms.sprdid}")
	private String sprdid;

	@Value("${sms.templet}")
	private String templet;
	
	/**
	@Value("${smst.url}")
	private String urlt;

	@Value("${smst.sname}")
	private String snamet;

	@Value("${smst.spwd}")
	private String spwdt;


	@Value("${smst.templet}")
	private String templett;
	
	
	
{
"customerid":20011,
"messagetype":2000,
"targetobj":18626882159,
"priority":0,
"message":"001好易购，好生活",
"createdby":30384
}

**/
	
	

	@RequestMapping(value = "/crm/message/send", method = {
			RequestMethod.POST }, produces = MediaTypes.JSON_UTF_8)
	@ResponseBody
	public CustomermessageResult sendMessage(
			@RequestBody CustomermessageDTO dto) {
		logger.info("客户信息发送");
		CustomermessageResult result = new CustomermessageResult();

		try {
			customerManageService.sendCustomerMessage(dto);
			result.setCustomermessage(dto);
			return result;
		} catch (IllegalArgumentException e) {
			return ApiHandleError.handleParameterError(result, e);
		} catch (RuntimeException e) {
			return ApiHandleError.handleGeneralError(result, e);
		} catch (Exception e) {
			return ApiHandleError.handleGeneralError(result, e);
		}
		
	}
	
	
	
	@RequestMapping("/smschannel")
	public void SmsChannel(@RequestParam("Mobile") String Mobile,
			@RequestParam("Message") String Message,
			HttpServletResponse response) throws UnsupportedEncodingException {
         //尊敬的用户：您本次操作的短信验证码为：{0}，5分钟内有效。【好易购】
		String codeMessage = MessageFormat.format(templet,new String[] { Message });
		 logger.info(Message);
		 logger.info(codeMessage);
	     String PostData = "sname=" + sname + "&spwd=" + spwd + "&scorpid="
				+ scorpid + "&sprdid=" + sprdid + "&sdst=" + Mobile + "&smsg="
				+ java.net.URLEncoder.encode(codeMessage, "utf-8");

		try {
			response.getWriter().write(smsServer(PostData, url + "/g_Submit"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	 	private String smsServer(String postData, String postUrl) {

		try {
			logger.info(postData);
			logger.info(postUrl);
			// 发送POST请求
			URL url = new URL(postUrl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type",
					"application/x-www-form-urlencoded");
			conn.setRequestProperty("Connection", "Keep-Alive");
			conn.setUseCaches(false);
			conn.setDoOutput(true);

			conn.setRequestProperty("Content-Length", "" + postData.length());
			OutputStreamWriter out = new OutputStreamWriter(
					conn.getOutputStream(), "UTF-8");
			out.write(postData);
			out.flush();
			out.close();

			// 获取响应状态
			if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
				// //System.out.println(conn.getResponseCode()+"connect failed!");
				return "";
			}
			// 获取响应内容体
			String line, result = "";
			BufferedReader in = new BufferedReader(new InputStreamReader(
					conn.getInputStream(), "utf-8"));
			while ((line = in.readLine()) != null) {
				result += line + "\n";
			}
			in.close();
			logger.info(result);
			return result;
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
		return "";
	}

}
