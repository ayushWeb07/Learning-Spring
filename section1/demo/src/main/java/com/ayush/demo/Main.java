package com.ayush.demo;

import com.ayush.demo.beans.Fighter;
import com.ayush.demo.beans.Vehicle;
import com.ayush.demo.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        var ctx= new AnnotationConfigApplicationContext(ProjectConfig.class);

        // lambo car
        var l= ctx.getBean("lamboCar", Vehicle.class);
        System.out.println(l.getBrand());
        System.out.println(l.getModel());
        System.out.println(l.getWheels());

        System.out.println();

        // bmw
        var b= ctx.getBean("bmwBike", Vehicle.class);
        System.out.println(b.getBrand());
        System.out.println(b.getModel());
        System.out.println(b.getWheels());

        System.out.println();

        // islam
        var i= ctx.getBean("islam", Fighter.class);
        System.out.println(i.getName());
        System.out.println(i.getWins());
        System.out.println(i.getLosses());
    }
}