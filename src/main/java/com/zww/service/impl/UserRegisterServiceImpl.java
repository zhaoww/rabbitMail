package com.zww.service.impl;

import com.zww.bll.DirectSender;
import com.zww.bll.FanoutSender;
import com.zww.bll.TopicSender;
import com.zww.service.UserRegisterService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhaoww on 2018/3/7.
 */
@Service("serRegisterService")
public class UserRegisterServiceImpl implements UserRegisterService{

    @Autowired
    public RabbitTemplate rabbitTemplate;

    @Autowired
    public FanoutSender fanoutSender;

    @Autowired
    public DirectSender directSender;

    @Autowired
    public TopicSender topicSender;

    @Override
    public String userRegister(){

        // 1.写入数据库
        System.out.println("写入数据库");

        // 2.写入对列
        topicSender.sendEmail();
        topicSender.sendSms();

        return "over";
    }

    @Override
    public String userRegisterFanout() {
        fanoutSender.sendEmail();
        fanoutSender.sendSms();
        return "over";
    }

    @Override
    public String userRegisterDirect() {
        directSender.sendEmail();
        directSender.sendSms();
        return "over";
    }

    @Override
    public String userRegisterTopic() {
        topicSender.sendEmail();
        topicSender.sendSms();
        return "over";
    }

}
