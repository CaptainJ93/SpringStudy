package com.best1.api.utils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilterHtml {
	
	/**
	 * @param args
	 * @author luo
	 * @since 2008-4-12 下午02:15:00
	 */
	public static void main(String[] args) {
//		String one = "http://www.citycube.com/bbs/showBlockThreadAnswerList.htm?threadMain.id=756&amp;page=10000";
		String one = "<MeTa /><sCript>ddd</SCRIPT><sCript src=\"sdsadasd\" /><a hRef=\"http://www.citycube.com/bbs/showBlockThreadAnswerList.htm?threadMain.id=756&amp;page=10000\" Class=\"fdf\">bbBBbbbbbb</A> <img  title=强 alt=强 width=10 heigth=10 src=\"http://static.citycube.com/images/emotion/12.gif\">.... <img  title=强 alt=强 src=\"http://static.citycube.com/images/emotion/12.gif\"><Form id=\"addMainThreadForm\" name=\"addMainThreadForm\" onsubmit=\"return true;\" action=\"/bbs/addBlockThread.htm;jsessionid=40F9DB458F148DC7307033B8AA4D22E0\" method=\"post\"><div class=\"formContainer\"><h2>论坛发帖</h2><ul><li><label for=\"threadMain.title\" class=\"t\" style=\"\">标题:</label><p class=\"c\"><input type=\"text\" name=\"threadMain.title\" maxlength=\"50\" value=\"\" id=\"threadMain.title\" class=\"text\"/></p></li><li><label for=\"threadMainContent.content\" class=\"t\" style=\"\">内容:</label><p class=\"c\"><textarea name=\"threadMainContent.content\" cols=\"75\" rows=\"10\" id=\"threadMainContent.content\"></textarea></p></li><li><label for=\"threadMain.tag\" class=\"t\" style=\"\">标签:</label><p class=\"c\"><input type=\"text\" name=\"threadMain.tag\" maxlength=\"100\" value=\"\" id=\"threadMain.tag\" class=\"text\"/><br>多个请用空格分开</p></li><li class=\"operation\"><input type=\"hidden\" name=\"threadMain.status\" value=\"1\"/><input type=\"hidden\" name=\"threadMain.bbsBlockId\" value=\"1\"/><input class=\"btn\" name=\"save\" value=\"发表\" type=\"submit\"></li></ul></div></form>";
		System.out.println(one);
		System.out.println(stripHtml(one,allowable_tags,allowable_attrs));
//		System.out.println(stripAttribute(stripHtml(one,allowable_tags,allowable_attrs)));
	}
	
	private final static String[] allowable_tags = {"a","img","br"};
	private final static String[] allowable_attrs = {"src","href","title","target","alt"};
	
	public static String filterHtml(String one){
		return stripHtml(one,allowable_tags,allowable_attrs);
	}

	public static String stripHtml(String str1, String[] allowable_tags,String[] allowable_attrs) {
		String regular = "";
		if(allowable_tags!=null&&allowable_tags.length>0){
			for(int i = 0;i<allowable_tags.length;i++){
				regular+="^"+allowable_tags[i];
			}
		}
		String str = "";
		str = str1;
		String regEx_script = "<[\\s]*?(?i)script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?(?i)script[\\s]*?>"; //定义script的正则表达式{或<script[^>]*?>[\\s\\S]*?<\\/script>  
	    String regEx_style = "<[\\s]*?(?i)style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?(?i)style[\\s]*?>"; //定义style的正则表达式{或<style[^>]*?>[\\s\\S]*?<\\/style>
	    String regEx_input = "<[\\s]*?(?i)input[^>]*?>"; //定义style的正则表达式{或<input[^>]*?>[\\s\\S]*?<\\/style>
		str = str.replaceAll(regEx_script, ""); 
		str = str.replaceAll(regEx_style, ""); 
		str = str.replaceAll(regEx_input, ""); 
		str = str.replaceAll("<(?i)meta[^>]+>", "");
//		str = str.replaceAll("<[\\s]*?[^\\/"+regular+"^>]+?[^>]*?>", ""); // 剔出了<html>的标签  前面
//		System.out.println(regular);
//		str = str.replaceAll("<[\\s]*?\\/[^\\/^br^>]+?[\\s]*?><[\\s]*?\\/[^\\/^img^>]+?[\\s]*?><[\\s]*?\\/[^\\/^a^>]+?[\\s]*?>", ""); // 剔出了<html>的标签 后面
//		str = str.replaceAll("<[\\s]*?\\/[^\\/^img^>]+?[\\s]*?>", ""); // 剔出了<html>的标签 后面
//		str = str.replaceAll("<[\\s]*?\\/[^\\/^a^>]+?[\\s]*?>", ""); // 剔出了<html>的标签 后面
		
		Pattern pattern = null;
		pattern = Pattern.compile("<[^>]+>",Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(str);
		Set<String> hs = new HashSet<String>();
		Set<String> toBlank = new HashSet<String>();
		Set<String> toFilterAttr = new HashSet<String>();
		
	    while (matcher.find()) {
			int start = matcher.start();
			int end = matcher.end();
			String match = str.substring(start, end);
			hs.add(match);
		}
	    Iterator<String> it=hs.iterator(); 
	    while(it.hasNext()){
	    	String a = it.next();
	    	boolean ch = false;
	    	for(int i=0;i<allowable_tags.length;i++){
	    		//正标签
	    		pattern = Pattern.compile("<[\\s]*?"+allowable_tags[i]+"[^>]*?>",Pattern.CASE_INSENSITIVE);
	    		matcher = pattern.matcher(a);
	    		if(matcher.find()){
	    			ch = true;
	    			break;
	    		}else{
	    			ch = false;
	    		}
	    		if(!ch){
		    		//反标签
		    		pattern = Pattern.compile("<[\\s]*?\\/[\\s]*?"+allowable_tags[i]+"[^>]*?>",Pattern.CASE_INSENSITIVE);
		    		matcher = pattern.matcher(a);
		    		if(matcher.find()){
		    			ch = true;
		    			break;
		    		}else{
		    			ch = false;
		    		}
	    		}
	    	}
	    	if(ch){
	    		toFilterAttr.add(a);
	    	}else{
	    		toBlank.add(a);
	    	}
	    }
	    
	    //把应该过滤的标签，替换成空
	    it=toBlank.iterator(); 
	    while(it.hasNext()){
	    	String one = it.next();
	    	if(one.equalsIgnoreCase("</li>")||one.equalsIgnoreCase("</p>")||one.equalsIgnoreCase("</ul>")||one.equalsIgnoreCase("</tr>")||one.equalsIgnoreCase("</table>")){
	    		str = str.replaceAll(one, "<br>");
	    	}else{
	    		str = str.replaceAll(one, "");
	    	}
		}
	    for(int i=0;i<allowable_attrs.length;i++){
	    	str=str.replaceAll("(?i)"+allowable_attrs[i]+"\\s*?=", allowable_attrs[i]+"_=");
	    }
	    //收集链接中的XX=YY
	    Set<String> aa = new HashSet<String>();
	    pattern = Pattern.compile("\\?[a-zA-Z.]+?\\s*?=");
	    matcher = pattern.matcher(str);
	    while (matcher.find()) {
			int start = matcher.start();
			int end = matcher.end();
			String match = str.substring(start, end);
			aa.add(match);
		}
	    pattern = Pattern.compile("&amp;[a-zA-Z.]+?\\s*?=");
	    matcher = pattern.matcher(str);
	    while (matcher.find()) {
	    	int start = matcher.start();
	    	int end = matcher.end();
	    	String match = str.substring(start, end);
	    	aa.add(match);
	    }
	    Iterator<String> iter = aa.iterator();
	    while(iter.hasNext()){
	    	String o = iter.next();
	    	o=o.replaceAll("\\?", "").replaceAll("&amp;", "").replaceAll("=", "");
	    	str=str.replaceAll("(?i)"+o+"\\s*?=", o+"+_@=");
	    }
	    
	    str=str.replaceAll("[a-zA-Z.]+?\\s*?=", "notAttr=");
	    for(int i=0;i<allowable_attrs.length;i++){
	    	str=str.replaceAll(allowable_attrs[i]+"_=",allowable_attrs[i]+"=");
	    }
	    //还原链接中的参数
	    Iterator<String> iter1 = aa.iterator();
	    while(iter1.hasNext()){
	    	String o = iter1.next();
	    	o=o.replaceAll("\\?", "").replaceAll("&amp;", "").replaceAll("=", "");
	    	str=str.replaceAll(o+"\\+_@=",o+"=");
	    }
	    str = str.replaceAll("(?i)javascript:", ""); // 剔出了javascript:事件 
	    
//	    //过滤非法属性开始
//	    it=toFilterAttr.iterator(); 
////	    pattern = Pattern.compile("\\s+?[a-z0-9_-]+?\\s*[=]{1}\\s*[\"|']??[^>]+?[\"|']??",Pattern.CASE_INSENSITIVE);
//	    pattern = Pattern.compile("\\s+?[a-z0-9_-]+?\\s*=\\s*\"??[^\"]+?\"??",Pattern.CASE_INSENSITIVE);
////	    pattern = Pattern.compile("([a-z]+)\\s*=\\s*\"??([^\"]+)\"??",Pattern.CASE_INSENSITIVE);
//	    Set<String> all = new HashSet<String>();
//	    Set<String> toRemoveAttr = new HashSet<String>();
//	    //收集全部属性
//	    while(it.hasNext()){
//			String b = it.next();
//			matcher = pattern.matcher(b);
//			while(matcher.find()){
//				int start = matcher.start();
//				int end = matcher.end();
//				String match = str.substring(start, end);
//				all.add(match);
//			}
//		}
//	    it = all.iterator();
//	    while(it.hasNext()){
//	    	String attr = it.next();
//	    	boolean ch = false;
//	    	for(int i=0;i<allowable_attrs.length;i++){
//	    		pattern = Pattern.compile("\\s+?"+allowable_attrs[i]+"\\s*[=]{1}\\s*[\"|']??[^>]+?[\"|']??",Pattern.CASE_INSENSITIVE);
//	    		matcher = pattern.matcher(attr);
//	    		if(matcher.find()){
//	    			ch = true;
//	    			break;
//	    		}else{
//	    			ch = false;
//	    		}
//	    	}
//	    	if(ch){
//	    		//正常属性什么也不做
//	    	}else{
//	    		//不允许属性收集
//	    		toRemoveAttr.add(attr);
//	    	}
//	    }
//	  //不允许属性设成空
//	    it = toRemoveAttr.iterator();
//	    String _t;
//	    while(it.hasNext()){
//	    	_t = it.next();
//    		str = str.replaceAll(_t, " ");
//	    }
		return str;
	}
	
	public static String stripAttribute(String str1){
		String str = "";
		str = str1.toLowerCase();
		str = str.replaceAll("\\s+[^a^s^t^\"^=^\\s]+\\s?=\\s?\"[^\"]+\"", " "); // ^src^width^height^target^href
																				// 属性
		str = str.replaceAll("\\s+style\\s?=\\s?\"[^\"]+\"", " ");
		str = str.replaceAll("\\s+align\\s?=\\s?\"[^\"]+\"", " ");
		str = str.replaceAll("\\s+class\\s?=\\s?\"[^\"]+\"", " ");
		str = str.replaceAll("\\s+type\\s?=\\s?\"[^\"]+\"", " ");
		str = str.replaceAll("javascript:[\\S]+\\s+", "\" "); // 剔出了javascript:事件  
		return str;
	}
}
