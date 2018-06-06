package com.best1.base;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * <p>
 * <h2>BaseBo是所有BO类的抽象基类</h2>
 * </p>
 
 */
public abstract class BaseBO {

	private static final long serialVersionUID = 1L;
	
	//日志对象
	protected transient Log log = null;
	protected BaseDAO baseDAO;

	/**构造对象*/
	public BaseBO() {
		log = LogFactory.getLog(this.getClass());
	}

    /**取得日志对象*/
	protected Log getLog() {
		return log;
	}
	
	public BaseDAO getBaseDAO() {
		return baseDAO;
	}
	public void setBaseDAO(BaseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}	

}
