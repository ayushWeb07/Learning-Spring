package com.ayush.demo3.beans;

public class Vehicle {
    private final String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    }
}
