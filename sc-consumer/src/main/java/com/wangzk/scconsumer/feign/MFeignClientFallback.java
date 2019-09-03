package com.wangzk.scconsumer.feign;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Title: MFeignClientFallback
 * @ProjectName: sc-consumer
 * @PackageName: com.wangzk.scconsumer.feign
 * @Description: TODO
 * @author: wangzk
 * @date: 2019-09-03 10:16
 */
@Component
public class MFeignClientFallback implements MFeignClient {
    @Override
    public String sayHelloWorld(String msg) {
        return "fallback";
    }

    @Override
    public List<Integer> list() {
        return new ArrayList<>();
    }

    @Override
    public Integer[] array() {
        return new Integer[0];
    }
}
