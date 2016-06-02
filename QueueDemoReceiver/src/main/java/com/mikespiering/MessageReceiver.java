package com.mikespiering;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageReceiver {

	@Autowired
	RabbitTemplate rabbitTemplate;



	public void receiverMessage(String message)
	{
		System.out.println("RECEIVED MESSAGE: "+message);
	}
}
