package com.nosuchfield.httpstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author hourui 2017/10/10 16:29
 */
@Configuration
@EnableConfigurationProperties(HttpProperties.class) // 使@ConfigurationProperties注解生效，把自定义Properties注入入到IOC容器
public class HttpAutoConfiguration {

    @Resource
    private HttpProperties properties; // 配置类

    // 通过一定的手段或条件来创建bean，然后放入表中，之后从表中获取bean

    // 在Spring上下文中创建一个对象
    @Bean
    @ConditionalOnMissingBean // 在该 bean 不存在的情况下此方法才会执行
    public HttpClient init() {
        // 创建了一个 HttpClient 类的 bean
        HttpClient client = new HttpClient();

        String url = properties.getUrl();  // 配置类属性
        client.setUrl(url);
        return client;
    }

}
