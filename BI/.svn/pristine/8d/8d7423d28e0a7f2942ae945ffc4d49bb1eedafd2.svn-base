package com.best1.base;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BusiException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	//日志对象
	private transient Log log =  LogFactory.getLog(this.getClass());;
	public BusiException(String msg) {
		super(msg);
		log.error(getStackTrace()[1].getMethodName()+": 事务回滚!错误原因:"+msg);
	}
	public BusiException(Object className, Throwable cause) {
		super(className.toString(),cause);
		log.error(cause.getStackTrace()[0].getMethodName()+": 事务回滚!错误原因:"+cause.getMessage());
	}
	public BusiException(String msg,Exception e) {
		super(msg);
		StringBuilder message = new StringBuilder();
		for(int i=0;i<e.getStackTrace().length;i++){
			message.append(e.getStackTrace()[i] + "\r\n");
		}
		//打印Exception堆栈错误信息
		log.error(message);
		
		log.error(getStackTrace()[1].getMethodName()+": 事务回滚!错误原因:"+e.getMessage());
	}
}
