package com.zww.bll;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoww on 2018/3/24.
 */
@Component
public class DirectSender {
    @Autowired
    public RabbitTemplate rabbitTemplate;

    public String sendEmail(){
        rabbitTemplate.convertAndSend("directExchange","routingKey1","注册邮件");
        System.out.println("注册邮件");
        return "register email";
    }

    public String sendSms(){
        rabbitTemplate.convertAndSend("directExchange","routingKey1","注册短信");
        System.out.println("注册短信");
        return "register sms";
    }
}
