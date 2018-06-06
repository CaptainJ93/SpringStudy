package com.best1.scm.common.mq.rabbit.abin.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	public static void main(String[] args) {
	     ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
	                "application-context.xml");
    Test test = (Test) context.getBean("test");
    test.say();
    
	}

}
