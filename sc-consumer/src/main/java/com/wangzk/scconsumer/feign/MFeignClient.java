package com.wangzk.scconsumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description: feign 请求 MFeignClientFallback 错误处理 MFeignConfig 配置文件
 *
 * @Title: MFeignClient
 * @ProjectName: sc-consumer
 * @PackageName: com.wangzk.scconsumer.controller
 * @Description: TODO
 * @author: wangzk
 * @date: 2019-09-03 10:13
 */
@FeignClient(name = "sc-provider",fallback = MFeignClientFallback.class, configuration = MFeignConfig.class)
public interface MFeignClient {
    // 这是被请求微服务的地址，也就是provider的地址
    @GetMapping(value = "/{msg}")
    String sayHelloWorld(@PathVariable("msg") String msg);

    @GetMapping(value = "/list")
    List<Integer> list();

    @GetMapping(value = "/list")
    Integer[] array();
}
