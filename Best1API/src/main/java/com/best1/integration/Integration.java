package com.best1.integration;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Integration {
	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:/applicationContext*.xml");
		context.start(); //让线程在这里阻塞，防止JVM退出

		
		    }

}
