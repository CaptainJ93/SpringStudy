package com.best1.scm.common.mq.rabbit.abin.rabbitmq;


import org.springframework.amqp.rabbit.core.RabbitTemplate;

public class MessageProducer {
	private RabbitTemplate rabbitTemplate;

	public void sendMessage(Integer i) {
		String message = "Hello World wubin " + "#" + i;
		//Exchange�����Ϊ"hello.topic"��routingkey�����Ϊ"hello.world.q123ueue"
		rabbitTemplate.convertAndSend("hello.topic", "hello.world.q123ueue",
				message);
		System.out.println("���͵�" + i + "����Ϣ�ɹ�������Ϊ��" + message);

//		String messages = "Hello World direct " + "#" + i;
//		rabbitTemplate.convertAndSend("hello.direct", "hello.world.queue",
//				messages);
//		System.out.println("���͵�" + i + "����Ϣ�ɹ�������Ϊ��" + messages);
	}

	public void setRabbitTemplate(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

}
