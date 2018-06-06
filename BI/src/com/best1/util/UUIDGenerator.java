package com.best1.util;

import java.util.UUID;

/**
 * Generate UUID.
 * 
 * @author ZUHUIH
 * 
 */
public class UUIDGenerator {
	/**
	 * Get UUID.
	 * 
	 * @return
	 */
	public static String getUUID() {
		UUID obj = UUID.randomUUID();
		String uuid = obj.toString();
		return (uuid);
	}
}