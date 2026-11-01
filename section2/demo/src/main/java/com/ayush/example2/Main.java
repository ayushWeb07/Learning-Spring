package com.ayush.example2;

import com.ayush.example2.beans.Fighter;
import com.ayush.example2.beans.Vehicle;
import com.ayush.example2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx= new AnnotationConfigApplicationContext(ProjectConfig.class);

        // lambo car
        var lC= ctx.getBean(Vehicle.class);
        lC.setBrand("Lamborghini");
        lC.setModel("Ruvelto");
        lC.setWheels(4);
        System.out.printf("%s | %s | %d%n", lC.getBrand(), lC.getModel(), lC.getWheels());

        // ninja bike
        var nB= ctx.getBean(Vehicle.class);
        nB.setBrand("Kawasaki");
        nB.setModel("ZX10R");
        nB.setWheels(2);
        System.out.printf("%s | %s | %d%n", nB.getBrand(), nB.getModel(), nB.getWheels());

        // islam fighter
        var iF= ctx.getBean(Fighter.class);
        iF.setName("Islam");
        iF.setWins(28);
        iF.setLosses(2);
        System.out.printf("%s | %d | %d%n", iF.getName(), iF.getWins(), iF.getLosses());

        // tyson fighter
        var tF= ctx.getBean(Fighter.class);
        tF.setName("Tyson");
        tF.setWins(50);
        tF.setLosses(7);
        System.out.printf("%s | %d | %d%n", tF.getName(), tF.getWins(), tF.getLosses());

        ctx.close();
    }
}
