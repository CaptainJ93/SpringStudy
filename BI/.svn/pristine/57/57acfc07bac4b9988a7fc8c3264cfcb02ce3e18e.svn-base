package com.best1.base;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * <p>
 * <h2>BasePo是所有PO类的抽象基类</h2>
 * </p>
 
 */
public abstract class BasePO  {

	private static final long serialVersionUID = 1L;

	
	//日志对象
	private transient Log log = null;

	/**构造DTO对象*/
	public BasePO() {
		log = LogFactory.getLog(this.getClass());
	}

    /**取得日志对象*/
	protected Log getLog() {
		return log;
	}

}
