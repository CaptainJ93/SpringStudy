package com.best1.util;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * <p>Title: 字符串工具类</p>
 * <p>Description: 统一存放字符串公用的扩展方法</p> 
 * @author 林浩生
 * @version 1.0
 * 2010-8-2
 */
public class StringUtil {

	private static Log log = LogFactory.getLog(StringUtil.class);
	
	/**
	 * 判断字符串是否是数字串（不包括小数）
	 * 
	 * @param str String
	 * @return boolean
	 */
	public static boolean isNumeric(String str){ 
		if(log.isDebugEnabled()) {	
			log.debug("str: " + str);
		}
		if(str == null || str.trim().length() == 0) 
			return false;
		
		if(str.matches("-?\\d*")) {
			return true; 
		} 
		else {
			return false;
		}
	}

	/**
	 * 判断字符串是否是null或者空字符串""
	 * 
	 * @param 
	 * @return boolean
	 */
    public static boolean isNull(String s)
    {
        return s == null || s.trim().length() < 1;
    }
    /**
     * 判断一个字符是Ascill字符还是其它字符（如汉，日，韩文字符）
     * 
     * @param char c, 需要判断的字符
     * @return boolean, Ascill字符返回true
    */
   public static boolean isLetter(char c) {
       int k = 0x80;
       return c / k == 0 ? true : false;
    }

   /**
     * 得到一个字符串的长度,显示的长度,一个汉字或日韩文长度为2,英文字符长度为1
     * 
     * @param String s ,需要得到长度的字符串
     * @return int, 得到的字符串长度
    */
   public static int lengths(String s) {
       if (s == null)
           return 0;
       char[] c = s.toCharArray();
       int len = 0;
       for (int i = 0; i < c.length; i++) {
            len++;
           if (!isLetter(c[i])) {
                len++;
           }
       }
       return len;
    }

   /**
     * 截取一段字符的长度,不区分中英文,如果数字不正好，则少取一个字符位
     * 
     * @author patriotlml
     * @param String  origin, 原始字符串
     * @param int len, 截取长度(一个汉字长度按2算的)
     * @return String, 返回的字符串
    */
   public static String substr(String origin, int len) {
       if (origin == null || origin.equals("") || len < 1 )
           return "";
       
       byte[] strByte = new byte[len];
       if (len > lengths(origin)) {
           return origin;
       }
       
       System.arraycopy(origin.getBytes(), 0, strByte, 0, len);
       int count = 0;
       for (int i = 0; i < len; i++) {
           int value = (int) strByte[i];
           if (value < 0) {
                count++;
            }
       }
       
       if (count % 2 != 0) {
            //len = (len == 1) ? ++len : --len;
            --len;
       }
       
       return new String(strByte, 0, len);
    }
	
	public static void main(String args[]) {
		log.debug(String.valueOf(isNumeric(null)));
		log.debug(String.valueOf(isNumeric("")));
		log.debug(String.valueOf(isNumeric("0")));
		log.debug(String.valueOf(isNumeric("0.1")));
		log.debug(String.valueOf(isNumeric("-1")));
		log.debug(String.valueOf(isNumeric("01")));
		log.debug(String.valueOf(isNumeric("2374832")));
		log.debug(String.valueOf(isNull(" ")));
		log.debug(String.valueOf(isNull((String)null)));
		log.debug(substr("Caused by: com.nls.pub.ExceptionSys: 系统无法取得序列号(SEQ_ACCT_HIS)",50));
	}
}
