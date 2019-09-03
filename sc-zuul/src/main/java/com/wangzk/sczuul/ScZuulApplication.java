package com.wangzk.sczuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
@RefreshScope  /* 更改配置时不需要手动的进行重启*/
public class ScZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScZuulApplication.class, args);
    }

}
