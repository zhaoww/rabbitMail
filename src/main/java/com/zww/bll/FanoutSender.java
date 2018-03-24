package com.zww.bll;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zhaoww on 2018/3/7.
 */
@Component
public class FanoutSender {
    @Autowired
    public RabbitTemplate rabbitTemplate;

    public void send(){
        String msg = "hello";
        System.out.println("Send:" + msg);
        rabbitTemplate.convertAndSend("fanoutExchange","",msg);
    }

    public String sendEmail(){
//        rabbitTemplate.convertAndSend("queue1","注册邮件");
        rabbitTemplate.convertAndSend("fanoutExchange","","注册邮件");
        System.out.println("注册邮件");
        return "register email";
    }

    public String sendSms(){
//        rabbitTemplate.convertAndSend("","queue1","注册短信");
        rabbitTemplate.convertAndSend("fanoutExchange","","注册短信");
        System.out.println("注册短信");
        return "register sms";
    }
}
