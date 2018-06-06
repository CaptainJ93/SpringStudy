package com.best1.util;   
  
import java.text.DateFormat;   
import java.text.SimpleDateFormat;   
import java.util.Date;   
import java.util.Map;   
  
import ognl.DefaultTypeConverter;   
  
public class DateConverter extends DefaultTypeConverter { 
	//支持转换的日期格式
    private static final DateFormat[] ACCEPT_DATE_FORMATS = {   
    	new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"),  
        new SimpleDateFormat("yyyy-MM-dd"),   
        new SimpleDateFormat("yyyy/MM/dd") };   
    
    private static final String OUTPUT_DATE_FORMAT = "yyyy-MM-dd";         
 
	public Object convertValue(Map context, Object value, Class toType) {  
		if(value == null) return null;
		Object result = null; 
		
        if (toType == Date.class) {  //浏览器向服务器提交时，进行String to Date的转换    
        	result = doConvertToDate(value);
        }    
        else if (toType == String.class) { //服务器向浏览器输出时，进行Date to String的类型转换    
        	result = doConvertToString(value);   
        }    
           
        return result;    
    }   
	private Date doConvertToDate(Object value) {
		Date result = null;    
        String dateString = null;    
        if (value instanceof String) {
        	dateString = (String)value;
        	for (DateFormat format : ACCEPT_DATE_FORMATS) {    
                try {    
                	result = format.parse(dateString);//遍历日期支持格式，进行转换    
                } catch(Exception e) {    
                    continue;    
                }    
            }  
        } 
        else if (value instanceof Object[]) {
        	Object[] array = (Object[]) value;
        	if ((array != null) && (array.length > 0)) {
        		value = array[0];
        		result = doConvertToDate(value);
        	}
        }
        else if (Date.class.isAssignableFrom(value.getClass())) {
        	result = (Date) value;
        }
          
        return result;
	}
	private String doConvertToString(Object value) { 
		String result = "";
		if(value instanceof Date) {
			result = new SimpleDateFormat(OUTPUT_DATE_FORMAT).format(value);//输出的格式是yyyy-MM-dd
		}
		return result;
	}
}  
