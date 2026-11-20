package com.ayush.demo.entities;

public class Vehicle {
    private final int wheels;
    private final String brand;
    private final String model;

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public Vehicle(int wheels, String brand, String model) {
        this.wheels = wheels;
        this.brand = brand;
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getWheels() {
        return this.wheels;
    }
}
