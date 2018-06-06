package com.best1.api.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.StringTokenizer;

import org.apache.commons.lang.time.FastDateFormat;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DateUtil {
	private static Log log = LogFactory.getLog(DateUtil.class);
	private static final String TIME_PATTERN = "HH:mm";

	public static final String YYYY_MM_DD = "yyyy-MM-dd";

	public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

	public static final String YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";

	public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

	public static final String YYYYMMDD = "yyyyMMdd";
	
	public static final String MMDDYYYY = "MM/dd/yyyy";

	/**
	 * Checkstyle rule: utility classes should not have public constructor
	 */
	private DateUtil() {
	}

	/**
	 * Return default datePattern (MM/dd/yyyy)
	 * 
	 * @return a string representing the date pattern on the UI
	 */
	public static String getDatePattern() {
		return "MM/dd/yyyy";
	}

	public static String getDateTimePattern() {
		return DateUtil.getDatePattern() + " HH:mm:ss.S";
	}

	/**
	 * This method attempts to convert an Oracle-formatted date in the form
	 * dd-MMM-yyyy to mm/dd/yyyy.
	 * 
	 * @param aDate
	 *            date from database as a string
	 * @return formatted string for the ui
	 */
	public static String getDate(Date aDate) {
		SimpleDateFormat df;
		String returnValue = "";

		if (aDate != null) {
			df = new SimpleDateFormat(getDatePattern());
			returnValue = df.format(aDate);
		}

		return (returnValue);
	}

	public static String getTodayYyyyMmDd() {
		
		SimpleDateFormat sdf = new SimpleDateFormat(YYYYMMDD);
		String returnValue = "";

		returnValue = sdf.format(new Date());
		
		return (returnValue);
	}
	
public static String getTodayYear() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
		String returnValue = "";

		returnValue = sdf.format(new Date());
		
		return (returnValue);
	}
	
	
	/**
	 * This method attempts to convert an Oracle-formatted date in the form
	 * dd-MMM-yyyy to mm/dd/yyyy.
	 * 
	 * @param aDate
	 *            date from database as a string
	 * @return formatted string for the ui
	 */
	public static String getDateYyyyMmDd(Date aDate) {
		SimpleDateFormat df;
		String returnValue = "";

		if (aDate != null) {
			df = new SimpleDateFormat(YYYY_MM_DD);
			returnValue = df.format(aDate);
		}

		return (returnValue);
	}
	
	public static Date getTodayTime() {
		SimpleDateFormat sdf = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
		java.util.Date time = null;
		try {
			time = sdf.parse(sdf.format(new Date()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return time;
	}
	
	public static String formatToTime() {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		return sdf.format((new Date()));
	}
	
	
	public static Date getTodayTimeADDYear(int year) {
		SimpleDateFormat df = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
		java.util.Date time = null;
		try {
		 
			time = df.parse(df.format(DateUtils.addYears(new Date(), year)));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return time;
	}

	public static Date getDateADDDay(Date date,int day) {
		SimpleDateFormat df = new SimpleDateFormat(YYYY_MM_DD_HH_MM_SS);
		java.util.Date time = null;
		try {
		
			time = df.parse(df.format(DateUtils.addDays(date, day)));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return time;
	}
	
	/**
	 * 格式化 字符串到日期格式
	 * 
	 * @param aMask
	 *            格式
	 * @param strDate
	 *            字符串
	 * @return
	 * @throws ParseException
	 * @date 2007-12-15
	 * @author luojun
	 */
	public static Date convertStringToDate(String aMask, String strDate)
			throws ParseException {
		SimpleDateFormat df;
		Date date;
		df = new SimpleDateFormat(aMask, Locale.ITALIAN);
		if (log.isDebugEnabled()) {
			log.debug("converting '" + strDate + "' to date with mask '"
					+ aMask + "'");
		}
		try {
			
			date = df.parse(strDate.trim());
		} catch (ParseException pe) {
			throw new ParseException(pe.getMessage(), pe.getErrorOffset());
		}

		return date;
	}

	/**
	 * This method returns the current date time in the format: MM/dd/yyyy HH:MM
	 * a
	 * 
	 * @param theTime
	 *            the current time
	 * @return the current date/time
	 */
	public static String getTimeNow(Date theTime) {
		return convertDateToString(TIME_PATTERN, theTime);
	}

	/**
	 * This method returns the current date in the format: MM/dd/yyyy
	 * 
	 * @return the current date
	 * @throws ParseException
	 *             when String doesn't match the expected format
	 */
	public static Calendar getToday() {
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat(getDatePattern());

		// This seems like quite a hack (date -> string -> date),
		// but it works ;-)
		String todayAsString = df.format(today);
		Calendar cal = new GregorianCalendar();
		try {
			cal.setTime(convertStringToDate(todayAsString));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return cal;
	}

	/**
	 * 日期格式转成string
	 * 
	 * @param aMask
	 *            格式
	 * @param aDate
	 *            日期
	 * @return
	 * @date 2007-12-15
	 * @author luojun
	 */
	public static String convertDateToString(String aMask, Date aDate) {
		SimpleDateFormat df = null;
		String returnValue = "";

		if (aDate == null) {
			log.error("aDate is null!");
		} else {
			df = new SimpleDateFormat(aMask);
			returnValue = df.format(aDate);
		}

		return (returnValue);
	}

	/**
	 * This method converts a String to a date using the datePattern
	 * 
	 * @param strDate
	 *            the date to convert (in format MM/dd/yyyy)
	 * @return a date object
	 * @throws ParseException
	 *             when String doesn't match the expected format
	 */
	public static Date convertStringToDate(String strDate)
			throws ParseException {
		Date aDate = null;

		try {
			if (log.isDebugEnabled()) {
				log.debug("converting date with pattern: " + getDatePattern());
			}

			aDate = convertStringToDate(getDatePattern(), strDate);
		} catch (ParseException pe) {
			log.error("Could not convert '" + strDate
					+ "' to a date, throwing exception");
			pe.printStackTrace();
			throw new ParseException(pe.getMessage(), pe.getErrorOffset());
		}

		return aDate;
	}

	/**
	 * 得到当前时间之后某个时间点
	 * 
	 * @param minutes
	 * @return
	 */
	public static Date getExpiry(int minutes) {
		long expiry = System.currentTimeMillis() + minutes * 60 * 1000;
		return new Date(expiry);
	}

	public static java.sql.Timestamp getCurrentTimeStamp() {
		return new java.sql.Timestamp(System.currentTimeMillis());
	}

	public static String getCurrentString() throws Exception {

		String dateString = "";
		try {
			Timestamp ts = new java.sql.Timestamp(System.currentTimeMillis());
			String dateStr = ts.toString();
			dateStr = dateStr.substring(0, 10);
			StringTokenizer strTok = new StringTokenizer(dateStr, "-");
			String retStr[] = new String[3];

			while (strTok.hasMoreTokens()) {
				retStr[2] = (String) strTok.nextToken();
				retStr[1] = (String) strTok.nextToken();
				retStr[0] = (String) strTok.nextToken();
			}
			StringBuffer dd = new StringBuffer(retStr[0]);
			StringBuffer mm = new StringBuffer(retStr[1]);
			StringBuffer yyyy = new StringBuffer(retStr[2]);
			yyyy.append("/");
			yyyy.append(mm);
			yyyy.append("/");
			yyyy.append(dd);
			dateString = yyyy.toString();

		} catch (Exception e) {
			throw e;
		}
		return dateString;
	}

	public static java.sql.Date convertAPIDateToOracleDate(String str)
			throws Exception {
		GregorianCalendar cal = new GregorianCalendar();
		try {
			StringTokenizer strToken = new StringTokenizer(str, "/");
			int year = Integer.parseInt(strToken.nextToken());
			int mon = Integer.parseInt(strToken.nextToken()) - 1;
			int date = Integer.parseInt(strToken.nextToken());
			cal.set(year, mon, date, 0, 0, 0);
		} catch (Exception e) {
			throw e;
		}
		return new java.sql.Date(cal.getTimeInMillis());
	}
	
	public static Date strToDateLong(String strDate) {
		try {
			
			return DateUtils.
					parseDate(strDate,"yyyyMMddhhmmss");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		 return null; 
		}
    public static  String formatDate(Date date)throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       return sdf.format(date);
   }
   
   public static Date parse(String strDate) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       return sdf.parse(strDate);
   }
	
   public static Date parseyyymmdd(String strDate) throws ParseException{
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      return sdf.parse(strDate);
  }
   
	public  static String pad(String str, char padChar, int totalLength, int align)
	{
		String paddedField = str;
		while (paddedField.length() < totalLength)
		{
			if (align == IOAFConstants.FILL_RIGHT)
			{
				paddedField = paddedField + padChar;
			}
			else if (align == IOAFConstants.FILL_LEFT)
			{
				paddedField = padChar + paddedField;
			}
			else
			{
				return paddedField;
			}
		}
		return paddedField;

	}
	public static void main(String[] args) throws Exception {
		String aa="2017-04-25 11:00:00";
		//System.out.println(formatDate(strToDateLong(aa)));
		String str="3188.00";
		System.out.println(DateUtil.parse(aa));
		
	}

}
