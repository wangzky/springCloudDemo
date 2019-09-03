package com.wangzk.eurekaserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created with IntelliJ IDEA.
 * Description: 关闭跨域
 *
 * @Title: WebSecurityConfig
 * @ProjectName: eureka-server
 * @PackageName: com.wangzk.eurekaserver.config
 * @Description: TODO
 * @author: wangzk
 * @date: 2019-09-03 09:26
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable();
        super.configure(http);
    }
}
