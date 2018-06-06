package com.best1.api.utils;

import java.util.List;  
import java.util.Map;  
import java.util.Random;
  
public class StrUtils {  
	private static String EMPTY = "";
  
    /** 
     * 定义分割常量 （#在集合中的含义是每个元素的分割，|主要用于map类型的集合用于key与value中的分割） 
     */  
    private static final String SEP1 = "\n";  
    private static final String SEP2 = "|";  
  
    /** 
     * List转换String 
     *  
     * @param list 
     *            :需要转换的List 
     * @return String转换后的字符串 
     */  
    public static String ListToString(List<?> list) {  
        StringBuffer sb = new StringBuffer();  
        if (list != null && list.size() > 0) {  
            for (int i = 0; i < list.size(); i++) {  
                if (list.get(i) == null || list.get(i) == "") {  
                    continue;  
                }  
                // 如果值是list类型则调用自己  
                if (list.get(i) instanceof List) {  
                    sb.append(ListToString((List<?>) list.get(i)));  
                    sb.append(SEP1);  
                } else if (list.get(i) instanceof Map) {  
                    sb.append(MapToString((Map<?, ?>) list.get(i)));  
                    sb.append(SEP1);  
                } else {  
                    sb.append(list.get(i));  
                    sb.append(SEP1);  
                }  
            }  
        }  
        return sb.toString();  
    }  
  
    /** 
     * Map转换String 
     *  
     * @param map 
     *            :需要转换的Map 
     * @return String转换后的字符串 
     */  
    public static String MapToString(Map<?, ?> map) {  
        StringBuffer sb = new StringBuffer();  
        // 遍历map  
        for (Object obj : map.keySet()) {  
            if (obj == null) {  
                continue;  
            }  
            Object key = obj;  
            Object value = map.get(key);  
            if (value instanceof List<?>) {  
                sb.append(key.toString() + SEP1 + ListToString((List<?>) value));  
                sb.append(SEP2);  
            } else if (value instanceof Map<?, ?>) {  
                sb.append(key.toString() + SEP1  
                        + MapToString((Map<?, ?>) value));  
                sb.append(SEP2);  
            } else {  
                sb.append(key.toString() + SEP1 + value.toString());  
                sb.append(SEP2);  
            }  
        }  
        return sb.toString();  
    }  
  
    
    /**
	 * 获取定长位数随机字符
	 * @param length 位数
	 * @return 定长位数随机字符
	 */
	public static String getRandomString(int length) { 
	    String base = "abcdefghijklmnopqrstuvwxyz0123456789";
	    Random random = new Random();
	    StringBuffer sb = new StringBuffer();
	    for (int i = 0; i < length; i++) {
	        int number = random.nextInt(base.length());
	        sb.append(base.charAt(number));
	    }
	    return sb.toString();
	}
	
	
	/**
	 * <p>
	 * Splits the provided text into an array, separator specified. This is an
	 * alternative to using StringTokenizer.
	 * </p>
	 *
	 * <p>
	 * The separator is not included in the returned String array. Adjacent
	 * separators are treated as one separator. For more control over the split
	 * use the StrTokenizer class.
	 * </p>
	 *
	 * <p>
	 * A <code>null</code> input String returns <code>null</code>.
	 * </p>
	 *
	 * <pre>
	 * StrUtils.split(null, *)         = null
	 * StrUtils.split("", *)           = []
	 * StrUtils.split("ABCDE", 1)      = ["A", "B", "C", "D", "E"]
	 * StrUtils.split("ABCDE", 2)      = ["AB", "CD", "E"]
	 * StrUtils.split("ABCDE", 3)      = ["ABC", "DE"]
	 * StrUtils.split("ABCDE", 4)      = ["ABCD", "E"]
	 * StrUtils.split("ABCDE", 5)      = ["ABCDE"]
	 * StrUtils.split("ABCDE", 6)      = ["ABCDE"]
	 * </pre>
	 * 
	 * @param str
	 *            the String to parse, may be null
	 * @param average
	 *            the number is used to split the string for the length of the
	 *            array
	 * @return an array of parsed Strings, <code>null</code> if null String
	 *         input
	 */
	public static String[] split(String str, int average) {
		if (str == null) {
			return null;
		}
		int strLength = str.length();
		if (strLength == 0) {
			return new String[] { EMPTY };
		}
		if (strLength < average) {
			return new String[] { str };
		}
		int count = strLength / average;
		if (strLength % average != 0) {
			count++;
		}
		String[] strs = new String[count];
		for (int i = 0; i < strs.length; i++) {
			try {
				strs[i] = str.substring(i * average, (i + 1) * average);
			} catch (IndexOutOfBoundsException e) {
				strs[i] = str.substring(i * average);
			}
		}
		return strs;
	}
	
	
}