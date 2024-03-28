package lk.orionux.RabbitMq_Demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Vishnuka Yahan
 *
 * @author : Vishnuka Yahan
 * @data : 3/29/2024
 * @project : RabbitMq_Demo
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {

    private Integer id;
    private String name;
    private double price;
    private Integer qty;
}
