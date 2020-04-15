package com.huayutech.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * servlet容器配置类
 * @EnableWebMvc相当于配置文件中的<mvc:annotation-drivern />
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.huayutech.controller"})
public class ServletConfig implements WebMvcConfigurer {
}
