package com.ayush.demo;

import com.ayush.demo.beans.Vehicle;
import com.ayush.demo.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {
    static void main() {
        var ctx= new AnnotationConfigApplicationContext(ProjectConfig.class);

        // get the car
        var c= ctx.getBean("bmwM5", Vehicle.class);
        System.out.println(c);

        // get the bike
        var b= ctx.getBean("ninjaZX10", Vehicle.class);
        System.out.println(b);
    }
}
