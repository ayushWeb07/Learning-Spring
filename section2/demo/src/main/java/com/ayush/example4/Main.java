package com.ayush.example4;

import com.ayush.example4.beans.Car;
import com.ayush.example4.beans.Engine;
import com.ayush.example4.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx= new AnnotationConfigApplicationContext(ProjectConfig.class);

        // lambo car
        var c= ctx.getBean(Car.class);
        System.out.println(c);
    }
}
