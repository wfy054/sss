package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@EnableElasticsearchRepositories(basePackages = "com.jk.dao")
public class TravelWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelWebApplication.class, args);
    }

}
