package com.pixelus.playerstats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigurationProperties
@ComponentScan({ "com.pixelus" })
public class PlayerStatsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlayerStatsApplication.class, args);
    }
}
