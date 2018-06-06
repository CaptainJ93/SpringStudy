package com.best1.scm.common.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;
/**
 * 
 * Description: 对此类的功能描述
 * @author Abdul.wu
 * Create Date: Apr 22, 2013 
 * <pre>
 * 修改记录:
 * 修改后版本       修改人      修改日期    修改内容 
 * Apr 22, 2013.       Abdul.wu    Apr 22, 2013    TODO
 * </pre>
 */
public class ChineseMoneyScriptlet extends JRDefaultScriptlet {
	/**
	 * 默认的构造函数
	 */
	public ChineseMoneyScriptlet(){
		
	}
	
	//数字对应的中文大写map
	private static Map<String, String> chineseNumberMap = null;
	//中国的货币单位-数字位置
	private static Map<String, String> chineseUnitMap = null;
	/**
	 * 
	 * Description : 数字对应的中文大写
	 * @author abdul.wu
	 * CreateTime 20130422
	 */
	static {
		 if(chineseNumberMap==null){
			 chineseNumberMap= new HashMap<String, String>();
		 }
		 chineseNumberMap.put("0", "零");
		 chineseNumberMap.put("1", "壹");
		 chineseNumberMap.put("2", "贰");
		 chineseNumberMap.put("3", "叁");
		 chineseNumberMap.put("4", "肆");
		 chineseNumberMap.put("5", "伍");
		 chineseNumberMap.put("6", "陆");
		 chineseNumberMap.put("7", "柒");
		 chineseNumberMap.put("8", "捌");
		 chineseNumberMap.put("9", "玖");
	} 
	/**
	 * 
	 * Description : 对应的货币单位
	 * @author abdul.wu
	 * CreateTime 20130422
	 */
	static {
		if(null==chineseUnitMap){
			chineseUnitMap = new HashMap<String, String>();
		}
		chineseUnitMap.put("1", "");
		chineseUnitMap.put("2", "拾");
		chineseUnitMap.put("3", "佰");
		chineseUnitMap.put("4", "仟");
		chineseUnitMap.put("5", "万");
		chineseUnitMap.put("6", "拾");
		chineseUnitMap.put("7", "佰");
		chineseUnitMap.put("8", "仟");
		chineseUnitMap.put("9", "亿");
		chineseUnitMap.put("10", "拾");
		chineseUnitMap.put("11", "佰");
		chineseUnitMap.put("12", "仟");
		chineseUnitMap.put("-1", "角");
		chineseUnitMap.put("-2", "分");
		chineseUnitMap.put("-3", "厘");
	}
	/**
	 * 
	 * Description : 将金钱数字转换成中文大写
	 * @param moneyStr 金钱数值字符形式
	 * @param pointInt 保留位数（角，分，厘），最多3位，1位表示到角，2位表示到分，3位表示到厘
	 * @param isClearZore 是否去除元前面的零大写。
	 * @return
	 * @author abdul.wu
	 * CreateTime 20130422
	 */
	public String getChineseUnit(String moneyStr,int pointInt,boolean isClearZore){
		String chineseStr = "";
		if(null!=moneyStr && !"".equals(moneyStr)){
			String moneyReg = "((^[0-9]*$)|(^[0-9]+.[0-9]+$))";//金钱数字匹配
			Pattern pattern = Pattern.compile(moneyReg);
			Matcher matcher = pattern.matcher(moneyStr);
			if(matcher.matches()){//符合格式
				String intStr = "";//整数
				String pointStr = "";//小数，自动获取两或是3位
				if(moneyStr.indexOf(".")>0){//有小数
					int pointPosition = moneyStr.indexOf(".");
					intStr = moneyStr.substring(0,pointPosition);
					pointStr = moneyStr.substring(pointPosition+1);
				}else{
					intStr = moneyStr;
				}
				if(intStr.length()<=12){//是否超出转换位数
					int sum = intStr.length();
					int j=0;
					for (int i=0;i<sum;i++){
						/*char value = intStr.charAt(sum-1-i);
						String positionStr = chineseNumberMap.get(""+value);
						positionStr = positionStr+chineseUnitMap.get((i+1)+"");
						chineseStr = positionStr + chineseStr;*/
						
						char value=intStr.charAt(sum-1-i);
						String positionStr = "";
						if(value=='0'&&j==0){
							positionStr = chineseNumberMap.get(""+value);
							j=j+1;
						}else if(value=='0'&&j!=0){	
							j=j+1;
						}else{
							positionStr = chineseNumberMap.get(""+value)+chineseUnitMap.get((i+1)+"");
							j=0;
						}
						chineseStr = positionStr + chineseStr;
					}
					if(chineseStr.endsWith("零")){
						if(chineseStr.length()>1){
							chineseStr=chineseStr.substring(0, chineseStr.length()-1);
						}
					}
					chineseStr=chineseStr+"元";
					if(pointStr==""){
						chineseStr = chineseStr + "整";
					}else{
						if(pointInt>3){
							pointInt =3;
						}
						int pointSum = pointStr.length();
						String pointPosStr = "";
						for (int i = 0; i < pointSum; i++) {
							if(i<3 && i<pointInt){
								pointPosStr = pointPosStr + chineseNumberMap.get(pointStr.charAt(i)+"");
								pointPosStr = pointPosStr + chineseUnitMap.get((-(i+1))+"");
							}
						}
						chineseStr = chineseStr + pointPosStr;
					}
				}
			}
		}
		if(isClearZore){//选择去零
			if(null!=chineseStr && !"".equals(chineseStr)){
				int yuanInt = chineseStr.indexOf(chineseUnitMap.get("1"));
				if(yuanInt>0){
					String digitalNum = chineseStr.substring(yuanInt-1,yuanInt);
					if(chineseNumberMap.get("0").equals(digitalNum)){
						chineseStr = chineseStr.substring(0,yuanInt-1)+chineseUnitMap.get("1")+chineseStr.substring(yuanInt+1);
					}
				}
			}
		}
		return chineseStr;
	}
	/**
	 * 
	 * Description : 将金钱数字转换成中文大写
	 * @param moneyStr 金钱数值字符形式
	 * @return
	 * @author abdul.wu
	 * CreateTime 20130422
	 */
	public String getChineseUnit(String moneyStr){
		return this.getChineseUnit(moneyStr, 3, false);
	}
	/**
	 * 
	 * Description : 将金钱数字转换成中文大写
	 * @param moneyStr 金钱数值字符形式
	 * @param pointInt 保留位数（角，分，厘），最多3位，1位表示到角，2位表示到分，3位表示到厘
	 * @return
	 * @author abdul.wu
	 * CreateTime 20130422
	 */
	public String getChineseUnit(String moneyStr,int pointInt){
		return this.getChineseUnit(moneyStr, pointInt, false);
	}
	
