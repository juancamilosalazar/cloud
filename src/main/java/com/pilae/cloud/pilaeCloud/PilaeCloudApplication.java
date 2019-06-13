package com.pilae.cloud.pilaeCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PilaeCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(PilaeCloudApplication.class, args);
    }

}


