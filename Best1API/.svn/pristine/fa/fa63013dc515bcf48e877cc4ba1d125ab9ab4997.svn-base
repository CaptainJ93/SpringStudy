package com.best1.api.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.IOUtils;

/**
 * 关键字过滤
 * 
 * @author luo
 * 
 */
@SuppressWarnings("unchecked")
public class FilterKeyUtil {
	/**
	 * 过滤关键字所在文件路径
	 */
	private final static String FILTE_KEY_FILE_PATH = "/filterKey.dat";

	private static List FILTERS_LIST = null;

	/**
	 * 过滤字
	 * 
	 * @param p_oldStr
	 *            原内容
	 * @return 正确内容
	 * @author luo
	 */
	public static String filterContent(String p_oldStr) {
		if (FILTERS_LIST == null) {
			FILTERS_LIST = new ArrayList();
			synchronized (FILTERS_LIST) {
				InputStream input = null;
				try {
					input = FilterKeyUtil.class
							.getResourceAsStream(FilterKeyUtil.FILTE_KEY_FILE_PATH);
					FILTERS_LIST = IOUtils.readLines(input,"utf8");
				} catch (IOException e) {
					e.printStackTrace();
					FILTERS_LIST = new ArrayList(0);
				} finally {
					IOUtils.closeQuietly(input);
				}
			}
		}
		for (Iterator iter = FILTERS_LIST.iterator(); iter.hasNext();) {
			String l_key = iter.next().toString();
			int l_pos = p_oldStr.indexOf(l_key);
			if (l_pos != -1) {
				p_oldStr = p_oldStr.replaceAll(l_key, "***");
			}
		}
		return p_oldStr;
	}

	/**
	 * @author luo
	 */
	public static void main(String[] args) {
		System.out.println(filterContent("ssssss李洪志ssss"));
//		try {
//			String m = new String("ssssss李洪志ssss");
//			System.out.println(m);
//			char[] c = m.toCharArray();
//			for (int i = 0; i < c.length; i++)
//				System.out.println(Integer.toHexString((int) c[i]));
//		} catch (Exception e) {
//			System.out.println(e.toString());
//
//		}      
	}
}
