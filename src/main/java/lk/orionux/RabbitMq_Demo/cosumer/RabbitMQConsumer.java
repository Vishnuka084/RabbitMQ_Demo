package lk.orionux.RabbitMq_Demo.cosumer;

import lk.orionux.RabbitMq_Demo.config.RabbitMQConfig;
import lk.orionux.RabbitMq_Demo.entity.OrderDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 3/31/2024
 * @project : RabbitMq_Demo
 */

@Component
public class RabbitMQConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void consumer(OrderDTO orderDTO){

        System.out.println("consumer is able to consume message from queues"+orderDTO);
    }
}
