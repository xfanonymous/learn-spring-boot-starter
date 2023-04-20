package org.example;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Copyright (c) 2023-2033 All Rights Reserved
 * 自动配置类
 * 设置相关属性
 *
 * @date: 2023/4/20
 */

@Data
@ConfigurationProperties(prefix = "weburl")
public class WebUrlProperties  {
    private String proName = "default name";
    private String proData = "default data";
}
