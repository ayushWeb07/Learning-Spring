package com.ayush.example5;

import com.ayush.example5.beans.Car;
import com.ayush.example5.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx= new AnnotationConfigApplicationContext(ProjectConfig.class);

        var c= ctx.getBean(Car.class);
        System.out.println(c.getEngine().printInfo());
    }
}
