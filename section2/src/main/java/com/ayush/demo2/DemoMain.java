package com.ayush.demo2;

import com.ayush.demo2.beans.Vehicle;
import com.ayush.demo2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {
    static void main() {
        var ctx= new AnnotationConfigApplicationContext(ProjectConfig.class);

        var v= ctx.getBean(Vehicle.class);
        System.out.println(v);

        v.setName("BMW S1000RR");
        v.setWheels(2);

        System.out.println(v);

        // destroy the context
        ctx.close();
    }
}
