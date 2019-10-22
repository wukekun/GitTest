package com.wkk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudClient02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudClient02Application.class, args);
    }

}
