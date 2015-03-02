package com.pixelus.playerstats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PlayerStatsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlayerStatsApplication.class, args);
    }
}
