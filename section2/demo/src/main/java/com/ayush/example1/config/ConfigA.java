package com.ayush.example1.config;

import com.ayush.example1.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
public class ConfigA {
    @Bean(name= "lambo")
    @Description("It represents a car model of Lamborghini")
    Vehicle lambo() {
        return new Vehicle("Lamborghini", "Ruvelto", 4);
    }

    @Bean(name= "ninja")
    @Description("It represents a bike model of Kawasaki")
    Vehicle ninja() {
        return new Vehicle("Kawasaki", "ZX10R", 2);
    }
}
