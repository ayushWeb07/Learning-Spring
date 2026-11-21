package com.ayush.demo6.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MyBeanRegistrar.class)
public class ProjectConfig {
}
