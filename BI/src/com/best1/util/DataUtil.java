package com.best1.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DataUtil {
	
	/**
	 * 计算两个日期之间的天数
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public static List getDays(String startTime, String endTime) {
		List list = new ArrayList();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date begin;
		try {
			begin = sdf.parse(startTime);
			Date end = sdf.parse(endTime);
			double between = (end.getTime() - begin.getTime()) / 1000;// 除以1000是为了转换成秒
			double day = between / (24 * 3600);
			for (int i = 0; i <= day; i++) {
				Calendar cd = Calendar.getInstance();
				cd.setTime(sdf.parse(startTime));
				cd.add(Calendar.DATE, i);// 增加一天
				list.add((new SimpleDateFormat("yyyyMMdd")).format(cd.getTime()));
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	
	/**
	 * 计算两个日期之间的月数
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public static List getMonths(String startTime, String endTime) {
		List list = new ArrayList();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		int iMonth = 0;
		int flag = 0;
		try {
			Date date1 = sdf.parse(startTime);
			Date date2 = sdf.parse(endTime);
			Calendar objCalendarDate1 = Calendar.getInstance();
			objCalendarDate1.setTime(date1);
			Calendar objCalendarDate2 = Calendar.getInstance();
			objCalendarDate2.setTime(date2);
			if (objCalendarDate2.equals(objCalendarDate1)){
				list.add(new SimpleDateFormat("yyyyMM").format(objCalendarDate1.getTime()));
				return list;
			}
			if (objCalendarDate1.after(objCalendarDate2)) {
				Calendar temp = objCalendarDate1;
				objCalendarDate1 = objCalendarDate2;
				objCalendarDate2 = temp;
			}
			if (objCalendarDate2.get(Calendar.DAY_OF_MONTH) < objCalendarDate1
					.get(Calendar.DAY_OF_MONTH))
				flag = 1;
			if (objCalendarDate2.get(Calendar.YEAR) > objCalendarDate1
					.get(Calendar.YEAR))
				iMonth = ((objCalendarDate2.get(Calendar.YEAR) - objCalendarDate1
						.get(Calendar.YEAR))
						* 12 + objCalendarDate2.get(Calendar.MONTH) - flag)
						- objCalendarDate1.get(Calendar.MONTH);
			else
				iMonth = objCalendarDate2.get(Calendar.MONTH)
						- objCalendarDate1.get(Calendar.MONTH) - flag;
			list.add(new SimpleDateFormat("yyyyMM").format(objCalendarDate1.getTime()));
			for(int i = 0;i < iMonth; i++){
				objCalendarDate1.add(Calendar.MONTH, 1);
				list.add(new SimpleDateFormat("yyyyMM").format(objCalendarDate1.getTime()));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 计算两个日期之间的年数
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public static List getYears(String startTime, String endTime) {
		List list = new ArrayList();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		int iYear = 0;
		int flag = 0;
		try {
			Date date1 = sdf.parse(startTime);
			Date date2 = sdf.parse(endTime);
			Calendar objCalendarDate1 = Calendar.getInstance();
			objCalendarDate1.setTime(date1);
			Calendar objCalendarDate2 = Calendar.getInstance();
			objCalendarDate2.setTime(date2);
			if (objCalendarDate2.equals(objCalendarDate1)){
				list.add(sdf.format(objCalendarDate1.getTime()));
				return list;
			}
			if (objCalendarDate1.after(objCalendarDate2)) {
				Calendar temp = objCalendarDate1;
				objCalendarDate1 = objCalendarDate2;
				objCalendarDate2 = temp;
			}
			if (objCalendarDate2.get(Calendar.DAY_OF_YEAR) < objCalendarDate1
					.get(Calendar.DAY_OF_YEAR))
				flag = 1;
			if (objCalendarDate2.get(Calendar.YEAR) > objCalendarDate1.get(Calendar.YEAR))
				iYear = objCalendarDate2.get(Calendar.YEAR) - objCalendarDate1.get(Calendar.YEAR);
			list.add(sdf.format(objCalendarDate1.getTime()));
			for(int i = 0;i < iYear; i++){
				objCalendarDate1.add(Calendar.YEAR, 1);
				list.add(sdf.format(objCalendarDate1.getTime()));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = getDays("2014-4-1","2014-5-1");
		for(String s : list){
			System.out.println(s);
		}

	}

}
