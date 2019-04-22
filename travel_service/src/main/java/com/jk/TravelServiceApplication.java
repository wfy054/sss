package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.jk.mapper")
public class TravelServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelServiceApplication.class, args);
    }

}
