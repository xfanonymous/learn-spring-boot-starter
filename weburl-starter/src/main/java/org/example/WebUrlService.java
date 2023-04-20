package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright (c) 2023-2033 All Rights Reserved
 * 业务类调用配置文件属性
 *
 *
 * @date: 2023/4/20
 */

public class WebUrlService {
    @Autowired
    WebUrlProperties webUrlProperties;

    public String getWebUrlPropertiesVal(String paramVal) {
        return "paramVal : " + paramVal + "; proName : " +
                webUrlProperties.getProName() + "; proDate : " + webUrlProperties.getProData();
    }
}
