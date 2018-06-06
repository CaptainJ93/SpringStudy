package com.best1.api.utils;


import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import org.apache.commons.lang.StringUtils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * DES加密算法工具类
 * 
 * 
 */
public class DESUtil {
	public static byte[] DESKEY = "kg3(83jg2j&0f4d^Dgf-_k9gdhfk^&h~:{FOFK95kD(rjfdfTE62(gLFg9&EH|49"
			.getBytes();

	public static String doEncrypt(String plainText) throws Exception {
		SecureRandom sr = new SecureRandom();
		DESKeySpec dks = new DESKeySpec(DESKEY);
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
		SecretKey key = keyFactory.generateSecret(dks);
		Cipher cipher = Cipher.getInstance("DES");
		cipher.init(Cipher.ENCRYPT_MODE, key, sr);
		return toHexString(cipher.doFinal(plainText.getBytes()));
	}

	public static String doDecrypt(String encryptText) throws Exception {
		SecureRandom sr = new SecureRandom();
		DESKeySpec dks = new DESKeySpec(DESKEY);
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
		SecretKey key = keyFactory.generateSecret(dks);
		Cipher cipher = Cipher.getInstance("DES");
		cipher.init(Cipher.DECRYPT_MODE, key, sr);
		return new String(cipher.doFinal(getBytes(encryptText)));
	}

	private static String toHexString(byte[] bytes) {
		StringBuilder builder = new StringBuilder();

		if (bytes != null) {
			for (byte b : bytes) {
				String str = Integer.toHexString(b);

				if (str.length() > 2) {
					str = str.substring(str.length() - 2);
				}
				if (str.length() < 2) {
					str = "0" + str;
				}

				builder.append(str);
			}
		}

		return builder.toString().toUpperCase();
	}

	private static byte[] getBytes(String hexString) {

		if (StringUtils.isNotBlank(hexString)) {
			if (hexString.length() % 2 == 0) {
				byte[] data = new byte[hexString.length() / 2];
				int end = 0;

				while ((end += 2) <= hexString.length()) {
					String hexChar = hexString.substring(end - 2, end);
					data[(end / 2) - 1] = (byte) Integer.parseInt(hexChar, 16);
				}

				return data;
			}
		}

		return new byte[0];
	}

	public static String randNineData() {
		return String.valueOf((int) (Math.random() * 900000000 + 100000000));
	}

	public static String getFromBASE64(String s) {
		if (s == null)
			return null;
		BASE64Decoder decoder = new BASE64Decoder();
		try {
			byte[] b = decoder.decodeBuffer(s);
			return new String(b);
		} catch (Exception e) {
			return null;
		}
	}

	public static String getAesmBASE64(String content) {
		String baseContent=null;
		try {
			baseContent = new BASE64Encoder().encodeBuffer(content.getBytes("UTF-8"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return baseContent;
	}
}
