package com.best1.api.utils;

/**
 * 生成手机验证的随机码
 * 
 */
public class RandomStringUtil {

	public static String randomString(int len) {
		String asctbl1 = "abcdefhjkmnpqrstuvwxyz";
		String asctbl2 = "2345678";
		int len1 = 3;
		int len2 = len - len1;
		String tmpstr = "";
		String str = "";

		for (int i = 0; i < len1; i++) {
			int offset = (int) Math.round(Math.random() * (asctbl1.length() - 1));

			tmpstr += asctbl1.substring(offset, offset + 1);
		}

		for (int i = 0; i < len2; i++) {
			int offset = (int) Math.round(Math.random() * (asctbl2.length() - 1));

			tmpstr += asctbl2.substring(offset, offset + 1);
		}

		while (tmpstr.length() > 0) {
			int offset = (int) Math.round(Math.random() * (tmpstr.length() - 1));

			str += tmpstr.substring(offset, offset + 1);
			tmpstr = tmpstr.substring(0, offset) + tmpstr.substring(offset + 1, tmpstr.length());
		}

		return str;
	}
}
