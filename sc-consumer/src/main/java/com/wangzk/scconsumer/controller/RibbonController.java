package com.wangzk.scconsumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Title: RibbonController
 * @ProjectName: sc-consumer
 * @PackageName: com.wangzk.scconsumer.controller
 * @Description: TODO
 * @author: wangzk
 * @date: 2019-09-03 10:03
 */
@RestController
public class RibbonController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/ribbon/{wd}")
    @HystrixCommand(fallbackMethod="fallbackMethod")
    public Mono<String> sayHelloWorld(@PathVariable("wd") String parm) {
        String res = this.restTemplate.getForObject("http://sc-provider/" + parm, String.class);
        return Mono.just(res);
    }

    public Mono<String> fallbackMethod(@PathVariable("wd") String parm) {
        return Mono.just("fallback");
    }
}
