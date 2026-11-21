package com.ayush.demo3;

import com.ayush.demo3.beans.Person;
import com.ayush.demo3.beans.Vehicle;
import com.ayush.demo3.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoMain {
    static void main() {
        var ctx= new AnnotationConfigApplicationContext(ProjectConfig.class);

        var v= ctx.getBean(Vehicle.class);
        var p= ctx.getBean(Person.class);

        System.out.println(v);
        System.out.println(p);
    }
}
