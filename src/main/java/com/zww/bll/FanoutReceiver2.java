package com.zww.bll;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoww on 2018/3/7.
 */
@Component
@RabbitListener(queues = "queue2")
public class FanoutReceiver2 {

    @RabbitHandler
    public void process(String msg){
        System.out.println("fanout Receiver2: " + msg);
    }
}
