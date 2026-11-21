package com.ayush.demo.config;

import com.ayush.demo.beans.Vehicle;
import org.springframework.context.annotation.*;

@Configuration
@Import(AnotherProjectConfig.class)
public class ProjectConfig {
    @Bean(name = "bmwM5")
    @Description("Represents a car vehicle of BMW")
    Vehicle bmwM5() {
        return new Vehicle(4, "BMW M5");
    }

    @Bean(name= "ninjaZX10")
    @Description("Represents a bike vehicle of Ninja")
    Vehicle ninjaZX10() {
        return new Vehicle(2, "Ninja ZX10R");
    }
}
