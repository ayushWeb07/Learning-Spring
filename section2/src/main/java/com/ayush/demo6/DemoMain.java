package com.ayush.demo6;

import com.ayush.demo6.beans.Car;
import com.ayush.demo6.beans.Coffee;
import com.ayush.demo6.beans.Engine;
import com.ayush.demo6.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {
    static void main() {
        var ctx= new AnnotationConfigApplicationContext(ProjectConfig.class);

        if (ctx.containsBean("engine")) {
            var engine= ctx.getBean("engine", Engine.class);
            System.out.println(engine);
        }

        if (ctx.containsBean("car")) {
            var car= ctx.getBean("car", Car.class);
            System.out.println(car);
        }

        if (ctx.containsBean("coffee")) {
            var coffee= ctx.getBean("coffee", Coffee.class);
            System.out.println(coffee);
        }
    }
}
