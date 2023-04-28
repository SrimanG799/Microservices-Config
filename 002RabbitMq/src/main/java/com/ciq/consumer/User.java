package com.ciq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.ciq.dto.OrderStatus;
import com.ciq.rabbitConfig.MessageConfig;

@Component
public class User {
	@RabbitListener(queues=MessageConfig.QUEUE)
	
	public void consumemessageFromeQueue(OrderStatus orderStatus)
	{
		System.out.println("message recieved from queue"+orderStatus);
	}

}
