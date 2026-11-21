package com.ayush.demo2.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private int wheels;

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", name='" + name + '\'' +
                '}';
    }
}
