package com.pay.assist.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableEurekaServer
@EnableScheduling
public class PayAssistWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayAssistWebApplication.class, args);
    }

}

