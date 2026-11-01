package com.ayush.example1.config;

import com.ayush.example1.beans.Fighter;
import com.ayush.example1.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
public class ProjectConfig {
    @Bean(name= "lamboCar")
    @Description("Represents a car of Lamborghini")
    Vehicle lamboCar() {
        return new Vehicle("Lamborghini", "Ruvelto", 4);
    }

    @Bean(name= "bmwBike")
    @Description("Represents a bike of BMW")
    Vehicle bmwBike() {
        return new Vehicle("BMW", "SS1000R", 2);
    }

    @Bean(name= "islam")
    @Description("Represents a fighter known as Islam")
    Fighter islam() {
        return new Fighter("Islam", 28, 2);
    }
}
