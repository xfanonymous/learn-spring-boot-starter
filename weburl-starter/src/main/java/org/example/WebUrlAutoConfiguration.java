package org.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * Copyright (c) 2023-2033 All Rights Reserved
 * 使能自动配置类
 *
 *
 * @date: 2023/4/20
 */

@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(WebUrlProperties.class)
public class WebUrlAutoConfiguration {
    @Resource
    WebUrlProperties webUrlProperties;

    @Bean
    public WebUrlService getWebUrlService() {
        return new WebUrlService();
    }

}
