package com.best1.api.utils;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;  






import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;  
import org.apache.http.client.HttpClient;  
import org.apache.http.client.entity.UrlEncodedFormEntity;  
import org.apache.http.client.methods.HttpPost;  
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair; 


import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;


public class UsertAgentUtil {
	public static void main(String[] args) throws Exception {
		System.out.println(methodPost());
		
	}
	
	
	public static String methodPost() throws Exception {  
		        DefaultHttpClient httpclient = new DefaultHttpClient();  
		       // // 代理的设置  
		      // HttpHost proxy = new HttpHost("10.60.8.20", 8080);  
		      // httpclient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY,  
      // proxy);  
		
		        // 目标地址  
		       HttpPost httppost = new HttpPost(  
		              "http://www.fynas.com/ua/analyze");  
	        System.out.println("请求: " + httppost.getRequestLine());  
		   
	        // post 参数 传递  
		      List<BasicNameValuePair> nvps = new ArrayList<BasicNameValuePair>();  
		      nvps.add(new BasicNameValuePair("ua", "Mozilla/5.0 (Linux; U; Android 6.0.1; zh-cn; OPPO R9s Build/MMB29M) AppleWebKit/537.36 (KHTML, like Gecko)Version/4.0 Chrome/37.0.0.0 MQQBrowser/7.2 Mobile Safari/537.36"));  
				 
		      httppost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8)); // 设置参数给Post  
		 
		      // 执行  
		    HttpResponse response = httpclient.execute(httppost);  
		     HttpEntity entity = response.getEntity();  
		        System.out.println(response.getStatusLine());  
		        if (entity != null) {  
		           System.out.println("Response content length: "  
		                  + entity.getContentLength());  
		      }  
		      // 显示结果  
		      BufferedReader reader = new BufferedReader(new InputStreamReader(  
		             entity.getContent(), "UTF-8"));  
		 
		       String line = null;  
		       while ((line = reader.readLine()) != null) {  
		         System.out.println(line);  
		      }  
		     if (entity != null) {  
		          entity.consumeContent();  
		      }  
		       return null;  
		 
		   }  
		    



	
	public static String doPoststr()
	{ String respContent=null;
		HttpClient httpclient = new DefaultHttpClient();  
		      HttpPost httpPost = new HttpPost("http://www.fynas.com/ua/analyze");  
		       List<NameValuePair> nvps = new ArrayList<NameValuePair>();  
		        nvps.add(new BasicNameValuePair("ua", "Mozilla/5.0 (Linux; U; Android 6.0.1; zh-cn; OPPO R9s Build/MMB29M) AppleWebKit/537.36 (KHTML, like Gecko)Version/4.0 Chrome/37.0.0.0 MQQBrowser/7.2 Mobile Safari/537.36"));  
		 
		       try {
				httpPost.setEntity(new UrlEncodedFormEntity(nvps));
		
				HttpResponse resp = httpclient.execute(httpPost);  
		        
		         if(resp.getStatusLine().getStatusCode() == 200) {
		             HttpEntity he = resp.getEntity();
		             respContent = EntityUtils.toString(he,"UTF-8");
		         }
		         
		         httpclient.getConnectionManager().shutdown();
		        return respContent;
		     
		      
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;  

	   } 


}