	public String showChinese(String moneyStr){
		return this.getChineseUnit(moneyStr);
	}
	
//	public static void main(String[] args) {
//		String money = "10000002";
//		TransChineseMoneyScriptlet test = new TransChineseMoneyScriptlet();
//		System.out.println(test.getChineseUnit(money)); 
//	}
	@Override
	public void afterDetailEval() throws JRScriptletException {
		super.afterDetailEval();
	}
	@Override
	public void afterGroupInit(String groupName) throws JRScriptletException {
		super.afterGroupInit(groupName);
	}
	@Override
	public void afterPageInit() throws JRScriptletException {
		super.afterPageInit();
	}
	@Override
	public void afterReportInit() throws JRScriptletException {
		super.afterReportInit();
	}
	@Override
	public void beforeColumnInit() throws JRScriptletException {
		super.beforeColumnInit();
	}
	@Override
	public void beforeDetailEval() throws JRScriptletException {
		super.beforeDetailEval();
	}
	@Override
	public void beforeGroupInit(String groupName) throws JRScriptletException {
		super.beforeGroupInit(groupName);
	}
	@Override
	public void beforePageInit() throws JRScriptletException {
		super.beforePageInit();
	}
	@Override
	public void beforeReportInit() throws JRScriptletException {
		super.beforeReportInit();
	}
}
