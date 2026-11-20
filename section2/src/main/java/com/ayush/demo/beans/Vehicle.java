package com.ayush.demo.beans;

public class Vehicle {
    private final int wheels;
    private final String name;

    public Vehicle(int wheels, String name) {
        this.wheels = wheels;
        this.name = name;
    }

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
