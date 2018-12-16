package com.pay.assist.web.config;

import com.pay.assist.client.constants.MsgQueueNames;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * RabbitMQ配置类
 * 消息队列统一在辅助项目配置
 * @author chenwei
 * @date 2018-12-12
 */
@Configuration
public class RabbitConfig {


    /**
     * hello 消息队列
     * @return
     */
    @Bean
    public Queue helloQueue(){
        return new Queue(MsgQueueNames.QUEUE_HELLO);
    }

}
