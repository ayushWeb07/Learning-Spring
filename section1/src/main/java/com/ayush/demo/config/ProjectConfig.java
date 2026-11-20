package com.ayush.demo.config;

import com.ayush.demo.entities.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehicle() {
        return new Vehicle(4, "bmw", "m5");
    }
}
