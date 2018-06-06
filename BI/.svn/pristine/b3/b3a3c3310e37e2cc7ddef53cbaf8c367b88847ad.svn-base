package com.best1.base;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * <p>
 * <h2>所有Service层实现类基类<h2>
 * </p>
 *
 * <p>
 * 实现Service类时，不必定义日志对象，如果需要写日志，则直接调用BaseServiceImpl
 * 基类的getLog()方法获得Log对象即可。
 * </p>
 * 
 */
public abstract class BaseServiceImpl implements BaseService {
	
	//日志对象
	protected Log log = null;


	/**构造BaseServiceImpl实例*/
	public BaseServiceImpl() {
		log = LogFactory.getLog(this.getClass());		
	}	
	
	/**获取日志对象*/
	protected Log getLog() {
		return this.log;
	}




}
