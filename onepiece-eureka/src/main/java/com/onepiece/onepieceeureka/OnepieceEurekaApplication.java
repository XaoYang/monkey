package com.onepiece.onepieceeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class OnepieceEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnepieceEurekaApplication.class, args);
    }

}
