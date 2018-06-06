package com.best1.api.utils;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MobileUtil {

	@Autowired
	private ConfigInfo configInfo;
	
/**
 * 134 135 136 137 138 139 147 150 151 152 157 158 159 172 178 182 183 184 187 188

联通号段：

130 131 132 145 155 156  171 175 176 185 186

电信号段：

133 153 173 177 180 181 189

虚拟运营商:

170 

 * 
 * */
	
	public  int validateMobile(String mobile) {
		if (mobile.startsWith("0") || mobile.startsWith("+860")) {
			mobile = mobile.substring(mobile.indexOf("0") + 1, mobile.length());
		}
		
		if(mobile.length()!=11){

			return 1010;
		}
	
		List<String> chinaUnicom = Arrays.asList(new String[] { configInfo.getChinaunicom() });
		List<String> chinaMobile = Arrays.asList(new String[] {configInfo.getChinamobile()});
		List<String> chinaTelecom = Arrays.asList(new String[] {configInfo.getChinatelecom()});
		
		boolean bolChinaUnicom = (chinaUnicom.contains(mobile.substring(0, 3)));
		boolean bolchinaMobile = (chinaMobile.contains(mobile.substring(0, 3)));
		boolean bolchinaTelecom = (chinaTelecom
				.contains(mobile.substring(0, 3)));
		if (bolChinaUnicom)
			return 1000;// 联通
		if (bolchinaMobile)
			return 1001; // 移动
		if (bolchinaTelecom)
			return 1002;//电信
		
		return 1010;
	}
	
	
	public static String mobilevalidate(String phoneNum){
		
		Pattern p2 = Pattern.compile("^((\\+{0,1}0{0,2}86){0,1})");  
		Matcher m2 = p2.matcher(phoneNum);  
		StringBuffer sb = new StringBuffer();  
		while (m2.find())  
		{  
		    m2.appendReplacement(sb, "");  
		}  
		m2.appendTail(sb);  
		return sb.toString();  	
		
	}
	
	
}
