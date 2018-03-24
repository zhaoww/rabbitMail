package com.zww.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zhaoww on 2018/3/6.
 * 參考 https://www.extlight.com/2018/01/26/Spring-Boot-%E5%85%A5%E9%97%A8%E4%B9%8B%E6%B6%88%E6%81%AF%E4%B8%AD%E9%97%B4%E4%BB%B6%E7%AF%87%EF%BC%88%E4%BA%94%EF%BC%89/
 */
@Configuration
public class RabbitConfig {

    public static final String ROUTING_KEY1 = "routingKey1";

    // 队列
    @Bean
    public Queue queue0(){
        return new Queue("queue0");
    }

    @Bean
    public Queue queue1(){
        return new Queue("queue1");
    }

    @Bean
    public Queue queue2(){
        return new Queue("queue2");
    }

    @Bean
    public Queue queue3(){
        return new Queue("queue3");
    }

    @Bean
    public Queue queue4(){
        return new Queue("queue4");
    }

    // 交换机、绑定
    @Bean
    public TopicExchange registerExchange(){
        return new TopicExchange("registerExchange");
    }

    @Bean
    public Binding registerBinding(Queue queue0, TopicExchange registerExchange){
        return BindingBuilder.bind(queue0).to(registerExchange).with("user.#");
    }

    @Bean
    public FanoutExchange fanoutExchange (){
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    public Binding fanoutBinding1(Queue queue1, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(queue1).to(fanoutExchange);
    }

    @Bean
    public Binding fanoutBinding2(Queue queue2, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(queue2).to(fanoutExchange);
    }

    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange("directExchange");
    }

    @Bean
    public Binding directBinding(Queue queue3, DirectExchange directExchange) {
        return BindingBuilder.bind(queue3).to(directExchange).with(ROUTING_KEY1);
    }

    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange("topicExchange");
    }

    @Bean
    public Binding topicBinding(Queue queue4, TopicExchange topicExchange){
        return BindingBuilder.bind(queue4).to(topicExchange).with("user.#");
    }

}
