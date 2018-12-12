package com.pay.assist.web.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMQ配置类
 * @author chenwei
 * @date 2018-12-12
 */
@Configuration
public class RabbitConfig {


    /**
     * hello 消息队列
     * @return
     */
    public Queue helloQueue(){
        return new Queue("hello");
    }

}
