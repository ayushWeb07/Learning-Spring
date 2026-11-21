package com.ayush.demo2.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private int wheels;
    private String name;

    public Vehicle() {
        this.wheels= 0;
        this.name= "";
    }

    @PostConstruct
    public void initialize() {
        this.wheels= 4;
        this.name= "Ferrari SF9";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying the vehicle bean....");
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", name='" + name + '\'' +
                '}';
    }
}
