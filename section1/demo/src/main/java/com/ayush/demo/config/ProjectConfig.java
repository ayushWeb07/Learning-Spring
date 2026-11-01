package com.ayush.demo.config;

import com.ayush.demo.beans.Fighter;
import com.ayush.demo.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle lamboCar() {
        return new Vehicle("Lamborghini", "Ruvelto", 4);
    }

    @Bean
    Vehicle bmwBike() {
        return new Vehicle("BMW", "SS1000R", 2);
    }

    @Bean
    Fighter islam() {
        return new Fighter("Islam", 28, 2);
    }
}
