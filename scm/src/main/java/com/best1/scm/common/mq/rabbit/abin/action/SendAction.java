package com.best1.scm.common.mq.rabbit.abin.action;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.best1.scm.common.mq.rabbit.abin.rabbitmq.MessageProducer;


public class SendAction {
	private MessageProducer messageProducer;

	public  String execute() throws Exception {
		Date a = new Date();
		long b = System.currentTimeMillis();
		for (int i = 0; i <= 10000; i++) {
			messageProducer.sendMessage(i);
		}
		System.out.println(a);
		System.out.println(new Date());
		System.out.println("������" + (System.currentTimeMillis() - b) + "ms");
		return null;
	}

	public void setMessageProducer(MessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}
	
	public static void main(String[] args) throws Exception {
       ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
	                "application-context.xml");
       SendAction sendAction = (SendAction) context.getBean("sendAction");
		sendAction.execute();
	}

}
