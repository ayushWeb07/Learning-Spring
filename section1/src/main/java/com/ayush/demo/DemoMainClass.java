package com.ayush.demo;

import com.ayush.demo.config.ProjectConfig;
import com.ayush.demo.entities.Vehicle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMainClass {
    static void main() {
        var ctx= new AnnotationConfigApplicationContext(ProjectConfig.class);
        var vehicle= ctx.getBean(Vehicle.class);
        System.out.println(vehicle);
    }
}
