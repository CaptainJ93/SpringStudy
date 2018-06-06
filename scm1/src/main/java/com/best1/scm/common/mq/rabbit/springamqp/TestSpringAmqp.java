package com.best1.scm.common.mq.rabbit.springamqp;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//org/springframework/amqp/core/AmqpTemplate
// org/springframework/util/backoff/BackOff  

public class TestSpringAmqp {
	
	public static void main(String[] args) throws InterruptedException {
		
		  AbstractApplicationContext ctx =
			        new ClassPathXmlApplicationContext("application-context.xml");
//		  AmqpTemplate  template = (AmqpTemplate) ctx.getBean("amqpTemplate");
		  RabbitTemplate template = ctx.getBean(RabbitTemplate.class);
//		        Test test=(Test) ctx.getBean("test");
//			    test.say();
		        while(true){
			    template.convertAndSend("foo.bar");
			    Thread.sleep(3000);
		        }
	}
		
	}


