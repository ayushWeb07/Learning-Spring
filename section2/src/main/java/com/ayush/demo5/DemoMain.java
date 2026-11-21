package com.ayush.demo5;

import com.ayush.demo5.beans.Car;
import com.ayush.demo5.beans.Engine;
import com.ayush.demo5.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {
    static void main() {
        var ctx= new AnnotationConfigApplicationContext(ProjectConfig.class);
        var engine= ctx.getBean(Engine.class);
        var car= ctx.getBean(Car.class);

        System.out.println(engine);
        System.out.println(car);
    }
}
