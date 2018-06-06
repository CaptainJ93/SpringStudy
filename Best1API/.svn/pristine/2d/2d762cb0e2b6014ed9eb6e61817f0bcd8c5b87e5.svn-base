package com.best1.api.webapp.mvc.delivery;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.MessageFormat;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeliveryController {
	private static Logger logger = LoggerFactory.getLogger(DeliveryController.class);
	@Value("${scm.url}")
	private String url;
	
	@RequestMapping("/deliverypath")
	public void SmsChannel(
			@RequestParam("DeliveryCode") String DeliveryCode,
			HttpServletResponse response) throws UnsupportedEncodingException {
       String  deliveryurl=url+DeliveryCode;
		try {
			logger.info(deliveryurl);
			logger.info(DeliveryCode);
			String json=loadJson( deliveryurl);
			logger.info(json);
			response.getWriter().write(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public static String loadJson (String url) {  
        StringBuilder json = new StringBuilder();  
        try {  
            URL urlObject = new URL(url); 
            URLConnection uc = urlObject.openConnection(); 
            uc.setRequestProperty("Connection", "Keep-Alive");
            uc.setRequestProperty("Content-Type", "text/plain;charset=UTF-8");
			uc.setUseCaches(false);
			uc.setDoOutput(true);
            BufferedReader in = new BufferedReader(new InputStreamReader(
					uc.getInputStream(), "utf-8"));
            String inputLine = null;  
            while ( (inputLine = in.readLine()) != null) {
                json.append(inputLine);  
            }  
            in.close();  
        } catch (MalformedURLException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        return json.toString();  
    }  

}
