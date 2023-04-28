package com.ciq.rabbitConfig;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import com.rabbitmq.client.ConnectionFactory;

@Configuration
public class MessageConfig {
	
	public static final String QUEUE="sriman queue";
	public static final String EXCHANGE="sriman exchange";
	public static final String ROUTUNG_KEY="sriman routing";
@Bean
	public Queue queue()
	{
		return new Queue(QUEUE);
	}
	@Bean
	public TopicExchange topicExchange()
	{
		return new TopicExchange(EXCHANGE);
		
	}
	@Bean
	public Binding binding(Queue queue,TopicExchange exchange)
	{
		return BindingBuilder.bind(queue).to(exchange).with(ROUTUNG_KEY);
		
	}
	@Bean
	public MessageConverter converter()
	{
		return  new Jackson2JsonMessageConverter();
		
	}
	@Bean
	public AmqpTemplate templete(org.springframework.amqp.rabbit.connection.ConnectionFactory connectionFactory)
	{
		
		RabbitTemplate rabbitTemplate=new RabbitTemplate(connectionFactory);
		rabbitTemplate.setMessageConverter(converter());
		return rabbitTemplate;
		
	}
}
