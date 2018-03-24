package com.zww.bll;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoww on 2018/3/7.
 */
@Component
@RabbitListener(queues = "queue4")
public class TopicReceiver4 {

    @RabbitHandler
    public void process(String msg){
        System.out.println("topic Receiver4: " + msg);
    }
}
