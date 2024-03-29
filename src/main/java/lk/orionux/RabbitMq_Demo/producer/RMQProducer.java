package lk.orionux.RabbitMq_Demo.producer;

import lk.orionux.RabbitMq_Demo.config.RabbitMQConfig;
import lk.orionux.RabbitMq_Demo.entity.Order;
import lk.orionux.RabbitMq_Demo.entity.OrderDTO;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 3/29/2024
 * @project : RabbitMq_Demo
 */

@RestController
@RequestMapping("/api")
public class RMQProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @PostMapping("/order")
    public OrderDTO placeOrder(@RequestBody Order order){

        OrderDTO orderDTO = new OrderDTO(order,"Order Placed" , "Hi Producer Your Order is Placed ");

        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE, RabbitMQConfig.ROUTING_KEY , orderDTO);
        return orderDTO;
    }
}