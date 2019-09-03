package com.wangzk.scconsumer.feign;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Title: MFeignConfig
 * @ProjectName: sc-consumer
 * @PackageName: com.wangzk.scconsumer.feign
 * @Description: TODO
 * @author: wangzk
 * @date: 2019-09-03 10:15
 */
@Configuration
public class MFeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
