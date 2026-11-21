package com.ayush.demo.config;

import com.ayush.demo.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
public class AnotherProjectConfig {
    @Bean(name= "ferrariSF9")
    @Description("Represents a car vehicle of Ferrari")
    Vehicle ferrariSF9() {
        return new Vehicle(4, "Ferrari SF9");
    }

    @Bean(name= "bmwS1000RR")
    @Description("Represents a bike vehicle of BMW")
    Vehicle bmwS1000RR() {
        return new Vehicle(2, "BMW S1000RR");
    }
}
