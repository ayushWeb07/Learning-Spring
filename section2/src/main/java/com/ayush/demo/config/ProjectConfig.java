package com.ayush.demo.config;

import com.ayush.demo.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle bmwM5() {
        return new Vehicle(4, "BMW M5");
    }

    @Bean
    Vehicle ninjaZX10() {
        return new Vehicle(2, "Ninja ZX10R");
    }
}
