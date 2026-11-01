package com.ayush.example3.config;

import com.ayush.example3.beans.Person;
import com.ayush.example3.beans.Vehicle;
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

    @Bean(name= "imanPerson")
    @Description("Represents a person known as Iman")
    Person imanPerson() {
        return new Person("Iman", lamboCar());
    }

    @Bean(name= "scoutPerson")
    @Description("Represents a person known as Scout")
    Person scoutPerson() {
        return new Person("Scout", bmwBike());
    }
}
