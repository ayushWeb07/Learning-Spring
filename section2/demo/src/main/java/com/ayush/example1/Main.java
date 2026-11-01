package com.ayush.example1;

import com.ayush.example1.beans.Fighter;
import com.ayush.example1.beans.Vehicle;
import com.ayush.example1.config.MultiConfig;
import com.ayush.example1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        // 1) example 1
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

        System.out.println();

        // 2) example 2
        var multiCtx= new AnnotationConfigApplicationContext(MultiConfig.class);

        // lambo car
        var lC= multiCtx.getBean("lambo", Vehicle.class);
        System.out.printf("%s | %s | %d%n", lC.getBrand(), lC.getModel(), lC.getWheels());

        // ninja bike
        var nB= multiCtx.getBean("ninja", Vehicle.class);
        System.out.printf("%s | %s | %d%n", nB.getBrand(), nB.getModel(), nB.getWheels());

        // islam fighter
        var iF= multiCtx.getBean("islam", Fighter.class);
        System.out.printf("%s | %d | %d%n", iF.getName(), iF.getWins(), iF.getLosses());

        // tyson fighter
        var tF= multiCtx.getBean("tyson", Fighter.class);
        System.out.printf("%s | %d | %d%n", tF.getName(), tF.getWins(), tF.getLosses());
    }
}