package com.jewel.meta.asset_platform.greeter_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GreeterServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GreeterServiceApplication.class, args);
    }

}
