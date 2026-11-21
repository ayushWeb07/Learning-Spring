package com.ayush.demo3.config;

import com.ayush.demo3.beans.Person;
import com.ayush.demo3.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Vehicle vehicle() {
        return new Vehicle("Ferrari SF9");
    }

    @Bean
    Person person(Vehicle v) {
        return new Person("Ayush", v);
    }
}
