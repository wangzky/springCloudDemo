package com.wangzk.scprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ScProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScProviderApplication.class, args);
    }

}
