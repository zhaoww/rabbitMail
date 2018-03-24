package com.zww.bll;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoww on 2018/3/7.
 */
@Component
public class TopicSender {
    @Autowired
    public RabbitTemplate rabbitTemplate;

    public String sendEmail(){
        rabbitTemplate.convertAndSend("topicExchange","user.s","注册邮件");
        System.out.println("注册邮件");
        return "register email";
    }

    public String sendSms(){
        rabbitTemplate.convertAndSend("topicExchange","user.2","注册短信");
        System.out.println("注册短信");
        return "register sms";
    }
}
