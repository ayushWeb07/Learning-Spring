package com.ayush.demo4;

import com.ayush.demo4.beans.Car;
import com.ayush.demo4.beans.Engine;
import com.ayush.demo4.config.ProjectConfig;
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
