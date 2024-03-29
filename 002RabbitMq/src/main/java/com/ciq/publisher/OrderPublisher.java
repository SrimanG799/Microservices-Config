package com.ciq.publisher;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.dto.Order;
import com.ciq.dto.OrderStatus;
import com.ciq.rabbitConfig.MessageConfig;

@RestController
@RequestMapping("/order")
public class OrderPublisher {
	@Autowired
	private RabbitTemplate rabbitTemplate;
	@PostMapping("/{resturentName}")
public String bookOrder(@RequestBody Order order,@PathVariable String resturentName )
{
		
		order.setOrderId(UUID.randomUUID().toString());
		
		OrderStatus orderStatus=new OrderStatus(order, "process", "orderPlacedSuccessfullyIn"+resturentName);
	
		rabbitTemplate.convertAndSend(MessageConfig.EXCHANGE,MessageConfig.ROUTUNG_KEY,orderStatus);
		return "success";
		
}
}
