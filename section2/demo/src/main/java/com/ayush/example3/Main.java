package com.ayush.example3;

import com.ayush.example3.beans.Person;
import com.ayush.example3.beans.Vehicle;
import com.ayush.example3.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx= new AnnotationConfigApplicationContext(ProjectConfig.class);

        // lambo car
        var l= ctx.getBean("lamboCar", Vehicle.class);
        System.out.printf("%s | %s | %d%n", l.getBrand(), l.getModel(), l.getWheels());

        // bmw bike
        var b= ctx.getBean("bmwBike", Vehicle.class);
        System.out.printf("%s | %s | %d%n", b.getBrand(), b.getModel(), b.getWheels());
        System.out.println();

        // iman person
        var i= ctx.getBean("imanPerson", Person.class);
        System.out.println(i.getName());
        System.out.println(i.getVehicle());
        System.out.println();

        // scout person
        var s= ctx.getBean("scoutPerson", Person.class);
        System.out.println(s.getName());
        System.out.println(s.getVehicle());
    }
}
