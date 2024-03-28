package lk.orionux.RabbitMq_Demo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 3/29/2024
 * @project : RabbitMq_Demo
 */

@Configuration
public class RabbitMQConfig {
    public static  final String QUEUE = "rabbit_mq_queue";
    public static  final String EXCHANGE = "rabbit_mq_exchange";
    public static  final String ROUTING_KEY = "rabbit_mq_key";

    @Bean
    public Queue queue(){
        return new Queue(QUEUE);
    }

    @Bean
    public DirectExchange directExchange(){
        return  new DirectExchange(EXCHANGE);
    }

    @Bean
    public Binding binding(Queue queue, DirectExchange directExchange){
        return  BindingBuilder.bind(queue).to(directExchange).with(ROUTING_KEY);
    }



}
