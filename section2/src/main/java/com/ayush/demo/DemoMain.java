package com.ayush.demo;

import com.ayush.demo.beans.Vehicle;
import com.ayush.demo.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {
    static void main() {
        var ctx= new AnnotationConfigApplicationContext(ProjectConfig.class);

        // get the bmw car
        var bmwM5= ctx.getBean("bmwM5", Vehicle.class);
        System.out.println(bmwM5);

        // get the ninja bike
        var ninjaZX10= ctx.getBean("ninjaZX10", Vehicle.class);
        System.out.println(ninjaZX10);

        // get the ferrari car
        var ferrariSF9= ctx.getBean("ferrariSF9", Vehicle.class);
        System.out.println(ferrariSF9);

        // get the bmw bike
        var bmwS1000RR= ctx.getBean("bmwS1000RR", Vehicle.class);
        System.out.println(bmwS1000RR);
    }
}
