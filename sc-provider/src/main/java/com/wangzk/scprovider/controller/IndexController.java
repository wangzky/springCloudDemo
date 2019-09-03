package com.wangzk.scprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Title: IndexController
 * @ProjectName: sc-provider
 * @PackageName: com.wangzk.scprovider.controller
 * @Description: TODO
 * @author: wangzk
 * @date: 2019-09-03 09:44
 */
@RestController
public class IndexController {
    //返回一个实体
    @GetMapping("{msg}")
    public Mono<String> sayHelloWorld(@PathVariable("msg") String msg) {
        System.out.println("come on " + msg);
        return Mono.just("sc-provider receive : " +msg);
    }
    //返回一个列表
    @GetMapping("list")
    public Flux<Integer> list() {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(22);
        list.add(75);
        list.add(93);
        Flux<Integer> userFlux = Flux.fromIterable(list);
        return userFlux;
    }
}
