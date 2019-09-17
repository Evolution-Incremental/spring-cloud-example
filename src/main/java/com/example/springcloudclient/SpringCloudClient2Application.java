package com.example.springcloudclient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan("com.example.springcloudclient.*.*")
public class SpringCloudClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudClient2Application.class, args);
    }

}
