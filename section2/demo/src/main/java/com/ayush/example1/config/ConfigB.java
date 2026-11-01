package com.ayush.example1.config;

import com.ayush.example1.beans.Fighter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
public class ConfigB {
    @Bean(name= "islam")
    @Description("It represents the ufc fighter islam")
    Fighter islam() {
        return new Fighter("Islam", 28, 2);
    }

    @Bean(name= "tyson")
    @Description("It represents the boxing fighter tyson")
    Fighter tyson() {
        return new Fighter("Tyson", 50, 7);
    }
}
