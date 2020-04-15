package com.huayutech.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 根容器配置类
 * created on 2019-05-04
 */
@Configuration
@ComponentScan(basePackages = {"com.huayutech.service"})
public class RootConfig {
}
