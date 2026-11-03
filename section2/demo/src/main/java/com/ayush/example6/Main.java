package com.ayush.example6;

import com.ayush.example6.beans.Bike;
import com.ayush.example6.beans.Car;
import com.ayush.example6.beans.Engine;
import com.ayush.example6.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx= new AnnotationConfigApplicationContext(ProjectConfig.class);

        if (ctx.containsBean("engine")) {
            var e= ctx.getBean("engine", Engine.class);
            System.out.println(e.getName());
        }

        if (ctx.containsBean("car")) {
            var c= ctx.getBean("car", Car.class);
            System.out.println(c.getName());
            System.out.println(c.getEngine());
        }

        if (ctx.containsBean("bike")) {
            var b= ctx.getBean("bike", Bike.class);
            System.out.println(b.getName());
            System.out.println(b.getEngine());
        }
    }
}
